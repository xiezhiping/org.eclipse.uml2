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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeExpression is a ValueSpecification that represents a time value.
 * <p>From package UML::Values.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeExpression#getObservations <em>Observation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression
		extends ValueSpecification {

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that evaluates to the value of the TimeExpression.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression_Expr()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getExpr()
	 * @generated
	 */
	ValueSpecification createExpr(String name, Type type, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the Observations that are involved in the computation of the TimeExpression value.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression_Observation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Observation> getObservations();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a TimeExpression has no expr, then it must have a single observation that is a TimeObservation.
	 * expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(TimeObservation)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoExprRequiresObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TimeExpression
