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
 * $Id: ProfileApplication.java,v 1.2 2005/11/28 20:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml;

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
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getImportedProfile <em>Imported Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#isStrict <em>Is Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication()
 * @model
 * @generated
 */
public interface ProfileApplication
		extends PackageImport {

	/**
	 * Returns the value of the '<em><b>Imported Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Profiles that are applied to a Package through this ProfileApplication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Profile</em>' reference.
	 * @see #setImportedProfile(Profile)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_ImportedProfile()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Profile getImportedProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ProfileApplication#getImportedProfile <em>Imported Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Profile</em>' reference.
	 * @see #getImportedProfile()
	 * @generated
	 */
	void setImportedProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_IsStrict()
	 * @model default="false" required="true" ordered="false"
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

} // ProfileApplication
