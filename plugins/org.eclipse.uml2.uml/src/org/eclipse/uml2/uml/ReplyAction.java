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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReplyAction is an Action that accepts a set of reply values and a value containing return information produced by a previous AcceptCallAction. The ReplyAction returns the values to the caller of the previous call, completing execution of the call.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#getReplyValues <em>Reply Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getReplyAction()
 * @model
 * @generated
 */
public interface ReplyAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Trigger specifying the Operation whose call is being replied to.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply To Call</em>' reference.
	 * @see #setReplyToCall(Trigger)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReplyAction_ReplyToCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Trigger getReplyToCall();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReplyAction#getReplyToCall <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To Call</em>' reference.
	 * @see #getReplyToCall()
	 * @generated
	 */
	void setReplyToCall(Trigger value);

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin that holds the return information value produced by an earlier AcceptCallAction.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference.
	 * @see #setReturnInformation(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReplyAction_ReturnInformation()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReplyAction#getReturnInformation <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' containment reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getReturnInformation()
	 * @generated
	 */
	InputPin createReturnInformation(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getReturnInformation()
	 * @generated
	 */
	InputPin createReturnInformation(String name, Type type);

	/**
	 * Returns the value of the '<em><b>Reply Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of InputPins providing the values for the output (inout, out, and return) Parameters of the Operation. These values are returned to the caller.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply Value</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getReplyAction_ReplyValue()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<InputPin> getReplyValues();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Reply Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getReplyValues()
	 * @generated
	 */
	InputPin createReplyValue(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Reply Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getReplyValues()
	 * @generated
	 */
	InputPin createReplyValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Reply Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getReplyValues()
	 * @generated
	 */
	InputPin getReplyValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Reply Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InputPin} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getReplyValues()
	 * @generated
	 */
	InputPin getReplyValue(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The replyValue InputPins must match the output (return, out, and inout) parameters of the operation of the event of the replyToCall Trigger in number, type, ordering, and multiplicity.
	 * let parameter:OrderedSet(Parameter) = replyToCall.event.oclAsType(CallEvent).operation.outputParameters() in
	 * replyValue->size()=parameter->size() and
	 * Sequence{1..replyValue->size()}->forAll(i |
	 * 	replyValue->at(i).type.conformsTo(parameter->at(i).type) and
	 * 	replyValue->at(i).isOrdered=parameter->at(i).isOrdered and
	 * 	replyValue->at(i).compatibleWith(parameter->at(i)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePinsMatchParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The event of the replyToCall Trigger must be a CallEvent.
	 * replyToCall.event.oclIsKindOf(CallEvent)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEventOnReplyToCallTrigger(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ReplyAction
