/*
 * Copyright (c) 2013, 2014 CEA and others.
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
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Tests the support for UML-to-Ecore and Ecore-to-UML transformation of
 * non-navigable association ends for OCL support.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=420338
 */
public class Bug420338Test
		extends TestCase {

	private ResourceSet rset;

	private Package fixture;

	private EPackage eFixture;

	public Bug420338Test() {
		super();
	}

	public Bug420338Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug420338Test.class, "Bug 420338 tests"); //$NON-NLS-1$
	}

	public void testExplicitRoleName_nonNavigable() {
		convertToEcore();

		EReference b = getEReference(getEClass("A"), "b");
		assertOppositeRoleName(b, "theA");

		convertToUML();

		Property b_ = getClass("A").getOwnedAttribute("b", null);
		assertOppositeRoleName(b_, "theA");
	}

	public void testImplicitRoleName_nonNavigable() {
		convertToEcore();

		EReference n = getEReference(getEClass("M"), "n");
		assertNoOppositeRoleName(n);

		convertToUML();

		Property n_ = getClass("M").getOwnedAttribute("n", null);
		assertNoOppositeRoleName(n_);
	}

	public void testExplicitRoleName_navigable() {
		convertToEcore();

		EReference t = getEReference(getEClass("S"), "t");
		assertNoOppositeRoleName(t);

		convertToUML();

		Property t_ = getClass("S").getOwnedAttribute("t", null);
		assertOppositeRoleName(t_, "s");
	}

	public void testImplicitRoleName_noAssociation() {
		convertToEcore();

		EReference y = getEReference(getEClass("X"), "y");
		assertNoOppositeRoleName(y);

		convertToUML();

		Property y_ = getClass("X").getOwnedAttribute("y", null);
		assertNoOppositeRoleName(y_);
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
		eFixture = null;

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug420338.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	void convertToEcore() {
		eFixture = convert(fixture);
	}

	EPackage convert(Package package_) {
		Map<String, String> options = new HashMap<String, String>();
		options.put(UMLUtil.UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES,
			UMLUtil.OPTION__PROCESS);

		Collection<EPackage> ecores = UMLUtil.convertToEcore(package_, options);

		assertNotNull(ecores);
		assertTrue(ecores.size() > 0);

		// we need to be able to clean these up, later
		for (EPackage next : ecores) {
			if (next.eResource() == null) {
				Resource res = rset.createResource(URI.createURI(String.format(
					"http:///%s.ecore", System.identityHashCode(next))));
				res.getContents().add(next);
			}
		}

		EPackage result = ecores.iterator().next();
		assertEquals("bug420338", result.getName());

		return result;
	}

	void convertToUML() {
		fixture = convert(eFixture);
	}

	Package convert(EPackage ePackage) {
		Map<String, String> options = new HashMap<String, String>();
		options.put(UMLUtil.Ecore2UMLConverter.OPTION__OPPOSITE_ROLE_NAMES,
			UMLUtil.OPTION__PROCESS);

		Collection<Package> umls = UMLUtil.convertFromEcore(ePackage, options);

		assertNotNull(umls);
		assertTrue(umls.size() > 0);

		// we need to be able to clean these up, later
		for (Package next : umls) {
			if (next.eResource() == null) {
				Resource res = rset.createResource(URI.createURI(String.format(
					"http:///%s.uml", System.identityHashCode(next))));
				res.getContents().add(next);
			}
		}

		Package result = umls.iterator().next();
		assertEquals("bug420338", result.getName());

		return result;
	}

	EClass getEClass(String name) {
		return getEClass(eFixture, name);
	}

	EClass getEClass(EPackage ePackage, String name) {
		return getEClassifier(ePackage, name, EClass.class);
	}

	<T extends EClassifier> T getEClassifier(EPackage ePackage, String name,
			Class<T> metaclass) {
		EClassifier result = ePackage.getEClassifier(name);
		assertTrue(metaclass.isInstance(result));
		return metaclass.cast(result);
	}

	EReference getEReference(EClass eClass, String name) {
		return getEStructuralFeature(eClass, name, EReference.class);
	}

	<T extends EStructuralFeature> T getEStructuralFeature(EClass eClass,
			String name, Class<T> metaclass) {

		EStructuralFeature result = eClass.getEStructuralFeature(name);
		assertTrue(metaclass.isInstance(result));
		return metaclass.cast(result);
	}

	org.eclipse.uml2.uml.Class getClass(String name) {
		return getClass(fixture, name);
	}

	org.eclipse.uml2.uml.Class getClass(Package package_, String name) {
		return getType(package_, name, org.eclipse.uml2.uml.Class.class);
	}

	<T extends Type> T getType(Package package_, String name, Class<T> metaclass) {
		Type result = package_.getOwnedType(name);
		assertTrue(metaclass.isInstance(result));
		return metaclass.cast(result);
	}

	void assertOppositeRoleName(EReference reference, String roleName) {
		String actual = EcoreUtil
			.getAnnotation(
				reference,
				EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE,
				EMOFExtendedMetaData.EMOF_COMMENT_BODY);
		assertEquals(roleName, actual);
	}

	void assertNoOppositeRoleName(EReference reference) {
		String actual = EcoreUtil
			.getAnnotation(
				reference,
				EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE,
				EMOFExtendedMetaData.EMOF_COMMENT_BODY);
		assertNull(actual);
	}

	void assertOppositeRoleName(Property property, String roleName) {
		assertNotNull(property);
		Property opposite = property.getOtherEnd();
		assertNotNull(opposite);
		assertEquals(roleName, opposite.getName());
	}

	void assertNoOppositeRoleName(Property property) {
		assertNotNull(property);
		Property opposite = property.getOtherEnd();
		assertNotNull(opposite); // Ecore-to-UML always creates an association
		assertNull(opposite.getName());
	}

}
