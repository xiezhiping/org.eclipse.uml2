/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.JoinNode#isCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link org.eclipse.uml2.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getJoinNode()
 * @model 
 * @generated
 */
public interface JoinNode extends ControlNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Combine Duplicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(boolean)
	 * @see org.eclipse.uml2.UML2Package#getJoinNode_IsCombineDuplicate()
	 * @model default="true" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isCombineDuplicate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.JoinNode#isCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #isCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getJoinNode_JoinSpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getJoinSpec();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(ValueSpecification value);

    /**
     * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getJoinSpec()
	 * @generated
     */
    ValueSpecification createJoinSpec(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // JoinNode
