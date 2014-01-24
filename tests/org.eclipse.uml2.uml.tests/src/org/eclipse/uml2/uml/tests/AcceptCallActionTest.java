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

import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Call Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AcceptCallActionTest
		extends AcceptEventActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcceptCallActionTest.class);
	}

	/**
	 * Constructs a new Accept Call Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Accept Call Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AcceptCallAction getFixture() {
		return (AcceptCallAction) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createAcceptCallAction());
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
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptCallAction#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateResultPins__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Call Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTriggerCallEvent__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUnmarshall__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //AcceptCallActionTest
