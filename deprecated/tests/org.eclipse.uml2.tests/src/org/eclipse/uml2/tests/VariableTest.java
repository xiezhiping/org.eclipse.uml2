/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: VariableTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.Variable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TypedElement#getType() <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getLower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getUpper() <em>Upper</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#includesCardinality(int) <em>Includes Cardinality</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Gt0</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Eq Lowerbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Eq Upperbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#lower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#upper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Variable#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class VariableTest extends ConnectableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableTest.class);
	}

	/**
	 * Constructs a new Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Variable getFixture() {
		return (Variable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.TypedElement#getType() <em>Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TypedElement#getType()
	 * @generated
	 */
	public void testGetType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.TypedElement#setType(org.eclipse.uml2.Type) <em>Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TypedElement#setType(org.eclipse.uml2.Type)
	 * @generated
	 */
	public void testSetType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#isOrdered() <em>Is Ordered</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#isOrdered()
	 * @generated
	 */
	public void testIsOrdered() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#setIsOrdered(boolean) <em>Is Ordered</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#setIsOrdered(boolean)
	 * @generated
	 */
	public void testSetIsOrdered() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#isUnique() <em>Is Unique</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#isUnique()
	 * @generated
	 */
	public void testIsUnique() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#setIsUnique(boolean) <em>Is Unique</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#setIsUnique(boolean)
	 * @generated
	 */
	public void testSetIsUnique() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#getLower() <em>Lower</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#getLower()
	 * @generated
	 */
	public void testGetLower() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#getUpper() <em>Upper</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#getUpper()
	 * @generated
	 */
	public void testGetUpper() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public void testLowerBound() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#upperBound()
	 * @generated
	 */
	public void testUpperBound() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public void testIsMultivalued() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#includesCardinality(int) <em>Includes Cardinality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#includesCardinality(int)
	 * @generated
	 */
	public void testIncludesCardinality__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.MultiplicityElement)
	 * @generated
	 */
	public void testIncludesMultiplicity__MultiplicityElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Gt0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperGt0__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerGe0__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperGeLower__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Eq Lowerbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerEqLowerbound__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Eq Upperbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperEqUpperbound__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#lower()
	 * @generated
	 */
	public void testLower() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#upper()
	 * @generated
	 */
	public void testUpper() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElements() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Variable#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Variable#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getScope(), getFixture().getOwner());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createStructuredActivityNode().getVariables().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createStructuredActivityNode().getVariables().add(getFixture());
	}

} //VariableImplTest
