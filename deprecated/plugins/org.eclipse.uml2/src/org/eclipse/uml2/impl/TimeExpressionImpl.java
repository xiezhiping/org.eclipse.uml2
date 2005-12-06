/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TimeExpressionImpl.java,v 1.16 2005/12/06 23:18:02 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TimeExpression;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TimeExpressionImpl#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TimeExpressionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeExpressionImpl extends ValueSpecificationImpl implements TimeExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isFirstTime() <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_TIME_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isFirstTime() <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstTime()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_TIME_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeExpressionImpl() {
		super();
		eFlags |= FIRST_TIME_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.TIME_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstTime() {
		return (eFlags & FIRST_TIME_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTime(boolean newFirstTime) {
		boolean oldFirstTime = (eFlags & FIRST_TIME_EFLAG) != 0;
		if (newFirstTime) eFlags |= FIRST_TIME_EFLAG; else eFlags &= ~FIRST_TIME_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TIME_EXPRESSION__FIRST_TIME, oldFirstTime, newFirstTime));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEvent() {
		NamedElement event = (NamedElement)eVirtualGet(UML2Package.TIME_EXPRESSION__EVENT);
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (NamedElement)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				eVirtualSet(UML2Package.TIME_EXPRESSION__EVENT, event);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TIME_EXPRESSION__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetEvent() {
		return (NamedElement)eVirtualGet(UML2Package.TIME_EXPRESSION__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(NamedElement newEvent) {
		NamedElement event = newEvent;
		Object oldEvent = eVirtualSet(UML2Package.TIME_EXPRESSION__EVENT, event);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TIME_EXPRESSION__EVENT, oldEvent == EVIRTUAL_NO_VALUE ? null : oldEvent, event));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.TIME_EXPRESSION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TIME_EXPRESSION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TIME_EXPRESSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TIME_EXPRESSION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TIME_EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TIME_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TIME_EXPRESSION__NAME:
				return getName();
			case UML2Package.TIME_EXPRESSION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TIME_EXPRESSION__VISIBILITY:
				return getVisibility();
			case UML2Package.TIME_EXPRESSION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TIME_EXPRESSION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TIME_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.TIME_EXPRESSION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.TIME_EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.TIME_EXPRESSION__FIRST_TIME:
				return isFirstTime() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.TIME_EXPRESSION__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
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
			case UML2Package.TIME_EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.TIME_EXPRESSION__FIRST_TIME:
				setFirstTime(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.TIME_EXPRESSION__EVENT:
				setEvent((NamedElement)newValue);
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
			case UML2Package.TIME_EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TIME_EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TIME_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TIME_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.TIME_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.TIME_EXPRESSION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.TIME_EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.TIME_EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.TIME_EXPRESSION__TYPE:
				setType((Type)null);
				return;
			case UML2Package.TIME_EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.TIME_EXPRESSION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.TIME_EXPRESSION__FIRST_TIME:
				setFirstTime(FIRST_TIME_EDEFAULT);
				return;
			case UML2Package.TIME_EXPRESSION__EVENT:
				setEvent((NamedElement)null);
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
			case UML2Package.TIME_EXPRESSION__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.TIME_EXPRESSION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TIME_EXPRESSION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TIME_EXPRESSION__OWNER:
				return isSetOwner();
			case UML2Package.TIME_EXPRESSION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.TIME_EXPRESSION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TIME_EXPRESSION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.TIME_EXPRESSION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.TIME_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.TIME_EXPRESSION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.TIME_EXPRESSION__NAME:
				String name = (String)eVirtualGet(UML2Package.TIME_EXPRESSION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TIME_EXPRESSION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.TIME_EXPRESSION__VISIBILITY:
				return eVirtualGet(UML2Package.TIME_EXPRESSION__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.TIME_EXPRESSION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.TIME_EXPRESSION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.TIME_EXPRESSION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.TIME_EXPRESSION__NAME_EXPRESSION) != null;
			case UML2Package.TIME_EXPRESSION__TYPE:
				return eVirtualGet(UML2Package.TIME_EXPRESSION__TYPE) != null;
			case UML2Package.TIME_EXPRESSION__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.TIME_EXPRESSION__TEMPLATE_PARAMETER) != null;
			case UML2Package.TIME_EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.TIME_EXPRESSION__FIRST_TIME:
				return ((eFlags & FIRST_TIME_EFLAG) != 0) != FIRST_TIME_EDEFAULT;
			case UML2Package.TIME_EXPRESSION__EVENT:
				return eVirtualGet(UML2Package.TIME_EXPRESSION__EVENT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstTime: "); //$NON-NLS-1$
		result.append((eFlags & FIRST_TIME_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //TimeExpressionImpl
