/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 322715, 418466, 429994, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EnumerationLiteral is a user-defined data value for an Enumeration.
 * <p>From package UML::SimpleClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral
		extends InstanceSpecification {

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Enumeration#getOwnedLiterals <em>Owned Literal</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Enumeration that this EnumerationLiteral is a member of.
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see org.eclipse.uml2.uml.UMLPackage#getEnumerationLiteral_Enumeration()
	 * @see org.eclipse.uml2.uml.Enumeration#getOwnedLiterals
	 * @model opposite="ownedLiteral" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation of Enumeration::/classifier
	 * result = (enumeration)
	 * <p>From package UML::SimpleClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='classifier'"
	 * @generated
	 */
	Enumeration getClassifier();

} // EnumerationLiteral
