/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: MessageImplTest.java,v 1.1 2004/04/29 14:56:46 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.MessageKind;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.MessageImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.MessageImpl#getMessageKind() <em>Message Kind</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.MessageImpl#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MessageImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MessageImplTest extends NamedElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageImplTest.class);
	}

	/**
	 * Constructs a new Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageImpl getFixture() {
		return (MessageImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((MessageImpl) UML2Factory.eINSTANCE.createMessage());
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
	 * Tests the '{@link org.eclipse.uml2.impl.MessageImpl#getMessageKind() <em>Message Kind</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MessageImpl#getMessageKind()
	 * @generated NOT
	 */
	public void testGetMessageKind() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.MessageImpl#getNamespace() <em>Get Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MessageImpl#getNamespace()
	 * @generated NOT
	 */
	public void testGetNamespace() {
		super.testGetNamespace();

		assertSame(getFixture().getInteraction(), getFixture().getNamespace());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MessageImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MessageImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getArguments()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createInteraction().getMessages().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createInteraction().getMessages().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getArguments().add(UML2Factory.eINSTANCE.createInstanceValue());
		getFixture().getArguments().add(UML2Factory.eINSTANCE.createInstanceValue());
	}

} //MessageImplTest
