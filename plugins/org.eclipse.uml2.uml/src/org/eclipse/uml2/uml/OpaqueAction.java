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
 * $Id: OpaqueAction.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action with implementation-specific semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getInputValues <em>Input Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OpaqueAction#getOutputValues <em>Output Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the action in one or more languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_Body()
	 * @model type="java.lang.String" required="true"
	 * @generated
	 */
	List getBodies();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Languages the body strings use, in the same order as the body strings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_Language()
	 * @model type="java.lang.String"
	 * @generated
	 */
	List getLanguages();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides input to the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_InputValue()
	 * @model type="org.eclipse.uml2.uml.InputPin" ordered="false"
	 * @generated
	 */
	List getInputValues();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Input Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInputValues()
	 * @generated
	 */
	InputPin getInputValue(String name);

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Takes output from the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Value</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOpaqueAction_OutputValue()
	 * @model type="org.eclipse.uml2.uml.OutputPin" ordered="false"
	 * @generated
	 */
	List getOutputValues();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Output Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutputValues()
	 * @generated
	 */
	OutputPin getOutputValue(String name);

} // OpaqueAction
