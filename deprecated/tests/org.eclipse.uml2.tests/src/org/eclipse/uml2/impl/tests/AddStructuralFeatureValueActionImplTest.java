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
 * $Id: AddStructuralFeatureValueActionImplTest.java,v 1.4 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#isReplaceAll() <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#getInputs() <em>Get Inputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AddStructuralFeatureValueActionImplTest extends WriteStructuralFeatureActionImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddStructuralFeatureValueActionImplTest.class);
	}

	/**
	 * Constructs a new Add Structural Feature Value Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Structural Feature Value Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AddStructuralFeatureValueActionImpl getFixture() {
		return (AddStructuralFeatureValueActionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((AddStructuralFeatureValueActionImpl) UML2Factory.eINSTANCE.createAddStructuralFeatureValueAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#isReplaceAll() <em>Is Replace All</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#isReplaceAll()
	 * @generated
	 */
	public void testIsReplaceAll() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#setIsReplaceAll() <em>Is Replace All</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#setIsReplaceAll()
	 * @generated
	 */
	public void testSetIsReplaceAll() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#getInputs() <em>Get Inputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		assertTrue(getFixture().getInputs().contains(getFixture().getInsertAt()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setInsertAt(UML2Factory.eINSTANCE.createInputPin());
	}

} //AddStructuralFeatureValueActionImplTest
