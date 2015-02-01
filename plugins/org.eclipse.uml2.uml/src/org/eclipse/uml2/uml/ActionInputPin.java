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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActionInputPin is a kind of InputPin that executes an Action to determine the values to input to another Action.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#getFromAction <em>From Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActionInputPin()
 * @model
 * @generated
 */
public interface ActionInputPin
		extends InputPin {

	/**
	 * Returns the value of the '<em><b>From Action</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Action used to provide the values of the ActionInputPin.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Action</em>' containment reference.
	 * @see #setFromAction(Action)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActionInputPin_FromAction()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	Action getFromAction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActionInputPin#getFromAction <em>From Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Action</em>' containment reference.
	 * @see #getFromAction()
	 * @generated
	 */
	void setFromAction(Action value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Action}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Action}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getFromAction()
	 * @generated
	 */
	Action createFromAction(String name, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an ActionInputPin must have exactly one OutputPin.
	 * fromAction.output->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneOutputPin(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an ActionInputPin cannot have ActivityEdges coming into or out of it or its Pins.
	 * fromAction.incoming->union(outgoing)->isEmpty() and
	 * fromAction.input.incoming->isEmpty() and
	 * fromAction.output.outgoing->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoControlOrObjectFlow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an ActionInputPin must only have ActionInputPins as InputPins.
	 * fromAction.input->forAll(oclIsKindOf(ActionInputPin))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputPin(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ActionInputPin
