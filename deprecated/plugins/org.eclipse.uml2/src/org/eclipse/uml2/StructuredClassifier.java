/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredClassifier.java,v 1.14 2006/04/10 20:40:25 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured classifier is an abstract metaclass that represents any classifier whose behavior can be fully or partly described by the collaboration of owned or referenced instances. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredClassifier#getOwnedConnectors <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier extends Classifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties owned by the classifier. (Subsets StructuredClassifier.role, Classifier. attribute,and Namespace.ownedMember)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_OwnedAttribute()
	 * @model type="org.eclipse.uml2.Property" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getOwnedAttributes();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
    Property getOwnedAttribute(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property getOwnedAttribute(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated NOT
	 */
    Property createOwnedAttribute(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated NOT
	 */
    Property createOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties specifying instances that the classifier owns by composition. This association is derived, selecting those owned properties where isComposite is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_Part()
	 * @model type="org.eclipse.uml2.Property" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getParts();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParts()
	 * @generated
	 */
    Property getPart(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParts()
	 * @generated
	 */
	Property getPart(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the roles that instances may play in this classifier. (Abstract union; subsets Classifier.feature.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_Role()
	 * @model type="org.eclipse.uml2.ConnectableElement" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getRoles();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.ConnectableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ConnectableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ConnectableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRoles()
	 * @generated
	 */
    ConnectableElement getRole(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.ConnectableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ConnectableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ConnectableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ConnectableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRoles()
	 * @generated
	 */
	ConnectableElement getRole(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the connectors owned by the classifier. (Subsets Classifier.feature and Namespace.ownedMember)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStructuredClassifier_OwnedConnector()
	 * @model type="org.eclipse.uml2.Connector" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getOwnedConnectors();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Connector} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
    Connector getOwnedConnector(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Connector} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
	Connector getOwnedConnector(String name, boolean ignoreCase);


    /**
     * Creates a {@link org.eclipse.uml2.Connector} and appends it to the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Connector} to create.
	 * @return The new {@link org.eclipse.uml2.Connector}.
	 * @see #getOwnedConnectors()
	 * @generated NOT
	 * @deprecated Use #createOwnedConnector() instead.
     */
    Connector createOwnedConnector(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Connector} and appends it to the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Connector}.
	 * @see #getOwnedConnectors()
	 * @generated NOT
	 */
    Connector createOwnedConnector();

} // StructuredClassifier
