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
 * $Id: MessageEnd.java,v 1.3 2004/06/06 01:35:03 khussey Exp $
 */
package org.eclipse.uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MessageEnd is an abstract NamedElement that represents what can occur at the end of a Message. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.MessageEnd#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.eclipse.uml2.MessageEnd#getSendMessage <em>Send Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getMessageEnd()
 * @model abstract="true"
 * @generated
 */
public interface MessageEnd extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Receive Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the Message that contains the information of a receiveEvent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Message</em>' reference.
	 * @see #setReceiveMessage(Message)
	 * @see org.eclipse.uml2.UML2Package#getMessageEnd_ReceiveMessage()
	 * @see org.eclipse.uml2.Message#getReceiveEvent
	 * @model opposite="receiveEvent"
	 * @generated
	 */
	Message getReceiveMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.MessageEnd#getReceiveMessage <em>Receive Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Message</em>' reference.
	 * @see #getReceiveMessage()
	 * @generated
	 */
	void setReceiveMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Send Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Message that contains the information of a sendEvent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Message</em>' reference.
	 * @see #setSendMessage(Message)
	 * @see org.eclipse.uml2.UML2Package#getMessageEnd_SendMessage()
	 * @see org.eclipse.uml2.Message#getSendEvent
	 * @model opposite="sendEvent"
	 * @generated
	 */
	Message getSendMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.MessageEnd#getSendMessage <em>Send Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Message</em>' reference.
	 * @see #getSendMessage()
	 * @generated
	 */
	void setSendMessage(Message value);

} // MessageEnd
