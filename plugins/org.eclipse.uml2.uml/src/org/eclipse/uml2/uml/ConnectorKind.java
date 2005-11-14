/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectorKind.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ConnectorKind is an enumeration of the following literal values:
 * ? assembly Indicates that the connector is an assembly connector.
 * ? delegation Indicates that the connector is a delegation connector.
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getConnectorKind()
 * @model
 * @generated
 */
public final class ConnectorKind
		extends AbstractEnumerator {

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
	 * The '<em><b>Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY
	 * @generated
	 * @ordered
	 */
	public static final ConnectorKind ASSEMBLY_LITERAL = new ConnectorKind(
		ASSEMBLY, "assembly", "assembly"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Delegation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATION
	 * @generated
	 * @ordered
	 */
	public static final ConnectorKind DELEGATION_LITERAL = new ConnectorKind(
		DELEGATION, "delegation", "delegation"); //$NON-NLS-1$ //$NON-NLS-2$

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
	public static final List VALUES = Collections.unmodifiableList(Arrays
		.asList(VALUES_ARRAY));

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
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectorKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConnectorKind
