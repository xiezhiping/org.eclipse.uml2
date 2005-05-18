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
 * $Id: ObjectNodeTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.ObjectNode;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ObjectNodeTest extends ActivityNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Object Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectNode getFixture() {
		return (ObjectNode)fixture;
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

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getUpperBound()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setUpperBound(UML2Factory.eINSTANCE.createLiteralUnlimitedNatural());
	}

} //ObjectNodeImplTest
