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
 * $Id: FunctionBehaviorTest.java,v 1.1 2006/02/21 16:32:28 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types Of Parameters</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FunctionBehaviorTest
		extends OpaqueBehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBehaviorTest.class);
	}

	/**
	 * Constructs a new Function Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FunctionBehavior getFixture() {
		return (FunctionBehavior) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createFunctionBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOneOutputParameter__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types Of Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTypesOfParameters__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //FunctionBehaviorTest
