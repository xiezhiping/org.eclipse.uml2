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
 * $Id: BehavioredClassifier.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getImplementations <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedStateMachines <em>Owned State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier extends Classifier{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Behavior}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Behavior#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_OwnedBehavior()
	 * @see org.eclipse.uml2.Behavior#getContext
	 * @model type="org.eclipse.uml2.Behavior" opposite="context" containment="true" volatile="true"
	 * @generated
	 */
	EList getOwnedBehaviors();

    /**
     * Retrieves the {@link org.eclipse.uml2.Behavior} with the specified name from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.Behavior} with the specified name, or <code>null</code>.
	 * @see #getOwnedBehaviors()
	 * @generated
     */
    Behavior getOwnedBehavior(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Behavior} and appends it to the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.Behavior}.
	 * @see #getOwnedBehaviors()
	 * @generated
     */
    Behavior createOwnedBehavior(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_ClassifierBehavior()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Implementation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Implementation#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_Implementation()
	 * @see org.eclipse.uml2.Implementation#getImplementingClassifier
	 * @model type="org.eclipse.uml2.Implementation" opposite="implementingClassifier" containment="true" volatile="true"
	 * @generated
	 */
	EList getImplementations();

    /**
     * Retrieves the {@link org.eclipse.uml2.Implementation} with the specified name from the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Implementation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Implementation} with the specified name, or <code>null</code>.
	 * @see #getImplementations()
	 * @generated
     */
    Implementation getImplementation(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Implementation} and appends it to the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Implementation} to create.
	 * @return The new {@link org.eclipse.uml2.Implementation}.
	 * @see #getImplementations()
	 * @generated
     */
    Implementation createImplementation(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.StateMachine}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machine</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_OwnedStateMachine()
	 * @see org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext
	 * @model type="org.eclipse.uml2.StateMachine" opposite="stateMachine_redefinitionContext" containment="true" volatile="true"
	 * @generated
	 */
	EList getOwnedStateMachines();

    /**
     * Retrieves the {@link org.eclipse.uml2.StateMachine} with the specified name from the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.StateMachine} to retrieve.
	 * @return The {@link org.eclipse.uml2.StateMachine} with the specified name, or <code>null</code>.
	 * @see #getOwnedStateMachines()
	 * @generated
     */
    StateMachine getOwnedStateMachine(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.StateMachine} and appends it to the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.StateMachine} to create.
	 * @return The new {@link org.eclipse.uml2.StateMachine}.
	 * @see #getOwnedStateMachines()
	 * @generated
     */
    StateMachine createOwnedStateMachine(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

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
	 * @model parameters=""
	 * @generated
	 */
	EList getClientDependencies();

} // BehavioredClassifier
