/*
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StartObjectBehaviorActionOperations.java,v 1.1 2008/10/02 20:56:22 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.StartObjectBehaviorAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Start Object Behavior Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateMultiplicityOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNumberOrderArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Order Arguments</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNumberOrderResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Order Results</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOrderingMultiplicityMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Ordering Multiplicity Match</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartObjectBehaviorActionOperations
		extends CallActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartObjectBehaviorActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object input pin must be either a Behavior or a BehavioredClassifier with a classifier behavior.
	 * true
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfObject(
			StartObjectBehaviorAction startObjectBehaviorAction,
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
						UMLValidator.START_OBJECT_BEHAVIOR_ACTION__TYPE_OF_OBJECT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeOfObject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(startObjectBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object input pin must be [1..1].
	 * true
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfObject(
			StartObjectBehaviorAction startObjectBehaviorAction,
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
						UMLValidator.START_OBJECT_BEHAVIOR_ACTION__MULTIPLICITY_OF_OBJECT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfObject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(startObjectBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number and order of the argument pins must be the same as the number and order of the in and in-out parameters of the invoked behavior. Pins are matched to parameters by order.
	 * true
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNumberOrderArguments(
			StartObjectBehaviorAction startObjectBehaviorAction,
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
						UMLValidator.START_OBJECT_BEHAVIOR_ACTION__NUMBER_ORDER_ARGUMENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNumberOrderArguments", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(startObjectBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number and order of result pins must be the same as the number and order of the in-out, out and return parameters of the invoked behavior. Pins are matched to parameters by order.
	 * true
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNumberOrderResults(
			StartObjectBehaviorAction startObjectBehaviorAction,
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
						UMLValidator.START_OBJECT_BEHAVIOR_ACTION__NUMBER_ORDER_RESULTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNumberOrderResults", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(startObjectBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type, ordering, and multiplicity of an argument or result pin must be the same as the corresponding parameter of the behavior.
	 * true
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOrderingMultiplicityMatch(
			StartObjectBehaviorAction startObjectBehaviorAction,
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
						UMLValidator.START_OBJECT_BEHAVIOR_ACTION__TYPE_ORDERING_MULTIPLICITY_MATCH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeOrderingMultiplicityMatch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(startObjectBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

} // StartObjectBehaviorActionOperations
