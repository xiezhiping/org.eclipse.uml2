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
 * $Id: ConnectionPointReference.java,v 1.2 2005/11/22 15:32:38 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connection point references of a submachine state can be used as sources/targets of transitions. They represent entries into or exits out of the submachine state machine referenced by the submachine state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#getExits <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#getState <em>State</em>}</li>
 * </ul>
 * </p>
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
	 * The entryPoint kind pseudo states corresponding to this connection point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference_Entry()
	 * @model type="org.eclipse.uml2.uml.Pseudostate" ordered="false"
	 * @generated
	 */
	List getEntries();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEntries()
	 * @generated
	 */
	Pseudostate getEntry(String name);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exitPoints kind pseudo states corresponding to this connection point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference_Exit()
	 * @model type="org.eclipse.uml2.uml.Pseudostate" ordered="false"
	 * @generated
	 */
	List getExits();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Pseudostate} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExits()
	 * @generated
	 */
	Pseudostate getExit(String name);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.State#getConnections <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State in which the connection point refreshens are defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectionPointReference_State()
	 * @see org.eclipse.uml2.uml.State#getConnections
	 * @model opposite="connection" resolveProxies="false" ordered="false"
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
	 * entry->notEmpty() implies entry->forAll(e | e.kind = #entryPoint)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEntryPseudostates(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exit Pseudostates must be Pseudostates with kind exitPoint.
	 * exit->notEmpty() implies exit->forAll(e | e.kind = #exitPoint)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExitPseudostates(DiagnosticChain diagnostics, Map context);

} // ConnectionPointReference
