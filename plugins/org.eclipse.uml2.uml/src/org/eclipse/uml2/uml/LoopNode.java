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
 * $Id: LoopNode.java,v 1.1 2005/11/14 22:26:00 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each section is a well-nested subregion of the activity whose nodes follow any predecessors of the loop and precede any successors of the loop. The test section may precede or follow the body section. The setup section is executed once on entry to the loop, and the test and body sections are executed repeatedly until the test produces a false value. The results of the final execution of the test or body are available after completion of execution of the loop.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LoopNode#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode()
 * @model
 * @generated
 */
public interface LoopNode
		extends StructuredActivityNode {

	/**
	 * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the test is performed before the first execution of the body.
	 * If false, the body is executed once before the test is performed.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Tested First</em>' attribute.
	 * @see #setIsTestedFirst(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_IsTestedFirst()
	 * @model required="true" ordered="false"
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
	 * The set of nodes and edges that perform the repetitive computations of the loop. The body section is executed as long as the test section produces a true value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Part</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_BodyPart()
	 * @model type="org.eclipse.uml2.uml.ExecutableNode" ordered="false"
	 * @generated
	 */
	List getBodyParts();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBodyParts()
	 * @generated
	 */
	ExecutableNode getBodyPart(String name);

	/**
	 * Returns the value of the '<em><b>Setup Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of nodes and edges that initialize values or perform other setup computations for the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setup Part</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_SetupPart()
	 * @model type="org.eclipse.uml2.uml.ExecutableNode" ordered="false"
	 * @generated
	 */
	List getSetupParts();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSetupParts()
	 * @generated
	 */
	ExecutableNode getSetupPart(String name);

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An output pin within the test fragment the value of which is examined after execution of the test to determine whether to execute the loop body.
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
	 * The set of nodes, edges, and designated value that compute a Boolean value to determine if another execution of the body will be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_Test()
	 * @model type="org.eclipse.uml2.uml.ExecutableNode" ordered="false"
	 * @generated
	 */
	List getTests();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTests()
	 * @generated
	 */
	ExecutableNode getTest(String name);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins that constitute the data flow output of the entire loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_Result()
	 * @model type="org.eclipse.uml2.uml.OutputPin" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getResults();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.OutputPin} and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin createResult();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin getResult(String name);

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins owned by the loop that hold the values of the loop variables during an execution of the loop. When the test fails, the values are movied to the result pins of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_LoopVariable()
	 * @model type="org.eclipse.uml2.uml.OutputPin" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getLoopVariables();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.OutputPin} and appends it to the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getLoopVariables()
	 * @generated
	 */
	OutputPin createLoopVariable();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLoopVariables()
	 * @generated
	 */
	OutputPin getLoopVariable(String name);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins within the body fragment the values of which are moved to the loop variable pins after completion of execution of the body, before the next iteration of the loop begins or before the loop exits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_BodyOutput()
	 * @model type="org.eclipse.uml2.uml.OutputPin" ordered="false"
	 * @generated
	 */
	List getBodyOutputs();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBodyOutputs()
	 * @generated
	 */
	OutputPin getBodyOutput(String name);

	/**
	 * Returns the value of the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of values that are moved into the loop variable pins before the first iteration of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable Input</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getLoopNode_LoopVariableInput()
	 * @model type="org.eclipse.uml2.uml.InputPin" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getLoopVariableInputs();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and appends it to the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin createLoopVariableInput(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and appends it to the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin createLoopVariableInput();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLoopVariableInputs()
	 * @generated
	 */
	InputPin getLoopVariableInput(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loop variable inputs must not have outgoing edges.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputEdges(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bodyOutput pins are output pins on actions in the body of the loop node.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBodyOutput(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result output pins have no incoming edges.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateResultNoIncoming(DiagnosticChain diagnostics, Map context);

} // LoopNode
