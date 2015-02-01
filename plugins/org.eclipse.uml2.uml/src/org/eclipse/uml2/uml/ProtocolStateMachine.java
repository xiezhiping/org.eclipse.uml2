/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
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
 * A ProtocolStateMachine is always defined in the context of a Classifier. It specifies which BehavioralFeatures of the Classifier can be called in which State and under which conditions, thus specifying the allowed invocation sequences on the Classifier's BehavioralFeatures. A ProtocolStateMachine specifies the possible and permitted Transitions on the instances of its context Classifier, together with the BehavioralFeatures that carry the Transitions. In this manner, an instance lifecycle can be specified for a Classifier, by defining the order in which the BehavioralFeatures can be activated and the States through which an instance progresses during its existence.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#getConformances <em>Conformance</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conformance between ProtocolStateMachine
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolStateMachine_Conformance()
	 * @see org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine
	 * @model opposite="specificMachine" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ProtocolConformance> getConformances();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ProtocolConformance}, with the specified '<em><b>General Machine</b></em>', and appends it to the '<em><b>Conformance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param generalMachine The '<em><b>General Machine</b></em>' for the new {@link org.eclipse.uml2.uml.ProtocolConformance}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ProtocolConformance}.
	 * @see #getConformances()
	 * @generated
	 */
	ProtocolConformance createConformance(ProtocolStateMachine generalMachine);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ProtocolConformance} with the specified '<em><b>General Machine</b></em>' from the '<em><b>Conformance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param generalMachine The '<em><b>General Machine</b></em>' of the {@link org.eclipse.uml2.uml.ProtocolConformance} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ProtocolConformance} with the specified '<em><b>General Machine</b></em>', or <code>null</code>.
	 * @see #getConformances()
	 * @generated
	 */
	ProtocolConformance getConformance(ProtocolStateMachine generalMachine);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ProtocolConformance} with the specified '<em><b>General Machine</b></em>' from the '<em><b>Conformance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param generalMachine The '<em><b>General Machine</b></em>' of the {@link org.eclipse.uml2.uml.ProtocolConformance} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ProtocolConformance} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ProtocolConformance} with the specified '<em><b>General Machine</b></em>', or <code>null</code>.
	 * @see #getConformances()
	 * @generated
	 */
	ProtocolConformance getConformance(ProtocolStateMachine generalMachine,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Transitions of a ProtocolStateMachine must be ProtocolTransitions.
	 * region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateProtocolTransitions(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of a ProtocolStateMachine cannot have entry, exit, or do activity Behaviors.
	 * region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies
	 * (v.oclAsType(State).entry->isEmpty() and v.oclAsType(State).exit->isEmpty() and v.oclAsType(State).doActivity->isEmpty())))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEntryExitDo(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProtocolStateMachines cannot have deep or shallow history Pseudostates.
	 * region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Pseudostate) implies
	 * ((v.oclAsType(Pseudostate).kind <>  PseudostateKind::deepHistory) and (v.oclAsType(Pseudostate).kind <> PseudostateKind::shallowHistory))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeepOrShallowHistory(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ProtocolStateMachine
