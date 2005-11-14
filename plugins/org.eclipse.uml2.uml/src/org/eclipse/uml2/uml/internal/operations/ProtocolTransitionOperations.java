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
 * $Id: ProtocolTransitionOperations.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ProtocolTransition;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Transition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Belongs To Psm</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associated Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refers To Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#belongsToPSM() <em>Belongs To PSM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ProtocolTransitionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProtocolTransitionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol transition always belongs to a protocol state machine.
	 * container.belongsToPSM()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBelongsToPsm(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.PROTOCOL_TRANSITION__BELONGS_TO_PSM,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBelongsToPsm", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolTransition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol transition never has associated actions.
	 * effect->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociatedActions(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAssociatedActions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolTransition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a protocol transition refers to an operation (i. e. has a call trigger corresponding to an operation), then that operation should apply to the context classifier of the state machine of the protocol transition.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRefersToOperation(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.PROTOCOL_TRANSITION__REFERS_TO_OPERATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRefersToOperation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolTransition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation belongsToPSM () checks if the region belongs to a protocol state machine
	 * result = if not stateMachine->isEmpty() then
	 * oclIsTypeOf(ProtocolStateMachine)
	 * else if not state->isEmpty() then
	 * state.container.belongsToPSM ()
	 * else false
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean belongsToPSM(ProtocolTransition protocolTransition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ProtocolTransitionOperations