/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CollaborationOccurrence.java,v 1.6 2005/03/15 18:44:42 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collaboration occurrence represents one particular use of a collaboration to explain the relationships between the properties of a classifier. A collaboration occurrence indicates a set of roles and connectors that cooperate within the classifier according to a given collaboration, indicated by the type of the collaboration occurrence. There may be multiple occurrences of a given collaboration within a classifier, each involving a different set of roles and connectors. A given role or connector may be involved in multiple occurrences of the same or different collaborations. Associated dependencies map features of the collaboration type to features in the classifier. These dependencies indicate which role in the classifier plays which role in the collaboration. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.CollaborationOccurrence#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.CollaborationOccurrence#getRoleBindings <em>Role Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getCollaborationOccurrence()
 * @model 
 * @generated
 */
public interface CollaborationOccurrence extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collaboration which is used in this occurrence. The collaboration defines the cooperation between its roles which are mapped to properties of the classifier owning the collaboration occurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Collaboration)
	 * @see org.eclipse.uml2.UML2Package#getCollaborationOccurrence_Type()
	 * @model required="true"
	 * @generated
	 */
	Collaboration getType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.CollaborationOccurrence#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Role Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Binding</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getCollaborationOccurrence_RoleBinding()
	 * @model type="org.eclipse.uml2.Dependency" containment="true" ordered="false"
	 * @generated
	 */
	EList getRoleBindings();

    /**
     * Retrieves the {@link org.eclipse.uml2.Dependency} with the specified name from the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Dependency} to retrieve.
	 * @return The {@link org.eclipse.uml2.Dependency} with the specified name, or <code>null</code>.
	 * @see #getRoleBindings()
	 * @generated
     */
    Dependency getRoleBinding(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Dependency} and appends it to the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Dependency} to create.
	 * @return The new {@link org.eclipse.uml2.Dependency}.
	 * @see #getRoleBindings()
	 * @generated
     */
    Dependency createRoleBinding(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // CollaborationOccurrence
