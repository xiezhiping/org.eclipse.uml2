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
 * $Id: StateMachineTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext() <em>State Machine redefinition Context</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StateMachine#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.StateMachine#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.StateMachine#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StateMachineTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	 * Tests the '{@link org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext() <em>State Machine redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext()
	 * @generated
	 */
	public void testGetStateMachine_redefinitionContext() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.StateMachine#setStateMachine_redefinitionContext(org.eclipse.uml2.BehavioredClassifier) <em>State Machine redefinition Context</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StateMachine#setStateMachine_redefinitionContext(org.eclipse.uml2.BehavioredClassifier)
	 * @generated
	 */
	public void testSetStateMachine_redefinitionContext() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.StateMachine#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StateMachine#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		assertTrue(getFixture().getRedefinedElements().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.StateMachine#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StateMachine#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		assertTrue(getFixture().getRedefinitionContexts().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.StateMachine#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StateMachine#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
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
