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
 * $Id: LiteralIntegerImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.LiteralIntegerImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LiteralIntegerImpl#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LiteralIntegerImpl#integerValue() <em>Integer Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LiteralIntegerImplTest extends LiteralSpecificationImplTest {

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
		TestRunner.run(LiteralIntegerImplTest.class);
	}

	/**
	 * Constructs a new Literal Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralIntegerImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralIntegerImpl getFixture() {
		return (LiteralIntegerImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((LiteralIntegerImpl) UML2Factory.eINSTANCE.createLiteralInteger());
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
	 * Tests the '{@link org.eclipse.uml2.impl.LiteralIntegerImpl#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LiteralIntegerImpl#isComputable()
	 * @generated NOT
	 */
	public void testIsComputable() {
		assertTrue(getFixture().isComputable());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.LiteralIntegerImpl#integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LiteralIntegerImpl#integerValue()
	 * @generated NOT
	 */
	public void testIntegerValue() {
		getFixture().setValue(Integer.MIN_VALUE);
		assertEquals(Integer.MIN_VALUE, getFixture().integerValue());

		getFixture().setValue(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, getFixture().integerValue());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ValueSpecificationImplTest#testStringValue()
	 */
	public void testStringValue() {
		getFixture().setValue(Integer.MIN_VALUE);
		assertEquals(String.valueOf(Integer.MIN_VALUE), getFixture().stringValue());

		getFixture().setValue(Integer.MAX_VALUE);
		assertEquals(String.valueOf(Integer.MAX_VALUE), getFixture().stringValue());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		// TODO implement setUpNamespace
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

} //LiteralIntegerImplTest
