/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: InteractionOccurrence.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to an interaction with actual values. The interpretation is that the sequence diagram replaces the reference (with actual parameters substituted)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InteractionOccurrence#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionOccurrence#getActualGates <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.InteractionOccurrence#getArguments <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInteractionOccurrence()
 * @model 
 * @generated
 */
public interface InteractionOccurrence extends InteractionFragment{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see org.eclipse.uml2.UML2Package#getInteractionOccurrence_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InteractionOccurrence#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteractionOccurrence_ActualGate()
	 * @model type="org.eclipse.uml2.Gate" containment="true" ordered="false"
	 * @generated
	 */
	EList getActualGates();

    /**
     * Retrieves the {@link org.eclipse.uml2.Gate} with the specified name from the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Gate} to retrieve.
	 * @return The {@link org.eclipse.uml2.Gate} with the specified name, or <code>null</code>.
	 * @see #getActualGates()
	 * @generated
     */
    Gate getActualGate(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Gate} and appends it to the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Gate} to create.
	 * @return The new {@link org.eclipse.uml2.Gate}.
	 * @see #getActualGates()
	 * @generated
     */
    Gate createActualGate(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInteractionOccurrence_Argument()
	 * @model type="org.eclipse.uml2.InputPin" containment="true" ordered="false"
	 * @generated
	 */
	EList getArguments();

    /**
     * Retrieves the {@link org.eclipse.uml2.InputPin} with the specified name from the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.InputPin} with the specified name, or <code>null</code>.
	 * @see #getArguments()
	 * @generated
     */
    InputPin getArgument(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and appends it to the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getArguments()
	 * @generated
     */
    InputPin createArgument(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // InteractionOccurrence
