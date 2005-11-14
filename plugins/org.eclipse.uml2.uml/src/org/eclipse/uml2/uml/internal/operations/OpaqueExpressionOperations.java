/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OpaqueExpressionOperations.java,v 1.1 2005/11/14 22:25:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.OpaqueExpression;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Opaque Expression</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#validateLanguageBodySize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Body Size</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#validateOneBodyDefaultLanguage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Body Default Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#validateOnlyReturnResultParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Return Result Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#validateOneReturnResultParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Return Result Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#value() <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#isIntegral() <em>Is Integral</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#isPositive() <em>Is Positive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#isNonNegative() <em>Is Non Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class OpaqueExpressionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OpaqueExpressionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the language attribute is not empty, then the size of the body and language arrays must be the same.
	 * language->notEmpty() implies (body->size() = language->size())
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageBodySize(
			OpaqueExpression opaqueExpression, DiagnosticChain diagnostics,
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
						UMLValidator.OPAQUE_EXPRESSION__LANGUAGE_BODY_SIZE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateLanguageBodySize", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(opaqueExpression, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{opaqueExpression}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is only one body then the size of the language is exactly 0 (corresponding to the default language).
	 * The there is only one body then the size of the language is exactly 0 (corresponding to the default language).
	 * language->isEmpty() implies (body->size() = 1)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneBodyDefaultLanguage(
			OpaqueExpression opaqueExpression, DiagnosticChain diagnostics,
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
						UMLValidator.OPAQUE_EXPRESSION__ONE_BODY_DEFAULT_LANGUAGE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneBodyDefaultLanguage", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(opaqueExpression, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{opaqueExpression}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior may only have return result parameters.
	 * self.behavior.notEmpty() implies
	 * 
	 *   self.behavior.ownedParameters->select(p | p.direction<>#return)->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOnlyReturnResultParameters(
			OpaqueExpression opaqueExpression, DiagnosticChain diagnostics,
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
						UMLValidator.OPAQUE_EXPRESSION__ONLY_RETURN_RESULT_PARAMETERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOnlyReturnResultParameters", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(opaqueExpression, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{opaqueExpression}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior must have exactly one return result parameter.
	 * self.behavior.notEmpty() implies
	 * 
	 *   self.behavior.ownedParameter->select(p | p.direction=#return)->size() = 1
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneReturnResultParameter(
			OpaqueExpression opaqueExpression, DiagnosticChain diagnostics,
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
						UMLValidator.OPAQUE_EXPRESSION__ONE_RETURN_RESULT_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneReturnResultParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(opaqueExpression, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{opaqueExpression}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query value() gives an integer value for an expression intended to produce one.
	 * self.isIntegral()
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int value(OpaqueExpression opaqueExpression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isIntegral() tells whether an expression is intended to produce an integer.
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isIntegral(OpaqueExpression opaqueExpression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isPositive() tells whether an integer expression has a positive value.
	 * self.isIntegral()
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isPositive(OpaqueExpression opaqueExpression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNonNegative() tells whether an integer expression has a non-negative value.
	 * self.isIntegral()
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isNonNegative(OpaqueExpression opaqueExpression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // OpaqueExpressionOperations