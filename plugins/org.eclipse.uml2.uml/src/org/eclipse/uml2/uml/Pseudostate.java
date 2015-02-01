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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Pseudostate is an abstraction that encompasses different types of transient Vertices in the StateMachine graph. A StateMachine instance never comes to rest in a Pseudostate, instead, it will exit and enter the Pseudostate within a single run-to-completion step.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate
		extends Vertex {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"initial"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint, initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.uml.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPseudostate_Kind()
	 * @model default="initial" required="true" ordered="false"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.uml.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StateMachine#getConnectionPoints <em>Connection Point</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates of the kind entryPoint or exitPoint.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPseudostate_StateMachine()
	 * @see org.eclipse.uml2.uml.StateMachine#getConnectionPoints
	 * @model opposite="connectionPoint" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Pseudostate#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.State#getConnectionPoints <em>Connection Point</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State that owns this Pseudostate and in which it appears.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPseudostate_State()
	 * @see org.eclipse.uml2.uml.State#getConnectionPoints
	 * @model opposite="connectionPoint" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Pseudostate#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initial Vertex can have at most one outgoing Transition.
	 * (kind = PseudostateKind::initial) implies (outgoing->size() <= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInitialVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * History Vertices can have at most one outgoing Transition.
	 * ((kind = PseudostateKind::deepHistory) or (kind = PseudostateKind::shallowHistory)) implies (outgoing->size() <= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHistoryVertices(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete StateMachine, a join Vertex must have at least two incoming Transitions and exactly one outgoing Transition.
	 * (kind = PseudostateKind::join) implies (outgoing->size() = 1 and incoming->size() >= 2)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateJoinVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Transitions incoming a join Vertex must originate in different Regions of an orthogonal State.
	 * (kind = PseudostateKind::join) implies
	 * 
	 * -- for any pair of incoming transitions there exists an orthogonal state which contains the source vetices of these transitions 
	 * -- such that these source vertices belong to different regions of that orthogonal state 
	 * 
	 * incoming->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.source, t2.source) in
	 * 	((contState <> null) and (contState.region
	 * 		->exists(r1:Region, r2: Region | (r1 <> r2) and t1.source.isContainedInRegion(r1) and t2.source.isContainedInRegion(r2)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTransitionsIncoming(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete StateMachine, a fork Vertex must have at least two outgoing Transitions and exactly one incoming Transition.
	 * (kind = PseudostateKind::fork) implies (incoming->size() = 1 and outgoing->size() >= 2)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateForkVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions outgoing a fork vertex must target states in different regions of an orthogonal state.
	 * (kind = PseudostateKind::fork) implies
	 * 
	 * -- for any pair of outgoing transitions there exists an orthogonal state which contains the targets of these transitions 
	 * -- such that these targets belong to different regions of that orthogonal state 
	 * 
	 * outgoing->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.target, t2.target) in
	 * 	((contState <> null) and (contState.region
	 * 		->exists(r1:Region, r2: Region | (r1 <> r2) and t1.target.isContainedInRegion(r1) and t2.target.isContainedInRegion(r2)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTransitionsOutgoing(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete StateMachine, a junction Vertex must have at least one incoming and one outgoing Transition.
	 * (kind = PseudostateKind::junction) implies (incoming->size() >= 1 and outgoing->size() >= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateJunctionVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete statemachine, a choice Vertex must have at least one incoming and one outgoing Transition.
	 * (kind = PseudostateKind::choice) implies (incoming->size() >= 1 and outgoing->size() >= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateChoiceVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing Transition from an initial vertex may have a behavior, but not a trigger or a guard.
	 * (kind = PseudostateKind::initial) implies (outgoing.guard = null and outgoing.trigger->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOutgoingFromInitial(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Pseudostate
