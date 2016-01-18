/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.
 * Package specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.
 * A package is used to group elements, and provides a namespace for the grouped elements.
 * <p>From package UML::Packages.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#getURI <em>URI</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplications <em>Profile Application</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package
		extends Namespace, PackageableElement, TemplateableElement {

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an identifier for the package that can be used for many purposes. A URI is the universally unique identification of the package following the IETF URI specification, RFC 2396 http://www.ietf.org/rfc/rfc2396.txt and it must comply with those syntax rules.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_URI()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Package#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.PackageMerge#getReceivingPackage <em>Receiving Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageMerges that are owned by this Package.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_PackageMerge()
	 * @see org.eclipse.uml2.uml.PackageMerge#getReceivingPackage
	 * @model opposite="receivingPackage" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<PackageMerge> getPackageMerges();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.PackageMerge}, with the specified '<em><b>Merged Package</b></em>', and appends it to the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param mergedPackage The '<em><b>Merged Package</b></em>' for the new {@link org.eclipse.uml2.uml.PackageMerge}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.PackageMerge}.
	 * @see #getPackageMerges()
	 * @generated
	 */
	PackageMerge createPackageMerge(Package mergedPackage);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageMerge} with the specified '<em><b>Merged Package</b></em>' from the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param mergedPackage The '<em><b>Merged Package</b></em>' of the {@link org.eclipse.uml2.uml.PackageMerge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageMerge} with the specified '<em><b>Merged Package</b></em>', or <code>null</code>.
	 * @see #getPackageMerges()
	 * @generated
	 */
	PackageMerge getPackageMerge(Package mergedPackage);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageMerge} with the specified '<em><b>Merged Package</b></em>' from the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param mergedPackage The '<em><b>Merged Package</b></em>' of the {@link org.eclipse.uml2.uml.PackageMerge} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.PackageMerge} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.PackageMerge} with the specified '<em><b>Merged Package</b></em>', or <code>null</code>.
	 * @see #getPackageMerges()
	 * @generated
	 */
	PackageMerge getPackageMerge(Package mergedPackage, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the packageable elements that are owned by this Package.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_PackagedElement()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElements();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.PackageableElement}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.PackageableElement}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.PackageableElement}.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement createPackagedElement(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement getPackagedElement(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.PackageableElement} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPackagedElements()
	 * @generated
	 */
	PackageableElement getPackagedElement(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Type#getPackage <em>Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Package#getPackagedElements() <em>Packaged Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Types.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_OwnedType()
	 * @see org.eclipse.uml2.uml.Type#getPackage
	 * @model opposite="package" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Type> getOwnedTypes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Type}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Type}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Type} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Type}.
	 * @see #getOwnedTypes()
	 * @generated
	 */
	Type createOwnedType(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTypes()
	 * @generated
	 */
	Type getOwnedType(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Type} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Type} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTypes()
	 * @generated
	 */
	Type getOwnedType(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Package}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Package#getPackagedElements() <em>Packaged Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Packages.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_NestedPackage()
	 * @see org.eclipse.uml2.uml.Package#getNestingPackage
	 * @model opposite="nestingPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Package> getNestedPackages();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Package}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Package}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Package} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Package}.
	 * @see #getNestedPackages()
	 * @generated
	 */
	Package createNestedPackage(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Package}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Package}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Package}.
	 * @see #getNestedPackages()
	 * @generated
	 */
	Package createNestedPackage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Package} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Package} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Package} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedPackages()
	 * @generated
	 */
	Package getNestedPackage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Package} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Package} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Package} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Package} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Package} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedPackages()
	 * @generated
	 */
	Package getNestedPackage(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Package#getNestedPackages <em>Nested Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Package that owns this Package.
	 * <p>From package UML::Packages.</p>
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
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Stereotype}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Package#getPackagedElements() <em>Packaged Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Stereotypes that are owned by the Package.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_OwnedStereotype()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Stereotype> getOwnedStereotypes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Stereotype} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
	 */
	Stereotype getOwnedStereotype(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Stereotype} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
	 */
	Stereotype getOwnedStereotype(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Profile Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ProfileApplication}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage <em>Applying Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ProfileApplications that indicate which profiles have been applied to the Package.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Application</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackage_ProfileApplication()
	 * @see org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage
	 * @model opposite="applyingPackage" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ProfileApplication> getProfileApplications();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ProfileApplication} and appends it to the '<em><b>Profile Application</b></em>' containment reference list.
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
	 * packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as an owned type of this package.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" isAbstractDataType="org.eclipse.uml2.types.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class createOwnedClass(String name,
			boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as an owned type of this package.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Enumeration createOwnedEnumeration(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as an owned type of this package.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	PrimitiveType createOwnedPrimitiveType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) stereotype with the specified name as an owned stereotype of this profile.
	 * @param name The name for the new stereotype, or null.
	 * @param isAbstract Whether the new stereotype should be abstract.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" isAbstractDataType="org.eclipse.uml2.types.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	Stereotype createOwnedStereotype(String name, boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified profile is applied to this package.
	 * @param profile The profile in question.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	boolean isProfileApplied(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definition of the specified profile to this package and automatically applies required stereotypes in the profile to elements within this package's namespace hieararchy. If a different definition is already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param profile The profile to apply.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	EList<EObject> applyProfile(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified profile from this package and automatically unapplies stereotypes in the profile from elements within this package's namespace hieararchy.
	 * @param profile The profile to unapply.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	EList<EObject> unapplyProfile(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definitions of the specified profiles to this package and automatically applies required stereotypes in the profiles to elements within this package's namespace hieararchy. If different definitions are already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param profiles The profiles to apply.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profilesRequired="true" profilesMany="true" profilesOrdered="false"
	 * @generated
	 */
	EList<EObject> applyProfiles(EList<Profile> profiles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allApplicableStereotypes() returns all the directly or indirectly owned stereotypes, including stereotypes contained in sub-profiles.
	 * result = (let ownedPackages : Bag(Package) = ownedMember->select(oclIsKindOf(Package))->collect(oclAsType(Package)) in
	 *  ownedStereotype->union(ownedPackages.allApplicableStereotypes())->flatten()->asSet()
	 * )
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Stereotype> allApplicableStereotypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile() returns the closest profile directly or indirectly containing this package (or this package itself, if it is a profile).
	 * result = (if self.oclIsKindOf(Profile) then 
	 * 	self.oclAsType(Profile)
	 * else
	 * 	self.namespace.oclAsType(Package).containingProfile()
	 * endif)
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	Profile containingProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profiles that are applied to this package.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Profile> getAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package, or null if no such profile is applied.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * <!-- end-model-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Profile getAppliedProfile(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.eclipse.uml2.types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false" recurseDataType="org.eclipse.uml2.types.Boolean" recurseRequired="true" recurseOrdered="false"
	 * @generated
	 */
	Profile getAppliedProfile(String qualifiedName, boolean recurse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profile applications for this package, including profile applications for its nesting package(s).
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<ProfileApplication> getAllProfileApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package, or null if no such profile is applied.
	 * @param profile The profile whose application to retrieve.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	ProfileApplication getProfileApplication(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param profile The profile whose application to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false" recurseDataType="org.eclipse.uml2.types.Boolean" recurseRequired="true" recurseOrdered="false"
	 * @generated
	 */
	ProfileApplication getProfileApplication(Profile profile, boolean recurse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as an owned type of this package.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Interface createOwnedInterface(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this package is a model library.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isModelLibrary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profiles that are applied to this package, including profiles applied to its nesting package(s).
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Profile> getAllAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * result = (member->select( m | m.oclIsKindOf(PackageableElement) and self.makesVisible(m))->collect(oclAsType(PackageableElement))->asSet())
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageableElement> visibleMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * member->includes(el)
	 * result = (ownedMember->includes(el) or
	 * (elementImport->select(ei|ei.importedElement = VisibilityKind::public)->collect(importedElement.oclAsType(NamedElement))->includes(el)) or
	 * (packageImport->select(visibility = VisibilityKind::public)->collect(importedPackage.member->includes(el))->notEmpty()))
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" elRequired="true" elOrdered="false"
	 * @generated
	 */
	boolean makesVisible(NamedElement el);

} // Package
