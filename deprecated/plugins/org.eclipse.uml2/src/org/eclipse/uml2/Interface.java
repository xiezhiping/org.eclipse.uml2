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
 * $Id: Interface.java,v 1.4 2004/06/03 02:59:17 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface is a kind of classifier that represents a declaration of a set of coherent public features and obligations. In a sense, 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Interface#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interface#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interface#getRedefinedInterfaces <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interface#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interface#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interface#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInterface()
 * @model 
 * @generated
 */
public interface Interface extends Classifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterface_OwnedAttribute()
	 * @model type="org.eclipse.uml2.Property" containment="true"
	 * @generated
	 */
	EList getOwnedAttributes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
     */
    Property getOwnedAttribute(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
     */
    Property createOwnedAttribute(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterface_OwnedOperation()
	 * @model type="org.eclipse.uml2.Operation" containment="true"
	 * @generated
	 */
	EList getOwnedOperations();

    /**
     * Retrieves the {@link org.eclipse.uml2.Operation} with the specified name from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Operation} with the specified name, or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
     */
    Operation getOwnedOperation(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Operation} and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Operation} to create.
	 * @return The new {@link org.eclipse.uml2.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
     */
    Operation createOwnedOperation(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Redefined Interface</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Interface</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterface_RedefinedInterface()
	 * @model type="org.eclipse.uml2.Interface" ordered="false"
	 * @generated
	 */
	EList getRedefinedInterfaces();

    /**
     * Retrieves the {@link org.eclipse.uml2.Interface} with the specified name from the '<em><b>Redefined Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.Interface} with the specified name, or <code>null</code>.
	 * @see #getRedefinedInterfaces()
	 * @generated
     */
    Interface getRedefinedInterface(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterface_NestedClassifier()
	 * @model type="org.eclipse.uml2.Classifier" containment="true"
	 * @generated
	 */
	EList getNestedClassifiers();

    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified name from the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified name, or <code>null</code>.
	 * @see #getNestedClassifiers()
	 * @generated
     */
    Classifier getNestedClassifier(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Classifier} and appends it to the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Classifier} to create.
	 * @return The new {@link org.eclipse.uml2.Classifier}.
	 * @see #getNestedClassifiers()
	 * @generated
     */
    Classifier createNestedClassifier(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Reception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Reception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterface_OwnedReception()
	 * @model type="org.eclipse.uml2.Reception" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedReceptions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Reception} with the specified name from the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Reception} to retrieve.
	 * @return The {@link org.eclipse.uml2.Reception} with the specified name, or <code>null</code>.
	 * @see #getOwnedReceptions()
	 * @generated
     */
    Reception getOwnedReception(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Reception} and appends it to the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Reception} to create.
	 * @return The new {@link org.eclipse.uml2.Reception}.
	 * @see #getOwnedReceptions()
	 * @generated
     */
    Reception createOwnedReception(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see org.eclipse.uml2.UML2Package#getInterface_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Interface#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);

    /**
     * Creates a {@link org.eclipse.uml2.ProtocolStateMachine} and sets the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ProtocolStateMachine} to create.
	 * @return The new {@link org.eclipse.uml2.ProtocolStateMachine}.
	 * @see #getProtocol()
	 * @generated
     */
    ProtocolStateMachine createProtocol(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinedElements();

} // Interface
