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
 * $Id: WriteVariableActionImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.WriteVariableActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.WriteVariableActionImpl#getInputs() <em>Get Inputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class WriteVariableActionImplTest extends VariableActionImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Write Variable Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteVariableActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Write Variable Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WriteVariableActionImpl getFixture() {
		return (WriteVariableActionImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.WriteVariableActionImpl#getInputs() <em>Get Inputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.WriteVariableActionImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		assertTrue(getFixture().getInputs().contains(getFixture().getValue()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setValue(UML2Factory.eINSTANCE.createInputPin());
	}

} //WriteVariableActionImplTest
