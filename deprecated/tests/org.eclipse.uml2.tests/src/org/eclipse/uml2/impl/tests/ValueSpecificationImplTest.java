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
 * $Id: ValueSpecificationImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.impl.ValueSpecificationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#getOwningParameter() <em>Owning Parameter</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#booleanValue() <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#unlimitedValue() <em>Unlimited Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ValueSpecificationImpl#isNull() <em>Is Null</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ValueSpecificationImplTest extends TypedElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Value Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ValueSpecificationImpl getFixture() {
		return (ValueSpecificationImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#setTemplateParameter() <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#setTemplateParameter()
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#setOwningParameter() <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#setOwningParameter()
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#isComputable()
	 * @generated NOT
	 */
	public void testIsComputable() {
		assertFalse(getFixture().isComputable());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#integerValue()
	 * @generated NOT
	 */
	public void testIntegerValue() {
		try {
			getFixture().integerValue();
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#booleanValue() <em>Boolean Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#booleanValue()
	 * @generated NOT
	 */
	public void testBooleanValue() {
		try {
			getFixture().booleanValue();
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#stringValue() <em>String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#stringValue()
	 * @generated NOT
	 */
	public void testStringValue() {
		assertEquals("", getFixture().stringValue()); //$NON-NLS-1$
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#unlimitedValue() <em>Unlimited Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#unlimitedValue()
	 * @generated NOT
	 */
	public void testUnlimitedValue() {
		try {
			getFixture().unlimitedValue();
			fail();
		} catch (UnsupportedOperationException uoe) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ValueSpecificationImpl#isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ValueSpecificationImpl#isNull()
	 * @generated NOT
	 */
	public void testIsNull() {
		assertFalse(getFixture().isNull());
	}

} //ValueSpecificationImplTest
