/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ActivityGroupImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ActivityGroupImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSuperGroup() <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getActivityGroup_activity() <em>Activity Group activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSubgroups() <em>Get Subgroups</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getContainedEdges() <em>Get Contained Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getContainedNodes() <em>Get Contained Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getActivity() <em>Get Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#setActivity(Activity) <em>Set Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ActivityGroupImplTest extends ElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Activity Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroupImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityGroupImpl getFixture() {
		return (ActivityGroupImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSuperGroup() <em>Super Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getSuperGroup()
	 * @generated
	 */
	public void testGetSuperGroupGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetSuperGroup() {
		testGetSuperGroupGen();
		
		assertNull(getFixture().getSuperGroup());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getActivityGroup_activity() <em>Activity Group activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getActivityGroup_activity()
	 * @generated
	 */
	public void testGetActivityGroup_activityGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#setActivityGroup_activity() <em>Activity Group activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#setActivityGroup_activity()
	 * @generated
	 */
	public void testSetActivityGroup_activityGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSubgroups() <em>Get Subgroups</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getSubgroups()
	 * @generated
	 */
	public void testGetSubgroupsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSubgroups() {
		testGetSubgroupsGen();

		for (Iterator subgroups = getFixture().getSubgroups().iterator(); subgroups.hasNext();) {
			assertTrue(ActivityGroup.class.isInstance(subgroups.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getContainedEdges() <em>Get Contained Edges</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getContainedEdges()
	 * @generated
	 */
	public void testGetContainedEdgesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetContainedEdges() {
		testGetContainedEdgesGen();
		
		assertTrue(getFixture().getContainedEdges().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getContainedNodes() <em>Get Contained Nodes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getContainedNodes()
	 * @generated
	 */
	public void testGetContainedNodesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetContainedNodes() {
		testGetContainedNodesGen();
		
		assertTrue(getFixture().getContainedNodes().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getActivity() <em>Get Activity</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getActivity()
	 * @generated
	 */
	public void testGetActivityGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#setActivity(Activity) <em>Set Activity</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#setActivity(Activity)
	 * @generated
	 */
	public void testSetActivity__ActivityGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetActivity__Activity() {
		testSetActivity__ActivityGen();
		
		getFixture().setActivity(UML2Factory.eINSTANCE.createActivity());

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());

		getFixture().setActivity(null);

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubgroups()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityGroupImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityGroupImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
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
