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
 * $Id: Action.java,v 1.6 2005/04/04 20:11:14 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Action#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.Action#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.Action#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.Action#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Action#getLocalPreconditions <em>Local Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Action#getLocalPostconditions <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getAction()
 * @model
 * @generated
 */
public interface Action extends ExecutableNode{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see org.eclipse.uml2.UML2Package#getAction_Effect()
	 * @model default="" dataType="org.eclipse.uml2.String"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Action#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getAction_Output()
	 * @model type="org.eclipse.uml2.OutputPin" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getOutputs();

    /**
     * Retrieves the {@link org.eclipse.uml2.OutputPin} with the specified name from the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.OutputPin} with the specified name, or <code>null</code>.
	 * @see #getOutputs()
	 * @generated
     */
    OutputPin getOutput(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getAction_Input()
	 * @model type="org.eclipse.uml2.InputPin" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getInputs();

    /**
     * Retrieves the {@link org.eclipse.uml2.InputPin} with the specified name from the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.InputPin} with the specified name, or <code>null</code>.
	 * @see #getInputs()
	 * @generated
     */
    InputPin getInput(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getAction_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Classifier getContext();

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when execution is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getAction_LocalPrecondition()
	 * @model type="org.eclipse.uml2.Constraint" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getLocalPreconditions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getLocalPreconditions()
	 * @generated
     */
    Constraint getLocalPrecondition(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Constraint} and appends it to the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getLocalPreconditions()
	 * @generated
     */
    Constraint createLocalPrecondition(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when executed is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getAction_LocalPostcondition()
	 * @model type="org.eclipse.uml2.Constraint" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
	 * @generated
	 */
	EList getLocalPostconditions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getLocalPostconditions()
	 * @generated
     */
    Constraint getLocalPostcondition(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Constraint} and appends it to the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getLocalPostconditions()
	 * @generated
     */
    Constraint createLocalPostcondition(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

} // Action
