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
 * $Id: ElementImportOperations.java,v 1.9 2005/06/15 17:18:21 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element Import</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Element Is Public</em>}</li>
 *   <li>{@link org.eclipse.uml2.ElementImport#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ElementImportOperations extends UML2Operations {

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
	private ElementImportOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * The visibility of an element import is either public or private.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.visibility = #public or self.visibility = #private
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibilityPublicOrPrivate(ElementImport elementImport, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		VisibilityKind visibility = elementImport.getVisibility();
		if (!VisibilityKind.PUBLIC_LITERAL.equals(visibility)
			&& !VisibilityKind.PRIVATE_LITERAL.equals(visibility)) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_ElementImport_VisibilityPublicOrPrivate_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										elementImport)),
							new Object[] {elementImport}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * An imported element has either public visibility or no visibility at all.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.importedElement.visibility.notEmpty() implies self.importedElement.visibility = #public
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateImportedElementIsPublic(ElementImport elementImport, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		PackageableElement importedElement = elementImport.getImportedElement();
		VisibilityKind visibility = null == importedElement
			? null
			: importedElement.getVisibility();

		if (null != visibility
			&& !VisibilityKind.PUBLIC_LITERAL.equals(visibility)) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_ElementImport_ImportedElementIsPublic_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										importedElement)),
							new Object[] {elementImport, importedElement}));

			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if self.alias->notEmpty() then 
	 *     self.alias
	 * else
	 *     self.importedElement.name
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getName(ElementImport elementImport) {
		String alias = elementImport.getAlias();

		if (isEmpty(alias)) {
			PackageableElement importedElement = elementImport
				.getImportedElement();
			return null == importedElement
				? EMPTY_STRING
				: importedElement.getName();
		}

		return alias;
	}

} // ElementImportOperations