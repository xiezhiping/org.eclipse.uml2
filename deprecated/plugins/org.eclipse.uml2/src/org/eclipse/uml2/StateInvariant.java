/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StateInvariant#getInvariant <em>Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getStateInvariant()
 * @model 
 * @generated
 */
public interface StateInvariant extends InteractionFragment{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference.
	 * @see #setInvariant(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getStateInvariant_Invariant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getInvariant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.StateInvariant#getInvariant <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' containment reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(Constraint value);

    /**
     * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getInvariant()
	 * @generated
     */
    Constraint createInvariant(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getCovereds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // StateInvariant
