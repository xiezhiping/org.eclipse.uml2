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
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectionPointReference represents a usage (as part of a submachine State) of an entry/exit point Pseudostate defined in the StateMachine referenced by the submachine State.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#getExits <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference()
 * @model
 * @generated
 */
public interface ConnectionPointReference
		extends Vertex {

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entryPoint Pseudostates corresponding to this connection point.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference_Entry()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getEntries();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEntries()
	 * @generated
	 */
	Pseudostate getEntry(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEntries()
	 * @generated
	 */
	Pseudostate getEntry(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exitPoints kind Pseudostates corresponding to this connection point.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference_Exit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getExits();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExits()
	 * @generated
	 */
	Pseudostate getExit(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExits()
	 * @generated
	 */
	Pseudostate getExit(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.State#getConnections <em>Connection</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State in which the ConnectionPointReference is defined.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference_State()
	 * @see org.eclipse.uml2.uml.State#getConnections
	 * @model opposite="connection" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ConnectionPointReference#getState <em>State</em>}' container reference.
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
	 * The entry Pseudostates must be Pseudostates with kind entryPoint.
	 * entry->forAll(kind = PseudostateKind::entryPoint)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEntryPseudostates(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exit Pseudostates must be Pseudostates with kind exitPoint.
	 * exit->forAll(kind = PseudostateKind::exitPoint)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExitPseudostates(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ConnectionPointReference
