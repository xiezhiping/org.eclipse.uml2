/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *
 * $Id: Action.java,v 1.15 2008/01/09 18:56:02 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action is a named element that is the fundamental unit of executable functionality. The execution of an action represents some transformation or processing in the modeled system, be it a computer system or otherwise.
 * An action represents a single step within an activity, that is, one that is not further decomposed within the activity.
 * An action has pre- and post-conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Action#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getLocalPreconditions <em>Local Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getLocalPostconditions <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action
		extends ExecutableNode {

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of output pins connected to the Action. The action places its results onto pins in this set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_Output()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<OutputPin> getOutputs();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputs()
	 * @generated
	 */
	OutputPin getOutput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getOutputs()
	 * @generated
	 */
	OutputPin getOutput(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of input pins connected to the Action. These are among the total set of inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_Input()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<InputPin> getInputs();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputs()
	 * @generated
	 */
	InputPin getInput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getInputs()
	 * @generated
	 */
	InputPin getInput(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that owns the behavior of which this action is a part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Classifier getContext();

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when execution is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_LocalPrecondition()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPreconditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint createLocalPrecondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint createLocalPrecondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint getLocalPrecondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint getLocalPrecondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when executed is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_LocalPostcondition()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPostconditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint createLocalPostcondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint createLocalPostcondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint getLocalPostcondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint getLocalPostcondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

} // Action
