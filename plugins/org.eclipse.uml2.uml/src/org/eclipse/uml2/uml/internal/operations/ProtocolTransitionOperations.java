/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ProtocolTransition;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Transition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refers To Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associated Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Belongs To Psm</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#getReferreds() <em>Get Referreds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolTransitionOperations
		extends TransitionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ProtocolTransition always belongs to a ProtocolStateMachine.
	 * container.belongsToPSM()
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBelongsToPsm(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_TRANSITION__BELONGS_TO_PSM,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBelongsToPsm", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolTransition, context)}),
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
	 * Derivation for ProtocolTransition::/referred
	 * result = (trigger->collect(event)->select(oclIsKindOf(CallEvent))->collect(oclAsType(CallEvent).operation)->asSet())
	 * <p>From package UML::StateMachines.</p>
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Operation> getReferreds(
			ProtocolTransition protocolTransition) {
		return protocolTransition.getReferreds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ProtocolTransition never has associated Behaviors.
	 * effect = null
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociatedActions(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAssociatedActions", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolTransition, context)}),
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
	 * If a ProtocolTransition refers to an Operation (i.e., has a CallEvent trigger corresponding to an Operation), then that Operation should apply to the context Classifier of the StateMachine of the ProtocolTransition.
	 * if (referred()->notEmpty() and containingStateMachine()._'context'->notEmpty()) then 
	 *     containingStateMachine()._'context'.oclAsType(BehavioredClassifier).allFeatures()->includesAll(referred())
	 * else true endif
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRefersToOperation(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROTOCOL_TRANSITION__REFERS_TO_OPERATION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRefersToOperation", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(protocolTransition, context)}),
					new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

} // ProtocolTransitionOperations