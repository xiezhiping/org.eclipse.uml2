/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InvocationAction#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.InvocationAction#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInvocationAction()
 * @model abstract="true"
 * @generated
 */
public interface InvocationAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * @see org.eclipse.uml2.UML2Package#getInvocationAction_Argument()
	 * @model type="org.eclipse.uml2.InputPin" containment="true"
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
	 * Returns the value of the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Port</em>' reference.
	 * @see #setOnPort(Port)
	 * @see org.eclipse.uml2.UML2Package#getInvocationAction_OnPort()
	 * @model 
	 * @generated
	 */
	Port getOnPort();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InvocationAction#getOnPort <em>On Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Port</em>' reference.
	 * @see #getOnPort()
	 * @generated
	 */
	void setOnPort(Port value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getInputs();

} // InvocationAction
