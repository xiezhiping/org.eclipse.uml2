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
 * $Id: DurationObservationActionTest.java,v 1.1 2005/04/04 20:06:06 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.DurationObservationAction;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DurationObservationAction#getValue() <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.DurationObservationAction#setValue(InputPin) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DurationObservationActionTest extends WriteStructuralFeatureActionTest {

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
		TestRunner.run(DurationObservationActionTest.class);
	}

	/**
	 * Constructs a new Duration Observation Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservationActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duration Observation Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DurationObservationAction getFixture() {
		return (DurationObservationAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createDurationObservationAction());
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
	 * Tests the '{@link org.eclipse.uml2.DurationObservationAction#getValue() <em>Get Value</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DurationObservationAction#getValue()
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
	 * Tests the '{@link org.eclipse.uml2.DurationObservationAction#setValue(InputPin) <em>Set Value</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DurationObservationAction#setValue(InputPin)
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

		getFixture().getDurations().add(UML2Factory.eINSTANCE.createDuration());
		getFixture().getDurations().add(UML2Factory.eINSTANCE.createDuration());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#testGetInputs()
	 */
	public void testGetInputs() {
		super.testGetInputs();

		assertTrue(getFixture().getInputs().containsAll(getFixture().getDurations()));
	}

} //DurationObservationActionImplTest
