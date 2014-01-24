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

import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#validateInputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#validateOneOutputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#validateNoControlOrObjectFlow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Control Or Object Flow</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActionInputPinTest
		extends InputPinTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionInputPinTest.class);
	}

	/**
	 * Constructs a new Action Input Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action Input Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActionInputPin getFixture() {
		return (ActionInputPin) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createActionInputPin());
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
	 * Tests the '{@link org.eclipse.uml2.uml.ActionInputPin#validateOneOutputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateOneOutputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOneOutputPin__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActionInputPin#validateNoControlOrObjectFlow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Control Or Object Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateNoControlOrObjectFlow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoControlOrObjectFlow__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActionInputPin#validateInputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateInputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInputPin__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ActionInputPinTest
