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
 * $Id: ConnectorKind.java,v 1.5 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package#getConnectorKind()
 * @model
 * @generated
 */
public final class ConnectorKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @see #DELEGATION_LITERAL
	 * @model name="delegation"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATION = 1;

	/**
	 * The '<em><b>Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assembly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY
	 * @generated
	 * @ordered
	 */
	public static final ConnectorKind ASSEMBLY_LITERAL = new ConnectorKind(ASSEMBLY, "assembly"); //$NON-NLS-1$

	/**
	 * The '<em><b>Delegation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delegation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATION
	 * @generated
	 * @ordered
	 */
	public static final ConnectorKind DELEGATION_LITERAL = new ConnectorKind(DELEGATION, "delegation"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Connector Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectorKind[] VALUES_ARRAY =
		new ConnectorKind[] {
			ASSEMBLY_LITERAL,
			DELEGATION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Connector Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connector Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorKind get(int value) {
		switch (value) {
			case ASSEMBLY: return ASSEMBLY_LITERAL;
			case DELEGATION: return DELEGATION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectorKind(int value, String name) {
		super(value, name);
	}

} //ConnectorKind
