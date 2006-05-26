/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConditionalNode.java,v 1.13 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ConditionalNode#isDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link org.eclipse.uml2.ConditionalNode#isAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.eclipse.uml2.ConditionalNode#getClauses <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.ConditionalNode#getResults <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Determinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Determinate</em>' attribute.
	 * @see #setIsDeterminate(boolean)
	 * @see org.eclipse.uml2.UML2Package#getConditionalNode_IsDeterminate()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isDeterminate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ConditionalNode#isDeterminate <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Determinate</em>' attribute.
	 * @see #isDeterminate()
	 * @generated
	 */
	void setIsDeterminate(boolean value);


	/**
	 * Returns the value of the '<em><b>Is Assured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Assured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assured</em>' attribute.
	 * @see #setIsAssured(boolean)
	 * @see org.eclipse.uml2.UML2Package#getConditionalNode_IsAssured()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isAssured();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ConditionalNode#isAssured <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assured</em>' attribute.
	 * @see #isAssured()
	 * @generated
	 */
	void setIsAssured(boolean value);


	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getConditionalNode_Clause()
	 * @model type="org.eclipse.uml2.Clause" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getClauses();


    /**
     * Creates a {@link org.eclipse.uml2.Clause} and appends it to the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Clause} to create.
	 * @return The new {@link org.eclipse.uml2.Clause}.
	 * @see #getClauses()
	 * @generated NOT
	 * @deprecated Use #createClause() instead.
     */
    Clause createClause(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Clause} and appends it to the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Clause}.
	 * @see #getClauses()
	 * @generated NOT
	 */
    Clause createClause();

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
	 * A list of output pins that constitute the data flow outputs of the conditional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getConditionalNode_Result()
	 * @model type="org.eclipse.uml2.OutputPin" containment="true"
	 * @generated
	 */
	EList getResults();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
    OutputPin getResult(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin getResult(String name, boolean ignoreCase);


    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResults()
	 * @generated NOT
	 * @deprecated Use #createResult() instead.
     */
    OutputPin createResult(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.OutputPin} and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResults()
	 * @generated NOT
	 */
    OutputPin createResult();

} // ConditionalNode
