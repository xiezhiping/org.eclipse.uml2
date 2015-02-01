/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ChangeEvent models a change in the system configuration that makes a condition true.
 * <p>From package UML::CommonBehavior.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ChangeEvent#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent
		extends Event {

	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean-valued ValueSpecification that will result in a ChangeEvent whenever its value changes from false to true.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Expression</em>' containment reference.
	 * @see #setChangeExpression(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getChangeEvent_ChangeExpression()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getChangeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ChangeEvent#getChangeExpression <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' containment reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getChangeExpression()
	 * @generated
	 */
	ValueSpecification createChangeExpression(String name, Type type,
			EClass eClass);

} // ChangeEvent
