/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MessageOccurrenceSpecificationImpl.java,v 1.2 2005/11/22 15:32:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageOccurrenceSpecificationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageOccurrenceSpecificationImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageOccurrenceSpecificationImpl
		extends OccurrenceSpecificationImpl
		implements MessageOccurrenceSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getMessageOccurrenceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		Message message = (Message) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE);
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject) message;
			message = (Message) eResolveProxy(oldMessage);
			if (message != oldMessage) {
				eVirtualSet(
					UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE,
					message);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE,
						oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return (Message) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message message = newMessage;
		Object oldMessage = eVirtualSet(
			UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE, message);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE,
				oldMessage == EVIRTUAL_NO_VALUE
					? null
					: oldMessage, message));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		Event event = (Event) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT);
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				eVirtualSet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT,
					event);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT,
						oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return (Event) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event event = newEvent;
		Object oldEvent = eVirtualSet(
			UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT, event);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT,
				oldEvent == EVIRTUAL_NO_VALUE
					? null
					: oldEvent, event));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvent() {
		return eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNER :
				return getOwner();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return getToBefores();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT :
				if (resolve)
					return getEvent();
				return basicGetEvent();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				return getToAfters();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				if (resolve)
					return getMessage();
				return basicGetMessage();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				getToBefores().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT :
				setEvent((Event) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				getToAfters().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				setMessage((Message) newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT :
				setEvent((Event) null);
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				return;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				setMessage((Message) null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY :
				return eVirtualGet(
					UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION) != null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED :
				return isSetCovereds();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				List toBefore = (List) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE);
				return toBefore != null && !toBefore.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EVENT :
				return isSetEvent();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER :
				List toAfter = (List) eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER);
				return toAfter != null && !toAfter.isEmpty();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
				return eVirtualGet(UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MessageEnd.class) {
			switch (derivedFeatureID) {
				case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE :
					return UMLPackage.MESSAGE_END__MESSAGE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == MessageEnd.class) {
			switch (baseFeatureID) {
				case UMLPackage.MESSAGE_END__MESSAGE :
					return UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MessageOccurrenceSpecificationImpl
