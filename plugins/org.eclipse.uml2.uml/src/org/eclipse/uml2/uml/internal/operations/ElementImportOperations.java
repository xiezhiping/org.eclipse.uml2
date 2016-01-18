/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element Import</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Element Is Public</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#getName() <em>Get Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImportOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImportOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of an ElementImport is either public or private.
	 * visibility = VisibilityKind::public or visibility = VisibilityKind::private
	 * @param elementImport The receiving '<em><b>Element Import</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibilityPublicOrPrivate(
			ElementImport elementImport, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		VisibilityKind visibility = elementImport.getVisibility();

		if (visibility != VisibilityKind.PUBLIC_LITERAL
			&& visibility != VisibilityKind.PRIVATE_LITERAL) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE,
					UMLPlugin.INSTANCE.getString(
						"_UI_ElementImport_VisibilityPublicOrPrivate_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, elementImport)),
					new Object[]{elementImport}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An importedElement has either public visibility or no visibility at all.
	 * importedElement.visibility <> null implies importedElement.visibility = VisibilityKind::public
	 * @param elementImport The receiving '<em><b>Element Import</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateImportedElementIsPublic(
			ElementImport elementImport, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		PackageableElement importedElement = elementImport.getImportedElement();
		VisibilityKind visibility = importedElement == null
			? null
			: importedElement.getVisibility();

		if (visibility != null && visibility != VisibilityKind.PUBLIC_LITERAL) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC,
					UMLPlugin.INSTANCE.getString(
						"_UI_ElementImport_ImportedElementIsPublic_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, importedElement)),
					new Object[]{elementImport, importedElement}));

			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getName() returns the name under which the imported PackageableElement will be known in the importing namespace.
	 * result = (if alias->notEmpty() then
	 *   alias
	 * else
	 *   importedElement.name
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param elementImport The receiving '<em><b>Element Import</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getName(ElementImport elementImport) {
		String alias = elementImport.getAlias();

		if (isEmpty(alias)) {
			PackageableElement importedElement = elementImport
				.getImportedElement();
			return importedElement == null
				? null
				: importedElement.getName();
		}

		return alias;
	}

} // ElementImportOperations