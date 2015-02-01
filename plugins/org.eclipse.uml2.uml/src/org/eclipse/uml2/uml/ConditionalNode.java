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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConditionalNode is a StructuredActivityNode that chooses one among some number of alternative collections of ExecutableNodes to execute.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#getClauses <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#isAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#isDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConditionalNode#getResults <em>Result</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode
		extends StructuredActivityNode {

	/**
	 * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that the test for at most one Clause of the ConditionalNode will succeed.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Determinate</em>' attribute.
	 * @see #setIsDeterminate(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConditionalNode_IsDeterminate()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeterminate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ConditionalNode#isDeterminate <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Determinate</em>' attribute.
	 * @see #isDeterminate()
	 * @generated
	 */
	void setIsDeterminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Assured</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that the test for at least one Clause of the ConditionalNode will succeed.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Assured</em>' attribute.
	 * @see #setIsAssured(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConditionalNode_IsAssured()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAssured();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ConditionalNode#isAssured <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assured</em>' attribute.
	 * @see #isAssured()
	 * @generated
	 */
	void setIsAssured(boolean value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Clause}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Clauses composing the ConditionalNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConditionalNode_Clause()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Clause> getClauses();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Clause} and appends it to the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Clause}.
	 * @see #getClauses()
	 * @generated
	 */
	Clause createClause();

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
	 * The OutputPins that onto which are moved values from the bodyOutputs of the Clause selected for execution.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConditionalNode_Result()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ConditionalNode has no InputPins.
	 * input->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoInputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No ExecutableNode in the ConditionNode may appear in the test or body part of more than one clause of a ConditionalNode.
	 * node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->forAll(n | 
	 * 	self.clause->select(test->union(_'body')->includes(n))->size()=1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneClauseWithExecutableNode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each clause of a ConditionalNode must have the same number of bodyOutput pins as the ConditionalNode has result OutputPins, and each clause bodyOutput Pin must be compatible with the corresponding result OutputPin (by positional order) in type, multiplicity, ordering, and uniqueness.
	 * clause->forAll(
	 * 	bodyOutput->size()=self.result->size() and
	 * 	Sequence{1..self.result->size()}->forAll(i |
	 * 		bodyOutput->at(i).type.conformsTo(result->at(i).type) and
	 * 		bodyOutput->at(i).isOrdered = result->at(i).isOrdered and
	 * 		bodyOutput->at(i).isUnique = result->at(i).isUnique and
	 * 		bodyOutput->at(i).compatibleWith(result->at(i))))
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
	 * The union of the ExecutableNodes in the test and body parts of all clauses must be the same as the subset of nodes contained in the ConditionalNode (considered as a StructuredActivityNode) that are ExecutableNodes.
	 * clause.test->union(clause._'body') = node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)
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
	 * No two clauses within a ConditionalNode may be predecessorClauses of each other, either directly or indirectly.
	 * clause->closure(predecessorClause)->intersection(clause)->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClauseNoPredecessor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ConditionalNode
