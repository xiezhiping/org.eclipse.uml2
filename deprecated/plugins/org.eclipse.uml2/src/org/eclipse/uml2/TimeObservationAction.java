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
 * $Id: TimeObservationAction.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TimeObservationAction#getNows <em>Now</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getTimeObservationAction()
 * @model 
 * @generated
 */
public interface TimeObservationAction extends WriteStructuralFeatureAction{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Now</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.TimeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Now</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Now</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getTimeObservationAction_Now()
	 * @model type="org.eclipse.uml2.TimeExpression" containment="true"
	 * @generated
	 */
	EList getNows();

    /**
     * Retrieves the {@link org.eclipse.uml2.TimeExpression} with the specified name from the '<em><b>Now</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.TimeExpression} to retrieve.
	 * @return The {@link org.eclipse.uml2.TimeExpression} with the specified name, or <code>null</code>.
	 * @see #getNows()
	 * @generated
     */
    TimeExpression getNow(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.TimeExpression} and appends it to the '<em><b>Now</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.TimeExpression} to create.
	 * @return The new {@link org.eclipse.uml2.TimeExpression}.
	 * @see #getNows()
	 * @generated
     */
    TimeExpression createNow(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	InputPin getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setValue(InputPin value);

} // TimeObservationAction
