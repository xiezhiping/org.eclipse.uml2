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

import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Tests the support for non-API constraints in classifiers that convert to
 * Ecore EClasses.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=405065
 */
public class Bug405065Test
		extends TestCase {

	private static final String ECORE_ANNOTATION_URI = "http://www.eclipse.org/emf/2002/Ecore";

	private static final String OCL_ANNOTATION_URI = ECORE_ANNOTATION_URI
		+ "/OCL";

	private ResourceSet rset;

	private Package fixture;

	public Bug405065Test() {
		super();
	}

	public Bug405065Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug405065Test.class, "Bug 405065 tests"); //$NON-NLS-1$
	}

	public void testControl() {
		// a control test for features that should not be annotated
		EPackage ePackage = convert();

		EAttribute cost = getEAttribute(getEClass(ePackage, "Thing"), "cost");
		assertNoOCLAnnotation(cost);
		assertFalse(cost.isDerived());
		assertTrue(cost.isChangeable());
	}

	public void testDerivedFeature() {
		EPackage ePackage = convert();

		EAttribute price = getEAttribute(getEClass(ePackage, "Thing"), "price");
		assertOCLAnnotation(price, "derivation",
			"(self.cost - self.discount) * (1.0 + self.tax)");
		assertTrue(price.isDerived());
		assertFalse(price.isChangeable());
	}

	public void testInitialValueFeature() {
		EPackage ePackage = convert();

		EAttribute discount = getEAttribute(getEClass(ePackage, "Thing"),
			"discount");
		assertOCLAnnotation(discount, "initial", "self.cost / 10.0");
		assertFalse(discount.isDerived());
		assertTrue(discount.isChangeable());
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

		fixture = getTestModel();
	}

	@Override
	protected void tearDown()
			throws Exception {

		fixture = null;

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug405065.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	EPackage convert() {
		return convert(fixture);
	}

	EPackage convert(Package package_) {
		Map<String, String> options = new HashMap<String, String>();
		options.put(
			UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
			UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES,
			UMLUtil.OPTION__PROCESS);

		Collection<EPackage> ecores = UMLUtil.convertToEcore(package_, options);

		assertNotNull(ecores);
		assertTrue(ecores.size() > 0);

		EPackage result = ecores.iterator().next();
		assertEquals("initials", result.getName());

		assertEcoreAnnotation(result, "settingDelegates", OCL_ANNOTATION_URI);

		return result;
	}

	EClass getEClass(EPackage ePackage, String name) {
		return getEClassifier(ePackage, name, EClass.class);
	}

	EDataType getEDataType(EPackage ePackage, String name) {
		return getEClassifier(ePackage, name, EDataType.class);
	}

	<T extends EClassifier> T getEClassifier(EPackage ePackage, String name,
			Class<T> metaclass) {
		EClassifier result = ePackage.getEClassifier(name);
		assertTrue(metaclass.isInstance(result));
		return metaclass.cast(result);
	}

	EAttribute getEAttribute(EClass eClass, String name) {
		EStructuralFeature result = eClass.getEStructuralFeature(name);

		assertTrue("EAttribute not found: " + name,
			result instanceof EAttribute);
		return (EAttribute) result;
	}

	void assertEcoreAnnotation(EModelElement element, String key, String value) {
		assertAnnotation(element, ECORE_ANNOTATION_URI, key, value);
	}

	void assertOCLAnnotation(EModelElement element, String key, String value) {
		assertAnnotation(element, OCL_ANNOTATION_URI, key, value);
	}

	void assertAnnotation(EModelElement element, String source, String key,
			String value) {
		String annotation = EcoreUtil.getAnnotation(element, source, key);
		assertNotNull("Annotation key not found", annotation);
		assertTrue(Pattern
			.compile(
				String.format("(?:^|\\s)%s(?:$|\\s)", Pattern.quote(value)))
			.matcher(annotation).find());
	}

	void assertNoOCLAnnotation(EModelElement element) {
		assertNoAnnotation(element, OCL_ANNOTATION_URI);
	}

	void assertNoAnnotation(EModelElement element, String source) {
		EAnnotation annotation = element.getEAnnotation(source);
		assertNull("Found annotation", annotation);
	}

}
