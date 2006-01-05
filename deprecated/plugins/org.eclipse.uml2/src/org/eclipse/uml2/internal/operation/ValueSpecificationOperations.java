/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ValueSpecificationOperations.java,v 1.5 2006/01/05 22:42:56 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Value Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#booleanValue() <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#unlimitedValue() <em>Unlimited Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.ValueSpecification#isNull() <em>Is Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSpecificationOperations extends NamedElementOperations {

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
	protected ValueSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComputable(ValueSpecification valueSpecification) {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * Set{}
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int integerValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * Set{}
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean booleanValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * Set{}
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String stringValue(ValueSpecification valueSpecification) {
		return EMPTY_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * Set{}
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int unlimitedValue(ValueSpecification valueSpecification) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isNull(ValueSpecification valueSpecification) {
		return false;
	}
} // ValueSpecificationOperations