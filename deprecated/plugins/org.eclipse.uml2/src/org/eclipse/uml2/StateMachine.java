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
 * $Id: StateMachine.java,v 1.6 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.StateMachine#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.StateMachine#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Behavior{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Region}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStateMachine_Region()
	 * @see org.eclipse.uml2.Region#getStateMachine
	 * @model type="org.eclipse.uml2.Region" opposite="stateMachine" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getRegions();


    /**
     * Retrieves the {@link org.eclipse.uml2.Region} with the specified '<em><b>Name</b></em>' from the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Region} to retrieve.
	 * @return The {@link org.eclipse.uml2.Region} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRegions()
	 * @generated
     */
    Region getRegion(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Region} and appends it to the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Region} to create.
	 * @return The new {@link org.eclipse.uml2.Region}.
	 * @see #getRegions()
	 * @generated NOT
	 * @deprecated Use #createRegion() instead.
     */
    Region createRegion(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.Region} and appends it to the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Region}.
	 * @see #getRegions()
	 * @generated
     */
    Region createRegion();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getStateMachine_ConnectionPoint()
	 * @model type="org.eclipse.uml2.Pseudostate" containment="true" ordered="false"
	 * @generated
	 */
	EList getConnectionPoints();


    /**
     * Retrieves the {@link org.eclipse.uml2.Pseudostate} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Pseudostate} to retrieve.
	 * @return The {@link org.eclipse.uml2.Pseudostate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnectionPoints()
	 * @generated
     */
    Pseudostate getConnectionPoint(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Pseudostate} and appends it to the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Pseudostate} to create.
	 * @return The new {@link org.eclipse.uml2.Pseudostate}.
	 * @see #getConnectionPoints()
	 * @generated NOT
	 * @deprecated Use #createConnectionPoint() instead.
     */
    Pseudostate createConnectionPoint(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.Pseudostate} and appends it to the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Pseudostate}.
	 * @see #getConnectionPoints()
	 * @generated
     */
    Pseudostate createConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' reference.
	 * @see #setExtendedStateMachine(StateMachine)
	 * @see org.eclipse.uml2.UML2Package#getStateMachine_ExtendedStateMachine()
	 * @model
	 * @generated
	 */
	StateMachine getExtendedStateMachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended State Machine</em>' reference.
	 * @see #getExtendedStateMachine()
	 * @generated
	 */
	void setExtendedStateMachine(StateMachine value);


	/**
	 * Returns the value of the '<em><b>State Machine redefinition Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.BehavioredClassifier#getOwnedStateMachines <em>Owned State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine redefinition Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine redefinition Context</em>' container reference.
	 * @see #setStateMachine_redefinitionContext(BehavioredClassifier)
	 * @see org.eclipse.uml2.UML2Package#getStateMachine_StateMachine_redefinitionContext()
	 * @see org.eclipse.uml2.BehavioredClassifier#getOwnedStateMachines
	 * @model opposite="ownedStateMachine" volatile="true"
	 * @generated
	 */
	BehavioredClassifier getStateMachine_redefinitionContext();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.StateMachine#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine redefinition Context</em>' container reference.
	 * @see #getStateMachine_redefinitionContext()
	 * @generated
	 */
	void setStateMachine_redefinitionContext(BehavioredClassifier value);


	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.RedefinableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * redefinable element that is being redefined by this element. This is a derived union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getRedefinableElement_RedefinedElement()
	 * @model type="org.eclipse.uml2.RedefinableElement" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getRedefinedElements();


    /**
     * Retrieves the {@link org.eclipse.uml2.RedefinableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.RedefinableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.RedefinableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
     */
    RedefinableElement getRedefinedElement(String name);
      
} // StateMachine
