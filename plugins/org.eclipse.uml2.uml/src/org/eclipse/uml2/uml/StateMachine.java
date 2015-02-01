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
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StateMachines can be used to express event-driven behaviors of parts of a system. Behavior is modeled as a traversal of a graph of Vertices interconnected by one or more joined Transition arcs that are triggered by the dispatching of successive Event occurrences. During this traversal, the StateMachine may execute a sequence of Behaviors associated with various elements of the StateMachine.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getSubmachineStates <em>Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getExtendedStateMachines <em>Extended State Machine</em>}</li>
 * </ul>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Regions owned directly by the StateMachine.
	 * <p>From package UML::StateMachines.</p>
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
	 * References the submachine(s) in case of a submachine State. Multiple machines are referenced in case of a concurrent State.
	 * <p>From package UML::StateMachines.</p>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points defined for this StateMachine. They represent the interface of the StateMachine when used as part of submachine State
	 * <p>From package UML::StateMachines.</p>
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
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Behavior#getRedefinedBehaviors() <em>Redefined Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachines of which this is an extension.
	 * <p>From package UML::StateMachines.</p>
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
	 * The Classifier context of a StateMachine cannot be an Interface.
	 * _'context' <> null implies not _'context'.oclIsKindOf(Interface)
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
	 * The context Classifier of the method StateMachine of a BehavioralFeature must be the Classifier that owns the BehavioralFeature.
	 * specification <> null implies ( _'context' <> null and specification.featuringClassifier->exists(c | c = _'context'))
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
	 * The operation LCA(s1,s2) returns the Region that is the least common ancestor of Vertices s1 and s2, based on the StateMachine containment hierarchy.
	 * result = (if ancestor(s1, s2) then 
	 *     s2.container
	 * else
	 * 	if ancestor(s2, s1) then
	 * 	    s1.container 
	 * 	else 
	 * 	    LCA(s1.container.state, s2.container.state)
	 * 	endif
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 * @generated
	 */
	Region LCA(Vertex s1, Vertex s2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query ancestor(s1, s2) checks whether Vertex s2 is an ancestor of Vertex s1.
	 * result = (if (s2 = s1) then 
	 * 	true 
	 * else 
	 * 	if s1.container.stateMachine->notEmpty() then 
	 * 	    true
	 * 	else 
	 * 	    if s2.container.stateMachine->notEmpty() then 
	 * 	        false
	 * 	    else
	 * 	        ancestor(s1, s2.container.state)
	 * 	     endif
	 * 	 endif
	 * endif  )
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 * @generated
	 */
	boolean ancestor(Vertex s1, Vertex s2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This utility funciton is like the LCA, except that it returns the nearest composite State that contains both input Vertices.
	 * result = (if v2.oclIsTypeOf(State) and ancestor(v1, v2) then
	 * 	v2.oclAsType(State)
	 * else if v1.oclIsTypeOf(State) and ancestor(v2, v1) then
	 * 	v1.oclAsType(State)
	 * else if (v1.container.state->isEmpty() or v2.container.state->isEmpty()) then 
	 * 	null.oclAsType(State)
	 * else LCAState(v1.container.state, v2.container.state)
	 * endif endif endif)
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" v1Required="true" v1Ordered="false" v2Required="true" v2Ordered="false"
	 * @generated
	 */
	State LCAState(Vertex v1, Vertex v2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points of a StateMachine are Pseudostates of kind entry point or exit point.
	 * connectionPoint->forAll (kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)
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
	 * A StateMachine as the method for a BehavioralFeature cannot have entry/exit connection points.
	 * specification <> null implies connectionPoint->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMethod(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // StateMachine
