/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encapsulated Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts() <em>Get Owned Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncapsulatedClassifierOperations
		extends StructuredClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for EncapsulatedClassifier::/ownedPort : Port
	 * true
	 * @param encapsulatedClassifier The receiving '<em><b>Encapsulated Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Port> getOwnedPorts(
			EncapsulatedClassifier encapsulatedClassifier) {
		return encapsulatedClassifier.getOwnedPorts();
	}

} // EncapsulatedClassifierOperations