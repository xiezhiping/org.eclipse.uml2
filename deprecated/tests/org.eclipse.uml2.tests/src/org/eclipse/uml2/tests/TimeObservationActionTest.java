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
 * $Id: TimeObservationActionTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.TimeObservationAction;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Observation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TimeObservationAction#getValue() <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.TimeObservationAction#setValue(org.eclipse.uml2.InputPin) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimeObservationActionTest extends WriteStructuralFeatureActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeObservationActionTest.class);
	}

	/**
	 * Constructs a new Time Observation Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservationActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Observation Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeObservationAction getFixture() {
		return (TimeObservationAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createTimeObservationAction());
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
	 * Tests the '{@link org.eclipse.uml2.TimeObservationAction#getValue() <em>Get Value</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TimeObservationAction#getValue()
	 * @generated
	 */
	public void testGetValueGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetValue() {
		testGetValueGen();
		
		assertNull(getFixture().getValue());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.TimeObservationAction#setValue(org.eclipse.uml2.InputPin) <em>Set Value</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TimeObservationAction#setValue(org.eclipse.uml2.InputPin)
	 * @generated
	 */
	public void testSetValueGen() {
		// TODO: implement this setter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetValue() {
		testSetValueGen();
		
		try {
			getFixture().setValue(UML2Factory.eINSTANCE.createInputPin());
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		getFixture().setObject(UML2Factory.eINSTANCE.createInputPin());

		getFixture().getNows().add(UML2Factory.eINSTANCE.createTimeExpression());
		getFixture().getNows().add(UML2Factory.eINSTANCE.createTimeExpression());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#testGetInputs()
	 */
	public void testGetInputs() {
		super.testGetInputs();

		assertTrue(getFixture().getInputs().containsAll(getFixture().getNows()));
	}

} //TimeObservationActionImplTest
