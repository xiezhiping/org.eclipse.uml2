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
 * $Id: ActivityPartitionTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityPartition;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityPartitionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityPartitionTest.class);
	}

	/**
	 * Constructs a new Activity Partition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Partition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityPartition getFixture() {
		return (ActivityPartition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createActivityPartition());
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

		assertSame(getFixture().getSuperGroup(), getFixture().getOwner());

		UML2Factory.eINSTANCE.createActivity().getGroups().add(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
	}

	public void testGetSuperGroup() {
		getFixture().setSuperPartition(UML2Factory.eINSTANCE.createActivityPartition());

		assertSame(getFixture().getSuperPartition(), getFixture().getSuperGroup());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		// TODO implement setUpNamespace
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createActivityPartition().getSubgroups().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getSubgroups().add(UML2Factory.eINSTANCE.createActivityPartition());
		getFixture().getSubgroups().add(UML2Factory.eINSTANCE.createActivityPartition());
	}

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
