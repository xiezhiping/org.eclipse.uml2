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
 * $Id: ReplyAction.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReplyAction#getReplyValues <em>Reply Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getReplyAction()
 * @model 
 * @generated
 */
public interface ReplyAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To Call</em>' reference.
	 * @see #setReplyToCall(CallTrigger)
	 * @see org.eclipse.uml2.UML2Package#getReplyAction_ReplyToCall()
	 * @model required="true"
	 * @generated
	 */
	CallTrigger getReplyToCall();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReplyAction#getReplyToCall <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To Call</em>' reference.
	 * @see #getReplyToCall()
	 * @generated
	 */
	void setReplyToCall(CallTrigger value);

	/**
	 * Returns the value of the '<em><b>Reply Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Value</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getReplyAction_ReplyValue()
	 * @model type="org.eclipse.uml2.InputPin" ordered="false"
	 * @generated
	 */
	EList getReplyValues();

    /**
     * Retrieves the {@link org.eclipse.uml2.InputPin} with the specified name from the '<em><b>Reply Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.InputPin} with the specified name, or <code>null</code>.
	 * @see #getReplyValues()
	 * @generated
     */
    InputPin getReplyValue(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Information</em>' reference.
	 * @see #setReturnInformation(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getReplyAction_ReturnInformation()
	 * @model required="true"
	 * @generated
	 */
	InputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReplyAction#getReturnInformation <em>Return Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getInputs();

} // ReplyAction
