/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Package.java,v 1.12 2005/04/04 20:11:16 khussey Exp $
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
 * <!-- begin-model-doc -->
 * A package is a namespace for its members, and may contain other packages. Only packageable elements can be owned members of a package. By virtue of being a namespace, a package can import either individual members of other packages, or all the members of other packages. In addition a package can be merged with other packages. 
 * <!-- end-model-doc -->
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
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	 * <!-- begin-model-doc -->
	 * References the owned members that are Packages. Subsets Package::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_NestedPackage()
	 * @see org.eclipse.uml2.Package#getNestingPackage
	 * @model type="org.eclipse.uml2.Package" opposite="nestingPackage" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Package#getOwnedMembers=''"
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
	 *        annotation="subsets org.eclipse.uml2.NamedElement#getNamespace=''"
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
	 * <!-- begin-model-doc -->
	 * References the owned members that are Types. Subsets Package::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_OwnedType()
	 * @see org.eclipse.uml2.Type#getPackage
	 * @model type="org.eclipse.uml2.Type" opposite="package" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Package#getOwnedMembers=''"
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
	 * <!-- begin-model-doc -->
	 * Specifies the members that are owned by this Package. Redefines Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getPackage_OwnedMember()
	 * @model type="org.eclipse.uml2.PackageableElement" containment="true" volatile="true" ordered="false"
	 *        annotation="redefines org.eclipse.uml2.Namespace#getOwnedMembers=''"
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
	 * @model type="org.eclipse.uml2.PackageMerge" opposite="mergingPackage" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
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
	 * @model type="org.eclipse.uml2.ProfileApplication" resolveProxies="false" volatile="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Namespace#getPackageImports=''"
	 * @generated
	 */
	EList getAppliedProfiles();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.uml2.internal.operation.PackageOperations.validateElementsPublicOrPrivate(this, diagnostics, context);'" 
	 * @generated
	 */
	boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics, Map context);

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
	 * @model type="org.eclipse.uml2.PackageMerge" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
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
	 * A query based on the following OCL expression:
	 * <code>
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.uml2.internal.operation.PackageOperations.mustBeOwned(this);'" 
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"visibleMembers\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.PackageOperations.visibleMembers(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.PackageOperations.visibleMembers(this);\r\n}'" 
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.uml2.internal.operation.PackageOperations.makesVisible(this, el);'" 
	 * @generated
	 */
	boolean makesVisible(NamedElement el);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature derived='true' name='namespace' eType='org.eclipse.uml2.Namespace' containment='false' eOpposite='ownedMember' eOpposite.containment='false' eOpposite.lowerBound='0' eOpposite.upperBound='-1'" 
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='true' name='packageImport' eOpposite='importingNamespace' derived='false' eOpposite.upperBound='1' eType='org.eclipse.uml2.PackageImport' eOpposite.lowerBound='1'" 
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
