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
 * $Id: DurationImpl.java,v 1.6 2005/12/06 23:21:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationImpl#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationImpl#getEvents <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl
		extends ValueSpecificationImpl
		implements Duration {

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
	protected DurationImpl() {
		super();
		eFlags |= FIRST_TIME_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DURATION;
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
		if (newFirstTime)
			eFlags |= FIRST_TIME_EFLAG;
		else
			eFlags &= ~FIRST_TIME_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION__FIRST_TIME, oldFirstTime, newFirstTime));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEvents() {
		List event = (List) eVirtualGet(UMLPackage.DURATION__EVENT);
		if (event == null) {
			eVirtualSet(UMLPackage.DURATION__EVENT,
				event = new EObjectResolvingEList(NamedElement.class, this,
					UMLPackage.DURATION__EVENT));
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEvent(String name) {
		for (Iterator i = getEvents().iterator(); i.hasNext();) {
			NamedElement event = (NamedElement) i.next();
			if (name.equals(event.getName())) {
				return event;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DURATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DURATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DURATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DURATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DURATION__NAME :
				return getName();
			case UMLPackage.DURATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DURATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DURATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DURATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DURATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DURATION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.DURATION__FIRST_TIME :
				return isFirstTime()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DURATION__EVENT :
				return getEvents();
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
			case UMLPackage.DURATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DURATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DURATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DURATION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.DURATION__FIRST_TIME :
				setFirstTime(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DURATION__EVENT :
				getEvents().clear();
				getEvents().addAll((Collection) newValue);
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
			case UMLPackage.DURATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DURATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DURATION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.DURATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.DURATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DURATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DURATION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.DURATION__FIRST_TIME :
				setFirstTime(FIRST_TIME_EDEFAULT);
				return;
			case UMLPackage.DURATION__EVENT :
				getEvents().clear();
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
			case UMLPackage.DURATION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DURATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DURATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DURATION__NAME :
				String name = (String) eVirtualGet(UMLPackage.DURATION__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DURATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DURATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DURATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DURATION__NAME_EXPRESSION) != null;
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DURATION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION__TYPE :
				return eVirtualGet(UMLPackage.DURATION__TYPE) != null;
			case UMLPackage.DURATION__FIRST_TIME :
				return ((eFlags & FIRST_TIME_EFLAG) != 0) != FIRST_TIME_EDEFAULT;
			case UMLPackage.DURATION__EVENT :
				List event = (List) eVirtualGet(UMLPackage.DURATION__EVENT);
				return event != null && !event.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstTime: "); //$NON-NLS-1$
		result.append((eFlags & FIRST_TIME_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //DurationImpl
