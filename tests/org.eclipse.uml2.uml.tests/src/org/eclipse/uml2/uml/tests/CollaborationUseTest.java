/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#validateClientElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#validateEveryRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Every Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#validateConnectors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connectors</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CollaborationUseTest
		extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollaborationUseTest.class);
	}

	/**
	 * Constructs a new Collaboration Use test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collaboration Use test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollaborationUse getFixture() {
		return (CollaborationUse) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createCollaborationUse());
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
	 * Tests the '{@link org.eclipse.uml2.uml.CollaborationUse#validateClientElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateClientElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateClientElements__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.CollaborationUse#validateEveryRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Every Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateEveryRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateEveryRole__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.CollaborationUse#validateConnectors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateConnectors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConnectors__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //CollaborationUseTest
