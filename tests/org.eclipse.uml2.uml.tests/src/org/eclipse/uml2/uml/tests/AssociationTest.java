/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Association#getEndTypes() <em>End Type</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Number</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateAssociationEnds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Ends</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateEndsMustBeTyped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ends Must Be Typed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#isBinary() <em>Is Binary</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AssociationTest
		extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationTest.class);
	}

	/**
	 * Constructs a new Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Association getFixture() {
		return (Association) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createAssociation());
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
	 * Tests the '{@link org.eclipse.uml2.uml.Association#getEndTypes() <em>End Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public void testGetEndTypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSpecializedEndNumber__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSpecializedEndTypes__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Association#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBinaryAssociations__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Association#validateAssociationEnds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Ends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#validateAssociationEnds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateAssociationEnds__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Association#validateEndsMustBeTyped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ends Must Be Typed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#validateEndsMustBeTyped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateEndsMustBeTyped__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Association#isBinary() <em>Is Binary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Association#isBinary()
	 * @generated
	 */
	public void testIsBinary() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //AssociationTest
