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
 * $Id: ActivityNodeTest.java,v 1.3 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ActivityNodeTest extends RedefinableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	private ActivityNode getFixture() {
		return (ActivityNode)fixture;
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityNode#getInGroups() <em>In Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityNode#getInGroups()
	 * @generated
	 */
	public void testGetInGroupsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetInGroups() {
		testGetInGroupsGen();
		
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
	 * Tests the '{@link org.eclipse.uml2.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getActivity()) {
			assertSame(getFixture().getActivity(), getFixture().getOwner());
		}
	}

	/* (non-Javadoc)
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
