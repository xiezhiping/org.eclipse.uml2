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
 * $Id: TypeOperations.java,v 1.5 2005/05/12 18:58:00 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.AssociationClass;
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
	 * Constructs a new Type Operations. This constructor should never be called
	 * because this is a static utility class.
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

		validateTypeAndBounds(type1, end1LowerBound, end1UpperBound);

		validateTypeAndBounds(type2, end2LowerBound, end2UpperBound);

		if (null == type1.getNearestPackage()) {
			throw new IllegalArgumentException(String.valueOf(type1));
		}

		if (end1IsNavigable && null == getOwnedAttributes(type1)) {
			throw new IllegalArgumentException(String.valueOf(type1));
		}

		if (null == end1Aggregation) {
			throw new IllegalArgumentException(String.valueOf(end1Aggregation));
		}

		if (end2IsNavigable && null == getOwnedAttributes(type2)) {
			throw new IllegalArgumentException(String.valueOf(type2));
		}

		if (null == end2Aggregation) {
			throw new IllegalArgumentException(String.valueOf(end2Aggregation));
		}

		Association association = (Association) type1.getNearestPackage()
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
		Property associationEnd = createOwnedProperty(isNavigable
			? type
			: association, name, otherEndType, lowerBound, upperBound);

		if (isNavigable) {
			association.getMemberEnds().add(associationEnd);
		}

		associationEnd.setAggregation(aggregation);

		return associationEnd;
	}

	protected static void validateTypeAndBounds(Type type, int lowerBound,
			int upperBound) {

		if (null == type) {
			throw new IllegalArgumentException(String.valueOf(type));
		}

		if (0 > lowerBound) {
			throw new IllegalArgumentException(String.valueOf(lowerBound));
		}

		if (MultiplicityElement.UNLIMITED_UPPER_BOUND != upperBound
			&& (0 == upperBound || lowerBound > upperBound)) {

			throw new IllegalArgumentException(String.valueOf(upperBound));
		}
	}

	protected static Property createOwnedProperty(Type type, String name,
			Type propertyType, int lowerBound, int upperBound) {
		Property ownedProperty = (Property) new UML2Switch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact.createOwnedAttribute(UML2Package.eINSTANCE
					.getProperty());
			}

			public Object caseAssociation(Association association) {
				return association.createOwnedEnd(UML2Package.eINSTANCE
					.getProperty());
			}

			public Object caseAssociationClass(AssociationClass associationClass) {
				return associationClass
					.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
			}

			public Object caseDataType(DataType dataType) {
				return dataType.createOwnedAttribute(UML2Package.eINSTANCE
					.getProperty());
			}

			public Object caseInterface(Interface interface_) {
				return interface_.createOwnedAttribute(UML2Package.eINSTANCE
					.getProperty());
			}

			public Object caseSignal(Signal signal) {
				return signal.createOwnedAttribute(UML2Package.eINSTANCE
					.getProperty());
			}

			public Object caseStructuredClassifier(
					StructuredClassifier structuredClassifier) {
				return structuredClassifier
					.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
			}
		}.doSwitch(type);

		ownedProperty.setName(name);
		ownedProperty.setType(propertyType);
		ownedProperty.setUpperBound(upperBound);
		ownedProperty.setLowerBound(lowerBound);

		return ownedProperty;
	}

	/**
	 * Creates a property with the specified type, name, lower bound, and upper
	 * bound as an owned attribute of the specified type.
	 * 
	 * @param type
	 *            The type in which to create the owned attribute.
	 * @param name
	 *            The name for the owned attribute.
	 * @param attributeType
	 *            The type for the owned attribute.
	 * @param lowerBound
	 *            The lower bound for the owned attribute.
	 * @param upperBound
	 *            The upper bound for the owned attribute.
	 * @return The new property.
	 * @exception IllegalArgumentException
	 *                If either of the bounds is invalid.
	 */
	public static Property createOwnedAttribute(Type type, String name,
			Type attributeType, int lowerBound, int upperBound) {

		if (null == type || null == getOwnedAttributes(type)) {
			throw new IllegalArgumentException(String.valueOf(type));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		validateTypeAndBounds(attributeType, lowerBound, upperBound);

		return createOwnedProperty(type, name, attributeType, lowerBound,
			upperBound);
	}

}