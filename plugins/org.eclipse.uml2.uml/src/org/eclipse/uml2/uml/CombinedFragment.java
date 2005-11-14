/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CombinedFragment.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

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
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#getOperands <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#getCfragmentGates <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment
		extends InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the operation which defines the semantics of this combination of InteractionFragments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2.uml.InteractionOperatorKind
	 * @see #setInteractionOperator(InteractionOperatorKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment_InteractionOperator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InteractionOperatorKind getInteractionOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2.uml.InteractionOperatorKind
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of operands of the combined fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment_Operand()
	 * @model type="org.eclipse.uml2.uml.InteractionOperand" containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	List getOperands();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InteractionOperand} and appends it to the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InteractionOperand}.
	 * @see #getOperands()
	 * @generated
	 */
	InteractionOperand createOperand();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InteractionOperand} with the specified '<em><b>Name</b></em>' from the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionOperand} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InteractionOperand} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOperands()
	 * @generated
	 */
	InteractionOperand getOperand(String name);

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the interface between this CombinedFragment and its surroundings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment_CfragmentGate()
	 * @model type="org.eclipse.uml2.uml.Gate" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getCfragmentGates();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Gate} and appends it to the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Gate}.
	 * @see #getCfragmentGates()
	 * @generated
	 */
	Gate createCfragmentGate();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCfragmentGates()
	 * @generated
	 */
	Gate getCfragmentGate(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is opt, loop, break, or neg there must be exactly one operand
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOptLoopBreakNeg(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionConstraint with minint and maxint only apply when attached to an InteractionOperand where the interactionOperator is loop.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMinintAndMaxint(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is break, the corresponding InteractionOperand must cover all Lifelines within the enclosing InteractionFragment.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBreak(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interaction operators 'consider' and 'ignore' can only be used for the CombineIgnoreFragment subtype of CombinedFragment
	 * ((interactionOperator = #consider) or (interactionOperator = #ignore)) implies oclsisTypeOf(CombineIgnoreFragment)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConsiderAndIgnore(DiagnosticChain diagnostics, Map context);

} // CombinedFragment
