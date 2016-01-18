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
 * A representation of the literals of the enumeration '<em><b>Call Concurrency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * CallConcurrencyKind is an Enumeration used to specify the semantics of concurrent calls to a BehavioralFeature.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getCallConcurrencyKind()
 * @model
 * @generated
 */
public enum CallConcurrencyKind
	implements Enumerator {
	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @generated
	 * @ordered
	 */
	SEQUENTIAL_LITERAL(0, "sequential", "sequential"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Guarded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARDED
	 * @generated
	 * @ordered
	 */
	GUARDED_LITERAL(1, "guarded", "guarded"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Concurrent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT
	 * @generated
	 * @ordered
	 */
	CONCURRENT_LITERAL(2, "concurrent", "concurrent"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No concurrency management mechanism is associated with the BehavioralFeature and, therefore, concurrency conflicts may occur. Instances that invoke a BehavioralFeature need to coordinate so that only one invocation to a target on any BehavioralFeature occurs at once.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Multiple invocations of a BehavioralFeature that overlap in time may occur to one instance, but only one is allowed to commence. The others are blocked until the performance of the currently executing BehavioralFeature is complete. It is the responsibility of the system designer to ensure that deadlocks do not occur due to simultaneous blocking.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Multiple invocations of a BehavioralFeature that overlap in time may occur to one instance and all of them may proceed concurrently.
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_LITERAL
	 * @model name="concurrent"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT = 2;

	/**
	 * An array of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CallConcurrencyKind[] VALUES_ARRAY = new CallConcurrencyKind[]{
		SEQUENTIAL_LITERAL, GUARDED_LITERAL, CONCURRENT_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CallConcurrencyKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallConcurrencyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallConcurrencyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallConcurrencyKind get(int value) {
		switch (value) {
			case SEQUENTIAL :
				return SEQUENTIAL_LITERAL;
			case GUARDED :
				return GUARDED_LITERAL;
			case CONCURRENT :
				return CONCURRENT_LITERAL;
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
	private CallConcurrencyKind(int value, String name, String literal) {
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

} //CallConcurrencyKind
