/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassifierTemplateParameterOperations.java,v 1.4 2005/11/30 21:43:10 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ClassifierTemplateParameter;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier Template Parameter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ClassifierTemplateParameter#validateHasConstrainingClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Constraining Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ClassifierTemplateParameterOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassifierTemplateParameterOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If "allowSubstitutable" is true, then there must be a constrainingClassifier.
	 * allowSubstitutable implies constrainingClassifier->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasConstrainingClassifier(
			ClassifierTemplateParameter classifierTemplateParameter,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.CLASSIFIER_TEMPLATE_PARAMETER__HAS_CONSTRAINING_CLASSIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasConstrainingClassifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifierTemplateParameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifierTemplateParameter}));
			}
			return false;
		}
		return true;
	}

} // ClassifierTemplateParameterOperations