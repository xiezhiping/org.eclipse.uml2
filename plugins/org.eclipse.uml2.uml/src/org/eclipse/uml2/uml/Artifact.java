/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 491587
 *   Christian W. Damus (CEA) - 251963, 269598
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * @extends AttributeOwner, OperationOwner
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An artifact is the specification of a physical piece of information that is used or produced by a software development process, or by deployment and operation of a system. Examples of artifacts include model files, source files, scripts, and binary executable files, a table in a database system, a development deliverable, or a word-processing document, a mail message.
 * An artifact is the source of a deployment to a node.
 * <p>From package UML::Deployments.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact
		extends Classifier, DeployedArtifact, AttributeOwner, OperationOwner {

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concrete name that is used to refer to the Artifact in a physical context. Example: file system name, universal resource locator.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #isSetFileName()
	 * @see #unsetFileName()
	 * @see #setFileName(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_FileName()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Artifacts that are defined (nested) within the Artifact. The association is a specialization of the ownedMember association from Namespace to NamedElement.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Artifact</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_NestedArtifact()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Artifact> getNestedArtifacts();

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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies() <em>Client Dependency</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of model elements that are manifested in the Artifact. That is, these model elements are utilized in the construction (or generation) of the artifact.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_Manifestation()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Manifestation> getManifestations();

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
	 * The Operations defined for the Artifact. The association is a specialization of the ownedMember association.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_OwnedOperation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperations();

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
	Operation createOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes);

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
	Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes);

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
	Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getAttributes() <em>Attribute</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes or association ends defined for the Artifact. The association is a specialization of the ownedMember association.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getArtifact_OwnedAttribute()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this artifact.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for  the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" parameterNamesDataType="org.eclipse.uml2.types.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesMany="true" parameterTypesOrdered="false" returnTypeOrdered="false"
	 * @generated
	 */
	Operation createOwnedOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this artifact.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" typeOrdered="false" lowerDataType="org.eclipse.uml2.types.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="org.eclipse.uml2.types.UnlimitedNatural" upperRequired="true" upperOrdered="false"
	 * @generated
	 */
	Property createOwnedAttribute(String name, Type type, int lower, int upper);

} // Artifact
