/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LoopNode.java,v 1.6 2005/03/15 18:44:44 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LoopNode#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.LoopNode#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getLoopNode()
 * @model 
 * @generated
 */
public interface LoopNode extends StructuredActivityNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tested First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tested First</em>' attribute.
	 * @see #setIsTestedFirst(boolean)
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_IsTestedFirst()
	 * @model dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isTestedFirst();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.LoopNode#isTestedFirst <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tested First</em>' attribute.
	 * @see #isTestedFirst()
	 * @generated
	 */
	void setIsTestedFirst(boolean value);

	/**
	 * Returns the value of the '<em><b>Body Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Part</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_BodyPart()
	 * @model type="org.eclipse.uml2.ActivityNode" ordered="false"
	 * @generated
	 */
	EList getBodyParts();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getBodyParts()
	 * @generated
     */
    ActivityNode getBodyPart(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Setup Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup Part</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_SetupPart()
	 * @model type="org.eclipse.uml2.ActivityNode" ordered="false"
	 * @generated
	 */
	EList getSetupParts();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getSetupParts()
	 * @generated
     */
    ActivityNode getSetupPart(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_Decider()
	 * @model required="true"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.LoopNode#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_Test()
	 * @model type="org.eclipse.uml2.ActivityNode" ordered="false"
	 * @generated
	 */
	EList getTests();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getTests()
	 * @generated
     */
    ActivityNode getTest(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins that constitute the data flow output of the entire loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_Result()
	 * @model type="org.eclipse.uml2.OutputPin" containment="true"
	 * @generated
	 */
	EList getResults();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getResults()
	 * @generated
     */
    OutputPin getResult(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and appends it to the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getResults()
	 * @generated
     */
    OutputPin createResult(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins owned by the loop that hold the values of the loop variables during an execution of the loop. When the test fails, the values are copied to the result pins of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_LoopVariable()
	 * @model type="org.eclipse.uml2.OutputPin" containment="true"
	 * @generated
	 */
	EList getLoopVariables();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getLoopVariables()
	 * @generated
     */
    OutputPin getLoopVariable(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.OutputPin} and appends it to the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OutputPin} to create.
	 * @return The new {@link org.eclipse.uml2.OutputPin}.
	 * @see #getLoopVariables()
	 * @generated
     */
    OutputPin createLoopVariable(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins within the body fragment the values of which are copied to the loop variable pins after completion of execution of the body, before the next iteration of the loop begins or before the loop exits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_BodyOutput()
	 * @model type="org.eclipse.uml2.OutputPin" ordered="false"
	 * @generated
	 */
	EList getBodyOutputs();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getBodyOutputs()
	 * @generated
     */
    OutputPin getBodyOutput(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of values that are copied into the loop variable pins before the first iteration of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable Input</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getLoopNode_LoopVariableInput()
	 * @model type="org.eclipse.uml2.InputPin" containment="true"
	 * @generated
	 */
	EList getLoopVariableInputs();

    /**
     * Retrieves the {@link org.eclipse.uml2.InputPin} with the specified name from the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.InputPin} with the specified name, or <code>null</code>.
	 * @see #getLoopVariableInputs()
	 * @generated
     */
    InputPin getLoopVariableInput(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and appends it to the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getLoopVariableInputs()
	 * @generated
     */
    InputPin createLoopVariableInput(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getInputs();

} // LoopNode
