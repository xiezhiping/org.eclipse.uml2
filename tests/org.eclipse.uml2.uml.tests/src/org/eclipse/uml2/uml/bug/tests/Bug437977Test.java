/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Tests the handling of <tt>xsi:nil</tt> elements within annotations in models
 * conforming to the legacy UML schemata.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=437977
 */
public class Bug437977Test
		extends TestCase {

	private ResourceSet rset;

	private Resource fixtureResource;

	public Bug437977Test() {
		super();
	}

	public Bug437977Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug437977Test.class, "Bug 437977 tests"); //$NON-NLS-1$
	}

	@UMLVersion("uml_2_0")
	public void testUML_2_0() {
		doTest();
	}

	@UMLVersion("uml_2_1")
	public void testUML_2_1() {
		doTest();
	}

	@UMLVersion("uml_3_0")
	public void testUML_3_0() {
		doTest();
	}

	@UMLVersion("uml_4_0")
	public void testUML_4_0() {
		doTest();
	}

	@UMLVersion("uml_5_0")
	public void testUML_5_0() {
		doTest();
	}

	@UMLVersion("cmof_2_0")
	public void testCMOF_2_0() {
		doTest();
	}

	@UMLVersion("cmof_2_4")
	public void testCMOF_2_4() {
		doTest();
	}

	@UMLVersion("cmof_2_5")
	public void testCMOF_2_5() {
		doTest();
	}

	@UMLVersion("xmi_2_1")
	public void testXMI_2_1() {
		doTest();
	}

	@UMLVersion("xmi_2_2")
	public void testXMI_2_2() {
		doTest();
	}

	@UMLVersion("xmi_2_4")
	public void testXMI_2_4() {
		doTest();
	}

	@UMLVersion("xmi_2_5")
	public void testXMI_2_5() {
		doTest();
	}

	//
	// Test framework
	//

	@Override
	protected void setUp() {

		rset = new ResourceSetImpl();
		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}

		try {
			Map<String, Object> factoryMap = rset.getResourceFactoryRegistry()
				.getContentTypeToFactoryMap();
			for (Map.Entry<String, Class<? extends Resource.Factory>> next : getCompatibilityResourceFactoryClasses()
				.entrySet()) {
				factoryMap.put(next.getKey(), next.getValue().newInstance());
			}
		} catch (Exception e) {
			fail("Could not register compatibility resource factories: " //$NON-NLS-1$
				+ e.getLocalizedMessage());
		}

		fixtureResource = loadTestResource();
	}

	@SuppressWarnings("restriction")
	Map<String, Class<? extends Resource.Factory>> getCompatibilityResourceFactoryClasses() {
		Map<String, Class<? extends Resource.Factory>> result = new HashMap<String, Class<? extends Resource.Factory>>();

		// Eclipse UML2 UML Resources
		result
			.put(
				UMLResource.UML_2_0_0_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.UML22UMLResourceFactoryImpl.class);
		result
			.put(
				UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.UML212UMLResourceFactoryImpl.class);
		result
			.put(
				UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.UML302UMLResourceFactoryImpl.class);
		result
			.put(
				UMLResource.UML_4_0_0_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.UML402UMLResourceFactoryImpl.class);
		result
			.put(
				UMLResource.UML_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl.class);

		// OMG XMI UML Resources
		result
			.put(
				XMI2UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.XMI212UMLResourceFactoryImpl.class);
		result
			.put(
				XMI2UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.XMI222UMLResourceFactoryImpl.class);
		result
			.put(
				XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.XMI242UMLResourceFactoryImpl.class);
		result
			.put(
				XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.XMI2UMLResourceFactoryImpl.class);

		// CMOF Resources
		result
			.put(
				CMOF2UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.CMOF202UMLResourceFactoryImpl.class);
		result
			.put(
				CMOF2UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.CMOF242UMLResourceFactoryImpl.class);
		result
			.put(
				CMOF2UMLResource.CMOF_CONTENT_TYPE_IDENTIFIER,
				org.eclipse.uml2.uml.internal.resource.CMOF2UMLResourceFactoryImpl.class);

		return result;
	}

	@Override
	protected void tearDown()
			throws Exception {

		fixtureResource = null;

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	void doTest() {
		assertTrue(fixtureResource.getErrors().isEmpty());

		assertTrue(fixtureResource.isLoaded());

		// Verify model contents
		Package rootPackage = (Package) EcoreUtil.getObjectByType(
			fixtureResource.getContents(), UMLPackage.Literals.PACKAGE);
		assertNotNull(rootPackage);
		Package nested = rootPackage.getNestedPackage("nested");
		assertNotNull(nested);
		Type foo = nested.getOwnedType("Foo");
		assertNotNull(foo);
		assertSame(foo.eClass(), UMLPackage.Literals.CLASS);
	}

	Resource loadTestResource() {

		String resourceName = "Bug437977." + getUMLVersionSuffix(); //$NON-NLS-1$
		URL url = getClass().getResource(resourceName);
		Resource result = rset.createResource(
			URI.createURI(url.toExternalForm()), getUMLVersionContentType());

		try {
			result.load(null);
		} catch (Exception e) {
			// We expect this in the cases when the test fails
		}

		return result;
	}

	String getUMLVersionSuffix() {
		String result = getUMLVersionAnnotation();

		result = result.replaceAll("[^a-z0-9]+", ""); //$NON-NLS-1$ //$NON-NLS-2$

		return result;
	}

	String getUMLVersionContentType() {
		String result = null;

		String version = getUMLVersionAnnotation().toUpperCase();
		if (version.startsWith("UML")) { //$NON-NLS-1$
			if (!version.equals("UML")) {
				// append the other 0 segment
				version = version + "_0"; //$NON-NLS-1$
			}

			try {
				Field contentTypeIdentifier = UMLResource.class
					.getDeclaredField(version + "_CONTENT_TYPE_IDENTIFIER"); //$NON-NLS-1$
				result = (String) contentTypeIdentifier.get(null);
			} catch (Exception e) {
				fail("Could not get content type identifier: " //$NON-NLS-1$
					+ e.getLocalizedMessage());
			}
		} else if (version.startsWith("CMOF")) { //$NON-NLS-1$
			try {
				Field contentTypeIdentifier = CMOF2UMLResource.class
					.getDeclaredField(version + "_CONTENT_TYPE_IDENTIFIER"); //$NON-NLS-1$
				result = (String) contentTypeIdentifier.get(null);
			} catch (Exception e) {
				fail("Could not get content type identifier: " //$NON-NLS-1$
					+ e.getLocalizedMessage());
			}
		} else if (version.startsWith("XMI")) { //$NON-NLS-1$
			try {
				Field contentTypeIdentifier = XMI2UMLResource.class
					.getDeclaredField(version.replace("XMI", "UML") + "_CONTENT_TYPE_IDENTIFIER"); //$NON-NLS-1$
				result = (String) contentTypeIdentifier.get(null);
			} catch (Exception e) {
				fail("Could not get content type identifier: " //$NON-NLS-1$
					+ e.getLocalizedMessage());
			}
		}

		return result;
	}

	private String getUMLVersionAnnotation() {
		String result;

		try {
			Method testMethod = getClass().getDeclaredMethod(getName());
			if (testMethod.isAnnotationPresent(UMLVersion.class)) {
				result = testMethod.getAnnotation(UMLVersion.class).value();
			} else {
				result = "uml";
			}
		} catch (Exception e) {
			fail("Could not get test method: " + e.getLocalizedMessage()); //$NON-NLS-1$
			result = null; // Unreachable
		}

		return result;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface UMLVersion {

		String value();
	}
}
