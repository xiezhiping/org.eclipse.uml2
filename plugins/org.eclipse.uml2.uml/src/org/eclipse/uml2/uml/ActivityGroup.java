/*
 * Copyright (c) 2005, 2011 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 351774
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityGroup is an abstract class for defining sets of nodes and edges in an activity.
 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * </p>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Groups immediately contained in the group.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subgroup</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityGroup_Subgroup()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSuperGroup
	 * @model opposite="superGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getSubgroups();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubgroups()
	 * @generated
	 */
	ActivityGroup getSubgroup(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>' from the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityGroup} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityGroup} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubgroups()
	 * @generated
	 */
	ActivityGroup getSubgroup(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityGroup#getSubgroups <em>Subgroup</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * </p>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group immediately containing the group.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityGroup_SuperGroup()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSubgroups
	 * @model opposite="subgroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getInGroups <em>In Group</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes immediately contained in the group.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityGroup_ContainedNode()
	 * @see org.eclipse.uml2.uml.ActivityNode#getInGroups
	 * @model opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getContainedNodes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
	 */
	ActivityNode getContainedNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
	 */
	ActivityNode getContainedNode(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>In Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Activity#getGroups <em>Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity containing the group.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Activity</em>' reference.
	 * @see #setInActivity(Activity)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityGroup_InActivity()
	 * @see org.eclipse.uml2.uml.Activity#getGroups
	 * @model opposite="group" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Activity getInActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity <em>In Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Activity</em>' reference.
	 * @see #getInActivity()
	 * @generated
	 */
	void setInActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getInGroups <em>In Group</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges immediately contained in the group.
	 * <p>Merged from package UML (URI {@literal http://www.omg.org/spec/UML/20110701}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityGroup_ContainedEdge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInGroups
	 * @model opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdges();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedEdges()
	 * @generated
	 */
	ActivityEdge getContainedEdge(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedEdges()
	 * @generated
	 */
	ActivityEdge getContainedEdge(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All nodes and edges of the group must be in the same activity as the group.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNodesAndEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No node or edge in a group may be contained by its subgroups or its containing groups, transitively.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotContained(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Groups may only be owned by activities or groups.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGroupOwned(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ActivityGroup
