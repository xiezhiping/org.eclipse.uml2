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
 * $Id: RemoveStructuralFeatureValueActionItemProviderTest.java,v 1.2 2005/03/15 18:49:59 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Remove Structural Feature Value Action</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveStructuralFeatureValueActionItemProviderTest extends WriteStructuralFeatureActionItemProviderTest {

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
		TestRunner.run(RemoveStructuralFeatureValueActionItemProviderTest.class);
	}

	/**
	 * Constructs a new Remove Structural Feature Value Action item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueActionItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Remove Structural Feature Value Action item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RemoveStructuralFeatureValueAction getModelObject() {
		return (RemoveStructuralFeatureValueAction) modelObject;
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createRemoveStructuralFeatureValueAction());
	}

} //RemoveStructuralFeatureValueActionItemProviderTest
