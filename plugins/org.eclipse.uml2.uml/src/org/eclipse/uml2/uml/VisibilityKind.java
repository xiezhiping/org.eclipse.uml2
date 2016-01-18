/*
 * Copyright (c) 2006, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visibility Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * VisibilityKind is an enumeration type that defines literals to determine the visibility of Elements in a model.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getVisibilityKind()
 * @model
 * @generated
 */
public enum VisibilityKind
	implements Enumerator {
	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @generated
	 * @ordered
	 */
	PUBLIC_LITERAL(0, "public", "public"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @generated
	 * @ordered
	 */
	PRIVATE_LITERAL(1, "private", "private"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Protected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED
	 * @generated
	 * @ordered
	 */
	PROTECTED_LITERAL(2, "protected", "protected"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @generated
	 * @ordered
	 */
	PACKAGE_LITERAL(3, "package", "package"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Named Element with public visibility is visible to all elements that can access the contents of the Namespace that owns it.
	 * <!-- end-model-doc -->
	 * @see #PUBLIC_LITERAL
	 * @model name="public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC = 0;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A NamedElement with private visibility is only visible inside the Namespace that owns it.
	 * <!-- end-model-doc -->
	 * @see #PRIVATE_LITERAL
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE = 1;

	/**
	 * The '<em><b>Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A NamedElement with protected visibility is visible to Elements that have a generalization relationship to the Namespace that owns it.
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_LITERAL
	 * @model name="protected"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED = 2;

	/**
	 * The '<em><b>Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A NamedElement with package visibility is visible to all Elements within the nearest enclosing Package (given that other owning Elements have proper visibility). Outside the nearest enclosing Package, a NamedElement marked as having package visibility is not visible.  Only NamedElements that are not owned by Packages can be marked as having package visibility.
	 * <!-- end-model-doc -->
	 * @see #PACKAGE_LITERAL
	 * @model name="package"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE = 3;

	/**
	 * An array of all the '<em><b>Visibility Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VisibilityKind[] VALUES_ARRAY = new VisibilityKind[]{
		PUBLIC_LITERAL, PRIVATE_LITERAL, PROTECTED_LITERAL, PACKAGE_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Visibility Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VisibilityKind> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visibility Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityKind get(int value) {
		switch (value) {
			case PUBLIC :
				return PUBLIC_LITERAL;
			case PRIVATE :
				return PRIVATE_LITERAL;
			case PROTECTED :
				return PROTECTED_LITERAL;
			case PACKAGE :
				return PACKAGE_LITERAL;
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
	private VisibilityKind(int value, String name, String literal) {
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

} //VisibilityKind
