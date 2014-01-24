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
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getActivity() <em>Activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#containingActivity() <em>Containing Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ActivityNodeTest
		extends RedefinableElementTest {

	/**
	 * Constructs a new Activity Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActivityNode getFixture() {
		return (ActivityNode) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityNode#getActivity() <em>Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityNode#getActivity()
	 * @generated NOT
	 */
	public void testGetActivity() {
		Activity activity = UMLFactory.eINSTANCE.createActivity();
		activity.getOwnedNodes().add(getFixture());

		assertEquals(activity, getFixture().getActivity());

		activity.getNodes().remove(getFixture());

		assertNull(getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityNode#setActivity(org.eclipse.uml2.uml.Activity) <em>Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityNode#setActivity(org.eclipse.uml2.uml.Activity)
	 * @generated NOT
	 */
	public void testSetActivity() {
		Activity activity1 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setActivity(activity1);

		assertTrue(activity1.getOwnedNodes().contains(getFixture()));
		assertTrue(activity1.getNodes().contains(getFixture()));

		Activity activity2 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setActivity(activity2);

		assertFalse(activity1.getOwnedNodes().contains(getFixture()));
		assertFalse(activity1.getNodes().contains(getFixture()));
		assertTrue(activity2.getOwnedNodes().contains(getFixture()));
		assertTrue(activity2.getNodes().contains(getFixture()));

		getFixture().setActivity(null);

		assertFalse(activity2.getOwnedNodes().contains(getFixture()));
		assertFalse(activity2.getNodes().contains(getFixture()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityNode#containingActivity() <em>Containing Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityNode#containingActivity()
	 * @generated
	 */
	public void testContainingActivity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityNode#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityNode#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement)
	 * @generated
	 */
	@Override
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ActivityNodeTest
