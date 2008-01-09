/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *
 * $Id: NodeTest.java,v 1.7 2008/01/09 18:52:23 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Node#validateInternalStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Structure</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Node#createCommunicationPath(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Node, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Communication Path</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Node#getCommunicationPaths() <em>Get Communication Paths</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NodeTest
		extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeTest.class);
	}

	/**
	 * Constructs a new Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Node getFixture() {
		return (Node) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createNode());
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
	 * Tests the '{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public void testGetDeployedElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Node#validateInternalStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Structure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Node#validateInternalStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInternalStructure__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Node#createCommunicationPath(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Node, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Communication Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Node#createCommunicationPath(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Node, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int)
	 * @generated
	 */
	public void testCreateCommunicationPath__boolean_AggregationKind_String_int_int_Node_boolean_AggregationKind_String_int_int() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Node#getCommunicationPaths() <em>Get Communication Paths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Node#getCommunicationPaths()
	 * @generated
	 */
	public void testGetCommunicationPaths() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //NodeTest
