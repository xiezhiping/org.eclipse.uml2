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
 * $Id: TimeTriggerImplTest.java,v 1.3 2004/10/01 19:28:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.TimeTriggerImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TimeTriggerImpl#isRelative() <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TimeTriggerImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimeTriggerImplTest extends TriggerImplTest {

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
		TestRunner.run(TimeTriggerImplTest.class);
	}

	/**
	 * Constructs a new Time Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTriggerImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeTriggerImpl getFixture() {
		return (TimeTriggerImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TimeTriggerImpl) UML2Factory.eINSTANCE.createTimeTrigger());
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
	 * Tests the '{@link org.eclipse.uml2.impl.TimeTriggerImpl#isRelative() <em>Is Relative</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TimeTriggerImpl#isRelative()
	 * @generated
	 */
	public void testIsRelative() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TimeTriggerImpl#setIsRelative() <em>Is Relative</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TimeTriggerImpl#setIsRelative()
	 * @generated
	 */
	public void testSetIsRelative() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TimeTriggerImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TimeTriggerImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getWhen()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setWhen(UML2Factory.eINSTANCE.createTimeExpression());
	}

} //TimeTriggerImplTest
