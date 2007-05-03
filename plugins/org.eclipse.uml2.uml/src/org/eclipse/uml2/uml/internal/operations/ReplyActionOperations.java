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
 * $Id: ReplyActionOperations.java,v 1.6 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ReplyAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reply Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#validatePinsMatchParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pins Match Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#validateEventOnReplyToCallTrigger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event On Reply To Call Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reply value pins must match the return, out, and inout parameters of the operation on the event on the trigger in number, type, and order.
	 * true
	 * @param replyAction The receiving '<em><b>Reply Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePinsMatchParameter(ReplyAction replyAction,
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
						UMLValidator.REPLY_ACTION__PINS_MATCH_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePinsMatchParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(replyAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{replyAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The event on replyToCall trigger must be a CallEvent replyToCallEvent.oclIsKindOf(CallEvent)
	 * replyToCallEvent.oclIsKindOf(CallEvent)
	 * @param replyAction The receiving '<em><b>Reply Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEventOnReplyToCallTrigger(
			ReplyAction replyAction, DiagnosticChain diagnostics,
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
						UMLValidator.REPLY_ACTION__EVENT_ON_REPLY_TO_CALL_TRIGGER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEventOnReplyToCallTrigger", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(replyAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{replyAction}));
			}
			return false;
		}
		return true;
	}

} // ReplyActionOperations