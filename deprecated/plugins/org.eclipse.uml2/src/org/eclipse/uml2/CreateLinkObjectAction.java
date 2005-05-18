/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CreateLinkObjectAction.java,v 1.6 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action is exclusively for creating links of association classes. It returns the created link object. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.CreateLinkObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getCreateLinkObjectAction()
 * @model
 * @generated
 */
public interface CreateLinkObjectAction extends CreateLinkAction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.UML2Package#getCreateLinkObjectAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.CreateLinkObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);


    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResult()
	 * @generated NOT
	 * @deprecated Use #createResult() instead.
     */
    OutputPin createResult(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResult()
	 * @generated
     */
    OutputPin createResult();

} // CreateLinkObjectAction
