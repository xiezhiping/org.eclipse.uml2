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
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
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
 * A SequenceNode is a StructuredActivityNode that executes a sequence of ExecutableNodes in order.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.SequenceNode#getExecutableNodes <em>Executable Node</em>}</li>
 * </ul>
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
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.StructuredActivityNode#getNodes() <em>Node</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of ExecutableNodes to be sequenced.
	 * <p>From package UML::Actions.</p>
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
