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
 * $Id: Duration.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A duration defines a value specification that specifies the temporal distance between two time expressions that specify time instants.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Duration#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Duration#getEvents <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration
		extends ValueSpecification {

	/**
	 * Returns the value of the '<em><b>First Time</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the duration is between times of two NamedElements, there are two Boolean attributes, one for the start of the duration and one for the end of the duration. For each of these it holds that firstTime is true if the time information is associated with the first point in time of the NamedElement referenced by event, and false if it represents the last point in time of the NamedElement. If there is only one NamedElement referenced by event, then this attribute is irrelevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Time</em>' attribute.
	 * @see #setFirstTime(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDuration_FirstTime()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isFirstTime();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Duration#isFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #isFirstTime()
	 * @generated
	 */
	void setFirstTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the specification(s) that describes the starting TimeExpression and the ending TimeExpression of the Duration. If only one NamedElement is referenced, the duration is from the first point in time of that NamedElement until the last point in time of that NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDuration_Event()
	 * @model type="org.eclipse.uml2.uml.NamedElement" upper="2" ordered="false"
	 * @generated
	 */
	List getEvents();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEvents()
	 * @generated
	 */
	NamedElement getEvent(String name);

} // Duration
