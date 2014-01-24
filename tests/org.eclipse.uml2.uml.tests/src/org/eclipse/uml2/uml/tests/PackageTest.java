/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestedPackages() <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestingPackage() <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedStereotypes() <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedTypes() <em>Owned Type</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PackageableElement#validateNamespaceNeedsVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Namespace Needs Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile) <em>Apply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedStereotype(java.lang.String, boolean) <em>Create Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllAppliedProfiles() <em>Get All Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllProfileApplications() <em>Get All Profile Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfiles() <em>Get Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isModelLibrary() <em>Is Model Library</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile) <em>Is Profile Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile) <em>Unapply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#allApplicableStereotypes() <em>All Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#containingProfile() <em>Containing Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PackageTest
		extends NamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageTest.class);
	}

	/**
	 * Constructs a new Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.uml2.uml.Package getFixture() {
		return (org.eclipse.uml2.uml.Package) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getOwnedTypes() <em>Owned Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getOwnedTypes()
	 * @generated
	 */
	public void testGetOwnedTypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getNestedPackages() <em>Nested Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getNestedPackages()
	 * @generated
	 */
	public void testGetNestedPackages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getNestingPackage() <em>Nesting Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getNestingPackage()
	 * @generated
	 */
	public void testGetNestingPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#setNestingPackage(org.eclipse.uml2.uml.Package) <em>Nesting Package</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#setNestingPackage(org.eclipse.uml2.uml.Package)
	 * @generated
	 */
	public void testSetNestingPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getOwnedStereotypes() <em>Owned Stereotype</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getOwnedStereotypes()
	 * @generated
	 */
	public void testGetOwnedStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement)
	 * @generated
	 */
	public void testIsCompatibleWith__ParameterableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter()
	 * @generated
	 */
	public void testIsTemplateParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.PackageableElement#validateNamespaceNeedsVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Namespace Needs Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.PackageableElement#validateNamespaceNeedsVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNamespaceNeedsVisibility__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public void testParameterableElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.TemplateableElement#isTemplate() <em>Is Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated NOT
	 */
	public void testIsTemplate() {
		assertFalse(getFixture().isTemplate());

		getFixture().createOwnedTemplateSignature();

		assertTrue(getFixture().isTemplate());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateElementsPublicOrPrivate__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean)
	 * @generated
	 */
	public void testCreateOwnedClass__String_boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String)
	 * @generated
	 */
	public void testCreateOwnedEnumeration__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String)
	 * @generated
	 */
	public void testCreateOwnedPrimitiveType__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#createOwnedStereotype(java.lang.String, boolean) <em>Create Owned Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#createOwnedStereotype(java.lang.String, boolean)
	 * @generated
	 */
	public void testCreateOwnedStereotype__String_boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile) <em>Is Profile Applied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile)
	 * @generated
	 */
	public void testIsProfileApplied__Profile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile) <em>Apply Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile)
	 * @generated
	 */
	public void testApplyProfile__Profile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile) <em>Unapply Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile)
	 * @generated
	 */
	public void testUnapplyProfile__Profile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#allApplicableStereotypes() <em>All Applicable Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#allApplicableStereotypes()
	 * @generated
	 */
	public void testAllApplicableStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#containingProfile() <em>Containing Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#containingProfile()
	 * @generated
	 */
	public void testContainingProfile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getAppliedProfiles() <em>Get Applied Profiles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfiles()
	 * @generated
	 */
	public void testGetAppliedProfiles() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String) <em>Get Applied Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String)
	 * @generated
	 */
	public void testGetAppliedProfile__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean) <em>Get Applied Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean)
	 * @generated
	 */
	public void testGetAppliedProfile__String_boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getAllProfileApplications() <em>Get All Profile Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getAllProfileApplications()
	 * @generated
	 */
	public void testGetAllProfileApplications() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile) <em>Get Profile Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile)
	 * @generated
	 */
	public void testGetProfileApplication__Profile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean) <em>Get Profile Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean)
	 * @generated
	 */
	public void testGetProfileApplication__Profile_boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String)
	 * @generated
	 */
	public void testCreateOwnedInterface__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#isModelLibrary() <em>Is Model Library</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#isModelLibrary()
	 * @generated
	 */
	public void testIsModelLibrary() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#getAllAppliedProfiles() <em>Get All Applied Profiles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#getAllAppliedProfiles()
	 * @generated
	 */
	public void testGetAllAppliedProfiles() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#visibleMembers()
	 * @generated
	 */
	public void testVisibleMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	public void testMakesVisible__NamedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package#mustBeOwned()
	 * @generated NOT
	 */
	@Override
	public void testMustBeOwned() {
		assertFalse(getFixture().mustBeOwned());
	}

} //PackageTest
