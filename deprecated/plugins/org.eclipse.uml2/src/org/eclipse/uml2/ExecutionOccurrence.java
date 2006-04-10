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
 * $Id: ExecutionOccurrence.java,v 1.9 2006/04/10 20:40:21 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExecutionOccurrence is an instantiation of a unit of behavior within the Lifeline. Since the ExecutionOccurrence will have some duration, it is represented by two Eventoccurrences, the start EventOccurrence and the finish EventOccurrence. An ExecutionOccurrence is an InteractionFragment. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ExecutionOccurrence#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.ExecutionOccurrence#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.eclipse.uml2.ExecutionOccurrence#getBehaviors <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getExecutionOccurrence()
 * @model
 * @generated
 */
public interface ExecutionOccurrence extends InteractionFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.EventOccurrence#getStartExecs <em>Start Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Eventoccurrence that designates the start of the Action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(EventOccurrence)
	 * @see org.eclipse.uml2.UML2Package#getExecutionOccurrence_Start()
	 * @see org.eclipse.uml2.EventOccurrence#getStartExecs
	 * @model opposite="startExec" required="true"
	 * @generated
	 */
	EventOccurrence getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ExecutionOccurrence#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(EventOccurrence value);


	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.EventOccurrence#getFinishExecs <em>Finish Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Eventoccurrence that designates the finish of the Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(EventOccurrence)
	 * @see org.eclipse.uml2.UML2Package#getExecutionOccurrence_Finish()
	 * @see org.eclipse.uml2.EventOccurrence#getFinishExecs
	 * @model opposite="finishExec" required="true"
	 * @generated
	 */
	EventOccurrence getFinish();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ExecutionOccurrence#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(EventOccurrence value);


	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the associated behavior
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getExecutionOccurrence_Behavior()
	 * @model type="org.eclipse.uml2.Behavior"
	 * @generated
	 */
	EList getBehaviors();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBehaviors()
	 * @generated
	 */
    Behavior getBehavior(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBehaviors()
	 * @generated
	 */
	Behavior getBehavior(String name, boolean ignoreCase, EClass eClass);


} // ExecutionOccurrence
