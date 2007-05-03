/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: AcceptEventActionOperations.java,v 1.7 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.AcceptEventAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Accept Event Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Input Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateTriggerEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Events</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall Signal Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptEventActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AcceptEventActions may have no input pins.
	 * true
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoInputPins(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_EVENT_ACTION__NO_INPUT_PINS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoInputPins", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptEventAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There are no output pins if the trigger events are only ChangeEvents, or if they are only CallEvents when this action is an instance of AcceptEventAction and not an instance of a descendant of AcceptEventAction (such as AcceptCallAction).
	 * true
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOutputPins(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_EVENT_ACTION__NO_OUTPUT_PINS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoOutputPins", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptEventAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the trigger events are all TimeEvents, there is exactly one output pin.
	 * true
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTriggerEvents(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_EVENT_ACTION__TRIGGER_EVENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTriggerEvents", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptEventAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isUnmarshall is true, there must be exactly one trigger for events of type SignalEvent. The number of result output pins must be the same as the number of attributes of the signal. The type and ordering of each result output pin must be the same as the corresponding attribute of the signal. The multiplicity of each result output pin must be compatible with the multiplicity of the corresponding attribute.
	 * true
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnmarshallSignalEvents(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.ACCEPT_EVENT_ACTION__UNMARSHALL_SIGNAL_EVENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateUnmarshallSignalEvents", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acceptEventAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

} // AcceptEventActionOperations