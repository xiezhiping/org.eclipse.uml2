/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: PackageImportOperations.java,v 1.2 2004/04/27 16:38:54 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.UML2DiagnosticConstants;
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
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.PACKAGE_IMPORT__PUBLIC_OR_PRIVATE,
							UML2Plugin.INSTANCE
								.getString("_UI_PackageImport_PublicOrPrivate_message"), //$NON-NLS-1$
							null));

			}
		}

		return result;
	}

}