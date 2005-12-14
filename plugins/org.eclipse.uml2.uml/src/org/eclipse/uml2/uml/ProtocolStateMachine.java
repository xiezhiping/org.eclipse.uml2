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
 * $Id: ProtocolStateMachine.java,v 1.2 2005/12/14 22:34:16 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A protocol state machine is always defined in the context of a classifier. It specifies which operations of the classifier can be called in which state and under which condition, thus specifying the allowed call sequences on the classifier's operations. A protocol state machine presents the possible and permitted transitions on the instances of its context classifier, together with the operations which carry the transitions. In this manner, an instance lifecycle can be created for a classifier, by specifying the order in which the operations can be activated and the states through which an instance progresses during its existence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#getConformances <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolStateMachine()
 * @model
 * @generated
 */
public interface ProtocolStateMachine
		extends StateMachine {

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ProtocolConformance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conformance between protocol state machines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolStateMachine_Conformance()
	 * @see org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine
	 * @model type="org.eclipse.uml2.uml.ProtocolConformance" opposite="specificMachine" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getConformances();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ProtocolConformance} and appends it to the '<em><b>Conformance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ProtocolConformance}.
	 * @see #getConformances()
	 * @generated
	 */
	ProtocolConformance createConformance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions of a protocol state machine must be protocol transitions. (transitions as extended by the ProtocolStateMachines package)
	 * region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateProtocolTransitions(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of a protocol state machine cannot have entry, exit, or do activity actions.
	 * region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies
	 * (v.entry->isEmpty() and v.exit->isEmpty() and v.doActivity->isEmpty())))
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEntryExitDo(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protocol state machines cannot have deep or shallow history pseudostates.
	 * region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Psuedostate) implies
	 * ((v.kind <> #deepHistory) and (v.kind <> #shallowHistory)))))
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeepOrShallowHistory(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If two ports are connected, then the protocol state machine of the required interface (if defined) must be conformant to the protocol state machine of the provided interface (if defined).
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePortsConnected(DiagnosticChain diagnostics, Map context);

} // ProtocolStateMachine
