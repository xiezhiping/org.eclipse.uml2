/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ConsiderIgnoreFragment;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consider Ignore Fragment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConsiderIgnoreFragment#validateConsiderOrIgnore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consider Or Ignore</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConsiderIgnoreFragment#validateType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsiderIgnoreFragmentOperations
		extends CombinedFragmentOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsiderIgnoreFragmentOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interaction operator of a ConsiderIgnoreFragment must be either 'consider' or 'ignore'.
	 * (interactionOperator =  InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)
	 * @param considerIgnoreFragment The receiving '<em><b>Consider Ignore Fragment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsiderOrIgnore(
			ConsiderIgnoreFragment considerIgnoreFragment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONSIDER_IGNORE_FRAGMENT__CONSIDER_OR_IGNORE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateConsiderOrIgnore", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(considerIgnoreFragment,
									context)}),
					new Object[]{considerIgnoreFragment}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NamedElements must be of a type of element that can be a signature for a message (i.e.., an Operation, or a Signal).
	 * message->forAll(m | m.oclIsKindOf(Operation) or m.oclIsKindOf(Signal))
	 * @param considerIgnoreFragment The receiving '<em><b>Consider Ignore Fragment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateType(
			ConsiderIgnoreFragment considerIgnoreFragment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONSIDER_IGNORE_FRAGMENT__TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(considerIgnoreFragment,
									context)}),
					new Object[]{considerIgnoreFragment}));
			}
			return false;
		}
		return true;
	}

} // ConsiderIgnoreFragmentOperations