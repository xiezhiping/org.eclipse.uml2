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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MessageEnd is an abstract specialization of NamedElement that represents what can occur at the end of a Message.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MessageEnd#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getMessageEnd()
 * @model abstract="true"
 * @generated
 */
public interface MessageEnd
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a Message.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessageEnd_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.MessageEnd#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns a set including the MessageEnd (if exists) at the opposite end of the Message for this MessageEnd.
	 * result = (message->asSet().messageEnd->asSet()->excluding(self))
	 * message->notEmpty()
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<MessageEnd> oppositeEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a sendEvent.
	 * message->notEmpty()
	 * result = (message.sendEvent->asSet()->includes(self))
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a receiveEvent.
	 * message->notEmpty()
	 * result = (message.receiveEvent->asSet()->includes(self))
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReceive();

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
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<InteractionFragment> enclosingFragment();

} // MessageEnd
