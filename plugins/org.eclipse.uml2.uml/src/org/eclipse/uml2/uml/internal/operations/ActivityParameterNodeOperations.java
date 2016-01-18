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

import org.eclipse.uml2.uml.ActivityParameterNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Parameter Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateHasParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateSameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoIncomingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Incoming Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Edges</em>}</li>
 * </ul>
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
	 * The parameter of an ActivityParameterNode must be from the containing Activity.
	 * activity.ownedParameter->includes(parameter)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARAMETER_NODE__HAS_PARAMETERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHasParameters", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityParameterNode,
									context)}),
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
	 * The type of an ActivityParameterNode is the same as the type of its parameter.
	 * type = parameter.type
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARAMETER_NODE__SAME_TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityParameterNode,
									context)}),
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
	 * An ActivityParameterNode may have all incoming ActivityEdges or all outgoing ActivityEdges, but it must not have both incoming and outgoing ActivityEdges.
	 * incoming->isEmpty() or outgoing->isEmpty()
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARAMETER_NODE__NO_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityParameterNode,
									context)}),
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
	 * An ActivityParameterNode with no incoming ActivityEdges and one or more outgoing ActivityEdges must have a parameter with direction in or inout.
	 * (outgoing->notEmpty() and incoming->isEmpty()) implies 
	 * 	(parameter.direction = ParameterDirectionKind::_'in' or 
	 * 	 parameter.direction = ParameterDirectionKind::inout)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARAMETER_NODE__NO_INCOMING_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoIncomingEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityParameterNode,
									context)}),
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
	 * An ActivityParameterNode with no outgoing ActivityEdges and one or more incoming ActivityEdges must have a parameter with direction out, inout, or return.
	 * (incoming->notEmpty() and outgoing->isEmpty()) implies 
	 * 	(parameter.direction = ParameterDirectionKind::out or 
	 * 	 parameter.direction = ParameterDirectionKind::inout or 
	 * 	 parameter.direction = ParameterDirectionKind::return)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARAMETER_NODE__NO_OUTGOING_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoOutgoingEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityParameterNode,
									context)}),
					new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

} // ActivityParameterNodeOperations