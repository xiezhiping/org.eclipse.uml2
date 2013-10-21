/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 414572, 401682
 *
 */
package org.eclipse.uml2.uml.tests.util;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

/**
 * Utility for configuring the test environment for stand-alone execution.
 */
public class StandaloneSupport {

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
		assertTrue("Not running stand-alone.", isStandalone()); //$NON-NLS-1$
		UMLResourcesUtil.initGlobalRegistries();
	}

	public static ResourceSet init(ResourceSet rset) {
		assertTrue("Not running stand-alone.", isStandalone()); //$NON-NLS-1$
		UMLResourcesUtil.initLocalRegistries(rset);
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
	 * @since 4.2
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
	 * @since 4.2
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
}