/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
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
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionUse refers to an Interaction. The InteractionUse is a shorthand for copying the contents of the referenced Interaction where the InteractionUse is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal Gates with the actual ones.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#getActualGates <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse
		extends InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the Interaction that defines its meaning.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionUse_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionUse#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the executed Interaction.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionUse_ReturnValue()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getReturnValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionUse#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(ValueSpecification value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getReturnValue()
	 * @generated
	 */
	ValueSpecification createReturnValue(String name, Type type, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recipient of the return value.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value Recipient</em>' reference.
	 * @see #setReturnValueRecipient(Property)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionUse_ReturnValueRecipient()
	 * @model ordered="false"
	 * @generated
	 */
	Property getReturnValueRecipient();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value Recipient</em>' reference.
	 * @see #getReturnValueRecipient()
	 * @generated
	 */
	void setReturnValueRecipient(Property value);

	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
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
	 * The actual gates of the InteractionUse.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionUse_ActualGate()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getActualGates();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Gate}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Gate}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Gate}.
	 * @see #getActualGates()
	 * @generated
	 */
	Gate createActualGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActualGates()
	 * @generated
	 */
	Gate getActualGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Gate} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActualGates()
	 * @generated
	 */
	Gate getActualGate(String name, boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual arguments of the Interaction.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteractionUse_Argument()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ValueSpecification> getArguments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getArguments()
	 * @generated
	 */
	ValueSpecification createArgument(String name, Type type, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getArguments()
	 * @generated
	 */
	ValueSpecification getArgument(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ValueSpecification} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getArguments()
	 * @generated
	 */
	ValueSpecification getArgument(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual Gates of the InteractionUse must match Formal Gates of the referred Interaction. Gates match when their names are equal and their messages correspond.
	 * actualGate->notEmpty() implies 
	 * refersTo.formalGate->forAll( fg : Gate | self.actualGate->select(matches(fg))->size()=1) and
	 * self.actualGate->forAll(ag : Gate | refersTo.formalGate->select(matches(ag))->size()=1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGatesMatch(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionUse must cover all Lifelines of the enclosing Interaction that are common with the lifelines covered by the referred Interaction. Lifelines are common if they have the same selector and represents associationEnd values.
	 * let parentInteraction : Set(Interaction) = enclosingInteraction->asSet()->
	 * union(enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->
	 * collect(enclosingInteraction).oclAsType(Interaction)->asSet()) in
	 * parentInteraction->size()=1 and let refInteraction : Interaction = refersTo in
	 * parentInteraction.covered-> forAll(intLifeline : Lifeline | refInteraction.covered->
	 * forAll( refLifeline : Lifeline | refLifeline.represents = intLifeline.represents and 
	 * (
	 * ( refLifeline.selector.oclIsKindOf(LiteralString) implies
	 *   intLifeline.selector.oclIsKindOf(LiteralString) and 
	 *   refLifeline.selector.oclAsType(LiteralString).value = intLifeline.selector.oclAsType(LiteralString).value ) and
	 * ( refLifeline.selector.oclIsKindOf(LiteralInteger) implies
	 *   intLifeline.selector.oclIsKindOf(LiteralInteger) and 
	 *   refLifeline.selector.oclAsType(LiteralInteger).value = intLifeline.selector.oclAsType(LiteralInteger).value )
	 * )
	 *  implies self.covered->asSet()->includes(intLifeline)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAllLifelines(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments of the InteractionUse must correspond to parameters of the referred Interaction.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateArgumentsCorrespondToParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the returnValue must correspond to the type of the returnValueRecipient.
	 * returnValue.type->asSequence()->notEmpty() implies returnValue.type->asSequence()->first() = returnValueRecipient.type->asSequence()->first()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReturnValueTypeRecipientCorrespondence(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments must only be constants, parameters of the enclosing Interaction or attributes of the classifier owning the enclosing Interaction.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateArgumentsAreConstants(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The returnValueRecipient must be a Property of a ConnectableElement that is represented by a Lifeline covered by this InteractionUse.
	 * returnValueRecipient->asSet()->notEmpty() implies
	 * let covCE : Set(ConnectableElement) = covered.represents->asSet() in 
	 * covCE->notEmpty() and let classes:Set(Classifier) = covCE.type.oclIsKindOf(Classifier).oclAsType(Classifier)->asSet() in 
	 * let allProps : Set(Property) = classes.attribute->union(classes.allParents().attribute)->asSet() in 
	 * allProps->includes(returnValueRecipient)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReturnValueRecipientCoverage(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // InteractionUse
