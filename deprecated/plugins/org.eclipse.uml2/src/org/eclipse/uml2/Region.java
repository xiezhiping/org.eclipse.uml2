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
 * $Id: Region.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Region#getSubvertices <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.Region#getTransitions <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Region#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getRegion()
 * @model 
 * @generated
 */
public interface Region extends RedefinableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Vertex}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getRegion_Subvertex()
	 * @see org.eclipse.uml2.Vertex#getContainer
	 * @model type="org.eclipse.uml2.Vertex" opposite="container" containment="true"
	 * @generated
	 */
	EList getSubvertices();

    /**
     * Retrieves the {@link org.eclipse.uml2.Vertex} with the specified name from the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Vertex} to retrieve.
	 * @return The {@link org.eclipse.uml2.Vertex} with the specified name, or <code>null</code>.
	 * @see #getSubvertices()
	 * @generated
     */
    Vertex getSubvertex(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Vertex} and appends it to the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Vertex} to create.
	 * @return The new {@link org.eclipse.uml2.Vertex}.
	 * @see #getSubvertices()
	 * @generated
     */
    Vertex createSubvertex(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getRegion_Transition()
	 * @see org.eclipse.uml2.Transition#getContainer
	 * @model type="org.eclipse.uml2.Transition" opposite="container" containment="true"
	 * @generated
	 */
	EList getTransitions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Transition} with the specified name from the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Transition} to retrieve.
	 * @return The {@link org.eclipse.uml2.Transition} with the specified name, or <code>null</code>.
	 * @see #getTransitions()
	 * @generated
     */
    Transition getTransition(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Transition} and appends it to the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Transition} to create.
	 * @return The new {@link org.eclipse.uml2.Transition}.
	 * @see #getTransitions()
	 * @generated
     */
    Transition createTransition(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Region</em>' reference.
	 * @see #setExtendedRegion(Region)
	 * @see org.eclipse.uml2.UML2Package#getRegion_ExtendedRegion()
	 * @model 
	 * @generated
	 */
	Region getExtendedRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Region#getExtendedRegion <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' reference.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(Region value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinitionContexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // Region
