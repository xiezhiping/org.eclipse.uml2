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
 * $Id: TimeObservationActionOperations.java,v 1.2 2005/11/16 19:03:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeObservationAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Time Observation Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeObservationAction#validateInputValueTimeExpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Value Time Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeObservationAction#getNow() <em>Get Now</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeObservationAction#setNow(org.eclipse.uml2.uml.TimeExpression) <em>Set Now</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class TimeObservationActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeObservationActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of a TimeObservationAction’s input must be a TimeExpression.
	 * self.value.value.oclIsKindOf(TimeExpression)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputValueTimeExpression(
			TimeObservationAction timeObservationAction,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.TIME_OBSERVATION_ACTION__INPUT_VALUE_TIME_EXPRESSION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInputValueTimeExpression", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeObservationAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{timeObservationAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value.value.oclAsType(TimeExpression)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static TimeExpression getNow(
			TimeObservationAction timeObservationAction) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Object setNow(TimeObservationAction timeObservationAction,
			TimeExpression newNow) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // TimeObservationActionOperations