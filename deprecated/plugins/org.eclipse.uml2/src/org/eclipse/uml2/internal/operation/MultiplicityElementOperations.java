/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MultiplicityElementOperations.java,v 1.7 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.util.UML2Validator;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;

/**
 * A static utility class that provides operations related to multiplicity
 * elements.
 */
public final class MultiplicityElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Multiplicity Element Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private MultiplicityElementOperations() {
		super();
	}

	public static boolean includesCardinality(
			MultiplicityElement multiplicityElement, int C) {
		return MultiplicityElement.UNLIMITED_UPPER_BOUND == C
			? MultiplicityElement.UNLIMITED_UPPER_BOUND == multiplicityElement
				.upperBound()
			: (multiplicityElement.lowerBound() <= C && (MultiplicityElement.UNLIMITED_UPPER_BOUND == multiplicityElement
				.upperBound()
				? true : multiplicityElement.upperBound() >= C));
	}

	public static boolean includesMultiplicity(
			MultiplicityElement multiplicityElement, MultiplicityElement M) {
		return multiplicityElement.lowerBound() <= M.lowerBound()
			&& (MultiplicityElement.UNLIMITED_UPPER_BOUND == multiplicityElement
				.upperBound()
				? true : (MultiplicityElement.UNLIMITED_UPPER_BOUND == M
					.upperBound()
					? false : multiplicityElement.upperBound() >= M
						.upperBound()));
	}

	public static boolean isMultivalued(MultiplicityElement multiplicityElement) {
		return MultiplicityElement.UNLIMITED_UPPER_BOUND == multiplicityElement
			.upperBound()
			|| multiplicityElement.upperBound() > 1;
	}

	public static int lower(MultiplicityElement multiplicityElement) {
		return multiplicityElement.lowerBound();
	}

	public static int lowerBound(MultiplicityElement multiplicityElement) {
		return LiteralInteger.class.isInstance(multiplicityElement
			.getLowerValue())
			? multiplicityElement.getLowerValue().integerValue() : 1;
	}

	public static int upper(MultiplicityElement multiplicityElement) {
		return multiplicityElement.upperBound();
	}

	public static int upperBound(MultiplicityElement multiplicityElement) {
		return LiteralUnlimitedNatural.class.isInstance(multiplicityElement
			.getUpperValue())
			? multiplicityElement.getUpperValue().unlimitedValue() : 1;
	}

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

		if (0 > value
			|| (MultiplicityElement.UNLIMITED_UPPER_BOUND != multiplicityElement
				.upperBound() && multiplicityElement.upperBound() < value)) {

			throw new IllegalArgumentException(String.valueOf(value));
		}

		((LiteralInteger) (LiteralInteger.class.isInstance(multiplicityElement
			.getLowerValue())
			? multiplicityElement.getLowerValue() : multiplicityElement
				.createLowerValue(UML2Package.eINSTANCE.getLiteralInteger())))
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

		((LiteralUnlimitedNatural) (LiteralUnlimitedNatural.class
			.isInstance(multiplicityElement.getUpperValue())
			? multiplicityElement.getUpperValue() : multiplicityElement
				.createUpperValue(UML2Package.eINSTANCE
					.getLiteralUnlimitedNatural()))).setValue(value);
	}

	/**
	 * A multiplicity must define at least one valid cardinality that is greater
	 * than zero.
	 *  
	 */
	public static boolean validateUpperGt0(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
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
	 * The lower bound must be a non-negative integer literal.
	 *  
	 */
	public static boolean validateLowerGe0(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
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
	 * The upper bound must be greater than or equal to the lower bound.
	 *  
	 */
	public static boolean validateUpperGeLower(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
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
	 * The derived lower attribute must equal the lower bound.
	 *  
	 */
	public static boolean validateLowerEqLowerbound(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
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
	 * The derived upper attribute must equal the upper bound.
	 *  
	 */
	public static boolean validateUpperEqUpperbound(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
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

}