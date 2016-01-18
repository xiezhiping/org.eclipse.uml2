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
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Accept Call Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Call Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall</em>}</li>
 * </ul>
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
	 * The number of result OutputPins must be the same as the number of input (in and inout) ownedParameters of the Operation specified by the trigger Event. The type, ordering and multiplicity of each result OutputPin must be consistent with the corresponding input Parameter.
	 * let parameter: OrderedSet(Parameter) = trigger.event->asSequence()->first().oclAsType(CallEvent).operation.inputParameters() in
	 * result->size() = parameter->size() and
	 * Sequence{1..result->size()}->forAll(i | 
	 * 	parameter->at(i).type.conformsTo(result->at(i).type) and 
	 * 	parameter->at(i).isOrdered = result->at(i).isOrdered and
	 * 	parameter->at(i).compatibleWith(result->at(i)))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACCEPT_CALL_ACTION__RESULT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateResultPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(acceptCallAction, context)}),
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
	 * The action must have exactly one trigger, which must be for a CallEvent.
	 * trigger->size()=1 and
	 * trigger->asSequence()->first().event.oclIsKindOf(CallEvent)
	 * @param acceptCallAction The receiving '<em><b>Accept Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateTriggerCallEvent(
			AcceptCallAction acceptCallAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		EList<Trigger> triggers = acceptCallAction.getTriggers();

		boolean result = triggers.size() == 1
			&& triggers.get(0).getEvent() instanceof CallEvent;

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.ACCEPT_CALL_ACTION__TRIGGER_CALL_EVENT,
				UMLPlugin.INSTANCE.getString(
					"_UI_AcceptCallAction_TriggerCallEvent_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, acceptCallAction)),
				new Object[]{acceptCallAction}));
		}

		return result;
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
	 * @generated NOT
	 */
	public static boolean validateUnmarshall(AcceptCallAction acceptCallAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = acceptCallAction.isUnmarshall();

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.ACCEPT_CALL_ACTION__UNMARSHALL,
				UMLPlugin.INSTANCE.getString(
					"_UI_AcceptCallAction_Unmarshall_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, acceptCallAction)),
				new Object[]{acceptCallAction}));
		}

		return result;
	}

} // AcceptCallActionOperations