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
 * $Id: InteractionConstraintOperations.java,v 1.1 2005/11/14 22:25:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.InteractionConstraint;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interaction Constraint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateDynamicVariables(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dynamic Variables</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateGlobalData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Global Data</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMinintMaxint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint Maxint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMinint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMaxint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maxint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMaxintGreaterEqualMinint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maxint Greater Equal Minint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class InteractionConstraintOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InteractionConstraintOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dynamic variables that take part in the constraint must be owned by the ConnectableElement corresponding to the covered Lifeline.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDynamicVariables(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__DYNAMIC_VARIABLES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDynamicVariables", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint may contain references to global data or write-once data.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGlobalData(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__GLOBAL_DATA,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGlobalData", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minint/maxint can only be present if the InteractionConstraint is associated with the operand of a loop CombinedFragment.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinintMaxint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MININT_MAXINT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMinintMaxint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If minint is specified, then the expression must evaluate to a non-negative integer.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MININT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMinint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If maxint is specified, then the expression must evaluate to a positive integer.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaxint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MAXINT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMaxint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If maxint is specified, then minint must be specified and the evaluation of maxint must be >= the evaluation of minint
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaxintGreaterEqualMinint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMaxintGreaterEqualMinint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

} // InteractionConstraintOperations