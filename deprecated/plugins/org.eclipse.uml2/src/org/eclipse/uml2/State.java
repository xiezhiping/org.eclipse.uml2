/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: State.java,v 1.13 2006/04/10 20:40:26 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.State#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getConnections <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getDeferrableTriggers <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getStateInvariant <em>State Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getState()
 * @model
 * @generated
 */
public interface State extends Namespace, RedefinableElement, Vertex {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getState_IsComposite()
	 * @model dataType="org.eclipse.uml2.Boolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isComposite();


	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Orthogonal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getState_IsOrthogonal()
	 * @model dataType="org.eclipse.uml2.Boolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isOrthogonal();


	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getState_IsSimple()
	 * @model dataType="org.eclipse.uml2.Boolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSimple();


	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Submachine State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getState_IsSubmachineState()
	 * @model dataType="org.eclipse.uml2.Boolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSubmachineState();


	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submachine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine</em>' reference.
	 * @see #setSubmachine(StateMachine)
	 * @see org.eclipse.uml2.UML2Package#getState_Submachine()
	 * @model
	 * @generated
	 */
	StateMachine getSubmachine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.State#getSubmachine <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' reference.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(StateMachine value);


	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ConnectionPointReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getState_Connection()
	 * @model type="org.eclipse.uml2.ConnectionPointReference" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getConnections();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.ConnectionPointReference} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ConnectionPointReference} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.ConnectionPointReference} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnections()
	 * @generated
	 */
    ConnectionPointReference getConnection(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.ConnectionPointReference} with the specified '<em><b>Name</b></em>' from the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ConnectionPointReference} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.ConnectionPointReference} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConnections()
	 * @generated
	 */
	ConnectionPointReference getConnection(String name, boolean ignoreCase);

    /**
     * Creates a {@link org.eclipse.uml2.ConnectionPointReference} and appends it to the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ConnectionPointReference} to create.
	 * @return The new {@link org.eclipse.uml2.ConnectionPointReference}.
	 * @see #getConnections()
	 * @generated NOT
	 * @deprecated Use #createConnection() instead.
     */
    ConnectionPointReference createConnection(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.ConnectionPointReference} and appends it to the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.ConnectionPointReference}.
	 * @see #getConnections()
	 * @generated NOT
	 */
    ConnectionPointReference createConnection();

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined State</em>' reference.
	 * @see #setRedefinedState(State)
	 * @see org.eclipse.uml2.UML2Package#getState_RedefinedState()
	 * @model
	 * @generated
	 */
	State getRedefinedState();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.State#getRedefinedState <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State</em>' reference.
	 * @see #getRedefinedState()
	 * @generated
	 */
	void setRedefinedState(State value);


	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getState_DeferrableTrigger()
	 * @model type="org.eclipse.uml2.Trigger" ordered="false"
	 * @generated
	 */
	EList getDeferrableTriggers();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Deferrable Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Trigger} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeferrableTriggers()
	 * @generated
	 */
    Trigger getDeferrableTrigger(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Deferrable Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Trigger} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Trigger} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeferrableTriggers()
	 * @generated
	 */
	Trigger getDeferrableTrigger(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Region}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getState_Region()
	 * @see org.eclipse.uml2.Region#getState
	 * @model type="org.eclipse.uml2.Region" opposite="state" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getRegions();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.Region} with the specified '<em><b>Name</b></em>' from the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Region} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.Region} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRegions()
	 * @generated
	 */
    Region getRegion(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.Region} with the specified '<em><b>Name</b></em>' from the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Region} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.Region} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRegions()
	 * @generated
	 */
	Region getRegion(String name, boolean ignoreCase);

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
	 * @generated NOT
	 */
    Region createRegion();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Activity)
	 * @see org.eclipse.uml2.UML2Package#getState_Entry()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	Activity getEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Activity value);


    /**
     * Creates a {@link org.eclipse.uml2.Activity} and sets the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Activity} to create.
	 * @return The new {@link org.eclipse.uml2.Activity}.
	 * @see #getEntry()
	 * @generated NOT
	 * @deprecated Use #createEntry() instead.
     */
    Activity createEntry(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Activity} and sets the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Activity}.
	 * @see #getEntry()
	 * @generated NOT
	 */
    Activity createEntry();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Activity)
	 * @see org.eclipse.uml2.UML2Package#getState_Exit()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	Activity getExit();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Activity value);


    /**
     * Creates a {@link org.eclipse.uml2.Activity} and sets the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Activity} to create.
	 * @return The new {@link org.eclipse.uml2.Activity}.
	 * @see #getExit()
	 * @generated NOT
	 * @deprecated Use #createExit() instead.
     */
    Activity createExit(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Activity} and sets the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Activity}.
	 * @see #getExit()
	 * @generated NOT
	 */
    Activity createExit();

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Activity)
	 * @see org.eclipse.uml2.UML2Package#getState_DoActivity()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	Activity getDoActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Activity value);


    /**
     * Creates a {@link org.eclipse.uml2.Activity} and sets the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Activity} to create.
	 * @return The new {@link org.eclipse.uml2.Activity}.
	 * @see #getDoActivity()
	 * @generated NOT
	 * @deprecated Use #createDoActivity() instead.
     */
    Activity createDoActivity(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Activity} and sets the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Activity}.
	 * @see #getDoActivity()
	 * @generated NOT
	 */
    Activity createDoActivity();

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' containment reference.
	 * @see #setStateInvariant(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getState_StateInvariant()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.State#getStateInvariant <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' containment reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);



	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getStateInvariant()
	 * @generated NOT
	 */
    Constraint createStateInvariant(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getStateInvariant()
	 * @generated NOT
	 */
    Constraint createStateInvariant();


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
	 * Retrieves the first {@link org.eclipse.uml2.RedefinableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.RedefinableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.RedefinableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
	 */
    RedefinableElement getRedefinedElement(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.RedefinableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.RedefinableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.RedefinableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.RedefinableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
	 */
	RedefinableElement getRedefinedElement(String name, boolean ignoreCase, EClass eClass);

} // State
