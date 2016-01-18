/*
 * Copyright (c) 2014, 2016 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Message End</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#oppositeEnd() <em>Opposite End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#isSend() <em>Is Send</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#isReceive() <em>Is Receive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#enclosingFragment() <em>Enclosing Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageEndOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEndOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns a set including the MessageEnd (if exists) at the opposite end of the Message for this MessageEnd.
	 * result = (message->asSet().messageEnd->asSet()->excluding(self))
	 * message->notEmpty()
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<MessageEnd> oppositeEnd(MessageEnd messageEnd) {
		EList<MessageEnd> oppositeEnd = new UniqueEList.FastCompare<MessageEnd>();

		Message message = messageEnd.getMessage();

		if (message != null) {

			for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(
				message)) {

				if (nonNavigableInverseReference
					.getEStructuralFeature() == UMLPackage.Literals.MESSAGE_END__MESSAGE) {
					MessageEnd eObject = (MessageEnd) nonNavigableInverseReference
						.getEObject();

					if (eObject != messageEnd) {
						oppositeEnd.add(eObject);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(oppositeEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a sendEvent.
	 * message->notEmpty()
	 * result = (message.sendEvent->asSet()->includes(self))
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isSend(MessageEnd messageEnd) {
		Message message = messageEnd.getMessage();
		return message != null && message.getSendEvent() == messageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a receiveEvent.
	 * message->notEmpty()
	 * result = (message.receiveEvent->asSet()->includes(self))
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isReceive(MessageEnd messageEnd) {
		Message message = messageEnd.getMessage();
		return message != null && message.getReceiveEvent() == messageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns a set including the enclosing InteractionFragment this MessageEnd is enclosed within.
	 * result = (if self->select(oclIsKindOf(Gate))->notEmpty() 
	 * then -- it is a Gate
	 * let endGate : Gate = 
	 *   self->select(oclIsKindOf(Gate)).oclAsType(Gate)->asOrderedSet()->first()
	 *   in
	 *   if endGate.isOutsideCF() 
	 *   then endGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(endGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())
	 *   else if endGate.isInsideCF() 
	 *     then endGate.combinedFragment.oclAsType(InteractionFragment)->asSet()
	 *     else if endGate.isFormal() 
	 *       then endGate.interaction.oclAsType(InteractionFragment)->asSet()
	 *       else if endGate.isActual() 
	 *         then endGate.interactionUse.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(endGate.interactionUse.enclosingOperand.oclAsType(InteractionFragment)->asSet())
	 *         else null
	 *         endif
	 *       endif
	 *     endif
	 *   endif
	 * else -- it is a MessageOccurrenceSpecification
	 * let endMOS : MessageOccurrenceSpecification  = 
	 *   self->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() 
	 *   in
	 *   if endMOS.enclosingInteraction->notEmpty() 
	 *   then endMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()
	 *   else endMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet()
	 *   endif
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<InteractionFragment> enclosingFragment(
			MessageEnd messageEnd) {
		EList<InteractionFragment> enclosingFragment = new UniqueEList.FastCompare<InteractionFragment>();

		if (messageEnd instanceof Gate) {
			Gate endGate = (Gate) messageEnd;
			EObject eContainer = endGate.eContainer();

			if (endGate.isOutsideCF()) {

				if (eContainer instanceof CombinedFragment) {
					CombinedFragment combinedFragment = (CombinedFragment) eContainer;

					InteractionFragment enclosingInteraction = combinedFragment
						.getEnclosingInteraction();

					if (enclosingInteraction != null) {
						enclosingFragment.add(enclosingInteraction);
					}

					InteractionFragment enclosingOperand = combinedFragment
						.getEnclosingOperand();

					if (enclosingOperand != null) {
						enclosingFragment.add(enclosingOperand);
					}
				}
			} else if (endGate.isInsideCF()) {

				if (eContainer instanceof CombinedFragment) {
					enclosingFragment.add((CombinedFragment) eContainer);
				}
			} else if (endGate.isFormal()) {

				if (eContainer instanceof Interaction) {
					enclosingFragment.add((Interaction) eContainer);
				}
			} else if (endGate.isActual()) {

				if (eContainer instanceof InteractionUse) {
					InteractionUse interactionUse = (InteractionUse) eContainer;

					InteractionFragment enclosingInteraction = interactionUse
						.getEnclosingInteraction();

					if (enclosingInteraction != null) {
						enclosingFragment.add(enclosingInteraction);
					}

					InteractionFragment enclosingOperand = interactionUse
						.getEnclosingOperand();

					if (enclosingOperand != null) {
						enclosingFragment.add(enclosingOperand);
					}
				}
			}
		} else if (messageEnd instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification endMOS = (MessageOccurrenceSpecification) messageEnd;

			InteractionFragment enclosingInteraction = endMOS
				.getEnclosingInteraction();

			if (enclosingInteraction != null) {
				enclosingFragment.add(enclosingInteraction);
			} else {
				InteractionFragment enclosingOperand = endMOS
					.getEnclosingOperand();

				if (enclosingOperand != null) {
					enclosingFragment.add(enclosingOperand);
				}
			}
		}

		return ECollections.unmodifiableEList(enclosingFragment);
	}

} // MessageEndOperations