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
 * $Id: ActivityEdgeTest.java,v 1.1 2005/04/04 20:06:07 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getInGroups() <em>In Group</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ActivityEdgeTest extends RedefinableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Activity Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityEdge getFixture() {
		return (ActivityEdge)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityEdge#getInGroups() <em>In Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityEdge#getInGroups()
	 * @generated
	 */
	public void testGetInGroupsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetInGroups() {
		testGetInGroupsGen();
		
		getFixture().setInStructuredNode(UML2Factory.eINSTANCE.createStructuredActivityNode());

		getFixture().getInPartitions().add(UML2Factory.eINSTANCE.createActivityPartition());
		getFixture().getInPartitions().add(UML2Factory.eINSTANCE.createActivityPartition());

		assertTrue(getFixture().getInGroups().contains(getFixture().getInStructuredNode()));

		assertTrue(getFixture().getInGroups().containsAll(getFixture().getInPartitions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityEdge#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityEdge#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getActivity()) {
			assertSame(getFixture().getActivity(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityEdge#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityEdge#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getGuard()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getWeight()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setGuard(UML2Factory.eINSTANCE.createLiteralNull());

		getFixture().setWeight(UML2Factory.eINSTANCE.createLiteralNull());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.RedefinableElementImplTest#testGetRedefinedElements()
	 */
	public void testGetRedefinedElement() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getRedefinableElement()).iterator(); eAllSubClasses.hasNext();) {
			RedefinableElement redefinableElement = (RedefinableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			try {
				getFixture().getRedefinedElements().add(redefinableElement);

				assertTrue(getFixture().getRedefinedElements().contains(redefinableElement));
			} catch (Exception e) {
				assertFalse(ActivityEdge.class.isInstance(redefinableElement));
			}
		}
	}

} //ActivityEdgeImplTest
