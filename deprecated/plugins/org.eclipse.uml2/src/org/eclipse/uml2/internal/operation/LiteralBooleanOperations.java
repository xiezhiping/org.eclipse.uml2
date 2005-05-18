/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LiteralBooleanOperations.java,v 1.4 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralBoolean;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal Boolean</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LiteralBoolean#booleanValue() <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.LiteralBoolean#isComputable() <em>Is Computable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class LiteralBooleanOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralBooleanOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * true
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(LiteralBoolean literalBoolean) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * value
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean booleanValue(LiteralBoolean literalBoolean) {
		return literalBoolean.isValue();
	}
} // LiteralBooleanOperations