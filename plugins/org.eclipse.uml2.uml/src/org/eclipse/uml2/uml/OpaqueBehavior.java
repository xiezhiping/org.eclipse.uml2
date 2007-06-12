/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OpaqueBehavior.java,v 1.7 2007/06/12 12:53:17 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An behavior with implementation-specific semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueBehavior#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueBehavior#getLanguages <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueBehavior()
 * @model
 * @generated
 */
public interface OpaqueBehavior
		extends Behavior {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the behavior in one or more languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see #isSetBodies()
	 * @see #unsetBodies()
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueBehavior_Body()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.uml2.uml.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<String> getBodies();

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.OpaqueBehavior#getBodies <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBodies()
	 * @see #getBodies()
	 * @generated
	 */
	void unsetBodies();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.OpaqueBehavior#getBodies <em>Body</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' attribute list is set.
	 * @see #unsetBodies()
	 * @see #getBodies()
	 * @generated
	 */
	boolean isSetBodies();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Languages the body strings use in the same order as the body strings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see #isSetLanguages()
	 * @see #unsetLanguages()
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueBehavior_Language()
	 * @model unsettable="true" dataType="org.eclipse.uml2.uml.String"
	 * @generated
	 */
	EList<String> getLanguages();

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.OpaqueBehavior#getLanguages <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	void unsetLanguages();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.OpaqueBehavior#getLanguages <em>Language</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute list is set.
	 * @see #unsetLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	boolean isSetLanguages();

} // OpaqueBehavior
