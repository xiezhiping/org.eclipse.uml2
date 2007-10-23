/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CollaborationUse.java,v 1.11 2007/10/23 15:54:21 jbruck Exp $
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
 * A collaboration use represents one particular use of a collaboration to explain the relationships between the properties of a classifier. A collaboration use shows how the pattern described by a collaboration is applied in a given context, by binding specific entities from that context to the roles of the collaboration. Depending on the context, these entities could be structural features of a classifier, instance specifications, or even roles in some containing collaboration. There may be multiple occurrences of a given collaboration within a classifier, each involving a different set of roles and connectors. A given role or connector may be involved in multiple occurrences of the same or different collaborations.
 * Associated dependencies map features of the collaboration type to features in the classifier. These dependencies indicate which role in the classifier plays which role in the collaboration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#getRoleBindings <em>Role Binding</em>}</li>
 * </ul>
 * </p>
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
	 * The collaboration which is used in this occurrence. The collaboration defines the cooperation between its roles which are mapped to properties of the classifier owning the collaboration use.
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
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mapping between features of the collaboration type and features of the classifier or operation. This mapping indicates which connectable element of the classifier or operation plays which role(s) in the collaboration. A connectable element may be bound to multiple roles in the same collaboration use (that is, it may play multiple roles).
	 * 
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
	 * All the client elements of a roleBinding are in one classifier and all supplier elements of a roleBinding are in one collaboration and they are compatible.
	 * true
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
	 * Every role in the collaboration is bound within the collaboration use to a connectable element within the classifier or operation.
	 * true
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
	 * The connectors in the classifier connect according to the connectors in the collaboration
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConnectors(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // CollaborationUse
