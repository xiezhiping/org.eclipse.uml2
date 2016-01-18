/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#validatePinsMatchParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pins Match Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#validateEventOnReplyToCallTrigger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event On Reply To Call Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplyActionOperations
		extends ActionOperations {

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
	 * The replyValue InputPins must match the output (return, out, and inout) parameters of the operation of the event of the replyToCall Trigger in number, type, ordering, and multiplicity.
	 * let parameter:OrderedSet(Parameter) = replyToCall.event.oclAsType(CallEvent).operation.outputParameters() in
	 * replyValue->size()=parameter->size() and
	 * Sequence{1..replyValue->size()}->forAll(i |
	 * 	replyValue->at(i).type.conformsTo(parameter->at(i).type) and
	 * 	replyValue->at(i).isOrdered=parameter->at(i).isOrdered and
	 * 	replyValue->at(i).compatibleWith(parameter->at(i)))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REPLY_ACTION__PINS_MATCH_PARAMETER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validatePinsMatchParameter", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(replyAction, context)}),
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
	 * The event of the replyToCall Trigger must be a CallEvent.
	 * replyToCall.event.oclIsKindOf(CallEvent)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REPLY_ACTION__EVENT_ON_REPLY_TO_CALL_TRIGGER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEventOnReplyToCallTrigger", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(replyAction, context)}),
					new Object[]{replyAction}));
			}
			return false;
		}
		return true;
	}

} // ReplyActionOperations