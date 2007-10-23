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
 * $Id: Region.java,v 1.16 2007/10/23 15:54:21 jbruck Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A region is an orthogonal part of either a composite state or a state machine. It contains states and transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Region#getSubvertices <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getTransitions <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getRegion()
 * @model
 * @generated
 */
public interface Region
		extends Namespace, RedefinableElement {

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Vertex}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Vertex#getContainer <em>Container</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of vertices that are owned by this region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRegion_Subvertex()
	 * @see org.eclipse.uml2.uml.Vertex#getContainer
	 * @model opposite="container" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getSubvertices();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Vertex}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Vertex}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Vertex} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Vertex}.
	 * @see #getSubvertices()
	 * @generated
	 */
	Vertex createSubvertex(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Vertex} with the specified '<em><b>Name</b></em>' from the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Vertex} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Vertex} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubvertices()
	 * @generated
	 */
	Vertex getSubvertex(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Vertex} with the specified '<em><b>Name</b></em>' from the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Vertex} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Vertex} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Vertex} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Vertex} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubvertices()
	 * @generated
	 */
	Vertex getSubvertex(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Transition#getContainer <em>Container</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of transitions owned by the region. Note that internal transitions are owned by a region, but applies to the source state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRegion_Transition()
	 * @see org.eclipse.uml2.uml.Transition#getContainer
	 * @model opposite="container" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Transition}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Transition}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Transition} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Transition}.
	 * @see #getTransitions()
	 * @generated
	 */
	Transition createTransition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Transition}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Transition}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Transition}.
	 * @see #getTransitions()
	 * @generated
	 */
	Transition createTransition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTransitions()
	 * @generated
	 */
	Transition getTransition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Transition} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTransitions()
	 * @generated
	 */
	Transition getTransition(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.State#getRegions <em>Region</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRegion_State()
	 * @see org.eclipse.uml2.uml.State#getRegions
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region of which this region is an extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Region</em>' reference.
	 * @see #setExtendedRegion(Region)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRegion_ExtendedRegion()
	 * @model ordered="false"
	 * @generated
	 */
	Region getExtendedRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Region#getExtendedRegion <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' reference.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(Region value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StateMachine#getRegions <em>Region</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRegion_StateMachine()
	 * @see org.eclipse.uml2.uml.StateMachine#getRegions
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one initial vertex
	 * self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #initial)->size() <= 1
	 * 
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
	 * A region can have at most one deep history vertex
	 * self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #deepHistory)->size() <= 1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeepHistoryVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one shallow history vertex
	 * self.subvertex->select(v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #shallowHistory)->size() <= 1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateShallowHistoryVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Region is owned by a StateMachine, then it cannot also be owned by a State and vice versa.
	 * (stateMachine->notEmpty() implies state->isEmpty()) and (state->notEmpty() implies stateMachine->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOwned(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a region is the nearest containing statemachine
	 * result = let sm = containingStateMachine() in
	 * if sm.context->isEmpty() or sm.general->notEmpty() then
	 * sm
	 * else
	 * sm.context
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier redefinitionContext();

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
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a region are properly related to the redefinition contexts of the specified region to allow this element to redefine the other. The containing statemachine/state of a redefining region must redefine the containing statemachine/state of the redefined region.
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" redefinedRequired="true" redefinedOrdered="false"
	 * @generated
	 */
	boolean isRedefinitionContextValid(Region redefined);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the sate machine in which this Region is defined
	 * result = if stateMachine->isEmpty() 
	 * then
	 * state.containingStateMachine()
	 * else
	 * stateMachine
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateMachine containingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation belongsToPSM () checks if the region belongs to a protocol state machine
	 * result = if not stateMachine->isEmpty() then
	 * oclIsTypeOf(ProtocolStateMachine)
	 * else if not state->isEmpty() then
	 * state.container.belongsToPSM ()
	 * else false
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean belongsToPSM();

} // Region
