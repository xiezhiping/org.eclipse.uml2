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
 * $Id: Interface.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface is a kind of classifier that represents a declaration of a set of coherent public features and obligations. An interface specifies a contract; any instance of a classifier that realizes the interface must fulfill that contract. The obligations that may be associated with an interface are in the form of various kinds of constraints (such as pre- and post-conditions) or protocol specifications, which may impose ordering restrictions on interactions through the interface.
 * 
 * Since interfaces are declarations, they are not instantiable. Instead, an interface specification is implemented by an instance of an instantiable classifier, which means that the instantiable classifier presents a public facade that conforms to the interface specification. Note that a given classifier may implement more than one interface and that an interface may be implemented by a number of different classifiers.
 * 
 * 
 * Adds the capability for interfaces to include receptions (in addition to operations).
 * Since an interface specifies conformance characteristics, it does not own detailed behavior specifications. Instead, interfaces may own a protocol state machine that specifies event sequences and pre/post conditions for the operations and receptions described by the interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Interface#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#getRedefinedInterfaces <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface
		extends Classifier {

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes (i.e. the properties) owned by the class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterface_OwnedAttribute()
	 * @model type="org.eclipse.uml2.uml.Property" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getOwnedAttributes();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property createOwnedAttribute(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Property} and appends it to the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property createOwnedAttribute();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedAttributes()
	 * @generated
	 */
	Property getOwnedAttribute(String name);

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References all the Classifiers that are defined (nested) within the Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterface_NestedClassifier()
	 * @model type="org.eclipse.uml2.uml.Classifier" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getNestedClassifiers();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Classifier} and appends it to the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Classifier}.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier createNestedClassifier(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedClassifiers()
	 * @generated
	 */
	Classifier getNestedClassifier(String name);

	/**
	 * Returns the value of the '<em><b>Redefined Interface</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References all the Interfaces redefined by this Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Interface</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterface_RedefinedInterface()
	 * @model type="org.eclipse.uml2.uml.Interface" ordered="false"
	 * @generated
	 */
	List getRedefinedInterfaces();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Interface} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Interface} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedInterfaces()
	 * @generated
	 */
	Interface getRedefinedInterface(String name);

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Reception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Receptions that objects providing this interface are willing to accept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterface_OwnedReception()
	 * @model type="org.eclipse.uml2.uml.Reception" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getOwnedReceptions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Reception} and appends it to the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Reception}.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception createOwnedReception();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Reception} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Reception} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedReceptions()
	 * @generated
	 */
	Reception getOwnedReception(String name);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a protocol state machine specifying the legal sequences of the invocation of the behavioral features described in the interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterface_Protocol()
	 * @model containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Interface#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ProtocolStateMachine} and sets the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ProtocolStateMachine}.
	 * @see #getProtocol()
	 * @generated
	 */
	ProtocolStateMachine createProtocol();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operations owned by the class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInterface_OwnedOperation()
	 * @see org.eclipse.uml2.uml.Operation#getInterface
	 * @model type="org.eclipse.uml2.uml.Operation" opposite="interface" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getOwnedOperations();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Operation} and appends it to the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Operation}.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation createOwnedOperation();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedOperations()
	 * @generated
	 */
	Operation getOwnedOperation(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of all features owned by an interface must be public.
	 * self.feature->forAll(f | f.visibility = #public)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateVisibility(DiagnosticChain diagnostics, Map context);

} // Interface
