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
 * $Id: StateMachine.java,v 1.1 2005/11/14 22:26:00 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A state machine owns one or more regions, which in turn own vertices and transitions.
 * 
 * The behaviored classifier context owning a state machine defines which signal and call triggers are defined for the state machine, and which attributes and operations are available in activities of the state machine. Signal triggers and call triggers for the state machine are defined according to the receptions and operations of this classifier.
 * 
 * 
 * 
 * As a kind of behavior, a state machine may have an associated behavioral feature (specification) and be the method of this behavioral feature. In this case the state machine specifies the behavior of this behavioral feature. The parameters of the state machine in this case match the parameters of the behavioral feature and provide the means for accessing (within the state machine) the behavioral feature parameters.
 * 
 * 
 * 
 * A state machine without a context classifier may use triggers that are independent of receptions or operations of a classifier, i.e. either just signal triggers or call triggers based upon operation template parameters of the (parameterized) statemachine.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regions owned directly by the state machine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_Region()
	 * @see org.eclipse.uml2.uml.Region#getStateMachine
	 * @model type="org.eclipse.uml2.uml.Region" opposite="stateMachine" containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	List getRegions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Region} and appends it to the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Region}.
	 * @see #getRegions()
	 * @generated
	 */
	Region createRegion();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Region} with the specified '<em><b>Name</b></em>' from the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Region} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Region} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRegions()
	 * @generated
	 */
	Region getRegion(String name);

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Pseudostate#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points defined for this state machine. They represent the interface of the state machine when used as part of submachine state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_ConnectionPoint()
	 * @see org.eclipse.uml2.uml.Pseudostate#getStateMachine
	 * @model type="org.eclipse.uml2.uml.Pseudostate" opposite="stateMachine" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getConnectionPoints();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Pseudostate} and appends it to the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Pseudostate}.
	 * @see #getConnectionPoints()
	 * @generated
	 */
	Pseudostate createConnectionPoint();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnectionPoints()
	 * @generated
	 */
	Pseudostate getConnectionPoint(String name);

	/**
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state machines of which this is an extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' reference.
	 * @see #setExtendedStateMachine(StateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getStateMachine_ExtendedStateMachine()
	 * @model ordered="false"
	 * @generated
	 */
	StateMachine getExtendedStateMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended State Machine</em>' reference.
	 * @see #getExtendedStateMachine()
	 * @generated
	 */
	void setExtendedStateMachine(StateMachine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier context of a state machine cannot be an interface.
	 * context->notEmpty() implies not context.oclIsKindOf(Interface)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClassifierContext(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context classifier of the method state machine of a behavioral feature must be the classifier that owns the behavioral feature.
	 * specification->notEmpty() implies (context->notEmpty() and specification->featuringClassifier->exists (c | c = context))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateContextClassifier(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points of a state machine are pseudostates of kind entry point or exit point.
	 * conectionPoint->forAll (c | c.kind = #entryPoint or c.kind = #exitPoint)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConnectionPoints(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state machine as the method for a behavioral feature cannot have entry/exit connection points.
	 * specification->notEmpty() implies connectionPoint->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMethod(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation LCA(s1,s2) returns an orthogonal state or region which is the least common ancestor of states s1 and s2, based on the statemachine containment hierarchy.
	 * true
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	Namespace LCA(State s1, State s2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query ancestor(s1, s2) checks whether s2 is an ancestor state of state s1. context StateMachine::ancestor (s1 : State, s2 : State) : Boolean
	 * 
	 * 
	 * result = if (s2 = s1) then
	 * true
	 * else if (s1.container->isEmpty) then
	 * true
	 * else if (s2.container->isEmpty) then
	 * false
	 * else (ancestor (s1, s2.container))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean ancestor(State s1, State s2);

} // StateMachine
