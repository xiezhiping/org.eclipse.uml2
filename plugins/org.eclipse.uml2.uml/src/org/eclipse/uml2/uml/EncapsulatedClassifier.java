/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EncapsulatedClassifier may own Ports to specify typed interaction points.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getEncapsulatedClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EncapsulatedClassifier
		extends StructuredClassifier {

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Port}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes() <em>Owned Attribute</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Ports owned by the EncapsulatedClassifier.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getEncapsulatedClassifier_OwnedPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Port> getOwnedPorts();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Port}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Port}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.Port}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Port}.
	 * @see #getOwnedPorts()
	 * @generated NOT
	 */
	Port createOwnedPort(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedPorts()
	 * @generated
	 */
	Port getOwnedPort(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedPorts()
	 * @generated
	 */
	Port getOwnedPort(String name, Type type, boolean ignoreCase);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Port} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOwnedPorts()
	 * @generated NOT
	 */
	Port getOwnedPort(String name, Type type, boolean ignoreCase,
			boolean createOnDemand);

} // EncapsulatedClassifier
