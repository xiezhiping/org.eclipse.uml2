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
 * $Id: SequenceNode.java,v 1.3 2006/02/21 16:12:19 khussey Exp $
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ordered set of executable nodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executable Node</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getSequenceNode_ExecutableNode()
	 * @model type="org.eclipse.uml2.uml.ExecutableNode" containment="true"
	 * @generated
	 */
	EList getExecutableNodes();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ExecutableNode} and appends it to the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ExecutableNode} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ExecutableNode}.
	 * @see #getExecutableNodes()
	 * @generated
	 */
	ExecutableNode createExecutableNode(EClass eClass);

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExecutableNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ExecutableNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExecutableNodes()
	 * @generated
	 */
	ExecutableNode getExecutableNode(String name);

} // SequenceNode
