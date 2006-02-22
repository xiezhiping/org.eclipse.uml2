/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TimeExpression.java,v 1.4 2006/02/22 20:48:15 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeExpression defines a value specification that represents a time value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeExpression#getObservations <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression
		extends ValueSpecification {

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the time expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr</em>' reference.
	 * @see #setExpr(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression_Expr()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSpecification getExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeExpression#getExpr <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the time and duration observations that are involved in expr.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression_Observation()
	 * @model type="org.eclipse.uml2.uml.Observation" ordered="false"
	 * @generated
	 */
	EList getObservations();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Observation} with the specified '<em><b>Name</b></em>' from the '<em><b>Observation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Observation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Observation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getObservations()
	 * @generated
	 */
	Observation getObservation(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Observation} with the specified '<em><b>Name</b></em>' from the '<em><b>Observation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Observation} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Observation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Observation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getObservations()
	 * @generated
	 */
	Observation getObservation(String name, boolean ignoreCase, EClass eClass);

} // TimeExpression
