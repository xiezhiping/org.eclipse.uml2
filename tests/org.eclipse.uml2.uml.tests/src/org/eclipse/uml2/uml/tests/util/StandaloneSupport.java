/*
 * Copyright (c) 2013, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 414572, 401682, 420338, 437977
 *
 */
package org.eclipse.uml2.uml.tests.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

/**
 * Utility for configuring the test environment for stand-alone execution.
 */
public class StandaloneSupport {

	private static final String UML_PLUGIN_ID = "org.eclipse.uml2.uml"; //$NON-NLS-1$

	/**
	 * Not instantiable by clients.
	 */
	private StandaloneSupport() {
		super();
	}

	public static boolean isStandalone() {
		return !EcorePlugin.IS_ECLIPSE_RUNNING;
	}

	public static void initGlobals() {
		if (!isStandalone()) {
			throw new IllegalStateException("not running stand-alone"); //$NON-NLS-1$
		}

		UMLResourcesUtil.initGlobalRegistries();
	}

	public static ResourceSet init(ResourceSet rset) {
		if (!isStandalone()) {
			throw new IllegalStateException("not running stand-alone"); //$NON-NLS-1$
		}

		UMLResourcesUtil.initLocalRegistries(rset);

		if (rset != null) {
			rset.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl()); //$NON-NLS-1$
		}

		// Create URI mappings for resources in the UML plug-in (not UML
		// Resources), such as the Ecore2XML mappings required for
		// certain legacy model test cases. NOTE that these must be
		// registered globally because the resource factories that use these
		// mappings do not have an a priori resource set context in which to
		// load the mapping models that they use, so they rely on the global
		// URI map
		URI prefix = getBaseUMLMappingsResourceURI();
		mapUMLMappingResourceURIs(
			URIConverter.URI_MAP,
			URI.createPlatformPluginURI(
				String.format("%s/model", UML_PLUGIN_ID), true), //$NON-NLS-1$
			prefix);

		return rset;
	}

	/**
	 * Create a test suite that is applicable only if the Eclipse environment is
	 * available.
	 * 
	 * @param name
	 *            the name of the test suite
	 * @param testClass
	 *            the test classes to incorporate into the suite
	 * 
	 * @return a test suite if Eclipse is running, otherwise just a placeholder
	 *         for the skipped tests
	 * 
	 * @since 5.0
	 */
	public static Test eclipseTestSuite(String name, Class<?>... testClass) {
		Test result;

		try {
			if (!isStandalone()) {
				result = suite(name, testClass);
			} else {
				result = new TestSuite(String.format(
					"<%s skipped because Eclipse is not running>", name)); //$NON-NLS-1$
			}
		} catch (LinkageError e) {
			// no (or incomplete) Eclipse environment on the classpath
			result = new TestSuite(String.format(
				"<%s skipped because Eclipse is not running>", name)); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * Create a test suite that is applicable only in stand-alone execution
	 * (when Eclipse is <em>not</em> running.
	 * 
	 * @param name
	 *            the name of the test suite
	 * @param testClass
	 *            the test classes to incorporate into the suite
	 * 
	 * @return a test suite in stand-alone mode, otherwise just a placeholder
	 *         for the skipped tests
	 * 
	 * @since 5.0
	 */
	public static Test standaloneTestSuite(String name, Class<?>... testClass) {
		Test result;

		if (isStandalone()) {
			result = suite(name, testClass);
		} else {
			result = new TestSuite(String.format(
				"<%s skipped because Eclipse is running>", name)); //$NON-NLS-1$
		}

		return result;
	}

	private static Test suite(String name, Class<?>... testClass) {
		Test result;

		if (testClass.length == 1) {
			// just one test class? It's the suite
			result = suite(testClass[0]);
		} else {
			TestSuite suite = new TestSuite(name);

			for (Class<?> next : testClass) {
				suite.addTest(suite(next));
			}

			result = suite;
		}

		return result;
	}

	private static Test suite(Class<?> testClass) {
		Test result;

		try {
			try {
				Method method = testClass.getDeclaredMethod("suite");
				if (!Modifier.isStatic(method.getModifiers())) {
					throw new NoSuchMethodException("no static suite method"); //$NON-NLS-1$
				}
				result = (Test) method.invoke(null);
			} catch (NoSuchMethodException e) {
				result = new TestSuite(testClass);
			}
		} catch (Exception e) {
			result = new TestSuite(String.format(
				"<Failed to instantiate test %s>", testClass)); //$NON-NLS-1$
		}

		return result;
	}

	private static URI getBaseUMLMappingsResourceURI() {
		URL resultURL = UMLPlugin.class.getClassLoader().getResource(
			"model/UML2_2_UML.ecore2xml"); //$NON-NLS-1$

		URI result;

		if (resultURL != null) {
			// remove the UML2_2_UML.ecore2xml segment of the resource we found
			result = URI.createURI(resultURL.toExternalForm(), true)
				.trimSegments(1);
		} else {
			// probably, we're not running with JARs, so assume the source
			// project folder layout
			resultURL = UMLPlugin.class.getResource("UMLPlugin.class"); //$NON-NLS-1$

			String baseURL = resultURL.toExternalForm();
			baseURL = baseURL.substring(0, baseURL.lastIndexOf("/bin/")); //$NON-NLS-1$
			result = URI.createURI(baseURL, true).appendSegment("model"); //$NON-NLS-1$
		}

		return result;
	}

	private static void mapUMLMappingResourceURIs(Map<URI, URI> uriMap,
			URI prefix, URI location) {

		// ensure trailing separator (make it a "URI prefix")
		if (!prefix.hasTrailingPathSeparator()) {
			prefix = prefix.appendSegment(""); //$NON-NLS-1$
		}

		// same with the location
		if (!location.hasTrailingPathSeparator()) {
			location = location.appendSegment(""); //$NON-NLS-1$
		}

		uriMap.put(prefix, location);
	}
}