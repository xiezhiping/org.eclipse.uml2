/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
 * $Id: ProtocolTransitionTest.java,v 1.3 2007/02/14 20:06:13 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#getReferreds() <em>Referred</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refers To Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associated Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Belongs To Psm</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProtocolTransitionTest
		extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProtocolTransitionTest.class);
	}

	/**
	 * Constructs a new Protocol Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Protocol Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProtocolTransition getFixture() {
		return (ProtocolTransition) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createProtocolTransition());
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
	 * Tests the '{@link org.eclipse.uml2.uml.ProtocolTransition#getReferreds() <em>Referred</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getReferreds()
	 * @generated
	 */
	public void testGetReferreds() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Belongs To Psm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBelongsToPsm__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associated Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateAssociatedActions__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refers To Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRefersToOperation__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ProtocolTransitionTest
