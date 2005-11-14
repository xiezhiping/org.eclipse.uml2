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
 * $Id: ExpansionKind.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expansion Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ExpansionKind is an enumeration type used to specify how multiple executions of an expansion region interact.
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getExpansionKind()
 * @model
 * @generated
 */
public final class ExpansionKind
		extends AbstractEnumerator {

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executions are independent. They may be executed concurrently.
	 * <!-- end-model-doc -->
	 * @see #PARALLEL_LITERAL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL = 0;

	/**
	 * The '<em><b>Iterative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executions are dependent and must be executed one at a time, in order of the collection elements.
	 * <!-- end-model-doc -->
	 * @see #ITERATIVE_LITERAL
	 * @model name="iterative"
	 * @generated
	 * @ordered
	 */
	public static final int ITERATIVE = 1;

	/**
	 * The '<em><b>Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stream of collection elements flows into a single execution, in order of the collection elements.
	 * <!-- end-model-doc -->
	 * @see #STREAM_LITERAL
	 * @model name="stream"
	 * @generated
	 * @ordered
	 */
	public static final int STREAM = 2;

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @generated
	 * @ordered
	 */
	public static final ExpansionKind PARALLEL_LITERAL = new ExpansionKind(
		PARALLEL, "parallel", "parallel"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Iterative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERATIVE
	 * @generated
	 * @ordered
	 */
	public static final ExpansionKind ITERATIVE_LITERAL = new ExpansionKind(
		ITERATIVE, "iterative", "iterative"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAM
	 * @generated
	 * @ordered
	 */
	public static final ExpansionKind STREAM_LITERAL = new ExpansionKind(
		STREAM, "stream", "stream"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Expansion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpansionKind[] VALUES_ARRAY = new ExpansionKind[]{
		PARALLEL_LITERAL, ITERATIVE_LITERAL, STREAM_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Expansion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
		.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expansion Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpansionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpansionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expansion Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpansionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpansionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expansion Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpansionKind get(int value) {
		switch (value) {
			case PARALLEL :
				return PARALLEL_LITERAL;
			case ITERATIVE :
				return ITERATIVE_LITERAL;
			case STREAM :
				return STREAM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExpansionKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ExpansionKind
