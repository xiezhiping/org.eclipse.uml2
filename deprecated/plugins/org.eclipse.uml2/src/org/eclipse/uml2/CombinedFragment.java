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
 * $Id: CombinedFragment.java,v 1.6 2005/04/04 20:11:14 khussey Exp $
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
 * A combined fragment defines an expression of interaction fragments. A combined fragment is defined by an interaction operator and corresponding interaction operands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner. CombinedFragment is a specialization of InteractionFragment. 
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
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.InteractionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the operation which defines the semantics of this combination of InteractionFragments.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * set of operands of the combined fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getCombinedFragment_Operand()
	 * @model type="org.eclipse.uml2.InteractionOperand" containment="true" required="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
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
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the interface between this CombinedFragment and its surroundings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getCombinedFragment_CfragmentGate()
	 * @model type="org.eclipse.uml2.Gate" containment="true" ordered="false"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''"
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
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

} // CombinedFragment
