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
 * $Id: JoinNodeOperations.java,v 1.7 2007/05/03 21:11:53 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.JoinNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Join Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.JoinNode#validateOneOutgoingEdge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Outgoing Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.JoinNode#validateIncomingObjectFlow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Object Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinNodeOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A join node has one outgoing edge.
	 * self.outgoing->size() = 1
	 * @param joinNode The receiving '<em><b>Join Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOutgoingEdge(JoinNode joinNode,
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
						UMLValidator.JOIN_NODE__ONE_OUTGOING_EDGE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneOutgoingEdge", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(joinNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{joinNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a join node has an incoming object flow, it must have an outgoing object flow, otherwise, it must have an outgoing control flow.
	 * (self.incoming.select(e | e.isTypeOf(ObjectFlow)->notEmpty() implies
	 *   self.outgoing.isTypeOf(ObjectFlow)) and
	 *     (self.incoming.select(e | e.isTypeOf(ObjectFlow)->empty() implies
	 *       self.outgoing.isTypeOf(ControlFlow))
	 * @param joinNode The receiving '<em><b>Join Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIncomingObjectFlow(JoinNode joinNode,
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
						UMLValidator.JOIN_NODE__INCOMING_OBJECT_FLOW,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIncomingObjectFlow", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(joinNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{joinNode}));
			}
			return false;
		}
		return true;
	}

} // JoinNodeOperations