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
 * $Id: MessageSort.java,v 1.4 2005/04/04 20:11:14 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Sort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package#getMessageSort()
 * @model
 * @generated
 */
public final class MessageSort extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Synch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCH_CALL_LITERAL
	 * @model name="synchCall"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_CALL = 0;

	/**
	 * The '<em><b>Synch Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCH_SIGNAL_LITERAL
	 * @model name="synchSignal"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_SIGNAL = 1;

	/**
	 * The '<em><b>Asynch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_CALL_LITERAL
	 * @model name="asynchCall"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_CALL = 2;

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_SIGNAL_LITERAL
	 * @model name="asynchSignal"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_SIGNAL = 3;

	/**
	 * The '<em><b>Synch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synch Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCH_CALL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort SYNCH_CALL_LITERAL = new MessageSort(SYNCH_CALL, "synchCall"); //$NON-NLS-1$

	/**
	 * The '<em><b>Synch Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synch Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCH_SIGNAL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort SYNCH_SIGNAL_LITERAL = new MessageSort(SYNCH_SIGNAL, "synchSignal"); //$NON-NLS-1$

	/**
	 * The '<em><b>Asynch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynch Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_CALL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort ASYNCH_CALL_LITERAL = new MessageSort(ASYNCH_CALL, "asynchCall"); //$NON-NLS-1$

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynch Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_SIGNAL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort ASYNCH_SIGNAL_LITERAL = new MessageSort(ASYNCH_SIGNAL, "asynchSignal"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSort[] VALUES_ARRAY =
		new MessageSort[] {
			SYNCH_CALL_LITERAL,
			SYNCH_SIGNAL_LITERAL,
			ASYNCH_CALL_LITERAL,
			ASYNCH_SIGNAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort get(int value) {
		switch (value) {
			case SYNCH_CALL: return SYNCH_CALL_LITERAL;
			case SYNCH_SIGNAL: return SYNCH_SIGNAL_LITERAL;
			case ASYNCH_CALL: return ASYNCH_CALL_LITERAL;
			case ASYNCH_SIGNAL: return ASYNCH_SIGNAL_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageSort(int value, String name) {
		super(value, name);
	}

} //MessageSort
