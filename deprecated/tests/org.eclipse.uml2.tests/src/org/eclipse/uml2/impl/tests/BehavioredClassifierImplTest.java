/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifierImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.BehavioredClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedBehaviors() <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getClassifierBehavior() <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getImplementations() <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedStateMachines() <em>Owned State Machine</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BehavioredClassifierImplTest extends ClassifierImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behaviored Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifierImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behaviored Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehavioredClassifierImpl getFixture() {
		return (BehavioredClassifierImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedBehaviors() <em>Owned Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedBehaviors()
	 * @generated
	 */
	public void testGetOwnedBehaviors() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getClassifierBehavior() <em>Classifier Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getClassifierBehavior()
	 * @generated
	 */
	public void testGetClassifierBehavior() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#setClassifierBehavior() <em>Classifier Behavior</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#setClassifierBehavior()
	 * @generated
	 */
	public void testSetClassifierBehavior() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getImplementations() <em>Implementation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getImplementations()
	 * @generated
	 */
	public void testGetImplementations() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedStateMachines() <em>Owned State Machine</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedStateMachines()
	 * @generated
	 */
	public void testGetOwnedStateMachines() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedBehaviors()));

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedTriggers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getImplementations()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioredClassifierImpl#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioredClassifierImpl#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
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
