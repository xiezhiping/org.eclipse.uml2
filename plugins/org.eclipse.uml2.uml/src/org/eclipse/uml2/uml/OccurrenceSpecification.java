/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OccurrenceSpecification.java,v 1.1 2005/11/14 22:25:57 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OccurrenceSpecification is the basic semantic unit of Interactions. The sequences of occurrences specified by them are the meanings of Interactions.
 * 
 * OccurrenceSpecifications are ordered along a Lifeline.
 * 
 * The namespace of an OccurrenceSpecification is the Interaction in which it is contained.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#getToBefores <em>To Before</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#getToAfters <em>To After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOccurrenceSpecification()
 * @model abstract="true"
 * @generated
 */
public interface OccurrenceSpecification
		extends InteractionFragment {

	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the GeneralOrderings that specify EventOcurrences that must occur before this OccurrenceSpecification
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOccurrenceSpecification_ToBefore()
	 * @see org.eclipse.uml2.uml.GeneralOrdering#getAfter
	 * @model type="org.eclipse.uml2.uml.GeneralOrdering" opposite="after" ordered="false"
	 * @generated
	 */
	List getToBefores();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>' from the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralOrdering} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getToBefores()
	 * @generated
	 */
	GeneralOrdering getToBefore(String name);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a specification of the occurring event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOccurrenceSpecification_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.OccurrenceSpecification#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOccurrenceSpecification_ToAfter()
	 * @see org.eclipse.uml2.uml.GeneralOrdering#getBefore
	 * @model type="org.eclipse.uml2.uml.GeneralOrdering" opposite="before" ordered="false"
	 * @generated
	 */
	List getToAfters();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>' from the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralOrdering} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.GeneralOrdering} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getToAfters()
	 * @generated
	 */
	GeneralOrdering getToAfter(String name);

} // OccurrenceSpecification
