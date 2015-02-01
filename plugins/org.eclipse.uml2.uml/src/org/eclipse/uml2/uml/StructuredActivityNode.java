/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
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
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StructuredActivityNode is an Action that is also an ActivityGroup and whose behavior is specified by the ActivityNodes and ActivityEdges it so contains. Unlike other kinds of ActivityGroup, a StructuredActivityNode owns the ActivityNodes and ActivityEdges it contains, and so a node or edge can only be directly contained in one StructuredActivityNode, though StructuredActivityNodes may be nested.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getStructuredNodeInputs <em>Structured Node Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getStructuredNodeOutputs <em>Structured Node Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getNodes <em>Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode()
 * @model
 * @generated
 */
public interface StructuredActivityNode
		extends Action, Namespace, ActivityGroup {

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Variable}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Variable#getScope <em>Scope</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Variables defined in the scope of the StructuredActivityNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_Variable()
	 * @see org.eclipse.uml2.uml.Variable#getScope
	 * @model opposite="scope" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Variable}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Variable}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.Variable}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Variable}.
	 * @see #getVariables()
	 * @generated
	 */
	Variable createVariable(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Variable} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Variable} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Variable} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Variable} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getVariables()
	 * @generated
	 */
	Variable getVariable(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Variable} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Variable} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Variable} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Variable} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Variable} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getVariables()
	 * @generated
	 */
	Variable getVariable(String name, Type type, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes() <em>Contained Node</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityNodes immediately contained in the StructuredActivityNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_Node()
	 * @see org.eclipse.uml2.uml.ActivityNode#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ActivityNode}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ActivityNode}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityNode}.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode createNode(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ActivityNode} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPins owned by the StructuredActivityNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node Input</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_StructuredNodeInput()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getStructuredNodeInputs();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getStructuredNodeInputs()
	 * @generated
	 */
	InputPin createStructuredNodeInput(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getStructuredNodeInputs()
	 * @generated
	 */
	InputPin createStructuredNodeInput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getStructuredNodeInputs()
	 * @generated
	 */
	InputPin getStructuredNodeInput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getStructuredNodeInputs()
	 * @generated
	 */
	InputPin getStructuredNodeInput(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getOutputs() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins owned by the StructuredActivityNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node Output</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_StructuredNodeOutput()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<OutputPin> getStructuredNodeOutputs();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getStructuredNodeOutputs()
	 * @generated
	 */
	OutputPin createStructuredNodeOutput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getStructuredNodeOutputs()
	 * @generated
	 */
	OutputPin getStructuredNodeOutput(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.OutputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getStructuredNodeOutputs()
	 * @generated
	 */
	OutputPin getStructuredNodeOutput(String name, Type type,
			boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then any object used by an Action within the StructuredActivityNode cannot be accessed by any Action outside the node until the StructuredActivityNode as a whole completes. Any concurrent Actions that would result in accessing such objects are required to have their execution deferred until the completion of the StructuredActivityNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_MustIsolate()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getContainedEdges() <em>Contained Edge</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityEdges immediately contained in the StructuredActivityNode.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_Edge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ActivityEdge}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ActivityEdge}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge createEdge(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge getEdge(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ActivityEdge} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge getEdge(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing ActivityEdges of the OutputPins of a StructuredActivityNode must have targets that are not within the StructuredActivityNode.
	 * output.outgoing.target->excludesAll(allOwnedNodes()-input)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOutputPinEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The edges of a StructuredActivityNode are all the ActivityEdges with source and target ActivityNodes contained directly or indirectly within the StructuredActivityNode and at least one of the source or target not contained in any more deeply nested StructuredActivityNode.
	 * edge=self.sourceNodes().outgoing->intersection(self.allOwnedNodes().incoming)->
	 * 	union(self.targetNodes().incoming->intersection(self.allOwnedNodes().outgoing))->asSet()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming ActivityEdges of an InputPin of a StructuredActivityNode must have sources that are not within the StructuredActivityNode.
	 * input.incoming.source->excludesAll(allOwnedNodes()-output)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputPinEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return those ActivityNodes contained immediately within the StructuredActivityNode that may act as sources of edges owned by the StructuredActivityNode.
	 * result = (node->union(input.oclAsType(ActivityNode)->asSet())->
	 *   union(node->select(oclIsKindOf(Action)).oclAsType(Action).output)->asSet())
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> sourceNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return those ActivityNodes contained immediately within the StructuredActivityNode that may act as targets of edges owned by the StructuredActivityNode.
	 * result = (node->union(output.oclAsType(ActivityNode)->asSet())->
	 *   union(node->select(oclIsKindOf(Action)).oclAsType(Action).input)->asSet())
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> targetNodes();

} // StructuredActivityNode
