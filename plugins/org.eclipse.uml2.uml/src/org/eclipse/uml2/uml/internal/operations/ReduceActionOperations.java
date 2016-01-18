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

import org.eclipse.uml2.uml.ReduceAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reduce Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#validateReducerInputsOutput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reducer Inputs Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#validateInputTypeIsCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Type Is Collection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#validateOutputTypesAreCompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Output Types Are Compatible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReduceActionOperations
		extends ActionOperations {

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
	 * The type of the collection InputPin must be a collection.
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REDUCE_ACTION__INPUT_TYPE_IS_COLLECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInputTypeIsCollection", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(reduceAction, context)}),
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
	 * The type of the output of the reducer Behavior must conform to the type of the result OutputPin.
	 * reducer.outputParameters().type->forAll(conformsTo(result.type))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REDUCE_ACTION__OUTPUT_TYPES_ARE_COMPATIBLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOutputTypesAreCompatible", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(reduceAction, context)}),
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
	 * The reducer Behavior must have two input ownedParameters and one output ownedParameter, where the type of the output Parameter and the type of elements of the input collection conform to the types of the input Parameters.
	 * let inputs: OrderedSet(Parameter) = reducer.inputParameters() in
	 * let outputs: OrderedSet(Parameter) = reducer.outputParameters() in
	 * inputs->size()=2 and outputs->size()=1 and
	 * inputs.type->forAll(t | 
	 * 	outputs.type->forAll(conformsTo(t)) and 
	 * 	-- Note that the following only checks the case when the collection is via multiple tokens.
	 * 	collection.upperBound()>1 implies collection.type.conformsTo(t))
	 * @param reduceAction The receiving '<em><b>Reduce Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReducerInputsOutput(ReduceAction reduceAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REDUCE_ACTION__REDUCER_INPUTS_OUTPUT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateReducerInputsOutput", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(reduceAction, context)}),
					new Object[]{reduceAction}));
			}
			return false;
		}
		return true;
	}

} // ReduceActionOperations