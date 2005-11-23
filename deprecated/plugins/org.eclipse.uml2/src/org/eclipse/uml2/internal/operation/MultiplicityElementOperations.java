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
 * $Id: MultiplicityElementOperations.java,v 1.10 2005/11/23 20:09:17 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.ValueSpecification;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Multiplicity Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
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
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#lower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#upper() <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class MultiplicityElementOperations extends UML2Operations {

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
	private MultiplicityElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(MultiplicityElement multiplicityElement) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();
		return LiteralInteger.class.isInstance(lowerValue)
			? lowerValue.integerValue()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upperBound(MultiplicityElement multiplicityElement) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();
		return LiteralUnlimitedNatural.class.isInstance(upperValue)
			? upperValue.unlimitedValue()
			: 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * upperBound() > 1
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isMultivalued(MultiplicityElement multiplicityElement) {
		int upperBound = multiplicityElement.upperBound();
		return MultiplicityElement.UNLIMITED_UPPER_BOUND == upperBound
			|| upperBound > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (lowerBound() <= C) and (upperBound() >= C)
	 * 
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean includesCardinality(
			MultiplicityElement multiplicityElement, int C) {

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND == C) {
			return MultiplicityElement.UNLIMITED_UPPER_BOUND == multiplicityElement
				.upperBound();
		} else {

			if (multiplicityElement.lowerBound() <= C) {
				int upperBound = multiplicityElement.upperBound();
				return MultiplicityElement.UNLIMITED_UPPER_BOUND == upperBound
					? true
					: upperBound >= C;
			} else {
				return false;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean includesMultiplicity(
			MultiplicityElement multiplicityElement, MultiplicityElement M) {

		if (multiplicityElement.lowerBound() <= M.lowerBound()) {
			int upperBound = multiplicityElement.upperBound();

			if (MultiplicityElement.UNLIMITED_UPPER_BOUND == upperBound) {
				return true;
			} else {
				int mUpperBound = M.upperBound();
				return MultiplicityElement.UNLIMITED_UPPER_BOUND == mUpperBound
					? false
					: upperBound >= mUpperBound;
			}
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * A multiplicity must define at least one valid cardinality that is greater
	 * than zero.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * upperBound()->notEmpty() implies upperBound() > 0
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateUpperGt0(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		int upperBound = multiplicityElement.upperBound();

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND != upperBound
			&& 1 > upperBound) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.MULTIPLICITY_ELEMENT__UPPER_GT0,
							UML2Plugin.INSTANCE.getString(
								"_UI_MultiplicityElement_UpperGT0_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context,
									multiplicityElement)),
							new Object[] {multiplicityElement, new Integer(upperBound)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * The lower bound must be a non-negative integer literal.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * lowerBound()->notEmpty() implies lowerBound() >= 0
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateLowerGe0(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		int lowerBound = multiplicityElement.lowerBound();

		if (0 > lowerBound) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.MULTIPLICITY_ELEMENT__LOWER_GE0,
							UML2Plugin.INSTANCE.getString(
								"_UI_MultiplicityElement_LowerGE0_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context,
									multiplicityElement)),
							new Object[] {multiplicityElement, new Integer(lowerBound)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * The upper bound must be greater than or equal to the lower bound.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * (upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateUpperGeLower(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		int upperBound = multiplicityElement.upperBound();

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND != upperBound
			&& multiplicityElement.lowerBound() > upperBound) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_MultiplicityElement_UpperGELower_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										multiplicityElement)),
							new Object[] {multiplicityElement, new Integer(upperBound)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * The derived lower attribute must equal the lower bound.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * lower=lowerBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateLowerEqLowerbound(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		int lower = multiplicityElement.lower();

		if (multiplicityElement.lowerBound() != lower) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.ERROR,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.MULTIPLICITY_ELEMENT__LOWER_EQ_LOWERBOUND,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_MultiplicityElement_LowerEQLowerBound_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										multiplicityElement)),
							new Object[] {multiplicityElement, new Integer(lower)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * The derived upper attribute must equal the upper bound.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * upper = upperBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateUpperEqUpperbound(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		int upper = multiplicityElement.upper();

		if (multiplicityElement.upperBound() != upper) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.ERROR,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.MULTIPLICITY_ELEMENT__UPPER_EQ_UPPERBOUND,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_MultiplicityElement_UpperEQUpperBound_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										multiplicityElement)),
							new Object[] {multiplicityElement, new Integer(upper)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * lowerBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lower(MultiplicityElement multiplicityElement) {
		return multiplicityElement.lowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * upperBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upper(MultiplicityElement multiplicityElement) {
		return multiplicityElement.upperBound();
	}

	// <!-- begin-custom-operations -->

	/**
	 * Sets the lower bound of the specified multiplicity element to the
	 * specified integer value.
	 * 
	 * @param multiplicityElement
	 *            The multiplicity element whose lower bound to set.
	 * @param value
	 *            The new value of the lower bound.
	 * @exception IllegalArgumentException
	 *                If the new lower bound is invalid.
	 */
	public static void setLowerBound(MultiplicityElement multiplicityElement,
			int value) {

		if (null == multiplicityElement) {
			throw new IllegalArgumentException(String
				.valueOf(multiplicityElement));
		}

		int upperBound = multiplicityElement.upperBound();
		if (0 > value
			|| (MultiplicityElement.UNLIMITED_UPPER_BOUND != upperBound && upperBound < value)) {

			throw new IllegalArgumentException(String.valueOf(value));
		}

		ValueSpecification lowerValue = multiplicityElement.getLowerValue();
		((LiteralInteger) (LiteralInteger.class.isInstance(lowerValue)
			? lowerValue
			: multiplicityElement
				.createLowerValue(UML2Package.Literals.LITERAL_INTEGER)))
			.setValue(value);
	}

	/**
	 * Sets the upper bound of the specified multiplicity element to the
	 * specified unlimited natural value.
	 * 
	 * @param multiplicityElement
	 *            The multiplicity element whose upper bound to set.
	 * @param value
	 *            The new value of the upper bound.
	 * @exception IllegalArgumentException
	 *                If the new upper bound is invalid.
	 */
	public static void setUpperBound(MultiplicityElement multiplicityElement,
			int value) {

		if (null == multiplicityElement) {
			throw new IllegalArgumentException(String
				.valueOf(multiplicityElement));
		}

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND != value
			&& (0 == value || multiplicityElement.lowerBound() > value)) {

			throw new IllegalArgumentException(String.valueOf(value));
		}

		ValueSpecification upperValue = multiplicityElement.getUpperValue();
		((LiteralUnlimitedNatural) (LiteralUnlimitedNatural.class
			.isInstance(upperValue)
			? upperValue
			: multiplicityElement
				.createUpperValue(UML2Package.Literals.LITERAL_UNLIMITED_NATURAL)))
			.setValue(value);
	}

	// <!-- end-custom-operations -->

} // MultiplicityElementOperations