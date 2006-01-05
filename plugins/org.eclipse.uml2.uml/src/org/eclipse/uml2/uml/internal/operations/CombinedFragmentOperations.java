/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CombinedFragmentOperations.java,v 1.4 2006/01/05 22:43:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.CombinedFragment;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Combined Fragment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateOptLoopBreakNeg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opt Loop Break Neg</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateMinintAndMaxint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint And Maxint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateBreak(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Break</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateConsiderAndIgnore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consider And Ignore</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is opt, loop, break, or neg there must be exactly one operand
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOptLoopBreakNeg(
			CombinedFragment combinedFragment, DiagnosticChain diagnostics,
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
						UMLValidator.COMBINED_FRAGMENT__OPT_LOOP_BREAK_NEG,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOptLoopBreakNeg", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(combinedFragment, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{combinedFragment}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionConstraint with minint and maxint only apply when attached to an InteractionOperand where the interactionOperator is loop.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinintAndMaxint(
			CombinedFragment combinedFragment, DiagnosticChain diagnostics,
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
						UMLValidator.COMBINED_FRAGMENT__MININT_AND_MAXINT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMinintAndMaxint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(combinedFragment, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{combinedFragment}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is break, the corresponding InteractionOperand must cover all Lifelines within the enclosing InteractionFragment.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBreak(CombinedFragment combinedFragment,
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
						UMLValidator.COMBINED_FRAGMENT__BREAK,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBreak", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(combinedFragment, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{combinedFragment}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interaction operators 'consider' and 'ignore' can only be used for the CombineIgnoreFragment subtype of CombinedFragment
	 * ((interactionOperator = #consider) or (interactionOperator = #ignore)) implies oclsisTypeOf(CombineIgnoreFragment)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsiderAndIgnore(
			CombinedFragment combinedFragment, DiagnosticChain diagnostics,
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
						UMLValidator.COMBINED_FRAGMENT__CONSIDER_AND_IGNORE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateConsiderAndIgnore", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(combinedFragment, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{combinedFragment}));
			}
			return false;
		}
		return true;
	}

} // CombinedFragmentOperations