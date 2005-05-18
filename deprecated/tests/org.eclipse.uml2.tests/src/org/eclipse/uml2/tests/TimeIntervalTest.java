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
 * $Id: TimeIntervalTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.TimeInterval;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.TimeExpression;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeIntervalTest extends IntervalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeIntervalTest.class);
	}

	/**
	 * Constructs a new Time Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeInterval getFixture() {
		return (TimeInterval)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createTimeInterval());
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


	public void testGetMaxes() {

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

	public void testGetMins() {

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
