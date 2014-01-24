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

import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Choice Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outgoing From Initial</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateJoinVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Join Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Junction Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Vertices</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateForkVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fork Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Incoming</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PseudostateTest
		extends VertexTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PseudostateTest.class);
	}

	/**
	 * Constructs a new Pseudostate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pseudostate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pseudostate getFixture() {
		return (Pseudostate) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createPseudostate());
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
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInitialVertex__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateHistoryVertices__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateJoinVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Join Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateJoinVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateJoinVertex__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTransitionsIncoming__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateForkVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fork Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateForkVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateForkVertex__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTransitionsOutgoing__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Junction Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateJunctionVertex__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Choice Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateChoiceVertex__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outgoing From Initial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOutgoingFromInitial__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //PseudostateTest
