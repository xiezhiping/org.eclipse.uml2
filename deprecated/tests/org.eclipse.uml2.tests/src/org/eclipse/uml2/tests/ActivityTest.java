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
 * $Id: ActivityTest.java,v 1.1 2005/04/04 20:06:06 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Activity;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Activity#getGroups() <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getNodes() <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getActions() <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getStructuredNodes() <em>Structured Node</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Activity#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActivityTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	private Activity getFixture() {
		return (Activity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createActivity());
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
	 * Tests the '{@link org.eclipse.uml2.Activity#getGroups() <em>Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Activity#getGroups()
	 * @generated
	 */
	public void testGetGroupsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetGroups() {
		testGetGroupsGen();

		for (int i = 0; i < 5; i++) {
			assertTrue(getFixture().getGroups().contains(getFixture().createGroup(UML2Package.eINSTANCE.getStructuredActivityNode())));
		}

		for (Iterator activityGroupSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getActivityGroup()).iterator(); activityGroupSubClasses.hasNext();) {
			EClass activityGroupSubClass = (EClass) activityGroupSubClasses.next();

			for (int i = 0; i < 5; i++) {
				assertTrue(getFixture().getGroups().contains(getFixture().createGroup(activityGroupSubClass)));
			}
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Activity#getNodes() <em>Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Activity#getNodes()
	 * @generated
	 */
	public void testGetNodes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Activity#getActions() <em>Action</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Activity#getActions()
	 * @generated
	 */
	public void testGetActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Activity#getStructuredNodes() <em>Structured Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Activity#getStructuredNodes()
	 * @generated
	 */
	public void testGetStructuredNodesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetStructuredNodes() {
		testGetStructuredNodesGen();
		
		StructuredActivityNode structuredNode1 = UML2Factory.eINSTANCE.createStructuredActivityNode();
		getFixture().getNodes().add(structuredNode1);

		assertSame(getFixture(), structuredNode1.getActivity());

		StructuredActivityNode structuredNode2 = UML2Factory.eINSTANCE.createStructuredActivityNode();
		getFixture().getGroups().add(structuredNode2);

		assertSame(getFixture(), structuredNode2.getActivity());

		assertTrue(getFixture().getStructuredNodes().contains(structuredNode1));
		assertTrue(getFixture().getStructuredNodes().contains(structuredNode2));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Activity#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Activity#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getEdges()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getGroups()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getNodes()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getEdges().add(UML2Factory.eINSTANCE.createControlFlow());
		getFixture().getEdges().add(UML2Factory.eINSTANCE.createControlFlow());

		getFixture().getGroups().add(UML2Factory.eINSTANCE.createActivityPartition());
		getFixture().getGroups().add(UML2Factory.eINSTANCE.createActivityPartition());

		getFixture().getNodes().add(UML2Factory.eINSTANCE.createAction());
		getFixture().getNodes().add(UML2Factory.eINSTANCE.createAction());
	}

	public void testGetEdges() {

		for (Iterator activityEdgeSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getActivityEdge()).iterator(); activityEdgeSubClasses.hasNext();) {
			EClass vertexSubClass = (EClass) activityEdgeSubClasses.next();

			for (int i = 0; i < 5; i++) {
				assertTrue(getFixture().getEdges().contains(getFixture().createEdge(vertexSubClass)));
			}
		}
	}

} //ActivityImplTest
