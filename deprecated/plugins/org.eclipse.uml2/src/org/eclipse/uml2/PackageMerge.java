/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: PackageMerge.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
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
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Merging Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Package#getPackageMerges <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merging Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Element getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getTargets();

} // PackageMerge
