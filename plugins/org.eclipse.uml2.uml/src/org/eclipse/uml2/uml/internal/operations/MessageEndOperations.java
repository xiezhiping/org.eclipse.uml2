/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.MessageEnd;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Message End</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#oppositeEnd() <em>Opposite End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#isSend() <em>Is Send</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#isReceive() <em>Is Receive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#enclosingFragment() <em>Enclosing Fragment</em>}</li>
 * </ul>
 * </p>
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
	 * 
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<MessageEnd> oppositeEnd(MessageEnd messageEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a sendEvent.
	 * message->notEmpty()
	 * 
	 * result = (message.sendEvent->asSet()->includes(self))
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isSend(MessageEnd messageEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a receiveEvent.
	 * message->notEmpty()
	 * 
	 * result = (message.receiveEvent->asSet()->includes(self))
	 * <p>From package UML::Interactions.</p>
	 * @param messageEnd The receiving '<em><b>Message End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isReceive(MessageEnd messageEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public static EList<InteractionFragment> enclosingFragment(
			MessageEnd messageEnd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // MessageEndOperations