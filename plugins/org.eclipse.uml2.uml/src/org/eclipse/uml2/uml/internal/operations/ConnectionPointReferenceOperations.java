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
 * $Id: ConnectionPointReferenceOperations.java,v 1.1 2005/11/14 22:25:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ConnectionPointReference;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Connection Point Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#validateEntryPseudostates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Pseudostates</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectionPointReference#validateExitPseudostates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exit Pseudostates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ConnectionPointReferenceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectionPointReferenceOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry Pseudostates must be Pseudostates with kind entryPoint.
	 * entry->notEmpty() implies entry->forAll(e | e.kind = #entryPoint)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEntryPseudostates(
			ConnectionPointReference connectionPointReference,
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
						UMLValidator.CONNECTION_POINT_REFERENCE__ENTRY_PSEUDOSTATES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEntryPseudostates", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connectionPointReference, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connectionPointReference}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exit Pseudostates must be Pseudostates with kind exitPoint.
	 * exit->notEmpty() implies exit->forAll(e | e.kind = #exitPoint)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExitPseudostates(
			ConnectionPointReference connectionPointReference,
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
						UMLValidator.CONNECTION_POINT_REFERENCE__EXIT_PSEUDOSTATES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateExitPseudostates", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connectionPointReference, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connectionPointReference}));
			}
			return false;
		}
		return true;
	}

} // ConnectionPointReferenceOperations