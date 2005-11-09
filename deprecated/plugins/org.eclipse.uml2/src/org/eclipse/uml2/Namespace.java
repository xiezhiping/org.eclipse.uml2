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
 * $Id: Namespace.java,v 1.14 2005/11/09 22:53:10 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A namespace is a named element that can own other named elements. Each named element may be owned by at most one namespace. A namespace provides a means for identifying named elements by name. Named elements can be identified by name in a namespace either by being directly owned by the namespace or by being introduced into the namespace by other means e.g. importing or inheriting. Namespace is an abstract metaclass. A namespace can own constraints. The constraint does not necessarily apply to the namespace itself, but may also apply to elements in the namespace. A namespace has the ability to import either individial members or all members of a package, thereby making it possible to refer to those named elements without qualification in the importing namespace. In the case of conflicts, it is necessary to use qualified names or aliases to disambiguate the referenced elements. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Namespace#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#getPackageImports <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance. This is a derived union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_Member()
	 * @model type="org.eclipse.uml2.NamedElement" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getMembers();


	/**
	 * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMembers()
	 * @generated
	 */
    NamedElement getMember(String name);

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Constraint#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of Constraints owned by this Namespace. Subsets Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_OwnedRule()
	 * @see org.eclipse.uml2.Constraint#getNamespace
	 * @model type="org.eclipse.uml2.Constraint" opposite="namespace" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedRules();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedRules()
	 * @generated
	 */
    Constraint getOwnedRule(String name);

	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and appends it to the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getOwnedRules()
	 * @generated
	 */
    Constraint createOwnedRule(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and appends it to the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getOwnedRules()
	 * @generated
	 */
    Constraint createOwnedRule();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports. Subsets Namespace::member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_ImportedMember()
	 * @model type="org.eclipse.uml2.PackageableElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getImportedMembers();


	/**
	 * Retrieves the {@link org.eclipse.uml2.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getImportedMembers()
	 * @generated
	 */
    PackageableElement getImportedMember(String name);

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ElementImport}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ElementImports owned by the Namespace. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_ElementImport()
	 * @see org.eclipse.uml2.ElementImport#getImportingNamespace
	 * @model type="org.eclipse.uml2.ElementImport" opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList getElementImports();


    /**
     * Creates a {@link org.eclipse.uml2.ElementImport} and appends it to the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ElementImport} to create.
	 * @return The new {@link org.eclipse.uml2.ElementImport}.
	 * @see #getElementImports()
	 * @generated NOT
	 * @deprecated Use #createElementImport() instead.
     */
    ElementImport createElementImport(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.ElementImport} and appends it to the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.ElementImport}.
	 * @see #getElementImports()
	 * @generated
	 */
    ElementImport createElementImport();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageImport}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageImports owned by the Namespace. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_PackageImport()
	 * @see org.eclipse.uml2.PackageImport#getImportingNamespace
	 * @model type="org.eclipse.uml2.PackageImport" opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList getPackageImports();


	/**
	 * Creates a {@link org.eclipse.uml2.PackageImport} and appends it to the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.PackageImport} to create.
	 * @return The new {@link org.eclipse.uml2.PackageImport}.
	 * @see #getPackageImports()
	 * @generated
	 */
    PackageImport createPackageImport(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.PackageImport} and appends it to the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.PackageImport}.
	 * @see #getPackageImports()
	 * @generated
	 */
    PackageImport createPackageImport();

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
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set getNamesOfMember(NamedElement element);

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
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean membersAreDistinguishable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.importedMember->includesAll(self.importedMembers(self.elementImport.importedElement.asSet()->union(self.packageImport.importedPackage->collect(p | p.visibleMembers()))))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateImportedMemberDerived(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.importedMembers(self.elementImport.importedElement.asSet()->union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set importedMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem | mem.imp.isDistinguishableFrom(mem, self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set" impsDataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set importMembers(Set imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set" impsDataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set excludeCollisions(Set imps);

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements owned by the Namespace. Subsets Element::ownedElement and Namespace::member. This is a derived union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_OwnedMember()
	 * @see org.eclipse.uml2.NamedElement#getNamespace
	 * @model type="org.eclipse.uml2.NamedElement" opposite="namespace" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedMembers();


	/**
	 * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedMembers()
	 * @generated
	 */
    NamedElement getOwnedMember(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * membersAreDistinguishable()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateMembersAreDistinguishable(DiagnosticChain diagnostics, Map context);

	// <!-- begin-custom-operations -->

	/**
	 * Imports the specified element into this namespace with the specified
	 * visibility.
	 * 
	 * @param visibility The visbility with which to import the element.
	 * @param element The element to import.
	 * @exception IllegalArgumentException If this namespace already imports the
	 *                                     element.
	 */
	void importElement(VisibilityKind visibility, PackageableElement element);

	/**
	 * Retrieves the set of packages imported by this namespace.
	 * 
	 * @return The packages imported by this namespace.
	 */
	Set getImportedPackages();

	/**
	 * Imports the specified package into this namespace with the specified
	 * visibility.
	 * 
	 * @param visibility The visbility with which to import the package.
	 * @param package_ The package to import.
	 * @exception IllegalArgumentException If this namespace already imports the
	 *                                     package.
	 */
	void importPackage(VisibilityKind visibility, org.eclipse.uml2.Package package_);

	// <!-- end-custom-operations -->

} // Namespace
