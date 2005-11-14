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
 * $Id: ClauseOperations.java,v 1.1 2005/11/14 22:25:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Clause;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clause</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Clause#validateDeciderOutput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Decider Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#validateBodyOutput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ClauseOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClauseOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The decider output pin must be for the test body or a node contained by the test body as a structured node.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeciderOutput(Clause clause,
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
						UMLValidator.CLAUSE__DECIDER_OUTPUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDeciderOutput", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clause, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{clause}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bodyOutput pins are output pins on actions in the body of the clause.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBodyOutput(Clause clause,
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
						UMLValidator.CLAUSE__BODY_OUTPUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBodyOutput", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clause, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{clause}));
			}
			return false;
		}
		return true;
	}

} // ClauseOperations