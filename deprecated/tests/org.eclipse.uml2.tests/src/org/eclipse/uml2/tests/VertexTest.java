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
 * $Id: VertexTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.Vertex;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class VertexTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Vertex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vertex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Vertex getFixture() {
		return (Vertex)fixture;
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getContainer()) {
			assertSame(getFixture().getContainer(), getFixture().getOwner());
		}
	}

} //VertexImplTest
