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
 * $Id: StringExpression.java,v 1.3 2005/12/14 22:34:16 khussey Exp $
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
 * StringExpression is a specialization of the general Expression metaclass which adds the ability to contain sub-expressions and whose operands are exclusively LiteralStrings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#getSubExpressions <em>Sub Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpressions that constitute this StringExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStringExpression_SubExpression()
	 * @see org.eclipse.uml2.uml.StringExpression#getOwningExpression
	 * @model type="org.eclipse.uml2.uml.StringExpression" opposite="owningExpression" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getSubExpressions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.StringExpression} and appends it to the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.StringExpression}.
	 * @see #getSubExpressions()
	 * @generated
	 */
	StringExpression createSubExpression();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.StringExpression} with the specified '<em><b>Name</b></em>' from the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StringExpression} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.StringExpression} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubExpressions()
	 * @generated
	 */
	StringExpression getSubExpression(String name);

	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StringExpression#getSubExpressions <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string expression of which this expression is a substring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Expression</em>' container reference.
	 * @see #setOwningExpression(StringExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getStringExpression_OwningExpression()
	 * @see org.eclipse.uml2.uml.StringExpression#getSubExpressions
	 * @model opposite="subExpression" resolveProxies="false" ordered="false"
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
	 * operand->forAll (op | op.oclIsKindOf (LiteralString))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOperands(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a StringExpression has sub-expressions, it cannot have operands and vice versa (this avoids the problem of having to
	 * define a collating sequence between operands and subexpressions).
	 * 
	 * if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSubexpressions(DiagnosticChain diagnostics, Map context);

} // StringExpression
