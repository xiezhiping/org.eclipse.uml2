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
 * $Id: OperationImplTest.java,v 1.2 2004/05/11 15:20:49 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.OperationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getType() <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwningParameter() <em>Owning Parameter</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#includesCardinality(Integer) <em>Includes Cardinality</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#includesMultiplicity(MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateUpperGt0(EDiagnosticChain, EMap) <em>Validate Upper Gt0</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateLowerGe0(EDiagnosticChain, EMap) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateUpperGeLower(EDiagnosticChain, EMap) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateLowerEqLowerbound(EDiagnosticChain, EMap) <em>Validate Lower Eq Lowerbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateUpperEqUpperbound(EDiagnosticChain, EMap) <em>Validate Upper Eq Upperbound</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#lower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#upper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateTypeOfResult(EDiagnosticChain, EMap) <em>Validate Type Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#lower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#upper() <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#type() <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#validateOnlyBodyForQuery(EDiagnosticChain, EMap) <em>Validate Only Body For Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRaisedExceptions() <em>Get Raised Exceptions</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#setIsOrdered(Boolean) <em>Set Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#setIsUnique(Boolean) <em>Set Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getFormalParameters() <em>Get Formal Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getType() <em>Get Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#setType(Type) <em>Set Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getFeaturingClassifiers() <em>Get Featuring Classifiers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OperationImplTest extends BehavioralFeatureImplTest {

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
		TestRunner.run(OperationImplTest.class);
	}

	/**
	 * Constructs a new Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperationImpl getFixture() {
		return (OperationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((OperationImpl) UML2Factory.eINSTANCE.createOperation());
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#setTemplateParameter() <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#setTemplateParameter()
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#setOwningParameter() <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#setOwningParameter()
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#lowerBound()
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#upperBound()
	 * @generated NOT
	 */
	public void testUpperBound() {
		getFixture().setUpperValue(null);

		assertEquals(1, getFixture().upperBound());

		LiteralUnlimitedNatural upperBound = UML2Factory.eINSTANCE.createLiteralUnlimitedNatural();
		getFixture().setUpperValue(upperBound);

		upperBound.setValue(0);

		assertEquals(0, getFixture().upperBound());

		upperBound.setValue(Integer.MAX_VALUE);

		assertEquals(Integer.MAX_VALUE, getFixture().upperBound());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#isMultivalued()
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#includesCardinality(Integer) <em>Includes Cardinality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#includesCardinality(Integer)
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#includesMultiplicity(MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#includesMultiplicity(MultiplicityElement)
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateUpperGt0(EDiagnosticChain, EMap) <em>Validate Upper Gt0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateUpperGt0(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateUpperGt0__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateLowerGe0(EDiagnosticChain, EMap) <em>Validate Lower Ge0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateLowerGe0(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateLowerGe0__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateUpperGeLower(EDiagnosticChain, EMap) <em>Validate Upper Ge Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateUpperGeLower(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateUpperGeLower__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateLowerEqLowerbound(EDiagnosticChain, EMap) <em>Validate Lower Eq Lowerbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateLowerEqLowerbound(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateLowerEqLowerbound__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateUpperEqUpperbound(EDiagnosticChain, EMap) <em>Validate Upper Eq Upperbound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateUpperEqUpperbound(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateUpperEqUpperbound__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().contains(getFixture().getLowerValue()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getUpperValue()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateTypeOfResult(EDiagnosticChain, EMap) <em>Validate Type Of Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateTypeOfResult(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateTypeOfResult__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#lower()
	 * @generated NOT
	 */
	public void testLower() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#upper()
	 * @generated NOT
	 */
	public void testUpper() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#type()
	 * @generated NOT
	 */
	public void testType() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#validateOnlyBodyForQuery(EDiagnosticChain, EMap) <em>Validate Only Body For Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#validateOnlyBodyForQuery(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateOnlyBodyForQuery__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#isOrdered() <em>Is Ordered</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#isOrdered()
	 * @generated NOT
	 */
	public void testIsOrdered() {
		getFixture().getReturnResults().clear();

		assertEquals(false, getFixture().isOrdered());

		Parameter returnResult = getFixture().createReturnResult(UML2Package.eINSTANCE.getParameter());

		assertEquals(false, getFixture().isOrdered());

		returnResult.setIsOrdered(true);

		assertEquals(true, getFixture().isOrdered());

		returnResult.setIsOrdered(false);
		
		assertEquals(false, getFixture().isOrdered());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#setIsOrdered(Boolean) <em>Set Is Ordered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#setIsOrdered(Boolean)
	 * @generated NOT
	 */
	public void testSetIsOrdered__Boolean() {
		getFixture().getReturnResults().clear();

		assertEquals(false, getFixture().isOrdered());

		getFixture().createReturnResult(UML2Package.eINSTANCE.getParameter());
		
		assertEquals(false, getFixture().isOrdered());

		getFixture().setIsOrdered(true);
		
		assertEquals(true, getFixture().isOrdered());

		getFixture().setIsOrdered(false);
		
		assertEquals(false, getFixture().isOrdered());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#isUnique() <em>Is Unique</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#isUnique()
	 * @generated NOT
	 */
	public void testIsUnique() {
		getFixture().getReturnResults().clear();

		assertEquals(true, getFixture().isUnique());

		Parameter returnResult = getFixture().createReturnResult(UML2Package.eINSTANCE.getParameter());

		assertEquals(true, getFixture().isUnique());

		returnResult.setIsUnique(false);

		assertEquals(false, getFixture().isUnique());

		returnResult.setIsUnique(true);

		assertEquals(true, getFixture().isUnique());
}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#setIsUnique(Boolean) <em>Set Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#setIsUnique(Boolean)
	 * @generated NOT
	 */
	public void testSetIsUnique__Boolean() {
		getFixture().getReturnResults().clear();

		assertEquals(true, getFixture().isUnique());

		getFixture().createReturnResult(UML2Package.eINSTANCE.getParameter());

		assertEquals(true, getFixture().isUnique());

		getFixture().setIsUnique(false);

		assertEquals(false, getFixture().isUnique());

		getFixture().setIsUnique(true);

		assertEquals(true, getFixture().isUnique());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getLower() <em>Get Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getLower()
	 * @generated NOT
	 */
	public void testGetLower() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getUpper() <em>Get Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getUpper()
	 * @generated NOT
	 */
	public void testGetUpper() {
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getRaisedExceptions() <em>Get Raised Exceptions</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getRaisedExceptions()
	 * @generated NOT
	 */
	public void testGetRaisedExceptions() {
		assertTrue(true);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getFormalParameters() <em>Get Formal Parameters</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getFormalParameters()
	 * @generated NOT
	 */
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
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getType()
	 * @generated NOT
	 */
	public void testGetType() {
		getFixture().getReturnResults().clear();

		assertSame(null, getFixture().getType());

		Parameter returnResult = getFixture().createReturnResult(UML2Package.eINSTANCE.getParameter());

		assertSame(null, getFixture().getType());

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Type type = (Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			returnResult.setType(type);

			assertSame(type, getFixture().getType());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#setType(Type) <em>Set Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#setType(Type)
	 * @generated NOT
	 */
	public void testSetType__Type() {
		getFixture().getReturnResults().clear();

		assertSame(null, getFixture().getType());
		
		getFixture().createReturnResult(UML2Package.eINSTANCE.getParameter());

		assertSame(null, getFixture().getType());

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Type type = (Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());
			getFixture().setType(type);

			assertSame(type, getFixture().getType());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getRedefinitionContexts()
	 * @generated NOT
	 */
	public void testGetRedefinitionContexts() {
		super.testGetRedefinitionContexts();

		assertTrue(getFixture().getRedefinitionContexts().contains(getFixture().getClass_()));

		getFixture().setDatatype(UML2Factory.eINSTANCE.createEnumeration());

		assertTrue(getFixture().getRedefinitionContexts().contains(getFixture().getDatatype()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getNamespace() <em>Get Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getNamespace()
	 * @generated NOT
	 */
	public void testGetNamespace() {
		super.testGetNamespace();

		assertSame(getFixture().getClass_(), getFixture().getNamespace());

		UML2Factory.eINSTANCE.createEnumeration().getOwnedOperations().add(getFixture());
		assertSame(getFixture().getDatatype(), getFixture().getNamespace());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getFeaturingClassifiers() <em>Get Featuring Classifiers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getFeaturingClassifiers()
	 * @generated NOT
	 */
	public void testGetFeaturingClassifiers() {
		super.testGetFeaturingClassifiers();

		assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getClass_()));

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDataType()).iterator(); eAllSubClasses.hasNext();) {
			getFixture().setDatatype((DataType) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			assertTrue(getFixture().getFeaturingClassifiers().contains(getFixture().getDatatype()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getOwnedMembers()
	 * @generated NOT
	 */
	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().contains(getFixture().getBodyCondition()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getPostconditions()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getPreconditions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.OperationImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.OperationImpl#getRedefinedElements()
	 * @generated NOT
	 */
	public void testGetRedefinedElements() {
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedOperations()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createClass().getOwnedOperations().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().setLowerValue(UML2Factory.eINSTANCE.createLiteralInteger());

		getFixture().setUpperValue(UML2Factory.eINSTANCE.createLiteralUnlimitedNatural());
	}

	/**
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

	/**
	 * @see org.eclipse.uml2.impl.tests.BehavioralFeatureImplTest#setUpRedefinedElements()
	 */
	protected void setUpRedefinedElements() {
		super.setUpRedefinedElements();

		getFixture().getRedefinedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getRedefinedOperations().add(UML2Factory.eINSTANCE.createOperation());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.BehavioralFeatureImplTest#setUpRedefinitionContexts()
	 */
	protected void setUpRedefinitionContexts() {
		super.setUpRedefinitionContexts();

		getFixture().setClass_(UML2Factory.eINSTANCE.createClass());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.BehavioralFeatureImplTest#setUpFeaturingClassifiers()
	 */
	protected void setUpFeaturingClassifiers() {
		super.setUpFeaturingClassifiers();

		getFixture().setClass_(UML2Factory.eINSTANCE.createClass());
	}

} //OperationImplTest
