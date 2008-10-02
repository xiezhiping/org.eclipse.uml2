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
 * $Id: ActivityParameterNodeOperations.java,v 1.9 2008/10/02 20:56:22 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ActivityParameterNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Parameter Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateHasParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateSameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoIncomingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Incoming Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateMaximumOneParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maximum One Parameter Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateMaximumTwoParameterNodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maximum Two Parameter Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityParameterNodeOperations
		extends ObjectNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityParameterNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity parameter nodes must have parameters from the containing activity.
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasParameters(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__HAS_PARAMETERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasParameters", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of an activity parameter node is the same as the type of its parameter.
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameType(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__SAME_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity parameter node may have all incoming edges or all outgoing edges, but it must not have both incoming and outgoing edges.
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoEdges(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__NO_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity parameter object nodes with no incoming edges and one or more outgoing edges must have a parameter with in or inout direction.
	 * 
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoIncomingEdges(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__NO_INCOMING_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoIncomingEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity parameter object nodes with no outgoing edges and one or more incoming edges must have a parameter with out, inout, or return direction.
	 * 
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOutgoingEdges(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__NO_OUTGOING_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoOutgoingEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter with direction other than inout must have at most one activity parameter node in an activity.
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaximumOneParameterNode(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__MAXIMUM_ONE_PARAMETER_NODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMaximumOneParameterNode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter with direction inout must have at most two activity parameter nodes in an activity, one with incoming flows and one with outgoing flows.
	 * true
	 * @param activityParameterNode The receiving '<em><b>Activity Parameter Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaximumTwoParameterNodes(
			ActivityParameterNode activityParameterNode,
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
						UMLValidator.ACTIVITY_PARAMETER_NODE__MAXIMUM_TWO_PARAMETER_NODES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMaximumTwoParameterNodes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

} // ActivityParameterNodeOperations