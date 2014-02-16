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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.profile.standard.StandardPlugin;
import org.eclipse.uml2.uml.profile.standard.Specification;
import org.eclipse.uml2.uml.profile.standard.Type;

import org.eclipse.uml2.uml.profile.standard.util.StandardValidator;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Specification#validateCannotBeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class SpecificationOperations
		extends UMLUtil {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.extension_Type->isEmpty()
	 * @param specification The receiving '<em><b>Specification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateCannotBeType(Specification specification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		Classifier base_Classifier = specification.getBase_Classifier();

		if (base_Classifier != null
			&& getStereotypeApplication(base_Classifier, Type.class) != null) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					StandardValidator.DIAGNOSTIC_SOURCE,
					StandardValidator.SPECIFICATION__CANNOT_BE_TYPE,
					StandardPlugin.INSTANCE.getString(
						"_UI_Specification_CannotBeType_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, base_Classifier)),
					new Object[]{base_Classifier}));
			}
		}

		return result;
	}

} // SpecificationOperations