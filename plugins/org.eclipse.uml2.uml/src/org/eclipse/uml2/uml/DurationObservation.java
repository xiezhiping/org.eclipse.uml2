/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DurationObservation is a reference to a duration during an execution. It points out the NamedElement(s) in the model to observe and whether the observations are when this NamedElement is entered or when it is exited.
 * <p>From package UML::Values.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DurationObservation#getEvents <em>Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DurationObservation#getFirstEvents <em>First Event</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDurationObservation()
 * @model
 * @generated
 */
public interface DurationObservation
		extends Observation {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DurationObservation is determined as the duration between the entering or exiting of a single event Element during execution, or the entering/exiting of one event Element and the entering/exiting of a second.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDurationObservation_Event()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<NamedElement> getEvents();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEvents()
	 * @generated
	 */
	NamedElement getEvent(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEvents()
	 * @generated
	 */
	NamedElement getEvent(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent[i] is related to event[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters event[i]. If firstEvent[i] is false, then the corresponding observation event is the time instant the execution exits event[i].
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDurationObservation_FirstEvent()
	 * @model dataType="org.eclipse.uml2.types.Boolean" upper="2" ordered="false"
	 * @generated
	 */
	EList<Boolean> getFirstEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of firstEvent must be 2 if the multiplicity of event is 2. Otherwise the multiplicity of firstEvent is 0.
	 * if (event->size() = 2)
	 *   then (firstEvent->size() = 2) else (firstEvent->size() = 0)
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateFirstEventMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // DurationObservation
