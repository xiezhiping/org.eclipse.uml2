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
 * $Id: EventOccurrence.java,v 1.5 2005/03/15 18:44:43 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EventOccurrences represents moments in time to which Actions are associated. An EventOccurrence is the basic semantic unit of Interactions. The sequences of Eventoccurrences are the meanings of Interactions. Messages are sent through either asynchronous signal sending or operation calls. Likewise they are recieved by Receptions or actions of consumption. EventOccurrence is a specialization of InteractionFragment and of MessageEnd. EventOccurrences are ordered along a Lifeline. The namespace of an EventOccurrence is the Interaction in which it is contained. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.EventOccurrence#getStartExecs <em>Start Exec</em>}</li>
 *   <li>{@link org.eclipse.uml2.EventOccurrence#getFinishExecs <em>Finish Exec</em>}</li>
 *   <li>{@link org.eclipse.uml2.EventOccurrence#getToAfters <em>To After</em>}</li>
 *   <li>{@link org.eclipse.uml2.EventOccurrence#getToBefores <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getEventOccurrence()
 * @model 
 * @generated
 */
public interface EventOccurrence extends InteractionFragment, MessageEnd{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Start Exec</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExecutionOccurrence}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExecutionOccurrence#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Exec</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Exec</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getEventOccurrence_StartExec()
	 * @see org.eclipse.uml2.ExecutionOccurrence#getStart
	 * @model type="org.eclipse.uml2.ExecutionOccurrence" opposite="start" ordered="false"
	 * @generated
	 */
	EList getStartExecs();

    /**
     * Retrieves the {@link org.eclipse.uml2.ExecutionOccurrence} with the specified name from the '<em><b>Start Exec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ExecutionOccurrence} to retrieve.
	 * @return The {@link org.eclipse.uml2.ExecutionOccurrence} with the specified name, or <code>null</code>.
	 * @see #getStartExecs()
	 * @generated
     */
    ExecutionOccurrence getStartExec(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Finish Exec</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExecutionOccurrence}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ExecutionOccurrence#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Exec</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Exec</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getEventOccurrence_FinishExec()
	 * @see org.eclipse.uml2.ExecutionOccurrence#getFinish
	 * @model type="org.eclipse.uml2.ExecutionOccurrence" opposite="finish" ordered="false"
	 * @generated
	 */
	EList getFinishExecs();

    /**
     * Retrieves the {@link org.eclipse.uml2.ExecutionOccurrence} with the specified name from the '<em><b>Finish Exec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ExecutionOccurrence} to retrieve.
	 * @return The {@link org.eclipse.uml2.ExecutionOccurrence} with the specified name, or <code>null</code>.
	 * @see #getFinishExecs()
	 * @generated
     */
    ExecutionOccurrence getFinishExec(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getEventOccurrence_ToAfter()
	 * @see org.eclipse.uml2.GeneralOrdering#getBefore
	 * @model type="org.eclipse.uml2.GeneralOrdering" opposite="before" ordered="false"
	 * @generated
	 */
	EList getToAfters();

    /**
     * Retrieves the {@link org.eclipse.uml2.GeneralOrdering} with the specified name from the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.GeneralOrdering} to retrieve.
	 * @return The {@link org.eclipse.uml2.GeneralOrdering} with the specified name, or <code>null</code>.
	 * @see #getToAfters()
	 * @generated
     */
    GeneralOrdering getToAfter(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getEventOccurrence_ToBefore()
	 * @see org.eclipse.uml2.GeneralOrdering#getAfter
	 * @model type="org.eclipse.uml2.GeneralOrdering" opposite="after" ordered="false"
	 * @generated
	 */
	EList getToBefores();

    /**
     * Retrieves the {@link org.eclipse.uml2.GeneralOrdering} with the specified name from the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.GeneralOrdering} to retrieve.
	 * @return The {@link org.eclipse.uml2.GeneralOrdering} with the specified name, or <code>null</code>.
	 * @see #getToBefores()
	 * @generated
     */
    GeneralOrdering getToBefore(String unqualifiedName);
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getCovereds();

} // EventOccurrence
