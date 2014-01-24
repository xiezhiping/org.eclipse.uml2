/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 351777, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getNodes() <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getGroups() <em>Group</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Activity#validateMaximumOneParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maximum One Parameter Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#validateMaximumTwoParameterNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maximum Two Parameter Nodes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActivityTest
		extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityTest.class);
	}

	/**
	 * Constructs a new Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Activity getFixture() {
		return (Activity) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createActivity());
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
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#getGroups() <em>Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#getGroups()
	 * @generated NOT
	 */
	public void testGetGroups() {
		ActivityGroup ownedGroup = UMLFactory.eINSTANCE
			.createInterruptibleActivityRegion();
		getFixture().getOwnedGroups().add(ownedGroup);

		assertTrue(getFixture().getOwnedGroups().contains(ownedGroup));
		assertTrue(getFixture().getGroups().contains(ownedGroup));

		getFixture().getGroups().remove(ownedGroup);

		assertFalse(getFixture().getOwnedGroups().contains(ownedGroup));
		assertFalse(getFixture().getGroups().contains(ownedGroup));

		ActivityPartition partition = UMLFactory.eINSTANCE
			.createActivityPartition();
		getFixture().getPartitions().add(partition);

		assertTrue(getFixture().getPartitions().contains(partition));
		assertTrue(getFixture().getOwnedGroups().contains(partition));
		assertTrue(getFixture().getGroups().contains(partition));

		getFixture().getGroups().remove(partition);

		assertFalse(getFixture().getPartitions().contains(partition));
		assertFalse(getFixture().getOwnedGroups().contains(partition));
		assertFalse(getFixture().getGroups().contains(partition));

		StructuredActivityNode structuredNode = UMLFactory.eINSTANCE
			.createStructuredActivityNode();
		getFixture().getStructuredNodes().add(structuredNode);

		assertTrue(getFixture().getStructuredNodes().contains(structuredNode));
		assertTrue(getFixture().getGroups().contains(structuredNode));

		getFixture().getGroups().remove(structuredNode);

		assertFalse(getFixture().getStructuredNodes().contains(structuredNode));
		assertFalse(getFixture().getGroups().contains(structuredNode));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#validateMaximumOneParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maximum One Parameter Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#validateMaximumOneParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMaximumOneParameterNode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#validateMaximumTwoParameterNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maximum Two Parameter Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#validateMaximumTwoParameterNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMaximumTwoParameterNodes__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#getNodes() <em>Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#getNodes()
	 * @generated NOT
	 */
	public void testGetNodes() {
		ActivityNode ownedNode = UMLFactory.eINSTANCE.createCentralBufferNode();
		getFixture().getOwnedNodes().add(ownedNode);

		assertTrue(getFixture().getOwnedNodes().contains(ownedNode));
		assertTrue(getFixture().getNodes().contains(ownedNode));

		getFixture().getNodes().remove(ownedNode);

		assertFalse(getFixture().getOwnedNodes().contains(ownedNode));
		assertFalse(getFixture().getNodes().contains(ownedNode));

		StructuredActivityNode structuredNode = UMLFactory.eINSTANCE
			.createStructuredActivityNode();
		getFixture().getStructuredNodes().add(structuredNode);

		assertTrue(getFixture().getStructuredNodes().contains(structuredNode));
		assertTrue(getFixture().getNodes().contains(structuredNode));

		getFixture().getNodes().remove(structuredNode);

		assertFalse(getFixture().getStructuredNodes().contains(structuredNode));
		assertFalse(getFixture().getNodes().contains(structuredNode));
	}

} //ActivityTest
