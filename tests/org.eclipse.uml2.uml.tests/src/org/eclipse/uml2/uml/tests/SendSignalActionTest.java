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

import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.SendSignalAction#validateTypeOrderingMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Ordering Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.SendSignalAction#validateNumberOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Order</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.SendSignalAction#validateTypeTargetPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Target Pin</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SendSignalActionTest
		extends InvocationActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SendSignalActionTest.class);
	}

	/**
	 * Constructs a new Send Signal Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Send Signal Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SendSignalAction getFixture() {
		return (SendSignalAction) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createSendSignalAction());
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
	 * Tests the '{@link org.eclipse.uml2.uml.SendSignalAction#validateNumberOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateNumberOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNumberOrder__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.SendSignalAction#validateTypeTargetPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Target Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateTypeTargetPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTypeTargetPin__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.SendSignalAction#validateTypeOrderingMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Ordering Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateTypeOrderingMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTypeOrderingMultiplicity__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //SendSignalActionTest
