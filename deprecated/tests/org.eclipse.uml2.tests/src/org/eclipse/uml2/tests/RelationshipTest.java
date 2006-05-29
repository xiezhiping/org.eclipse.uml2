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
 * $Id: RelationshipTest.java,v 1.3 2006/05/29 17:27:33 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.Relationship;

import java.util.Iterator;

import org.eclipse.uml2.Element;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class RelationshipTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Relationship getFixture() {
		return (Relationship)fixture;
	}


	public void testGetRelatedElements() {

		for (Iterator relatedElements = getFixture().getRelatedElements().iterator(); relatedElements.hasNext();) {
			assertTrue(Element.class.isInstance(relatedElements.next()));
		}
	}

} //RelationshipImplTest
