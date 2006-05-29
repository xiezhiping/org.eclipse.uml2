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
 * $Id: BehavioredClassifierTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.BehavioredClassifier;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class BehavioredClassifierTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedBehaviors()));

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedTriggers()));
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getImplementations()));
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
