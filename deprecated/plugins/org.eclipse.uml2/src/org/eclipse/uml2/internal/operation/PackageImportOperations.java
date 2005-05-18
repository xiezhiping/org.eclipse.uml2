/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageImportOperations.java,v 1.6 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package Import</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageImport#validatePublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Or Private</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class PackageImportOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageImportOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * The visibility of a package import is either public or private.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.visibility = #public or self.visibility = #private
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validatePublicOrPrivate(PackageImport packageImport, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (!VisibilityKind.PUBLIC_LITERAL
			.equals(packageImport.getVisibility())
			&& !VisibilityKind.PRIVATE_LITERAL.equals(packageImport
				.getVisibility())) {

			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.PACKAGE_IMPORT__PUBLIC_OR_PRIVATE,
					UML2Plugin.INSTANCE.getString(
						"_UI_PackageImport_PublicOrPrivate_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, packageImport)),
					new Object[]{packageImport}));

			}
		}

		return result;
	}
} // PackageImportOperations