/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.util.UML2Switch;

/**
 * A static utility class that provides operations related to types.
 */
public final class TypeOperations
	extends UML2Operations {

	/**
	 * Constructs a new Type Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private TypeOperations() {
		super();
	}

	public static boolean conformsTo(Type type, Type other) {
		return false;
	}

	/**
	 * Creates a(n) (binary) association between the specified types, with the
	 * specified navigabilities, aggregations, names, lower bounds, and upper
	 * bounds, and owned by the first type's package.
	 * 
	 * @param type1
	 *            The type at the first end.
	 * @param end1IsNavigable
	 *            The navigability of the first end.
	 * @param end1Aggregation
	 *            The aggregation of the first end.
	 * @param end1Name
	 *            The name of the first end.
	 * @param end1LowerBound
	 *            The lower bound of the first end.
	 * @param end1UpperBound
	 *            The upper bound of the first end.
	 * @param type2
	 *            The type at the second end.
	 * @param end2IsNavigable
	 *            The navigability of the second end.
	 * @param end2Aggregation
	 *            The aggregation of the second end.
	 * @param end2Name
	 *            The name of the second end.
	 * @param end2LowerBound
	 *            The lower bound of the second end.
	 * @param end2UpperBound
	 *            The upper bound of the second end.
	 * @return The new (binary) association.
	 * @exception IllegalArgumentException
	 *                If any of the navigabilities, lower bounds, or upper
	 *                bounds are invalid.
	 */
	public static Association createAssociation(Type type1,
			boolean end1IsNavigable, AggregationKind end1Aggregation,
			String end1Name, int end1LowerBound, int end1UpperBound,
			Type type2, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name,
			int end2LowerBound, int end2UpperBound) {

		if (null == type1 || null == type1.getPackage()) {
			throw new IllegalArgumentException(String.valueOf(type1));
		}

		if (end1IsNavigable && null == getOwnedAttributes(type1)) {
			throw new IllegalArgumentException(String.valueOf(type1));
		}

		if (null == end1Aggregation) {
			throw new IllegalArgumentException(String.valueOf(end1Aggregation));
		}

		if (0 > end1LowerBound) {
			throw new IllegalArgumentException(String.valueOf(end1LowerBound));
		}

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND != end1UpperBound
			&& (0 == end1UpperBound || end1LowerBound > end1UpperBound)) {
			throw new IllegalArgumentException(String.valueOf(end1UpperBound));
		}

		if (null == type2) {
			throw new IllegalArgumentException(String.valueOf(type2));
		}

		if (end2IsNavigable && null == getOwnedAttributes(type2)) {
			throw new IllegalArgumentException(String.valueOf(type2));
		}

		if (null == end2Aggregation) {
			throw new IllegalArgumentException(String.valueOf(end2Aggregation));
		}

		if (0 > end2LowerBound) {
			throw new IllegalArgumentException(String.valueOf(end2LowerBound));
		}

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND != end2UpperBound
			&& (0 == end2UpperBound || end2LowerBound > end2UpperBound)) {

			throw new IllegalArgumentException(String.valueOf(end2UpperBound));
		}

		Association association = (Association) type1.getPackage()
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		createAssociationEnd(association, type1, end1IsNavigable,
			end1Aggregation, end1Name, end1LowerBound, end1UpperBound, type2);

		createAssociationEnd(association, type2, end2IsNavigable,
			end2Aggregation, end2Name, end2LowerBound, end2UpperBound, type1);

		return association;
	}

	protected static Property createAssociationEnd(Association association,
			Type type, boolean isNavigable, AggregationKind aggregation,
			String name, int lowerBound, int upperBound, Type otherEndType) {
		Property associationEnd = isNavigable
			? (Property) new UML2Switch() {

				public Object caseArtifact(Artifact object) {
					return object.createOwnedAttribute(UML2Package.eINSTANCE
						.getProperty());
				}

				public Object caseDataType(DataType object) {
					return object.createOwnedAttribute(UML2Package.eINSTANCE
						.getProperty());
				}

				public Object caseInterface(Interface object) {
					return object.createOwnedAttribute(UML2Package.eINSTANCE
						.getProperty());
				}

				public Object caseSignal(Signal object) {
					return object.createOwnedAttribute(UML2Package.eINSTANCE
						.getProperty());
				}

				public Object caseStructuredClassifier(
						StructuredClassifier object) {
					return object.createOwnedAttribute(UML2Package.eINSTANCE
						.getProperty());
				}
			}.doSwitch(type) : association.createOwnedEnd(UML2Package.eINSTANCE
				.getProperty());

		if (isNavigable) {
			association.getMemberEnds().add(associationEnd);
		}

		associationEnd.setType(otherEndType);
		associationEnd.setAggregation(aggregation);
		associationEnd.setName(name);
		associationEnd.setUpperBound(upperBound);
		associationEnd.setLowerBound(lowerBound);

		return associationEnd;
	}

}