/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StateMachine.java,v 1.14 2007/10/23 15:54:22 jbruck Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State machines can be used to express the behavior of part of a system. Behavior is modeled as a traversal of a graph of state nodes interconnected by one or more joined transition arcs that are triggered by the dispatching of series of (event) occurrences. During this traversal, the state machine executes a series of activities associated with various elements of the state machine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getSubmachineStates <em>Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getExtendedStateMachines <em>Extended State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine
		extends Behavior {

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Region}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Region#getStateMachine <em>State Machine</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regions owned directly by the state machine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_Region()
	 * @see org.eclipse.uml2.uml.Region#getStateMachine
	 * @model opposite="stateMachine" containment="true" resolveProxies="true" required="true" ordered="false"
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
	 * Returns the value of the '<em><b>Submachine State</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.State}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.State#getSubmachine <em>Submachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the submachine(s) in case of a submachine state. Multiple machines are referenced in case of a concurrent state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submachine State</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_SubmachineState()
	 * @see org.eclipse.uml2.uml.State#getSubmachine
	 * @model opposite="submachine" ordered="false"
	 * @generated
	 */
	EList<State> getSubmachineStates();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>' from the '<em><b>Submachine State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.State} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubmachineStates()
	 * @generated
	 */
	State getSubmachineState(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>' from the '<em><b>Submachine State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.State} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.State} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubmachineStates()
	 * @generated
	 */
	State getSubmachineState(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Pseudostate#getStateMachine <em>State Machine</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points defined for this state machine. They represent the interface of the state machine when used as part of submachine state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_ConnectionPoint()
	 * @see org.eclipse.uml2.uml.Pseudostate#getStateMachine
	 * @model opposite="stateMachine" containment="true" resolveProxies="true" ordered="false"
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
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.StateMachine}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state machines of which this is an extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_ExtendedStateMachine()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StateMachine> getExtendedStateMachines();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StateMachine} with the specified '<em><b>Name</b></em>' from the '<em><b>Extended State Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StateMachine} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.StateMachine} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtendedStateMachines()
	 * @generated
	 */
	StateMachine getExtendedStateMachine(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StateMachine} with the specified '<em><b>Name</b></em>' from the '<em><b>Extended State Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StateMachine} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.StateMachine} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.StateMachine} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtendedStateMachines()
	 * @generated
	 */
	StateMachine getExtendedStateMachine(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier context of a state machine cannot be an interface.
	 * context->notEmpty() implies not context.oclIsKindOf(Interface)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClassifierContext(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context classifier of the method state machine of a behavioral feature must be the classifier that owns the behavioral feature.
	 * specification->notEmpty() implies (context->notEmpty() and specification->featuringClassifier->exists (c | c = context))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateContextClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points of a state machine are pseudostates of kind entry point or exit point.
	 * conectionPoint->forAll (c | c.kind = #entryPoint or c.kind = #exitPoint)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConnectionPoints(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state machine as the method for a behavioral feature cannot have entry/exit connection points.
	 * specification->notEmpty() implies connectionPoint->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMethod(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation LCA(s1,s2) returns an orthogonal state or region which is the least common ancestor of states s1 and s2, based on the statemachine containment hierarchy.
	 * true
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 * @generated
	 */
	Namespace LCA(State s1, State s2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query ancestor(s1, s2) checks whether s2 is an ancestor state of state s1. context StateMachine::ancestor (s1 : State, s2 : State) : Boolean
	 * 
	 * result = if (s2 = s1) then
	 * true
	 * else if (s1.container->isEmpty) then
	 * true
	 * else if (s2.container->isEmpty) then
	 * false
	 * else (ancestor (s1, s2.container))
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 * @generated
	 */
	boolean ancestor(State s1, State s2);

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a statemachine are properly related to the redefinition contexts of the specified statemachine to allow this element to redefine the other. The containing classifier of a redefining statemachine must redefine the containing classifier of the redefined statemachine.
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" redefinedRequired="true" redefinedOrdered="false"
	 * @generated
	 */
	boolean isRedefinitionContextValid(StateMachine redefined);

} // StateMachine
