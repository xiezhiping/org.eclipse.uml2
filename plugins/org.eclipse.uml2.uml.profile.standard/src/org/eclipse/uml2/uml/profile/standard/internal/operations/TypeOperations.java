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

import org.eclipse.uml2.uml.profile.standard.StandardPlugin;
import org.eclipse.uml2.uml.profile.standard.Specification;
import org.eclipse.uml2.uml.profile.standard.Type;

import org.eclipse.uml2.uml.profile.standard.util.StandardValidator;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Type#validateCannotBeSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class TypeOperations
		extends UMLUtil {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.extension_Specification->isEmpty()
	 * @param type The receiving '<em><b>Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateCannotBeSpecification(Type type,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		org.eclipse.uml2.uml.Class base_Class = type.getBase_Class();

		if (base_Class != null
			&& getStereotypeApplication(base_Class, Specification.class) != null) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					StandardValidator.DIAGNOSTIC_SOURCE,
					StandardValidator.TYPE__CANNOT_BE_SPECIFICATION,
					StandardPlugin.INSTANCE.getString(
						"_UI_Type_CannotBeSpecification_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, base_Class)),
					new Object[]{base_Class}));
			}
		}

		return result;
	}

} // TypeOperations