/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;

import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Call Behavior Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CallBehaviorAction#validateNoOnport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Onport</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallBehaviorAction#outputParameters() <em>Output Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallBehaviorAction#inputParameters() <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallBehaviorActionOperations
		extends CallActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBehaviorActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CallBehaviorAction may not specify onPort.
	 * onPort=null
	 * @param callBehaviorAction The receiving '<em><b>Call Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOnport(
			CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CALL_BEHAVIOR_ACTION__NO_ONPORT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoOnport", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(callBehaviorAction, context)}),
					new Object[]{callBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the inout, out and return ownedParameters of the Behavior being called.
	 * result = (behavior.outputParameters())
	 * <p>From package UML::Actions.</p>
	 * @param callBehaviorAction The receiving '<em><b>Call Behavior Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> outputParameters(
			CallBehaviorAction callBehaviorAction) {
		Behavior behavior = callBehaviorAction.getBehavior();

		if (behavior != null) {
			return behavior.outputParameters();
		} else {
			return ECollections.emptyEList();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the in and inout ownedParameters of the Behavior being called.
	 * result = (behavior.inputParameters())
	 * <p>From package UML::Actions.</p>
	 * @param callBehaviorAction The receiving '<em><b>Call Behavior Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> inputParameters(
			CallBehaviorAction callBehaviorAction) {
		Behavior behavior = callBehaviorAction.getBehavior();

		if (behavior != null) {
			return behavior.inputParameters();
		} else {
			return ECollections.emptyEList();
		}
	}

} // CallBehaviorActionOperations