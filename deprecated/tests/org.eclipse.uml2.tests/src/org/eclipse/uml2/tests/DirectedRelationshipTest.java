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
 * $Id: DirectedRelationshipTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class DirectedRelationshipTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Directed Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Directed Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DirectedRelationship getFixture() {
		return (DirectedRelationship)fixture;
	}


	public void testGetSources() {
		setUpSources();

		assertFalse(getFixture().getSources().isEmpty());
	}

	public void testGetTargets() {
		setUpTargets();

		assertFalse(getFixture().getTargets().isEmpty());
	}

	public void testGetRelatedElements() {
		setUpSources();
		setUpTargets();

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getSources()));
		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getTargets()));
	}

	protected abstract void setUpSources();

	protected abstract void setUpTargets();

} //DirectedRelationshipImplTest
