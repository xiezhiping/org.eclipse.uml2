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
 * $Id: PackageMerge.java,v 1.7 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package merge is a relationship between two packages, where the contents of the target package (the one pointed at) is merged with the contents of the source package through specialization and redefinition, where applicable. This is a mechanism that should be used when elements of the same name are intended to represent the same concept, regardless of the package in which they are defined. A merging package will take elements of the same kind with the same name from one or more packages and merge them together into a single element using generalization and redefinitions. It should be noted that a package merge can be viewed as a short-hand way of explicitly defining those generalizations and redefinitions. The merged packages are still available, and the elements in those packages can be separately qualified. From an XMI point of view, it is either possible to exchange a model with all PackageMerges retained or a model where all PackageMerges have been transformed away (in which case package imports, generalizations, and redefinitions are used instead). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageMerge#getMergingPackage <em>Merging Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageMerge#getMergedPackage <em>Merged Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getPackageMerge()
 * @model
 * @generated
 */
public interface PackageMerge extends DirectedRelationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Merging Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Package#getPackageMerges <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merging Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Package that is being extended with the contents of the target of the PackageMerge. Subsets Element::owner and DirectedRelationship::source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merging Package</em>' container reference.
	 * @see #setMergingPackage(org.eclipse.uml2.Package)
	 * @see org.eclipse.uml2.UML2Package#getPackageMerge_MergingPackage()
	 * @see org.eclipse.uml2.Package#getPackageMerges
	 * @model opposite="packageMerge" required="true"
	 * @generated
	 */
	org.eclipse.uml2.Package getMergingPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.PackageMerge#getMergingPackage <em>Merging Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merging Package</em>' container reference.
	 * @see #getMergingPackage()
	 * @generated
	 */
	void setMergingPackage(org.eclipse.uml2.Package value);


	/**
	 * Returns the value of the '<em><b>Merged Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Package that is to be merged with the source of the PackageMerge. Subsets DirectedRelationship;;target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merged Package</em>' reference.
	 * @see #setMergedPackage(org.eclipse.uml2.Package)
	 * @see org.eclipse.uml2.UML2Package#getPackageMerge_MergedPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.Package getMergedPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.PackageMerge#getMergedPackage <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Package</em>' reference.
	 * @see #getMergedPackage()
	 * @generated
	 */
	void setMergedPackage(org.eclipse.uml2.Package value);


} // PackageMerge
