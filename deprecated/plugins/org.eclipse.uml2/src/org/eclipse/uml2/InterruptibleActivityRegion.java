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
 * $Id: InterruptibleActivityRegion.java,v 1.5 2005/03/15 18:44:42 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interruptible region contains activity nodes. When a token leaves an interruptible region via edges designated by the region as interrupting edges, all tokens and behaviors in the region are terminated. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InterruptibleActivityRegion#getInterruptingEdges <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.InterruptibleActivityRegion#getContainedNodes <em>Contained Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInterruptibleActivityRegion()
 * @model 
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupting Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * .The edges leaving the region that will abort other tokens flowing in the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterruptibleActivityRegion_InterruptingEdge()
	 * @see org.eclipse.uml2.ActivityEdge#getInterrupts
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="interrupts" ordered="false"
	 * @generated
	 */
	EList getInterruptingEdges();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified name from the '<em><b>Interrupting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified name, or <code>null</code>.
	 * @see #getInterruptingEdges()
	 * @generated
     */
    ActivityEdge getInterruptingEdge(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getInInterruptibleRegions <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInterruptibleActivityRegion_ContainedNode()
	 * @see org.eclipse.uml2.ActivityNode#getInInterruptibleRegions
	 * @model type="org.eclipse.uml2.ActivityNode" opposite="inInterruptibleRegion"
	 * @generated
	 */
	EList getContainedNodes();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
     */
    ActivityNode getContainedNode(String unqualifiedName);
      
} // InterruptibleActivityRegion
