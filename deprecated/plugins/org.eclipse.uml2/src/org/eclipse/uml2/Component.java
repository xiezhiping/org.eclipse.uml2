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
 * $Id: Component.java,v 1.11 2005/11/04 22:23:04 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Component#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.eclipse.uml2.Component#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.Component#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.Component#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.Component#getOwnedMembers <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends org.eclipse.uml2.Class{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Indirectly Instantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {default = true} The kind of instantiation that applies to a Component. If false, the component is instantiated as an addressable object. If true, the Component is defined at design-time, but at runtime (or execution-time) an object specified by the Component does not exist, that is, the component is instantiated indirectly, through the instantiation of its realizing classifiers or parts. Several standard stereotypes use this meta attribute, e.g. «specification, «focus», «subsystem ».
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see org.eclipse.uml2.UML2Package#getComponent_IsIndirectlyInstantiated()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Component#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(boolean value);


	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getComponent_Required()
	 * @model type="org.eclipse.uml2.Interface" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getRequireds();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequireds()
	 * @generated
	 */
    Interface getRequired(String name);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getComponent_Provided()
	 * @model type="org.eclipse.uml2.Interface" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getProvideds();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getProvideds()
	 * @generated
	 */
    Interface getProvided(String name);

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Realization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Realization#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getComponent_Realization()
	 * @see org.eclipse.uml2.Realization#getAbstraction
	 * @model type="org.eclipse.uml2.Realization" opposite="abstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList getRealizations();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Realization} with the specified '<em><b>Name</b></em>' from the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Realization} to retrieve.
	 * @return The {@link org.eclipse.uml2.Realization} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizations()
	 * @generated
	 */
    Realization getRealization(String name);

	/**
	 * Creates a {@link org.eclipse.uml2.Realization} and appends it to the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Realization} to create.
	 * @return The new {@link org.eclipse.uml2.Realization}.
	 * @see #getRealizations()
	 * @generated
	 */
    Realization createRealization(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Realization} and appends it to the '<em><b>Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Realization}.
	 * @see #getRealizations()
	 * @generated
	 */
    Realization createRealization();

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
	 * @see org.eclipse.uml2.UML2Package#getComponent_OwnedMember()
	 * @model type="org.eclipse.uml2.PackageableElement" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedMembers();



	/**
	 * Retrieves the {@link org.eclipse.uml2.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedMembers()
	 * @generated
	 */
    NamedElement getOwnedMember(String name);

    /**
     * Creates a {@link org.eclipse.uml2.PackageableElement} and appends it to the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.PackageableElement} to create.
	 * @return The new {@link org.eclipse.uml2.PackageableElement}.
	 * @see #getOwnedMembers()
	 * @generated NOT
     */
    PackageableElement createOwnedMember(EClass eClass);

	// <!-- begin-custom-operations -->

	/**
	 * Creates a(n) (abstract) class with the specified name as an owned member
	 * of this component.
	 * 
	 * @param name
	 *            The name for the owned class.
	 * @param isAbstract
	 *            Whether the owned class should be abstract.
	 * @return The new class.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	org.eclipse.uml2.Class createOwnedClass(String name, boolean isAbstract);

	/**
	 * Creates an enumeration with the specified name as an owned member of this
	 * component.
	 * 
	 * @param name
	 *            The name for the owned enumeration.
	 * @return The new enumeration.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	Enumeration createOwnedEnumeraton(String name);

	/**
	 * Creates a package with the specified name as an owned member of this
	 * component.
	 * 
	 * @param name
	 *            The name for the owned package.
	 * @return The new package.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	org.eclipse.uml2.Package createOwnedPackage(String name);

	/**
	 * Creates a primitive type with the specified name as an owned member of
	 * this component.
	 * 
	 * @param name
	 *            The name for the owned primitive type.
	 * @return The new primitive type.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	PrimitiveType createOwnedPrimitiveType(String name);

	// <!-- end-custom-operations -->

} // Component
