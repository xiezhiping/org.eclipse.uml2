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
 * $Id: Interval.java,v 1.3 2004/06/03 02:59:18 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Interval defines the range between two value specifications. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Interval#getMins <em>Min</em>}</li>
 *   <li>{@link org.eclipse.uml2.Interval#getMaxes <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInterval()
 * @model 
 * @generated
 */
public interface Interval extends ValueSpecification{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterval_Min()
	 * @model type="org.eclipse.uml2.ValueSpecification" volatile="true"
	 * @generated
	 */
	EList getMins();

    /**
     * Retrieves the {@link org.eclipse.uml2.ValueSpecification} with the specified name from the '<em><b>Min</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ValueSpecification} to retrieve.
	 * @return The {@link org.eclipse.uml2.ValueSpecification} with the specified name, or <code>null</code>.
	 * @see #getMins()
	 * @generated
     */
    ValueSpecification getMin(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterval_Max()
	 * @model type="org.eclipse.uml2.ValueSpecification" volatile="true"
	 * @generated
	 */
	EList getMaxes();

    /**
     * Retrieves the {@link org.eclipse.uml2.ValueSpecification} with the specified name from the '<em><b>Max</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ValueSpecification} to retrieve.
	 * @return The {@link org.eclipse.uml2.ValueSpecification} with the specified name, or <code>null</code>.
	 * @see #getMaxes()
	 * @generated
     */
    ValueSpecification getMax(String unqualifiedName);
      
} // Interval
