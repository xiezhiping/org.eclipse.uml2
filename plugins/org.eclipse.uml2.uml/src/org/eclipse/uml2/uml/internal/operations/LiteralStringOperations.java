/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LiteralStringOperations.java,v 1.4 2006/01/05 22:43:26 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.LiteralString;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal String</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralString#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralString#stringValue() <em>String Value</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = true
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
	 * result = value
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String stringValue(LiteralString literalString) {
		return literalString.getValue();
	}

} // LiteralStringOperations