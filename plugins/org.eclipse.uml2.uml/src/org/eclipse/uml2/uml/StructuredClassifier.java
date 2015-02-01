/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963, 269598
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * @extends AttributeOwner
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StructuredClassifiers may contain an internal structure of connected elements each of which plays a role in the overall Behavior modeled by the StructuredClassifier.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getRoles <em>Role</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier
		extends Classifier, AttributeOwner {

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getAttributes() <em>Attribute</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredClassifier#getRoles() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Properties owned by the StructuredClassifier.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_OwnedAttribute()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Property> getOwnedAttributes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Property}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Property}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.Property}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property createOwnedAttribute(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Property}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Property}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.Property}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property createOwnedAttribute(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property getOwnedAttribute(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Property} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property getOwnedAttribute(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Properties specifying instances that the StructuredClassifier owns by composition. This collection is derived, selecting those owned Properties where isComposite is true.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_Part()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Property> getParts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getParts()
	 * @generated
	 */
	Property getPart(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getParts()
	 * @generated
	 */
	Property getPart(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getMembers() <em>Member</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles that instances may play in this StructuredClassifier.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_Role()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConnectableElement> getRoles();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getRoles()
	 * @generated
	 */
	ConnectableElement getRole(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getRoles()
	 * @generated
	 */
	ConnectableElement getRole(String name, Type type, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Connector}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getFeatures() <em>Feature</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors owned by the StructuredClassifier.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_OwnedConnector()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getOwnedConnectors();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Connector}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Connector}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Connector}.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
	Connector createOwnedConnector(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
	Connector getOwnedConnector(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Connector} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
	Connector getOwnedConnector(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this structured classifier.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" typeOrdered="false" lowerDataType="org.eclipse.uml2.types.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="org.eclipse.uml2.types.UnlimitedNatural" upperRequired="true" upperOrdered="false"
	 * @generated
	 */
	Property createOwnedAttribute(String name, Type type, int lower, int upper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All features of type ConnectableElement, equivalent to all direct and inherited roles.
	 * result = (allFeatures()->select(oclIsKindOf(ConnectableElement))->collect(oclAsType(ConnectableElement))->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConnectableElement> allRoles();

} // StructuredClassifier
