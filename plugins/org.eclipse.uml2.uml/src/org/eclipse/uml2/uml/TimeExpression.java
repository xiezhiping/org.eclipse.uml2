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
 * $Id: TimeExpression.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeExpression defines a value specification that represents a time value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeExpression#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeExpression#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression
		extends ValueSpecification {

	/**
	 * Returns the value of the '<em><b>First Time</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the TimeExpression describes the first point in time of the NamedElement referenced by event, in cases where the NamedElement describes something which extends in time. False if the TimeExpression describes the last point in time for the referenced NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Time</em>' attribute.
	 * @see #setFirstTime(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression_FirstTime()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isFirstTime();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeExpression#isFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #isFirstTime()
	 * @generated
	 */
	void setFirstTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the specification of the event occurrence that the TimeExpression describes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(NamedElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeExpression_Event()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeExpression#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(NamedElement value);

} // TimeExpression
