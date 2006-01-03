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
 * $Id: ProfileApplication.java,v 1.5 2006/01/03 18:01:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ProfileApplication is a kind of PackageImport that adds the capability to state that a Profile is applied to a Package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#isStrict <em>Is Strict</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage <em>Applying Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication()
 * @model
 * @generated
 */
public interface ProfileApplication
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Applied Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Profiles that are applied to a Package through this ProfileApplication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applied Profile</em>' reference.
	 * @see #setAppliedProfile(Profile)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_AppliedProfile()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Profile getAppliedProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedProfile <em>Applied Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Profile</em>' reference.
	 * @see #getAppliedProfile()
	 * @generated
	 */
	void setAppliedProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_IsStrict()
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProfileApplication#isStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setIsStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Applying Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Package#getProfileApplications <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applying Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applying Package</em>' container reference.
	 * @see #setApplyingPackage(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_ApplyingPackage()
	 * @see org.eclipse.uml2.uml.Package#getProfileApplications
	 * @model opposite="profileApplication" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getApplyingPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage <em>Applying Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applying Package</em>' container reference.
	 * @see #getApplyingPackage()
	 * @generated
	 */
	void setApplyingPackage(org.eclipse.uml2.uml.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EPackage getProfileDefinition();

} // ProfileApplication
