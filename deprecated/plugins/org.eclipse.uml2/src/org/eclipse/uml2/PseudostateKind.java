/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PseudostateKind.java,v 1.5 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pseudostate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package#getPseudostateKind()
 * @model
 * @generated
 */
public final class PseudostateKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_LITERAL
	 * @model name="initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL = 0;

	/**
	 * The '<em><b>Deep History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY_LITERAL
	 * @model name="deepHistory"
	 * @generated
	 * @ordered
	 */
	public static final int DEEP_HISTORY = 1;

	/**
	 * The '<em><b>Shallow History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHALLOW_HISTORY_LITERAL
	 * @model name="shallowHistory"
	 * @generated
	 * @ordered
	 */
	public static final int SHALLOW_HISTORY = 2;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_LITERAL
	 * @model name="join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN = 3;

	/**
	 * The '<em><b>Fork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK_LITERAL
	 * @model name="fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK = 4;

	/**
	 * The '<em><b>Junction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNCTION_LITERAL
	 * @model name="junction"
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION = 5;

	/**
	 * The '<em><b>Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE_LITERAL
	 * @model name="choice"
	 * @generated
	 * @ordered
	 */
	public static final int CHOICE = 6;

	/**
	 * The '<em><b>Entry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT_LITERAL
	 * @model name="entryPoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_POINT = 7;

	/**
	 * The '<em><b>Exit Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT_LITERAL
	 * @model name="exitPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_POINT = 8;

	/**
	 * The '<em><b>Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE_LITERAL
	 * @model name="terminate"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATE = 9;

	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind INITIAL_LITERAL = new PseudostateKind(INITIAL, "initial"); //$NON-NLS-1$

	/**
	 * The '<em><b>Deep History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deep History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind DEEP_HISTORY_LITERAL = new PseudostateKind(DEEP_HISTORY, "deepHistory"); //$NON-NLS-1$

	/**
	 * The '<em><b>Shallow History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shallow History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHALLOW_HISTORY
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind SHALLOW_HISTORY_LITERAL = new PseudostateKind(SHALLOW_HISTORY, "shallowHistory"); //$NON-NLS-1$

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind JOIN_LITERAL = new PseudostateKind(JOIN, "join"); //$NON-NLS-1$

	/**
	 * The '<em><b>Fork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fork</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind FORK_LITERAL = new PseudostateKind(FORK, "fork"); //$NON-NLS-1$

	/**
	 * The '<em><b>Junction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Junction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUNCTION
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind JUNCTION_LITERAL = new PseudostateKind(JUNCTION, "junction"); //$NON-NLS-1$

	/**
	 * The '<em><b>Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Choice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOICE
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind CHOICE_LITERAL = new PseudostateKind(CHOICE, "choice"); //$NON-NLS-1$

	/**
	 * The '<em><b>Entry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entry Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind ENTRY_POINT_LITERAL = new PseudostateKind(ENTRY_POINT, "entryPoint"); //$NON-NLS-1$

	/**
	 * The '<em><b>Exit Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exit Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind EXIT_POINT_LITERAL = new PseudostateKind(EXIT_POINT, "exitPoint"); //$NON-NLS-1$

	/**
	 * The '<em><b>Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINATE
	 * @generated
	 * @ordered
	 */
	public static final PseudostateKind TERMINATE_LITERAL = new PseudostateKind(TERMINATE, "terminate"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Pseudostate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PseudostateKind[] VALUES_ARRAY =
		new PseudostateKind[] {
			INITIAL_LITERAL,
			DEEP_HISTORY_LITERAL,
			SHALLOW_HISTORY_LITERAL,
			JOIN_LITERAL,
			FORK_LITERAL,
			JUNCTION_LITERAL,
			CHOICE_LITERAL,
			ENTRY_POINT_LITERAL,
			EXIT_POINT_LITERAL,
			TERMINATE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pseudostate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PseudostateKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudostateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudostate Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PseudostateKind get(int value) {
		switch (value) {
			case INITIAL: return INITIAL_LITERAL;
			case DEEP_HISTORY: return DEEP_HISTORY_LITERAL;
			case SHALLOW_HISTORY: return SHALLOW_HISTORY_LITERAL;
			case JOIN: return JOIN_LITERAL;
			case FORK: return FORK_LITERAL;
			case JUNCTION: return JUNCTION_LITERAL;
			case CHOICE: return CHOICE_LITERAL;
			case ENTRY_POINT: return ENTRY_POINT_LITERAL;
			case EXIT_POINT: return EXIT_POINT_LITERAL;
			case TERMINATE: return TERMINATE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PseudostateKind(int value, String name) {
		super(value, name);
	}

} //PseudostateKind
