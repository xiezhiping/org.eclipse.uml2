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
 * $Id: ParameterDirectionKind.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Direction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ParameterDirectionKind is an enumeration of the following literal values: • in Indicates that parameter values are passed into the behavioral element by the caller. • inout Indicates that parameter values are passed into a behavioral element by the caller and then back out to the caller from the behavioral element. • out Indicates that parameter values are passed from a behavioral element out to the caller. • return Indicates that parameter values are passed as return values from a behavioral element back to the caller. 
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.UML2Package#getParameterDirectionKind()
 * @model
 * @generated
 */
public final class ParameterDirectionKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LITERAL
	 * @model name="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN = 0;

	/**
	 * The '<em><b>Inout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INOUT_LITERAL
	 * @model name="inout"
	 * @generated
	 * @ordered
	 */
	public static final int INOUT = 1;

	/**
	 * The '<em><b>Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_LITERAL
	 * @model name="out"
	 * @generated
	 * @ordered
	 */
	public static final int OUT = 2;

	/**
	 * The '<em><b>Return</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_LITERAL
	 * @model name="return"
	 * @generated
	 * @ordered
	 */
	public static final int RETURN = 3;

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @generated
	 * @ordered
	 */
	public static final ParameterDirectionKind IN_LITERAL = new ParameterDirectionKind(IN, "in"); //$NON-NLS-1$

	/**
	 * The '<em><b>Inout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INOUT
	 * @generated
	 * @ordered
	 */
	public static final ParameterDirectionKind INOUT_LITERAL = new ParameterDirectionKind(INOUT, "inout"); //$NON-NLS-1$

	/**
	 * The '<em><b>Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT
	 * @generated
	 * @ordered
	 */
	public static final ParameterDirectionKind OUT_LITERAL = new ParameterDirectionKind(OUT, "out"); //$NON-NLS-1$

	/**
	 * The '<em><b>Return</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Return</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETURN
	 * @generated
	 * @ordered
	 */
	public static final ParameterDirectionKind RETURN_LITERAL = new ParameterDirectionKind(RETURN, "return"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Parameter Direction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterDirectionKind[] VALUES_ARRAY =
		new ParameterDirectionKind[] {
			IN_LITERAL,
			INOUT_LITERAL,
			OUT_LITERAL,
			RETURN_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Direction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Direction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterDirectionKind get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterDirectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Direction Kind</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterDirectionKind get(int value) {
		switch (value) {
			case IN: return IN_LITERAL;
			case INOUT: return INOUT_LITERAL;
			case OUT: return OUT_LITERAL;
			case RETURN: return RETURN_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterDirectionKind(int value, String name) {
		super(value, name);
	}

} //ParameterDirectionKind
