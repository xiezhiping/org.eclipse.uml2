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
 * $Id: DurationIntervalImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;

import org.eclipse.uml2.impl.DurationIntervalImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duration Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationIntervalImpl#getMins() <em>Get Mins</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DurationIntervalImpl#getMaxes() <em>Get Maxes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DurationIntervalImplTest extends IntervalImplTest {

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
		TestRunner.run(DurationIntervalImplTest.class);
	}

	/**
	 * Constructs a new Duration Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationIntervalImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duration Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DurationIntervalImpl getFixture() {
		return (DurationIntervalImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DurationIntervalImpl) UML2Factory.eINSTANCE.createDurationInterval());
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
	 * Tests the '{@link org.eclipse.uml2.impl.DurationIntervalImpl#getMins() <em>Get Mins</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DurationIntervalImpl#getMins()
	 * @generated
	 */
	public void testGetMins() {
		// TODO: implement this getter operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DurationIntervalImpl#getMaxes() <em>Get Maxes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DurationIntervalImpl#getMaxes()
	 * @generated
	 */
	public void testGetMaxes() {
		// TODO: implement this getter operation test method
	}

} //DurationIntervalImplTest
