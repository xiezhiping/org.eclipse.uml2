/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProtocolStateMachine can be redefined into a more specific ProtocolStateMachine or into behavioral StateMachine. ProtocolConformance declares that the specific ProtocolStateMachine specifies a protocol that conforms to the general ProtocolStateMachine or that the specific behavioral StateMachine abides by the protocol of the general ProtocolStateMachine.
 * <p>From package UML::StateMachines.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolConformance()
 * @model
 * @generated
 */
public interface ProtocolConformance
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>General Machine</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ProtocolStateMachine to which the specific ProtocolStateMachine conforms.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Machine</em>' reference.
	 * @see #setGeneralMachine(ProtocolStateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolConformance_GeneralMachine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getGeneralMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProtocolConformance#getGeneralMachine <em>General Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Machine</em>' reference.
	 * @see #getGeneralMachine()
	 * @generated
	 */
	void setGeneralMachine(ProtocolStateMachine value);

	/**
	 * Returns the value of the '<em><b>Specific Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ProtocolStateMachine#getConformances <em>Conformance</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ProtocolStateMachine which conforms to the general ProtocolStateMachine.
	 * <p>From package UML::StateMachines.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Machine</em>' container reference.
	 * @see #setSpecificMachine(ProtocolStateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProtocolConformance_SpecificMachine()
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#getConformances
	 * @model opposite="conformance" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getSpecificMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Machine</em>' container reference.
	 * @see #getSpecificMachine()
	 * @generated
	 */
	void setSpecificMachine(ProtocolStateMachine value);

} // ProtocolConformance
