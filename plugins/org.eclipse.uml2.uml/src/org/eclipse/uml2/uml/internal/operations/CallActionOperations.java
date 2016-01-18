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
import org.eclipse.emf.common.util.ECollections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.CallAction;

import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Call Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CallAction#validateArgumentPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Argument Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallAction#validateResultPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallAction#validateSynchronousCall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Synchronous Call</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallAction#inputParameters() <em>Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallAction#outputParameters() <em>Output Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of argument InputPins must be the same as the number of input (in and inout) ownedParameters of the called Behavior or Operation. The type, ordering and multiplicity of each argument InputPin must be consistent with the corresponding input Parameter.
	 * let parameter: OrderedSet(Parameter) = self.inputParameters() in
	 * argument->size() = parameter->size() and
	 * Sequence{1..argument->size()}->forAll(i | 
	 * 	argument->at(i).type.conformsTo(parameter->at(i).type) and 
	 * 	argument->at(i).isOrdered = parameter->at(i).isOrdered and
	 * 	argument->at(i).compatibleWith(parameter->at(i)))
	 * @param callAction The receiving '<em><b>Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateArgumentPins(CallAction callAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CALL_ACTION__ARGUMENT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateArgumentPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(callAction, context)}),
					new Object[]{callAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of result OutputPins must be the same as the number of output (inout, out and return) ownedParameters of the called Behavior or Operation. The type, ordering and multiplicity of each result OutputPin must be consistent with the corresponding input Parameter.
	 * let parameter: OrderedSet(Parameter) = self.outputParameters() in
	 * result->size() = parameter->size() and
	 * Sequence{1..result->size()}->forAll(i | 
	 * 	parameter->at(i).type.conformsTo(result->at(i).type) and 
	 * 	parameter->at(i).isOrdered = result->at(i).isOrdered and
	 * 	parameter->at(i).compatibleWith(result->at(i)))
	 * @param callAction The receiving '<em><b>Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultPins(CallAction callAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CALL_ACTION__RESULT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateResultPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(callAction, context)}),
					new Object[]{callAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only synchronous CallActions can have result OutputPins.
	 * result->notEmpty() implies isSynchronous
	 * @param callAction The receiving '<em><b>Call Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSynchronousCall(CallAction callAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CALL_ACTION__SYNCHRONOUS_CALL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSynchronousCall", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(callAction, context)}),
					new Object[]{callAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the in and inout ownedParameters of the Behavior or Operation being called. (This operation is abstract and should be overridden by subclasses of CallAction.)
	 * <p>From package UML::Actions.</p>
	 * @param callAction The receiving '<em><b>Call Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> inputParameters(CallAction callAction) {
		return ECollections.emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the inout, out and return ownedParameters of the Behavior or Operation being called. (This operation is abstract and should be overridden by subclasses of CallAction.)
	 * <p>From package UML::Actions.</p>
	 * @param callAction The receiving '<em><b>Call Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> outputParameters(CallAction callAction) {
		return ECollections.emptyEList();
	}

} // CallActionOperations