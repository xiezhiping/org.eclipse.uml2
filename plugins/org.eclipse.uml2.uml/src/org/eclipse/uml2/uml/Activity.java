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
 *   Christian W. Damus (CEA) - 392957, 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Activity is the specification of parameterized Behavior as the coordinated sequencing of subordinate units.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getOwnedGroups <em>Owned Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getOwnedNodes <em>Owned Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#isSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getPartitions <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getStructuredNodes <em>Structured Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity
		extends Behavior {

	/**
	 * Returns the value of the '<em><b>Owned Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Activity#getGroups() <em>Group</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Group</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_OwnedGroup()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 *        extendedMetaData="name='group' kind='element'"
	 * @generated
	 */
	EList<ActivityGroup> getOwnedGroups();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ActivityGroup}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ActivityGroup}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityGroup} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * @see #getOwnedGroups()
	 * @generated
	 */
	ActivityGroup createOwnedGroup(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedGroups()
	 * @generated
	 */
	ActivityGroup getOwnedGroup(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ActivityGroup} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedGroups()
	 * @generated
	 */
	ActivityGroup getOwnedGroup(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this Activity must not make any changes to objects. The default is false (an Activity may make nonlocal changes). (This is an assertion, not an executable property. It may be used by an execution engine to optimize model execution. If the assertion is violated by the Activity, then the model is ill-formed.)
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_IsReadOnly()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Activity#isReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity <em>In Activity</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level ActivityGroups in the Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Group()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity
	 * @model opposite="inActivity" transient="true" volatile="true" derived="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 *        annotation="http://www.eclipse.org/emf/CDO persistent='true' filter='ownedGroup'"
	 * @generated
	 */
	EList<ActivityGroup> getGroups();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGroups()
	 * @generated
	 */
	ActivityGroup getGroup(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGroups()
	 * @generated
	 */
	ActivityGroup getGroup(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Activity#getNodes() <em>Node</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_OwnedNode()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 *        extendedMetaData="name='node' kind='element'"
	 * @generated
	 */
	EList<ActivityNode> getOwnedNodes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ActivityNode}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ActivityNode}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityNode}.
	 * @see #getOwnedNodes()
	 * @generated
	 */
	ActivityNode createOwnedNode(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedNodes()
	 * @generated
	 */
	ActivityNode getOwnedNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ActivityNode} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedNodes()
	 * @generated
	 */
	ActivityNode getOwnedNode(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, all invocations of the Activity are handled by the same execution.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_IsSingleExecution()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSingleExecution();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Activity#isSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Structured Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.StructuredActivityNode}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Activity#getGroups() <em>Group</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Activity#getNodes() <em>Node</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level StructuredActivityNodes in the Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_StructuredNode()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<StructuredActivityNode> getStructuredNodes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.StructuredActivityNode}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Structured Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.StructuredActivityNode}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to create.
	 * @return The new {@link org.eclipse.uml2.uml.StructuredActivityNode}.
	 * @see #getStructuredNodes()
	 * @generated
	 */
	StructuredActivityNode createStructuredNode(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.StructuredActivityNode}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Structured Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.StructuredActivityNode}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.StructuredActivityNode}.
	 * @see #getStructuredNodes()
	 * @generated
	 */
	StructuredActivityNode createStructuredNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Structured Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getStructuredNodes()
	 * @generated
	 */
	StructuredActivityNode getStructuredNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Structured Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.StructuredActivityNode} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getStructuredNodes()
	 * @generated
	 */
	StructuredActivityNode getStructuredNode(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Parameter with direction other than inout must have exactly one ActivityParameterNode in an Activity.
	 * ownedParameter->forAll(p | 
	 *    p.direction <> ParameterDirectionKind::inout implies node->select(
	 *        oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p)->size()= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMaximumOneParameterNode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Parameter with direction inout must have exactly two ActivityParameterNodes in an Activity, at most one with incoming ActivityEdges and at most one with outgoing ActivityEdges.
	 * ownedParameter->forAll(p | 
	 * p.direction = ParameterDirectionKind::inout implies
	 * let associatedNodes : Set(ActivityNode) = node->select(
	 *        oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p) in 
	 *   associatedNodes->size()=2 and
	 *   associatedNodes->select(incoming->notEmpty())->size()<=1 and
	 *   associatedNodes->select(outgoing->notEmpty())->size()<=1
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMaximumTwoParameterNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Structured Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getStructuredNodes()
	 * @generated NOT
	 */
	StructuredActivityNode getStructuredNode(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Variable}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Variable#getActivityScope <em>Activity Scope</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level Variables defined by the Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Variable()
	 * @see org.eclipse.uml2.uml.Variable#getActivityScope
	 * @model opposite="activityScope" containment="true" resolveProxies="true" ordered="false"
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
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getActivity <em>Activity</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes coordinated by the Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Node()
	 * @see org.eclipse.uml2.uml.ActivityNode#getActivity
	 * @model opposite="activity" transient="true" volatile="true" derived="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 *        annotation="http://www.eclipse.org/emf/CDO persistent='true' filter='ownedNode'"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges expressing flow between the nodes of the Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Edge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getActivity
	 * @model opposite="activity" containment="true" resolveProxies="true" ordered="false"
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
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityPartition}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Activity#getGroups() <em>Group</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Activity#getOwnedGroups() <em>Owned Group</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level ActivityPartitions in the Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Partition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getPartitions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ActivityPartition}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ActivityPartition}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityPartition}.
	 * @see #getPartitions()
	 * @generated
	 */
	ActivityPartition createPartition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPartitions()
	 * @generated
	 */
	ActivityPartition getPartition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ActivityPartition} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPartitions()
	 * @generated
	 */
	ActivityPartition getPartition(String name, boolean ignoreCase,
			boolean createOnDemand);

} // Activity
