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
 * $Id: ExtendImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ExtendImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getRelatedElements() <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getSources() <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getTargets() <em>Target</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getRelatedElements() <em>Get Related Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtendImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExtendImplTest extends NamedElementImplTest {

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
		TestRunner.run(ExtendImplTest.class);
	}

	/**
	 * Constructs a new Extend test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extend test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExtendImpl getFixture() {
		return (ExtendImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ExtendImpl) UML2Factory.eINSTANCE.createExtend());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ExtendImpl#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtendImpl#getRelatedElements()
	 * @generated NOT
	 */
	public void testGetRelatedElements() {
		setUpSources();
		setUpTargets();

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getSources()));
		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getTargets()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ExtendImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtendImpl#getTargets()
	 * @generated NOT
	 */
	public void testGetTargets() {
		setUpTargets();

		assertFalse(getFixture().getTargets().isEmpty());
		assertTrue(getFixture().getTargets().contains(getFixture().getExtendedCase()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ExtendImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtendImpl#getSources()
	 * @generated NOT
	 */
	public void testGetSources() {
		setUpSources();

		assertFalse(getFixture().getSources().isEmpty());
		assertTrue(getFixture().getSources().contains(getFixture().getExtension()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ExtendImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ExtendImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getCondition()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createUseCase().getExtends().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpSources()
	 */
	protected void setUpSources() {
		setUpOwner();
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		getFixture().setExtendedCase(UML2Factory.eINSTANCE.createUseCase());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setCondition(UML2Factory.eINSTANCE.createConstraint());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createUseCase().getExtends().add(getFixture());
	}

} //ExtendImplTest
