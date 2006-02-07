/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Activity.java,v 1.9 2006/02/07 18:23:04 khussey Exp $
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
 * An activity specifies the coordination of executions of subordinate behaviors, using a control and data flow model. The subordinate behaviors coordinated by these models may be initiated because other behaviors in the model finish executing, because objects and data become available, or because events occur external to the flow. The flow of execution is modeled as activity nodes connected by activity edges. A node can be the execution of a subordinate behavior, such as an arithmetic computation, a call to an operation, or manipulation of object contents. Activity nodes also include flow-of-control constructs, such as synchronization, decision, and concurrency control. Activities may form invocation hierarchies invoking other activities, ultimately resolving to individual actions. In an object-oriented model, activities are usually invoked indirectly as methods bound to operations that are directly invoked. 
 * 
 * 
 * 
 * Activities may describe procedural computation. In this context, they are the methods corresponding to operations on classes. Activities may be applied to organizational modeling for business process engineering and workflow. In this context, events often originate from inside the system, such as the finishing of a task, but also from outside the system, such as a customer call. Activities can also be used for information system modeling to specify system level processes. Activities may contain actions of various kinds:
 * 
 * - occurrences of primitive functions, such as arithmetic functions.
 * 
 * - invocations of behavior, such as activities.
 * 
 * - communication actions, such as sending of signals.
 * 
 * - manipulations of objects, such as reading or writing attributes or associations.
 * 
 * 
 * 
 * Actions have no further decomposition in the activity containing them. However, the execution of a single action may induce the execution of many other actions. For example, a call action invokes an operation which is implemented by an activity containing actions that execute before the call action completes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getStructuredNodes <em>Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getPartitions <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#isSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getGroups <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity
		extends Behavior {

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this activity must not make any changes to variables outside the activity or to objects. (This is an assertion, not an executable property. It may be used by an execution engine to optimize model execution. If the assertion is violated by the action, then the model is ill-formed.) The default is false (an activity may make nonlocal changes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_IsReadOnly()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
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
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity <em>In Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level groups in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Group()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity
	 * @model type="org.eclipse.uml2.uml.ActivityGroup" opposite="inActivity" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getGroups();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ActivityGroup} and appends it to the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityGroup} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * @see #getGroups()
	 * @generated
	 */
	ActivityGroup createGroup(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, all invocations of the activity are handled by the same execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_IsSingleExecution()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
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
	 * Returns the value of the '<em><b>Structured Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.StructuredActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level structured nodes in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_StructuredNode()
	 * @model type="org.eclipse.uml2.uml.StructuredActivityNode" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getStructuredNodes();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Structured Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.StructuredActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.StructuredActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getStructuredNodes()
	 * @generated
	 */
	StructuredActivityNode getStructuredNode(String name);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Variable}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Variable#getActivityScope <em>Activity Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level variables in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Variable()
	 * @see org.eclipse.uml2.uml.Variable#getActivityScope
	 * @model type="org.eclipse.uml2.uml.Variable" opposite="activityScope" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getVariables();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Variable} and appends it to the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Variable}.
	 * @see #getVariables()
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Variable} with the specified '<em><b>Name</b></em>' from the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Variable} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Variable} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getVariables()
	 * @generated
	 */
	Variable getVariable(String name);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes coordinated by the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Node()
	 * @see org.eclipse.uml2.uml.ActivityNode#getActivity
	 * @model type="org.eclipse.uml2.uml.ActivityNode" opposite="activity" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ActivityNode} and appends it to the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityNode}.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode createNode(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges expressing flow between nodes of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Edge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getActivity
	 * @model type="org.eclipse.uml2.uml.ActivityEdge" opposite="activity" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getEdges();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ActivityEdge} and appends it to the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge createEdge(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge getEdge(String name);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level partitions in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivity_Partition()
	 * @model type="org.eclipse.uml2.uml.ActivityPartition" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getPartitions();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPartitions()
	 * @generated
	 */
	ActivityPartition getPartition(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The groups of an activity have no supergroups.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoSupergroups(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nodes of the activity must include one ActivityParameterNode for each parameter.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateActivityParameterNode(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity cannot be autonomous and have a classifier or behavioral feature context at the same time.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAutonomous(DiagnosticChain diagnostics, Map context);

} // Activity
