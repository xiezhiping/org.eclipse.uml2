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
 * $Id: Behavior.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Behavior#isReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getRedefinedBehaviors <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getFormalParameters <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getReturnResults <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getPostconditions <em>Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends org.eclipse.uml2.Class{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(boolean)
	 * @see org.eclipse.uml2.UML2Package#getBehavior_IsReentrant()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isReentrant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Behavior#isReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(BehavioredClassifier)
	 * @see org.eclipse.uml2.UML2Package#getBehavior_Context()
	 * @see org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors
	 * @model opposite="ownedBehavior" volatile="true"
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Behavior#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Redefined Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Behavior</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavior_RedefinedBehavior()
	 * @model type="org.eclipse.uml2.Behavior" ordered="false"
	 * @generated
	 */
	EList getRedefinedBehaviors();

    /**
     * Retrieves the {@link org.eclipse.uml2.Behavior} with the specified name from the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.Behavior} with the specified name, or <code>null</code>.
	 * @see #getRedefinedBehaviors()
	 * @generated
     */
    Behavior getRedefinedBehavior(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.BehavioralFeature#getMethods <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see org.eclipse.uml2.UML2Package#getBehavior_Specification()
	 * @see org.eclipse.uml2.BehavioralFeature#getMethods
	 * @model opposite="method"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavior_Parameter()
	 * @model type="org.eclipse.uml2.Parameter" containment="true"
	 * @generated
	 */
	EList getParameters();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getParameters()
	 * @generated
     */
    Parameter getParameter(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Parameter} to create.
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getParameters()
	 * @generated
     */
    Parameter createParameter(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavior_FormalParameter()
	 * @model type="org.eclipse.uml2.Parameter" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getFormalParameters();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Formal Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getFormalParameters()
	 * @generated
     */
    Parameter getFormalParameter(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavior_ReturnResult()
	 * @model type="org.eclipse.uml2.Parameter" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getReturnResults();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Return Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getReturnResults()
	 * @generated
     */
    Parameter getReturnResult(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavior_Precondition()
	 * @model type="org.eclipse.uml2.Constraint" resolveProxies="false" volatile="true" ordered="false"
	 * @generated
	 */
	EList getPreconditions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getPreconditions()
	 * @generated
     */
    Constraint getPrecondition(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavior_Postcondition()
	 * @model type="org.eclipse.uml2.Constraint" resolveProxies="false" volatile="true" ordered="false"
	 * @generated
	 */
	EList getPostconditions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getPostconditions()
	 * @generated
     */
    Constraint getPostcondition(String unqualifiedName);
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinedElements();

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
	EList getOwnedRules();

} // Behavior
