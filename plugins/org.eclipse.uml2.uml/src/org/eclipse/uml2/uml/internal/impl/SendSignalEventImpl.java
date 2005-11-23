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
 * $Id: SendSignalEventImpl.java,v 1.3 2005/11/23 13:27:43 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.SendSignalEvent;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Signal Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendSignalEventImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendSignalEventImpl
		extends MessageEventImpl
		implements SendSignalEvent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendSignalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getSendSignalEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		Signal signal = (Signal) eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__SIGNAL);
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject) signal;
			signal = (Signal) eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				eVirtualSet(UMLPackage.SEND_SIGNAL_EVENT__SIGNAL, signal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SEND_SIGNAL_EVENT__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return (Signal) eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__SIGNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal signal = newSignal;
		Object oldSignal = eVirtualSet(UMLPackage.SEND_SIGNAL_EVENT__SIGNAL,
			signal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SEND_SIGNAL_EVENT__SIGNAL,
				oldSignal == EVIRTUAL_NO_VALUE
					? null
					: oldSignal, signal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.SEND_SIGNAL_EVENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNER :
				return getOwner();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SEND_SIGNAL_EVENT__NAME :
				return getName();
			case UMLPackage.SEND_SIGNAL_EVENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.SEND_SIGNAL_EVENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SEND_SIGNAL_EVENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SEND_SIGNAL_EVENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SEND_SIGNAL_EVENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.SEND_SIGNAL_EVENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.SEND_SIGNAL_EVENT__SIGNAL :
				if (resolve)
					return getSignal();
				return basicGetSignal();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.SEND_SIGNAL_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__SIGNAL :
				setSignal((Signal) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.SEND_SIGNAL_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SEND_SIGNAL_EVENT__SIGNAL :
				setSignal((Signal) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.SEND_SIGNAL_EVENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNER :
				return isSetOwner();
			case UMLPackage.SEND_SIGNAL_EVENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SEND_SIGNAL_EVENT__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.SEND_SIGNAL_EVENT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.SEND_SIGNAL_EVENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SEND_SIGNAL_EVENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SEND_SIGNAL_EVENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.SEND_SIGNAL_EVENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SEND_SIGNAL_EVENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__NAME_EXPRESSION) != null;
			case UMLPackage.SEND_SIGNAL_EVENT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.SEND_SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.SEND_SIGNAL_EVENT__SIGNAL :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_EVENT__SIGNAL) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //SendSignalEventImpl
