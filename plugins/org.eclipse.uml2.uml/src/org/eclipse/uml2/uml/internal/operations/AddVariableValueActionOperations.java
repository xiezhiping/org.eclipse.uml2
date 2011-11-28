/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.Variable;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Add Variable Value Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AddVariableValueAction#validateRequiredValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Required Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AddVariableValueAction#validateSingleInputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Single Input Pin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddVariableValueActionOperations
		extends WriteVariableActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddVariableValueActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value input pin is required.
	 * self.value -> notEmpty()
	 * @param addVariableValueAction The receiving '<em><b>Add Variable Value Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRequiredValue(
			AddVariableValueAction addVariableValueAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = addVariableValueAction.getValue() != null;

		if (!result && diagnostics != null) {
			diagnostics
				.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ADD_VARIABLE_VALUE_ACTION__REQUIRED_VALUE,
					UMLPlugin.INSTANCE
						.getString(
							"_UI_AddVariableValueAction_RequiredValue_diagnostic", getMessageSubstitutions(context, addVariableValueAction)), //$NON-NLS-1$
					new Object[]{addVariableValueAction}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions adding values to ordered variables must have a single input pin for the insertion point with type UnlimtedNatural and multiplicity of 1..1, otherwise the action has no input pin for the insertion point.
	 * let insertAtPins : Collection = self.insertAt in
	 * if self.variable.ordering = #unordered
	 * then insertAtPins->size() = 0
	 * else let insertAtPin : InputPin = insertAt->asSequence()->first() in
	 * insertAtPins->size() = 1
	 * and insertAtPin.type = UnlimitedNatural
	 * and insertAtPin.multiplicity.is(1,1))
	 * endif
	 * 
	 * @param addVariableValueAction The receiving '<em><b>Add Variable Value Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSingleInputPin(
			AddVariableValueAction addVariableValueAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		Variable variable = addVariableValueAction.getVariable();

		if (variable != null) {
			InputPin insertAt = addVariableValueAction.getInsertAt();

			if (variable.isOrdered()) {
				Type insertAtType = insertAt == null
					? null
					: insertAt.getType();

				result = insertAtType instanceof PrimitiveType
					&& safeEquals("PrimitiveTypes::UnlimitedNatural", //$NON-NLS-1$
						insertAtType.getQualifiedName()) && insertAt.is(1, 1);
			} else {
				result = insertAt == null;
			}

			if (!result && diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ADD_VARIABLE_VALUE_ACTION__SINGLE_INPUT_PIN,
						UMLPlugin.INSTANCE
							.getString(
								"_UI_AddVariableValueAction_SingleInputPin_diagnostic", getMessageSubstitutions(context, addVariableValueAction)), //$NON-NLS-1$
						new Object[]{addVariableValueAction}));
			}
		}

		return result;
	}

} // AddVariableValueActionOperations