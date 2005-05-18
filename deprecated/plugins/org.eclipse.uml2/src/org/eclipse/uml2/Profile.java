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
 * $Id: Profile.java,v 1.8 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Profile#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.Profile#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.Profile#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProfile()
 * @model
 * @generated
 */
public interface Profile extends org.eclipse.uml2.Package{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stereotype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProfile_OwnedStereotype()
	 * @model type="org.eclipse.uml2.Stereotype" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedStereotypes();


    /**
     * Retrieves the {@link org.eclipse.uml2.Stereotype} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Stereotype} to retrieve.
	 * @return The {@link org.eclipse.uml2.Stereotype} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
     */
    Stereotype getOwnedStereotype(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProfile_MetaclassReference()
	 * @model type="org.eclipse.uml2.ElementImport" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getMetaclassReferences();


	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProfile_MetamodelReference()
	 * @model type="org.eclipse.uml2.PackageImport" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getMetamodelReferences();


	// <!-- begin-custom-operations -->

	/**
	 * Determines whether this profile is defined.
	 * 
	 * @return <code>true</code> if this profile is defined;
	 *         <code>false</code> otherwise.
	 */
	boolean isDefined();

	/**
	 * Retrieves the version of this profile.
	 * 
	 * @return The version of this profile, or <code>null</code> if undefined.
	 */
	String getVersion();

	/**
	 * Defines this profile by (re)creating Ecore representations of its current
	 * contents and incrementing its version.
	 * 
	 * @throws IllegalArgumentException
	 *             If this profile has no name.
	 */
	void define();

	/**
	 * Retrieves the set of metaclasses referenced by this profile.
	 * 
	 * @return The metaclasses referenced by this profile.
	 */
	Set getReferencedMetaclasses();

	/**
	 * References the specified metaclass in this profile with private
	 * visibility.
	 * 
	 * @param class_
	 *            The metaclass to reference.
	 * @exception IllegalArgumentException
	 *                If this profile already references the metaclass.
	 */
	void referenceMetaclass(org.eclipse.uml2.Class class_);

	/**
	 * Retrieves the set of metamodels referenced by this profile.
	 * 
	 * @return The metamodels referenced by this profile.
	 */
	Set getReferencedMetamodels();

	/**
	 * References the specified metamodel in this profile with private
	 * visibility.
	 * 
	 * @param model
	 *            The metamodel to reference.
	 * @exception IllegalArgumentException
	 *                If this profile already references the metamodel.
	 */
	void referenceMetamodel(Model model);

	/**
	 * Creates and returns an instance of (the Ecore representation of) the
	 * specified classifier defined in this profile.
	 * 
	 * @param classifier
	 *            The classifier whose Ecore representation is to be
	 *            instantiated.
	 * @return An (Ecore) instance of the classifier.
	 * @exception IllegalArgumentException
	 *                If the classifier is not defined in this profile or cannot
	 *                be instantiated.
	 */
	EObject create(Classifier classifier);

	/**
	 * Creates a(n) (abstract) stereotype with the specified name as an owned
	 * stereotype of this profile.
	 * 
	 * @param name
	 *            The name for the owned stereotype.
	 * @param isAbstract
	 *            Whether the owned stereotype should be abstract.
	 * @return The new stereotype.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	Stereotype createOwnedStereotype(String name, boolean isAbstract);
	
	// <!-- end-custom-operations -->

} // Profile
