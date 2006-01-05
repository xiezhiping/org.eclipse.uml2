/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DecisionNodeOperations.java,v 1.4 2006/01/05 22:43:25 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateOneIncomingEdge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Incoming Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateInputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DecisionNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
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
	 * A decision node has one incoming edge.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneIncomingEdge(DecisionNode decisionNode,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.DECISION_NODE__ONE_INCOMING_EDGE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneIncomingEdge", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * A decision input behavior has zero or one input parameter and one output parameter. Any input parameter must be the same as or a supertype of the type of object tokens coming along the incoming edge. The behavior cannot have side effects.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputParameter(DecisionNode decisionNode,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.DECISION_NODE__INPUT_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInputParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(decisionNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The edges coming into and out of a decision node must be either all object flows or all control flows.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEdges(DecisionNode decisionNode,
			DiagnosticChain diagnostics, Map context) {
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

} // DecisionNodeOperations