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
 * $Id: BehavioredClassifierTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.BehavioredClassifier;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors() <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getClassifierBehavior() <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getImplementations() <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedStateMachines() <em>Owned State Machine</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BehavioredClassifierTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behaviored Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behaviored Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehavioredClassifier getFixture() {
		return (BehavioredClassifier)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors() <em>Owned Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors()
	 * @generated
	 */
	public void testGetOwnedBehaviors() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getClassifierBehavior() <em>Classifier Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getClassifierBehavior()
	 * @generated
	 */
	public void testGetClassifierBehavior() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#setClassifierBehavior(org.eclipse.uml2.Behavior) <em>Classifier Behavior</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#setClassifierBehavior(org.eclipse.uml2.Behavior)
	 * @generated
	 */
	public void testSetClassifierBehavior() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getImplementations() <em>Implementation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getImplementations()
	 * @generated
	 */
	public void testGetImplementations() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getOwnedStateMachines() <em>Owned State Machine</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getOwnedStateMachines()
	 * @generated
	 */
	public void testGetOwnedStateMachines() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedBehaviors()));

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedTriggers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getImplementations()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioredClassifier#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioredClassifier#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getImplementations().add(UML2Factory.eINSTANCE.createImplementation());
		getFixture().getImplementations().add(UML2Factory.eINSTANCE.createImplementation());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedBehaviors().add(UML2Factory.eINSTANCE.createActivity());
		getFixture().getOwnedBehaviors().add(UML2Factory.eINSTANCE.createActivity());

		getFixture().getOwnedTriggers().add(UML2Factory.eINSTANCE.createAnyTrigger());
		getFixture().getOwnedTriggers().add(UML2Factory.eINSTANCE.createAnyTrigger());
	}

} //BehavioredClassifierImplTest
