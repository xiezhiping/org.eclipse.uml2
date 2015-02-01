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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Clause is an Element that represents a single branch of a ConditionalNode, including a test and a body section. The body section is executed only if (but not necessarily if) the test section evaluates to true.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getPredecessorClauses <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getSuccessorClauses <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getTests <em>Test</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getClause()
 * @model
 * @generated
 */
public interface Clause
		extends Element {

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes that are executed in order to provide a test result for the Clause.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_Test()
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
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes that are executed if the test evaluates to true and the Clause is chosen over other Clauses within the ConditionalNode that also have tests that evaluate to true.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_Body()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ExecutableNode> getBodies();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBodies()
	 * @generated
	 */
	ExecutableNode getBody(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getBodies()
	 * @generated
	 */
	ExecutableNode getBody(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Clause}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Clause#getSuccessorClauses <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Clauses whose tests must all evaluate to false before this Clause can evaluate its test.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_PredecessorClause()
	 * @see org.eclipse.uml2.uml.Clause#getSuccessorClauses
	 * @model opposite="successorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getPredecessorClauses();

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Clause}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Clause#getPredecessorClauses <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Clauses that may not evaluate their tests unless the test for this Clause evaluates to false.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successor Clause</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_SuccessorClause()
	 * @see org.eclipse.uml2.uml.Clause#getPredecessorClauses
	 * @model opposite="predecessorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getSuccessorClauses();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin on an Action in the test section whose Boolean value determines the result of the test.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_Decider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on Actions within the body section whose values are moved to the result OutputPins of the containing ConditionalNode after execution of the body.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_BodyOutput()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The decider Pin must be on an Action in the test section of the Clause and must be of type Boolean with multiplicity 1..1.
	 * test.oclAsType(Action).allActions().output->includes(decider) and
	 * decider.type = Boolean and
	 * decider.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeciderOutput(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test and body parts of a ConditionalNode must be disjoint with each other.
	 * test->intersection(_'body')->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTestAndBody(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bodyOutput Pins are OutputPins on Actions in the body of the Clause.
	 * _'body'.oclAsType(Action).allActions().output->includesAll(bodyOutput)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Clause
