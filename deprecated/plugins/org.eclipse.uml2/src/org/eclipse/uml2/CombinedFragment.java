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
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction fragment that decomposes into a set of other interaction fragments under some operator.
 * In principle the whole sequence diagram is an combined interaction. Syntactically, however, we will have special notation for combineations such that operands may be easily distinguished.
 * Combined interactions consist of operands and an implicit or explicit operator
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.CombinedFragment#getOperands <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.CombinedFragment#getCfragmentGates <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getCombinedFragment()
 * @model 
 * @generated
 */
public interface CombinedFragment extends InteractionFragment{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.InteractionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2.InteractionOperator
	 * @see #setInteractionOperator(InteractionOperator)
	 * @see org.eclipse.uml2.UML2Package#getCombinedFragment_InteractionOperator()
	 * @model 
	 * @generated
	 */
	InteractionOperator getInteractionOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2.InteractionOperator
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperator value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getCombinedFragment_Operand()
	 * @model type="org.eclipse.uml2.InteractionOperand" containment="true" required="true"
	 * @generated
	 */
	EList getOperands();

    /**
     * Retrieves the {@link org.eclipse.uml2.InteractionOperand} with the specified name from the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InteractionOperand} to retrieve.
	 * @return The {@link org.eclipse.uml2.InteractionOperand} with the specified name, or <code>null</code>.
	 * @see #getOperands()
	 * @generated
     */
    InteractionOperand getOperand(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.InteractionOperand} and appends it to the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InteractionOperand} to create.
	 * @return The new {@link org.eclipse.uml2.InteractionOperand}.
	 * @see #getOperands()
	 * @generated
     */
    InteractionOperand createOperand(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfragment Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getCombinedFragment_CfragmentGate()
	 * @model type="org.eclipse.uml2.Gate" containment="true"
	 * @generated
	 */
	EList getCfragmentGates();

    /**
     * Retrieves the {@link org.eclipse.uml2.Gate} with the specified name from the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Gate} to retrieve.
	 * @return The {@link org.eclipse.uml2.Gate} with the specified name, or <code>null</code>.
	 * @see #getCfragmentGates()
	 * @generated
     */
    Gate getCfragmentGate(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Gate} and appends it to the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Gate} to create.
	 * @return The new {@link org.eclipse.uml2.Gate}.
	 * @see #getCfragmentGates()
	 * @generated
     */
    Gate createCfragmentGate(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // CombinedFragment
