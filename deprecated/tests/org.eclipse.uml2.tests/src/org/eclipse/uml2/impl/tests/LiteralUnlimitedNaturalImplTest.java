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
 * $Id: LiteralUnlimitedNaturalImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Unlimited Natural</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl#unlimitedValue() <em>Unlimited Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LiteralUnlimitedNaturalImplTest extends LiteralSpecificationImplTest {

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
		TestRunner.run(LiteralUnlimitedNaturalImplTest.class);
	}

	/**
	 * Constructs a new Literal Unlimited Natural test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNaturalImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Unlimited Natural test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralUnlimitedNaturalImpl getFixture() {
		return (LiteralUnlimitedNaturalImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((LiteralUnlimitedNaturalImpl) UML2Factory.eINSTANCE.createLiteralUnlimitedNatural());
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
	 * Tests the '{@link org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl#isComputable()
	 * @generated NOT
	 */
	public void testIsComputable() {
		assertTrue(getFixture().isComputable());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl#unlimitedValue() <em>Unlimited Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LiteralUnlimitedNaturalImpl#unlimitedValue()
	 * @generated NOT
	 */
	public void testUnlimitedValue() {
		getFixture().setValue(0);
		assertEquals(0, getFixture().unlimitedValue());

		getFixture().setValue(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, getFixture().unlimitedValue());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ValueSpecificationImplTest#testStringValue()
	 */
	public void testStringValue() {
		getFixture().setValue(0);
		assertEquals(String.valueOf(0), getFixture().stringValue());

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

} //LiteralUnlimitedNaturalImplTest
