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

import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Part Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.PartDecomposition#validateCommutativityOfDecomposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Commutativity Of Decomposition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PartDecomposition#validateAssume(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assume</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PartDecomposition#validatePartsOfInternalStructures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parts Of Internal Structures</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PartDecompositionTest
		extends InteractionUseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PartDecompositionTest.class);
	}

	/**
	 * Constructs a new Part Decomposition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecompositionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Part Decomposition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PartDecomposition getFixture() {
		return (PartDecomposition) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createPartDecomposition());
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
	 * Tests the '{@link org.eclipse.uml2.uml.PartDecomposition#validatePartsOfInternalStructures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parts Of Internal Structures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.PartDecomposition#validatePartsOfInternalStructures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePartsOfInternalStructures__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.PartDecomposition#validateAssume(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.PartDecomposition#validateAssume(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateAssume__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.PartDecomposition#validateCommutativityOfDecomposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Commutativity Of Decomposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.PartDecomposition#validateCommutativityOfDecomposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCommutativityOfDecomposition__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //PartDecompositionTest
