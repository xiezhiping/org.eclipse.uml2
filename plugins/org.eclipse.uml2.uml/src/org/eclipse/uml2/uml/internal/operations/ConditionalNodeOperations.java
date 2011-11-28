/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ConditionalNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Conditional Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateExecutableNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Executable Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateClauseNoPredecessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clause No Predecessor</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateMatchingOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Matching Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateOneClauseWithExecutableNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Clause With Executable Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateResultNoIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result No Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Input Pins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeOperations
		extends StructuredActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result output pins have no incoming edges.
	 * true
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultNoIncoming(
			ConditionalNode conditionalNode, DiagnosticChain diagnostics,
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
						UMLValidator.CONDITIONAL_NODE__RESULT_NO_INCOMING,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateResultNoIncoming", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(conditionalNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{conditionalNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A conditional node has no input pins.
	 * true
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoInputPins(ConditionalNode conditionalNode,
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
						UMLValidator.CONDITIONAL_NODE__NO_INPUT_PINS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoInputPins", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(conditionalNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{conditionalNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No ExecutableNode may appear in the test or body part of more than one clause of a conditional node.
	 * true
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneClauseWithExecutableNode(
			ConditionalNode conditionalNode, DiagnosticChain diagnostics,
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
						UMLValidator.CONDITIONAL_NODE__ONE_CLAUSE_WITH_EXECUTABLE_NODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneClauseWithExecutableNode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(conditionalNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{conditionalNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each clause of a conditional node must have the same number of bodyOutput pins as the conditional node has result output pins, and each clause bodyOutput pin must be compatible with the corresponding result pin (by positional order) in type, multiplicity, ordering and uniqueness.
	 * true
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMatchingOutputPins(
			ConditionalNode conditionalNode, DiagnosticChain diagnostics,
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
						UMLValidator.CONDITIONAL_NODE__MATCHING_OUTPUT_PINS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMatchingOutputPins", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(conditionalNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{conditionalNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the ExecutabledNodes in the test and body parts of all clauses must be the same as the subset of nodes contained in the ConditionalNode (considered as a StructuredActivityNode) that are ExecutableNodes.
	 * true
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExecutableNodes(
			ConditionalNode conditionalNode, DiagnosticChain diagnostics,
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
						UMLValidator.CONDITIONAL_NODE__EXECUTABLE_NODES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateExecutableNodes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(conditionalNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{conditionalNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No two clauses within a ConditionalNode maybe predecessor clauses of each other, either directly or indirectly.
	 * true
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClauseNoPredecessor(
			ConditionalNode conditionalNode, DiagnosticChain diagnostics,
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
						UMLValidator.CONDITIONAL_NODE__CLAUSE_NO_PREDECESSOR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClauseNoPredecessor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(conditionalNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{conditionalNode}));
			}
			return false;
		}
		return true;
	}

} // ConditionalNodeOperations