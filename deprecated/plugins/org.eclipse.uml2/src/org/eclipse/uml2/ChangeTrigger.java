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
 * A representation of the model object '<em><b>Change Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ChangeTrigger#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getChangeTrigger()
 * @model 
 * @generated
 */
public interface ChangeTrigger extends Trigger{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Expression</em>' containment reference.
	 * @see #setChangeExpression(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getChangeTrigger_ChangeExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getChangeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ChangeTrigger#getChangeExpression <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' containment reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ValueSpecification value);

    /**
     * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getChangeExpression()
	 * @generated
     */
    ValueSpecification createChangeExpression(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // ChangeTrigger
