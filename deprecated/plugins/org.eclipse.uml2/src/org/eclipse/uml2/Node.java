/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Node#getNestedNodes <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getNode()
 * @model 
 * @generated
 */
public interface Node extends org.eclipse.uml2.Class, DeploymentTarget{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Nested Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getNode_NestedNode()
	 * @model type="org.eclipse.uml2.Node" containment="true"
	 * @generated
	 */
	EList getNestedNodes();

    /**
     * Retrieves the {@link org.eclipse.uml2.Node} with the specified name from the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Node} to retrieve.
	 * @return The {@link org.eclipse.uml2.Node} with the specified name, or <code>null</code>.
	 * @see #getNestedNodes()
	 * @generated
     */
    Node getNestedNode(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Node} and appends it to the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Node} to create.
	 * @return The new {@link org.eclipse.uml2.Node}.
	 * @see #getNestedNodes()
	 * @generated
     */
    Node createNestedNode(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getNestedClassifiers();

} // Node
