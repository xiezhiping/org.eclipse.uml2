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
 * $Id: ActivityGroupTest.java,v 1.1 2005/04/04 20:06:06 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getSuperGroup() <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity() <em>Activity Group activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getSubgroups() <em>Get Subgroups</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getContainedEdges() <em>Get Contained Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getContainedNodes() <em>Get Contained Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getActivity() <em>Get Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#setActivity(Activity) <em>Set Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getOwner() <em>Get Owner</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getSuperGroup() <em>Super Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public void testGetSuperGroupGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSuperGroup() {
		testGetSuperGroupGen();
		
		assertNull(getFixture().getSuperGroup());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity() <em>Activity Group activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getActivityGroup_activity()
	 * @generated
	 */
	public void testGetActivityGroup_activityGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetActivityGroup_activity() {
		testGetActivityGroup_activityGen();
		
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		activity.getGroups().add(getFixture());

		assertSame(activity, getFixture().getActivityGroup_activity());

		activity.getGroups().remove(getFixture());

		assertSame(null, getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#setActivityGroup_activity(Activity) <em>Activity Group activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#setActivityGroup_activity(Activity)
	 * @generated
	 */
	public void testSetActivityGroup_activityGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetActivityGroup_activity() {
		testSetActivityGroup_activityGen();
		
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		getFixture().setActivityGroup_activity(activity);

		assertSame(activity, getFixture().getActivityGroup_activity());
		assertTrue(activity.getGroups().contains(getFixture()));

		getFixture().setActivityGroup_activity(null);

		assertSame(null, getFixture().getActivityGroup_activity());
		assertFalse(activity.getGroups().contains(getFixture()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getSubgroups() <em>Get Subgroups</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public void testGetSubgroupsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSubgroups() {
		testGetSubgroupsGen();

		for (Iterator subgroups = getFixture().getSubgroups().iterator(); subgroups.hasNext();) {
			assertTrue(ActivityGroup.class.isInstance(subgroups.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getContainedEdges() <em>Get Contained Edges</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public void testGetContainedEdgesGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetContainedEdges() {
		testGetContainedEdgesGen();
		
		assertTrue(getFixture().getContainedEdges().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getContainedNodes() <em>Get Contained Nodes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public void testGetContainedNodesGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetContainedNodes() {
		testGetContainedNodesGen();
		
		assertTrue(getFixture().getContainedNodes().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getActivity() <em>Get Activity</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getActivity()
	 * @generated
	 */
	public void testGetActivityGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#setActivity(Activity) <em>Set Activity</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#setActivity(Activity)
	 * @generated
	 */
	public void testSetActivityGen() {
		// TODO: implement this setter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetActivity() {
		testSetActivityGen();
		
		getFixture().setActivity(UML2Factory.eINSTANCE.createActivity());

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());

		getFixture().setActivity(null);

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubgroups()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getSuperGroup()) {
			assertSame(getFixture().getSuperGroup(), getFixture().getOwner());
		}

		if (null != getFixture().getActivityGroup_activity()) {
			assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
		}
	}

} //ActivityGroupImplTest
