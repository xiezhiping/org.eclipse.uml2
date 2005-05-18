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
 * $Id: LiteralNullOperations.java,v 1.4 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralNull;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Literal Null</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LiteralNull#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.LiteralNull#isNull() <em>Is Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class LiteralNullOperations extends UML2Operations {

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
	private LiteralNullOperations() {
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
	public static boolean isNull(LiteralNull literalNull) {
		return true;
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
	public static boolean isComputable(LiteralNull literalNull) {
		return true;
	}
} // LiteralNullOperations