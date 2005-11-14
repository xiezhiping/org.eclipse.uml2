/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Interaction.java,v 1.1 2005/11/14 22:25:57 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction is a unit of behavior that focuses on the observable exchange of information between ConnectableElements. An Interaction is a specialization of InteractionFragment and of Behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getLifelines <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getFormalGates <em>Formal Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getMessages <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction
		extends Behavior, InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the participants in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Lifeline()
	 * @see org.eclipse.uml2.uml.Lifeline#getInteraction
	 * @model type="org.eclipse.uml2.uml.Lifeline" opposite="interaction" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getLifelines();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Lifeline} and appends it to the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Lifeline}.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline createLifeline();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline getLifeline(String name);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of fragments in the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Fragment()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction
	 * @model type="org.eclipse.uml2.uml.InteractionFragment" opposite="enclosingInteraction" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getFragments();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InteractionFragment} and appends it to the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment createFragment(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions owned by the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Action()
	 * @model type="org.eclipse.uml2.uml.Action" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getActions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Action} and appends it to the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getActions()
	 * @generated
	 */
	Action createAction(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Action} and appends it to the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getActions()
	 * @generated
	 */
	Action createAction();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>' from the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Action} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActions()
	 * @generated
	 */
	Action getAction(String name);

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_FormalGate()
	 * @model type="org.eclipse.uml2.uml.Gate" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getFormalGates();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Gate} and appends it to the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Gate}.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate createFormalGate();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate getFormalGate(String name);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Message}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Messages contained in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Message()
	 * @see org.eclipse.uml2.uml.Message#getInteraction
	 * @model type="org.eclipse.uml2.uml.Message" opposite="interaction" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getMessages();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Message} and appends it to the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Message}.
	 * @see #getMessages()
	 * @generated
	 */
	Message createMessage();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
	Message getMessage(String name);

} // Interaction
