/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: Dependency.java,v 1.5 2004/06/06 01:35:07 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A dependency is a relationship that signifies that a single or a set of model elements requires other model elements for their specification or implementation. This means that the complete semantics of the depending elements is either semantically or structurally dependent on the definition of the supplier element(s). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Dependency#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.Dependency#getSuppliers <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDependency()
 * @model 
 * @generated
 */
public interface Dependency extends PackageableElement, DirectedRelationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.NamedElement#getClientDependencies <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that is affected by the supplier element. In some cases (such as a Trace Abstraction) the direction is unimportant and serves only to distinguish the two elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getDependency_Client()
	 * @see org.eclipse.uml2.NamedElement#getClientDependencies
	 * @model type="org.eclipse.uml2.NamedElement" opposite="clientDependency" required="true" volatile="true" ordered="false"
	 * @generated
	 */
	EList getClients();

    /**
     * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified name from the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified name, or <code>null</code>.
	 * @see #getClients()
	 * @generated
     */
    NamedElement getClient(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the element that is unaffected by a change. In a two-way relationship (such as some Refinement Abstractions) this would be the more general element. In an undirected situation, such as a Trace Abstraction, the choice of client and supplier is not relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getDependency_Supplier()
	 * @model type="org.eclipse.uml2.NamedElement" required="true" volatile="true" ordered="false"
	 * @generated
	 */
	EList getSuppliers();

    /**
     * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified name from the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified name, or <code>null</code>.
	 * @see #getSuppliers()
	 * @generated
     */
    NamedElement getSupplier(String unqualifiedName);
      
} // Dependency
