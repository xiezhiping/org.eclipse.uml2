/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal String</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralString#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralString#unlimitedValue() <em>Unlimited Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralString#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralString#stringValue() <em>String Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralStringOperations
		extends ValueSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralStringOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int integerValue(LiteralString literalString) {

		try {
			return Integer.parseInt(literalString.getValue());
		} catch (NumberFormatException nfe) {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int unlimitedValue(LiteralString literalString) {

		try {
			String value = literalString.getValue();
			return "*".equals(value) //$NON-NLS-1$
				? LiteralUnlimitedNatural.UNLIMITED
				: Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = (true)
	 * <p>From package UML::Values.</p>
	 * @param literalString The receiving '<em><b>Literal String</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(LiteralString literalString) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query stringValue() gives the value.
	 * result = (value)
	 * <p>From package UML::Values.</p>
	 * @param literalString The receiving '<em><b>Literal String</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String stringValue(LiteralString literalString) {
		return literalString.getValue();
	}

} // LiteralStringOperations