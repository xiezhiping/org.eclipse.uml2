/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *
 * $Id: SequenceNode.java,v 1.9 2008/01/09 18:56:02 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sequence node is a structured activity node that executes its actions in order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.SequenceNode#getExecutableNodes <em>Executable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getSequenceNode()
 * @model
 * @generated
 */
public interface SequenceNode
		extends StructuredActivityNode {

	/**
	 * Returns the value of the '<em><b>Executable Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * <p>
	 * This feature redefines the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredActivityNode#getNodes() <em>Node</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ordered set of executable nodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executable Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getSequenceNode_ExecutableNode()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ExecutableNode> getExecutableNodes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ExecutableNode}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ExecutableNode}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * @see #getExecutableNodes()
	 * @generated
	 */
	ExecutableNode createExecutableNode(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExecutableNodes()
	 * @generated
	 */
	ExecutableNode getExecutableNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ExecutableNode} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExecutableNodes()
	 * @generated
	 */
	ExecutableNode getExecutableNode(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

} // SequenceNode
