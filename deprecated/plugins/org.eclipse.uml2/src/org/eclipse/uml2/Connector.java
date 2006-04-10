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
 * $Id: Connector.java,v 1.12 2006/04/10 20:40:21 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each connector may be attached to two or more connectable elements, each representing a set of instances. Each connector end 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Connector#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Connector#getRedefinedConnectors <em>Redefined Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.Connector#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.Connector#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.ConnectorKind
	 * @see #setKind(ConnectorKind)
	 * @see org.eclipse.uml2.UML2Package#getConnector_Kind()
	 * @model
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Connector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.uml2.ConnectorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectorKind value);


	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional association that specifies the link corresponding to this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see org.eclipse.uml2.UML2Package#getConnector_Type()
	 * @model
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Connector#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);


	/**
	 * Returns the value of the '<em><b>Redefined Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * connector may be redefined when its containing classifier is specialized. The redefining connector may have a type that specializes the type of the redefined connector. The types of the connector ends of the redefining connector may specialize the types of the connector ends of the redefined connector. The properties of the connector ends of the redefining connector may be replaced. (Subsets Element.redefinedElement.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnector_RedefinedConnector()
	 * @model type="org.eclipse.uml2.Connector" ordered="false"
	 * @generated
	 */
	EList getRedefinedConnectors();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Connector} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedConnectors()
	 * @generated
	 */
    Connector getRedefinedConnector(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Connector} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedConnectors()
	 * @generated
	 */
	Connector getRedefinedConnector(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connector consists of at two connector ends, each of which represents the participation of instances of the classifiers typing the connectable elements attached to this end. The set of connector ends is ordered. (Subsets Element.ownedElement.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnector_End()
	 * @model type="org.eclipse.uml2.ConnectorEnd" containment="true" resolveProxies="false" lower="2"
	 * @generated
	 */
	EList getEnds();


    /**
     * Creates a {@link org.eclipse.uml2.ConnectorEnd} and appends it to the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ConnectorEnd} to create.
	 * @return The new {@link org.eclipse.uml2.ConnectorEnd}.
	 * @see #getEnds()
	 * @generated NOT
	 * @deprecated Use #createEnd() instead.
     */
    ConnectorEnd createEnd(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.ConnectorEnd} and appends it to the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.ConnectorEnd}.
	 * @see #getEnds()
	 * @generated NOT
	 */
    ConnectorEnd createEnd();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnector_Contract()
	 * @model type="org.eclipse.uml2.Behavior" ordered="false"
	 * @generated
	 */
	EList getContracts();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContracts()
	 * @generated
	 */
    Behavior getContract(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContracts()
	 * @generated
	 */
	Behavior getContract(String name, boolean ignoreCase, EClass eClass);


} // Connector
