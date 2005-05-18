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
 * $Id: LiteralIntegerTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LiteralInteger#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.LiteralInteger#isComputable() <em>Is Computable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LiteralIntegerTest extends LiteralSpecificationTest {

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
		TestRunner.run(LiteralIntegerTest.class);
	}

	/**
	 * Constructs a new Literal Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralIntegerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralInteger getFixture() {
		return (LiteralInteger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createLiteralInteger());
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
	 * Tests the '{@link org.eclipse.uml2.LiteralInteger#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.LiteralInteger#isComputable()
	 * @generated
	 */
	public void testIsComputableGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testIsComputable() {
		testIsComputableGen();
		
		assertTrue(getFixture().isComputable());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.LiteralInteger#integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.LiteralInteger#integerValue()
	 * @generated
	 */
	public void testIntegerValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIntegerValue() {
		testIntegerValueGen();
		
		getFixture().setValue(Integer.MIN_VALUE);
		assertEquals(Integer.MIN_VALUE, getFixture().integerValue());

		getFixture().setValue(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, getFixture().integerValue());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ValueSpecificationImplTest#testStringValue()
	 */
	public void testStringValue() {
		getFixture().setValue(Integer.MIN_VALUE);
		assertEquals(String.valueOf(Integer.MIN_VALUE), getFixture().stringValue());

		getFixture().setValue(Integer.MAX_VALUE);
		assertEquals(String.valueOf(Integer.MAX_VALUE), getFixture().stringValue());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		// TODO implement setUpNamespace
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

} //LiteralIntegerImplTest
