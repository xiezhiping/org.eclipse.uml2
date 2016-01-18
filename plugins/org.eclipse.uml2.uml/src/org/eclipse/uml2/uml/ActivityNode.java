/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityNode is an abstract class for points in the flow of an Activity connected by ActivityEdges.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getInInterruptibleRegions <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getRedefinedNodes <em>Redefined Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#getInPartitions <em>In Partition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode
		extends RedefinableElement, ActivityContent {

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges that have the ActivityNode as their source.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_Outgoing()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoings();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
	 */
	ActivityEdge getOutgoing(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutgoings()
	 * @generated
	 */
	ActivityEdge getOutgoing(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes <em>Contained Node</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityGroups containing the ActivityNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_InGroup()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedNodes
	 * @model opposite="containedNode" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getInGroups();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInGroups()
	 * @generated
	 */
	ActivityGroup getInGroup(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInGroups()
	 * @generated
	 */
	ActivityGroup getInGroup(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityPartition#getNodes <em>Node</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityNode#getInGroups() <em>In Group</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityPartitions containing the ActivityNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_InPartition()
	 * @see org.eclipse.uml2.uml.ActivityPartition#getNodes
	 * @model opposite="node" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getInPartitions();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInPartitions()
	 * @generated
	 */
	ActivityPartition getInPartition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInPartitions()
	 * @generated
	 */
	ActivityPartition getInPartition(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.StructuredActivityNode#getNodes <em>Node</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityNode#getInGroups() <em>In Group</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredActivityNode containing the ActvityNode, if it is directly owned by a StructuredActivityNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_InStructuredNode()
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getNodes
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Activity#getNodes <em>Node</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity containing the ActivityNode, if it is directly owned by an Activity.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_Activity()
	 * @see org.eclipse.uml2.uml.Activity#getNodes
	 * @model opposite="node" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityNode#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges that have the ActivityNode as their target.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_Incoming()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncomings();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
	 */
	ActivityEdge getIncoming(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIncomings()
	 * @generated
	 */
	ActivityEdge getIncoming(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InterruptibleActivityRegion}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InterruptibleActivityRegion#getNodes <em>Node</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityNode#getInGroups() <em>In Group</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InterruptibleActivityRegions containing the ActivityNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_InInterruptibleRegion()
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#getNodes
	 * @model opposite="node" ordered="false"
	 * @generated
	 */
	EList<InterruptibleActivityRegion> getInInterruptibleRegions();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InterruptibleActivityRegion} with the specified '<em><b>Name</b></em>' from the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterruptibleActivityRegion} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InterruptibleActivityRegion} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInInterruptibleRegions()
	 * @generated
	 */
	InterruptibleActivityRegion getInInterruptibleRegion(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InterruptibleActivityRegion} with the specified '<em><b>Name</b></em>' from the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterruptibleActivityRegion} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.InterruptibleActivityRegion} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInInterruptibleRegions()
	 * @generated
	 */
	InterruptibleActivityRegion getInInterruptibleRegion(String name,
			boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Redefined Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes from a generalization of the Activity containining this ActivityNode that are redefined by this ActivityNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Node</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityNode_RedefinedNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getRedefinedNodes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedNodes()
	 * @generated
	 */
	ActivityNode getRedefinedNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedNodes()
	 * @generated
	 */
	ActivityNode getRedefinedNode(String name, boolean ignoreCase,
			EClass eClass);

} // ActivityNode
