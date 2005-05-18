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
 * $Id: StructuralFeatureActionTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.StructuralFeatureAction;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class StructuralFeatureActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Structural Feature Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structural Feature Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructuralFeatureAction getFixture() {
		return (StructuralFeatureAction)fixture;
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.Action#getInputs() <em>Input</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Action#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		if (null != getFixture().getObject()) {
			assertTrue(getFixture().getInputs().contains(getFixture().getObject()));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setObject(UML2Factory.eINSTANCE.createInputPin());
	}

} //StructuralFeatureActionImplTest
