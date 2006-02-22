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
 * $Id: Artifact.java,v 1.7 2006/02/22 20:48:15 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the metamodel, an Artifact is a Classifier that represents a physical entity. Artifacts may have Properties that represent features of the Artifact, and Operations that can be performed on its instances. Artifacts can be involved in Associations to other Artifacts, e.g. composition associations. Artifacts can be instantiated to represent detailed copy semantics, where different instances of the same Artifact may be deployed to various Node instances (and each may have separate property values, e.g. for a 'time-stamp' property.
 * As part of the Nodes package, an Artifact is extended to become the source of a deployment to a Node. This is achieved by specializing the abstract superclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact
		extends Classifier, DeployedArtifact {

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concrete name that is used to refer to the Artifact in a physical context. Example: file system name, universal resource locator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #isSetFileName()
	 * @see #unsetFileName()
	 * @see #setFileName(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_FileName()
	 * @model unsettable="true" dataType="org.eclipse.uml2.uml.String" ordered="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #isSetFileName()
	 * @see #unsetFileName()
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileName()
	 * @see #getFileName()
	 * @see #setFileName(String)
	 * @generated
	 */
	void unsetFileName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.Artifact#getFileName <em>File Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Name</em>' attribute is set.
	 * @see #unsetFileName()
	 * @see #getFileName()
	 * @see #setFileName(String)
	 * @generated
	 */
	boolean isSetFileName();

	/**
	 * Returns the value of the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Artifacts that are defined (nested) within the Artifact.
	 * 
	 * The association is a specialization of the ownedMember association from Namespace to NamedElement.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Artifact</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_NestedArtifact()
	 * @model type="org.eclipse.uml2.uml.Artifact" containment="true" ordered="false"
	 * @generated
	 */
	EList getNestedArtifacts();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Artifact}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Artifact}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Artifact} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Artifact}.
	 * @see #getNestedArtifacts()
	 * @generated
	 */
	Artifact createNestedArtifact(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Artifact}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Artifact}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Artifact}.
	 * @see #getNestedArtifacts()
	 * @generated
	 */
	Artifact createNestedArtifact(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Artifact} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Artifact} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Artifact} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedArtifacts()
	 * @generated
	 */
	Artifact getNestedArtifact(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Artifact} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Artifact} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Artifact} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Artifact} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Artifact} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedArtifacts()
	 * @generated
	 */
	Artifact getNestedArtifact(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Manifestation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of model elements that are manifested in the Artifact. That is, these model elements are utilized in the construction (or generation) of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_Manifestation()
	 * @model type="org.eclipse.uml2.uml.Manifestation" containment="true" ordered="false"
	 * @generated
	 */
	EList getManifestations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Manifestation}, with the specified '<em><b>Name</b></em>', and '<em><b>Utilized Element</b></em>', and appends it to the '<em><b>Manifestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Manifestation}, or <code>null</code>.
	 * @param utilizedElement The '<em><b>Utilized Element</b></em>' for the new {@link org.eclipse.uml2.uml.Manifestation}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Manifestation}.
	 * @see #getManifestations()
	 * @generated
	 */
	Manifestation createManifestation(String name,
			PackageableElement utilizedElement);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Manifestation} with the specified '<em><b>Name</b></em>', and '<em><b>Utilized Element</b></em>' from the '<em><b>Manifestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Manifestation} to retrieve, or <code>null</code>.
	 * @param utilizedElement The '<em><b>Utilized Element</b></em>' of the {@link org.eclipse.uml2.uml.Manifestation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Manifestation} with the specified '<em><b>Name</b></em>', and '<em><b>Utilized Element</b></em>', or <code>null</code>.
	 * @see #getManifestations()
	 * @generated
	 */
	Manifestation getManifestation(String name,
			PackageableElement utilizedElement);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Manifestation} with the specified '<em><b>Name</b></em>', and '<em><b>Utilized Element</b></em>' from the '<em><b>Manifestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Manifestation} to retrieve, or <code>null</code>.
	 * @param utilizedElement The '<em><b>Utilized Element</b></em>' of the {@link org.eclipse.uml2.uml.Manifestation} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Manifestation} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Manifestation} with the specified '<em><b>Name</b></em>', and '<em><b>Utilized Element</b></em>', or <code>null</code>.
	 * @see #getManifestations()
	 * @generated
	 */
	Manifestation getManifestation(String name,
			PackageableElement utilizedElement, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations defined for the Artifact. The association is a specialization of the ownedMember association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_OwnedOperation()
	 * @model type="org.eclipse.uml2.uml.Operation" containment="true"
	 * @generated
	 */
	EList getOwnedOperations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Operation}, with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Operation}, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' for the new {@link org.eclipse.uml2.uml.Operation}, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' for the new {@link org.eclipse.uml2.uml.Operation}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation createOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation getOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Operation} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation getOwnedOperation(String name, EList ownedParameterNames,
			EList ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes or association ends defined for the Artifact.
	 * 
	 * The association is a specialization of the ownedMember association.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_OwnedAttribute()
	 * @model type="org.eclipse.uml2.uml.Property" containment="true"
	 * @generated
	 */
	EList getOwnedAttributes();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameOrdered="false" parameterNamesType="java.lang.String" parameterNamesDataType="org.eclipse.uml2.uml.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesType="org.eclipse.uml2.uml.Type" parameterTypesMany="true" parameterTypesOrdered="false" returnTypeOrdered="false"
	 * @generated
	 */
	Operation createOwnedOperation(String name, EList parameterNames,
			EList parameterTypes, Type returnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameOrdered="false" typeOrdered="false" lowerDataType="org.eclipse.uml2.uml.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="org.eclipse.uml2.uml.UnlimitedNatural" upperRequired="true" upperOrdered="false"
	 * @generated
	 */
	Property createOwnedAttribute(String name, Type type, int lower, int upper);

} // Artifact
