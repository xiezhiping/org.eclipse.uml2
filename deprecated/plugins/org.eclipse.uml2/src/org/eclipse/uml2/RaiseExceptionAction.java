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
 * $Id: RaiseExceptionAction.java,v 1.5 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (CompleteActions) RaiseExceptionAction is an action that causes an exception to occur. The input value becomes the exception object. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RaiseExceptionAction#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getRaiseExceptionAction()
 * @model
 * @generated
 */
public interface RaiseExceptionAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input pin whose value becomes an exception object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getRaiseExceptionAction_Exception()
	 * @model required="true"
	 *        annotation="subsets org.eclipse.uml2.Action#getInputs=''"
	 * @generated
	 */
	InputPin getException();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.RaiseExceptionAction#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='input' eType='org.eclipse.uml2.InputPin' containment='false'" 
	 * @generated
	 */
	EList getInputs();

} // RaiseExceptionAction
