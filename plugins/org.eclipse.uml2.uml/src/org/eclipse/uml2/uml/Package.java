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
 * $Id: Package.java,v 1.5 2005/12/19 18:51:31 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

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
 * A package is a namespace for its members, and may contain other packages. Only packageable elements can be owned members of a package. By virtue of being a namespace, a package can import either individual members of other packages, or all the members of other packages.
 * 
 * In addition a package can be merged with other packages.
 * 
 * 
 * Package specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.
 * A Package can have one or more ProfileApplications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplications <em>Profile Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package
		extends Namespace, PackageableElement, TemplateableElement {

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.PackageMerge#getReceivingPackage <em>Receiving Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageMerges that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_PackageMerge()
	 * @see org.eclipse.uml2.uml.PackageMerge#getReceivingPackage
	 * @model type="org.eclipse.uml2.uml.PackageMerge" opposite="receivingPackage" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getPackageMerges();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.PackageMerge} and appends it to the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.PackageMerge}.
	 * @see #getPackageMerges()
	 * @generated
	 */
	PackageMerge createPackageMerge();

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the packageable elements that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_PackagedElement()
	 * @model type="org.eclipse.uml2.uml.PackageableElement" containment="true" ordered="false"
	 * @generated
	 */
	EList getPackagedElements();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.PackageableElement} and appends it to the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.PackageableElement}.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement createPackagedElement(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement getPackagedElement(String name);

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_OwnedType()
	 * @see org.eclipse.uml2.uml.Type#getPackage
	 * @model type="org.eclipse.uml2.uml.Type" opposite="package" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedTypes();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTypes()
	 * @generated
	 */
	Type getOwnedType(String name);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Package}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Packages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_NestedPackage()
	 * @see org.eclipse.uml2.uml.Package#getNestingPackage
	 * @model type="org.eclipse.uml2.uml.Package" opposite="nestingPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getNestedPackages();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Package} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Package} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Package} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedPackages()
	 * @generated
	 */
	Package getNestedPackage(String name);

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Package#getNestedPackages <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the owning package of a package.
	 * References the Package that owns this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see #setNestingPackage(Package)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_NestingPackage()
	 * @see org.eclipse.uml2.uml.Package#getNestedPackages
	 * @model opposite="nestedPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Package#getNestingPackage <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Profile Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ProfileApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ProfileApplications that indicate which profiles have been applied to the Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Application</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_ProfileApplication()
	 * @model type="org.eclipse.uml2.uml.ProfileApplication" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getProfileApplications();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ProfileApplication} and appends it to the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ProfileApplication}.
	 * @see #getProfileApplications()
	 * @generated
	 */
	ProfileApplication createProfileApplication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element that is owned by a package has visibility, it is public or private.
	 * self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Package createNestedPackage(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false" isAbstractDataType="org.eclipse.uml2.uml.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class createOwnedClass(String name, boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Enumeration createOwnedEnumeration(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	PrimitiveType createOwnedPrimitiveType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	boolean isProfileApplied(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	ProfileApplication applyProfile(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	ProfileApplication unapplyProfile(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Profile" ordered="false"
	 * @generated
	 */
	EList getAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.uml.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Profile getAppliedProfile(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.uml.String" qualifiedNameRequired="true" qualifiedNameOrdered="false" isRecursiveDataType="org.eclipse.uml2.uml.Boolean" isRecursiveRequired="true" isRecursiveOrdered="false"
	 * @generated
	 */
	Profile getAppliedProfile(String qualifiedName, boolean isRecursive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.ProfileApplication" ordered="false"
	 * @generated
	 */
	EList getAllProfileApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	ProfileApplication getProfileApplication(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false" isRecursiveDataType="org.eclipse.uml2.uml.Boolean" isRecursiveRequired="true" isRecursiveOrdered="false"
	 * @generated
	 */
	ProfileApplication getProfileApplication(Profile profile,
			boolean isRecursive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Profile" ordered="false"
	 * @generated
	 */
	EList getAllAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * result = member->select( m | self.makesVisible(m))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.PackageableElement" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	EList visibleMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * self.member->includes(el)
	 * result = (ownedMember->includes(el)) or
	 * (elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el)) or
	 * (packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" elRequired="true" elOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean makesVisible(NamedElement el);

} // Package
