/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCacheAdapterScope.java,v 1.2 2005/05/25 21:24:30 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gen Cache Adapter Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenCacheAdapterScope()
 * @model
 * @generated
 */
public final class GenCacheAdapterScope
		extends AbstractEnumerator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Global</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Global</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_LITERAL
	 * @model name="Global"
	 * @generated
	 * @ordered
	 */
	public static final int GLOBAL = 1;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_LITERAL
	 * @model name="Resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE = 2;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final GenCacheAdapterScope NONE_LITERAL = new GenCacheAdapterScope(
		NONE, "None"); //$NON-NLS-1$

	/**
	 * The '<em><b>Global</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL
	 * @generated
	 * @ordered
	 */
	public static final GenCacheAdapterScope GLOBAL_LITERAL = new GenCacheAdapterScope(
		GLOBAL, "Global"); //$NON-NLS-1$

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @generated
	 * @ordered
	 */
	public static final GenCacheAdapterScope RESOURCE_LITERAL = new GenCacheAdapterScope(
		RESOURCE, "Resource"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Gen Cache Adapter Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenCacheAdapterScope[] VALUES_ARRAY = new GenCacheAdapterScope[]{
		NONE_LITERAL, GLOBAL_LITERAL, RESOURCE_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Gen Cache Adapter Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
		.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gen Cache Adapter Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenCacheAdapterScope get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenCacheAdapterScope result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gen Cache Adapter Scope</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenCacheAdapterScope get(int value) {
		switch (value) {
			case NONE :
				return NONE_LITERAL;
			case GLOBAL :
				return GLOBAL_LITERAL;
			case RESOURCE :
				return RESOURCE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GenCacheAdapterScope(int value, String name) {
		super(value, name);
	}

} //GenCacheAdapterScope
