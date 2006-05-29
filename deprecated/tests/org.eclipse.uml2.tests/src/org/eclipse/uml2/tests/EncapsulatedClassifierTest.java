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
 * $Id: EncapsulatedClassifierTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.EncapsulatedClassifier;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class EncapsulatedClassifierTest extends StructuredClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Encapsulated Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedClassifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Encapsulated Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EncapsulatedClassifier getFixture() {
		return (EncapsulatedClassifier)fixture;
	}


	public void testGetFeatures() {
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedPorts()));
	}

	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedPorts()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedPorts().add(UML2Factory.eINSTANCE.createPort());
		getFixture().getOwnedPorts().add(UML2Factory.eINSTANCE.createPort());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedPorts().add(UML2Factory.eINSTANCE.createPort());
		getFixture().getOwnedPorts().add(UML2Factory.eINSTANCE.createPort());
	}

} //EncapsulatedClassifierImplTest
