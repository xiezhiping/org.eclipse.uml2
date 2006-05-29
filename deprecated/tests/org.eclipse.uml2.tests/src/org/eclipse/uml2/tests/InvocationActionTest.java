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
 * $Id: InvocationActionTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.InvocationAction;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class InvocationActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Invocation Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Invocation Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InvocationAction getFixture() {
		return (InvocationAction)fixture;
	}


	public void testGetInputs() {
		super.testGetInputs();

		assertTrue(getFixture().getInputs().containsAll(getFixture().getArguments()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().getArguments().add(UML2Factory.eINSTANCE.createInputPin());
		getFixture().getArguments().add(UML2Factory.eINSTANCE.createInputPin());
	}

} //InvocationActionImplTest
