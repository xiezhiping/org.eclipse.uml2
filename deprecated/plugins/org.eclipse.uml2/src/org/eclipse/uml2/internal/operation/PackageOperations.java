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
 * $Id: PackageOperations.java,v 1.9 2005/04/14 17:30:57 khussey Exp $
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
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.util.UML2Validator;

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

				org.eclipse.uml2.Package importedPackage = packageImport
					.getImportedPackage();

				return null != importedPackage
					&& importedPackage.visibleMembers().contains(el);
			}
		}

		return false;
	}

	public static boolean mustBeOwned(org.eclipse.uml2.Package package_) {
		return false;
	}

	public static Set visibleMembers(org.eclipse.uml2.Package package_) {
		Set visibleMembers = new HashSet();

		visibleMembersHelper(package_, visibleMembers);

		for (Iterator allImportedPackages = allImportedPackagesHelper(package_,
			new HashSet()).iterator(); allImportedPackages.hasNext();) {

			visibleMembersHelper((org.eclipse.uml2.Package) allImportedPackages
				.next(), visibleMembers);
		}

		return visibleMembers;
	}

	protected static Set visibleMembersHelper(
			org.eclipse.uml2.Package package_, Set visibleMembers) {

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

				PackageableElement importedElement = elementImport
					.getImportedElement();

				if (null != importedElement) {
					visibleMembers.add(importedElement);
				}
			}
		}

		return visibleMembers;
	}

	protected static Set allImportedPackagesHelper(
			org.eclipse.uml2.Package package_, Set allImportedPackages) {

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (null == packageImport.getVisibility()
				|| VisibilityKind.PUBLIC_LITERAL.equals(packageImport
					.getVisibility())) {

				org.eclipse.uml2.Package importedPackage = packageImport
					.getImportedPackage();

				if (null != importedPackage
					&& !allImportedPackages.contains(importedPackage)) {

					allImportedPackages.add(importedPackage);

					allImportedPackagesHelper(importedPackage,
						allImportedPackages);
				}
			}
		}

		return allImportedPackages;
	}

	/**
	 * If an element that is owned by a package has visibility, it is public or
	 * private.
	 * 
	 */
	public static boolean validateElementsPublicOrPrivate(
			org.eclipse.uml2.Package package_, DiagnosticChain diagnostics,
			Map context) {
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
								UML2Validator.DIAGNOSTIC_SOURCE,
								UML2Validator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
								UML2Plugin.INSTANCE
									.getString(
										"_UI_Package_ElementsPublicOrPrivate_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											ownedElement, package_)),
								new Object[]{package_, ownedElement}));
					}
				}
			}
		}

		return result;
	}

	/**
	 * Creates a package with the specified name as a nested package of the
	 * specified package.
	 * 
	 * @param package_
	 *            The package in which to create the nested package.
	 * @param name
	 *            The name for the nested package.
	 * @return The new package.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static org.eclipse.uml2.Package createNestedPackage(
			org.eclipse.uml2.Package package_, String name) {

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		org.eclipse.uml2.Package nestedPackage = (org.eclipse.uml2.Package) package_
			.createOwnedMember(UML2Package.eINSTANCE.getPackage());
		nestedPackage.setName(name);
		return nestedPackage;
	}

	/**
	 * Creates a(n) (abstract) class with the specified name as an owned member
	 * of the specified package.
	 * 
	 * @param package_
	 *            The package in which to create the owned class.
	 * @param name
	 *            The name for the owned class.
	 * @param isAbstract
	 *            Whether the owned class should be abstract.
	 * @return The new class.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static org.eclipse.uml2.Class createOwnedClass(
			org.eclipse.uml2.Package package_, String name, boolean isAbstract) {

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		org.eclipse.uml2.Class ownedClass = (org.eclipse.uml2.Class) package_
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		ownedClass.setName(name);
		ownedClass.setIsAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * Creates an enumeration with the specified name as an owned member of the
	 * specified package.
	 * 
	 * @param package_
	 *            The package in which to create the owned enumeration.
	 * @param name
	 *            The name for the owned enumeration.
	 * @return The new enumeration.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static Enumeration createOwnedEnumeration(
			org.eclipse.uml2.Package package_, String name) {

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		Enumeration ownedEnumeration = (Enumeration) package_
			.createOwnedMember(UML2Package.eINSTANCE.getEnumeration());
		ownedEnumeration.setName(name);
		return ownedEnumeration;
	}

	/**
	 * Creates a primitive type with the specified name as an owned member of
	 * the specified package.
	 * 
	 * @param package_
	 *            The package in which to create the owned primitive type.
	 * @param name
	 *            The name for the owned primitive type.
	 * @return The new primitive type.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static PrimitiveType createOwnedPrimitiveType(
			org.eclipse.uml2.Package package_, String name) {

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		PrimitiveType ownedPrimitiveType = (PrimitiveType) package_
			.createOwnedMember(UML2Package.eINSTANCE.getPrimitiveType());
		ownedPrimitiveType.setName(name);
		return ownedPrimitiveType;
	}

}