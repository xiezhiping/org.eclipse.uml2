/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageImportOperations.java,v 1.5 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.util.UML2Validator;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;

/**
 * A static utility class that provides operations related to package imports.
 */
public final class PackageImportOperations
	extends UML2Operations {

	/**
	 * Constructs a new Package Import Operations. This constructor should never
	 * be called because this is a static utility class.
	 */
	private PackageImportOperations() {
		super();
	}

	/**
	 * The visibility of a package import is either public or private.
	 *  
	 */
	public static boolean validatePublicOrPrivate(PackageImport packageImport,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (!VisibilityKind.PUBLIC_LITERAL
			.equals(packageImport.getVisibility())
			&& !VisibilityKind.PRIVATE_LITERAL.equals(packageImport
				.getVisibility())) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.PACKAGE_IMPORT__PUBLIC_OR_PRIVATE,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_PackageImport_PublicOrPrivate_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										packageImport)),
							new Object[] {packageImport}));

			}
		}

		return result;
	}

}