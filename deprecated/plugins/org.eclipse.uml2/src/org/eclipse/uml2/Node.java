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
 * $Id: Node.java,v 1.7 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the metamodel, a Node is a subclass of Class. It is associated with a Deployment of an Artifact. It is also associated with a set of Elements that are deployed on it. This is a derived association in that these PackageableElements are involved in a Manifestation of an Artifact that is deployed on the Node. Nodes may have an internal structure defined in terms of parts and connectors associated with them for advanced modeling applications. 
 * <!-- end-model-doc -->
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
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * @model type="org.eclipse.uml2.Node" containment="true" ordered="false"
	 * @generated
	 */
	EList getNestedNodes();


    /**
     * Retrieves the {@link org.eclipse.uml2.Node} with the specified '<em><b>Name</b></em>' from the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Node} to retrieve.
	 * @return The {@link org.eclipse.uml2.Node} with the specified '<em><b>Name</b></em>', or <code>null</code>.
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
     * Creates a {@link org.eclipse.uml2.Node} and appends it to the '<em><b>Nested Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Node}.
	 * @see #getNestedNodes()
	 * @generated
     */
    Node createNestedNode();

} // Node
