/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DurationObservationActionImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.DurationObservationActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationObservationActionImpl#getValue() <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DurationObservationActionImpl#setValue(InputPin) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DurationObservationActionImplTest extends WriteStructuralFeatureActionImplTest {

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
		TestRunner.run(DurationObservationActionImplTest.class);
	}

	/**
	 * Constructs a new Duration Observation Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservationActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Duration Observation Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DurationObservationActionImpl getFixture() {
		return (DurationObservationActionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DurationObservationActionImpl) UML2Factory.eINSTANCE.createDurationObservationAction());
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
	 * Tests the '{@link org.eclipse.uml2.impl.DurationObservationActionImpl#getValue() <em>Get Value</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DurationObservationActionImpl#getValue()
	 * @generated
	 */
	public void testGetValueGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetValue() {
		testGetValueGen();
		
		assertNull(getFixture().getValue());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DurationObservationActionImpl#setValue(InputPin) <em>Set Value</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DurationObservationActionImpl#setValue(InputPin)
	 * @generated
	 */
	public void testSetValue__InputPinGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetValue__InputPin() {
		testSetValue__InputPinGen();
		
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
