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
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.LoopNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Loop Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateResultNoIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result No Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateInputEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateExecutableNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Executable Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateBodyOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateSetupTestAndBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Setup Test And Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateMatchingOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Matching Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateMatchingLoopVariables(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Matching Loop Variables</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateMatchingResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Matching Result Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#validateLoopVariableOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Loop Variable Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#allActions() <em>All Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#sourceNodes() <em>Source Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopNodeOperations
		extends StructuredActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The loopVariableInputs must not have outgoing edges.
	 * loopVariableInput.outgoing->isEmpty()
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputEdges(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__INPUT_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInputEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the ExecutableNodes in the setupPart, test and bodyPart of a LoopNode must be the same as the subset of nodes contained in the LoopNode (considered as a StructuredActivityNode) that are ExecutableNodes.
	 * setupPart->union(test)->union(bodyPart)=node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->asSet()
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExecutableNodes(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__EXECUTABLE_NODES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateExecutableNodes", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bodyOutput pins are OutputPins on Actions in the body of the LoopNode.
	 * bodyPart.oclAsType(Action).allActions().output->includesAll(bodyOutput)
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBodyOutputPins(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__BODY_OUTPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBodyOutputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test and body parts of a ConditionalNode must be disjoint with each other.
	 * setupPart->intersection(test)->isEmpty() and
	 * setupPart->intersection(bodyPart)->isEmpty() and
	 * test->intersection(bodyPart)->isEmpty()
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSetupTestAndBody(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__SETUP_TEST_AND_BODY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSetupTestAndBody", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LoopNode must have the same number of bodyOutput Pins as loopVariables, and each bodyOutput Pin must be compatible with the corresponding loopVariable (by positional order) in type, multiplicity, ordering and uniqueness.
	 * bodyOutput->size()=loopVariable->size() and
	 * Sequence{1..loopVariable->size()}->forAll(i |
	 * 	bodyOutput->at(i).type.conformsTo(loopVariable->at(i).type) and
	 * 	bodyOutput->at(i).isOrdered = loopVariable->at(i).isOrdered and
	 * 	bodyOutput->at(i).isUnique = loopVariable->at(i).isUnique and
	 * 	loopVariable->at(i).includesMultiplicity(bodyOutput->at(i)))
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMatchingOutputPins(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__MATCHING_OUTPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMatchingOutputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LoopNode must have the same number of loopVariableInputs and loopVariables, and they must match in type, uniqueness and multiplicity.
	 * loopVariableInput->size()=loopVariable->size() and
	 * loopVariableInput.type=loopVariable.type and
	 * loopVariableInput.isUnique=loopVariable.isUnique and
	 * loopVariableInput.lower=loopVariable.lower and
	 * loopVariableInput.upper=loopVariable.upper
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMatchingLoopVariables(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__MATCHING_LOOP_VARIABLES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMatchingLoopVariables", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LoopNode must have the same number of result OutputPins and loopVariables, and they must match in type, uniqueness and multiplicity.
	 * result->size()=loopVariable->size() and
	 * result.type=loopVariable.type and
	 * result.isUnique=loopVariable.isUnique and
	 * result.lower=loopVariable.lower and
	 * result.upper=loopVariable.upper
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMatchingResultPins(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__MATCHING_RESULT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMatchingResultPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ActivityEdges outgoing from loopVariable OutputPins must have targets within the LoopNode.
	 * allOwnedNodes()->includesAll(loopVariable.outgoing.target)
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLoopVariableOutgoing(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__LOOP_VARIABLE_OUTGOING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateLoopVariableOutgoing", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return only this LoopNode. This prevents Actions within the LoopNode from having their OutputPins used as bodyOutputs or decider Pins in containing LoopNodes or ConditionalNodes.
	 * result = (self->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Action> allActions(LoopNode loopNode) {
		EList<Action> allActions = new UniqueEList.FastCompare<Action>();

		allActions.add(loopNode);

		return ECollections.unmodifiableEList(allActions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the loopVariable OutputPins in addition to other source nodes for the LoopNode as a StructuredActivityNode.
	 * result = (self.StructuredActivityNode::sourceNodes()->union(loopVariable))
	 * <p>From package UML::Actions.</p>
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ActivityNode> sourceNodes(LoopNode loopNode) {
		EList<ActivityNode> sourceNodes = new UniqueEList.FastCompare<ActivityNode>(
			StructuredActivityNodeOperations.sourceNodes(loopNode));

		sourceNodes.addAll(loopNode.getLoopVariables());

		return ECollections.unmodifiableEList(sourceNodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result OutputPins have no incoming edges.
	 * result.incoming->isEmpty()
	 * @param loopNode The receiving '<em><b>Loop Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultNoIncoming(LoopNode loopNode,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LOOP_NODE__RESULT_NO_INCOMING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateResultNoIncoming", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(loopNode, context)}),
					new Object[]{loopNode}));
			}
			return false;
		}
		return true;
	}

} // LoopNodeOperations