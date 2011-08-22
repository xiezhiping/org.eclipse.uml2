/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.profile.l2.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.profile.l2.Send;

import org.eclipse.uml2.uml.profile.l2.util.L2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Send</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.l2.Send#validateClientOperationSendsSupplierSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client Operation Sends Supplier Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Usage.client->forAll(oclIsKindOf(Operation)) and self.base_Usage.supplier->forAll(oclIsKindOf(Signal))
	 * @param send The receiving '<em><b>Send</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClientOperationSendsSupplierSignal(Send send,
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
						L2Validator.DIAGNOSTIC_SOURCE,
						L2Validator.SEND__CLIENT_OPERATION_SENDS_SUPPLIER_SIGNAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClientOperationSendsSupplierSignal", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(send, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{send}));
			}
			return false;
		}
		return true;
	}

} // SendOperations