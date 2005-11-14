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
 * $Id: TimeObservationAction.java,v 1.1 2005/11/14 22:26:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeObservationAction defines an action that observes the current point in time and writes this value to a structural feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeObservationAction#getNow <em>Now</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTimeObservationAction()
 * @model
 * @generated
 */
public interface TimeObservationAction
		extends WriteStructuralFeatureAction {

	/**
	 * Returns the value of the '<em><b>Now</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the current point in time and the value which is observed given by the keyword now.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Now</em>' reference.
	 * @see #setNow(TimeExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeObservationAction_Now()
	 * @model resolveProxies="false" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	TimeExpression getNow();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeObservationAction#getNow <em>Now</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Now</em>' reference.
	 * @see #getNow()
	 * @generated
	 */
	void setNow(TimeExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of a TimeObservationAction’s input must be a TimeExpression.
	 * self.value.value.oclIsKindOf(TimeExpression)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputValueTimeExpression(DiagnosticChain diagnostics,
			Map context);

} // TimeObservationAction
