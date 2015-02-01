/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Trigger specifies a specific point  at which an Event occurrence may trigger an effect in a Behavior. A Trigger may be qualified by the Port on which the Event occurred.
 * <p>From package UML::CommonBehavior.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Trigger#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Trigger#getPorts <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Event that detected by the Trigger.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTrigger_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Trigger#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A optional Port of through which the given effect is detected.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTrigger_Port()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getPorts()
	 * @generated
	 */
	Port getPort(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getPorts()
	 * @generated
	 */
	Port getPort(String name, Type type, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Trigger specifies one or more ports, the event of the Trigger must be a MessageEvent.
	 * port->notEmpty() implies event.oclIsKindOf(MessageEvent)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTriggerWithPorts(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Trigger
