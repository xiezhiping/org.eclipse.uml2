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
 * $Id: ActivityNodeImplTest.java,v 1.1 2004/04/29 14:56:46 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ActivityNodeImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getInGroups() <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getActivity() <em>Activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityNodeImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ActivityNodeImplTest extends RedefinableElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Activity Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityNodeImpl getFixture() {
		return (ActivityNodeImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityNodeImpl#getInGroups() <em>In Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityNodeImpl#getInGroups()
	 * @generated NOT
	 */
	public void testGetInGroups() {
		getFixture().setInStructuredNode(UML2Factory.eINSTANCE.createStructuredActivityNode());

		getFixture().getInPartitions().add(UML2Factory.eINSTANCE.createActivityPartition());
		getFixture().getInPartitions().add(UML2Factory.eINSTANCE.createActivityPartition());

		getFixture().getInInterruptibleRegions().add(UML2Factory.eINSTANCE.createInterruptibleActivityRegion());
		getFixture().getInInterruptibleRegions().add(UML2Factory.eINSTANCE.createInterruptibleActivityRegion());

		assertTrue(getFixture().getInGroups().contains(getFixture().getInStructuredNode()));

		assertTrue(getFixture().getInGroups().containsAll(getFixture().getInPartitions()));

		assertTrue(getFixture().getInGroups().containsAll(getFixture().getInInterruptibleRegions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityNodeImpl#getActivity() <em>Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityNodeImpl#getActivity()
	 * @generated
	 */
	public void testGetActivity() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityNodeImpl#setActivity() <em>Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityNodeImpl#setActivity()
	 * @generated
	 */
	public void testSetActivity() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActivityNodeImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActivityNodeImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getActivity()) {
			assertSame(getFixture().getActivity(), getFixture().getOwner());
		}
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.RedefinableElementImplTest#testGetRedefinedElements()
	 */
	public void testGetRedefinedElements() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getRedefinableElement()).iterator(); eAllSubClasses.hasNext();) {
			RedefinableElement redefinableElement = (RedefinableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			try {
				getFixture().getRedefinedElements().add(redefinableElement);

				assertTrue(getFixture().getRedefinedElements().contains(redefinableElement));
			} catch (Exception e) {
				assertFalse(ActivityNode.class.isInstance(redefinableElement));
			}
		}
	}

} //ActivityNodeImplTest
