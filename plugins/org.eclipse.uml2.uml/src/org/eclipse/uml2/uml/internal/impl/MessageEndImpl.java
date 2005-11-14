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
 * $Id: MessageEndImpl.java,v 1.1 2005/11/14 22:26:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageEndImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageEndImpl
		extends NamedElementImpl
		implements MessageEnd {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getMessageEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		Message message = (Message) eVirtualGet(UMLPackage.MESSAGE_END__MESSAGE);
		if (message != null && message.eIsProxy()) {
			Message oldMessage = message;
			message = (Message) eResolveProxy((InternalEObject) message);
			if (message != oldMessage) {
				eVirtualSet(UMLPackage.MESSAGE_END__MESSAGE, message);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE_END__MESSAGE, oldMessage, message));
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
		return (Message) eVirtualGet(UMLPackage.MESSAGE_END__MESSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message message = newMessage;
		Object oldMessage = eVirtualSet(UMLPackage.MESSAGE_END__MESSAGE,
			message);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE_END__MESSAGE,
				oldMessage == EVIRTUAL_NO_VALUE
					? null
					: oldMessage, message));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.MESSAGE_END__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MESSAGE_END__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MESSAGE_END__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.MESSAGE_END__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MESSAGE_END__NAME :
				return getName();
			case UMLPackage.MESSAGE_END__VISIBILITY :
				return getVisibility();
			case UMLPackage.MESSAGE_END__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MESSAGE_END__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MESSAGE_END__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MESSAGE_END__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.MESSAGE_END__MESSAGE :
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
			case UMLPackage.MESSAGE_END__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_END__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_END__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MESSAGE_END__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MESSAGE_END__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE_END__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MESSAGE_END__MESSAGE :
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
			case UMLPackage.MESSAGE_END__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MESSAGE_END__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MESSAGE_END__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.MESSAGE_END__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.MESSAGE_END__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.MESSAGE_END__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MESSAGE_END__MESSAGE :
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
			case UMLPackage.MESSAGE_END__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MESSAGE_END__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MESSAGE_END__OWNER :
				return isSetOwner();
			case UMLPackage.MESSAGE_END__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.MESSAGE_END__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.MESSAGE_END__NAME :
				String name = eVirtualIsSet(UMLPackage.MESSAGE_END__NAME)
					? (String) eVirtualGet(UMLPackage.MESSAGE_END__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.MESSAGE_END__VISIBILITY :
				return eVirtualIsSet(UMLPackage.MESSAGE_END__VISIBILITY)
					&& eVirtualGet(UMLPackage.MESSAGE_END__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.MESSAGE_END__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MESSAGE_END__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.MESSAGE_END__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.MESSAGE_END__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MESSAGE_END__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.MESSAGE_END__NAME_EXPRESSION) != null;
			case UMLPackage.MESSAGE_END__MESSAGE :
				return eVirtualGet(UMLPackage.MESSAGE_END__MESSAGE) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //MessageEndImpl
