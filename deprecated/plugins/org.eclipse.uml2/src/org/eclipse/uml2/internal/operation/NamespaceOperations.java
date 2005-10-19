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
 * $Id: NamespaceOperations.java,v 1.12 2005/10/19 19:42:10 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.Component;
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
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Namespace</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Namespace#validateMembersAreDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#getNamesOfMember(org.eclipse.uml2.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#validateImportedMemberDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Member Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#importedMember() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#importMembers(java.util.Set) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#excludeCollisions(java.util.Set) <em>Exclude Collisions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class NamespaceOperations extends UML2Operations {

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
	private NamespaceOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * All the members of a namespace are distinguishable within it.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * membersAreDistinguishable()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMembersAreDistinguishable(Namespace namespace, DiagnosticChain diagnostics, Map context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if self.ownedMember->includes(element)
	 * then Set{}->include(element.name)
	 * else let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in
	 *     if elementImports->notEmpty()
	 *     then elementImports->collect(el | el.getName())
	 *     else 
	 *         self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))->collect(pi | pi.importedPackage.getNamesOfMember(element))
	 *     endif
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set getNamesOfMember(Namespace namespace, NamedElement element) {
		return Collections.unmodifiableSet(getNamesOfMemberHelper(namespace,
			element, new HashSet(), new HashSet()));
	}

	protected static Set getNamesOfMemberHelper(Namespace namespace,
			NamedElement element, Set namespaces, Set namesOfMember) {

		if (!namespaces.contains(namespace)) {
			namespaces.add(namespace);

			if (getOwnedMembers(namespace).contains(element)) {
				String name = element.getName();

				if (!isEmpty(name)) {
					namesOfMember.add(name);
				}
			} else {

				for (Iterator elementImports = namespace.getElementImports()
					.iterator(); elementImports.hasNext();) {

					ElementImport elementImport = (ElementImport) elementImports
						.next();

					if (element == elementImport.getImportedElement()) {
						String name = elementImport.getName();

						if (!isEmpty(name)) {
							namesOfMember.add(name);
						}
					}
				}

				if (namesOfMember.isEmpty()) {

					for (Iterator packageImports = namespace
						.getPackageImports().iterator(); packageImports
						.hasNext();) {

						org.eclipse.uml2.Package importedPackage = ((PackageImport) packageImports
							.next()).getImportedPackage();

						if (null != importedPackage
							&& importedPackage.visibleMembers().contains(
								element)) {

							getNamesOfMemberHelper(importedPackage, element,
								namespaces, namesOfMember);
						}
					}
				}
			}
		}

		return namesOfMember;
	}

	protected static EList getOwnedMembers(Namespace namespace) {
		return namespace instanceof org.eclipse.uml2.Package
			? PackageOperations
				.getOwnedMembers((org.eclipse.uml2.Package) namespace)
			: (namespace instanceof Component
				? ComponentOperations.getOwnedMembers((Component) namespace)
				: namespace.getOwnedMembers());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.member->forAll( memb |
	 * 	self.member->excluding(memb)->forAll(other |
	 * 		memb.isDistinguishableFrom(other, self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
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
	 * <!-- begin-user-doc -->
	 * The imported members are derived from the element imports and the package
	 * imports.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.importedMember->includesAll(self.importedMembers(self.elementImport.importedElement.asSet()->union(self.packageImport.importedPackage->collect(p | p.visibleMembers()))))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateImportedMemberDerived(Namespace namespace,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.importedMembers(self.elementImport.importedElement.asSet()->union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
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

		return Collections.unmodifiableSet(importedMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem | mem.imp.isDistinguishableFrom(mem, self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set importMembers(Namespace namespace, Set imps) {
		Set importMembers = new HashSet();

		EList ownedMembers = getOwnedMembers(namespace);
		
		excludeCollisionsLoop : for (Iterator excludeCollisions = namespace
			.excludeCollisions(imps).iterator(); excludeCollisions.hasNext();) {

			PackageableElement excludeCollision = (PackageableElement) excludeCollisions
				.next();

			for (Iterator i = ownedMembers.iterator(); i.hasNext();) {

				if (!excludeCollision.isDistinguishableFrom(
					(PackageableElement) i.next(), namespace)) {

					continue excludeCollisionsLoop;
				}
			}

			importMembers.add(excludeCollision);
		}

		return Collections.unmodifiableSet(importMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
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

		return Collections.unmodifiableSet(excludeCollisions);
	}

	// <!-- begin-custom-operations -->

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

		ElementImport elementImport = namespace.createElementImport();

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

			org.eclipse.uml2.Package importedPackage = ((PackageImport) packageImports
				.next()).getImportedPackage();

			if (null != importedPackage) {
				importedPackages.add(importedPackage);
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

	// <!-- end-custom-operations -->

} // NamespaceOperations