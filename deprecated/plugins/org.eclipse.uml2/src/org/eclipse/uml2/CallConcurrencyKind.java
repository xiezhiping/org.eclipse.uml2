/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: CallConcurrencyKind.java,v 1.3 2004/06/03 02:59:17 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Call Concurrency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * CallConcurrencyKind is an enumeration with the following literals: • sequential No concurrency management mechanism is associated with the operation and, therefore, concurrency conflicts may occur. Instances that invoke a behavioral feature need to coordinate so that only one invocation to a target on any behavioral feature occurs at once. • guarded Multiple invocations of a behavioral feature may occur simultaneously to one instance, but only one is allowed to commence. The others are blocked until the performance of the first behavioral feature is complete. It is the responsibility of the system designer to ensure that deadlocks do not occur due to simultaneous blocks. • concurrent Multiple invocations of a behavioral feature may occur simultaneously to one instance and all of them may proceed concurrently. 
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.UML2Package#getCallConcurrencyKind()
 * @model
 * @generated
 */
public final class CallConcurrencyKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_LITERAL
	 * @model name="sequential"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL = 0;

	/**
	 * The '<em><b>Guarded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARDED_LITERAL
	 * @model name="guarded"
	 * @generated
	 * @ordered
	 */
	public static final int GUARDED = 1;

	/**
	 * The '<em><b>Concurrent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_LITERAL
	 * @model name="concurrent"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT = 2;

	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @generated
	 * @ordered
	 */
	public static final CallConcurrencyKind SEQUENTIAL_LITERAL = new CallConcurrencyKind(SEQUENTIAL, "sequential"); //$NON-NLS-1$

	/**
	 * The '<em><b>Guarded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guarded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARDED
	 * @generated
	 * @ordered
	 */
	public static final CallConcurrencyKind GUARDED_LITERAL = new CallConcurrencyKind(GUARDED, "guarded"); //$NON-NLS-1$

	/**
	 * The '<em><b>Concurrent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concurrent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT
	 * @generated
	 * @ordered
	 */
	public static final CallConcurrencyKind CONCURRENT_LITERAL = new CallConcurrencyKind(CONCURRENT, "concurrent"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CallConcurrencyKind[] VALUES_ARRAY =
		new CallConcurrencyKind[] {
			SEQUENTIAL_LITERAL,
			GUARDED_LITERAL,
			CONCURRENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallConcurrencyKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CallConcurrencyKind get(int value) {
		switch (value) {
			case SEQUENTIAL: return SEQUENTIAL_LITERAL;
			case GUARDED: return GUARDED_LITERAL;
			case CONCURRENT: return CONCURRENT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CallConcurrencyKind(int value, String name) {
		super(value, name);
	}

} //CallConcurrencyKind
