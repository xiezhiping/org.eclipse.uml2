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
 * $Id: AcceptCallActionImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.AcceptCallActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AcceptCallActionImpl#getTriggers() <em>Get Triggers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AcceptCallActionImpl#getOutputs() <em>Get Outputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AcceptCallActionImplTest extends AcceptEventActionImplTest {

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
		TestRunner.run(AcceptCallActionImplTest.class);
	}

	/**
	 * Constructs a new Accept Call Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Accept Call Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AcceptCallActionImpl getFixture() {
		return (AcceptCallActionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((AcceptCallActionImpl) UML2Factory.eINSTANCE.createAcceptCallAction());
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
	 * Tests the '{@link org.eclipse.uml2.impl.AcceptCallActionImpl#getTriggers() <em>Get Triggers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AcceptCallActionImpl#getTriggers()
	 * @generated
	 */
	public void testGetTriggers() {
		// TODO: implement this getter operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.AcceptCallActionImpl#getOutputs() <em>Get Outputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.AcceptCallActionImpl#getOutputs()
	 * @generated
	 */
	public void testGetOutputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOutputs() {
		testGetOutputsGen();
		
		super.testGetOutputs();

		assertTrue(getFixture().getOutputs().contains(getFixture().getReturnInformation()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpOutputs()
	 */
	protected void setUpOutputs() {
		super.setUpOutputs();

		getFixture().setReturnInformation(UML2Factory.eINSTANCE.createOutputPin());
	}

} //AcceptCallActionImplTest
