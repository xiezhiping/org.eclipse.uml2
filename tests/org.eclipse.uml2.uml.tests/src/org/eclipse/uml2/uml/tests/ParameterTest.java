/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefault() <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getOperation() <em>Operation</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Is Integer</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Is Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement) <em>Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#is(int, int) <em>Is</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateInAndOut(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In And Out</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateNotException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateConnectorEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connector End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reentrant Behaviors</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateStreamAndException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stream And Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateObjectEffect(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Object Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setNullDefaultValue() <em>Set Null Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setRealDefaultValue(double) <em>Set Real Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ParameterTest
		extends ConnectableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterTest.class);
	}

	/**
	 * Constructs a new Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Parameter getFixture() {
		return (Parameter) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Upper</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public void testGetUpper() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#setUpper(int) <em>Upper</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setUpper(int)
	 * @generated
	 */
	public void testSetUpper() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Lower</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public void testGetLower() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#setLower(int) <em>Lower</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setLower(int)
	 * @generated
	 */
	public void testSetLower() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#getOperation() <em>Operation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#getOperation()
	 * @generated
	 */
	public void testGetOperation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#getDefault() <em>Default</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#getDefault()
	 * @generated
	 */
	public void testGetDefault() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setDefault(java.lang.String) <em>Default</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setDefault(java.lang.String)
	 * @generated
	 */
	public void testSetDefault() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#unsetDefault() <em>unsetDefault()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#unsetDefault()
	 * @generated
	 */
	public void testUnsetDefault() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#isSetDefault() <em>isSetDefault()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#isSetDefault()
	 * @generated
	 */
	public void testIsSetDefault() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerGe0__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperGeLower__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateValueSpecificationNoSideEffects__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateValueSpecificationConstant__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Is Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerIsInteger__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Is Unlimited Natural</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperIsUnlimitedNatural__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public void testIsMultivalued() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement)
	 * @generated
	 */
	public void testIncludesMultiplicity__MultiplicityElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public void testLowerBound() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#upperBound()
	 * @generated
	 */
	public void testUpperBound() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement) <em>Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement)
	 * @generated
	 */
	public void testCompatibleWith__MultiplicityElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#is(int, int) <em>Is</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#is(int, int)
	 * @generated
	 */
	public void testIs__int_int() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#validateConnectorEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connector End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#validateConnectorEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateConnectorEnd__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#validateStreamAndException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stream And Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#validateStreamAndException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateStreamAndException__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#validateObjectEffect(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Object Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#validateObjectEffect(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateObjectEffect__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#validateNotException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#validateNotException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNotException__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reentrant Behaviors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateReentrantBehaviors__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#validateInAndOut(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In And Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#validateInAndOut(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInAndOut__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setBooleanDefaultValue(boolean)
	 * @generated NOT
	 */
	public void testSetBooleanDefaultValue__boolean() {
		assertNull(getFixture().getDefaultValue());

		getFixture().setBooleanDefaultValue(true);

		ValueSpecification defaultValue = getFixture().getDefaultValue();

		assertTrue(defaultValue instanceof LiteralBoolean);
		assertEquals(true, ((LiteralBoolean) defaultValue).isValue());

		getFixture().setBooleanDefaultValue(false);

		assertSame(defaultValue, getFixture().getDefaultValue());
		assertEquals(false, ((LiteralBoolean) defaultValue).isValue());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setIntegerDefaultValue(int)
	 * @generated NOT
	 */
	public void testSetIntegerDefaultValue__int() {
		assertNull(getFixture().getDefaultValue());

		getFixture().setIntegerDefaultValue(Integer.MIN_VALUE);

		ValueSpecification defaultValue = getFixture().getDefaultValue();

		assertTrue(defaultValue instanceof LiteralInteger);
		assertEquals(Integer.MIN_VALUE,
			((LiteralInteger) defaultValue).getValue());

		getFixture().setIntegerDefaultValue(Integer.MAX_VALUE);

		assertSame(defaultValue, getFixture().getDefaultValue());
		assertEquals(Integer.MAX_VALUE,
			((LiteralInteger) defaultValue).getValue());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setStringDefaultValue(java.lang.String)
	 * @generated NOT
	 */
	public void testSetStringDefaultValue__String() {
		assertNull(getFixture().getDefaultValue());

		getFixture().setStringDefaultValue(getName());

		ValueSpecification defaultValue = getFixture().getDefaultValue();

		assertTrue(defaultValue instanceof LiteralString);
		assertEquals(getName(), ((LiteralString) defaultValue).getValue());

		getFixture().setStringDefaultValue(null);

		assertSame(defaultValue, getFixture().getDefaultValue());
		assertNull(((LiteralString) defaultValue).getValue());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setUnlimitedNaturalDefaultValue(int)
	 * @generated NOT
	 */
	public void testSetUnlimitedNaturalDefaultValue__int() {
		assertNull(getFixture().getDefaultValue());

		getFixture().setUnlimitedNaturalDefaultValue(
			LiteralUnlimitedNatural.UNLIMITED);

		ValueSpecification defaultValue = getFixture().getDefaultValue();

		assertTrue(defaultValue instanceof LiteralUnlimitedNatural);
		assertEquals(LiteralUnlimitedNatural.UNLIMITED,
			((LiteralUnlimitedNatural) defaultValue).getValue());

		getFixture().setUnlimitedNaturalDefaultValue(0);

		assertSame(defaultValue, getFixture().getDefaultValue());
		assertEquals(0, ((LiteralUnlimitedNatural) defaultValue).getValue());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setNullDefaultValue() <em>Set Null Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setNullDefaultValue()
	 * @generated NOT
	 */
	public void testSetNullDefaultValue() {
		assertNull(getFixture().getDefaultValue());

		getFixture().setNullDefaultValue();

		ValueSpecification defaultValue = getFixture().getDefaultValue();

		assertTrue(defaultValue instanceof LiteralNull);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Parameter#setRealDefaultValue(double) <em>Set Real Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Parameter#setRealDefaultValue(double)
	 * @generated
	 */
	public void testSetRealDefaultValue__double() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ParameterTest
