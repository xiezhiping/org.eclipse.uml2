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

import org.eclipse.uml2.uml.Continuation;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Continuation#validateFirstOrLastInteractionFragment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Or Last Interaction Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Continuation#validateSameName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Continuation#validateGlobal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Global</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinuationOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Across all Interaction instances having the same context value, every Lifeline instance covered by a Continuation (self) must be common with one covered Lifeline instance of all other Continuation instances with the same name as self, and every Lifeline instance covered by a Continuation instance with the same name as self must be common with one covered Lifeline instance of self. Lifeline instances are common if they have the same selector and represents associationEnd values.
	 * enclosingOperand.combinedFragment->notEmpty() and
	 * let parentInteraction : Set(Interaction) = 
	 * enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->
	 * collect(enclosingInteraction).oclAsType(Interaction)->asSet()
	 * in 
	 * (parentInteraction->size() = 1) 
	 * and let peerInteractions : Set(Interaction) =
	 *  (parentInteraction->union(parentInteraction->collect(_'context')->collect(behavior)->
	 *  select(oclIsKindOf(Interaction)).oclAsType(Interaction)->asSet())->asSet()) in
	 *  (peerInteractions->notEmpty()) and 
	 *   let combinedFragments1 : Set(CombinedFragment) = peerInteractions.fragment->
	 *  select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet() in
	 *    combinedFragments1->notEmpty() and  combinedFragments1->closure(operand.fragment->
	 *    select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment))->asSet().operand.fragment->
	 *    select(oclIsKindOf(Continuation)).oclAsType(Continuation)->asSet()->
	 *    forAll(c : Continuation |  (c.name = self.name) implies 
	 *   (c.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by self
	 *   self.covered->asSet()->
	 *   select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))
	 *    and
	 *  (self.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by c
	 *  c.covered->asSet()->
	 *   select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))
	 *   )
	 * @param continuation The receiving '<em><b>Continuation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameName(Continuation continuation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONTINUATION__SAME_NAME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameName", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(continuation, context)}),
					new Object[]{continuation}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations are always global in the enclosing InteractionFragment e.g., it always covers all Lifelines covered by the enclosing InteractionOperator.
	 * enclosingOperand->notEmpty() and
	 *   let operandLifelines : Set(Lifeline) =  enclosingOperand.covered in 
	 *     (operandLifelines->notEmpty() and 
	 *     operandLifelines->forAll(ol :Lifeline |self.covered->includes(ol)))
	 * @param continuation The receiving '<em><b>Continuation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGlobal(Continuation continuation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONTINUATION__GLOBAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateGlobal", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(continuation, context)}),
					new Object[]{continuation}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations always occur as the very first InteractionFragment or the very last InteractionFragment of the enclosing InteractionOperand.
	 *  enclosingOperand->notEmpty() and 
	 *  let peerFragments : OrderedSet(InteractionFragment) =  enclosingOperand.fragment in 
	 *    ( peerFragments->notEmpty() and 
	 *    ((peerFragments->first() = self) or  (peerFragments->last() = self)))
	 * @param continuation The receiving '<em><b>Continuation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFirstOrLastInteractionFragment(
			Continuation continuation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONTINUATION__FIRST_OR_LAST_INTERACTION_FRAGMENT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateFirstOrLastInteractionFragment", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(continuation, context)}),
					new Object[]{continuation}));
			}
			return false;
		}
		return true;
	}

} // ContinuationOperations