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

import org.eclipse.uml2.uml.DecisionNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Decision Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Zero Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Decision Input Flow Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Two Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Control One Input Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Object One Input Parameter</em>}</li>
 * </ul>
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
	 * A DecisionNode has one or two incoming ActivityEdges and at least one outgoing ActivityEdge.
	 * (incoming->size() = 1 or incoming->size() = 2) and outgoing->size() > 0
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__INCOMING_OUTGOING_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateIncomingOutgoingEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * The ActivityEdges incoming to and outgoing from a DecisionNode, other than the decisionInputFlow (if any), must be either all ObjectFlows or all ControlFlows.
	 * let allEdges: Set(ActivityEdge) = incoming->union(outgoing) in
	 * let allRelevantEdges: Set(ActivityEdge) = if decisionInputFlow->notEmpty() then allEdges->excluding(decisionInputFlow) else allEdges endif in
	 * allRelevantEdges->forAll(oclIsKindOf(ControlFlow)) or allRelevantEdges->forAll(oclIsKindOf(ObjectFlow))
	 * 
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * The decisionInputFlow of a DecisionNode must be an incoming ActivityEdge of the DecisionNode.
	 * incoming->includes(decisionInputFlow)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__DECISION_INPUT_FLOW_INCOMING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateDecisionInputFlowIncoming", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * A decisionInput Behavior has no out parameters, no inout parameters, and one return parameter.
	 * decisionInput<>null implies 
	 *   (decisionInput.ownedParameter->forAll(par | 
	 *      par.direction <> ParameterDirectionKind::out and 
	 *      par.direction <> ParameterDirectionKind::inout ) and
	 *    decisionInput.ownedParameter->one(par | 
	 *      par.direction <> ParameterDirectionKind::return))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__PARAMETERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateParameters", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * If the DecisionNode has no decisionInputFlow and an incoming ControlFlow, then any decisionInput Behavior has no in parameters.
	 * (decisionInput<>null and decisionInputFlow=null and incoming->exists(oclIsKindOf(ControlFlow))) implies
	 *    decisionInput.inputParameters()->isEmpty()
	 * @param decisionNode The receiving '<em><b>Decision Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateZeroInputParameters(DecisionNode decisionNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__ZERO_INPUT_PARAMETERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateZeroInputParameters", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * If the DecisionNode has no decisionInputFlow and an incoming ObjectFlow, then any decisionInput Behavior has one in Parameter whose type is the same as or a supertype of the type of object tokens offered on the incoming ObjectFlow.
	 * (decisionInput<>null and decisionInputFlow=null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies
	 * 	decisionInput.inputParameters()->size()=1
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__INCOMING_OBJECT_ONE_INPUT_PARAMETER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateIncomingObjectOneInputParameter", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * If the DecisionNode has a decisionInputFlow and an incoming ControlFlow, then any decisionInput Behavior has one in Parameter whose type is the same as or a supertype of the type of object tokens offered on the decisionInputFlow.
	 * (decisionInput<>null and decisionInputFlow<>null and incoming->exists(oclIsKindOf(ControlFlow))) implies
	 * 	decisionInput.inputParameters()->size()=1
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__INCOMING_CONTROL_ONE_INPUT_PARAMETER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateIncomingControlOneInputParameter", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
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
	 * If the DecisionNode has a decisionInputFlow and an second incoming ObjectFlow, then any decisionInput has two in Parameters, the first of which has a type that is the same as or a supertype of the type of object tokens offered on the non-decisionInputFlow and the second of which has a type that is the same as or a supertype of the type of object tokens offered on the decisionInputFlow.
	 * (decisionInput<>null and decisionInputFlow<>null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies
	 * 	decisionInput.inputParameters()->size()=2
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DECISION_NODE__TWO_INPUT_PARAMETERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTwoInputParameters", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(decisionNode, context)}),
					new Object[]{decisionNode}));
			}
			return false;
		}
		return true;
	}

} // DecisionNodeOperations