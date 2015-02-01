/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Node is computational resource upon which artifacts may be deployed for execution. Nodes can be interconnected through communication paths to define network structures.
 * <p>From package UML::Deployments.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Node#getNestedNodes <em>Nested Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getNode()
 * @model
 * @generated
 */
public interface Node
		extends org.eclipse.uml2.uml.Class, DeploymentTarget {

	/**
	 * Returns the value of the '<em><b>Nested Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Node}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Nodes that are defined (nested) within the Node.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNode_NestedNode()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Node> getNestedNodes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Node}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Node}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Node} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Node}.
	 * @see #getNestedNodes()
	 * @generated
	 */
	Node createNestedNode(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Node}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Node}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Node}.
	 * @see #getNestedNodes()
	 * @generated
	 */
	Node createNestedNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Node} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Node} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Node} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedNodes()
	 * @generated
	 */
	Node getNestedNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Node} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Node} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Node} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Node} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Node} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNestedNodes()
	 * @generated
	 */
	Node getNestedNode(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal structure of a Node (if defined) consists solely of parts of type Node.
	 * part->forAll(oclIsKindOf(Node))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInternalStructure(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a (binary) communication path between this node and the specified other node, with the specified navigabilities, aggregations, names, lower bounds, and upper bounds, and owned by this node's nearest package.
	 * @param end1IsNavigable The navigability for the first end of the new communication path.
	 * @param end1Aggregation The aggregation for the first end of the new communication path.
	 * @param end1Name The name for the first end of the new communication path.
	 * @param end1Lower The lower bound for the first end of the new communication path.
	 * @param end1Upper The upper bound for the first end of the new communication path.
	 * @param end1Node The type for the first end of the new communication path.
	 * @param end2IsNavigable The navigability for the second end of the new communication path.
	 * @param end2Aggregation The aggregation for the second end of the new communication path.
	 * @param end2Name The name for the second end of the new communication path.
	 * @param end2Lower The lower bound for the second end of the new communication path.
	 * @param end2Upper The upper bound for the second end of the new communication path.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" end1IsNavigableDataType="org.eclipse.uml2.types.Boolean" end1IsNavigableRequired="true" end1IsNavigableOrdered="false" end1AggregationRequired="true" end1AggregationOrdered="false" end1NameDataType="org.eclipse.uml2.types.String" end1NameRequired="true" end1NameOrdered="false" end1LowerDataType="org.eclipse.uml2.types.Integer" end1LowerRequired="true" end1LowerOrdered="false" end1UpperDataType="org.eclipse.uml2.types.UnlimitedNatural" end1UpperRequired="true" end1UpperOrdered="false" end1NodeRequired="true" end1NodeOrdered="false" end2IsNavigableDataType="org.eclipse.uml2.types.Boolean" end2IsNavigableRequired="true" end2IsNavigableOrdered="false" end2AggregationRequired="true" end2AggregationOrdered="false" end2NameDataType="org.eclipse.uml2.types.String" end2NameRequired="true" end2NameOrdered="false" end2LowerDataType="org.eclipse.uml2.types.Integer" end2LowerRequired="true" end2LowerOrdered="false" end2UpperDataType="org.eclipse.uml2.types.UnlimitedNatural" end2UpperRequired="true" end2UpperOrdered="false"
	 * @generated
	 */
	CommunicationPath createCommunicationPath(boolean end1IsNavigable,
			AggregationKind end1Aggregation, String end1Name, int end1Lower,
			int end1Upper, Node end1Node, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name, int end2Lower,
			int end2Upper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the communication paths in which this node is involved.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<CommunicationPath> getCommunicationPaths();

} // Node
