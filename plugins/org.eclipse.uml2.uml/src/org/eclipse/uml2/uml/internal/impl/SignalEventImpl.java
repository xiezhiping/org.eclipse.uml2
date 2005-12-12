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
 * $Id: SignalEventImpl.java,v 1.7 2005/12/12 16:58:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SignalEventImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalEventImpl
		extends MessageEventImpl
		implements SignalEvent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SIGNAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		Signal signal = (Signal) eVirtualGet(UMLPackage.SIGNAL_EVENT__SIGNAL);
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject) signal;
			signal = (Signal) eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				eVirtualSet(UMLPackage.SIGNAL_EVENT__SIGNAL, signal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SIGNAL_EVENT__SIGNAL, oldSignal, signal));
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
		return (Signal) eVirtualGet(UMLPackage.SIGNAL_EVENT__SIGNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal signal = newSignal;
		Object oldSignal = eVirtualSet(UMLPackage.SIGNAL_EVENT__SIGNAL, signal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SIGNAL_EVENT__SIGNAL, oldSignal == EVIRTUAL_NO_VALUE
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
			case UMLPackage.SIGNAL_EVENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SIGNAL_EVENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SIGNAL_EVENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SIGNAL_EVENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SIGNAL_EVENT__NAME :
				return getName();
			case UMLPackage.SIGNAL_EVENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.SIGNAL_EVENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SIGNAL_EVENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SIGNAL_EVENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SIGNAL_EVENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.SIGNAL_EVENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.SIGNAL_EVENT__SIGNAL :
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
			case UMLPackage.SIGNAL_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SIGNAL_EVENT__SIGNAL :
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
			case UMLPackage.SIGNAL_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SIGNAL_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SIGNAL_EVENT__NAME :
				unsetName();
				return;
			case UMLPackage.SIGNAL_EVENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.SIGNAL_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SIGNAL_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SIGNAL_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SIGNAL_EVENT__SIGNAL :
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
			case UMLPackage.SIGNAL_EVENT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.SIGNAL_EVENT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SIGNAL_EVENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SIGNAL_EVENT__OWNER :
				return isSetOwner();
			case UMLPackage.SIGNAL_EVENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.SIGNAL_EVENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SIGNAL_EVENT__NAME :
				return isSetName();
			case UMLPackage.SIGNAL_EVENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SIGNAL_EVENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SIGNAL_EVENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.SIGNAL_EVENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.SIGNAL_EVENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SIGNAL_EVENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.SIGNAL_EVENT__NAME_EXPRESSION) != null;
			case UMLPackage.SIGNAL_EVENT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.SIGNAL_EVENT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.SIGNAL_EVENT__SIGNAL :
				return eVirtualGet(UMLPackage.SIGNAL_EVENT__SIGNAL) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //SignalEventImpl
