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
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StringExpression is an Expression that specifies a String value that is derived by concatenating a sequence of operands with String values or a sequence of subExpressions, some of which might be template parameters.
 * <p>From package UML::Values.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#getSubExpressions <em>Sub Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression
		extends Expression, TemplateableElement {

	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.StringExpression}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StringExpression#getOwningExpression <em>Owning Expression</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpressions that constitute this StringExpression.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStringExpression_SubExpression()
	 * @see org.eclipse.uml2.uml.StringExpression#getOwningExpression
	 * @model opposite="owningExpression" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<StringExpression> getSubExpressions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.StringExpression}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.StringExpression}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.StringExpression}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.StringExpression}.
	 * @see #getSubExpressions()
	 * @generated
	 */
	StringExpression createSubExpression(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StringExpression} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StringExpression} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.StringExpression} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.StringExpression} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getSubExpressions()
	 * @generated
	 */
	StringExpression getSubExpression(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StringExpression} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StringExpression} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.StringExpression} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.StringExpression} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.StringExpression} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getSubExpressions()
	 * @generated
	 */
	StringExpression getSubExpression(String name, Type type,
			boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StringExpression#getSubExpressions <em>Sub Expression</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpression of which this StringExpression is a subExpression.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Expression</em>' container reference.
	 * @see #setOwningExpression(StringExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getStringExpression_OwningExpression()
	 * @see org.eclipse.uml2.uml.StringExpression#getSubExpressions
	 * @model opposite="subExpression" transient="false" ordered="false"
	 * @generated
	 */
	StringExpression getOwningExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.StringExpression#getOwningExpression <em>Owning Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Expression</em>' container reference.
	 * @see #getOwningExpression()
	 * @generated
	 */
	void setOwningExpression(StringExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the operands of a StringExpression must be LiteralStrings
	 * operand->forAll (oclIsKindOf (LiteralString))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOperands(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a StringExpression has sub-expressions, it cannot have operands and vice versa (this avoids the problem of having to define a collating sequence between operands and subexpressions).
	 * if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty() endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSubexpressions(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // StringExpression
