/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ActivityGroupTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getContainedNodes() <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getContainedEdges() <em>Contained Edge</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ActivityGroupTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	private ActivityGroup getFixture() {
		return (ActivityGroup)fixture;
	}

	public void testGetSuperGroup() {
		assertNull(getFixture().getSuperGroup());
	}

	public void testGetActivityGroup_activity() {
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		activity.getGroups().add(getFixture());

		assertSame(activity, getFixture().getActivityGroup_activity());

		activity.getGroups().remove(getFixture());

		assertSame(null, getFixture().getActivityGroup_activity());
	}

	public void testSetActivityGroup_activity() {
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		getFixture().setActivityGroup_activity(activity);

		assertSame(activity, getFixture().getActivityGroup_activity());
		assertTrue(activity.getGroups().contains(getFixture()));

		getFixture().setActivityGroup_activity(null);

		assertSame(null, getFixture().getActivityGroup_activity());
		assertFalse(activity.getGroups().contains(getFixture()));
	}

	public void testGetSubgroups() {

		for (Iterator subgroups = getFixture().getSubgroups().iterator(); subgroups.hasNext();) {
			assertTrue(ActivityGroup.class.isInstance(subgroups.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getContainedEdges() <em>Contained Edge</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public void testGetContainedEdgesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	public void testGetContainedEdges() {
		testGetContainedEdgesGen();
		
		assertTrue(getFixture().getContainedEdges().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getContainedNodes() <em>Contained Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public void testGetContainedNodesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetContainedNodes() {
		testGetContainedNodesGen();
		
		assertTrue(getFixture().getContainedNodes().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityNode#getActivity() <em>Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityNode#getActivity()
	 * @generated
	 */
	public void testGetActivityGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetActivity() {
		testGetActivityGen();
		
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		activity.getGroups().add(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getActivity());

		activity.getGroups().remove(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityNode#setActivity(org.eclipse.uml2.Activity) <em>Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityNode#setActivity(org.eclipse.uml2.Activity)
	 * @generated
	 */
	public void testSetActivityGen() {
		// TODO: implement this redefined feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testSetActivity() {
		testSetActivityGen();
		
		getFixture().setActivity(UML2Factory.eINSTANCE.createActivity());

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());

		getFixture().setActivity(null);

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubgroups()));
	}

	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getSuperGroup()) {
			assertSame(getFixture().getSuperGroup(), getFixture().getOwner());
		}

		if (null != getFixture().getActivityGroup_activity()) {
			assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
		}
	}

} //ActivityGroupImplTest
