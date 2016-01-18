/*
 * Copyright (c) 2006, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Node Ordering Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ObjectNodeOrderingKind is an enumeration indicating queuing order for offering the tokens held by an ObjectNode.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNodeOrderingKind()
 * @model
 * @generated
 */
public enum ObjectNodeOrderingKind
	implements Enumerator {
	/**
	 * The '<em><b>Unordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNORDERED
	 * @generated
	 * @ordered
	 */
	UNORDERED_LITERAL(0, "unordered", "unordered"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED
	 * @generated
	 * @ordered
	 */
	ORDERED_LITERAL(1, "ordered", "ordered"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>LIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFO
	 * @generated
	 * @ordered
	 */
	LIFO_LITERAL(2, "LIFO", "LIFO"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @generated
	 * @ordered
	 */
	FIFO_LITERAL(3, "FIFO", "FIFO"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Unordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that tokens are unordered.
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
	 * Indicates that tokens are ordered.
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
	 * Indicates that tokens are queued in a last in, first out manner.
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
	 * Indicates that tokens are queued in a first in, first out manner.
	 * <!-- end-model-doc -->
	 * @see #FIFO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO = 3;

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
	public static final List<ObjectNodeOrderingKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
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
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
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
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectNodeOrderingKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ObjectNodeOrderingKind
