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
 * $Id: ProtocolTransition.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.ProtocolTransition#getReferreds <em>Referred</em>}</li>
 *   <li>{@link org.eclipse.uml2.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProtocolTransition()
 * @model 
 * @generated
 */
public interface ProtocolTransition extends Transition{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getProtocolTransition_PostCondition()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ProtocolTransition#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

    /**
     * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getPostCondition()
	 * @generated
     */
    Constraint createPostCondition(EClass eClass);
     
	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProtocolTransition_Referred()
	 * @model type="org.eclipse.uml2.Operation" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getReferreds();

    /**
     * Retrieves the {@link org.eclipse.uml2.Operation} with the specified name from the '<em><b>Referred</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Operation} with the specified name, or <code>null</code>.
	 * @see #getReferreds()
	 * @generated
     */
    Operation getReferred(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getProtocolTransition_PreCondition()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setGuard(Constraint value);

} // ProtocolTransition
