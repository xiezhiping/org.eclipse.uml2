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
 * $Id: NamespaceOperations.java,v 1.8 2004/11/04 16:58:49 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.util.UML2Validator;

/**
 * A static utility class that provides operations related to namespaces.
 */
public final class NamespaceOperations
	extends UML2Operations {

	/**
	 * Constructs a new Namespace Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private NamespaceOperations() {
		super();
	}

	public static Set excludeCollisions(Namespace namespace, Set imps) {
		Set excludeCollisions = new HashSet();

		imps1Loop : for (Iterator imps1 = imps.iterator(); imps1.hasNext();) {
			PackageableElement imp1 = (PackageableElement) imps1.next();

			for (Iterator imps2 = imps.iterator(); imps2.hasNext();) {
				PackageableElement imp2 = (PackageableElement) imps2.next();

				if (imp1 != imp2
					&& !imp1.isDistinguishableFrom(imp2, namespace)) {
					continue imps1Loop;
				}
			}

			excludeCollisions.add(imp1);
		}

		return excludeCollisions;
	}

	public static Set getNamesOfMember(Namespace namespace, NamedElement element) {
		Set namesOfMember = new HashSet();

		if (namespace.getOwnedMembers().contains(element)) {

			if (!isEmpty(element.getName())) {
				namesOfMember.add(element.getName());
			}
		} else {

			for (Iterator elementImports = namespace.getElementImports()
				.iterator(); elementImports.hasNext();) {

				ElementImport elementImport = (ElementImport) elementImports
					.next();

				if (element.equals(elementImport.getImportedElement())
					&& !isEmpty(elementImport.getName())) {

					namesOfMember.add(elementImport.getName());
				}
			}

			if (namesOfMember.isEmpty()) {

				for (Iterator packageImports = namespace.getPackageImports()
					.iterator(); packageImports.hasNext();) {

					PackageImport packageImport = (PackageImport) packageImports
						.next();

					if (null != packageImport.getImportedPackage()
						&& packageImport.getImportedPackage().visibleMembers()
							.contains(element)) {

						namesOfMember.addAll(packageImport.getImportedPackage()
							.getNamesOfMember(element));
					}
				}
			}
		}

		return namesOfMember;
	}

	public static Set importedMember(Namespace namespace) {
		Set importedMember = new HashSet();

		for (Iterator elementImports = namespace.getElementImports().iterator(); elementImports
			.hasNext();) {

			PackageableElement importedElement = ((ElementImport) elementImports
				.next()).getImportedElement();

			if (null != importedElement) {
				importedMember.add(importedElement);
			}
		}

		for (Iterator packageImports = namespace.getPackageImports().iterator(); packageImports
			.hasNext();) {

			org.eclipse.uml2.Package importedPackage = ((PackageImport) packageImports
				.next()).getImportedPackage();

			if (null != importedPackage) {
				importedMember.addAll(importedPackage.visibleMembers());
			}
		}

		return importedMember;
	}

	public static Set importMembers(Namespace namespace, Set imps) {
		Set importMembers = new HashSet();

		excludeCollisionsLoop : for (Iterator excludeCollisions = namespace
			.excludeCollisions(imps).iterator(); excludeCollisions.hasNext();) {

			PackageableElement excludeCollision = (PackageableElement) excludeCollisions
				.next();

			for (Iterator ownedMembers = namespace.getOwnedMembers().iterator(); ownedMembers
				.hasNext();) {

				PackageableElement ownedMember = (PackageableElement) ownedMembers
					.next();

				if (!excludeCollision.isDistinguishableFrom(ownedMember,
					namespace)) {

					continue excludeCollisionsLoop;
				}
			}

			importMembers.add(excludeCollision);
		}

		return importMembers;
	}

	public static boolean membersAreDistinguishable(Namespace namespace) {
		List namespaceMembers = namespace.getMembers();

		for (Iterator members = namespaceMembers.iterator(); members.hasNext();) {
			NamedElement member = (NamedElement) members.next();

			for (Iterator otherMembers = namespaceMembers.iterator(); otherMembers
				.hasNext();) {

				NamedElement otherMember = (NamedElement) otherMembers.next();

				if (member != otherMember
					&& !member.isDistinguishableFrom(otherMember, namespace)) {

					return false;
				}
			}
		}

		return true;
	}

	/**
	 * Imports the specified element into the specified namespace with the
	 * specified visibility.
	 * 
	 * @param namespace
	 *            The namespace into which to import the element.
	 * @param visibility
	 *            The visbility with which to import the element.
	 * @param element
	 *            The element to import.
	 * @exception IllegalArgumentException
	 *                If the namespace, visibility, or element is null or if the
	 *                namespace already imports the element.
	 */
	public static void importElement(Namespace namespace,
			VisibilityKind visibility, PackageableElement element) {

		if (null == namespace) {
			throw new IllegalArgumentException(String.valueOf(namespace));
		}

		if (null == visibility) {
			throw new IllegalArgumentException(String.valueOf(visibility));
		}

		if (null == element || importedMember(namespace).contains(element)) {
			throw new IllegalArgumentException(String.valueOf(element));
		}

		ElementImport elementImport = namespace
			.createElementImport(UML2Package.eINSTANCE.getElementImport());

		elementImport.setVisibility(visibility);
		elementImport.setImportedElement(element);
	}

	/**
	 * Retrieves the set of packages imported by the specified namespace.
	 * 
	 * @param namespace
	 *            The namespace for which to retrieve imported packages.
	 * @return The packages imported by the namespace.
	 */
	public static Set getImportedPackages(Namespace namespace) {
		Set importedPackages = new HashSet();

		if (null == namespace) {
			return importedPackages;
		}

		for (Iterator packageImports = namespace.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (null != packageImport.getImportedPackage()) {
				importedPackages.add(packageImport.getImportedPackage());
			}
		}

		return importedPackages;
	}

	/**
	 * Imports the specified package into the specified namespace with the
	 * specified visibility.
	 * 
	 * @param namespace
	 *            The namespace into which to import the package.
	 * @param visibility
	 *            The visbility with which to import the package.
	 * @param package_
	 *            The package to import.
	 * @exception IllegalArgumentException
	 *                If the namespace already imports the package.
	 */
	public static void importPackage(Namespace namespace,
			VisibilityKind visibility, org.eclipse.uml2.Package package_) {

		if (null == namespace) {
			throw new IllegalArgumentException(String.valueOf(namespace));
		}

		if (null == visibility) {
			throw new IllegalArgumentException(String.valueOf(visibility));
		}

		if (null == package_
			|| namespace.getImportedPackages().contains(package_)) {

			throw new IllegalArgumentException(String.valueOf(package_));
		}

		PackageImport packageImport = namespace
			.createPackageImport(UML2Package.eINSTANCE.getPackageImport());

		packageImport.setVisibility(visibility);
		packageImport.setImportedPackage(package_);
	}

	/**
	 * All the members of a namespace are distinguishable within it.
	 *  
	 */
	public static boolean validateMembersAreDistinguishable(
			Namespace namespace, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (!namespace.membersAreDistinguishable()) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.NAMESPACE__MEMBERS_ARE_DISTINGUISHABLE,
					UML2Plugin.INSTANCE.getString(
						"_UI_Namespace_MembersAreDistinguishable_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namespace)),
					new Object[]{namespace}));
			}
		}

		return result;
	}

	/**
	 * The imported members are derived from the element imports and the package
	 * imports.
	 *  
	 */
	public static boolean validateImportedMemberDerived(Namespace namespace,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		Set importedMember = new HashSet();

		for (Iterator elementImports = namespace.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (null != elementImport.getImportedElement()) {
				importedMember.add(elementImport.getImportedElement());
			}
		}

		for (Iterator packageImports = namespace.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (null != packageImport.getImportedPackage()) {
				importedMember.addAll(packageImport.getImportedPackage()
					.visibleMembers());
			}
		}

		if (!namespace.getImportedMembers().containsAll(
			namespace.importMembers(importedMember))) {

			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.NAMESPACE__IMPORTED_MEMBER_DERIVED,
					UML2Plugin.INSTANCE.getString(
						"_UI_Namespace_ImportedMemberDerived_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namespace)),
					new Object[]{namespace}));
			}
		}

		return result;
	}

}