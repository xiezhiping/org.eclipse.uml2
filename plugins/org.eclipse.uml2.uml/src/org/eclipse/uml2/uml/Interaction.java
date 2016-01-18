/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Interaction is a unit of Behavior that focuses on the observable exchange of information between connectable elements.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getLifelines <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getFormalGates <em>Formal Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getMessages <em>Message</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the participants in this Interaction.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Lifeline()
	 * @see org.eclipse.uml2.uml.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getLifelines();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Lifeline}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Lifeline}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Lifeline}.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline createLifeline(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline getLifeline(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Lifeline} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline getLifeline(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of fragments in the Interaction.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Fragment()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction
	 * @model opposite="enclosingInteraction" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InteractionFragment}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InteractionFragment}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment createFragment(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InteractionFragment} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Action}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions owned by the Interaction.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Action()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Action}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Action}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getActions()
	 * @generated
	 */
	Action createAction(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>' from the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Action} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActions()
	 * @generated
	 */
	Action getAction(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>' from the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Action} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Action} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActions()
	 * @generated
	 */
	Action getAction(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Gate}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_FormalGate()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getFormalGates();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Gate}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Gate}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Gate}.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate createFormalGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate getFormalGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Gate} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate getFormalGate(String name, boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Message}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Message#getInteraction <em>Interaction</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Messages contained in this Interaction.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Message()
	 * @see org.eclipse.uml2.uml.Message#getInteraction
	 * @model opposite="interaction" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Message}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Message}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Message}.
	 * @see #getMessages()
	 * @generated
	 */
	Message createMessage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
	Message getMessage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Message} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
	Message getMessage(String name, boolean ignoreCase, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Interaction instance must not be contained within another Interaction instance.
	 * enclosingInteraction->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotContained(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Interaction
