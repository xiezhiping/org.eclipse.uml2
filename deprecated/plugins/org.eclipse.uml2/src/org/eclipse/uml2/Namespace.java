/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
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
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_Member()
	 * @model type="org.eclipse.uml2.NamedElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getMembers();

    /**
     * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified name from the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified name, or <code>null</code>.
	 * @see #getMembers()
	 * @generated
     */
    NamedElement getMember(String unqualifiedName);
      
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
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_OwnedRule()
	 * @see org.eclipse.uml2.Constraint#getNamespace
	 * @model type="org.eclipse.uml2.Constraint" opposite="namespace" containment="true" volatile="true"
	 * @generated
	 */
	EList getOwnedRules();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getOwnedRules()
	 * @generated
     */
    Constraint getOwnedRule(String unqualifiedName);
      
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
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_ImportedMember()
	 * @model type="org.eclipse.uml2.PackageableElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getImportedMembers();

    /**
     * Retrieves the {@link org.eclipse.uml2.PackageableElement} with the specified name from the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.PackageableElement} with the specified name, or <code>null</code>.
	 * @see #getImportedMembers()
	 * @generated
     */
    PackageableElement getImportedMember(String unqualifiedName);
      
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
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_ElementImport()
	 * @see org.eclipse.uml2.ElementImport#getImportingNamespace
	 * @model type="org.eclipse.uml2.ElementImport" opposite="importingNamespace" containment="true" volatile="true"
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
	 * @generated
     */
    ElementImport createElementImport(EClass eClass);

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
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamespace_PackageImport()
	 * @see org.eclipse.uml2.PackageImport#getImportingNamespace
	 * @model type="org.eclipse.uml2.PackageImport" opposite="importingNamespace" containment="true" volatile="true"
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
	boolean validateMembersAreDistinguishable(DiagnosticChain diagnostics, Map data);

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
	boolean validateImportedMemberDerived(DiagnosticChain diagnostics, Map data);

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
	 * @model dataType="org.eclipse.uml2.Set" parameters="org.eclipse.uml2.Set"
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
	 * @model dataType="org.eclipse.uml2.Set" parameters="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set excludeCollisions(Set imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

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
	public void importElement(VisibilityKind visibility, PackageableElement element);

	/**
	 * Retrieves the set of packages imported by this namespace.
	 * 
	 * @return The packages imported by this namespace.
	 */
	public Set getImportedPackages();

	/**
	 * Imports the specified package into this namespace with the specified
	 * visibility.
	 * 
	 * @param visibility The visbility with which to import the package.
	 * @param package_ The package to import.
	 * @exception IllegalArgumentException If this namespace already imports the
	 *                                     package.
	 */
	public void importPackage(VisibilityKind visibility, org.eclipse.uml2.Package package_);

	// <!-- end-custom-operations -->

} // Namespace
