/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TimeEventOperations.java,v 1.5 2006/01/05 22:43:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.TimeEvent;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Time Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeEvent#validateWhenNonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate When Non Negative</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeEvent#validateStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Starting Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEventOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEventOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ValueSpecification when must return a non-negative Integer.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateWhenNonNegative(TimeEvent timeEvent,
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
						UMLValidator.TIME_EVENT__WHEN_NON_NEGATIVE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateWhenNonNegative", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeEvent, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{timeEvent}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting time for a relative time event may only be omitted for a time event that is the trigger of a state machine.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStartingTime(TimeEvent timeEvent,
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
						UMLValidator.TIME_EVENT__STARTING_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateStartingTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timeEvent, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{timeEvent}));
			}
			return false;
		}
		return true;
	}

} // TimeEventOperations