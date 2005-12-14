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
 * $Id: Enumeration.java,v 1.2 2005/12/14 22:34:15 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enumeration is a kind of data type, whose instances may be any of a number of predefined enumeration literals.
 * 
 * It is possible to extend the set of applicable enumeration literals in other packages or profiles.
 * 
 * 
 * Enumeration is a kind of data type, whose instances may be any of a number of user-defined enumeration literals.
 * 
 * It is possible to extend the set of applicable enumeration literals in other packages or profiles.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Enumeration#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration
		extends DataType {

	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered collection of literals for the enumeration.
	 * The ordered set of literals for this Enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getEnumeration_OwnedLiteral()
	 * @see org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration
	 * @model type="org.eclipse.uml2.uml.EnumerationLiteral" opposite="enumeration" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getOwnedLiterals();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.EnumerationLiteral} and appends it to the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * @see #getOwnedLiterals()
	 * @generated
	 */
	EnumerationLiteral createOwnedLiteral();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedLiterals()
	 * @generated
	 */
	EnumerationLiteral getOwnedLiteral(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EnumerationLiteral createOwnedLiteral(String name);

} // Enumeration
