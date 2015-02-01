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
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Region is a top-level part of a StateMachine or a composite State, that serves as a container for the Vertices and Transitions of the StateMachine. A StateMachine or composite State may contain multiple Regions representing behaviors that may occur in parallel.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Region#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getTransitions <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Region#getSubvertices <em>Subvertex</em>}</li>
 * </ul>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Vertices that are owned by this Region.
	 * <p>From package UML::StateMachines.</p>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Transitions owned by the Region.
	 * <p>From package UML::StateMachines.</p>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine.
	 * <p>From package UML::StateMachines.</p>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region of which this region is an extension.
	 * <p>From package UML::StateMachines.</p>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State.
	 * <p>From package UML::StateMachines.</p>
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
	 * A Region can have at most one initial Vertex.
	 * self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
	 *   select(kind = PseudostateKind::initial)->size() <= 1
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
	 * A Region can have at most one deep history Vertex.
	 * self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
	 *    select(kind = PseudostateKind::deepHistory)->size() <= 1
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
	 * A Region can have at most one shallow history Vertex.
	 * subvertex->select(oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
	 *   select(kind = PseudostateKind::shallowHistory)->size() <= 1
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
	 * (stateMachine <> null implies state = null) and (state <> null implies stateMachine = null)
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
	 * The redefinition context of a Region is the nearest containing StateMachine.
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the StateMachine in which this Region is defined.
	 * result = (if stateMachine = null 
	 * then
	 *   state.containingStateMachine()
	 * else
	 *   stateMachine
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateMachine containingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation belongsToPSM () checks if the Region belongs to a ProtocolStateMachine.
	 * result = (if  stateMachine <> null 
	 * then
	 *   stateMachine.oclIsKindOf(ProtocolStateMachine)
	 * else 
	 *   state <> null  implies  state.container.belongsToPSM()
	 * endif )
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean belongsToPSM();

} // Region
