/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: AcceptCallActionOperations.java,v 1.8 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.AcceptCallAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Accept Call Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Call Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptCallActionOperations
		extends AcceptEventActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptCallActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result pins must match the in and inout parameters of the operation specified by the trigger event in number, type, and order.
	 * true
	 * @param acceptCallAction The receiving '<em><b>Accept Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultPins(AcceptCallAction acceptCallAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_CALL_ACTION__RESULT_PINS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateResultPins", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptCallAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptCallAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger event must be a CallEvent.
	 * trigger.event.oclIsKindOf(CallEvent)
	 * @param acceptCallAction The receiving '<em><b>Accept Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTriggerCallEvent(
			AcceptCallAction acceptCallAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_CALL_ACTION__TRIGGER_CALL_EVENT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTriggerCallEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptCallAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptCallAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isUnmrashall must be true for an AcceptCallAction.
	 * isUnmarshall = true
	 * @param acceptCallAction The receiving '<em><b>Accept Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnmarshall(AcceptCallAction acceptCallAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_CALL_ACTION__UNMARSHALL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateUnmarshall", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptCallAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptCallAction}));
			}
			return false;
		}
		return true;
	}

} // AcceptCallActionOperations