/*
 * Copyright (c) 2011, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 418466
 *
 */
package org.eclipse.uml2.uml.profile.standard.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.profile.standard.StandardPlugin;
import org.eclipse.uml2.uml.profile.standard.Send;

import org.eclipse.uml2.uml.profile.standard.util.StandardValidator;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Send</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Send#validateClientOperationSendsSupplierSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client Operation Sends Supplier Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class SendOperations
		extends UMLUtil {

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
	 * @generated NOT
	 */
	public static boolean validateClientOperationSendsSupplierSignal(Send send,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		Usage base_Usage = send.getBase_Usage();

		if (base_Usage != null) {

			for (NamedElement client : base_Usage.getClients()) {

				if (!(client instanceof Operation)) {
					result = false;
					break;
				}
			}

			if (result) {

				for (NamedElement supplier : base_Usage.getSuppliers()) {

					if (!(supplier instanceof Signal)) {
						result = false;
						break;
					}
				}
			}

			if (!result && diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						StandardValidator.DIAGNOSTIC_SOURCE,
						StandardValidator.SEND__CLIENT_OPERATION_SENDS_SUPPLIER_SIGNAL,
						StandardPlugin.INSTANCE
							.getString(
								"_UI_Send_ClientOperationSendsSupplierSignal_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, base_Usage)),
						new Object[]{base_Usage}));
			}
		}

		return result;
	}

} // SendOperations