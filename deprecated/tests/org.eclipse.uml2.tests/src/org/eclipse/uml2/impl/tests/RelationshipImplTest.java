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
 * $Id: RelationshipImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.impl.RelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RelationshipImpl#getRelatedElements() <em>Related Element</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class RelationshipImplTest extends ElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationshipImpl getFixture() {
		return (RelationshipImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RelationshipImpl#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RelationshipImpl#getRelatedElements()
	 * @generated
	 */
	public void testGetRelatedElementsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetRelatedElements() {
		testGetRelatedElementsGen();

		for (Iterator relatedElements = getFixture().getRelatedElements().iterator(); relatedElements.hasNext();) {
			assertTrue(Element.class.isInstance(relatedElements.next()));
		}
	}

} //RelationshipImplTest
