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
 * $Id: Collaboration.java,v 1.8 2007/10/23 15:54:22 jbruck Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collaboration use represents the application of the pattern described by a collaboration to a specific situation involving specific classes or instances playing the roles of the collaboration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Collaboration#getCollaborationRoles <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration
		extends BehavioredClassifier, StructuredClassifier {

	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredClassifier#getRoles() <em>Role</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References connectable elements (possibly owned by other classifiers) which represent roles that instances may play in this collaboration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCollaboration_CollaborationRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConnectableElement> getCollaborationRoles();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Collaboration Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getCollaborationRoles()
	 * @generated
	 */
	ConnectableElement getCollaborationRole(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Collaboration Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getCollaborationRoles()
	 * @generated
	 */
	ConnectableElement getCollaborationRole(String name, Type type,
			boolean ignoreCase, EClass eClass);

} // Collaboration
