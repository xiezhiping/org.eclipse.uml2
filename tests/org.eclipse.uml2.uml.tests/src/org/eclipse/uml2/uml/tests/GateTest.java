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

import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateActualGateMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Gate Matched</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateInsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inside Cf Matched</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateOutsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outside Cf Matched</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateFormalGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Formal Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateActualGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateOutsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outside Cf Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateInsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inside Cf Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isOutsideCF() <em>Is Outside CF</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isInsideCF() <em>Is Inside CF</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isActual() <em>Is Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isFormal() <em>Is Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#matches(org.eclipse.uml2.uml.Gate) <em>Matches</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#getOperand() <em>Get Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GateTest
		extends MessageEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GateTest.class);
	}

	/**
	 * Constructs a new Gate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Gate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Gate getFixture() {
		return (Gate) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createGate());
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
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateActualGateMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Gate Matched</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateActualGateMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateActualGateMatched__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateInsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inside Cf Matched</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateInsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInsideCfMatched__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateOutsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outside Cf Matched</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateOutsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOutsideCfMatched__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateFormalGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Formal Gate Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateFormalGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateFormalGateDistinguishable__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateActualGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Gate Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateActualGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateActualGateDistinguishable__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateOutsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outside Cf Gate Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateOutsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOutsideCfGateDistinguishable__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#validateInsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inside Cf Gate Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#validateInsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInsideCfGateDistinguishable__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#isOutsideCF() <em>Is Outside CF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#isOutsideCF()
	 * @generated
	 */
	public void testIsOutsideCF() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#isInsideCF() <em>Is Inside CF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#isInsideCF()
	 * @generated
	 */
	public void testIsInsideCF() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#isActual() <em>Is Actual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#isActual()
	 * @generated
	 */
	public void testIsActual() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#isFormal() <em>Is Formal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#isFormal()
	 * @generated
	 */
	public void testIsFormal() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#matches(org.eclipse.uml2.uml.Gate) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#matches(org.eclipse.uml2.uml.Gate)
	 * @generated
	 */
	public void testMatches__Gate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#getOperand() <em>Get Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#getOperand()
	 * @generated
	 */
	public void testGetOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Gate#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace)
	 * @generated
	 */
	@Override
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //GateTest
