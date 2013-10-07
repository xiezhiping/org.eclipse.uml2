/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An opaque expression is an uninterpreted textual statement that denotes a (possibly empty) set of values when evaluated in a context.
 * Provides a mechanism for precisely defining the behavior of an opaque expression. An opaque expression is defined by a behavior restricted to return one result.
 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueExpression#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueExpression()
 * @model
 * @generated
 */
public interface OpaqueExpression
		extends ValueSpecification {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text of the expression, possibly in multiple languages.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
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
	 * Specifies the languages in which the expression is stated. The interpretation of the expression body depends on the languages. If the languages are unspecified, they might be implicit from the expression body or the context. Languages are matched to body strings by order.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
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
	 * Restricts an opaque expression to return exactly one return result. When the invocation of the opaque expression completes, a single set of values is returned to its owner. This association is derived from the single return result parameter of the associated behavior.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
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
	 * Specifies the behavior of the opaque expression.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
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
	 * language->notEmpty() implies (body->size() = language->size())
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
	 * self.behavior.notEmpty() implies
	 *   self.behavior.ownedParameters->select(p | p.direction<>#return)->isEmpty()
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
	 * self.behavior.notEmpty() implies
	 *   self.behavior.ownedParameter->select(p | p.direction=#return)->size() = 1
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
	 * true
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int value();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isIntegral() tells whether an expression is intended to produce an integer.
	 * result = false
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
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
	 * result = false
	 * self.isIntegral()
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
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
	 * result = false
	 * self.isIntegral()
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNonNegative();

} // OpaqueExpression
