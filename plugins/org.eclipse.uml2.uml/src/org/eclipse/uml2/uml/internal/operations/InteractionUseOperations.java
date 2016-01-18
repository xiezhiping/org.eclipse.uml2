/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.InteractionUse;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interaction Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#validateGatesMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gates Match</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#validateArgumentsAreConstants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arguments Are Constants</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#validateReturnValueRecipientCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Value Recipient Coverage</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#validateArgumentsCorrespondToParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arguments Correspond To Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#validateReturnValueTypeRecipientCorrespondence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Value Type Recipient Correspondence</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionUse#validateAllLifelines(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate All Lifelines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionUseOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual Gates of the InteractionUse must match Formal Gates of the referred Interaction. Gates match when their names are equal and their messages correspond.
	 * actualGate->notEmpty() implies 
	 * refersTo.formalGate->forAll( fg : Gate | self.actualGate->select(matches(fg))->size()=1) and
	 * self.actualGate->forAll(ag : Gate | refersTo.formalGate->select(matches(ag))->size()=1)
	 * @param interactionUse The receiving '<em><b>Interaction Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGatesMatch(InteractionUse interactionUse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_USE__GATES_MATCH,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateGatesMatch", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionUse, context)}),
					new Object[]{interactionUse}));
			}
			return false;
		}
		return true;
	}

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
	 * @param interactionUse The receiving '<em><b>Interaction Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllLifelines(InteractionUse interactionUse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_USE__ALL_LIFELINES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAllLifelines", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionUse, context)}),
					new Object[]{interactionUse}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments of the InteractionUse must correspond to parameters of the referred Interaction.
	 * @param interactionUse The receiving '<em><b>Interaction Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateArgumentsCorrespondToParameters(
			InteractionUse interactionUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_USE__ARGUMENTS_CORRESPOND_TO_PARAMETERS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateArgumentsCorrespondToParameters", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionUse, context)}),
					new Object[]{interactionUse}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the returnValue must correspond to the type of the returnValueRecipient.
	 * returnValue.type->asSequence()->notEmpty() implies returnValue.type->asSequence()->first() = returnValueRecipient.type->asSequence()->first()
	 * @param interactionUse The receiving '<em><b>Interaction Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReturnValueTypeRecipientCorrespondence(
			InteractionUse interactionUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_USE__RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{
							"validateReturnValueTypeRecipientCorrespondence", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionUse, context)}),
					new Object[]{interactionUse}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments must only be constants, parameters of the enclosing Interaction or attributes of the classifier owning the enclosing Interaction.
	 * @param interactionUse The receiving '<em><b>Interaction Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateArgumentsAreConstants(
			InteractionUse interactionUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_USE__ARGUMENTS_ARE_CONSTANTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateArgumentsAreConstants", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionUse, context)}),
					new Object[]{interactionUse}));
			}
			return false;
		}
		return true;
	}

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
	 * @param interactionUse The receiving '<em><b>Interaction Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReturnValueRecipientCoverage(
			InteractionUse interactionUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.INTERACTION_USE__RETURN_VALUE_RECIPIENT_COVERAGE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateReturnValueRecipientCoverage", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(interactionUse, context)}),
					new Object[]{interactionUse}));
			}
			return false;
		}
		return true;
	}

} // InteractionUseOperations