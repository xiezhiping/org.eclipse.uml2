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

import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Zero Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Decision Input Flow Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Two Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Control One Input Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Object One Input Parameter</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DecisionNodeTest
		extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecisionNodeTest.class);
	}

	/**
	 * Constructs a new Decision Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decision Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DecisionNode getFixture() {
		return (DecisionNode) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createDecisionNode());
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
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Outgoing Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateIncomingOutgoingEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Decision Input Flow Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateDecisionInputFlowIncoming__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateParameters__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Zero Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateZeroInputParameters__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Object One Input Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateIncomingObjectOneInputParameter__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Control One Input Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateIncomingControlOneInputParameter__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Two Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTwoInputParameters__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //DecisionNodeTest
