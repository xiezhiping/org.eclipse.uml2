/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.StructuredActivityNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Structured Activity Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#containingActivity() <em>Containing Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateOutputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Output Pin Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateInputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Pin Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#sourceNodes() <em>Source Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#targetNodes() <em>Target Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#allActions() <em>All Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#allOwnedNodes() <em>All Owned Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity that directly or indirectly contains this StructuredActivityNode (considered as an Action).
	 * result = (self.Action::containingActivity())
	 * <p>From package UML::Actions.</p>
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Activity containingActivity(
			StructuredActivityNode structuredActivityNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing ActivityEdges of the OutputPins of a StructuredActivityNode must have targets that are not within the StructuredActivityNode.
	 * output.outgoing.target->excludesAll(allOwnedNodes()-input)
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutputPinEdges(
			StructuredActivityNode structuredActivityNode,
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
						UMLValidator.STRUCTURED_ACTIVITY_NODE__OUTPUT_PIN_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOutputPinEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(structuredActivityNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{structuredActivityNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The edges of a StructuredActivityNode are all the ActivityEdges with source and target ActivityNodes contained directly or indirectly within the StructuredActivityNode and at least one of the source or target not contained in any more deeply nested StructuredActivityNode.
	 * edge=self.sourceNodes().outgoing->intersection(self.allOwnedNodes().incoming)->
	 * 	union(self.targetNodes().incoming->intersection(self.allOwnedNodes().outgoing))->asSet()
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEdges(
			StructuredActivityNode structuredActivityNode,
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
						UMLValidator.STRUCTURED_ACTIVITY_NODE__EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(structuredActivityNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{structuredActivityNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming ActivityEdges of an InputPin of a StructuredActivityNode must have sources that are not within the StructuredActivityNode.
	 * input.incoming.source->excludesAll(allOwnedNodes()-output)
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputPinEdges(
			StructuredActivityNode structuredActivityNode,
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
						UMLValidator.STRUCTURED_ACTIVITY_NODE__INPUT_PIN_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInputPinEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(structuredActivityNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{structuredActivityNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return those ActivityNodes contained immediately within the StructuredActivityNode that may act as sources of edges owned by the StructuredActivityNode.
	 * result = (node->union(input.oclAsType(ActivityNode)->asSet())->
	 *   union(node->select(oclIsKindOf(Action)).oclAsType(Action).output)->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ActivityNode> sourceNodes(
			StructuredActivityNode structuredActivityNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return those ActivityNodes contained immediately within the StructuredActivityNode that may act as targets of edges owned by the StructuredActivityNode.
	 * result = (node->union(output.oclAsType(ActivityNode)->asSet())->
	 *   union(node->select(oclIsKindOf(Action)).oclAsType(Action).input)->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ActivityNode> targetNodes(
			StructuredActivityNode structuredActivityNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns this StructuredActivityNode and all Actions contained in it.
	 * result = (node->select(oclIsKindOf(Action)).oclAsType(Action).allActions()->including(self)->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Action> allActions(
			StructuredActivityNode structuredActivityNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the ActivityNodes contained directly or indirectly within this StructuredActivityNode, in addition to the Pins of the StructuredActivityNode.
	 * result = (self.Action::allOwnedNodes()->union(node)->union(node->select(oclIsKindOf(Action)).oclAsType(Action).allOwnedNodes())->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param structuredActivityNode The receiving '<em><b>Structured Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ActivityNode> allOwnedNodes(
			StructuredActivityNode structuredActivityNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // StructuredActivityNodeOperations