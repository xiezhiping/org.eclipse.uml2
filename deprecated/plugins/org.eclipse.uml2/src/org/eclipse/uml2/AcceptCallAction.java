/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: AcceptCallAction.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (CompleteActions) AcceptCallAction is an accept event action representing the receipt of a synchronous call request. In addition to the normal operation parameters, the action produces a output token that is needed later to supply the information to the ReplyAction necessary to return control to the caller. This action is for synchronous calls. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getAcceptCallAction()
 * @model
 * @generated
 */
public interface AcceptCallAction extends AcceptEventAction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pin where a token is placed containing sufficient information to perform a subsequent reply and return control to the caller. The value in this token is opaque. It can be passed and copied but it cannot be manipulated by the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' reference.
	 * @see #setReturnInformation(OutputPin)
	 * @see org.eclipse.uml2.UML2Package#getAcceptCallAction_ReturnInformation()
	 * @model required="true"
	 * @generated
	 */
	OutputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.AcceptCallAction#getReturnInformation <em>Return Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(OutputPin value);


} // AcceptCallAction
