/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ParameterEffectKind.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Effect Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package#getParameterEffectKind()
 * @model
 * @generated
 */
public final class ParameterEffectKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_LITERAL
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE = 0;

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_LITERAL
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ = 1;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_LITERAL
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE = 2;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_LITERAL
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE = 3;

	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind CREATE_LITERAL = new ParameterEffectKind(CREATE, "create"); //$NON-NLS-1$

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind READ_LITERAL = new ParameterEffectKind(READ, "read"); //$NON-NLS-1$

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind UPDATE_LITERAL = new ParameterEffectKind(UPDATE, "update"); //$NON-NLS-1$

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind DELETE_LITERAL = new ParameterEffectKind(DELETE, "delete"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterEffectKind[] VALUES_ARRAY =
		new ParameterEffectKind[] {
			CREATE_LITERAL,
			READ_LITERAL,
			UPDATE_LITERAL,
			DELETE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterEffectKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterEffectKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterEffectKind get(int value) {
		switch (value) {
			case CREATE: return CREATE_LITERAL;
			case READ: return READ_LITERAL;
			case UPDATE: return UPDATE_LITERAL;
			case DELETE: return DELETE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterEffectKind(int value, String name) {
		super(value, name);
	}

} //ParameterEffectKind
