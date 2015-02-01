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

import org.eclipse.uml2.uml.LiteralUnlimitedNatural;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal Unlimited Natural</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralUnlimitedNatural#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralUnlimitedNatural#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralUnlimitedNatural#unlimitedValue() <em>Unlimited Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralUnlimitedNaturalOperations
		extends ValueSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralUnlimitedNaturalOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = (true)
	 * <p>From package UML::Values.</p>
	 * @param literalUnlimitedNatural The receiving '<em><b>Literal Unlimited Natural</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(
			LiteralUnlimitedNatural literalUnlimitedNatural) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query unlimitedValue() gives the value.
	 * result = (value)
	 * <p>From package UML::Values.</p>
	 * @param literalUnlimitedNatural The receiving '<em><b>Literal Unlimited Natural</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int unlimitedValue(
			LiteralUnlimitedNatural literalUnlimitedNatural) {
		return literalUnlimitedNatural.getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String stringValue(
			LiteralUnlimitedNatural literalUnlimitedNatural) {
		int value = literalUnlimitedNatural.getValue();
		return value == LiteralUnlimitedNatural.UNLIMITED
			? "*" //$NON-NLS-1$
			: String.valueOf(literalUnlimitedNatural.getValue());
	}

} // LiteralUnlimitedNaturalOperations