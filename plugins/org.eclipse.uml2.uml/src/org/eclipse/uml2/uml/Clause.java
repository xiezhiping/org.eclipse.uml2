/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Clause.java,v 1.8 2007/06/12 12:53:17 khussey Exp $
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
 * A clause is an element that represents a single branch of a conditional construct, including a test and a body section. The body section is executed only if (but not necessarily if) the test section evaluates true.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getPredecessorClauses <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getSuccessorClauses <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Clause#getBodyOutputs <em>Body Output</em>}</li>
 * </ul>
 * </p>
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
	 * A nested activity fragment with a designated output pin that specifies the result of the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClause_Test()
	 * @model ordered="false"
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
	 * A nested activity fragment that is executed if the test evaluates to true and the clause is chosen over any concurrent clauses that also evaluate to true.
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
	 * A set of clauses whose tests must all evaluate false before the current clause can be tested.
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
	 * A set of clauses which may not be tested unless the current clause tests false.
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
	 * An output pin within the test fragment the value of which is examined after execution of the test to determine whether the body should be executed.
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
	 * A list of output pins within the body fragment whose values are moved to the result pins of the containing conditional node after execution of the clause body.
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
	 * The decider output pin must be for the test body or a node contained by the test body as a structured node.
	 * true
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
	 * The bodyOutput pins are output pins on actions in the body of the clause.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Clause
