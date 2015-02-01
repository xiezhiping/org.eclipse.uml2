/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeEvent is an Event that occurs at a specific point in time.
 * <p>From package UML::CommonBehavior.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeEvent#isRelative <em>Is Relative</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TimeEvent#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTimeEvent()
 * @model
 * @generated
 */
public interface TimeEvent
		extends Event {

	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the TimeEvent is specified as an absolute or relative time.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeEvent_IsRelative()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRelative();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeEvent#isRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the time of the TimeEvent.
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(TimeExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeEvent_When()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	TimeExpression getWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeEvent#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(TimeExpression value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.TimeExpression},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.TimeExpression}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.TimeExpression}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.TimeExpression}.
	 * @see #getWhen()
	 * @generated
	 */
	TimeExpression createWhen(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ValueSpecification when must return a non-negative Integer.
	 * when.integerValue() >= 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateWhenNonNegative(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TimeEvent
