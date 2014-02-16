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

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.profile.standard.Implement;
import org.eclipse.uml2.uml.profile.standard.StandardPlugin;
import org.eclipse.uml2.uml.profile.standard.Specification;

import org.eclipse.uml2.uml.profile.standard.util.StandardValidator;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Implement</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Implement#validateImplementsSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implements Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class ImplementOperations
		extends UMLUtil {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Component.clientDependency.supplier->select(oclIsKindOf(Classifier)).oclAsType(Classifier).extension_Specificaiton->notEmpty()
	 * @param implement The receiving '<em><b>Implement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateImplementsSpecification(Implement implement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		Component base_Component = implement.getBase_Component();

		if (base_Component != null) {
			result = false;

			LOOP : for (Dependency dependency : base_Component
				.getClientDependencies()) {

				for (NamedElement supplier : dependency.getSuppliers()) {

					if (getStereotypeApplication(supplier, Specification.class) != null) {
						result = true;
						break LOOP;
					}
				}
			}

			if (!result && diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					StandardValidator.DIAGNOSTIC_SOURCE,
					StandardValidator.IMPLEMENT__IMPLEMENTS_SPECIFICATION,
					StandardPlugin.INSTANCE.getString(
						"_UI_Implement_ImplementsSpecification_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, base_Component)),
					new Object[]{base_Component}));
			}
		}

		return result;
	}

} // ImplementOperations