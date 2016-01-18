/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.BroadcastSignalAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Broadcast Signal Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BroadcastSignalAction#validateNumberOfArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Arguments</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BroadcastSignalAction#validateTypeOrderingMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Ordering Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BroadcastSignalAction#validateNoOnport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Onport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BroadcastSignalActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastSignalActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of argument InputPins must be the same as the number of attributes in the signal.
	 * argument->size() = signal.allAttributes()->size()
	 * @param broadcastSignalAction The receiving '<em><b>Broadcast Signal Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNumberOfArguments(
			BroadcastSignalAction broadcastSignalAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BROADCAST_SIGNAL_ACTION__NUMBER_OF_ARGUMENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNumberOfArguments", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(broadcastSignalAction,
									context)}),
					new Object[]{broadcastSignalAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type, ordering, and multiplicity of an argument InputPin must be the same as the corresponding attribute of the signal.
	 * let attribute: OrderedSet(Property) = signal.allAttributes() in
	 * Sequence{1..argument->size()}->forAll(i | 
	 * 	argument->at(i).type.conformsTo(attribute->at(i).type) and 
	 * 	argument->at(i).isOrdered = attribute->at(i).isOrdered and
	 * 	argument->at(i).compatibleWith(attribute->at(i)))
	 * @param broadcastSignalAction The receiving '<em><b>Broadcast Signal Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOrderingMultiplicity(
			BroadcastSignalAction broadcastSignalAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BROADCAST_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOrderingMultiplicity", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(broadcastSignalAction,
									context)}),
					new Object[]{broadcastSignalAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A BroadcaseSignalAction may not specify onPort.
	 * onPort=null
	 * @param broadcastSignalAction The receiving '<em><b>Broadcast Signal Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOnport(
			BroadcastSignalAction broadcastSignalAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BROADCAST_SIGNAL_ACTION__NO_ONPORT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoOnport", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(broadcastSignalAction,
									context)}),
					new Object[]{broadcastSignalAction}));
			}
			return false;
		}
		return true;
	}

} // BroadcastSignalActionOperations