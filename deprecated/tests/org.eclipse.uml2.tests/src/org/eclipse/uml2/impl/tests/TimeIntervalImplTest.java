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
 * $Id: TimeIntervalImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.TimeExpression;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.impl.TimeIntervalImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TimeIntervalImpl#getMaxes() <em>Get Maxes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TimeIntervalImpl#getMins() <em>Get Mins</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimeIntervalImplTest extends IntervalImplTest {

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
		TestRunner.run(TimeIntervalImplTest.class);
	}

	/**
	 * Constructs a new Time Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeIntervalImpl getFixture() {
		return (TimeIntervalImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TimeIntervalImpl) UML2Factory.eINSTANCE.createTimeInterval());
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
	 * Tests the '{@link org.eclipse.uml2.impl.TimeIntervalImpl#getMaxes() <em>Get Maxes</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TimeIntervalImpl#getMaxes()
	 * @generated
	 */
	public void testGetMaxesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetMaxes() {
		testGetMaxesGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getValueSpecification()).iterator(); eAllSubClasses.hasNext();) {
			ValueSpecification valueSpecification = (ValueSpecification) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			try {
				getFixture().getMaxes().add(valueSpecification);

				assertTrue(getFixture().getMaxes().contains(valueSpecification));
			} catch (Exception e) {
				assertFalse(TimeExpression.class.isInstance(valueSpecification));
			}
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TimeIntervalImpl#getMins() <em>Get Mins</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TimeIntervalImpl#getMins()
	 * @generated
	 */
	public void testGetMinsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetMins() {
		testGetMinsGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getValueSpecification()).iterator(); eAllSubClasses.hasNext();) {
			ValueSpecification valueSpecification = (ValueSpecification) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			try {
				getFixture().getMins().add(valueSpecification);

				assertTrue(getFixture().getMins().contains(valueSpecification));
			} catch (Exception e) {
				assertFalse(TimeExpression.class.isInstance(valueSpecification));
			}
		}
	}

} //TimeIntervalImplTest
