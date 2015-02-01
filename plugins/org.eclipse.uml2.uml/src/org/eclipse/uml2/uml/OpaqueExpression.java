/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * @extends BodyOwner
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OpaqueExpression is a ValueSpecification that specifies the computation of a collection of values either in terms of a UML Behavior or based on a textual statement in a language other than UML
 * <p>From package UML::Values.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueExpression()
 * @model
 * @generated
 */
public interface OpaqueExpression
		extends ValueSpecification, BodyOwner {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual definition of the behavior of the OpaqueExpression, possibly in multiple languages.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see #isSetBodies()
	 * @see #unsetBodies()
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueExpression_Body()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.uml2.types.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<String> getBodies();

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.OpaqueExpression#getBodies <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBodies()
	 * @see #getBodies()
	 * @generated
	 */
	void unsetBodies();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.OpaqueExpression#getBodies <em>Body</em>}' attribute list is set.
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
	 * Specifies the languages used to express the textual bodies of the OpaqueExpression.  Languages are matched to body Strings by order. The interpretation of the body depends on the languages. If the languages are unspecified, they may be implicit from the expression body or the context.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see #isSetLanguages()
	 * @see #unsetLanguages()
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueExpression_Language()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	EList<String> getLanguages();

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.OpaqueExpression#getLanguages <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	void unsetLanguages();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.OpaqueExpression#getLanguages <em>Language</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute list is set.
	 * @see #unsetLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	boolean isSetLanguages();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an OpaqueExpression is specified using a UML Behavior, then this refers to the single required return Parameter of that Behavior. When the Behavior completes execution, the values on this Parameter give the result of evaluating the OpaqueExpression.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueExpression_Result()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Parameter getResult();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the behavior of the OpaqueExpression as a UML Behavior.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueExpression_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.OpaqueExpression#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the language attribute is not empty, then the size of the body and language arrays must be the same.
	 * language->notEmpty() implies (_'body'->size() = language->size())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateLanguageBodySize(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior may only have return result parameters.
	 * behavior <> null implies behavior.ownedParameter->select(direction<>ParameterDirectionKind::return)->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOnlyReturnResultParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior must have exactly one return result parameter.
	 * behavior <> null implies
	 *    behavior.ownedParameter->select(direction=ParameterDirectionKind::return)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneReturnResultParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query value() gives an integer value for an expression intended to produce one.
	 * self.isIntegral()
	 * result = (0)
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int value();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isIntegral() tells whether an expression is intended to produce an Integer.
	 * result = (false)
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIntegral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isPositive() tells whether an integer expression has a positive value.
	 * result = (false)
	 * self.isIntegral()
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPositive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNonNegative() tells whether an integer expression has a non-negative value.
	 * self.isIntegral()
	 * result = (false)
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNonNegative();

} // OpaqueExpression
