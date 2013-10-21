/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;
import java.util.Collection;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.Ecore2UMLConverter;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

/**
 * Test suite for the changes introduced for Bug 405061.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=405061
 */
public class Bug405061Test
		extends TestCase {

	private ResourceSet rset;

	private Package model;

	private EPackage converted;

	private EClass myClassConverted;

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug405061Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug405061Test.class, "Bug 405061 tests"); //$NON-NLS-1$
	}

	public void testInitialCapName() {
		assertOriginalName("Name",
			myClassConverted.getEStructuralFeature("name"));
	}

	public void testWhitespaceName() {
		assertOriginalName("My Class", myClassConverted);
		assertOriginalName("last name",
			myClassConverted.getEStructuralFeature("lastName"));
	}

	public void testUnderscoreName() {
		assertOriginalName("social_security_no",
			myClassConverted.getEStructuralFeature("socialSecurityNo"));
	}

	public void testInvalidCharName() {
		assertOriginalName("not.java$safe",
			myClassConverted.getEStructuralFeature("notjava$safe"));
	}

	public void testUnmodifiedName() {
		EStructuralFeature property = myClassConverted
			.getEStructuralFeature("noProblemHere");
		assertOriginalName("noProblemHere", property);
		assertNull("Original name should not have been recorded.",
			EcoreUtil.getAnnotation(property,
				UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI,
				PrivateUML2EcoreConverter.ANNOTATION_DETAIL__ORIGINAL_NAME));
	}

	public void testValidateButNoCamelCaseOption() {
		Map<String, String> options = new java.util.HashMap<String, String>();
		options.put(UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES,
			UMLUtil.OPTION__IGNORE);
		EPackage alternative = UMLUtil.convertToEcore(model, options)
			.iterator().next();

		EClass eClass = (EClass) alternative.getEClassifier("MyClass");
		assertOriginalName("My Class", eClass);
		assertOriginalName("Name", eClass.getEStructuralFeature("Name"));
		assertOriginalName("last name",
			eClass.getEStructuralFeature("lastname"));
		assertOriginalName("social_security_no",
			eClass.getEStructuralFeature("social_security_no"));
		assertOriginalName("not.java$safe",
			eClass.getEStructuralFeature("notjava$safe"));
	}

	public void testOriginalNameAnnotationNotReversedToUML() {
		Map<String, String> options = new java.util.HashMap<String, String>();
		options.put(Ecore2UMLConverter.OPTION__ANNOTATION_DETAILS,
			UMLUtil.OPTION__PROCESS);
		options.put(Ecore2UMLConverter.OPTION__ECORE_TAGGED_VALUES,
			UMLUtil.OPTION__PROCESS);
		Package alternative = UMLUtil.convertFromEcore(converted, options)
			.iterator().next();
		Class umlClass = (Class) alternative.getOwnedType("MyClass");
		assertNotAnnotated(umlClass);
		for (Property next : umlClass.getOwnedAttributes()) {
			assertNotAnnotated(next);
		}
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {

		rset = new ResourceSetImpl();

		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}

		model = getTestModel();

		Map<String, String> options = new java.util.HashMap<String, String>();
		options.put(UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES,
			UMLUtil.OPTION__PROCESS);
		converted = UMLUtil.convertToEcore(model, options).iterator().next();
		myClassConverted = (EClass) converted.getEClassifier("MyClass");
		assertNotNull(myClassConverted);
	}

	@Override
	protected void tearDown()
			throws Exception {

		model = null;

		for (Resource next : rset.getResources()) {
			next.unload();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
		rset = null;
	}

	void assertOriginalName(String expectedName, ENamedElement element) {
		assertEquals(expectedName,
			UMLUtil.UML2EcoreConverter.getOriginalName(element));
	}

	void assertNotAnnotated(Element umlElement) {
		for (Stereotype next : umlElement.getAppliedStereotypes()) {
			if (UMLUtil.PROFILE__ECORE.equals(next.getProfile().getName())) {
				assertTrue("element has annotations",
					((Collection<?>) umlElement.getValue(next,
						UMLUtil.TAG_DEFINITION__ANNOTATIONS)).isEmpty());
			}
		}

		assertTrue("element has annotations", umlElement.getEAnnotations()
			.isEmpty());
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug405061.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	protected static class PrivateUML2EcoreConverter
			extends UMLUtil.UML2EcoreConverter {

		static final String ANNOTATION_DETAIL__ORIGINAL_NAME = UMLUtil.UML2EcoreConverter.ANNOTATION_DETAIL__ORIGINAL_NAME;
	}
}
