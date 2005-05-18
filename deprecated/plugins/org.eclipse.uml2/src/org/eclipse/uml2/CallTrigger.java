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
 * $Id: CallTrigger.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A call trigger represents the reception of a request to invoke a specific operation and specifies a call event. A call event is distinct from the call action that caused it. A call event may cause the invocation of a behavior that is the method of the operation referenced by the call request, if that operation is owned or inherited by the classifier that specified the receiver object. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.CallTrigger#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getCallTrigger()
 * @model
 * @generated
 */
public interface CallTrigger extends MessageTrigger{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the operation whose invocation raised the call event that is specified by the call trigger.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.eclipse.uml2.UML2Package#getCallTrigger_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.CallTrigger#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);


} // CallTrigger
