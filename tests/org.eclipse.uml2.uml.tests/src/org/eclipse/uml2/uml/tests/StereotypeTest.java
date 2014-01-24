/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getProfile() <em>Profile</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBinaryAssociationsOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateGeneralize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateNameNotClash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Name Not Clash</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateAssociationEndOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association End Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyUpperBound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicitySingleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Multiplicity Single Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicityMultipleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Multiplicity Multiple Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createExtension(org.eclipse.uml2.uml.Class, boolean) <em>Create Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String) <em>Create Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String, java.lang.String) <em>Create Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses() <em>Get All Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getDefinition() <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses() <em>Get Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword() <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword(boolean) <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#containingProfile() <em>Containing Profile</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StereotypeTest
		extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StereotypeTest.class);
	}

	/**
	 * Constructs a new Stereotype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stereotype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stereotype getFixture() {
		return (Stereotype) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createStereotype());
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
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateNameNotClash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Name Not Clash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateNameNotClash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNameNotClash__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateAssociationEndOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association End Ownership</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateAssociationEndOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateAssociationEndOwnership__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyUpperBound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateBasePropertyUpperBound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBasePropertyUpperBound__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicitySingleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Multiplicity Single Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicitySingleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBasePropertyMultiplicitySingleExtension__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicityMultipleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Multiplicity Multiple Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicityMultipleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBasePropertyMultiplicityMultipleExtension__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateGeneralize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateGeneralize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateGeneralize__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#createExtension(org.eclipse.uml2.uml.Class, boolean) <em>Create Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#createExtension(org.eclipse.uml2.uml.Class, boolean)
	 * @generated
	 */
	public void testCreateExtension__Class_boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#getProfile() <em>Profile</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#getProfile()
	 * @generated
	 */
	public void testGetProfile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#validateBinaryAssociationsOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations Only</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#validateBinaryAssociationsOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBinaryAssociationsOnly__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#getKeyword() <em>Get Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#getKeyword()
	 * @generated
	 */
	public void testGetKeyword() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#getKeyword(boolean) <em>Get Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#getKeyword(boolean)
	 * @generated
	 */
	public void testGetKeyword__boolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#containingProfile() <em>Containing Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#containingProfile()
	 * @generated
	 */
	public void testContainingProfile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses() <em>Get Extended Metaclasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses()
	 * @generated
	 */
	public void testGetExtendedMetaclasses() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses() <em>Get All Extended Metaclasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses()
	 * @generated
	 */
	public void testGetAllExtendedMetaclasses() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#getDefinition() <em>Get Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#getDefinition()
	 * @generated
	 */
	public void testGetDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String) <em>Create Icon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String)
	 * @generated
	 */
	public void testCreateIcon__String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String, java.lang.String) <em>Create Icon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCreateIcon__String_String() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //StereotypeTest
