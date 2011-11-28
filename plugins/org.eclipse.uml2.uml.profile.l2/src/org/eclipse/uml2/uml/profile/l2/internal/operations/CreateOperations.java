/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *   Kenn Hussey (CEA) - 351774
 *
 */
package org.eclipse.uml2.uml.profile.l2.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.profile.l2.Create;
import org.eclipse.uml2.uml.profile.l2.L2Plugin;

import org.eclipse.uml2.uml.profile.l2.util.L2Validator;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Create</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.l2.Create#validateClientAndSupplierAreClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client And Supplier Are Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class CreateOperations
		extends UMLUtil {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Usage->notEmpty() implies (self.base_Usage.client->forAll(oclIsKindOf(Classifier)) and self.base_Usage.supplier->forAll(oclIsKindOf(Classifier)))
	 * @param create The receiving '<em><b>Create</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateClientAndSupplierAreClassifiers(
			Create create, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		Usage base_Usage = create.getBase_Usage();

		if (base_Usage != null) {

			for (NamedElement client : base_Usage.getClients()) {

				if (!(client instanceof Classifier)) {
					result = false;
					break;
				}
			}

			if (result) {

				for (NamedElement supplier : base_Usage.getSuppliers()) {

					if (!(supplier instanceof Classifier)) {
						result = false;
						break;
					}
				}
			}

			if (!result && diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						L2Validator.DIAGNOSTIC_SOURCE,
						L2Validator.CREATE__CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS,
						L2Plugin.INSTANCE
							.getString(
								"_UI_Create_ClientAndSupplierAreClassifiers_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, base_Usage)),
						new Object[]{base_Usage}));
			}
		}

		return result;
	}

} // CreateOperations