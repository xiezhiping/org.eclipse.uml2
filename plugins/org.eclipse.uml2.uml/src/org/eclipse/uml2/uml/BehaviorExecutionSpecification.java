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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehaviorExecutionSpecification is a kind of ExecutionSpecification representing the execution of a Behavior.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getBehaviorExecutionSpecification()
 * @model
 * @generated
 */
public interface BehaviorExecutionSpecification
		extends ExecutionSpecification {

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Behavior whose execution is occurring.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehaviorExecutionSpecification_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // BehaviorExecutionSpecification
