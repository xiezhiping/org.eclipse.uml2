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
 * $Id: ConnectionPointReference.java,v 1.6 2005/03/15 18:44:42 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connection point references of a submachine state can be used as sources/targets of transitions. They represent entries into or exits out of the submachine state machine referenced by the submachine state. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ConnectionPointReference#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.ConnectionPointReference#getExits <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getConnectionPointReference()
 * @model 
 * @generated
 */
public interface ConnectionPointReference extends Vertex{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entryPoint kind pseudo states corresponding to this connection point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnectionPointReference_Entry()
	 * @model type="org.eclipse.uml2.Pseudostate" ordered="false"
	 * @generated
	 */
	EList getEntries();

    /**
     * Retrieves the {@link org.eclipse.uml2.Pseudostate} with the specified name from the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Pseudostate} to retrieve.
	 * @return The {@link org.eclipse.uml2.Pseudostate} with the specified name, or <code>null</code>.
	 * @see #getEntries()
	 * @generated
     */
    Pseudostate getEntry(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exitPoints kind pseudo states corresponding to this connection point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnectionPointReference_Exit()
	 * @model type="org.eclipse.uml2.Pseudostate" ordered="false"
	 * @generated
	 */
	EList getExits();

    /**
     * Retrieves the {@link org.eclipse.uml2.Pseudostate} with the specified name from the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Pseudostate} to retrieve.
	 * @return The {@link org.eclipse.uml2.Pseudostate} with the specified name, or <code>null</code>.
	 * @see #getExits()
	 * @generated
     */
    Pseudostate getExit(String unqualifiedName);
      
} // ConnectionPointReference
