/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Trigger.java,v 1.12 2006/04/10 20:40:27 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A trigger specifies the an event that may cause the execution of an associated behavior. An event is often ultimately caused by the execution of an action, but need not be. Trigger is an abstract metaclass. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Trigger#getPorts <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTrigger()
 * @model abstract="true"
 * @generated
 */
public interface Trigger extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ports at which a communication that caused an event may have arrived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getTrigger_Port()
	 * @model type="org.eclipse.uml2.Port" ordered="false"
	 * @generated
	 */
	EList getPorts();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Port} with the specified '<em><b>Name</b></em>' from the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Port} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Port} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPorts()
	 * @generated
	 */
    Port getPort(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Port} with the specified '<em><b>Name</b></em>' from the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Port} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPorts()
	 * @generated
	 */
	Port getPort(String name, boolean ignoreCase);


} // Trigger
