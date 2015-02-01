/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signal</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Signal#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this signal.
	 * @param signal The receiving '<em><b>Signal</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(Signal signal, String name,
			Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(signal, name, type, lower,
			upper);
	}

} // SignalOperations