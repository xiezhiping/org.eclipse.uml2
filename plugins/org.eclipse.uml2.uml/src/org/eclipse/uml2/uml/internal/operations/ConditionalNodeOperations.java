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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ConditionalNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Conditional Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateResultNoIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result No Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Input Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateOneClauseWithExecutableNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Clause With Executable Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateMatchingOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Matching Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateExecutableNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Executable Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#validateClauseNoPredecessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clause No Predecessor</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#allActions() <em>All Actions</em>}</li>
 * </ul>
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
	 * The result OutputPins have no incoming edges.
	 * result.incoming->isEmpty()
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONDITIONAL_NODE__RESULT_NO_INCOMING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateResultNoIncoming", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(conditionalNode, context)}),
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
	 * A ConditionalNode has no InputPins.
	 * input->isEmpty()
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONDITIONAL_NODE__NO_INPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoInputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(conditionalNode, context)}),
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
	 * No ExecutableNode in the ConditionNode may appear in the test or body part of more than one clause of a ConditionalNode.
	 * node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->forAll(n | 
	 * 	self.clause->select(test->union(_'body')->includes(n))->size()=1)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONDITIONAL_NODE__ONE_CLAUSE_WITH_EXECUTABLE_NODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneClauseWithExecutableNode", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(conditionalNode, context)}),
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
	 * Each clause of a ConditionalNode must have the same number of bodyOutput pins as the ConditionalNode has result OutputPins, and each clause bodyOutput Pin must be compatible with the corresponding result OutputPin (by positional order) in type, multiplicity, ordering, and uniqueness.
	 * clause->forAll(
	 * 	bodyOutput->size()=self.result->size() and
	 * 	Sequence{1..self.result->size()}->forAll(i |
	 * 		bodyOutput->at(i).type.conformsTo(result->at(i).type) and
	 * 		bodyOutput->at(i).isOrdered = result->at(i).isOrdered and
	 * 		bodyOutput->at(i).isUnique = result->at(i).isUnique and
	 * 		bodyOutput->at(i).compatibleWith(result->at(i))))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONDITIONAL_NODE__MATCHING_OUTPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMatchingOutputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(conditionalNode, context)}),
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
	 * The union of the ExecutableNodes in the test and body parts of all clauses must be the same as the subset of nodes contained in the ConditionalNode (considered as a StructuredActivityNode) that are ExecutableNodes.
	 * clause.test->union(clause._'body') = node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONDITIONAL_NODE__EXECUTABLE_NODES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateExecutableNodes", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(conditionalNode, context)}),
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
	 * No two clauses within a ConditionalNode may be predecessorClauses of each other, either directly or indirectly.
	 * clause->closure(predecessorClause)->intersection(clause)->isEmpty()
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONDITIONAL_NODE__CLAUSE_NO_PREDECESSOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateClauseNoPredecessor", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(conditionalNode, context)}),
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
	 * Return only this ConditionalNode. This prevents Actions within the ConditionalNode from having their OutputPins used as bodyOutputs or decider Pins in containing LoopNodes or ConditionalNodes.
	 * result = (self->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param conditionalNode The receiving '<em><b>Conditional Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Action> allActions(ConditionalNode conditionalNode) {
		EList<Action> allActions = new UniqueEList.FastCompare<Action>();

		allActions.add(conditionalNode);

		return ECollections.unmodifiableEList(allActions);
	}

} // ConditionalNodeOperations