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
 * $Id: Connector.java,v 1.4 2004/06/03 02:59:17 khussey Exp $
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
public interface Connector extends Feature{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnector_RedefinedConnector()
	 * @model type="org.eclipse.uml2.Connector" ordered="false"
	 * @generated
	 */
	EList getRedefinedConnectors();

    /**
     * Retrieves the {@link org.eclipse.uml2.Connector} with the specified name from the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Connector} to retrieve.
	 * @return The {@link org.eclipse.uml2.Connector} with the specified name, or <code>null</code>.
	 * @see #getRedefinedConnectors()
	 * @generated
     */
    Connector getRedefinedConnector(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnector_End()
	 * @model type="org.eclipse.uml2.ConnectorEnd" containment="true" lower="2"
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
	 * @generated
     */
    ConnectorEnd createEnd(EClass eClass);

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
     * Retrieves the {@link org.eclipse.uml2.Behavior} with the specified name from the '<em><b>Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.Behavior} with the specified name, or <code>null</code>.
	 * @see #getContracts()
	 * @generated
     */
    Behavior getContract(String unqualifiedName);
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // Connector
