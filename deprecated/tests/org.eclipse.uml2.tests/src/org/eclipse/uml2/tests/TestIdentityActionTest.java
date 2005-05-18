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
 * $Id: TestIdentityActionTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.TestIdentityAction;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestIdentityActionTest extends ActionTest {

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
		TestRunner.run(TestIdentityActionTest.class);
	}

	/**
	 * Constructs a new Test Identity Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Identity Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TestIdentityAction getFixture() {
		return (TestIdentityAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createTestIdentityAction());
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
	 * Tests the '{@link org.eclipse.uml2.Action#getInputs() <em>Input</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Action#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		assertTrue(getFixture().getInputs().contains(getFixture().getFirst()));
		assertTrue(getFixture().getInputs().contains(getFixture().getSecond()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Action#getOutputs() <em>Output</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Action#getOutputs()
	 * @generated
	 */
	public void testGetOutputsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetOutputs() {
		testGetOutputsGen();
		
		super.testGetOutputs();

		assertTrue(getFixture().getOutputs().contains(getFixture().getResult()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setFirst(UML2Factory.eINSTANCE.createInputPin());

		getFixture().setSecond(UML2Factory.eINSTANCE.createInputPin());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpOutputs()
	 */
	protected void setUpOutputs() {
		super.setUpOutputs();

		getFixture().setResult(UML2Factory.eINSTANCE.createOutputPin());
	}

} //TestIdentityActionImplTest
