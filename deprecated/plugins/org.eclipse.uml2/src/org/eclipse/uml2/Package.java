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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Package#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getAppliedProfiles <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.Package#getPackageExtensions <em>Package Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getPackage()
 * @model 
 * @generated
 */
public interface Package extends Namespace, PackageableElement{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Package}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_NestedPackage()
	 * @see org.eclipse.uml2.Package#getNestingPackage
	 * @model type="org.eclipse.uml2.Package" opposite="nestingPackage" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getNestedPackages();

    /**
     * Retrieves the {@link org.eclipse.uml2.Package} with the specified name from the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Package} to retrieve.
	 * @return The {@link org.eclipse.uml2.Package} with the specified name, or <code>null</code>.
	 * @see #getNestedPackages()
	 * @generated
     */
    Package getNestedPackage(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Package#getNestedPackages <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getPackage_NestingPackage()
	 * @see org.eclipse.uml2.Package#getNestedPackages
	 * @model opposite="nestedPackage" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Type}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_OwnedType()
	 * @see org.eclipse.uml2.Type#getPackage
	 * @model type="org.eclipse.uml2.Type" opposite="package" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getOwnedTypes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Type} with the specified name from the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Type} to retrieve.
	 * @return The {@link org.eclipse.uml2.Type} with the specified name, or <code>null</code>.
	 * @see #getOwnedTypes()
	 * @generated
     */
    Type getOwnedType(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_OwnedMember()
	 * @model type="org.eclipse.uml2.PackageableElement" containment="true" volatile="true"
	 * @generated
	 */
	EList getOwnedMembers();

    /**
     * Retrieves the {@link org.eclipse.uml2.PackageableElement} with the specified name from the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.PackageableElement} with the specified name, or <code>null</code>.
	 * @see #getOwnedMembers()
	 * @generated
     */
    PackageableElement getOwnedMember(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.PackageableElement} and appends it to the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.PackageableElement} to create.
	 * @return The new {@link org.eclipse.uml2.PackageableElement}.
	 * @see #getOwnedMembers()
	 * @generated
     */
    PackageableElement createOwnedMember(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.PackageMerge#getMergingPackage <em>Merging Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Merge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_PackageMerge()
	 * @see org.eclipse.uml2.PackageMerge#getMergingPackage
	 * @model type="org.eclipse.uml2.PackageMerge" opposite="mergingPackage" containment="true"
	 * @generated
	 */
	EList getPackageMerges();

    /**
     * Creates a {@link org.eclipse.uml2.PackageMerge} and appends it to the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.PackageMerge} to create.
	 * @return The new {@link org.eclipse.uml2.PackageMerge}.
	 * @see #getPackageMerges()
	 * @generated
     */
    PackageMerge createPackageMerge(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Applied Profile</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ProfileApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Profile</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_AppliedProfile()
	 * @model type="org.eclipse.uml2.ProfileApplication" resolveProxies="false" volatile="true"
	 * @generated
	 */
	EList getAppliedProfiles();

	/**
	 * Returns the value of the '<em><b>Package Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageMerge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Extension</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_PackageExtension()
	 * @model type="org.eclipse.uml2.PackageMerge" containment="true"
	 * @generated
	 */
	EList getPackageExtensions();

    /**
     * Creates a {@link org.eclipse.uml2.PackageMerge} and appends it to the '<em><b>Package Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.PackageMerge} to create.
	 * @return The new {@link org.eclipse.uml2.PackageMerge}.
	 * @see #getPackageExtensions()
	 * @generated
     */
    PackageMerge createPackageExtension(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics, Map data);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean mustBeOwned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * member->select( m | self.makesVisible(m))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set" 
	 * @generated
	 */
	Set visibleMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * el.visibility->isEmpty() or el.visibility = #public
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean makesVisible(NamedElement el);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getPackageImports();

	// <!-- begin-custom-operations -->

	/**
	 * Determines whether the specified profile is applied to this package.
	 * 
	 * @param profile
	 *            The profile to test for application.
	 * @return <code>true</code> if the profile is applied to this package;
	 *         <code>false</code> otherwise.
	 */
	public boolean isApplied(Profile profile);

	/**
	 * Retrieves the set of all profiles that are applied to this package,
	 * including profiles applied to its nesting package(s).
	 * 
	 * @return The profiles applied to the package.
	 */
	public Set getAllAppliedProfiles();

	/**
	 * Applies the current version of the specified profile to this package; if
	 * a different version is already applied, automatically migrates any
	 * associated stereotype values on a "best effort" basis (matching
	 * classifiers and structural features by name).
	 * 
	 * @param profile
	 *            The profile to be applied.
	 * @throws IllegalArgumentException
	 *             If the profile is not defined or its current version is
	 *             already applied.
	 */
	public void apply(Profile profile);

	/**
	 * Unapplies the specified profile from this package.
	 * 
	 * @param profile
	 *            The profile to be unapplied.
	 * @throws IllegalArgumentException
	 *             If the profile is not applied to this package.
	 */
	public void unapply(Profile profile);

	/**
	 * Retrieves the version of the specified profile that is applied to this
	 * package or (one of) its nesting package(s).
	 * 
	 * @param profile
	 *            The profile whose applied version to retrieve.
	 * @return The version of the profile, or <code>null</code> if not
	 *         applied.
	 */
	public String getAppliedVersion(Profile profile);

	// <!-- end-custom-operations -->

} // Package
