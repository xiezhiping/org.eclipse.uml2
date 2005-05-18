/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MessageTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Message;
import org.eclipse.uml2.MessageKind;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Message#getMessageKind() <em>Message Kind</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MessageTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	private Message getFixture() {
		return (Message)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Message#getMessageKind() <em>Message Kind</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Message#getMessageKind()
	 * @generated
	 */
	public void testGetMessageKindGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	public void testGetMessageKind() {
		testGetMessageKindGen();
		
		getFixture().setSendEvent(null);
		getFixture().setReceiveEvent(null);

		assertSame(MessageKind.UNKNOWN_LITERAL, getFixture().getMessageKind());

		getFixture().setSendEvent(null);
		getFixture().setReceiveEvent(UML2Factory.eINSTANCE.createGate());

		assertSame(MessageKind.FOUND_LITERAL, getFixture().getMessageKind());

		getFixture().setSendEvent(UML2Factory.eINSTANCE.createGate());
		getFixture().setReceiveEvent(null);

		assertSame(MessageKind.LOST_LITERAL, getFixture().getMessageKind());

		getFixture().setSendEvent(UML2Factory.eINSTANCE.createGate());
		getFixture().setReceiveEvent(UML2Factory.eINSTANCE.createGate());

		assertSame(MessageKind.COMPLETE_LITERAL, getFixture().getMessageKind());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#getNamespace() <em>Namespace</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		assertSame(getFixture().getInteraction(), getFixture().getNamespace());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getArguments()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createInteraction().getMessages().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createInteraction().getMessages().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getArguments().add(UML2Factory.eINSTANCE.createInstanceValue());
		getFixture().getArguments().add(UML2Factory.eINSTANCE.createInstanceValue());
	}

} //MessageImplTest
