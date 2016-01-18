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

import org.eclipse.uml2.uml.ActionInputPin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Action Input Pin</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#validateInputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#validateOneOutputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#validateNoControlOrObjectFlow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Control Or Object Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionInputPinOperations
		extends InputPinOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionInputPinOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an ActionInputPin must have exactly one OutputPin.
	 * fromAction.output->size() = 1
	 * @param actionInputPin The receiving '<em><b>Action Input Pin</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOutputPin(ActionInputPin actionInputPin,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTION_INPUT_PIN__ONE_OUTPUT_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneOutputPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(actionInputPin, context)}),
					new Object[]{actionInputPin}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an ActionInputPin cannot have ActivityEdges coming into or out of it or its Pins.
	 * fromAction.incoming->union(outgoing)->isEmpty() and
	 * fromAction.input.incoming->isEmpty() and
	 * fromAction.output.outgoing->isEmpty()
	 * @param actionInputPin The receiving '<em><b>Action Input Pin</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoControlOrObjectFlow(
			ActionInputPin actionInputPin, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTION_INPUT_PIN__NO_CONTROL_OR_OBJECT_FLOW,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoControlOrObjectFlow", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(actionInputPin, context)}),
					new Object[]{actionInputPin}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an ActionInputPin must only have ActionInputPins as InputPins.
	 * fromAction.input->forAll(oclIsKindOf(ActionInputPin))
	 * @param actionInputPin The receiving '<em><b>Action Input Pin</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputPin(ActionInputPin actionInputPin,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTION_INPUT_PIN__INPUT_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInputPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(actionInputPin, context)}),
					new Object[]{actionInputPin}));
			}
			return false;
		}
		return true;
	}

} // ActionInputPinOperations