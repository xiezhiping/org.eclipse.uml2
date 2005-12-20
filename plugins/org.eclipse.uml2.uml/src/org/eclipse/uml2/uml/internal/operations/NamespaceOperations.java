/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: NamespaceOperations.java,v 1.8 2005/12/20 16:34:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Namespace</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Get Imported Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#importMembers(java.util.List) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#excludeCollisions(java.util.List) <em>Exclude Collisions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class NamespaceOperations
		extends UMLOperations {

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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the members of a Namespace are distinguishable within it.
	 * membersAreDistinguishable()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMembersDistinguishable(Namespace namespace,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMembersDistinguishable", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namespace, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{namespace}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ElementImport createElementImport(Namespace namespace,
			PackageableElement element, VisibilityKind visibility) {

		if (element == null
			|| namespace.getImportedElements().contains(element)) {

			throw new IllegalArgumentException(String.valueOf(element));
		}

		if (visibility == null) {
			throw new IllegalArgumentException(String.valueOf(visibility));
		}

		ElementImport elementImport = namespace.createElementImport();

		elementImport.setImportedElement(element);
		elementImport.setVisibility(visibility);

		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static PackageImport createPackageImport(Namespace namespace,
			org.eclipse.uml2.uml.Package package_, VisibilityKind visibility) {

		if (package_ == null
			|| namespace.getImportedPackages().contains(package_)) {

			throw new IllegalArgumentException(String.valueOf(package_));
		}

		if (visibility == null) {
			throw new IllegalArgumentException(String.valueOf(visibility));
		}

		PackageImport packageImport = namespace.createPackageImport();

		packageImport.setImportedPackage(package_);
		packageImport.setVisibility(visibility);

		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getImportedElements(Namespace namespace) {
		EList importedElements = new UniqueEList();

		for (Iterator elementImports = namespace.getElementImports().iterator(); elementImports
			.hasNext();) {

			PackageableElement importedElement = ((ElementImport) elementImports
				.next()).getImportedElement();

			if (importedElement != null) {
				importedElements.add(importedElement);
			}
		}

		return ECollections.unmodifiableEList(importedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getImportedPackages(Namespace namespace) {
		EList importedPackages = new UniqueEList();

		for (Iterator packageImports = namespace.getPackageImports().iterator(); packageImports
			.hasNext();) {

			org.eclipse.uml2.uml.Package importedPackage = ((PackageImport) packageImports
				.next()).getImportedPackage();

			if (importedPackage != null) {
				importedPackages.add(importedPackage);
			}
		}

		return ECollections.unmodifiableEList(importedPackages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The importedMember property is derived from the ElementImports and the PackageImports. References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * The importedMember property is derived from the ElementImports and the PackageImports.
	 * result = self.importMembers(self.elementImport.importedElement.asSet()-
	 * >union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList getImportedMembers(Namespace namespace) {
		EList importedMembers = new UniqueEList();

		for (Iterator elementImports = namespace.getElementImports().iterator(); elementImports
			.hasNext();) {

			PackageableElement importedElement = ((ElementImport) elementImports
				.next()).getImportedElement();

			if (importedElement != null) {
				importedMembers.add(importedElement);
			}
		}

		for (Iterator packageImports = namespace.getPackageImports().iterator(); packageImports
			.hasNext();) {

			org.eclipse.uml2.uml.Package importedPackage = ((PackageImport) packageImports
				.next()).getImportedPackage();

			if (importedPackage != null) {
				importedMembers.addAll(importedPackage.visibleMembers());
			}
		}

		return new UnionEObjectEList((InternalEObject) namespace,
			UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER, importedMembers
				.size(), importedMembers.toArray());
	}

	protected static EList getNamesOfMember(Namespace namespace,
			NamedElement element, EList namespaces, EList namesOfMember) {

		if (!namespaces.contains(namespace)) {
			namespaces.add(namespace);

			if (namespace.getOwnedMembers().contains(element)) {
				String name = element.getName();

				if (!isEmpty(name)) {
					namesOfMember.add(name);
				}
			} else {
				EList elementImportNames = new UniqueEList();

				for (Iterator elementImports = namespace.getElementImports()
					.iterator(); elementImports.hasNext();) {

					ElementImport elementImport = (ElementImport) elementImports
						.next();

					if (elementImport.getImportedElement() == element) {
						String name = elementImport.getName();

						if (!isEmpty(name)) {
							elementImportNames.add(name);
						}
					}
				}

				if (elementImportNames.isEmpty()) {

					for (Iterator packageImports = namespace
						.getPackageImports().iterator(); packageImports
						.hasNext();) {

						org.eclipse.uml2.uml.Package importedPackage = ((PackageImport) packageImports
							.next()).getImportedPackage();

						if (importedPackage != null
							&& importedPackage.visibleMembers().contains(
								element)) {

							getNamesOfMember(importedPackage, element,
								namespaces, namesOfMember);
						}
					}
				}
			}
		}

		return namesOfMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getNamesOfMember() is overridden to take account of importing. It gives back the set of names that an element would have in an importing namespace, either because it is owned, or if not owned then imported individually, or if not individually then from a package.
	 * The query getNamesOfMember() gives a set of all of the names that a member would have in a Namespace. In general a member can have multiple names in a Namespace if it is imported more than once with different aliases. The query takes account of importing. It gives back the set of names that an element would have in an importing namespace, either because it is owned, or if not owned then imported individually, or if not individually then from a package.
	 * result = if self.ownedMember ->includes(element)
	 * then Set{}->include(element.name)
	 * else let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in
	 *   if elementImports->notEmpty()
	 *   then elementImports->collect(el | el.getName())
	 *   else self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))
	 *   endif
	 * endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList getNamesOfMember(Namespace namespace,
			NamedElement element) {
		return ECollections.unmodifiableEList(getNamesOfMember(namespace,
			element, new UniqueEList(), new UniqueEList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespace's members are distinguishable within it.
	 * result = self.member->forAll( memb |
	 * self.member->excluding(memb)->forAll(other |
	 * memb.isDistinguishableFrom(other, self)))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean membersAreDistinguishable(Namespace namespace) {
		EList namespaceMembers = namespace.getMembers();

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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query importMembers() defines which of a set of PackageableElements are actually imported into the namespace. This excludes hidden ones, i.e., those which have names that conflict with names of owned members, and also excludes elements which would have the same name when imported.
	 * result = self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem |
	 * mem.imp.isDistinguishableFrom(mem, self)))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList importMembers(Namespace namespace, EList imps) {
		EList importMembers = new UniqueEList();

		EList ownedMembers = namespace.getOwnedMembers();

		excludeCollisionsLoop : for (Iterator excludeCollisions = namespace
			.excludeCollisions(imps).iterator(); excludeCollisions.hasNext();) {

			PackageableElement excludeCollision = (PackageableElement) excludeCollisions
				.next();

			for (Iterator om = ownedMembers.iterator(); om.hasNext();) {

				if (!excludeCollision.isDistinguishableFrom(
					(PackageableElement) om.next(), namespace)) {

					continue excludeCollisionsLoop;
				}
			}

			importMembers.add(excludeCollision);
		}

		return ECollections.unmodifiableEList(importMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query excludeCollisions() excludes from a set of PackageableElements any that would not be distinguishable from each other in this namespace.
	 * result = imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList excludeCollisions(Namespace namespace, EList imps) {
		EList excludeCollisions = new UniqueEList();

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

		return ECollections.unmodifiableEList(excludeCollisions);
	}

} // NamespaceOperations