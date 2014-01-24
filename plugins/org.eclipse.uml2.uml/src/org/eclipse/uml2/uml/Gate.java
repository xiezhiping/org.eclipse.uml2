/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Gate is a MessageEnd which serves as a connection point for relating a Message which has a MessageEnd (sendEvent / receiveEvent) outside an InteractionFragment with another Message which has a MessageEnd (receiveEvent / sendEvent)  inside that InteractionFragment.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getGate()
 * @model
 * @generated
 */
public interface Gate
		extends MessageEnd {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Gate is an actualGate, it must have exactly one matching formalGate within the referred Interaction.
	 * interactionUse->notEmpty() implies interactionUse.refersTo.formalGate->select(matches(self))->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateActualGateMatched(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Gate is inside a CombinedFragment, it must have exactly one matching Gate which is outside of that CombinedFragment.
	 * isInsideCF() implies combinedFragment.cfragmentGate->select(isOutsideCF() and matches(self))->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInsideCfMatched(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Gate is outside an 'alt' CombinedFragment,  for every InteractionOperator inside that CombinedFragment there must be exactly one matching Gate inside the CombindedFragment with its opposing end enclosed by that InteractionOperator. If this Gate is outside CombinedFragment with operator other than 'alt',   there must be exactly one matching Gate inside that CombinedFragment.
	 * isOutsideCF() implies
	 *  if self.combinedFragment.interactionOperator->asOrderedSet()->first() = InteractionOperatorKind::alt
	 *  then self.combinedFragment.operand->forAll(op : InteractionOperand |
	 *  self.combinedFragment.cfragmentGate->select(isInsideCF() and 
	 *  oppositeEnd().enclosingFragment()->includes(self.combinedFragment) and matches(self))->size()=1)
	 *  else  self.combinedFragment.cfragmentGate->select(isInsideCF() and matches(self))->size()=1
	 *  endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOutsideCfMatched(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isFormal() implies that no other formalGate of the parent Interaction returns the same getName() as returned for self
	 * isFormal() implies interaction.formalGate->select(getName() = self.getName())->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateFormalGateDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isActual() implies that no other actualGate of the parent InteractionUse returns the same getName() as returned for self
	 * isActual() implies interactionUse.actualGate->select(getName() = self.getName())->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateActualGateDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isOutsideCF() implies that no other outside cfragmentGate of the parent CombinedFragment returns the same getName() as returned for self
	 * isOutsideCF() implies combinedFragment.cfragmentGate->select(getName() = self.getName())->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOutsideCfGateDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isInsideCF() implies that no other inside cfragmentGate attached to a message with its other end in the same InteractionOperator as self, returns the same getName() as returned for self
	 * isInsideCF() implies
	 * let selfOperand : InteractionOperand = self.getOperand() in
	 *   combinedFragment.cfragmentGate->select(isInsideCF() and getName() = self.getName())->select(getOperand() = selfOperand)->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInsideCfGateDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is attached to the boundary of a CombinedFragment, and its other end (if present)  is outside of the same CombinedFragment.
	 * result = (self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies
	 * let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in
	 * if oppEnd.oclIsKindOf(MessageOccurrenceSpecification) 
	 * then let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)
	 * in  self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =
	 *      oppMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(oppMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet())
	 * else let oppGate : Gate = oppEnd.oclAsType(Gate) 
	 * in self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =
	 *      oppGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(oppGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOutsideCF();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is attached to the boundary of a CombinedFragment, and its other end (if present) is inside of an InteractionOperator of the same CombinedFragment.
	 * result = (self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies
	 * let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in
	 * if oppEnd.oclIsKindOf(MessageOccurrenceSpecification)
	 * then let oppMOS : MessageOccurrenceSpecification
	 * = oppEnd.oclAsType(MessageOccurrenceSpecification)
	 * in combinedFragment = oppMOS.enclosingOperand.combinedFragment
	 * else let oppGate : Gate = oppEnd.oclAsType(Gate)
	 * in combinedFragment = oppGate.combinedFragment.enclosingOperand.combinedFragment
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInsideCF();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true value if this Gate is an actualGate of an InteractionUse.
	 * result = (interactionUse->notEmpty())
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isActual();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is a formalGate of an Interaction.
	 * result = (interaction->notEmpty())
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFormal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if the name of this Gate matches the name of the in parameter Gate, and the messages for the two Gates correspond. The Message for one Gate (say A) corresponds to the Message for another Gate (say B) if (A and B have the same name value) and (if A is a sendEvent then B is a receiveEvent) and (if A is a receiveEvent then B is a sendEvent) and (A and B have the same messageSort value) and (A and B have the same signature value).
	 * result = (self.getName() = gateToMatch.getName() and 
	 * self.message.messageSort = gateToMatch.message.messageSort and
	 * self.message.name = gateToMatch.message.name and
	 * self.message.sendEvent->includes(self) implies gateToMatch.message.receiveEvent->includes(gateToMatch)  and
	 * self.message.receiveEvent->includes(self) implies gateToMatch.message.sendEvent->includes(gateToMatch) and
	 * self.message.signature = gateToMatch.message.signature)
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" gateToMatchRequired="true" gateToMatchOrdered="false"
	 * @generated
	 */
	boolean matches(Gate gateToMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the Gate is an inside Combined Fragment Gate, this operation returns the InteractionOperand that the opposite end of this Gate is included within.
	 * result = (if isInsideCF() then
	 *   let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in
	 *     if oppEnd.oclIsKindOf(MessageOccurrenceSpecification)
	 *     then let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)
	 *         in oppMOS.enclosingOperand->asOrderedSet()->first()
	 *     else let oppGate : Gate = oppEnd.oclAsType(Gate)
	 *         in oppGate.combinedFragment.enclosingOperand->asOrderedSet()->first()
	 *     endif
	 *   else null
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	InteractionOperand getOperand();

} // Gate
