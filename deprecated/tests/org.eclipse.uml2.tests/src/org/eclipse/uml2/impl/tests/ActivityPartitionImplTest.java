/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ActivityPartitionImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityPartition;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ActivityPartitionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperGroup() <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getActivityGroup_activity() <em>Activity Group activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSubgroups() <em>Get Subgroups</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getContainedEdges() <em>Get Contained Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getContainedNodes() <em>Get Contained Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getActivity() <em>Get Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setActivity(Activity) <em>Set Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperGroup() <em>Get Super Group</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActivityPartitionImplTest extends NamedElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityPartitionImplTest.class);
	}

	/**
	 * Constructs a new Activity Partition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartitionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Partition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityPartitionImpl getFixture() {
		return (ActivityPartitionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ActivityPartitionImpl) UML2Factory.eINSTANCE.createActivityPartition());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getActivityGroup_activity() <em>Activity Group activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getActivityGroup_activity()
	 * @generated NOT
	 */
	public void testGetActivityGroup_activity() {
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		activity.getGroups().add(getFixture());

		assertSame(activity, getFixture().getActivityGroup_activity());

		activity.getGroups().remove(getFixture());

		assertSame(null, getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setActivityGroup_activity() <em>Activity Group activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#setActivityGroup_activity()
	 * @generated NOT
	 */
	public void testSetActivityGroup_activity() {
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		getFixture().setActivityGroup_activity(activity);

		assertSame(activity, getFixture().getActivityGroup_activity());
		assertTrue(activity.getGroups().contains(getFixture()));

		getFixture().setActivityGroup_activity(null);

		assertSame(null, getFixture().getActivityGroup_activity());
		assertFalse(activity.getGroups().contains(getFixture()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getActivity() <em>Get Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getActivity()
	 * @generated NOT
	 */
	public void testGetActivity() {
		Activity activity = UML2Factory.eINSTANCE.createActivity();

		activity.getGroups().add(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getActivity());

		activity.getGroups().remove(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setActivity(Activity) <em>Set Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#setActivity(Activity)
	 * @generated NOT
	 */
	public void testSetActivity__Activity() {
		getFixture().setActivity(UML2Factory.eINSTANCE.createActivity());

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());

		getFixture().setActivity(null);

		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubgroups()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getSuperGroup(), getFixture().getOwner());

		UML2Factory.eINSTANCE.createActivity().getGroups().add(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperGroup() <em>Get Super Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperGroup()
	 * @generated NOT
	 */
	public void testGetSuperGroup() {
		getFixture().setSuperPartition(UML2Factory.eINSTANCE.createActivityPartition());

		assertSame(getFixture().getSuperPartition(), getFixture().getSuperGroup());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		// TODO implement setUpNamespace
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createActivityPartition().getSubgroups().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getSubgroups().add(UML2Factory.eINSTANCE.createActivityPartition());
		getFixture().getSubgroups().add(UML2Factory.eINSTANCE.createActivityPartition());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ActivityGroupImplTest#testGetSubgroups()
	 */
	public void testGetSubgroups() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getActivityGroup()).iterator(); eAllSubClasses.hasNext();) {
			ActivityGroup activityGroup = (ActivityGroup) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			try {
				getFixture().getSubgroups().add(activityGroup);

				assertTrue(getFixture().getSubgroups().contains(activityGroup));
			} catch (Exception e) {
				assertFalse(ActivityPartition.class.isInstance(activityGroup));
			}
		}
	}

} //ActivityPartitionImplTest
