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
 * $Id: ActivityPartitionImplTest.java,v 1.3 2004/10/01 19:28:30 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#isDimension() <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityPartitionImpl#isExternal() <em>Is External</em>}</li>
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setActivityGroup_activity() <em>Activity Group activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#setActivityGroup_activity()
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#isDimension() <em>Is Dimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#isDimension()
	 * @generated
	 */
	public void testIsDimension() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setIsDimension() <em>Is Dimension</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#setIsDimension()
	 * @generated
	 */
	public void testSetIsDimension() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#isExternal() <em>Is External</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#isExternal()
	 * @generated
	 */
	public void testIsExternal() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setIsExternal() <em>Is External</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#setIsExternal()
	 * @generated
	 */
	public void testSetIsExternal() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getActivity() <em>Get Activity</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getActivity()
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#setActivity(Activity) <em>Set Activity</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#setActivity(Activity)
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getOwnedElements()
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getSuperGroup(), getFixture().getOwner());

		UML2Factory.eINSTANCE.createActivity().getGroups().add(getFixture());

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperGroup() <em>Get Super Group</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityPartitionImpl#getSuperGroup()
	 * @generated
	 */
	public void testGetSuperGroupGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSuperGroup() {
		testGetSuperGroupGen();
		
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
