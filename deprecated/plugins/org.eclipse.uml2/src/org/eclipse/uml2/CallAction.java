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
 * $Id: CallAction.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.CallAction#isSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link org.eclipse.uml2.CallAction#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getCallAction()
 * @model abstract="true"
 * @generated
 */
public interface CallAction extends InvocationAction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #setIsSynchronous(boolean)
	 * @see org.eclipse.uml2.UML2Package#getCallAction_IsSynchronous()
	 * @model default="true" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.CallAction#isSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getCallAction_Result()
	 * @model type="org.eclipse.uml2.OutputPin" containment="true"
	 * @generated
	 */
	EList getResults();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getResults()
	 * @generated
     */
    OutputPin getResult(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResults()
	 * @generated
     */
    OutputPin createResult(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOutputs();

} // CallAction
