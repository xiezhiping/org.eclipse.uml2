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
 * $Id: ActivityNode.java,v 1.7 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityNode#getInInterruptibleRegions <em>In Interruptible Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends RedefinableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_Outgoing()
	 * @see org.eclipse.uml2.ActivityEdge#getSource
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="source" ordered="false"
	 * @generated
	 */
	EList getOutgoings();


    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
     */
    ActivityEdge getOutgoing(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_Incoming()
	 * @see org.eclipse.uml2.ActivityEdge#getTarget
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="target" ordered="false"
	 * @generated
	 */
	EList getIncomings();


    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
     */
    ActivityEdge getIncoming(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_InGroup()
	 * @model type="org.eclipse.uml2.ActivityGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getInGroups();


	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Activity#getNodes <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_Activity()
	 * @see org.eclipse.uml2.Activity#getNodes
	 * @model opposite="node"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);


	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_RedefinedElement()
	 * @model type="org.eclipse.uml2.ActivityNode" ordered="false"
	 * @generated
	 */
	EList getRedefinedElements();


    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
     */
    RedefinableElement getRedefinedElement(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.StructuredActivityNode#getContainedNodes <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structured activity node containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_InStructuredNode()
	 * @see org.eclipse.uml2.StructuredActivityNode#getContainedNodes
	 * @model opposite="containedNode"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);


	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityPartition#getContainedNodes <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_InPartition()
	 * @see org.eclipse.uml2.ActivityPartition#getContainedNodes
	 * @model type="org.eclipse.uml2.ActivityPartition" opposite="containedNode" ordered="false"
	 * @generated
	 */
	EList getInPartitions();


    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityPartition} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInPartitions()
	 * @generated
     */
    ActivityPartition getInPartition(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InterruptibleActivityRegion}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InterruptibleActivityRegion#getContainedNodes <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interruptible Region</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_InInterruptibleRegion()
	 * @see org.eclipse.uml2.InterruptibleActivityRegion#getContainedNodes
	 * @model type="org.eclipse.uml2.InterruptibleActivityRegion" opposite="containedNode" ordered="false"
	 * @generated
	 */
	EList getInInterruptibleRegions();


} // ActivityNode
