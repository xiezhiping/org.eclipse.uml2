/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 397141, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LoopNode is a StructuredActivityNode that represents an iterative loop with setup, test, and body sections.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getTests <em>Test</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode()
 * @model
 * @generated
 */
public interface LoopNode
		extends StructuredActivityNode {

	/**
	 * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the test is performed before the first execution of the bodyPart. If false, the bodyPart is executed once before the test is performed.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Tested First</em>' attribute.
	 * @see #setIsTestedFirst(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_IsTestedFirst()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTestedFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LoopNode#isTestedFirst <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tested First</em>' attribute.
	 * @see #isTestedFirst()
	 * @generated
	 */
	void setIsTestedFirst(boolean value);

	/**
	 * Returns the value of the '<em><b>Body Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes that perform the repetitive computations of the loop. The bodyPart is executed as long as the test section produces a true value.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Part</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_BodyPart()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ExecutableNode> getBodyParts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBodyParts()
	 * @generated
	 */
	ExecutableNode getBodyPart(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBodyParts()
	 * @generated
	 */
	ExecutableNode getBodyPart(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Setup Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes executed before the first iteration of the loop, in order to initialize values or perform other setup computations.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setup Part</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_SetupPart()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ExecutableNode> getSetupParts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSetupParts()
	 * @generated
	 */
	ExecutableNode getSetupPart(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSetupParts()
	 * @generated
	 */
	ExecutableNode getSetupPart(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin on an Action in the test section whose Boolean value determines whether to continue executing the loop bodyPart.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_Decider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LoopNode#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes executed in order to provide the test result for the loop.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_Test()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ExecutableNode> getTests();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTests()
	 * @generated
	 */
	ExecutableNode getTest(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTests()
	 * @generated
	 */
	ExecutableNode getTest(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredActivityNode#getStructuredNodeOutputs() <em>Structured Node Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of OutputPins that receive the loopVariable values after the last iteration of the loop and constitute the output of the LoopNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_Result()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OutputPin> getResults();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin createResult(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin getResult(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.OutputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin getResult(String name, Type type, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of OutputPins that hold the values of the loop variables during an execution of the loop. When the test fails, the values are moved to the result OutputPins of the loop.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_LoopVariable()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OutputPin> getLoopVariables();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getLoopVariables()
	 * @generated
	 */
	OutputPin createLoopVariable(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getLoopVariables()
	 * @generated
	 */
	OutputPin getLoopVariable(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Loop Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getLoopVariables()
	 * @generated NOT
	 */
	OutputPin getLoopVariable(String name, Type type, boolean ignoreCase);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.OutputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getLoopVariables()
	 * @generated
	 */
	OutputPin getLoopVariable(String name, Type type, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on Actions within the bodyPart, the values of which are moved to the loopVariable OutputPins after the completion of each execution of the bodyPart, before the next iteration of the loop begins or before the loop exits.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_BodyOutput()
	 * @model
	 * @generated
	 */
	EList<OutputPin> getBodyOutputs();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getBodyOutputs()
	 * @generated
	 */
	OutputPin getBodyOutput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getBodyOutputs()
	 * @generated
	 */
	OutputPin getBodyOutput(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredActivityNode#getStructuredNodeInputs() <em>Structured Node Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of InputPins whose values are moved into the loopVariable Pins before the first iteration of the loop.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable Input</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_LoopVariableInput()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<InputPin> getLoopVariableInputs();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin createLoopVariableInput(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin createLoopVariableInput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin getLoopVariableInput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin getLoopVariableInput(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The loopVariableInputs must not have outgoing edges.
	 * loopVariableInput.outgoing->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the ExecutableNodes in the setupPart, test and bodyPart of a LoopNode must be the same as the subset of nodes contained in the LoopNode (considered as a StructuredActivityNode) that are ExecutableNodes.
	 * setupPart->union(test)->union(bodyPart)=node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->asSet()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExecutableNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bodyOutput pins are OutputPins on Actions in the body of the LoopNode.
	 * bodyPart.oclAsType(Action).allActions().output->includesAll(bodyOutput)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test and body parts of a ConditionalNode must be disjoint with each other.
	 * setupPart->intersection(test)->isEmpty() and
	 * setupPart->intersection(bodyPart)->isEmpty() and
	 * test->intersection(bodyPart)->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSetupTestAndBody(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LoopNode must have the same number of bodyOutput Pins as loopVariables, and each bodyOutput Pin must be compatible with the corresponding loopVariable (by positional order) in type, multiplicity, ordering and uniqueness.
	 * bodyOutput->size()=loopVariable->size() and
	 * Sequence{1..loopVariable->size()}->forAll(i |
	 * 	bodyOutput->at(i).type.conformsTo(loopVariable->at(i).type) and
	 * 	bodyOutput->at(i).isOrdered = loopVariable->at(i).isOrdered and
	 * 	bodyOutput->at(i).isUnique = loopVariable->at(i).isUnique and
	 * 	loopVariable->at(i).includesMultiplicity(bodyOutput->at(i)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMatchingOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LoopNode must have the same number of loopVariableInputs and loopVariables, and they must match in type, uniqueness and multiplicity.
	 * loopVariableInput->size()=loopVariable->size() and
	 * loopVariableInput.type=loopVariable.type and
	 * loopVariableInput.isUnique=loopVariable.isUnique and
	 * loopVariableInput.lower=loopVariable.lower and
	 * loopVariableInput.upper=loopVariable.upper
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMatchingLoopVariables(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LoopNode must have the same number of result OutputPins and loopVariables, and they must match in type, uniqueness and multiplicity.
	 * result->size()=loopVariable->size() and
	 * result.type=loopVariable.type and
	 * result.isUnique=loopVariable.isUnique and
	 * result.lower=loopVariable.lower and
	 * result.upper=loopVariable.upper
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMatchingResultPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ActivityEdges outgoing from loopVariable OutputPins must have targets within the LoopNode.
	 * allOwnedNodes()->includesAll(loopVariable.outgoing.target)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateLoopVariableOutgoing(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result OutputPins have no incoming edges.
	 * result.incoming->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateResultNoIncoming(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // LoopNode
