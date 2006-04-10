/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ActivityGroup.java,v 1.12 2006/04/10 20:40:27 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Activity groups are a generic grouping construct for nodes and edges. Nodes and edges can belong to more than group. They have no inherent semantics and can be used for various purposes. Subclasses of ActivityGroup may add semantics. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_SuperGroup()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ActivityGroup getSuperGroup();


	/**
	 * Returns the value of the '<em><b>Activity Group activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Activity#getGroups <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Group activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity containing the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Group activity</em>' container reference.
	 * @see #setActivityGroup_activity(Activity)
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_ActivityGroup_activity()
	 * @see org.eclipse.uml2.Activity#getGroups
	 * @model opposite="group" resolveProxies="false"
	 * @generated
	 */
	Activity getActivityGroup_activity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Group activity</em>' container reference.
	 * @see #getActivityGroup_activity()
	 * @generated
	 */
	void setActivityGroup_activity(Activity value);


	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_Subgroup()
	 * @see org.eclipse.uml2.ActivityGroup#getSuperGroup
	 * @model type="org.eclipse.uml2.ActivityGroup" opposite="superGroup" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getSubgroups();



	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getInGroups <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_ContainedEdge()
	 * @see org.eclipse.uml2.ActivityEdge#getInGroups
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
    EList getContainedEdges();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedEdges()
	 * @generated
	 */
    ActivityEdge getContainedEdge(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedEdges()
	 * @generated
	 */
	ActivityEdge getContainedEdge(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getInGroups <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_ContainedNode()
	 * @see org.eclipse.uml2.ActivityNode#getInGroups
	 * @model type="org.eclipse.uml2.ActivityNode" opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getContainedNodes();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
	 */
    ActivityNode getContainedNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
	 */
	ActivityNode getContainedNode(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Activity#getNodes <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.uml2.UML2Package#getActivityNode_Activity()
	 * @see org.eclipse.uml2.Activity#getNodes
	 * @model opposite="node" resolveProxies="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityGroup#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);


} // ActivityGroup
