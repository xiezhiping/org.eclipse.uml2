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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Duration#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.eclipse.uml2.Duration#getEvents <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDuration()
 * @model 
 * @generated
 */
public interface Duration extends ValueSpecification{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>First Time</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Time</em>' attribute.
	 * @see #setFirstTime(boolean)
	 * @see org.eclipse.uml2.UML2Package#getDuration_FirstTime()
	 * @model default="True" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isFirstTime();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Duration#isFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #isFirstTime()
	 * @generated
	 */
	void setFirstTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getDuration_Event()
	 * @model type="org.eclipse.uml2.NamedElement" upper="2"
	 * @generated
	 */
	EList getEvents();

    /**
     * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified name from the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified name, or <code>null</code>.
	 * @see #getEvents()
	 * @generated
     */
    NamedElement getEvent(String unqualifiedName);
      
} // Duration
