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
 * $Id: DurationObservationAction.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DurationObservationAction defines an action that observes duration in time and writes this value to a structural feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DurationObservationAction#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDurationObservationAction()
 * @model
 * @generated
 */
public interface DurationObservationAction
		extends WriteStructuralFeatureAction {

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the measured Duration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(Duration)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDurationObservationAction_Duration()
	 * @model resolveProxies="false" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DurationObservationAction#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of a DurationObservationAction’s input must be a Duration.
	 * self.value.value.oclIsKindOf(Duration)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputValueDuration(DiagnosticChain diagnostics, Map context);

} // DurationObservationAction
