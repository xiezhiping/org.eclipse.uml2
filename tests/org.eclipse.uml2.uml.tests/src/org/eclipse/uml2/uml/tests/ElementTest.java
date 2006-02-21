/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementTest.java,v 1.1 2006/02/21 16:32:25 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.framework.TestCase;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ElementTest
		extends TestCase {

	/**
	 * The fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element fixture = null;

	/**
	 * Constructs a new Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Element fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Element getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EModelElement#getEAnnotation(java.lang.String)
	 * @generated
	 */
	public void testGetEAnnotation__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNotOwnSelf__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateHasOwner__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#destroy()
	 * @generated
	 */
	public void testDestroy() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String)
	 * @generated
	 */
	public void testHasKeyword__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getKeywords()
	 * @generated
	 */
	public void testGetKeywords() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#addKeyword(java.lang.String)
	 * @generated
	 */
	public void testAddKeyword__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String)
	 * @generated
	 */
	public void testRemoveKeyword__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getNearestPackage()
	 * @generated
	 */
	public void testGetNearestPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getModel()
	 * @generated
	 */
	public void testGetModel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeApplicable__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeRequired__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeApplied__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testApplyStereotype__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testUnapplyStereotype__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotypes()
	 * @generated
	 */
	public void testGetApplicableStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetApplicableStereotype__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplications()
	 * @generated
	 */
	public void testGetStereotypeApplications() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testGetStereotypeApplication__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotypes()
	 * @generated
	 */
	public void testGetRequiredStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetRequiredStereotype__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotypes()
	 * @generated
	 */
	public void testGetAppliedStereotypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetAppliedStereotype__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype)
	 * @generated
	 */
	public void testGetAppliedSubstereotypes__Stereotype() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testGetAppliedSubstereotype__Stereotype_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testHasValue__Stereotype_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testGetValue__Stereotype_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object)
	 * @generated
	 */
	public void testSetValue__Stereotype_String_Object() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String)
	 * @generated
	 */
	public void testCreateEAnnotation__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#allOwnedElements()
	 * @generated
	 */
	public void testAllOwnedElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#mustBeOwned()
	 * @generated
	 */
	public void testMustBeOwned() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getOwner()
	 * @generated
	 */
	public void testGetOwner() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
} //ElementTest
