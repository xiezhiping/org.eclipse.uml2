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
 * $Id: MultiplicityElementOperations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.UML2Package;

/**
 * A static utility class that provides operations related to multiplicity
 * elements.
 */
public final class MultiplicityElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Multiplicity Element Operations. This constructor
	 * should never be called because this is a static utility class.
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
			|| multiplicityElement.upperBound() > 0;
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

}