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
 * $Id: StructuredClassifier.java,v 1.1 2005/11/14 22:25:58 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

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
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getOwnedConnectors <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier
		extends Classifier {

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties owned by the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_OwnedAttribute()
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
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties specifying instances that the classifier owns by composition. This association is derived, selecting those owned properties where isComposite is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_Part()
	 * @model type="org.eclipse.uml2.uml.Property" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	List getParts();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParts()
	 * @generated
	 */
	Property getPart(String name);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the roles that instances may play in this classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_Role()
	 * @model type="org.eclipse.uml2.uml.ConnectableElement" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	List getRoles();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ConnectableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ConnectableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRoles()
	 * @generated
	 */
	ConnectableElement getRole(String name);

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the connectors owned by the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredClassifier_OwnedConnector()
	 * @model type="org.eclipse.uml2.uml.Connector" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getOwnedConnectors();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Connector} and appends it to the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Connector}.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
	Connector createOwnedConnector();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedConnectors()
	 * @generated
	 */
	Connector getOwnedConnector(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicities on connected elements must be consistent.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicities(DiagnosticChain diagnostics, Map context);

} // StructuredClassifier
