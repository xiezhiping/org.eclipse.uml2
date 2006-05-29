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
 * $Id: ConnectableElementTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.ConnectableElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ConnectableElementTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Connectable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connectable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectableElement getFixture() {
		return (ConnectableElement)fixture;
	}


	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

} //ConnectableElementImplTest
