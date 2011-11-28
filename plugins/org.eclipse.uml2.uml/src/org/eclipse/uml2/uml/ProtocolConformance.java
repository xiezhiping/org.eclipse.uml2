/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Protocol state machines can be redefined into more specific protocol state machines, or into behavioral state machines. Protocol conformance declares that the specific protocol state machine specifies a protocol that conforms to the general state machine one, or that the specific behavioral state machine abide by the protocol of the general protocol state machine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 * </p>
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
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the protocol state machine to which the specific state machine conforms.
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
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the state machine which conforms to the general state machine.
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
