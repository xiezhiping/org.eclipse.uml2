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
 * $Id: LiteralUnlimitedNaturalTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Unlimited Natural</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LiteralUnlimitedNatural#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.LiteralUnlimitedNatural#unlimitedValue() <em>Unlimited Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LiteralUnlimitedNaturalTest extends LiteralSpecificationTest {

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
		TestRunner.run(LiteralUnlimitedNaturalTest.class);
	}

	/**
	 * Constructs a new Literal Unlimited Natural test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNaturalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Unlimited Natural test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralUnlimitedNatural getFixture() {
		return (LiteralUnlimitedNatural)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createLiteralUnlimitedNatural());
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
	 * Tests the '{@link org.eclipse.uml2.LiteralUnlimitedNatural#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.LiteralUnlimitedNatural#isComputable()
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
	 * Tests the '{@link org.eclipse.uml2.LiteralUnlimitedNatural#unlimitedValue() <em>Unlimited Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.LiteralUnlimitedNatural#unlimitedValue()
	 * @generated
	 */
	public void testUnlimitedValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testUnlimitedValue() {
		testUnlimitedValueGen();
		
		getFixture().setValue(0);
		assertEquals(0, getFixture().unlimitedValue());

		getFixture().setValue(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, getFixture().unlimitedValue());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ValueSpecificationImplTest#testStringValue()
	 */
	public void testStringValue() {
		getFixture().setValue(0);
		assertEquals(String.valueOf(0), getFixture().stringValue());

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

} //LiteralUnlimitedNaturalImplTest
