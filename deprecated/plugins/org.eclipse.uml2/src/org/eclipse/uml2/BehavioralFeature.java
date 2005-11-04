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
 * $Id: BehavioralFeature.java,v 1.11 2005/11/04 22:23:04 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A behavioral feature specifies that an instance of a classifier will respond to a designated request by invoking a behavior. BehavioralFeature is an abstract metaclass specializing Feature and Namespace. Kinds of behavioral aspects are modeled by subclasses of BehavioralFeature. 
 * <!-- end-model-doc -->
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
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then the behavioral feature does not have an implementation, and one must be supplied by a more specific element. If false, the behavioral feature must have an implementation in the classifier or one must be inherited from a more general element. Communications
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Specifies the parameters of the BehavioralFeature. Subsets Namespace::member. This is a derived union and is ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_Parameter()
	 * @model type="org.eclipse.uml2.Parameter" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList getParameters();



	/**
	 * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>' from the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParameters()
	 * @generated
	 */
    Parameter getParameter(String name);

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ordered set of formal parameters of this BehavioralFeature. Subsets BehavioralFeature::parameter and Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_FormalParameter()
	 * @model type="org.eclipse.uml2.Parameter" containment="true" ordered="false"
	 * @generated
	 */
	EList getFormalParameters();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalParameters()
	 * @generated
	 */
    Parameter getFormalParameter(String name);

    /**
     * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Parameter} to create.
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getFormalParameters()
	 * @generated NOT
	 * @deprecated Use #createFormalParameter() instead.
     */
    Parameter createFormalParameter(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getFormalParameters()
	 * @generated
	 */
    Parameter createFormalParameter();

	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ordered set of return results of this BehavioralFeature. Subsets Behavioral- Feature::parameter and Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Result</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_ReturnResult()
	 * @model type="org.eclipse.uml2.Parameter" containment="true"
	 * @generated
	 */
	EList getReturnResults();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>' from the '<em><b>Return Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getReturnResults()
	 * @generated
	 */
    Parameter getReturnResult(String name);

    /**
     * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Return Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Parameter} to create.
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getReturnResults()
	 * @generated NOT
	 * @deprecated Use #createReturnResult() instead.
     */
    Parameter createReturnResult(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Return Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getReturnResults()
	 * @generated
	 */
    Parameter createReturnResult();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Types representing exceptions that may be raised during an invocation of this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_RaisedException()
	 * @model type="org.eclipse.uml2.Type" ordered="false"
	 * @generated
	 */
	EList getRaisedExceptions();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Type} with the specified '<em><b>Name</b></em>' from the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Type} to retrieve.
	 * @return The {@link org.eclipse.uml2.Type} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRaisedExceptions()
	 * @generated
	 */
    Type getRaisedException(String name);

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
	 * <!-- begin-model-doc -->
	 * A behavioral description that implements the behavioral feature. There may be at most one behavior for a particular pairing of a classifier (as owner of the behavior) and a behavioral feature (as specification of the behavior).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getBehavioralFeature_Method()
	 * @see org.eclipse.uml2.Behavior#getSpecification
	 * @model type="org.eclipse.uml2.Behavior" opposite="specification" ordered="false"
	 * @generated
	 */
	EList getMethods();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMethods()
	 * @generated
	 */
    Behavior getMethod(String name);

} // BehavioralFeature
