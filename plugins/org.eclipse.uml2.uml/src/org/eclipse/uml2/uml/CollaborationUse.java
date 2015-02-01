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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CollaborationUse is used to specify the application of a pattern specified by a Collaboration to a specific situation.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#getRoleBindings <em>Role Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCollaborationUse()
 * @model
 * @generated
 */
public interface CollaborationUse
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Collaboration which is used in this CollaborationUse. The Collaboration defines the cooperation between its roles which are mapped to ConnectableElements relating to the Classifier owning the CollaborationUse.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Collaboration)
	 * @see org.eclipse.uml2.uml.UMLPackage#getCollaborationUse_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Collaboration getType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.CollaborationUse#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Role Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Dependency}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mapping between features of the Collaboration and features of the owning Classifier. This mapping indicates which ConnectableElement of the Classifier plays which role(s) in the Collaboration. A ConnectableElement may be bound to multiple roles in the same CollaborationUse (that is, it may play multiple roles).
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Binding</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCollaborationUse_RoleBinding()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Dependency> getRoleBindings();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Dependency}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Dependency}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Dependency} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Dependency}.
	 * @see #getRoleBindings()
	 * @generated
	 */
	Dependency createRoleBinding(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Dependency}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Dependency}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Dependency}.
	 * @see #getRoleBindings()
	 * @generated
	 */
	Dependency createRoleBinding(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>' from the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Dependency} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRoleBindings()
	 * @generated
	 */
	Dependency getRoleBinding(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>' from the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Dependency} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Dependency} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Dependency} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRoleBindings()
	 * @generated
	 */
	Dependency getRoleBinding(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the client elements of a roleBinding are in one Classifier and all supplier elements of a roleBinding are in one Collaboration.
	 * roleBinding->collect(client)->forAll(ne1, ne2 |
	 *   ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and
	 *     let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in
	 *       ce1.structuredClassifier = ce2.structuredClassifier)
	 * and
	 *   roleBinding->collect(supplier)->forAll(ne1, ne2 |
	 *   ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and
	 *     let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in
	 *       ce1.collaboration = ce2.collaboration)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClientElements(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every collaborationRole in the Collaboration is bound within the CollaborationUse.
	 * type.collaborationRole->forAll(role | roleBinding->exists(rb | rb.supplier->includes(role)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEveryRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connectors in a Collaboration typing a CollaborationUse must have corresponding Connectors between elements bound in the context Classifier, and these corresponding Connectors must have the same or more general type than the Collaboration Connectors.
	 * type.ownedConnector->forAll(connector |
	 *   let rolesConnectedInCollab : Set(ConnectableElement) = connector.end.role->asSet(),
	 *         relevantBindings : Set(Dependency) = roleBinding->select(rb | rb.supplier->intersection(rolesConnectedInCollab)->notEmpty()),
	 *         boundRoles : Set(ConnectableElement) = relevantBindings->collect(client.oclAsType(ConnectableElement))->asSet(),
	 *         contextClassifier : StructuredClassifier = boundRoles->any(true).structuredClassifier->any(true) in
	 *           contextClassifier.ownedConnector->exists( correspondingConnector | 
	 *               correspondingConnector.end.role->forAll( role | boundRoles->includes(role) )
	 *               and (connector.type->notEmpty() and correspondingConnector.type->notEmpty()) implies connector.type->forAll(conformsTo(correspondingConnector.type)) )
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConnectors(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // CollaborationUse
