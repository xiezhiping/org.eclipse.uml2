/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package#getAggregationKind()
 * @model
 * @generated
 */
public final class AggregationKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Shared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_LITERAL
	 * @model name="shared"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED = 1;

	/**
	 * The '<em><b>Composite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE_LITERAL
	 * @model name="composite"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE = 2;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final AggregationKind NONE_LITERAL = new AggregationKind(NONE, "none"); //$NON-NLS-1$

	/**
	 * The '<em><b>Shared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shared</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHARED
	 * @generated
	 * @ordered
	 */
	public static final AggregationKind SHARED_LITERAL = new AggregationKind(SHARED, "shared"); //$NON-NLS-1$

	/**
	 * The '<em><b>Composite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE
	 * @generated
	 * @ordered
	 */
	public static final AggregationKind COMPOSITE_LITERAL = new AggregationKind(COMPOSITE, "composite"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Aggregation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregationKind[] VALUES_ARRAY =
		new AggregationKind[] {
			NONE_LITERAL,
			SHARED_LITERAL,
			COMPOSITE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregationKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregationKind get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case SHARED: return SHARED_LITERAL;
			case COMPOSITE: return COMPOSITE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AggregationKind(int value, String name) {
		super(value, name);
	}

} //AggregationKind
