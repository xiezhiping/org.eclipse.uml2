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
 * $Id: DirectedRelationshipImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.impl.DirectedRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getSources() <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getTargets() <em>Target</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getRelatedElements() <em>Get Related Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class DirectedRelationshipImplTest extends RelationshipImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Directed Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationshipImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Directed Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DirectedRelationshipImpl getFixture() {
		return (DirectedRelationshipImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getSources() <em>Source</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DirectedRelationshipImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		setUpSources();

		assertFalse(getFixture().getSources().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getTargets() <em>Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DirectedRelationshipImpl#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		setUpTargets();

		assertFalse(getFixture().getTargets().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getRelatedElements() <em>Get Related Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DirectedRelationshipImpl#getRelatedElements()
	 * @generated
	 */
	public void testGetRelatedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetRelatedElements() {
		testGetRelatedElementsGen();
		
		setUpSources();
		setUpTargets();

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getSources()));
		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getTargets()));
	}

	protected abstract void setUpSources();

	protected abstract void setUpTargets();

} //DirectedRelationshipImplTest
