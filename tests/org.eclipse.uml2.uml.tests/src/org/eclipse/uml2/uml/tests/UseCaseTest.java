/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Association To Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Include Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#allIncludedUseCases() <em>All Included Use Cases</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UseCaseTest
		extends BehavioredClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UseCaseTest.class);
	}

	/**
	 * Constructs a new Use Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UseCase getFixture() {
		return (UseCase) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createUseCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.UseCase#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.UseCase#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMustHaveName__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.UseCase#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.UseCase#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateBinaryAssociations__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Association To Use Case</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoAssociationToUseCase__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Include Self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCannotIncludeSelf__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.UseCase#allIncludedUseCases() <em>All Included Use Cases</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.UseCase#allIncludedUseCases()
	 * @generated
	 */
	public void testAllIncludedUseCases() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //UseCaseTest
