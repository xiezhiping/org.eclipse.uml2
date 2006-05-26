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
 * $Id: Vertex.java,v 1.14 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Vertex#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.Vertex#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.Vertex#getIncomings <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Region#getSubvertices <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region that contains this vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.eclipse.uml2.UML2Package#getVertex_Container()
	 * @see org.eclipse.uml2.Region#getSubvertices
	 * @model opposite="subvertex"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);


	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the transitions departing from this vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getVertex_Outgoing()
	 * @see org.eclipse.uml2.Transition#getSource
	 * @model type="org.eclipse.uml2.Transition" opposite="source" ordered="false"
	 * @generated
	 */
	EList getOutgoings();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
	 */
    Transition getOutgoing(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Transition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
	 */
	Transition getOutgoing(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the transitions entering this vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getVertex_Incoming()
	 * @see org.eclipse.uml2.Transition#getTarget
	 * @model type="org.eclipse.uml2.Transition" opposite="target" ordered="false"
	 * @generated
	 */
	EList getIncomings();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
	 */
    Transition getIncoming(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Transition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
	 */
	Transition getIncoming(String name, boolean ignoreCase, EClass eClass);


} // Vertex
