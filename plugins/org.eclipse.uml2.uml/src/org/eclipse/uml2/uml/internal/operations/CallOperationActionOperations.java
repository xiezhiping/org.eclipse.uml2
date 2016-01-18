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
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Operation;

import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Call Operation Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CallOperationAction#validateTypeTargetPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Target Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallOperationAction#outputParameters() <em>Output Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CallOperationAction#inputParameters() <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallOperationActionOperations
		extends CallActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallOperationActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If onPort has no value, the operation must be an owned or inherited feature of the type of the target InputPin, otherwise the Port given by onPort must be an owned or inherited feature of the type of the target InputPin, and the Port must have a required or provided Interface with the operation as an owned or inherited feature.
	 * if onPort=null then  target.type.oclAsType(Classifier).allFeatures()->includes(operation)
	 * else target.type.oclAsType(Classifier).allFeatures()->includes(onPort) and onPort.provided->union(onPort.required).allFeatures()->includes(operation)
	 * endif
	 * @param callOperationAction The receiving '<em><b>Call Operation Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeTargetPin(
			CallOperationAction callOperationAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CALL_OPERATION_ACTION__TYPE_TARGET_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeTargetPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(callOperationAction, context)}),
					new Object[]{callOperationAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the inout, out and return ownedParameters of the Operation being called.
	 * result = (operation.outputParameters())
	 * <p>From package UML::Actions.</p>
	 * @param callOperationAction The receiving '<em><b>Call Operation Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> outputParameters(
			CallOperationAction callOperationAction) {
		Operation operation = callOperationAction.getOperation();

		if (operation != null) {
			return operation.outputParameters();
		} else {
			return ECollections.emptyEList();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the in and inout ownedParameters of the Operation being called.
	 * result = (operation.inputParameters())
	 * <p>From package UML::Actions.</p>
	 * @param callOperationAction The receiving '<em><b>Call Operation Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> inputParameters(
			CallOperationAction callOperationAction) {
		Operation operation = callOperationAction.getOperation();

		if (operation != null) {
			return operation.inputParameters();
		} else {
			return ECollections.emptyEList();
		}
	}

} // CallOperationActionOperations