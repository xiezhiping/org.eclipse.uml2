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
 * $Id: Namespace.java,v 1.6 2006/02/22 20:48:15 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A namespace has the ability to import either individial members or all members of a package, thereby making it possible to refer to those named elements without qualification in the importing namespace. In the case of conflicts, it is necessary to use qualified names or aliases to disambiguate the referenced elements.
 * A namespace is a named element that can own other named elements. Each named element may be owned by at most one namespace. A namespace provides a means for identifying named elements by name. Named elements can be identified by name in a namespace either by being directly owned by the namespace or by being introduced into the namespace by other means e.g. importing or inheriting. Namespace is an abstract metaclass.
 * 
 * 
 * 
 * A namespace can own constraints. The constraint does not necessarily apply to the namespace itself, but may also apply to elements in the namespace.
 * 
 * 
 * 
 * A namespace has the ability to import either individual members or all members of a package, thereby making it possible to refer to those named elements without qualification in the importing namespace. In the case of conflicts, it is necessary to use qualified names or aliases to disambiguate the referenced elements.
 * 
 * 
 * 
 * 
 * A namespace is a named element that can own other named elements. Each named element may be owned by at most one namespace. A namespace provides a means for identifying named elements by name. Named elements can be identified by name in a namespace either by being directly owned by the namespace or by being introduced into the namespace by other means e.g. importing or inheriting. Namespace is an abstract metaclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ElementImport}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ElementImports owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace_ElementImport()
	 * @see org.eclipse.uml2.uml.ElementImport#getImportingNamespace
	 * @model type="org.eclipse.uml2.uml.ElementImport" opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList getElementImports();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ElementImport}, with the specified '<em><b>Imported Element</b></em>', and appends it to the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedElement The '<em><b>Imported Element</b></em>' for the new {@link org.eclipse.uml2.uml.ElementImport}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ElementImport}.
	 * @see #getElementImports()
	 * @generated
	 */
	ElementImport createElementImport(PackageableElement importedElement);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>' from the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedElement The '<em><b>Imported Element</b></em>' of the {@link org.eclipse.uml2.uml.ElementImport} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>', or <code>null</code>.
	 * @see #getElementImports()
	 * @generated
	 */
	ElementImport getElementImport(PackageableElement importedElement);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>' from the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedElement The '<em><b>Imported Element</b></em>' of the {@link org.eclipse.uml2.uml.ElementImport} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ElementImport} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>', or <code>null</code>.
	 * @see #getElementImports()
	 * @generated
	 */
	ElementImport getElementImport(PackageableElement importedElement,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageImport}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageImports owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace_PackageImport()
	 * @see org.eclipse.uml2.uml.PackageImport#getImportingNamespace
	 * @model type="org.eclipse.uml2.uml.PackageImport" opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList getPackageImports();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.PackageImport}, with the specified '<em><b>Imported Package</b></em>', and appends it to the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedPackage The '<em><b>Imported Package</b></em>' for the new {@link org.eclipse.uml2.uml.PackageImport}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.PackageImport}.
	 * @see #getPackageImports()
	 * @generated
	 */
	PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package importedPackage);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>' from the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedPackage The '<em><b>Imported Package</b></em>' of the {@link org.eclipse.uml2.uml.PackageImport} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>', or <code>null</code>.
	 * @see #getPackageImports()
	 * @generated
	 */
	PackageImport getPackageImport(org.eclipse.uml2.uml.Package importedPackage);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>' from the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedPackage The '<em><b>Imported Package</b></em>' of the {@link org.eclipse.uml2.uml.PackageImport} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.PackageImport} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>', or <code>null</code>.
	 * @see #getPackageImports()
	 * @generated
	 */
	PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of Constraints owned by this Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace_OwnedRule()
	 * @see org.eclipse.uml2.uml.Constraint#getContext
	 * @model type="org.eclipse.uml2.uml.Constraint" opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedRules();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getOwnedRules()
	 * @generated
	 */
	Constraint createOwnedRule(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getOwnedRules()
	 * @generated
	 */
	Constraint createOwnedRule(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedRules()
	 * @generated
	 */
	Constraint getOwnedRule(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedRules()
	 * @generated
	 */
	Constraint getOwnedRule(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redefines the corresponding property of Abstractions::Namespaces::Namespace.
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace_Member()
	 * @model type="org.eclipse.uml2.uml.NamedElement" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getMembers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMembers()
	 * @generated
	 */
	NamedElement getMember(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMembers()
	 * @generated
	 */
	NamedElement getMember(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace_ImportedMember()
	 * @model type="org.eclipse.uml2.uml.PackageableElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getImportedMembers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getImportedMembers()
	 * @generated
	 */
	PackageableElement getImportedMember(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getImportedMembers()
	 * @generated
	 */
	PackageableElement getImportedMember(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redefines the corresponding property of Abstractions::Namespaces::Namespace.
	 * A collection of NamedElements owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamespace_OwnedMember()
	 * @see org.eclipse.uml2.uml.NamedElement#getNamespace
	 * @model type="org.eclipse.uml2.uml.NamedElement" opposite="namespace" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedMembers()
	 * @generated
	 */
	NamedElement getOwnedMember(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedMembers()
	 * @generated
	 */
	NamedElement getOwnedMember(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the members of a Namespace are distinguishable within it.
	 * membersAreDistinguishable()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" elementRequired="true" elementOrdered="false" visibilityRequired="true" visibilityOrdered="false"
	 * @generated
	 */
	ElementImport createElementImport(PackageableElement element,
			VisibilityKind visibility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" package_Required="true" package_Ordered="false" visibilityRequired="true" visibilityOrdered="false"
	 * @generated
	 */
	PackageImport createPackageImport(org.eclipse.uml2.uml.Package package_,
			VisibilityKind visibility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.PackageableElement" ordered="false"
	 * @generated
	 */
	EList getImportedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Package" ordered="false"
	 * @generated
	 */
	EList getImportedPackages();

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
	 * @model type="java.lang.String" dataType="org.eclipse.uml2.uml.String" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	EList getNamesOfMember(NamedElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespace's members are distinguishable within it.
	 * result = self.member->forAll( memb |
	 * self.member->excluding(memb)->forAll(other |
	 * memb.isDistinguishableFrom(other, self)))
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean membersAreDistinguishable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query importMembers() defines which of a set of PackageableElements are actually imported into the namespace. This excludes hidden ones, i.e., those which have names that conflict with names of owned members, and also excludes elements which would have the same name when imported.
	 * result = self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem |
	 * mem.imp.isDistinguishableFrom(mem, self)))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.PackageableElement" ordered="false" impsType="org.eclipse.uml2.uml.PackageableElement" impsMany="true" impsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	EList importMembers(EList imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query excludeCollisions() excludes from a set of PackageableElements any that would not be distinguishable from each other in this namespace.
	 * result = imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.PackageableElement" ordered="false" impsType="org.eclipse.uml2.uml.PackageableElement" impsMany="true" impsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	EList excludeCollisions(EList imps);

} // Namespace
