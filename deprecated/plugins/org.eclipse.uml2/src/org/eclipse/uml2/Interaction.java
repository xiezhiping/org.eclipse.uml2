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
 * $Id: Interaction.java,v 1.12 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The point is that the InteractionConstraint "received" from StructuralArchitecture will consist of a set of such units described by sequence diagrams (or collaboration diagrams).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Interaction#getLifelines <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interaction#getMessages <em>Message</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interaction#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interaction#getFormalGates <em>Formal Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Behavior, InteractionFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteraction_Lifeline()
	 * @see org.eclipse.uml2.Lifeline#getInteraction
	 * @model type="org.eclipse.uml2.Lifeline" opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList getLifelines();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Lifeline} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
    Lifeline getLifeline(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Lifeline} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline getLifeline(String name, boolean ignoreCase);

    /**
     * Creates a {@link org.eclipse.uml2.Lifeline} and appends it to the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Lifeline} to create.
	 * @return The new {@link org.eclipse.uml2.Lifeline}.
	 * @see #getLifelines()
	 * @generated NOT
	 * @deprecated Use #createLifeline() instead.
     */
    Lifeline createLifeline(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Lifeline} and appends it to the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Lifeline}.
	 * @see #getLifelines()
	 * @generated NOT
	 */
    Lifeline createLifeline();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Message}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteraction_Message()
	 * @see org.eclipse.uml2.Message#getInteraction
	 * @model type="org.eclipse.uml2.Message" opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList getMessages();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Message} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
    Message getMessage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Message} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
	Message getMessage(String name, boolean ignoreCase);

    /**
     * Creates a {@link org.eclipse.uml2.Message} and appends it to the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Message} to create.
	 * @return The new {@link org.eclipse.uml2.Message}.
	 * @see #getMessages()
	 * @generated NOT
	 * @deprecated Use #createMessage() instead.
     */
    Message createMessage(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Message} and appends it to the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Message}.
	 * @see #getMessages()
	 * @generated NOT
	 */
    Message createMessage();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteraction_Fragment()
	 * @see org.eclipse.uml2.InteractionFragment#getEnclosingInteraction
	 * @model type="org.eclipse.uml2.InteractionFragment" opposite="enclosingInteraction" containment="true"
	 * @generated
	 */
	EList getFragments();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.InteractionFragment} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
    InteractionFragment getFragment(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InteractionFragment} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.InteractionFragment} and appends it to the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InteractionFragment} to create.
	 * @return The new {@link org.eclipse.uml2.InteractionFragment}.
	 * @see #getFragments()
	 * @generated NOT
	 */
    InteractionFragment createFragment(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the message interface between this Interaction and any InteractionOccurrences which reference it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteraction_FormalGate()
	 * @model type="org.eclipse.uml2.Gate" containment="true" ordered="false"
	 * @generated
	 */
	EList getFormalGates();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Gate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
    Gate getFormalGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Gate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate getFormalGate(String name, boolean ignoreCase);


    /**
     * Creates a {@link org.eclipse.uml2.Gate} and appends it to the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Gate} to create.
	 * @return The new {@link org.eclipse.uml2.Gate}.
	 * @see #getFormalGates()
	 * @generated NOT
	 * @deprecated Use #createFormalGate() instead.
     */
    Gate createFormalGate(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Gate} and appends it to the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Gate}.
	 * @see #getFormalGates()
	 * @generated NOT
	 */
    Gate createFormalGate();

} // Interaction
