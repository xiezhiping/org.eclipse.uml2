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
 * $Id: PortImplTest.java,v 1.4 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.PortImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#isBehavior() <em>Is Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#isService() <em>Is Service</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getRequireds() <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getProvideds() <em>Provided</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PortImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PortImplTest extends PropertyImplTest {

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
		TestRunner.run(PortImplTest.class);
	}

	/**
	 * Constructs a new Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortImpl getFixture() {
		return (PortImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((PortImpl) UML2Factory.eINSTANCE.createPort());
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
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#isBehavior() <em>Is Behavior</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#isBehavior()
	 * @generated
	 */
	public void testIsBehavior() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#setIsBehavior() <em>Is Behavior</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#setIsBehavior()
	 * @generated
	 */
	public void testSetIsBehavior() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#isService() <em>Is Service</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#isService()
	 * @generated
	 */
	public void testIsService() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#setIsService() <em>Is Service</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#setIsService()
	 * @generated
	 */
	public void testSetIsService() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#getRequireds() <em>Required</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#getRequireds()
	 * @generated
	 */
	public void testGetRequireds() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#getProvideds() <em>Provided</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#getProvideds()
	 * @generated
	 */
	public void testGetProvideds() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PortImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PortImpl#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedPorts()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.RedefinableElementImplTest#setUpRedefinedElements()
	 */
	protected void setUpRedefinedElements() {
		super.setUpRedefinedElements();

		getFixture().getRedefinedPorts().add(UML2Factory.eINSTANCE.createPort());
		getFixture().getRedefinedPorts().add(UML2Factory.eINSTANCE.createPort());
	}

} //PortImplTest
