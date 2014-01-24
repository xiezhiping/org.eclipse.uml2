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

import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connection Points</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#validateContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#LCA(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>LCA</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#ancestor(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>Ancestor</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#LCAState(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>LCA State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StateMachineTest
		extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StateMachineTest.class);
	}

	/**
	 * Constructs a new State Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this State Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StateMachine getFixture() {
		return (StateMachine) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createStateMachine());
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
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateClassifierContext__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#validateContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#validateContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateContextClassifier__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#LCA(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>LCA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#LCA(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex)
	 * @generated
	 */
	public void testLCA__Vertex_Vertex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#ancestor(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>Ancestor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#ancestor(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex)
	 * @generated
	 */
	public void testAncestor__Vertex_Vertex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#LCAState(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex) <em>LCA State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#LCAState(org.eclipse.uml2.uml.Vertex, org.eclipse.uml2.uml.Vertex)
	 * @generated
	 */
	public void testLCAState__Vertex_Vertex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#validateConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connection Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#validateConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConnectionPoints__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#validateMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#validateMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMethod__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement)
	 * @generated
	 */
	@Override
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Behavior#getRedefinedBehaviors() <em>Redefined Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Behavior#getRedefinedBehaviors()
	 * @generated
	 */
	public void testGetRedefinedBehaviors() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement)
	 * @generated
	 */
	@Override
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
} //StateMachineTest
