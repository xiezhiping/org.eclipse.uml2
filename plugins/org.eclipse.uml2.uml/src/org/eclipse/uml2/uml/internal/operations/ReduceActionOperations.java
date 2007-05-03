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
 * $Id: ReduceActionOperations.java,v 1.4 2007/05/03 21:11:53 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ReduceAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reduce Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#validateInputTypeIsCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Type Is Collection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#validateOutputTypesAreCompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Output Types Are Compatible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#validateReducerInputsOutput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reducer Inputs Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReduceActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the input must be a collection.
	 * true
	 * @param reduceAction The receiving '<em><b>Reduce Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInputTypeIsCollection(
			ReduceAction reduceAction, DiagnosticChain diagnostics,
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
						UMLValidator.REDUCE_ACTION__INPUT_TYPE_IS_COLLECTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInputTypeIsCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reduceAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{reduceAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the output must be compatible with the type of the output of the reducer behavior.
	 * true
	 * @param reduceAction The receiving '<em><b>Reduce Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutputTypesAreCompatible(
			ReduceAction reduceAction, DiagnosticChain diagnostics,
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
						UMLValidator.REDUCE_ACTION__OUTPUT_TYPES_ARE_COMPATIBLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOutputTypesAreCompatible", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reduceAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{reduceAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reducer behavior must have two input parameters and one output parameter, of types compatible with the types of elements of the input collection.
	 * true
	 * @param reduceAction The receiving '<em><b>Reduce Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReducerInputsOutput(
			ReduceAction reduceAction, DiagnosticChain diagnostics,
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
						UMLValidator.REDUCE_ACTION__REDUCER_INPUTS_OUTPUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateReducerInputsOutput", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(reduceAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{reduceAction}));
			}
			return false;
		}
		return true;
	}

} // ReduceActionOperations