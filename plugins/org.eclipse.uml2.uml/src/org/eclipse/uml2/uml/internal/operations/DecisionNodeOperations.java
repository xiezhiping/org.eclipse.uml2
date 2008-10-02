/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DecisionNodeOperations.java,v 1.8 2008/10/02 20:56:22 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.DecisionNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Decision Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Decision Input Flow Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Zero Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Object One Input Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Control One Input Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Two Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionNodeOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A decision node has one or two incoming edges and at least one outgoing edge.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIncomingOutgoingEdges(
			DecisionNode decisionNode, DiagnosticChain diagnostics,
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
						UMLValidator.DECISION_NODE__INCOMING_OUTGOING_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIncomingOutgoingEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The edges coming into and out of a decision node, other than the decision input flow (if any), must be either all object flows or all control flows.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEdges(DecisionNode decisionNode,
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
						UMLValidator.DECISION_NODE__EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The decisionInputFlow of a decision node must be an incoming edge of the decision node.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDecisionInputFlowIncoming(
			DecisionNode decisionNode, DiagnosticChain diagnostics,
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
						UMLValidator.DECISION_NODE__DECISION_INPUT_FLOW_INCOMING,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDecisionInputFlowIncoming", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A decision input behavior has no output parameters, no in-out parameters and one return parameter.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParameters(DecisionNode decisionNode,
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
						UMLValidator.DECISION_NODE__PARAMETERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateParameters", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the decision node has no decision input flow and an incoming control flow, then a decision input behavior has zero input parameters.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateZeroInputParameters(
			DecisionNode decisionNode, DiagnosticChain diagnostics,
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
						UMLValidator.DECISION_NODE__ZERO_INPUT_PARAMETERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateZeroInputParameters", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the decision node has no decision input flow and an incoming object flow, then a decision input behavior has one input parameter whose type is the same as or a supertype of the type of object tokens offered on the incoming edge.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIncomingObjectOneInputParameter(
			DecisionNode decisionNode, DiagnosticChain diagnostics,
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
						UMLValidator.DECISION_NODE__INCOMING_OBJECT_ONE_INPUT_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIncomingObjectOneInputParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the decision node has a decision input flow and an incoming control flow, then a decision input behavior has one input parameter whose type is the same as or a supertype of the type of object tokens offered on the decision input flow.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIncomingControlOneInputParameter(
			DecisionNode decisionNode, DiagnosticChain diagnostics,
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
						UMLValidator.DECISION_NODE__INCOMING_CONTROL_ONE_INPUT_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIncomingControlOneInputParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the decision node has a decision input flow and an second incoming object flow, then a decision input behavior has two input parameters, the first of which has a type that is the same as or a supertype of the type of the type of object tokens offered on the nondecision input flow and the second of which has a type that is the same as or a supertype of the type of object tokens offered on the decision input flow.
	 * true
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTwoInputParameters(DecisionNode decisionNode,
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
						UMLValidator.DECISION_NODE__TWO_INPUT_PARAMETERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTwoInputParameters", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

} // DecisionNodeOperations