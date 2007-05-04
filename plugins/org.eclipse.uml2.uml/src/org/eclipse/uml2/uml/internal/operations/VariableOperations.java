/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: VariableOperations.java,v 1.7 2007/05/04 20:35:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Variable;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Variable</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Variable#validateOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Owned</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Variable#isAccessibleBy(org.eclipse.uml2.uml.Action) <em>Is Accessible By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableOperations
		extends ConnectableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A variable is owned by a StructuredNode or Activity, but not both.
	 * true
	 * @param variable The receiving '<em><b>Variable</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOwned(Variable variable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.VARIABLE__OWNED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOwned", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(variable, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{variable}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The isAccessibleBy() operation is not defined in standard UML. Implementations should define it to specify which actions can access a variable.
	 * 
	 * result = true
	 * @param variable The receiving '<em><b>Variable</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isAccessibleBy(Variable variable, Action a) {
		throw new UnsupportedOperationException();
	}

} // VariableOperations