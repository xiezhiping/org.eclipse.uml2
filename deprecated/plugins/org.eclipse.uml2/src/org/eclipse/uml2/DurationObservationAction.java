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
 * $Id: DurationObservationAction.java,v 1.14 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DurationObservationAction defines an action that observes duration in time. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DurationObservationAction#getDurations <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDurationObservationAction()
 * @model
 * @generated
 */
public interface DurationObservationAction extends WriteStructuralFeatureAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * represent the measured Duration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getDurationObservationAction_Duration()
	 * @model type="org.eclipse.uml2.Duration" containment="true"
	 * @generated
	 */
	EList getDurations();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Duration} with the specified '<em><b>Name</b></em>' from the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Duration} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Duration} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDurations()
	 * @generated
	 */
    Duration getDuration(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Duration} with the specified '<em><b>Name</b></em>' from the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Duration} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Duration} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDurations()
	 * @generated
	 */
	Duration getDuration(String name, boolean ignoreCase);


    /**
     * Creates a {@link org.eclipse.uml2.Duration} and appends it to the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Duration} to create.
	 * @return The new {@link org.eclipse.uml2.Duration}.
	 * @see #getDurations()
	 * @generated NOT
	 * @deprecated Use #createDuration() instead.
     */
    Duration createDuration(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Duration} and appends it to the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Duration}.
	 * @see #getDurations()
	 * @generated NOT
	 */
    Duration createDuration();

} // DurationObservationAction
