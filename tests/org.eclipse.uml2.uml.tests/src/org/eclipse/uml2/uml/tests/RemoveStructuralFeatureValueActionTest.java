/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RemoveStructuralFeatureValueActionTest.java,v 1.1 2006/02/21 16:32:27 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#validateNonUniqueRemoval(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Unique Removal</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RemoveStructuralFeatureValueActionTest
		extends WriteStructuralFeatureActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveStructuralFeatureValueActionTest.class);
	}

	/**
	 * Constructs a new Remove Structural Feature Value Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Structural Feature Value Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RemoveStructuralFeatureValueAction getFixture() {
		return (RemoveStructuralFeatureValueAction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE
			.createRemoveStructuralFeatureValueAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Action#getInputs()
	 * @generated
	 */
	public void testGetInputs() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#validateNonUniqueRemoval(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Unique Removal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#validateNonUniqueRemoval(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNonUniqueRemoval__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //RemoveStructuralFeatureValueActionTest
