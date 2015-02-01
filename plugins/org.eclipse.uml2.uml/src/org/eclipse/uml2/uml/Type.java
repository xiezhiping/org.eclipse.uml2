/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Type constrains the values represented by a TypedElement.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Type#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type
		extends PackageableElement {

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Package#getOwnedTypes <em>Owned Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the owning Package of this Type, if any.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.uml2.uml.UMLPackage#getType_Package()
	 * @see org.eclipse.uml2.uml.Package#getOwnedTypes
	 * @model opposite="ownedType" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Type#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.eclipse.uml2.uml.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (binary) association between this type and the specified other type, with the specified navigabilities, aggregations, names, lower bounds, and upper bounds, and owned by this type's nearest package.
	 * @param end1IsNavigable The navigability for the first end of the new association.
	 * @param end1Aggregation The aggregation for the first end of the new association.
	 * @param end1Name The name for the first end of the new association.
	 * @param end1Lower The lower bound for the first end of the new association.
	 * @param end1Upper The upper bound for the first end of the new association.
	 * @param end1Type The type for the first end of the new association.
	 * @param end2IsNavigable The navigability for the second end of the new association.
	 * @param end2Aggregation The aggregation for the second end of the new association.
	 * @param end2Name The name for the second end of the new association.
	 * @param end2Lower The lower bound for the second end of the new association.
	 * @param end2Upper The upper bound for the second end of the new association.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" end1IsNavigableDataType="org.eclipse.uml2.types.Boolean" end1IsNavigableRequired="true" end1IsNavigableOrdered="false" end1AggregationRequired="true" end1AggregationOrdered="false" end1NameDataType="org.eclipse.uml2.types.String" end1NameRequired="true" end1NameOrdered="false" end1LowerDataType="org.eclipse.uml2.types.Integer" end1LowerRequired="true" end1LowerOrdered="false" end1UpperDataType="org.eclipse.uml2.types.UnlimitedNatural" end1UpperRequired="true" end1UpperOrdered="false" end1TypeRequired="true" end1TypeOrdered="false" end2IsNavigableDataType="org.eclipse.uml2.types.Boolean" end2IsNavigableRequired="true" end2IsNavigableOrdered="false" end2AggregationRequired="true" end2AggregationOrdered="false" end2NameDataType="org.eclipse.uml2.types.String" end2NameRequired="true" end2NameOrdered="false" end2LowerDataType="org.eclipse.uml2.types.Integer" end2LowerRequired="true" end2LowerOrdered="false" end2UpperDataType="org.eclipse.uml2.types.UnlimitedNatural" end2UpperRequired="true" end2UpperOrdered="false"
	 * @generated
	 */
	Association createAssociation(boolean end1IsNavigable,
			AggregationKind end1Aggregation, String end1Name, int end1Lower,
			int end1Upper, Type end1Type, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name, int end2Lower,
			int end2Upper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the associations in which this type is involved.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a Type that conforms to another. By default, two Types do not conform to each other. This query is intended to be redefined for specific conformance situations.
	 * result = (false)
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 * @generated
	 */
	boolean conformsTo(Type other);

} // Type
