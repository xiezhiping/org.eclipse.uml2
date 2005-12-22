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
 * $Id: EncapsulatedClassifier.java,v 1.4 2005/12/22 15:20:22 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends a classifier with the ability to own ports as specific and type checked interaction points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a set of ports that an encapsulated classifier owns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getEncapsulatedClassifier_OwnedPort()
	 * @model type="org.eclipse.uml2.uml.Port" resolveProxies="false" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedPorts();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedPorts()
	 * @generated
	 */
	Port getOwnedPort(String name);

} // EncapsulatedClassifier
