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
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * @extends BodyOwner
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OpaqueAction is an Action whose functionality is not specified within UML.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getInputValues <em>Input Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getOutputValues <em>Output Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction
		extends Action, BodyOwner {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a textual specification of the functionality of the Action, in one or more languages other than UML.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see #isSetBodies()
	 * @see #unsetBodies()
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_Body()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.uml2.types.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<String> getBodies();

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.OpaqueAction#getBodies <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBodies()
	 * @see #getBodies()
	 * @generated
	 */
	void unsetBodies();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.OpaqueAction#getBodies <em>Body</em>}' attribute list is set.
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
	 * If provided, a specification of the language used for each of the body Strings.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see #isSetLanguages()
	 * @see #unsetLanguages()
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_Language()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	EList<String> getLanguages();

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.OpaqueAction#getLanguages <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	void unsetLanguages();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.OpaqueAction#getLanguages <em>Language</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute list is set.
	 * @see #unsetLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	boolean isSetLanguages();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPins providing inputs to the OpaqueAction.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_InputValue()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getInputValues();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin createInputValue(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin createInputValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin getInputValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin getInputValue(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputValues()
	 * @generated NOT
	 */
	InputPin getInputValue(String name, Type type, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getOutputs() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on which the OpaqueAction provides outputs.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Value</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_OutputValue()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<OutputPin> getOutputValues();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Output Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getOutputValues()
	 * @generated
	 */
	OutputPin createOutputValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputValues()
	 * @generated
	 */
	OutputPin getOutputValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.OutputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputValues()
	 * @generated
	 */
	OutputPin getOutputValue(String name, Type type, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the language attribute is not empty, then the size of the body and language lists must be the same.
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
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputValues()
	 * @generated NOT
	 */
	OutputPin getOutputValue(String name, Type type, boolean ignoreCase);

} // OpaqueAction
