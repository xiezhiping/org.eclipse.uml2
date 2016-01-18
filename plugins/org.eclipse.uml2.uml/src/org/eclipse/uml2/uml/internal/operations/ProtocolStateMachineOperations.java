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

import org.eclipse.uml2.uml.ProtocolStateMachine;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol State Machine</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateDeepOrShallowHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deep Or Shallow History</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateEntryExitDo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Exit Do</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateProtocolTransitions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Transitions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolStateMachineOperations
		extends StateMachineOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolStateMachineOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Transitions of a ProtocolStateMachine must be ProtocolTransitions.
	 * region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))
	 * @param protocolStateMachine The receiving '<em><b>Protocol State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProtocolTransitions(
			ProtocolStateMachine protocolStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_STATE_MACHINE__PROTOCOL_TRANSITIONS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateProtocolTransitions", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolStateMachine,
									context)}),
					new Object[]{protocolStateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of a ProtocolStateMachine cannot have entry, exit, or do activity Behaviors.
	 * region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies
	 * (v.oclAsType(State).entry->isEmpty() and v.oclAsType(State).exit->isEmpty() and v.oclAsType(State).doActivity->isEmpty())))
	 * @param protocolStateMachine The receiving '<em><b>Protocol State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEntryExitDo(
			ProtocolStateMachine protocolStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_STATE_MACHINE__ENTRY_EXIT_DO,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEntryExitDo", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolStateMachine,
									context)}),
					new Object[]{protocolStateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProtocolStateMachines cannot have deep or shallow history Pseudostates.
	 * region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Pseudostate) implies
	 * ((v.oclAsType(Pseudostate).kind <>  PseudostateKind::deepHistory) and (v.oclAsType(Pseudostate).kind <> PseudostateKind::shallowHistory))))
	 * @param protocolStateMachine The receiving '<em><b>Protocol State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeepOrShallowHistory(
			ProtocolStateMachine protocolStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_STATE_MACHINE__DEEP_OR_SHALLOW_HISTORY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateDeepOrShallowHistory", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolStateMachine,
									context)}),
					new Object[]{protocolStateMachine}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ProtocolStateMachine must only have a Classifier context, not a BehavioralFeature context.
	 * _'context' <> null and specification = null
	 * @param protocolStateMachine The receiving '<em><b>Protocol State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassifierContext(
			ProtocolStateMachine protocolStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_STATE_MACHINE__CLASSIFIER_CONTEXT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateClassifierContext", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolStateMachine,
									context)}),
					new Object[]{protocolStateMachine}));
			}
			return false;
		}
		return true;
	}

} // ProtocolStateMachineOperations