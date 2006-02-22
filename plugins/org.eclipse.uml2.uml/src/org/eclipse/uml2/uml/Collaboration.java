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
 * $Id: Collaboration.java,v 1.3 2006/02/22 20:48:15 khussey Exp $
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
 * A collaboration is represented as a kind of classifier and defines a set of cooperating entities to be played by instances (its roles), as well as a set of connectors that define communication paths between the participating instances. The cooperating entities are the properties of the collaboration.
 * 
 * 
 * 
 * A collaboration specifies a view (or projection) of a set of cooperating classifiers. It describes the required links between instances that play the roles of the collaboration, as well as the features required of the classifiers that specify the participating instances. Several collaborations may describe different projections of the same set of classifiers.
 * 
 * 
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References connectable elements (possibly owned by other classifiers) which represent roles that instances may play in this collaboration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCollaboration_CollaborationRole()
	 * @model type="org.eclipse.uml2.uml.ConnectableElement" ordered="false"
	 * @generated
	 */
	EList getCollaborationRoles();

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
