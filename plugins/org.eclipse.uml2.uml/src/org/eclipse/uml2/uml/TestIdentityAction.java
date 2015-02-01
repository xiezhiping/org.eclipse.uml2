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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TestIdentityAction is an Action that tests if two values are identical objects.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction()
 * @model
 * @generated
 */
public interface TestIdentityAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin on which the first input object is placed.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction_First()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TestIdentityAction#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getFirst()
	 * @generated
	 */
	InputPin createFirst(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getFirst()
	 * @generated
	 */
	InputPin createFirst(String name, Type type);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the second input object is placed.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction_Second()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getSecond();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TestIdentityAction#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getSecond()
	 * @generated
	 */
	InputPin createSecond(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getSecond()
	 * @generated
	 */
	InputPin createSecond(String name, Type type);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getOutputs() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin whose Boolean value indicates whether the two input objects are identical.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction_Result()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TestIdentityAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResult()
	 * @generated
	 */
	OutputPin createResult(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPins have no type.
	 * first.type= null and second.type = null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the InputPins is 1..1.
	 * first.is(1,1) and second.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result OutputPin is Boolean.
	 * result.type=Boolean
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateResultIsBoolean(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TestIdentityAction
