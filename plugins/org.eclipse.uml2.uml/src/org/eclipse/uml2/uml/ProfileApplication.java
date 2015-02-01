/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A profile application is used to show which profiles have been applied to a package.
 * <p>From package UML::Packages.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#isStrict <em>Is Strict</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage <em>Applying Package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication()
 * @model
 * @generated
 */
public interface ProfileApplication
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Applied Profile</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Profiles that are applied to a Package through this ProfileApplication.
	 * <p>From package UML::Packages.</p>
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
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_IsStrict()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package that owns the profile application.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applying Package</em>' container reference.
	 * @see #setApplyingPackage(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfileApplication_ApplyingPackage()
	 * @see org.eclipse.uml2.uml.Package#getProfileApplications
	 * @model opposite="profileApplication" required="true" transient="false" ordered="false"
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
	 * <!-- begin-model-doc -->
	 * Retrieves the definition (Ecore representation) of the profile associated with this profile application.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EPackage getAppliedDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the definition (Ecore representation) of the specified named element in the profile associated with this profile application.
	 * @param namedElement The named element for which to retrieve the applied definition.
	 * <!-- end-model-doc -->
	 * @model ordered="false" namedElementRequired="true" namedElementOrdered="false"
	 * @generated
	 */
	ENamedElement getAppliedDefinition(NamedElement namedElement);

} // ProfileApplication
