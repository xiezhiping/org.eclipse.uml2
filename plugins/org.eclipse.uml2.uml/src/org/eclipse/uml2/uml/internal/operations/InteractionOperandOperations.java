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
 * $Id: InteractionOperandOperations.java,v 1.1 2005/11/14 22:25:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.InteractionOperand;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interaction Operand</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionOperand#validateGuardDirectlyPrior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guard Directly Prior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionOperand#validateGuardContainReferences(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guard Contain References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class InteractionOperandOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InteractionOperandOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard must be placed directly prior to (above) the OccurrenceSpecification that will become the first OccurrenceSpecification within this InteractionOperand.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGuardDirectlyPrior(
			InteractionOperand interactionOperand, DiagnosticChain diagnostics,
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
						UMLValidator.INTERACTION_OPERAND__GUARD_DIRECTLY_PRIOR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGuardDirectlyPrior", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionOperand, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionOperand}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard must contain only references to values local to the Lifeline on which it resides, or values global to the whole Interaction.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGuardContainReferences(
			InteractionOperand interactionOperand, DiagnosticChain diagnostics,
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
						UMLValidator.INTERACTION_OPERAND__GUARD_CONTAIN_REFERENCES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGuardContainReferences", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionOperand, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionOperand}));
			}
			return false;
		}
		return true;
	}

} // InteractionOperandOperations