/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ElementImportOperations.java,v 1.3 2004/04/27 13:56:09 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2DiagnosticConstants;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;

/**
 * A static utility class that provides operations related to element imports.
 */
public final class ElementImportOperations
	extends UML2Operations {

	/**
	 * Constructs a new Element Import Operations. This constructor should never
	 * be called because this is a static utility class.
	 */
	private ElementImportOperations() {
		super();
	}

	public static String getName(ElementImport elementImport) {
		return isEmpty(elementImport.getAlias())
			? (null == elementImport.getImportedElement()
				? EMPTY_STRING : elementImport.getImportedElement().getName())
			: elementImport.getAlias();
	}

	public static boolean validateVisibilityPublicOrPrivate(
			ElementImport elementImport, DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		if (!VisibilityKind.PUBLIC_LITERAL
			.equals(elementImport.getVisibility())
			&& !VisibilityKind.PRIVATE_LITERAL.equals(elementImport
				.getVisibility())) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE,
							UML2Plugin.INSTANCE
								.getString("_UI_ElementImport_VisibilityPublicOrPrivate_message"), //$NON-NLS-1$
							null));

			}
		}

		return result;
	}

	public static boolean validateImportedElementIsPublic(
			ElementImport elementImport, DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		PackageableElement importedElement = elementImport.getImportedElement();

		if (null != importedElement
			&& null != importedElement.getVisibility()
			&& !VisibilityKind.PUBLIC_LITERAL.equals(importedElement
				.getVisibility())) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC,
							UML2Plugin.INSTANCE
								.getString("_UI_ElementImport_ImportedElementIsPublic_message"), //$NON-NLS-1$
							new Object[] {importedElement}));

			}
		}

		return result;
	}

}