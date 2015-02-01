/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SignalEvent represents the receipt of an asynchronous Signal instance.
 * <p>From package UML::CommonBehavior.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.SignalEvent#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getSignalEvent()
 * @model
 * @generated
 */
public interface SignalEvent
		extends MessageEvent {

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific Signal that is associated with this SignalEvent.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see org.eclipse.uml2.uml.UMLPackage#getSignalEvent_Signal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.SignalEvent#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SignalEvent
