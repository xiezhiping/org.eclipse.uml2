/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getFormalParameters <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getReturnResults <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getRaisedExceptions <em>Raised Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getMethods <em>Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Namespace, Feature{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_IsAbstract()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.BehavioralFeature#isAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see org.eclipse.uml2.CallConcurrencyKind
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_Concurrency()
	 * @model 
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see org.eclipse.uml2.CallConcurrencyKind
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_Parameter()
	 * @model type="org.eclipse.uml2.Parameter" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getParameters();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getParameters()
	 * @generated
     */
    Parameter getParameter(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_FormalParameter()
	 * @model type="org.eclipse.uml2.Parameter" containment="true" volatile="true"
	 * @generated
	 */
	EList getFormalParameters();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getFormalParameters()
	 * @generated
     */
    Parameter getFormalParameter(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Parameter} to create.
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getFormalParameters()
	 * @generated
     */
    Parameter createFormalParameter(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_ReturnResult()
	 * @model type="org.eclipse.uml2.Parameter" containment="true"
	 * @generated
	 */
	EList getReturnResults();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Return Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getReturnResults()
	 * @generated
     */
    Parameter getReturnResult(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Return Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Parameter} to create.
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getReturnResults()
	 * @generated
     */
    Parameter createReturnResult(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_RaisedException()
	 * @model type="org.eclipse.uml2.Type" volatile="true"
	 * @generated
	 */
	EList getRaisedExceptions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Type} with the specified name from the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Type} to retrieve.
	 * @return The {@link org.eclipse.uml2.Type} with the specified name, or <code>null</code>.
	 * @see #getRaisedExceptions()
	 * @generated
     */
    Type getRaisedException(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Behavior}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_Method()
	 * @see org.eclipse.uml2.Behavior#getSpecification
	 * @model type="org.eclipse.uml2.Behavior" opposite="specification"
	 * @generated
	 */
	EList getMethods();

    /**
     * Retrieves the {@link org.eclipse.uml2.Behavior} with the specified name from the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.Behavior} with the specified name, or <code>null</code>.
	 * @see #getMethods()
	 * @generated
     */
    Behavior getMethod(String unqualifiedName);
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if n.oclIsKindOf(BehavioralFeature)
	 * then
	 *     if ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()
	 *     then Set{}->include(self)->include(n)->isUnique( bf | bf.parameter->collect(type))
	 *     else true
	 *     endif
	 * else true
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

} // BehavioralFeature
