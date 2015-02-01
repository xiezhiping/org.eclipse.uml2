/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.InitialNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Initial Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InitialNode#validateNoIncomingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Incoming Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InitialNode#validateControlEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Control Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialNodeOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InitialNode has no incoming ActivityEdges.
	 * incoming->isEmpty()
	 * @param initialNode The receiving '<em><b>Initial Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoIncomingEdges(InitialNode initialNode,
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
						UMLValidator.INITIAL_NODE__NO_INCOMING_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoIncomingEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(initialNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{initialNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the outgoing ActivityEdges from an InitialNode must be ControlFlows.
	 * outgoing->forAll(oclIsKindOf(ControlFlow))
	 * @param initialNode The receiving '<em><b>Initial Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateControlEdges(InitialNode initialNode,
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
						UMLValidator.INITIAL_NODE__CONTROL_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateControlEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(initialNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{initialNode}));
			}
			return false;
		}
		return true;
	}

} // InitialNodeOperations