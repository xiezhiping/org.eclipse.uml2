/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TypeOperations.java,v 1.7 2006/01/05 22:58:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Type#createAssociation(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Type, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Type#conformsTo(org.eclipse.uml2.uml.Type) <em>Conforms To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOperations() {
		super();
	}

	protected static void validateTypeAndBounds(Type type, int lower, int upper) {

		if (type == null) {
			throw new IllegalArgumentException(String.valueOf(type));
		}

		if (lower < 0) {
			throw new IllegalArgumentException(String.valueOf(lower));
		}

		if (upper != LiteralUnlimitedNatural.UNLIMITED
			&& (upper == 0 || upper < lower)) {

			throw new IllegalArgumentException(String.valueOf(upper));
		}
	}

	protected static Property createOwnedProperty(Type type, String name,
			Type propertyType, int lower, int upper) {
		Property ownedProperty = (Property) new UMLSwitch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact
					.createOwnedAttribute(UMLPackage.Literals.PROPERTY);
			}

			public Object caseAssociation(Association association) {
				return association.createOwnedEnd(UMLPackage.Literals.PROPERTY);
			}

			public Object caseAssociationClass(AssociationClass associationClass) {
				return associationClass
					.createOwnedAttribute(UMLPackage.Literals.PROPERTY);
			}

			public Object caseDataType(DataType dataType) {
				return dataType
					.createOwnedAttribute(UMLPackage.Literals.PROPERTY);
			}

			public Object caseInterface(Interface interface_) {
				return interface_
					.createOwnedAttribute(UMLPackage.Literals.PROPERTY);
			}

			public Object caseSignal(Signal signal) {
				return signal
					.createOwnedAttribute(UMLPackage.Literals.PROPERTY);
			}

			public Object caseStructuredClassifier(
					StructuredClassifier structuredClassifier) {
				return structuredClassifier
					.createOwnedAttribute(UMLPackage.Literals.PROPERTY);
			}
		}.doSwitch(type);

		ownedProperty.setName(name);
		ownedProperty.setLower(lower);
		ownedProperty.setUpper(upper);
		ownedProperty.setType(propertyType);

		return ownedProperty;
	}

	public static Property createOwnedAttribute(Type type, String name,
			Type attributeType, int lower, int upper) {

		if (getOwnedAttributes(type) == null) {
			throw new UnsupportedOperationException();
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		validateTypeAndBounds(attributeType, lower, upper);

		return createOwnedProperty(type, name, attributeType, lower, upper);
	}

	protected static Property createAssociationEnd(Type type,
			Association association, boolean isNavigable,
			AggregationKind aggregation, String name, int lower, int upper,
			Type endType) {
		EList ownedAttributes = getOwnedAttributes(type);
		Property associationEnd = createOwnedProperty(ownedAttributes == null
			? association
			: type, name, endType, lower, upper);

		if (isNavigable) {

			if (ownedAttributes == null) {
				association.getNavigableOwnedEnds().add(associationEnd);
			} else {
				association.getMemberEnds().add(associationEnd);
			}
		}

		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Association createAssociation(Type type,
			boolean end1IsNavigable, AggregationKind end1Aggregation,
			String end1Name, int end1Lower, int end1Upper, Type end1Type,
			boolean end2IsNavigable, AggregationKind end2Aggregation,
			String end2Name, int end2Lower, int end2Upper) {
		validateTypeAndBounds(end1Type, end1Lower, end1Upper);

		validateTypeAndBounds(type, end2Lower, end2Upper);

		org.eclipse.uml2.uml.Package package_ = type.getNearestPackage();

		if (package_ == null) {
			throw new IllegalStateException();
		}

		if (end1Aggregation == null) {
			throw new IllegalArgumentException(String.valueOf(end1Aggregation));
		}

		if (end2Aggregation == null) {
			throw new IllegalArgumentException(String.valueOf(end2Aggregation));
		}

		Association association = (Association) package_
			.createPackagedElement(UMLPackage.Literals.ASSOCIATION);

		createAssociationEnd(type, association, end1IsNavigable,
			end1Aggregation, end1Name, end1Lower, end1Upper, end1Type);

		createAssociationEnd(end1Type, association, end2IsNavigable,
			end2Aggregation, end2Name, end2Lower, end2Upper, type);

		return association;
	}

	public static Operation createOwnedOperation(Type type, String name,
			Type returnType, EList parameterNames, EList parameterTypes) {

		if (getOwnedOperations(type) == null) {
			throw new UnsupportedOperationException();
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		if (parameterNames == null
			? parameterTypes != null
			: parameterTypes == null
				|| parameterNames.size() != parameterTypes.size()) {

			throw new IllegalArgumentException(String.valueOf(parameterTypes));
		}

		Operation ownedOperation = (Operation) new UMLSwitch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact.createOwnedOperation();
			}

			public Object caseClass(org.eclipse.uml2.uml.Class class_) {
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

		if (returnType != null) {
			Parameter returnResult = ownedOperation.createOwnedParameter();
			returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
			returnResult.setType(returnType);
		}

		if (parameterNames != null) {

			for (int i = 0; i < parameterNames.size(); i++) {
				Parameter ownedParameter = ownedOperation
					.createOwnedParameter();
				ownedParameter.setName((String) parameterNames.get(i));
				ownedParameter.setType((Type) parameterTypes.get(i));
			}
		}

		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a type that conforms to another. By default, two types do not conform to each other. This query is intended to be redefined for specific conformance situations.
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean conformsTo(Type type, Type other) {
		return false;
	}

} // TypeOperations