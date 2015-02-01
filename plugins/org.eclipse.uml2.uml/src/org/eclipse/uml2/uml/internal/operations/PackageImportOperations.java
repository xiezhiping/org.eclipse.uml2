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

import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package Import</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.PackageImport#validatePublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Or Private</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImportOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImportOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of a PackageImport is either public or private.
	 * visibility = VisibilityKind::public or visibility = VisibilityKind::private
	 * @param packageImport The receiving '<em><b>Package Import</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validatePublicOrPrivate(PackageImport packageImport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		VisibilityKind visibility = packageImport.getVisibility();

		if (visibility != VisibilityKind.PUBLIC_LITERAL
			&& visibility != VisibilityKind.PRIVATE_LITERAL) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PACKAGE_IMPORT__PUBLIC_OR_PRIVATE,
					UMLPlugin.INSTANCE.getString(
						"_UI_PackageImport_PublicOrPrivate_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, packageImport)),
					new Object[]{packageImport}));

			}
		}

		return result;
	}

} // PackageImportOperations