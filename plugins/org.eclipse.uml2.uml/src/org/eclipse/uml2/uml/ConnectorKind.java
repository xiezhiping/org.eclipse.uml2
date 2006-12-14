/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectorKind.java,v 1.4 2006/12/14 15:49:28 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ConnectorKind is an enumeration type.
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getConnectorKind()
 * @model
 * @generated
 */
public enum ConnectorKind
		implements Enumerator {
	/**
	 * The '<em><b>Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY
	 * @generated
	 * @ordered
	 */
	ASSEMBLY_LITERAL(0, "assembly", "assembly"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Delegation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATION
	 * @generated
	 * @ordered
	 */
	DELEGATION_LITERAL(1, "delegation", "delegation"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the connector is an assembly connector.
	 * <!-- end-model-doc -->
	 * @see #ASSEMBLY_LITERAL
	 * @model name="assembly"
	 * @generated
	 * @ordered
	 */
	public static final int ASSEMBLY = 0;

	/**
	 * The '<em><b>Delegation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the connector is a delegation connector.
	 * <!-- end-model-doc -->
	 * @see #DELEGATION_LITERAL
	 * @model name="delegation"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATION = 1;

	/**
	 * An array of all the '<em><b>Connector Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectorKind[] VALUES_ARRAY = new ConnectorKind[]{
		ASSEMBLY_LITERAL, DELEGATION_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Connector Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectorKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connector Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorKind get(int value) {
		switch (value) {
			case ASSEMBLY :
				return ASSEMBLY_LITERAL;
			case DELEGATION :
				return DELEGATION_LITERAL;
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
	private ConnectorKind(int value, String name, String literal) {
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

} //ConnectorKind
