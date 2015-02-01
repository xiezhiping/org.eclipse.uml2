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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Vertex is an abstraction of a node in a StateMachine graph. It can be the source or destination of any number of Transitions.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#getOutgoings <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Transitions departing from this Vertex.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getVertex_Outgoing()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoings();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
	 */
	Transition getOutgoing(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
	 */
	Transition getOutgoing(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Transitions entering this Vertex.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getVertex_Incoming()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncomings();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
	 */
	Transition getIncoming(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Transition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Transition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
	 */
	Transition getIncoming(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Region#getSubvertices <em>Subvertex</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Region that contains this Vertex.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.eclipse.uml2.uml.UMLPackage#getVertex_Container()
	 * @see org.eclipse.uml2.uml.Region#getSubvertices
	 * @model opposite="subvertex" transient="false" ordered="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the StateMachine in which this Vertex is defined.
	 * result = (if container <> null
	 * then
	 * -- the container is a region
	 *    container.containingStateMachine()
	 * else 
	 *    if (self.oclIsKindOf(Pseudostate)) and ((self.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint) or (self.oclAsType(Pseudostate).kind = PseudostateKind::exitPoint)) then
	 *       self.oclAsType(Pseudostate).stateMachine
	 *    else 
	 *       if (self.oclIsKindOf(ConnectionPointReference)) then
	 *           self.oclAsType(ConnectionPointReference).state.containingStateMachine() -- no other valid cases possible
	 *       else 
	 *           null
	 *       endif
	 *    endif
	 * endif
	 * )
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
	 * This utility operation returns true if the Vertex is contained in the State s (input argument).
	 * result = (if not s.isComposite() or container->isEmpty() then
	 * 	false
	 * else
	 * 	if container.state = s then 
	 * 		true
	 * 	else
	 * 		container.state.isContainedInState(s)
	 * 	endif
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" sRequired="true" sOrdered="false"
	 * @generated
	 */
	boolean isContainedInState(State s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This utility query returns true if the Vertex is contained in the Region r (input argument).
	 * result = (if (container = r) then
	 * 	true
	 * else
	 * 	if (r.state->isEmpty()) then
	 * 		false
	 * 	else
	 * 		container.state.isContainedInRegion(r)
	 * 	endif
	 * endif)
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" rRequired="true" rOrdered="false"
	 * @generated
	 */
	boolean isContainedInRegion(Region r);

} // Vertex
