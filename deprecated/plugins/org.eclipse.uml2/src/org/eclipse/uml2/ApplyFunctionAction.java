/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ApplyFunctionAction.java,v 1.4 2004/06/06 01:35:07 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Function Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ApplyFunctionAction is an action that invokes a primitive predefined function that computes output values based only on the input values and the function. The execution does not have access to object memory or to any objects. The execution of a primitive function has no side effects on any other object. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ApplyFunctionAction#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.uml2.ApplyFunctionAction#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.ApplyFunctionAction#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getApplyFunctionAction()
 * @model 
 * @generated
 */
public interface ApplyFunctionAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primitive function to be invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(PrimitiveFunction)
	 * @see org.eclipse.uml2.UML2Package#getApplyFunctionAction_Function()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveFunction getFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ApplyFunctionAction#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PrimitiveFunction value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pins that provide inputs to the function. (Specializes Action.input.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getApplyFunctionAction_Argument()
	 * @model type="org.eclipse.uml2.InputPin" containment="true" ordered="false"
	 * @generated
	 */
	EList getArguments();

    /**
     * Retrieves the {@link org.eclipse.uml2.InputPin} with the specified name from the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.InputPin} with the specified name, or <code>null</code>.
	 * @see #getArguments()
	 * @generated
     */
    InputPin getArgument(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and appends it to the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getArguments()
	 * @generated
     */
    InputPin createArgument(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pins on which the results of invoking the function are returned. (Specializes Action.output.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getApplyFunctionAction_Result()
	 * @model type="org.eclipse.uml2.OutputPin" containment="true"
	 * @generated
	 */
	EList getResults();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getResults()
	 * @generated
     */
    OutputPin getResult(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResults()
	 * @generated
     */
    OutputPin createResult(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOutputs();

} // ApplyFunctionAction
