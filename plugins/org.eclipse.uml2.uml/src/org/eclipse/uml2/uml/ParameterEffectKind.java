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
 * A representation of the literals of the enumeration '<em><b>Parameter Effect Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ParameterEffectKind is an Enumeration that indicates the effect of a Behavior on values passed in or out of its parameters.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getParameterEffectKind()
 * @model
 * @generated
 */
public enum ParameterEffectKind
	implements Enumerator {
	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @generated
	 * @ordered
	 */
	CREATE_LITERAL(0, "create", "create"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @generated
	 * @ordered
	 */
	READ_LITERAL(1, "read", "read"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @generated
	 * @ordered
	 */
	UPDATE_LITERAL(2, "update", "update"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @generated
	 * @ordered
	 */
	DELETE_LITERAL(3, "delete", "delete"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavior creates values.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Indicates objects that are values of the parameter have values of their properties, or links in which they participate, or their classifiers retrieved during executions of the behavior.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Indicates objects that are values of the parameter have values of their properties, or links in which they participate, or their classification changed during executions of the behavior.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Indicates objects that are values of the parameter do not exist after executions of the behavior are finished.
	 * <!-- end-model-doc -->
	 * @see #DELETE_LITERAL
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE = 3;

	/**
	 * An array of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterEffectKind[] VALUES_ARRAY = new ParameterEffectKind[]{
		CREATE_LITERAL, READ_LITERAL, UPDATE_LITERAL, DELETE_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterEffectKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterEffectKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterEffectKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterEffectKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterEffectKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterEffectKind get(int value) {
		switch (value) {
			case CREATE :
				return CREATE_LITERAL;
			case READ :
				return READ_LITERAL;
			case UPDATE :
				return UPDATE_LITERAL;
			case DELETE :
				return DELETE_LITERAL;
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
	private ParameterEffectKind(int value, String name, String literal) {
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

} //ParameterEffectKind
