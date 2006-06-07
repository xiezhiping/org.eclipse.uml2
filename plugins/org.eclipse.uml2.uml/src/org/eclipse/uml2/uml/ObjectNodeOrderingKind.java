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
 * $Id: ObjectNodeOrderingKind.java,v 1.2 2006/06/07 21:39:13 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Node Ordering Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ObjectNodeOrderingKind is an enumeration indicating queuing order within a node.
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNodeOrderingKind()
 * @model
 * @generated
 */
public final class ObjectNodeOrderingKind
		extends AbstractEnumerator {

	/**
	 * The '<em><b>Unordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that object node tokens are unordered.
	 * <!-- end-model-doc -->
	 * @see #UNORDERED_LITERAL
	 * @model name="unordered"
	 * @generated
	 * @ordered
	 */
	public static final int UNORDERED = 0;

	/**
	 * The '<em><b>Ordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that object node tokens are ordered.
	 * <!-- end-model-doc -->
	 * @see #ORDERED_LITERAL
	 * @model name="ordered"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED = 1;

	/**
	 * The '<em><b>LIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that object node tokens are queued in a last in, first out manner.
	 * <!-- end-model-doc -->
	 * @see #LIFO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIFO = 2;

	/**
	 * The '<em><b>FIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that object node tokens are queued in a first in, first out manner.
	 * <!-- end-model-doc -->
	 * @see #FIFO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO = 3;

	/**
	 * The '<em><b>Unordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNORDERED
	 * @generated
	 * @ordered
	 */
	public static final ObjectNodeOrderingKind UNORDERED_LITERAL = new ObjectNodeOrderingKind(
		UNORDERED, "unordered", "unordered"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED
	 * @generated
	 * @ordered
	 */
	public static final ObjectNodeOrderingKind ORDERED_LITERAL = new ObjectNodeOrderingKind(
		ORDERED, "ordered", "ordered"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>LIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFO
	 * @generated
	 * @ordered
	 */
	public static final ObjectNodeOrderingKind LIFO_LITERAL = new ObjectNodeOrderingKind(
		LIFO, "LIFO", "LIFO"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @generated
	 * @ordered
	 */
	public static final ObjectNodeOrderingKind FIFO_LITERAL = new ObjectNodeOrderingKind(
		FIFO, "FIFO", "FIFO"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Object Node Ordering Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectNodeOrderingKind[] VALUES_ARRAY = new ObjectNodeOrderingKind[]{
		UNORDERED_LITERAL, ORDERED_LITERAL, LIFO_LITERAL, FIFO_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Object Node Ordering Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
		.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectNodeOrderingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectNodeOrderingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectNodeOrderingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectNodeOrderingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectNodeOrderingKind get(int value) {
		switch (value) {
			case UNORDERED :
				return UNORDERED_LITERAL;
			case ORDERED :
				return ORDERED_LITERAL;
			case LIFO :
				return LIFO_LITERAL;
			case FIFO :
				return FIFO_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectNodeOrderingKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ObjectNodeOrderingKind
