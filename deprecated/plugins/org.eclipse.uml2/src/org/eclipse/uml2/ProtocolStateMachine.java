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
 * $Id: ProtocolStateMachine.java,v 1.6 2005/04/04 20:11:16 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ProtocolStateMachine#getConformances <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProtocolStateMachine()
 * @model
 * @generated
 */
public interface ProtocolStateMachine extends StateMachine{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ProtocolConformance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * : Conformance between protocol state machines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getProtocolStateMachine_Conformance()
	 * @see org.eclipse.uml2.ProtocolConformance#getSpecificMachine
	 * @model type="org.eclipse.uml2.ProtocolConformance" opposite="specificMachine" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getConformances();

    /**
     * Creates a {@link org.eclipse.uml2.ProtocolConformance} and appends it to the '<em><b>Conformance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ProtocolConformance} to create.
	 * @return The new {@link org.eclipse.uml2.ProtocolConformance}.
	 * @see #getConformances()
	 * @generated
     */
    ProtocolConformance createConformance(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

} // ProtocolStateMachine
