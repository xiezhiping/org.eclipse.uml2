/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 459651, 433768, 485756, 464427
 *   Patrick Konemann (itemis) - 501890
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Namespace</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateCannotImportSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Import Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateCannotImportOwnedMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Import Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createElementImport(org.eclipse.uml2.uml.PackageableElement, org.eclipse.uml2.uml.VisibilityKind) <em>Create Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind) <em>Create Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedElements() <em>Get Imported Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedPackages() <em>Get Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Get Imported Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the members of a Namespace are distinguishable within it.
	 * membersAreDistinguishable()
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMembersDistinguishable(Namespace namespace,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (diagnostics != null) {

			// get all name conflicts first in O(n log(n))
			final Set<String> nameClashes = new HashSet<String>();
			final Map<String, List<NamedElement>> elementsByName = new HashMap<String, List<NamedElement>>();

			for (NamedElement member : namespace.getMembers()) {

				for (String name : namespace.getNamesOfMember(member)) {
					List<NamedElement> elements = elementsByName.get(name);

					if (elements == null) {
						elements = new ArrayList<NamedElement>();
						elementsByName.put(name, elements);
					} else {
						nameClashes.add(name); // name was already added!
					}

					elements.add(member);
				}
			}

			// now we can also check for type compatibility
			for (String name : nameClashes) {
				final List<NamedElement> elements = elementsByName.get(name);

				for (NamedElement member : elements) {

					for (NamedElement otherMember : elements) {

						if (member != otherMember && !member
							.isDistinguishableFrom(otherMember, namespace)) {

							result = false;

							diagnostics.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
								UMLPlugin.INSTANCE.getString(
									"_UI_Namespace_MemberDistinguishable_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, member,
										namespace)),
								new Object[]{member}));

							break;
						}
					}
				}
			}

			if (!result) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
					UMLPlugin.INSTANCE.getString(
						"_UI_Namespace_MembersDistinguishable_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namespace)),
					new Object[]{namespace}));
			}
		} else {
			result = namespace.membersAreDistinguishable();
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Namespace cannot have a PackageImport to itself.
	 * packageImport.importedPackage.oclAsType(Namespace)->excludes(self)
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCannotImportSelf(Namespace namespace,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMESPACE__CANNOT_IMPORT_SELF,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateCannotImportSelf", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(namespace, context)}),
					new Object[]{namespace}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Namespace cannot have an ElementImport to one of its ownedMembers.
	 * elementImport.importedElement.oclAsType(Element)->excludesAll(ownedMember)
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCannotImportOwnedMembers(Namespace namespace,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMESPACE__CANNOT_IMPORT_OWNED_MEMBERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateCannotImportOwnedMembers", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(namespace, context)}),
					new Object[]{namespace}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an import of the specified element into this namespace with the specified visibility.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param element The element to import.
	 * @param visibility The visibility for the new element import.
	 * <!-- end-model-doc -->
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

		ElementImport elementImport = namespace.createElementImport(element);
		elementImport.setVisibility(visibility);

		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an import of the specified package into this namespace with the specified visibility.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param package_ The package to import.
	 * @param visibility The visibility for the new package import.
	 * <!-- end-model-doc -->
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

		PackageImport packageImport = namespace.createPackageImport(package_);
		packageImport.setVisibility(visibility);

		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the elements imported by this namespace.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> getImportedElements(
			Namespace namespace) {
		EList<PackageableElement> importedElements = new UniqueEList.FastCompare<PackageableElement>();

		for (ElementImport elementImport : namespace.getElementImports()) {
			PackageableElement importedElement = elementImport
				.getImportedElement();

			if (importedElement != null) {
				importedElements.add(importedElement);
			}
		}

		return ECollections.unmodifiableEList(importedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the packages imported by this namespace.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Package> getImportedPackages(
			Namespace namespace) {
		EList<org.eclipse.uml2.uml.Package> importedPackages = new UniqueEList.FastCompare<org.eclipse.uml2.uml.Package>();

		for (PackageImport packageImport : namespace.getPackageImports()) {
			org.eclipse.uml2.uml.Package importedPackage = packageImport
				.getImportedPackage();

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
	 * The importedMember property is derived as the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * result = (self.importMembers(elementImport.importedElement->asSet()->union(packageImport.importedPackage->collect(p | p.visibleMembers()))->asSet()))
	 * <p>From package UML::CommonStructure.</p>
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> getImportedMembers(
			Namespace namespace) {
		EList<PackageableElement> importedMembers = new UniqueEList.FastCompare<PackageableElement>();

		for (ElementImport elementImport : namespace.getElementImports()) {
			PackageableElement importedElement = elementImport
				.getImportedElement();

			if (importedElement != null) {
				importedMembers.add(importedElement);
			}
		}

		for (PackageImport packageImport : namespace.getPackageImports()) {
			org.eclipse.uml2.uml.Package importedPackage = packageImport
				.getImportedPackage();

			if (importedPackage != null) {
				importedMembers.addAll(importedPackage.visibleMembers());
			}
		}

		importedMembers = importMembers(namespace, importedMembers);

		return new UnionEObjectEList<PackageableElement>(
			(InternalEObject) namespace,
			UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER,
			importedMembers.size(), importedMembers.toArray());
	}

	protected static EList<String> getNamesOfMember(Namespace namespace,
			NamedElement element, EList<Namespace> namespaces,
			EList<String> namesOfMember) {

		if (!namespaces.contains(namespace)) {
			namespaces.add(namespace);

			if (namespace.getOwnedMembers().contains(element)) {
				String name = element.getName();

				if (!isEmpty(name)) {
					namesOfMember.add(name);
				}
			} else {
				EList<String> elementImportNames = new UniqueEList<String>();

				for (ElementImport elementImport : namespace
					.getElementImports()) {

					if (elementImport.getImportedElement() == element) {
						String name = elementImport.getName();

						if (!isEmpty(name)) {
							elementImportNames.add(name);
						}
					}
				}

				if (elementImportNames.isEmpty()) {

					for (PackageImport packageImport : namespace
						.getPackageImports()) {

						org.eclipse.uml2.uml.Package importedPackage = packageImport
							.getImportedPackage();

						if (importedPackage != null && importedPackage
							.visibleMembers().contains(element)) {

							getNamesOfMember(importedPackage, element,
								namespaces, namesOfMember);
						}
					}
				} else {
					namesOfMember.addAll(elementImportNames);
				}
			}
		}

		return namesOfMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getNamesOfMember() gives a set of all of the names that a member would have in a Namespace, taking importing into account. In general a member can have multiple names in a Namespace if it is imported more than once with different aliases.
	 * result = (if self.ownedMember ->includes(element)
	 * then Set{element.name}
	 * else let elementImports : Set(ElementImport) = self.elementImport->select(ei | ei.importedElement = element) in
	 *   if elementImports->notEmpty()
	 *   then
	 *      elementImports->collect(el | el.getName())->asSet()
	 *   else 
	 *      self.packageImport->select(pi | pi.importedPackage.visibleMembers().oclAsType(NamedElement)->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))->asSet()
	 *   endif
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<String> getNamesOfMember(Namespace namespace,
			NamedElement element) {
		return ECollections.unmodifiableEList(getNamesOfMember(namespace,
			element, new UniqueEList.FastCompare<Namespace>(),
			new UniqueEList<String>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the Namespace's members are distinguishable within it.
	 * result = (member->forAll( memb |
	 *    member->excluding(memb)->forAll(other |
	 *        memb.isDistinguishableFrom(other, self))))
	 * <p>From package UML::CommonStructure.</p>
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean membersAreDistinguishable(Namespace namespace) {
		EList<NamedElement> namespaceMembers = namespace.getMembers();

		for (NamedElement member : namespaceMembers) {

			for (NamedElement otherMember : namespaceMembers) {

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
	 * @generated NOT
	 */
	public static EList<NamedElement> getOwnedMembers(Namespace namespace) {
		return namespace.getOwnedMembers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query importMembers() defines which of a set of PackageableElements are actually imported into the Namespace. This excludes hidden ones, i.e., those which have names that conflict with names of ownedMembers, and it also excludes PackageableElements that would have the indistinguishable names when imported.
	 * result = (self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem | imp.isDistinguishableFrom(mem, self))))
	 * <p>From package UML::CommonStructure.</p>
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> importMembers(Namespace namespace,
			EList<PackageableElement> imps) {
		EList<PackageableElement> importMembers = new UniqueEList.FastCompare<PackageableElement>();
		EList<NamedElement> ownedMembers = namespace.getOwnedMembers();

		Map<String, EList<NamedElement>> memberNames = new HashMap<String, EList<NamedElement>>();

		for (NamedElement ownedMember : ownedMembers) {

			for (String name : namespace.getNamesOfMember(ownedMember)) {
				EList<NamedElement> members = memberNames.get(name);

				if (members == null) {
					memberNames.put(name,
						members = new UniqueEList.FastCompare<NamedElement>());
				}

				members.add(ownedMember);
			}
		}

		for (PackageableElement imp : imps) {

			for (String name : namespace.getNamesOfMember(imp)) {
				EList<NamedElement> members = memberNames.get(name);

				if (members == null) {
					memberNames.put(name,
						members = new UniqueEList.FastCompare<NamedElement>());
				}

				members.add(imp);
			}
		}

		impsLoop : for (PackageableElement imp : imps) {
			EClass impEClass = imp.eClass();

			for (String name : namespace.getNamesOfMember(imp)) {
				EList<NamedElement> members = memberNames.get(name);

				if (members.size() > 1) {

					for (NamedElement member : members) {

						if (member != imp) {
							EClass memberEClass = member.eClass();

							if (memberEClass.isSuperTypeOf(impEClass)
								|| impEClass.isSuperTypeOf(memberEClass)) {

								continue impsLoop;
							}
						}
					}
				}
			}

			importMembers.add(imp);
		}

		return ECollections.unmodifiableEList(importMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query excludeCollisions() excludes from a set of PackageableElements any that would not be distinguishable from each other in this Namespace.
	 * result = (imps->reject(imp1  | imps->exists(imp2 | not imp1.isDistinguishableFrom(imp2, self))))
	 * <p>From package UML::CommonStructure.</p>
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> excludeCollisions(
			Namespace namespace, EList<PackageableElement> imps) {
		EList<PackageableElement> excludeCollisions = new UniqueEList.FastCompare<PackageableElement>();

		Map<String, EList<NamedElement>> memberNames = new HashMap<String, EList<NamedElement>>();

		for (PackageableElement imp : imps) {

			for (String name : namespace.getNamesOfMember(imp)) {
				EList<NamedElement> members = memberNames.get(name);

				if (members == null) {
					memberNames.put(name,
						members = new UniqueEList.FastCompare<NamedElement>());
				}

				members.add(imp);
			}
		}

		impsLoop : for (PackageableElement imp : imps) {
			EClass impEClass = imp.eClass();

			for (String name : namespace.getNamesOfMember(imp)) {
				EList<NamedElement> members = memberNames.get(name);

				if (members.size() > 1) {

					for (NamedElement member : members) {

						if (member != imp) {
							EClass memberEClass = member.eClass();

							if (memberEClass.isSuperTypeOf(impEClass)
								|| impEClass.isSuperTypeOf(memberEClass)) {

								continue impsLoop;
							}
						}
					}
				}
			}

			excludeCollisions.add(imp);
		}

		return ECollections.unmodifiableEList(excludeCollisions);
	}

} // NamespaceOperations