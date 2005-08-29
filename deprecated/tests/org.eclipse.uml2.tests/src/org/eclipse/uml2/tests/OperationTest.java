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
 * $Id: OperationTest.java,v 1.5 2005/08/29 19:23:17 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Operation#getType() <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getLower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getUpper() <em>Upper</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#includesCardinality(int) <em>Includes Cardinality</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Gt0</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Eq Lowerbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Eq Upperbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#lower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#upper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#validateTypeOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#type() <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Body For Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OperationTest extends BehavioralFeatureTest {

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
		TestRunner.run(OperationTest.class);
	}

	/**
	 * Constructs a new Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Operation getFixture() {
		return (Operation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createOperation());
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
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public void testLowerBoundGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testLowerBound() {
		testLowerBoundGen();

		getFixture().getReturnResults().clear();

		assertEquals(1, getFixture().lowerBound());

		getFixture().getReturnResults().add(
			UML2Factory.eINSTANCE.createParameter());

		assertEquals(1, getFixture().lowerBound());

		LiteralInteger lowerValue = UML2Factory.eINSTANCE
			.createLiteralInteger();
		((Parameter) getFixture().getReturnResults().get(0))
			.setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertEquals(0, getFixture().lowerBound());

		lowerValue.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().lowerBound());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#upperBound()
	 * @generated
	 */
	public void testUpperBoundGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testUpperBound() {
		testUpperBoundGen();

		getFixture().getReturnResults().clear();

		assertEquals(1, getFixture().upperBound());

		getFixture().getReturnResults().add(
			UML2Factory.eINSTANCE.createParameter());

		assertEquals(1, getFixture().upperBound());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE
			.createLiteralUnlimitedNatural();
		((Parameter) getFixture().getReturnResults().get(0))
			.setUpperValue(upperValue);

		upperValue.setValue(0);

		assertEquals(0, getFixture().upperBound());

		upperValue.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().upperBound());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public void testIsMultivaluedGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsMultivalued() {
		testIsMultivaluedGen();

		getFixture().getReturnResults().clear();

		assertFalse(getFixture().isMultivalued());

		getFixture().getReturnResults().add(
			UML2Factory.eINSTANCE.createParameter());

		assertFalse(getFixture().isMultivalued());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE
			.createLiteralUnlimitedNatural();
		((Parameter) getFixture().getReturnResults().get(0))
			.setUpperValue(upperValue);

		upperValue.setValue(1);

		assertFalse(getFixture().isMultivalued());

		upperValue.setValue(Integer.MAX_VALUE);

		assertTrue(getFixture().isMultivalued());

		upperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		assertTrue(getFixture().isMultivalued());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#includesCardinality(int) <em>Includes Cardinality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#includesCardinality(int)
	 * @generated
	 */
	public void testIncludesCardinality__intGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIncludesCardinality__int() {
		testIncludesCardinality__intGen();

		getFixture().getReturnResults().clear();

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		getFixture().getReturnResults().add(
			UML2Factory.eINSTANCE.createParameter());

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		LiteralInteger lowerValue = UML2Factory.eINSTANCE
			.createLiteralInteger();
		((Parameter) getFixture().getReturnResults().get(0))
			.setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE
			.createLiteralUnlimitedNatural();
		((Parameter) getFixture().getReturnResults().get(0))
			.setUpperValue(upperValue);

		upperValue.setValue(0);

		assertFalse(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		upperValue.setValue(Integer.MAX_VALUE);

		assertTrue(getFixture().includesCardinality(1));
		assertFalse(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		upperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		assertTrue(getFixture().includesCardinality(1));
		assertTrue(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		lowerValue.setValue(1);

		assertTrue(getFixture().includesCardinality(1));
		assertTrue(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));

		lowerValue.setValue(Integer.MAX_VALUE);

		assertFalse(getFixture().includesCardinality(1));
		assertTrue(getFixture().includesCardinality(
			MultiplicityElement.UNLIMITED_UPPER_BOUND));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.MultiplicityElement)
	 * @generated
	 */
	public void testIncludesMultiplicity__MultiplicityElementGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIncludesMultiplicity__MultiplicityElement() {
		testIncludesMultiplicity__MultiplicityElementGen();

		Operation defaultMultiplicity = (Operation) UML2Factory.eINSTANCE
			.create(getFixture().eClass());

		Operation unboundedMultiplicity = (Operation) UML2Factory.eINSTANCE
			.create(getFixture().eClass());

		unboundedMultiplicity.getReturnResults().add(
			UML2Factory.eINSTANCE.createParameter());

		LiteralInteger optionalLowerValue = UML2Factory.eINSTANCE
			.createLiteralInteger();
		((Parameter) unboundedMultiplicity.getReturnResults().get(0))
			.setLowerValue(optionalLowerValue);
		optionalLowerValue.setValue(0);

		LiteralUnlimitedNatural unlimitedUpperValue = UML2Factory.eINSTANCE
			.createLiteralUnlimitedNatural();
		((Parameter) unboundedMultiplicity.getReturnResults().get(0))
			.setUpperValue(unlimitedUpperValue);
		unlimitedUpperValue.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		getFixture().getReturnResults().clear();

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		getFixture().getReturnResults().add(
			UML2Factory.eINSTANCE.createParameter());

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		LiteralInteger lowerValue = UML2Factory.eINSTANCE
			.createLiteralInteger();
		((Parameter) getFixture().getReturnResults().get(0))
			.setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertTrue(getFixture().includesMultiplicity(defaultMultiplicity));
		assertFalse(getFixture().includesMultiplicity(unboundedMultiplicity));

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE
			.createLiteralUnlimitedNatural();
		((Parameter) getFixture().getReturnResults().get(0))
			.setUpperValue(upperValue);

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
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Gt0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperGt0__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerGe0__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperGeLower__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Eq Lowerbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerEqLowerbound__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Eq Upperbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperEqUpperbound__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getLowerValue()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getUpperValue()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#validateTypeOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#validateTypeOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTypeOfResult__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#lower()
	 * @generated
	 */
	public void testLowerGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testLower() {
		testLowerGen();
		
		getFixture().getReturnResults().clear();

		assertEquals(1, getFixture().lower());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertEquals(1, getFixture().lower());

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		((Parameter) getFixture().getReturnResults().get(0)).setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertEquals(0, getFixture().lower());

		lowerValue.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().lower());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#upper()
	 * @generated
	 */
	public void testUpperGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testUpper() {
		testUpperGen();
		
		getFixture().getReturnResults().clear();

		assertEquals(1, getFixture().upper());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertEquals(1, getFixture().upper());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		((Parameter) getFixture().getReturnResults().get(0)).setUpperValue(upperValue);

		upperValue.setValue(0);

		assertEquals(0, getFixture().upper());

		upperValue.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().upper());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#type()
	 * @generated
	 */
	public void testTypeGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testType() {
		testTypeGen();
		
		getFixture().getReturnResults().clear();

		assertNull(getFixture().type());

		Parameter returnResult = UML2Factory.eINSTANCE.createParameter();
		getFixture().getReturnResults().add(returnResult);

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Type type = (Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			returnResult.setType(type);

			assertSame(type, getFixture().type());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Body For Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOnlyBodyForQuery__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#isConsistentWith(org.eclipse.uml2.RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#isOrdered() <em>Is Ordered</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#isOrdered()
	 * @generated
	 */
	public void testIsOrderedGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsOrdered() {
		testIsOrderedGen();
		
		getFixture().getReturnResults().clear();

		assertEquals(false, getFixture().isOrdered());

		Parameter returnResult = getFixture().createReturnResult();

		assertEquals(false, getFixture().isOrdered());

		returnResult.setIsOrdered(true);

		assertEquals(true, getFixture().isOrdered());

		returnResult.setIsOrdered(false);
		
		assertEquals(false, getFixture().isOrdered());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#isUnique() <em>Is Unique</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#isUnique()
	 * @generated
	 */
	public void testIsUniqueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsUnique() {
		testIsUniqueGen();
		
		getFixture().getReturnResults().clear();

		assertEquals(true, getFixture().isUnique());

		Parameter returnResult = getFixture().createReturnResult();

		assertEquals(true, getFixture().isUnique());

		returnResult.setIsUnique(false);

		assertEquals(false, getFixture().isUnique());

		returnResult.setIsUnique(true);

		assertEquals(true, getFixture().isUnique());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#getLower() <em>Lower</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#getLower()
	 * @generated
	 */
	public void testGetLowerGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetLower() {
		testGetLowerGen();
		
		getFixture().getReturnResults().clear();

		assertEquals(getFixture().lower(), getFixture().getLower());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertEquals(getFixture().lower(), getFixture().getLower());

		LiteralInteger lowerValue = UML2Factory.eINSTANCE.createLiteralInteger();
		((Parameter) getFixture().getReturnResults().get(0)).setLowerValue(lowerValue);

		lowerValue.setValue(0);

		assertEquals(getFixture().lower(), getFixture().getLower());

		lowerValue.setValue(Integer.MAX_VALUE);

		assertEquals(getFixture().lower(), getFixture().getLower());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#getUpper() <em>Upper</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#getUpper()
	 * @generated
	 */
	public void testGetUpperGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetUpper() {
		testGetUpperGen();
		
		getFixture().getReturnResults().clear();

		assertEquals(getFixture().upper(), getFixture().getUpper());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertEquals(getFixture().upper(), getFixture().getUpper());

		LiteralUnlimitedNatural upperValue = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		((Parameter) getFixture().getReturnResults().get(0)).setUpperValue(upperValue);

		upperValue.setValue(0);

		assertEquals(getFixture().upper(), getFixture().getUpper());

		upperValue.setValue(Integer.MAX_VALUE);

		assertEquals(getFixture().upper(), getFixture().getUpper());
	}

	public void testSetIsOrdered() {
		getFixture().getReturnResults().clear();

		assertEquals(false, getFixture().isOrdered());

		getFixture().createReturnResult();
		
		assertEquals(false, getFixture().isOrdered());

		getFixture().setIsOrdered(true);
		
		assertEquals(true, getFixture().isOrdered());

		getFixture().setIsOrdered(false);
		
		assertEquals(false, getFixture().isOrdered());
	}

	public void testSetIsUnique() {
		getFixture().getReturnResults().clear();

		assertEquals(true, getFixture().isUnique());

		getFixture().createReturnResult();

		assertEquals(true, getFixture().isUnique());

		getFixture().setIsUnique(false);

		assertEquals(false, getFixture().isUnique());

		getFixture().setIsUnique(true);

		assertEquals(true, getFixture().isUnique());
	}

	public void testGetFormalParameters() {
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		assertEquals(2, getFixture().getFormalParameters().size());

		for (Iterator formalParameters = getFixture().getFormalParameters().iterator(); formalParameters.hasNext();) {
			Parameter parameter = (Parameter) formalParameters.next();

			assertTrue(getFixture().getOwnedParameters().contains(parameter));
			assertSame(getFixture(), parameter.getOperation());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#getType() <em>Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#getType()
	 * @generated
	 */
	public void testGetTypeGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetType() {
		testGetTypeGen();
		
		getFixture().getReturnResults().clear();

		assertSame(null, getFixture().getType());

		Parameter returnResult = getFixture().createReturnResult();

		assertSame(null, getFixture().getType());

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Type type = (Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			returnResult.setType(type);

			assertSame(type, getFixture().getType());
		}
	}

	public void testSetType() {
		getFixture().getReturnResults().clear();

		assertSame(null, getFixture().getType());
		
		getFixture().createReturnResult();

		assertSame(null, getFixture().getType());

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Type type = (Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			getFixture().setType(type);

			assertSame(type, getFixture().getType());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		super.testGetRedefinitionContexts();

		assertTrue(getFixture().getRedefinitionContexts().contains(getFixture().getClass_()));

		getFixture().setDatatype(UML2Factory.eINSTANCE.createEnumeration());

		assertTrue(getFixture().getRedefinitionContexts().contains(getFixture().getDatatype()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#getNamespace() <em>Namespace</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		assertSame(getFixture().getClass_(), getFixture().getNamespace());

		UML2Factory.eINSTANCE.createEnumeration().getOwnedOperations().add(getFixture());
		assertSame(getFixture().getDatatype(), getFixture().getNamespace());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public void testGetFeaturingClassifiersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeaturingClassifiers() {
		testGetFeaturingClassifiersGen();
		
		super.testGetFeaturingClassifiers();

		assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getClass_()));

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDataType()).iterator(); eAllSubClasses.hasNext();) {
			getFixture().setDatatype((DataType) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getDatatype()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#getOwnedMembers() <em>Owned Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().contains(getFixture().getBodyCondition()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getPostconditions()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getPreconditions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedOperations()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Operation#getOwnedParameters() <em>Owned Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Operation#getOwnedParameters()
	 * @generated
	 */
	public void testGetOwnedParameters() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createClass().getOwnedOperations().add(getFixture());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setLowerValue(UML2Factory.eINSTANCE.createLiteralInteger());

		getFixture().setUpperValue(UML2Factory.eINSTANCE.createLiteralUnlimitedNatural());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().setBodyCondition(UML2Factory.eINSTANCE.createConstraint());

		getFixture().getPostconditions().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getPostconditions().add(UML2Factory.eINSTANCE.createConstraint());

		getFixture().getPreconditions().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getPreconditions().add(UML2Factory.eINSTANCE.createConstraint());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.BehavioralFeatureImplTest#setUpRedefinedElements()
	 */
	protected void setUpRedefinedElements() {
		super.setUpRedefinedElements();

		getFixture().getRedefinedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getRedefinedOperations().add(UML2Factory.eINSTANCE.createOperation());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.BehavioralFeatureImplTest#setUpRedefinitionContexts()
	 */
	protected void setUpRedefinitionContexts() {
		super.setUpRedefinitionContexts();

		getFixture().setClass_(UML2Factory.eINSTANCE.createClass());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.tests.BehavioralFeatureImplTest#setUpFeaturingClassifiers()
	 */
	protected void setUpFeaturingClassifiers() {
		super.setUpFeaturingClassifiers();

		getFixture().setClass_(UML2Factory.eINSTANCE.createClass());
	}

} // OperationImplTest
