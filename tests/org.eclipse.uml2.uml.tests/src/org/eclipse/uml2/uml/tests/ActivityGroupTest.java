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

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity() <em>In Activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#containingActivity() <em>Containing Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nodes And Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Contained</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ActivityGroupTest
		extends NamedElementTest {

	/**
	 * Constructs a new Activity Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActivityGroup getFixture() {
		return (ActivityGroup) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity() <em>In Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated NOT
	 */
	public void testGetInActivity() {
		Activity activity = UMLFactory.eINSTANCE.createActivity();
		activity.getOwnedGroups().add(getFixture());

		assertEquals(activity, getFixture().getInActivity());

		activity.getGroups().remove(getFixture());

		assertNull(getFixture().getInActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#setInActivity(org.eclipse.uml2.uml.Activity) <em>In Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#setInActivity(org.eclipse.uml2.uml.Activity)
	 * @generated NOT
	 */
	public void testSetInActivity() {
		Activity activity1 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setInActivity(activity1);

		assertTrue(activity1.getOwnedGroups().contains(getFixture()));
		assertTrue(activity1.getGroups().contains(getFixture()));

		Activity activity2 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setInActivity(activity2);

		assertFalse(activity1.getOwnedGroups().contains(getFixture()));
		assertFalse(activity1.getGroups().contains(getFixture()));
		assertTrue(activity2.getOwnedGroups().contains(getFixture()));
		assertTrue(activity2.getGroups().contains(getFixture()));

		getFixture().setInActivity(null);

		assertFalse(activity2.getOwnedGroups().contains(getFixture()));
		assertFalse(activity2.getGroups().contains(getFixture()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#containingActivity() <em>Containing Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#containingActivity()
	 * @generated
	 */
	public void testContainingActivity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nodes And Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNodesAndEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNotContained__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ActivityGroupTest
