/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: EncapsulatedClassifier.java,v 1.5 2004/06/06 01:35:02 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends a classifier with the ability to own ports as specific and type checked interaction points. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.EncapsulatedClassifier#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getEncapsulatedClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EncapsulatedClassifier extends StructuredClassifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a set of ports that an encapsulated classifier owns. (Subsets Classifier.feature and Namespace.ownedMember.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getEncapsulatedClassifier_OwnedPort()
	 * @model type="org.eclipse.uml2.Port" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedPorts();

    /**
     * Retrieves the {@link org.eclipse.uml2.Port} with the specified name from the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Port} to retrieve.
	 * @return The {@link org.eclipse.uml2.Port} with the specified name, or <code>null</code>.
	 * @see #getOwnedPorts()
	 * @generated
     */
    Port getOwnedPort(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Port} and appends it to the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Port} to create.
	 * @return The new {@link org.eclipse.uml2.Port}.
	 * @see #getOwnedPorts()
	 * @generated
     */
    Port createOwnedPort(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

} // EncapsulatedClassifier
