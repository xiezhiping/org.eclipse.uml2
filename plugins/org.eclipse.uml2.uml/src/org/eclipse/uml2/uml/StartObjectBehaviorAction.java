/*
 * Copyright (c) 2008, 2015 IBM Corporation, CEA, and others.
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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Object Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StartObjectBehaviorAction is an InvocationAction that starts the execution either of a directly instantiated Behavior or of the classifierBehavior of an object. Argument values may be supplied for the input Parameters of the Behavior. If the Behavior is invoked synchronously, then output values may be obtained for output Parameters.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStartObjectBehaviorAction()
 * @model
 * @generated
 */
public interface StartObjectBehaviorAction
		extends CallAction {

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin that holds the object that is either a Behavior to be started or has a classifierBehavior to be started.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getStartObjectBehaviorAction_Object()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getObject()
	 * @generated
	 */
	InputPin createObject(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getObject()
	 * @generated
	 */
	InputPin createObject(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object InputPin must be either a Behavior or a BehavioredClassifier with a classifierBehavior.
	 * self.behavior()<>null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypeOfObject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A StartObjectBehaviorAction may not specify onPort.
	 * onPort->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoOnport(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the type of the object InputPin is a Behavior, then that Behavior. Otherwise, if the type of the object InputPin is a BehavioredClassifier, then the classifierBehavior of that BehavioredClassifier.
	 * result = (if object.type.oclIsKindOf(Behavior) then
	 *   object.type.oclAsType(Behavior)
	 * else if object.type.oclIsKindOf(BehavioredClassifier) then
	 *   object.type.oclAsType(BehavioredClassifier).classifierBehavior
	 * else
	 *   null
	 * endif
	 * endif)
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	Behavior behavior();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object InputPin must be 1..1.
	 * object.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicityOfObject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // StartObjectBehaviorAction
