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
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Execution Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExecutionSpecification#validateSameLifeline(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Lifeline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionSpecificationOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The startEvent and the finishEvent must be on the same Lifeline.
	 * start.covered = finish.covered
	 * @param executionSpecification The receiving '<em><b>Execution Specification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSameLifeline(
			ExecutionSpecification executionSpecification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		OccurrenceSpecification start = executionSpecification.getStart();

		if (start != null) {
			OccurrenceSpecification finish = executionSpecification.getFinish();

			if (finish != null) {
				EList<Lifeline> startCovereds = start.getCovereds();
				EList<Lifeline> finishCovereds = finish.getCovereds();

				if (!startCovereds.containsAll(finishCovereds)
					|| !finishCovereds.containsAll(startCovereds)) {

					if (diagnostics != null) {
						diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.EXECUTION_SPECIFICATION__SAME_LIFELINE,
							UMLPlugin.INSTANCE.getString(
								"_UI_ExecutionSpecification_SameLifeline_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context,
									executionSpecification)),
							new Object[]{executionSpecification}));
					}

					return false;
				}

			}
		}

		return true;
	}

} // ExecutionSpecificationOperations
