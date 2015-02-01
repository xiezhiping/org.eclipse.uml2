/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AcceptCallAction is an AcceptEventAction that handles the receipt of a synchronous call request. In addition to the values from the Operation input parameters, the Action produces an output that is needed later to supply the information to the ReplyAction necessary to return control to the caller. An AcceptCallAction is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent ReplyAction will complete immediately with no effect.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getAcceptCallAction()
 * @model
 * @generated
 */
public interface AcceptCallAction
		extends AcceptEventAction {

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getOutputs() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin where a value is placed containing sufficient information to perform a subsequent ReplyAction and return control to the caller. The contents of this value are opaque. It can be passed and copied but it cannot be manipulated by the model.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference.
	 * @see #setReturnInformation(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getAcceptCallAction_ReturnInformation()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.AcceptCallAction#getReturnInformation <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' containment reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(OutputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.OutputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.OutputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getReturnInformation()
	 * @generated
	 */
	OutputPin createReturnInformation(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of result OutputPins must be the same as the number of input (in and inout) ownedParameters of the Operation specified by the trigger Event. The type, ordering and multiplicity of each result OutputPin must be consistent with the corresponding input Parameter.
	 * let parameter: OrderedSet(Parameter) = trigger.event->asSequence()->first().oclAsType(CallEvent).operation.inputParameters() in
	 * result->size() = parameter->size() and
	 * Sequence{1..result->size()}->forAll(i | 
	 * 	parameter->at(i).type.conformsTo(result->at(i).type) and 
	 * 	parameter->at(i).isOrdered = result->at(i).isOrdered and
	 * 	parameter->at(i).compatibleWith(result->at(i)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateResultPins(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action must have exactly one trigger, which must be for a CallEvent.
	 * trigger->size()=1 and
	 * trigger->asSequence()->first().event.oclIsKindOf(CallEvent)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTriggerCallEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isUnmrashall must be true for an AcceptCallAction.
	 * isUnmarshall = true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateUnmarshall(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // AcceptCallAction
