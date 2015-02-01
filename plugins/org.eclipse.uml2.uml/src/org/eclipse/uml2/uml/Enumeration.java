/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Enumeration is a DataType whose values are enumerated in the model as EnumerationLiterals.
 * <p>From package UML::SimpleClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Enumeration#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of literals owned by this Enumeration.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getEnumeration_OwnedLiteral()
	 * @see org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiterals();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.EnumerationLiteral}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.EnumerationLiteral}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * @see #getOwnedLiterals()
	 * @generated
	 */
	EnumerationLiteral createOwnedLiteral(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedLiterals()
	 * @generated
	 */
	EnumerationLiteral getOwnedLiteral(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.EnumerationLiteral} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedLiterals()
	 * @generated
	 */
	EnumerationLiteral getOwnedLiteral(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ownedAttribute->forAll(isReadOnly)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateImmutable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Enumeration
