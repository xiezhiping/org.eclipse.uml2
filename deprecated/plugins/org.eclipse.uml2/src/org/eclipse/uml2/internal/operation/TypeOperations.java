/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TypeOperations.java,v 1.10 2006/01/05 22:42:56 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.AssociationClass;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterDirectionKind;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.util.UML2Switch;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Type#conformsTo(org.eclipse.uml2.Type) <em>Conforms To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOperations extends NamedElementOperations {

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
	protected TypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean conformsTo(Type type, Type other) {
		return false;
	}

	// <!-- begin-custom-operations -->

	/**
	 * Creates a(n) (binary) association between the specified types, with the
	 * specified navigabilities, aggregations, names, lower bounds, and upper
	 * bounds, and owned by the first type's nearest package.
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

		org.eclipse.uml2.Package package_ = type1.getNearestPackage();
		
		if (null == package_) {
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

		Association association = (Association) package_
			.createOwnedMember(UML2Package.Literals.ASSOCIATION);

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
				return artifact
					.createOwnedAttribute(UML2Package.Literals.PROPERTY);
			}

			public Object caseAssociation(Association association) {
				return association
					.createOwnedEnd(UML2Package.Literals.PROPERTY);
			}

			public Object caseAssociationClass(AssociationClass associationClass) {
				return associationClass
					.createOwnedAttribute(UML2Package.Literals.PROPERTY);
			}

			public Object caseDataType(DataType dataType) {
				return dataType
					.createOwnedAttribute(UML2Package.Literals.PROPERTY);
			}

			public Object caseInterface(Interface interface_) {
				return interface_
					.createOwnedAttribute(UML2Package.Literals.PROPERTY);
			}

			public Object caseSignal(Signal signal) {
				return signal
					.createOwnedAttribute(UML2Package.Literals.PROPERTY);
			}

			public Object caseStructuredClassifier(
					StructuredClassifier structuredClassifier) {
				return structuredClassifier
					.createOwnedAttribute(UML2Package.Literals.PROPERTY);
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

	/**
	 * Creates an operation with the specified name, return type, parameter
	 * names, and parameter types as an owned operation of the specified type.
	 * 
	 * @param type
	 *            The type in which to create the owned operation.
	 * @param name
	 *            The name for the owned operation.
	 * @param returnType
	 *            The return type for the owned operation, or <code>null</code>.
	 * @param parameterNames
	 *            The names of the owned operation's parameters, or
	 *            <code>null</code>.
	 * @param parameterTypes
	 *            The types of the owned operation's parameters, or
	 *            <code>null</code>.
	 * @return The new operation.
	 * @exception IllegalArgumentException
	 *                If the number of parameter names does not match the number
	 *                of parameter types.
	 */
	public static Operation createOwnedOperation(Type type, String name,
			Type returnType, String[] parameterNames, Type[] parameterTypes) {

		if (null == type || null == getOwnedOperations(type)) {
			throw new IllegalArgumentException(String.valueOf(type));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		if (null == parameterNames
			? null != parameterTypes
			: null == parameterTypes
				|| parameterNames.length != parameterTypes.length) {

			throw new IllegalArgumentException(String.valueOf(parameterTypes));
		}

		Operation ownedOperation = (Operation) new UML2Switch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact.createOwnedOperation();
			}

			public Object caseClass(org.eclipse.uml2.Class class_) {
				return class_.createOwnedOperation();
			}

			public Object caseDataType(DataType dataType) {
				return dataType.createOwnedOperation();
			}

			public Object caseInterface(Interface interface_) {
				return interface_.createOwnedOperation();
			}
		}.doSwitch(type);

		ownedOperation.setName(name);

		if (null != returnType) {
			Parameter returnResult = ownedOperation.createReturnResult();
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
			returnResult.setType(returnType);
		}

		if (null != parameterNames) {

			for (int i = 0; i < parameterNames.length; i++) {
				Parameter ownedParameter = ownedOperation
					.createOwnedParameter();
				ownedParameter.setName(parameterNames[i]);
				ownedParameter.setType(parameterTypes[i]);
			}
		}

		return ownedOperation;
	}

	// <!-- end-custom-operations -->
	
} // TypeOperations