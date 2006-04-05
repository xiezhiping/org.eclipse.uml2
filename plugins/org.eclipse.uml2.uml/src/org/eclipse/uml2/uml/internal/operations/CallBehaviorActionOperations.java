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
 * $Id: CallBehaviorActionOperations.java,v 1.5 2006/04/05 13:50:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.CallBehaviorAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Call Behavior Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CallBehaviorAction#validateArgumentPinEqualParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Argument Pin Equal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallBehaviorAction#validateResultPinEqualParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pin Equal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallBehaviorAction#validateTypeOrderingMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Ordering Multiplicity</em>}</li>
 * </ul>
 * </p>
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
	 * The number of argument pins and the number of parameters of the behavior of type in and in-out must be equal.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateArgumentPinEqualParameter(
			CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.CALL_BEHAVIOR_ACTION__ARGUMENT_PIN_EQUAL_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateArgumentPinEqualParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(callBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The number of result pins and the number of parameters of the behavior of type return, out, and in-out must be equal.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultPinEqualParameter(
			CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.CALL_BEHAVIOR_ACTION__RESULT_PIN_EQUAL_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateResultPinEqualParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(callBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The type, ordering, and multiplicity of an argument or result pin is derived from the corresponding parameter of the behavior.
	 * 
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOrderingMultiplicity(
			CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.CALL_BEHAVIOR_ACTION__TYPE_ORDERING_MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeOrderingMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(callBehaviorAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{callBehaviorAction}));
			}
			return false;
		}
		return true;
	}

} // CallBehaviorActionOperations