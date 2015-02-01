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

import org.eclipse.uml2.uml.LiteralReal;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal Real</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralReal#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralReal#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LiteralReal#realValue() <em>Real Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralRealOperations
		extends ValueSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralRealOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String stringValue(LiteralReal literalReal) {
		return String.valueOf(literalReal.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() is redefined to be true.
	 * result = (true)
	 * <p>From package UML::Values.</p>
	 * @param literalReal The receiving '<em><b>Literal Real</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(LiteralReal literalReal) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query realValue() gives the value.
	 * result = (value)
	 * <p>From package UML::Values.</p>
	 * @param literalReal The receiving '<em><b>Literal Real</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static double realValue(LiteralReal literalReal) {
		return literalReal.getValue();
	}

} // LiteralRealOperations