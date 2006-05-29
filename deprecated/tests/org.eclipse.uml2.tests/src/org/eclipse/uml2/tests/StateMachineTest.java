/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StateMachineTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineTest extends BehaviorTest {

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
	private StateMachine getFixture() {
		return (StateMachine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createStateMachine());
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
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		assertTrue(getFixture().getRedefinedElements().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		assertTrue(getFixture().getRedefinitionContexts().isEmpty());
	}

	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getConnectionPoints()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getRegions()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getConnectionPoints().add(UML2Factory.eINSTANCE.createPseudostate());
		getFixture().getConnectionPoints().add(UML2Factory.eINSTANCE.createPseudostate());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());
		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());
	}

} //StateMachineImplTest
