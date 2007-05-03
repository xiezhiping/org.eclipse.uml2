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
 * $Id: ProtocolStateMachineOperations.java,v 1.6 2007/05/03 21:11:52 khussey Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateProtocolTransitions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Transitions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateEntryExitDo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Exit Do</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateDeepOrShallowHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deep Or Shallow History</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validatePortsConnected(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ports Connected</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolStateMachine#validateClassifierContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Context</em>}</li>
 * </ul>
 * </p>
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
	 * All transitions of a protocol state machine must be protocol transitions. (transitions as extended by the ProtocolStateMachines package)
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROTOCOL_STATE_MACHINE__PROTOCOL_TRANSITIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateProtocolTransitions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolStateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The states of a protocol state machine cannot have entry, exit, or do activity actions.
	 * region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies
	 * (v.entry->isEmpty() and v.exit->isEmpty() and v.doActivity->isEmpty())))
	 * 
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROTOCOL_STATE_MACHINE__ENTRY_EXIT_DO,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEntryExitDo", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolStateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Protocol state machines cannot have deep or shallow history pseudostates.
	 * region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Psuedostate) implies
	 * ((v.kind <> #deepHistory) and (v.kind <> #shallowHistory)))))
	 * 
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROTOCOL_STATE_MACHINE__DEEP_OR_SHALLOW_HISTORY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDeepOrShallowHistory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolStateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * If two ports are connected, then the protocol state machine of the required interface (if defined) must be conformant to the protocol state machine of the provided interface (if defined).
	 * true
	 * @param protocolStateMachine The receiving '<em><b>Protocol State Machine</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePortsConnected(
			ProtocolStateMachine protocolStateMachine,
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
						UMLValidator.PROTOCOL_STATE_MACHINE__PORTS_CONNECTED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePortsConnected", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolStateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * A protocol state machine must only have a classifier context, not a behavioral feature context.
	 * (not context->isEmpty( )) and specification->isEmpty()
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROTOCOL_STATE_MACHINE__CLASSIFIER_CONTEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClassifierContext", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolStateMachine, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolStateMachine}));
			}
			return false;
		}
		return true;
	}

} // ProtocolStateMachineOperations