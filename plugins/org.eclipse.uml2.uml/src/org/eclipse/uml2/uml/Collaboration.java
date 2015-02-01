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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Collaboration describes a structure of collaborating elements (roles), each performing a specialized function, which collectively accomplish some desired functionality.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Collaboration#getCollaborationRoles <em>Collaboration Role</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration
		extends StructuredClassifier, BehavioredClassifier {

	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredClassifier#getRoles() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the participants in the Collaboration.
	 * <p>From package UML::StructuredClassifiers.</p>
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
