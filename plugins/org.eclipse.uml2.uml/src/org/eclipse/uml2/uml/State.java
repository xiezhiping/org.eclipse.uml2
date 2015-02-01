/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
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
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A State models a situation during which some (usually implicit) invariant condition holds.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.State#getConnections <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getDeferrableTriggers <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#isSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.State#getRegions <em>Region</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getState()
 * @model
 * @generated
 */
public interface State
		extends Namespace, RedefinableElement, Vertex {

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state with isComposite=true is said to be a composite State. A composite State is a State that contains at least one Region.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_IsComposite()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State with isOrthogonal=true is said to be an orthogonal composite State An orthogonal composite State contains two or more Regions.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_IsOrthogonal()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isOrthogonal();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State with isSimple=true is said to be a simple State A simple State does not have any Regions and it does not refer to any submachine StateMachine.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_IsSimple()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isSimple();

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State with isSubmachineState=true is said to be a submachine State Such a State refers to another StateMachine(submachine).
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_IsSubmachineState()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isSubmachineState();

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StateMachine#getSubmachineStates <em>Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine that is to be inserted in place of the (submachine) State.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submachine</em>' reference.
	 * @see #setSubmachine(StateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_Submachine()
	 * @see org.eclipse.uml2.uml.StateMachine#getSubmachineStates
	 * @model opposite="submachineState" ordered="false"
	 * @generated
	 */
	StateMachine getSubmachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.State#getSubmachine <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' reference.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectionPointReference}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ConnectionPointReference#getState <em>State</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry and exit connection points used in conjunction with this (submachine) State, i.e., as targets and sources, respectively, in the Region with the submachine State. A connection point reference references the corresponding definition of a connection point Pseudostate in the StateMachine referenced by the submachine State.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_Connection()
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getState
	 * @model opposite="state" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnections();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ConnectionPointReference}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ConnectionPointReference}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ConnectionPointReference}.
	 * @see #getConnections()
	 * @generated
	 */
	ConnectionPointReference createConnection(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ConnectionPointReference} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectionPointReference} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ConnectionPointReference} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnections()
	 * @generated
	 */
	ConnectionPointReference getConnection(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ConnectionPointReference} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectionPointReference} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ConnectionPointReference} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ConnectionPointReference} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnections()
	 * @generated
	 */
	ConnectionPointReference getConnection(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Pseudostate#getState <em>State</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_ConnectionPoint()
	 * @see org.eclipse.uml2.uml.Pseudostate#getState
	 * @model opposite="state" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoints();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Pseudostate}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Pseudostate}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Pseudostate}.
	 * @see #getConnectionPoints()
	 * @generated
	 */
	Pseudostate createConnectionPoint(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnectionPoints()
	 * @generated
	 */
	Pseudostate getConnectionPoint(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Pseudostate} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnectionPoints()
	 * @generated
	 */
	Pseudostate getConnectionPoint(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State of which this State is a redefinition.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined State</em>' reference.
	 * @see #setRedefinedState(State)
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_RedefinedState()
	 * @model ordered="false"
	 * @generated
	 */
	State getRedefinedState();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.State#getRedefinedState <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State</em>' reference.
	 * @see #getRedefinedState()
	 * @generated
	 */
	void setRedefinedState(State value);

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedRules() <em>Owned Rule</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies conditions that are always true when this State is the current State. In ProtocolStateMachines state invariants are additional conditions to the preconditions of the outgoing Transitions, and to the postcondition of the incoming Transitions.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Invariant</em>' reference.
	 * @see #setStateInvariant(Constraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_StateInvariant()
	 * @model ordered="false"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.State#getStateInvariant <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getStateInvariant()
	 * @generated
	 */
	Constraint createStateInvariant(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint},with the specified '<em><b>Name</b></em>', and sets the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getStateInvariant()
	 * @generated
	 */
	Constraint createStateInvariant(String name);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Behavior that is executed whenever this State is entered regardless of the Transition taken to reach the State. If defined, entry Behaviors are always executed to completion prior to any internal Behavior or Transitions performed within the State.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_Entry()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getEntry()
	 * @generated
	 */
	Behavior createEntry(String name, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Behavior that is executed whenever this State is exited regardless of which Transition was taken out of the State. If defined, exit Behaviors are always executed to completion only after all internal and transition Behaviors have completed execution.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_Exit()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getExit()
	 * @generated
	 */
	Behavior createExit(String name, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Behavior that is executed while being in the State. The execution starts when this State is entered, and ceases either by itself when done, or when the State is exited, whichever comes first.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_DoActivity()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getDoActivity()
	 * @generated
	 */
	Behavior createDoActivity(String name, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Trigger}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Triggers that are candidates to be retained by the StateMachine if they trigger no Transitions out of the State (not consumed). A deferred Trigger is retained until the StateMachine reaches a State configuration where it is no longer deferred.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_DeferrableTrigger()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Trigger> getDeferrableTriggers();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Trigger}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Trigger}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Trigger}.
	 * @see #getDeferrableTriggers()
	 * @generated
	 */
	Trigger createDeferrableTrigger(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Trigger} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeferrableTriggers()
	 * @generated
	 */
	Trigger getDeferrableTrigger(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Trigger} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Trigger} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeferrableTriggers()
	 * @generated
	 */
	Trigger getDeferrableTrigger(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Region}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Region#getState <em>State</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Regions owned directly by the State.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getState_Region()
	 * @see org.eclipse.uml2.uml.Region#getState
	 * @model opposite="state" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Region}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Region}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Region}.
	 * @see #getRegions()
	 * @generated
	 */
	Region createRegion(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Region} with the specified '<em><b>Name</b></em>' from the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Region} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Region} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRegions()
	 * @generated
	 */
	Region getRegion(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Region} with the specified '<em><b>Name</b></em>' from the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Region} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Region} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Region} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRegions()
	 * @generated
	 */
	Region getRegion(String name, boolean ignoreCase, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine States can have connection point references.
	 * isSubmachineState implies connection->notEmpty( )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSubmachineStates(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection point references used as destinations/sources of Transitions associated with a submachine State must be defined as entry/exit points in the submachine StateMachine.
	 * self.isSubmachineState implies (self.connection->forAll (cp |
	 *   cp.entry->forAll (ps | ps.stateMachine = self.submachine) and
	 *   cp.exit->forAll (ps | ps.stateMachine = self.submachine)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDestinationsOrSourcesOfTransitions(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State is not allowed to have both a submachine and Regions.
	 * isComposite implies not isSubmachineState
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSubmachineOrRegions(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only composite States can have entry or exit Pseudostates defined.
	 * connectionPoint->notEmpty() implies isComposite
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCompositeStates(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only entry or exit Pseudostates can serve as connection points.
	 * connectionPoint->forAll(kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEntryOrExit(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a State is the nearest containing StateMachine.
	 * result = (let sm : StateMachine = containingStateMachine() in
	 * if sm._'context' = null or sm.general->notEmpty() then
	 *   sm
	 * else
	 *   sm._'context'
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier redefinitionContext();

} // State
