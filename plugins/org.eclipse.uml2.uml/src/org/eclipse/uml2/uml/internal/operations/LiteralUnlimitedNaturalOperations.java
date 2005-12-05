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
 * $Id: LiteralUnlimitedNaturalOperations.java,v 1.4 2005/12/05 18:00:18 khussey Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralUnlimitedNatural#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralUnlimitedNatural#unlimitedValue() <em>Unlimited Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class LiteralUnlimitedNaturalOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralUnlimitedNaturalOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = true
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
	 * result = value
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
	 * @generated
	 */
	public static String stringValue(
			LiteralUnlimitedNatural literalUnlimitedNatural) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // LiteralUnlimitedNaturalOperations