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
 * $Id: StructuredActivityNode.java,v 1.2 2005/11/28 20:26:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured activity node represents a structured portion of the activity that is not shared with any other structured node, except for nesting. It may have control edges connected to it, and pins when merged with CompleteStructuredActivities. The execution of any embedded actions may not begin until the structured activity node has received its object and control tokens. The availability of output tokens from the structured activity node does not occur until all embedded actions have completed execution.
 * 
 * 
 * 
 * Note - Any required isolation may be achieved using a locking mechanisms, or it may simply sequentialize execution to avoid concurrency conflicts. Isolation is different from the property of "atomicity", which is the guarantee that a group of actions either all complete successfully or have no effect at all. Atomicity generally requires a rollback mechanism to prevent committing partial results.
 * 
 * 
 * A structured activity node represents a structured portion of the activity that is not shared with any other structured node, except for nesting. It may have control edges connected to it, and pins in CompleteStructuredActivities. The execution of any embedded actions may not begin until the structured activity node has received its object and control tokens. The availability of output tokens from the structured activity node does not occur until all embedded actions have completed execution.
 * 
 * 
 * 
 * Because of the concurrent nature of the execution of actions within and across activities, it can be difficult to guarantee the consistent access and modification of object memory. In order to avoid race conditions or other concurrency-related problems, it is sometimes necessary to isolate the effects of a group of actions from the effects of actions outside the group. This may be indicated by setting the mustIsolate attribute to true on a structured activity node. If a structured activity node is "isolated," then any object used by an action within the node cannot be accessed by any action outside the node until the structured activity node as a whole completes. Any concurrent actions that would result in accessing such objects are required to have their execution deferred until the completion of the node.
 * 
 * 
 * 
 * Note - Any required isolation may be achieved using a locking mechanisms, or it may simply sequentialize execution to avoid concurrency conflicts. Isolation is different from the property of "atomicity", which is the guarantee that a group of actions either all complete successfully or have no effect at all. Atomicity generally requires a rollback mechanism to prevent committing partial results.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getEdges <em>Edge</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A variable defined in the scope of the structured activity node. It has no value and may not be accessed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_Variable()
	 * @see org.eclipse.uml2.uml.Variable#getScope
	 * @model type="org.eclipse.uml2.uml.Variable" opposite="scope" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getVariables();

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
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes immediately contained in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_Node()
	 * @see org.eclipse.uml2.uml.ActivityNode#getInStructuredNode
	 * @model type="org.eclipse.uml2.uml.ActivityNode" opposite="inStructuredNode" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getNodes();

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
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then the actions in the node execute in isolation from actions outside the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #isSetMustIsolate()
	 * @see #unsetMustIsolate()
	 * @see #setMustIsolate(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_MustIsolate()
	 * @model unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isSetMustIsolate()
	 * @see #unsetMustIsolate()
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustIsolate()
	 * @see #isMustIsolate()
	 * @see #setMustIsolate(boolean)
	 * @generated
	 */
	void unsetMustIsolate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Isolate</em>' attribute is set.
	 * @see #unsetMustIsolate()
	 * @see #isMustIsolate()
	 * @see #setMustIsolate(boolean)
	 * @generated
	 */
	boolean isSetMustIsolate();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges immediately contained in the structured node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStructuredActivityNode_Edge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInStructuredNode
	 * @model type="org.eclipse.uml2.uml.ActivityEdge" opposite="inStructuredNode" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getEdges();

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
	 * Creates a {@link org.eclipse.uml2.uml.ActivityEdge} and appends it to the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge createEdge();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The edges owned by a structured node must have source and target nodes in the structured node, and vice versa.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEdges(DiagnosticChain diagnostics, Map context);

} // StructuredActivityNode
