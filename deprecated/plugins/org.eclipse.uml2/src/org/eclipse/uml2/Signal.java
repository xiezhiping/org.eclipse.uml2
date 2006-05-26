/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Signal.java,v 1.12 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal is a specification of type of send request instances communicated between objects. The receiving object handles the signal instance as specified by its receptions. The data carried by a send request and passed to it by the occurrence of the send invocation event that caused the request is represented as attributes of the signal instance. A signal is defined independently of the classifiers handling the signal. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Signal#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getSignal()
 * @model
 * @generated
 */
public interface Signal extends Classifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getSignal_OwnedAttribute()
	 * @model type="org.eclipse.uml2.Property" containment="true"
	 * @generated
	 */
	EList getOwnedAttributes();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
    Property getOwnedAttribute(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property getOwnedAttribute(String name, boolean ignoreCase, EClass eClass);


	/**
	 * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated NOT
	 */
    Property createOwnedAttribute(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated NOT
	 */
    Property createOwnedAttribute();

} // Signal
