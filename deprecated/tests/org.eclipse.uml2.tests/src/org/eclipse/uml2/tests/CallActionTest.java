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
 * $Id: CallActionTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.CallAction;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class CallActionTest extends InvocationActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Call Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CallAction getFixture() {
		return (CallAction)fixture;
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.Action#getOutputs() <em>Output</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Action#getOutputs()
	 * @generated
	 */
	public void testGetOutputsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetOutputs() {
		testGetOutputsGen();
		
		super.testGetOutputs();

		assertTrue(getFixture().getOutputs().containsAll(getFixture().getResults()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpOutputs()
	 */
	protected void setUpOutputs() {
		super.setUpOutputs();

		getFixture().getResults().add(UML2Factory.eINSTANCE.createOutputPin());
		getFixture().getResults().add(UML2Factory.eINSTANCE.createOutputPin());
	}

} //CallActionImplTest
