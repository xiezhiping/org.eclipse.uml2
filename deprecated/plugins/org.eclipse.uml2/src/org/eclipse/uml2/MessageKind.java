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
 * $Id: MessageKind.java,v 1.5 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package#getMessageKind()
 * @model
 * @generated
 */
public final class MessageKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_LITERAL
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE = 0;

	/**
	 * The '<em><b>Lost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOST_LITERAL
	 * @model name="lost"
	 * @generated
	 * @ordered
	 */
	public static final int LOST = 1;

	/**
	 * The '<em><b>Found</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUND_LITERAL
	 * @model name="found"
	 * @generated
	 * @ordered
	 */
	public static final int FOUND = 2;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_LITERAL
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN = 3;

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @generated
	 * @ordered
	 */
	public static final MessageKind COMPLETE_LITERAL = new MessageKind(COMPLETE, "complete"); //$NON-NLS-1$

	/**
	 * The '<em><b>Lost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lost</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOST
	 * @generated
	 * @ordered
	 */
	public static final MessageKind LOST_LITERAL = new MessageKind(LOST, "lost"); //$NON-NLS-1$

	/**
	 * The '<em><b>Found</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Found</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOUND
	 * @generated
	 * @ordered
	 */
	public static final MessageKind FOUND_LITERAL = new MessageKind(FOUND, "found"); //$NON-NLS-1$

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @generated
	 * @ordered
	 */
	public static final MessageKind UNKNOWN_LITERAL = new MessageKind(UNKNOWN, "unknown"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Message Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageKind[] VALUES_ARRAY =
		new MessageKind[] {
			COMPLETE_LITERAL,
			LOST_LITERAL,
			FOUND_LITERAL,
			UNKNOWN_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageKind get(int value) {
		switch (value) {
			case COMPLETE: return COMPLETE_LITERAL;
			case LOST: return LOST_LITERAL;
			case FOUND: return FOUND_LITERAL;
			case UNKNOWN: return UNKNOWN_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageKind(int value, String name) {
		super(value, name);
	}

} //MessageKind
