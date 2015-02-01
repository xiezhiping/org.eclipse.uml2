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

import org.eclipse.uml2.uml.LiteralNull;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal Null</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralNull#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralNull#isNull() <em>Is Null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralNullOperations
		extends ValueSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralNullOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = (true)
	 * <p>From package UML::Values.</p>
	 * @param literalNull The receiving '<em><b>Literal Null</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(LiteralNull literalNull) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNull() returns true.
	 * result = (true)
	 * <p>From package UML::Values.</p>
	 * @param literalNull The receiving '<em><b>Literal Null</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isNull(LiteralNull literalNull) {
		return true;
	}

} // LiteralNullOperations