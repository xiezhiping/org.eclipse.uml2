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
 * $Id: PackageOperations.java,v 1.3 2004/04/27 13:56:09 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2DiagnosticConstants;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;

/**
 * A static utility class that provides operations related to packages.
 */
public final class PackageOperations
	extends UML2Operations {

	/**
	 * Constructs a new Package Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private PackageOperations() {
		super();
	}

	public static boolean makesVisible(org.eclipse.uml2.Package package_,
			NamedElement el) {

		if (package_.getOwnedMembers().contains(el)) {
			return null == el.getVisibility()
				|| VisibilityKind.PUBLIC_LITERAL.equals(el.getVisibility());
		}

		for (Iterator elementImports = package_.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (safeEquals(elementImport.getImportedElement(), el)) {
				return null == elementImport.getVisibility()
					|| VisibilityKind.PUBLIC_LITERAL.equals(elementImport
						.getVisibility());
			}
		}

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (null == packageImport.getVisibility()
				|| VisibilityKind.PUBLIC_LITERAL.equals(packageImport
					.getVisibility())) {

				return null != packageImport.getImportedPackage()
					&& packageImport.getImportedPackage().visibleMembers()
						.contains(el);
			}
		}

		return false;
	}

	public static boolean mustBeOwned(org.eclipse.uml2.Package package_) {
		return false;
	}

	public static Set visibleMembers(org.eclipse.uml2.Package package_) {
		Set visibleMembers = new HashSet();

		for (Iterator ownedMembers = package_.getOwnedMembers().iterator(); ownedMembers
			.hasNext();) {

			PackageableElement ownedMember = (PackageableElement) ownedMembers
				.next();

			if (null == ownedMember.getVisibility()
				|| VisibilityKind.PUBLIC_LITERAL.equals(ownedMember
					.getVisibility())) {

				visibleMembers.add(ownedMember);
			}
		}

		for (Iterator elementImports = package_.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (null == elementImport.getVisibility()
				|| VisibilityKind.PUBLIC_LITERAL.equals(elementImport
					.getVisibility())) {

				visibleMembers.add(elementImport.getImportedElement());
			}
		}

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (null == packageImport.getVisibility()
				|| VisibilityKind.PUBLIC_LITERAL.equals(packageImport
					.getVisibility())) {

				visibleMembers.addAll(packageImport.getImportedPackage()
					.visibleMembers());
			}
		}

		return visibleMembers;
	}

	public static boolean validateElementsPublicOrPrivate(
			org.eclipse.uml2.Package package_, DiagnosticChain diagnostics,
			Map data) {
		boolean result = true;

		for (Iterator ownedElements = package_.getOwnedElements().iterator(); ownedElements
			.hasNext();) {
			
			Element ownedElement = (Element) ownedElements.next();

			if (NamedElement.class.isInstance(ownedElement)) {
				VisibilityKind visibility = (VisibilityKind) ((NamedElement) ownedElement)
					.getVisibility();

				if (null != visibility
					&& !VisibilityKind.PUBLIC_LITERAL.equals(visibility)
					&& !VisibilityKind.PRIVATE_LITERAL.equals(visibility)) {

					result = false;

					if (null == diagnostics) {
						return result;
					} else {
						diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UML2DiagnosticConstants.PLUGIN_ID,
									UML2DiagnosticConstants.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
									UML2Plugin.INSTANCE
										.getString("_UI_Package_ElementsPublicOrPrivate_message"), //$NON-NLS-1$
									new Object[] {ownedElement}));
					}
				}
			}
		}

		return result;
	}

}