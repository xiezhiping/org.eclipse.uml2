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
 * $Id: StringExpression.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StringExpression#getSubExpressions <em>Sub Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getStringExpression()
 * @model 
 * @generated
 */
public interface StringExpression extends TemplateableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.StringExpression}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.StringExpression#getOwningExpression <em>Owning Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStringExpression_SubExpression()
	 * @see org.eclipse.uml2.StringExpression#getOwningExpression
	 * @model type="org.eclipse.uml2.StringExpression" opposite="owningExpression" containment="true" ordered="false"
	 * @generated
	 */
	EList getSubExpressions();

    /**
     * Creates a {@link org.eclipse.uml2.StringExpression} and appends it to the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.StringExpression} to create.
	 * @return The new {@link org.eclipse.uml2.StringExpression}.
	 * @see #getSubExpressions()
	 * @generated
     */
    StringExpression createSubExpression(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.StringExpression#getSubExpressions <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Expression</em>' container reference.
	 * @see #setOwningExpression(StringExpression)
	 * @see org.eclipse.uml2.UML2Package#getStringExpression_OwningExpression()
	 * @see org.eclipse.uml2.StringExpression#getSubExpressions
	 * @model opposite="subExpression"
	 * @generated
	 */
	StringExpression getOwningExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.StringExpression#getOwningExpression <em>Owning Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Expression</em>' container reference.
	 * @see #getOwningExpression()
	 * @generated
	 */
	void setOwningExpression(StringExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Element getOwner();

} // StringExpression
