/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProtocolTransition.java,v 1.10 2005/11/21 21:48:02 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A protocol transition (transition as specialized in the ProtocolStateMachines package) specifies a legal transition for an operation. Transitions of protocol state machines have the following information: a pre condition (guard), on trigger, and a post condition. Every protocol transition is associated to zero or one operation (referred BehavioralFeature) that belongs to the context classifier of the protocol state machine. The protocol transition specifies that the associated (referred) operation can be called for an instance in the origin state under the initial condition (guard), and that at the end of the transition, the destination state will be reached under the final condition (post). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.ProtocolTransition#getReferreds <em>Referred</em>}</li>
 *   <li>{@link org.eclipse.uml2.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProtocolTransition()
 * @model
 * @generated
 */
public interface ProtocolTransition extends Transition{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the post condition of the transition which is the condition that should be obtained once the transition is triggered. This post condition is part of the post condition of the operation connected to the transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getProtocolTransition_PostCondition()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ProtocolTransition#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);


	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getPostCondition()
	 * @generated
	 */
    Constraint createPostCondition(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getPostCondition()
	 * @generated
	 */
    Constraint createPostCondition();

	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProtocolTransition_Referred()
	 * @model type="org.eclipse.uml2.Operation" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getReferreds();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Operation} with the specified '<em><b>Name</b></em>' from the '<em><b>Referred</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Operation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getReferreds()
	 * @generated
	 */
    Operation getReferred(String name);

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the precondition of the transition. It specifies the condition that should be verified before triggering the transition. This guard condition added to the source state will be evaluated as part of the precondition of the operation refered by the transition if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getProtocolTransition_PreCondition()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);


} // ProtocolTransition
