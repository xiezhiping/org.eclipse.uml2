/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Function Behavior</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types Of Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#hasAllDataTypeAttributes(org.eclipse.uml2.uml.DataType) <em>Has All Data Type Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBehaviorOperations
		extends BehaviorOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBehaviorOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A FunctionBehavior has at least one output Parameter.
	 * self.ownedParameter->
	 *   select(p | p.direction = ParameterDirectionKind::out or p.direction= ParameterDirectionKind::inout or p.direction= ParameterDirectionKind::return)->size() >= 1
	 * @param functionBehavior The receiving '<em><b>Function Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOutputParameter(
			FunctionBehavior functionBehavior, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.FUNCTION_BEHAVIOR__ONE_OUTPUT_PARAMETER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneOutputParameter", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(functionBehavior, context)}),
					new Object[]{functionBehavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of the ownedParameters are all DataTypes, which may not nest anything but other DataTypes.
	 * ownedParameter->forAll(p | p.type <> null and
	 *   p.type.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p.type.oclAsType(DataType)))
	 * @param functionBehavior The receiving '<em><b>Function Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypesOfParameters(
			FunctionBehavior functionBehavior, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.FUNCTION_BEHAVIOR__TYPES_OF_PARAMETERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypesOfParameters", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(functionBehavior, context)}),
					new Object[]{functionBehavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hasAllDataTypeAttributes query tests whether the types of the attributes of the given DataType are all DataTypes, and similarly for all those DataTypes.
	 * result = (d.ownedAttribute->forAll(a |
	 *     a.type.oclIsKindOf(DataType) and
	 *       hasAllDataTypeAttributes(a.type.oclAsType(DataType))))
	 * <p>From package UML::CommonBehavior.</p>
	 * @param functionBehavior The receiving '<em><b>Function Behavior</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean hasAllDataTypeAttributes(
			FunctionBehavior functionBehavior, DataType d) {

		for (Property ownedAttribute : d.getOwnedAttributes()) {
			Type type = ownedAttribute.getType();

			if (!(type instanceof DataType && hasAllDataTypeAttributes(
				functionBehavior, (DataType) type))) {

				return false;
			}
		}

		return true;
	}

} // FunctionBehaviorOperations