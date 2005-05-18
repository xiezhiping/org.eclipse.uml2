/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifier.java,v 1.11 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getImplementations <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioredClassifier#getOwnedTriggers <em>Owned Trigger</em>}</li>
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
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * <!-- begin-model-doc -->
	 * References behavior specifications owned by a classifier. (Specializes Namespace.owned- Member.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_OwnedBehavior()
	 * @see org.eclipse.uml2.Behavior#getContext
	 * @model type="org.eclipse.uml2.Behavior" opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedBehaviors();


    /**
     * Retrieves the {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
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
	 * <!-- begin-model-doc -->
	 * A behavior specification that specifies the behavior of the classifier itself. (Specializes BehavioredClassifier.ownedBehavior.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_ClassifierBehavior()
	 * @model resolveProxies="false"
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
	 * <!-- begin-model-doc -->
	 * (Specializes Element.ownedElement and Realization.clientDependency.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_Implementation()
	 * @see org.eclipse.uml2.Implementation#getImplementingClassifier
	 * @model type="org.eclipse.uml2.Implementation" opposite="implementingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList getImplementations();


    /**
     * Retrieves the {@link org.eclipse.uml2.Implementation} with the specified '<em><b>Name</b></em>' from the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Implementation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Implementation} with the specified '<em><b>Name</b></em>', or <code>null</code>.
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
	 * @generated NOT
	 * @deprecated Use #createImplementation() instead.
     */
    Implementation createImplementation(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.Implementation} and appends it to the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Implementation}.
	 * @see #getImplementations()
	 * @generated
     */
    Implementation createImplementation();

	/**
	 * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioredClassifier_OwnedTrigger()
	 * @model type="org.eclipse.uml2.Trigger" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedTriggers();


    /**
     * Retrieves the {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Trigger} to retrieve.
	 * @return The {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTriggers()
	 * @generated
     */
    Trigger getOwnedTrigger(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Trigger} and appends it to the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Trigger} to create.
	 * @return The new {@link org.eclipse.uml2.Trigger}.
	 * @see #getOwnedTriggers()
	 * @generated
     */
    Trigger createOwnedTrigger(EClass eClass);

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
	 * @model type="org.eclipse.uml2.StateMachine" opposite="stateMachine_redefinitionContext" containment="true" volatile="true" ordered="false"
	 * @generated
	 */
	EList getOwnedStateMachines();


    /**
     * Retrieves the {@link org.eclipse.uml2.StateMachine} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.StateMachine} to retrieve.
	 * @return The {@link org.eclipse.uml2.StateMachine} with the specified '<em><b>Name</b></em>', or <code>null</code>.
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
     * Creates a {@link org.eclipse.uml2.StateMachine} and appends it to the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.StateMachine}.
	 * @see #getOwnedStateMachines()
	 * @generated
     */
    StateMachine createOwnedStateMachine();

	// <!-- begin-custom-operations -->
	
	/**
	 * Retrieves the interfaces on which this behaviored classifier has an
	 * implementation dependency.
	 * 
	 * @return The interfaces implemented by this behaviored classifier.
	 */
	Set getImplementedInterfaces();

	/**
	 * Retrieves the interfaces on which this behaviored classifier or any of
	 * its parents has an implementation dependency.
	 * 
	 * @return The interfaces implemented by the specified behaviored classifier
	 *         or any of its parents.
	 */
	Set getAllImplementedInterfaces();

	/**
	 * Creates an implementation where this behaviored classifier is the
	 * implementing classifier and the specified interface is the contract.
	 * 
	 * @param contract
	 *            The contract for the implementation.
	 * @return The new implementation.
	 * @exception IllegalArgumentException
	 *                If this behaviored classifier or any of its parents is
	 *                already an implementing classifier of the interface.
	 */
	Implementation createImplementation(Interface contract);

	// <!-- end-custom-operations -->

} // BehavioredClassifier
