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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Continuation is a syntactic way to define continuations of different branches of an alternative CombinedFragment. Continuations are intuitively similar to labels representing intermediate points in a flow of control.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Continuation#isSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getContinuation()
 * @model
 * @generated
 */
public interface Continuation
		extends InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getContinuation_Setting()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSetting();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Continuation#isSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #isSetting()
	 * @generated
	 */
	void setSetting(boolean value);

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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSameName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations are always global in the enclosing InteractionFragment e.g., it always covers all Lifelines covered by the enclosing InteractionOperator.
	 * enclosingOperand->notEmpty() and
	 *   let operandLifelines : Set(Lifeline) =  enclosingOperand.covered in 
	 *     (operandLifelines->notEmpty() and 
	 *     operandLifelines->forAll(ol :Lifeline |self.covered->includes(ol)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGlobal(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations always occur as the very first InteractionFragment or the very last InteractionFragment of the enclosing InteractionOperand.
	 *  enclosingOperand->notEmpty() and 
	 *  let peerFragments : OrderedSet(InteractionFragment) =  enclosingOperand.fragment in 
	 *    ( peerFragments->notEmpty() and 
	 *    ((peerFragments->first() = self) or  (peerFragments->last() = self)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateFirstOrLastInteractionFragment(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Continuation
