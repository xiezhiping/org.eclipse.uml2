/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementImportOperations.java,v 1.5 2006/01/05 22:43:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageableElement;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element Import</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#validateVisibilityOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Element Is Public</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
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
	 * self.visibility = #public or self.visibility = #private
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibilityPublicOrPrivate(
			ElementImport elementImport, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateVisibilityPublicOrPrivate", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(elementImport, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{elementImport}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of an ElementImport is either public or private.
	 * self.visibility = #public or self.visibility = #private
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibilityOrPrivate(
			ElementImport elementImport, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.ELEMENT_IMPORT__VISIBILITY_OR_PRIVATE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateVisibilityOrPrivate", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(elementImport, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{elementImport}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An importedElement has either public visibility or no visibility at all.
	 * self.importedElement.visibility.notEmpty() implies self.importedElement.visibility = #public
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImportedElementIsPublic(
			ElementImport elementImport, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateImportedElementIsPublic", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(elementImport, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{elementImport}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getName() returns the name under which the imported PackageableElement will be known in the importing namespace.
	 * result = if self.alias->notEmpty() then
	 *   self.alias
	 * else
	 *   self.importedElement.name
	 * endif
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