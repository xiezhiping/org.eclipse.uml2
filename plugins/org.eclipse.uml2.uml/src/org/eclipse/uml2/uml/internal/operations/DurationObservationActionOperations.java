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
 * $Id: DurationObservationActionOperations.java,v 1.5 2005/12/01 18:15:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationObservationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Duration Observation Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DurationObservationAction#validateInputValueDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Value Duration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DurationObservationAction#getDuration() <em>Get Duration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DurationObservationAction#setDuration(org.eclipse.uml2.uml.Duration) <em>Set Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class DurationObservationActionOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DurationObservationActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of a DurationObservationAction’s input must be a Duration.
	 * self.value.value.oclIsKindOf(Duration)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputValueDuration(
			DurationObservationAction durationObservationAction,
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
						UMLValidator.DURATION_OBSERVATION_ACTION__INPUT_VALUE_DURATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInputValueDuration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(durationObservationAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{durationObservationAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = self.value.value.oclAsType(Duration)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Duration getDuration(
			DurationObservationAction durationObservationAction) {
		InputPin value = durationObservationAction.getValue();

		if (value instanceof ValuePin) {
			ValueSpecification duration = ((ValuePin) value).getValue();

			if (duration instanceof Duration) {
				return (Duration) duration;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setDuration(
			DurationObservationAction durationObservationAction,
			Duration newDuration) {
		InputPin value = durationObservationAction.getValue();

		if (value instanceof ValuePin) {
			((ValuePin) value).setValue(newDuration);
		}
	}

} // DurationObservationActionOperations