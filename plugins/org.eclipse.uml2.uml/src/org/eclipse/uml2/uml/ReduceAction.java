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
 * $Id: ReduceAction.java,v 1.7 2006/12/14 15:49:27 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reduce action is an action that reduces a collection to a single value by combining the elements of the collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#getReducer <em>Reducer</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReduceAction#isOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getReduceAction()
 * @model
 * @generated
 */
public interface ReduceAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Behavior that is applied to two elements of the input collection to produce a value that is the same type as elements of the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reducer</em>' reference.
	 * @see #setReducer(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReduceAction_Reducer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getReducer();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReduceAction#getReducer <em>Reducer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer</em>' reference.
	 * @see #getReducer()
	 * @generated
	 */
	void setReducer(Behavior value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the output pin on which the result is put.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReduceAction_Result()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReduceAction#getResult <em>Result</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection to be reduced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReduceAction_Collection()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getCollection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReduceAction#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getCollection()
	 * @generated
	 */
	InputPin createCollection(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getCollection()
	 * @generated
	 */
	InputPin createCollection(String name, Type type);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the order of the input collection should determine the order in which the behavior is applied to its elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReduceAction_IsOrdered()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReduceAction#isOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the input must be a collection.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputTypeIsCollection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the output must be compatible with the type of the output of the reducer behavior.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOutputTypesAreCompatible(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reducer behavior must have two input parameters and one output parameter, of types compatible with the types of elements of the input collection.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReducerInputsOutput(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ReduceAction
