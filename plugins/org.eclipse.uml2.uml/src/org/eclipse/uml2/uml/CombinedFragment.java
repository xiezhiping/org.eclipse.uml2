/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CombinedFragment defines an expression of InteractionFragments. A CombinedFragment is defined by an interaction operator and corresponding InteractionOperands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#getCfragmentGates <em>Cfragment Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#getOperands <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment
		extends InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The default value is <code>"seq"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the operation which defines the semantics of this combination of InteractionFragments.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.eclipse.uml2.uml.InteractionOperatorKind
	 * @see #setInteractionOperator(InteractionOperatorKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment_InteractionOperator()
	 * @model default="seq" required="true" ordered="false"
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of operands of the combined fragment.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment_Operand()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<InteractionOperand> getOperands();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InteractionOperand}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InteractionOperand}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InteractionOperand}.
	 * @see #getOperands()
	 * @generated
	 */
	InteractionOperand createOperand(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionOperand} with the specified '<em><b>Name</b></em>' from the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionOperand} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionOperand} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOperands()
	 * @generated
	 */
	InteractionOperand getOperand(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionOperand} with the specified '<em><b>Name</b></em>' from the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionOperand} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InteractionOperand} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionOperand} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOperands()
	 * @generated
	 */
	InteractionOperand getOperand(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Gate}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the interface between this CombinedFragment and its surroundings
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getCombinedFragment_CfragmentGate()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getCfragmentGates();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Gate}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Gate}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Gate}.
	 * @see #getCfragmentGates()
	 * @generated
	 */
	Gate createCfragmentGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCfragmentGates()
	 * @generated
	 */
	Gate getCfragmentGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Gate} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCfragmentGates()
	 * @generated
	 */
	Gate getCfragmentGate(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is opt, loop, break, assert or neg, there must be exactly one operand.
	 * (interactionOperator =  InteractionOperatorKind::opt or interactionOperator = InteractionOperatorKind::loop or
	 * interactionOperator = InteractionOperatorKind::break or interactionOperator = InteractionOperatorKind::assert or
	 * interactionOperator = InteractionOperatorKind::neg)
	 * implies operand->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOptLoopBreakNeg(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is break, the corresponding InteractionOperand must cover all Lifelines covered by the enclosing InteractionFragment.
	 * interactionOperator=InteractionOperatorKind::break  implies   
	 * enclosingInteraction.oclAsType(InteractionFragment)->asSet()->union(
	 *    enclosingOperand.oclAsType(InteractionFragment)->asSet()).covered->asSet() = self.covered->asSet()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBreak(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interaction operators 'consider' and 'ignore' can only be used for the ConsiderIgnoreFragment subtype of CombinedFragment
	 * ((interactionOperator = InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)) implies oclIsKindOf(ConsiderIgnoreFragment)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConsiderAndIgnore(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // CombinedFragment
