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
 * $Id: Node.java,v 1.7 2006/12/14 15:49:27 khussey Exp $
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
 * A node is computational resource upon which artifacts may be deployed for execution.
 * Nodes can be interconnected through communication paths to define network structures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Node#getNestedNodes <em>Nested Node</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Nodes that are defined (nested) within the Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNode_NestedNode()
	 * @model type="org.eclipse.uml2.uml.Node" containment="true" resolveProxies="true" ordered="false"
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
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInternalStructure(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Node
