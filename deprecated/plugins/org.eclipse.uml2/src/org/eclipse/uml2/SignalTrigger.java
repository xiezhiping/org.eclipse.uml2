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
 * $Id: SignalTrigger.java,v 1.7 2005/06/15 20:06:01 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal event represents the receipt of an asynchronous signal. A signal event may cause a response, such as a state machine transition as specified in the classifier behavior of the classifier that specified the receiver object, if the signal referenced by the send request is mentioned in a reception owned or inherited by the classifier that specified the receiver object. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.SignalTrigger#getSignals <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getSignalTrigger()
 * @model
 * @generated
 */
public interface SignalTrigger extends MessageTrigger{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getSignalTrigger_Signal()
	 * @model type="org.eclipse.uml2.Signal"
	 * @generated
	 */
	EList getSignals();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Signal} with the specified '<em><b>Name</b></em>' from the '<em><b>Signal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Signal} to retrieve.
	 * @return The {@link org.eclipse.uml2.Signal} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSignals()
	 * @generated
	 */
    Signal getSignal(String name);

} // SignalTrigger
