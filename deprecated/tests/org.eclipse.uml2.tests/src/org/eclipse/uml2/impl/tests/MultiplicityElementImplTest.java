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
 * $Id: MultiplicityElementImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.MultiplicityElementImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getLower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getUpper() <em>Upper</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#includesCardinality(Integer) <em>Includes Cardinality</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#includesMultiplicity(MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperGt0() <em>Validate Upper Gt0</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateLowerGe0() <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperGeLower() <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateLowerEqLowerbound() <em>Validate Lower Eq Lowerbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperEqUpperbound() <em>Validate Upper Eq Upperbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#lower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#upper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class MultiplicityElementImplTest extends ElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Multiplicity Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElementImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multiplicity Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultiplicityElementImpl getFixture() {
		return (MultiplicityElementImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isOrdered() <em>Is Ordered</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#isOrdered()
	 * @generated NOT
	 */
	public void testIsOrdered() {
		getFixture().setIsOrdered(false);

		assertFalse(getFixture().isOrdered());

		getFixture().setIsOrdered(true);

		assertTrue(getFixture().isOrdered());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#setIsOrdered() <em>Is Ordered</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#setIsOrdered()
	 * @generated NOT
	 */
	public void testSetIsOrdered() {
		getFixture().setIsOrdered(false);

		assertEquals(false, getFixture().isOrdered());

		getFixture().setIsOrdered(true);

		assertEquals(true, getFixture().isOrdered());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isUnique() <em>Is Unique</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#isUnique()
	 * @generated NOT
	 */
	public void testIsUnique() {
		getFixture().setIsUnique(false);

		assertFalse(getFixture().isUnique());

		getFixture().setIsUnique(true);

		assertTrue(getFixture().isUnique());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#setIsUnique() <em>Is Unique</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#setIsUnique()
	 * @generated NOT
	 */
	public void testSetIsUnique() {
		getFixture().setIsUnique(false);

		assertEquals(false, getFixture().isUnique());

		getFixture().setIsUnique(true);

		assertEquals(true, getFixture().isUnique());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getLower() <em>Lower</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#getLower()
	 * @generated NOT
	 */
	public void testGetLower() {
		getFixture().setLowerValue(null);

		assertEquals(getFixture().lower(), getFixture().getLower());

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		getFixture().setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertEquals(getFixture().lower(), getFixture().getLower());

		lowerValue.setValue(Integer.MAX_VALUE);

		assertEquals(getFixture().lower(), getFixture().getLower());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getUpper() <em>Upper</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#getUpper()
	 * @generated NOT
	 */
	public void testGetUpper() {
		getFixture().setUpperValue(null);

		assertEquals(getFixture().upper(), getFixture().getUpper());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperValue);

		upperValue.setValue(0);

		assertEquals(getFixture().upper(), getFixture().getUpper());

		upperValue.setValue(Integer.MAX_VALUE);

		assertEquals(getFixture().upper(), getFixture().getUpper());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#lowerBound()
	 * @generated NOT
	 */
	public void testLowerBound() {
		getFixture().setLowerValue(null);

		assertEquals(1, getFixture().lowerBound());

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		getFixture().setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertEquals(0, getFixture().lowerBound());

		lowerValue.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().lowerBound());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#upperBound()
	 * @generated NOT
	 */
	public void testUpperBound() {
		getFixture().setUpperValue(null);

		assertEquals(1, getFixture().upperBound());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperValue);

		upperValue.setValue(0);

		assertEquals(0, getFixture().upperBound());

		upperValue.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().upperBound());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#isMultivalued()
	 * @generated NOT
	 */
	public void testIsMultivalued() {
		getFixture().setUpperValue(null);

		assertFalse(getFixture().isMultivalued());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperValue);

		upperValue.setValue(1);

		assertFalse(getFixture().isMultivalued());

		upperValue.setValue(Integer.MAX_VALUE);

		assertTrue(getFixture().isMultivalued());

		upperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		assertTrue(getFixture().isMultivalued());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#includesCardinality(Integer) <em>Includes Cardinality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#includesCardinality(Integer)
	 * @generated NOT
	 */
	public void testIncludesCardinality__Integer() {
		getFixture().setLowerValue(null);
		getFixture().setUpperValue(null);

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		getFixture().setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperValue);

		upperValue.setValue(0);

		assertFalse(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));

		upperValue.setValue(Integer.MAX_VALUE);

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));

		upperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		assertTrue(getFixture().includesCardinality(1));
		assertTrue(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));

		lowerValue.setValue(1);

		assertTrue(getFixture().includesCardinality(1));
		assertTrue(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));

		lowerValue.setValue(Integer.MAX_VALUE);

		assertFalse(getFixture().includesCardinality(1));
		assertTrue(getFixture().includesCardinality(MultiplicityElement.UNLIMITED_UPPER_BOUND));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#includesMultiplicity(MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#includesMultiplicity(MultiplicityElement)
	 * @generated NOT
	 */
	public void testIncludesMultiplicity__MultiplicityElement() {
		MultiplicityElement defaultMultiplicity = (MultiplicityElement) UML2Factory.eINSTANCE.create(getFixture().eClass());

		MultiplicityElement unboundedMultiplicity = (MultiplicityElement) UML2Factory.eINSTANCE.create(getFixture().eClass());

		LiteralInteger optionalLowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		unboundedMultiplicity.setLowerValue(optionalLowerValue);
		optionalLowerValue.setValue(0);

		LiteralUnlimitedNatural unlimitedUpperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		unboundedMultiplicity.setUpperValue(unlimitedUpperValue);
		unlimitedUpperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		getFixture().setLowerValue(null);
		getFixture().setUpperValue(null);

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		getFixture().setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperValue);

		upperValue.setValue(0);

		assertFalse(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		upperValue.setValue(Integer.MAX_VALUE);

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		upperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertTrue(getFixture().includesMultiplicity(unboundedMultiplicity));

		lowerValue.setValue(1);

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		lowerValue.setValue(Integer.MAX_VALUE);

		assertFalse(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperGt0() <em>Validate Upper Gt0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperGt0()
	 * @generated
	 */
	public void testValidateUpperGt0() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateLowerGe0() <em>Validate Lower Ge0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#validateLowerGe0()
	 * @generated
	 */
	public void testValidateLowerGe0() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperGeLower() <em>Validate Upper Ge Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperGeLower()
	 * @generated
	 */
	public void testValidateUpperGeLower() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateLowerEqLowerbound() <em>Validate Lower Eq Lowerbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#validateLowerEqLowerbound()
	 * @generated
	 */
	public void testValidateLowerEqLowerbound() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperEqUpperbound() <em>Validate Upper Eq Upperbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#validateUpperEqUpperbound()
	 * @generated
	 */
	public void testValidateUpperEqUpperbound() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#lower()
	 * @generated NOT
	 */
	public void testLower() {
		getFixture().setLowerValue(null);

		assertEquals(getFixture().lowerBound(), getFixture().lower());

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		getFixture().setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertEquals(getFixture().lowerBound(), getFixture().lower());

		lowerValue.setValue(Integer.MAX_VALUE);

		assertEquals(getFixture().lowerBound(), getFixture().lower());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#upper()
	 * @generated NOT
	 */
	public void testUpper() {
		getFixture().setUpperValue(null);

		assertEquals(getFixture().upperBound(), getFixture().upper());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperValue);

		upperValue.setValue(0);

		assertEquals(getFixture().upperBound(), getFixture().upper());

		upperValue.setValue(Integer.MAX_VALUE);

		assertEquals(getFixture().upperBound(), getFixture().upper());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.MultiplicityElementImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getLowerValue()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getUpperValue()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setLowerValue(UML2Factory.eINSTANCE.createLiteralInteger());

		getFixture().setUpperValue(UML2Factory.eINSTANCE.createLiteralUnlimitedNatural());
	}

} //MultiplicityElementImplTest
