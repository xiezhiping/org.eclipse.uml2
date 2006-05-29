/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ValueSpecificationTest.java,v 1.4 2006/05/29 17:27:33 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#booleanValue() <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#unlimitedValue() <em>Unlimited Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#isNull() <em>Is Null</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ValueSpecificationTest extends TypedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Value Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ValueSpecification getFixture() {
		return (ValueSpecification)fixture;
	}

	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ValueSpecification#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ValueSpecification#isComputable()
	 * @generated
	 */
	public void testIsComputableGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsComputable() {
		testIsComputableGen();
		
		assertFalse(getFixture().isComputable());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ValueSpecification#integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ValueSpecification#integerValue()
	 * @generated
	 */
	public void testIntegerValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIntegerValue() {
		testIntegerValueGen();
		
		try {
			getFixture().integerValue();
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ValueSpecification#booleanValue() <em>Boolean Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ValueSpecification#booleanValue()
	 * @generated
	 */
	public void testBooleanValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testBooleanValue() {
		testBooleanValueGen();
		
		try {
			getFixture().booleanValue();
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ValueSpecification#stringValue() <em>String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ValueSpecification#stringValue()
	 * @generated
	 */
	public void testStringValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testStringValue() {
		testStringValueGen();
		
		assertEquals("", getFixture().stringValue()); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ValueSpecification#unlimitedValue() <em>Unlimited Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ValueSpecification#unlimitedValue()
	 * @generated
	 */
	public void testUnlimitedValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testUnlimitedValue() {
		testUnlimitedValueGen();
		
		try {
			getFixture().unlimitedValue();
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ValueSpecification#isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ValueSpecification#isNull()
	 * @generated
	 */
	public void testIsNullGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testIsNull() {
		testIsNullGen();
		
		assertFalse(getFixture().isNull());
	}

} //ValueSpecificationImplTest
