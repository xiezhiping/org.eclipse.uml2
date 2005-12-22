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
 * $Id: ProtocolTransition.java,v 1.8 2005/12/22 22:44:54 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A protocol transition (transition as specialized in the ProtocolStateMachines package) specifies a legal transition for an operation. Transitions of protocol state machines have the following information: a pre condition (guard), on trigger, and a post condition. Every protocol transition is associated to zero or one operation (referred BehavioralFeature) that belongs to the context classifier of the protocol state machine.
 * 
 * 
 * 
 * The protocol transition specifies that the associated (referred) operation can be called for an instance in the origin state under the initial condition (guard), and that at the end of the transition, the destination state will be reached under the final condition (post).
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#getReferreds <em>Referred</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolTransition()
 * @model
 * @generated
 */
public interface ProtocolTransition
		extends Transition {

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the post condition of the transition which is the condition that should be obtained once the transition is triggered. This post condition is part of the post condition of the operation connected to the transition.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Constraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolTransition_PostCondition()
	 * @model containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProtocolTransition#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and sets the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPostCondition()
	 * @generated
	 */
	Constraint createPostCondition(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and sets the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPostCondition()
	 * @generated
	 */
	Constraint createPostCondition();

	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association refers to the associated operation. It is derived from the operation of the call trigger when applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referred</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolTransition_Referred()
	 * @model type="org.eclipse.uml2.uml.Operation" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getReferreds();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>' from the '<em><b>Referred</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getReferreds()
	 * @generated
	 */
	Operation getReferred(String name);

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the precondition of the transition. It specifies the condition that should be verified before triggering the transition. This guard condition added to the source state will be evaluated as part of the precondition of the operation referred by the transition if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference.
	 * @see #setPreCondition(Constraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolTransition_PreCondition()
	 * @model containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' containment reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and sets the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPreCondition()
	 * @generated
	 */
	Constraint createPreCondition(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and sets the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPreCondition()
	 * @generated
	 */
	Constraint createPreCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol transition always belongs to a protocol state machine.
	 * container.belongsToPSM()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBelongsToPsm(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol transition never has associated actions.
	 * effect->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociatedActions(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a protocol transition refers to an operation (i. e. has a call trigger corresponding to an operation), then that operation should apply to the context classifier of the state machine of the protocol transition.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRefersToOperation(DiagnosticChain diagnostics, Map context);

} // ProtocolTransition
