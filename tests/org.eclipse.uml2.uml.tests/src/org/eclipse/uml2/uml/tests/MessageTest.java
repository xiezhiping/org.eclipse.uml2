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

import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Message#getMessageKind() <em>Message Kind</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sending Receiving Message Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arguments</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Cross Boundaries</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occurrence Specifications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureReferTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Refer To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperationRequest(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation Request</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperationReply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation Reply</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MessageTest
		extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageTest.class);
	}

	/**
	 * Constructs a new Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Message getFixture() {
		return (Message) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createMessage());
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
	 * Tests the '{@link org.eclipse.uml2.uml.Message#getMessageKind() <em>Message Kind</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#getMessageKind()
	 * @generated
	 */
	public void testGetMessageKind() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sending Receiving Message Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSendingReceivingMessageEvent__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateSignatureReferTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Refer To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateSignatureReferTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureReferTo__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperationRequest(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsOperationRequest(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureIsOperationRequest__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperationReply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation Reply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsOperationReply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureIsOperationReply__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace)
	 * @generated
	 */
	@Override
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateSignatureIsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSignatureIsSignal__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arguments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateArguments__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Cross Boundaries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCannotCrossBoundaries__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occurrence Specifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOccurrenceSpecifications__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //MessageTest
