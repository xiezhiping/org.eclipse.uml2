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
 * $Id: ExecutionSpecificationOperations.java,v 1.3 2005/11/30 21:43:11 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ExecutionSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Execution Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExecutionSpecification#validateSameLifeline(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Lifeline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ExecutionSpecificationOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExecutionSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The startEvent and the finishEvent must be on the same Lifeline
	 * start.lifeline = finish.lifeline
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameLifeline(
			ExecutionSpecification executionSpecification,
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
						UMLValidator.EXECUTION_SPECIFICATION__SAME_LIFELINE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameLifeline", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(executionSpecification, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{executionSpecification}));
			}
			return false;
		}
		return true;
	}

} // ExecutionSpecificationOperations