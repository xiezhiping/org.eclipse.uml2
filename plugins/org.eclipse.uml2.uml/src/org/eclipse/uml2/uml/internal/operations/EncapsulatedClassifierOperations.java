/*
 * Copyright (c) 2011, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts() <em>Get Owned Ports</em>}</li>
 * </ul>
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
	 * Derivation for EncapsulatedClassifier::/ownedPort : Port
	 * result = (ownedAttribute->select(oclIsKindOf(Port))->collect(oclAsType(Port))->asOrderedSet())
	 * @param encapsulatedClassifier The receiving '<em><b>Encapsulated Classifier</b></em>' model object.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Port> getOwnedPorts(
			EncapsulatedClassifier encapsulatedClassifier) {
		return encapsulatedClassifier.getOwnedPorts();
	}

} // EncapsulatedClassifierOperations