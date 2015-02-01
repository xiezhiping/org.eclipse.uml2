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
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeConstraint is a Constraint that refers to a TimeInterval.
 * <p>From package UML::Values.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TimeConstraint#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint
		extends IntervalConstraint {

	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent is related to the constrainedElement. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the constrainedElement. If firstEvent is false, then the corresponding observation event is the last time instant the execution is within the constrainedElement.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTimeConstraint_FirstEvent()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TimeConstraint#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A TimeConstraint has one constrainedElement.
	 * constrainedElement->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHasOneConstrainedElement(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TimeConstraint
