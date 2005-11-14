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
 * $Id: TestIdentityAction.java,v 1.1 2005/11/14 22:25:58 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action returns true if the two input values are the same identity, false if they are not.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#getSecond <em>Second</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction()
 * @model
 * @generated
 */
public interface TestIdentityAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the pin on which an object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction_First()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	InputPin getFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TestIdentityAction#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(InputPin value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and sets the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getFirst()
	 * @generated
	 */
	InputPin createFirst(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and sets the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getFirst()
	 * @generated
	 */
	InputPin createFirst();

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the pin on which an object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction_Second()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	InputPin getSecond();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TestIdentityAction#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(InputPin value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and sets the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getSecond()
	 * @generated
	 */
	InputPin createSecond(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and sets the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getSecond()
	 * @generated
	 */
	InputPin createSecond();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the two input objects are identical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTestIdentityAction_Result()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TestIdentityAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResult()
	 * @generated
	 */
	OutputPin createResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pins have no type.
	 * self.first.type->size() = 0
	 * and self.second.type->size() = 0
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoType(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the input pins is 1..1.
	 * self.first.multiplicity.is(1,1)
	 * and self.second.multiplicity.is(1,1)
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result is Boolean.
	 * self.result.type.oclIsTypeOf(Boolean)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateResultIsBoolean(DiagnosticChain diagnostics, Map context);

} // TestIdentityAction
