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
 * $Id: AcceptEventAction.java,v 1.11 2006/04/10 20:40:27 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.AcceptEventAction#getTriggers <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.AcceptEventAction#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction extends Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of event accepted by the action, as specified by a trigger. If it is a signal trigger, a signal of any subtype of the specified signal type is accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getAcceptEventAction_Trigger()
	 * @model type="org.eclipse.uml2.Trigger"
	 * @generated
	 */
	EList getTriggers();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Trigger} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTriggers()
	 * @generated
	 */
    Trigger getTrigger(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Trigger} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Trigger} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTriggers()
	 * @generated
	 */
	Trigger getTrigger(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pin holding the event object that has been received. Event objects may be copied in transmission, so identity might not be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getAcceptEventAction_Result()
	 * @model type="org.eclipse.uml2.OutputPin" ordered="false"
	 * @generated
	 */
	EList getResults();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
    OutputPin getResult(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin getResult(String name, boolean ignoreCase);


} // AcceptEventAction
