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

import org.eclipse.uml2.uml.InteractionConstraint;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interaction Constraint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMinintMaxint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint Maxint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMinintNonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint Non Negative</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMaxintPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maxint Positive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateDynamicVariables(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dynamic Variables</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateGlobalData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Global Data</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMaxintGreaterEqualMinint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maxint Greater Equal Minint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionConstraintOperations
		extends ConstraintOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionConstraintOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dynamic variables that take part in the constraint must be owned by the ConnectableElement corresponding to the covered Lifeline.
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDynamicVariables(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_CONSTRAINT__DYNAMIC_VARIABLES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateDynamicVariables", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionConstraint,
									context)}),
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
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGlobalData(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_CONSTRAINT__GLOBAL_DATA,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateGlobalData", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionConstraint,
									context)}),
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
	 * maxint->notEmpty() or minint->notEmpty() implies
	 * interactionOperand.combinedFragment.interactionOperator =
	 * InteractionOperatorKind::loop
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinintMaxint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_CONSTRAINT__MININT_MAXINT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMinintMaxint", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionConstraint,
									context)}),
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
	 * minint->notEmpty() implies 
	 * minint->asSequence()->first().integerValue() >= 0
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinintNonNegative(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_CONSTRAINT__MININT_NON_NEGATIVE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMinintNonNegative", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionConstraint,
									context)}),
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
	 * maxint->notEmpty() implies 
	 * maxint->asSequence()->first().integerValue() > 0
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaxintPositive(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_CONSTRAINT__MAXINT_POSITIVE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMaxintPositive", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionConstraint,
									context)}),
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
	 * If maxint is specified, then minint must be specified and the evaluation of maxint must be >= the evaluation of minint.
	 * maxint->notEmpty() implies (minint->notEmpty() and 
	 * maxint->asSequence()->first().integerValue() >=
	 * minint->asSequence()->first().integerValue() )
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaxintGreaterEqualMinint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMaxintGreaterEqualMinint", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionConstraint,
									context)}),
					new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

} // InteractionConstraintOperations