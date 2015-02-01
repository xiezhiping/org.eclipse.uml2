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
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.LiteralInteger;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal Integer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralInteger#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralInteger#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralInteger#isComputable() <em>Is Computable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralIntegerOperations
		extends ValueSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralIntegerOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = (true)
	 * <p>From package UML::Values.</p>
	 * @param literalInteger The receiving '<em><b>Literal Integer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(LiteralInteger literalInteger) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query integerValue() gives the value.
	 * result = (value)
	 * <p>From package UML::Values.</p>
	 * @param literalInteger The receiving '<em><b>Literal Integer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int integerValue(LiteralInteger literalInteger) {
		return literalInteger.getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String stringValue(LiteralInteger literalInteger) {
		return String.valueOf(literalInteger.getValue());
	}

} // LiteralIntegerOperations