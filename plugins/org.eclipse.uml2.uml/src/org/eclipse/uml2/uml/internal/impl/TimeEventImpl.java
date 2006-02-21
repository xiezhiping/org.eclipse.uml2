/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TimeEventImpl.java,v 1.11 2006/02/21 16:12:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.TimeEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeEventImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeEventImpl#isRelative <em>Is Relative</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeEventImpl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEventImpl
		extends EventImpl
		implements TimeEvent {

	/**
	 * The default value of the '{@link #isRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_RELATIVE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.TIME_EVENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.TIME_EVENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.TIME_EVENT__OWNED_ELEMENT, new int[]{
						UMLPackage.TIME_EVENT__OWNED_COMMENT,
						UMLPackage.TIME_EVENT__NAME_EXPRESSION,
						UMLPackage.TIME_EVENT__WHEN}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelative() {
		return (eFlags & IS_RELATIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		boolean oldIsRelative = (eFlags & IS_RELATIVE_EFLAG) != 0;
		if (newIsRelative)
			eFlags |= IS_RELATIVE_EFLAG;
		else
			eFlags &= ~IS_RELATIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_EVENT__IS_RELATIVE, oldIsRelative,
				newIsRelative));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWhen() {
		ValueSpecification when = (ValueSpecification) eVirtualGet(UMLPackage.TIME_EVENT__WHEN);
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject) when;
			when = (ValueSpecification) eResolveProxy(oldWhen);
			if (when != oldWhen) {
				InternalEObject newWhen = (InternalEObject) when;
				NotificationChain msgs = oldWhen.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TIME_EVENT__WHEN, null,
					null);
				if (newWhen.eInternalContainer() == null) {
					msgs = newWhen.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_EVENT__WHEN, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_EVENT__WHEN, oldWhen, when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetWhen() {
		return (ValueSpecification) eVirtualGet(UMLPackage.TIME_EVENT__WHEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(ValueSpecification newWhen,
			NotificationChain msgs) {
		Object oldWhen = eVirtualSet(UMLPackage.TIME_EVENT__WHEN, newWhen);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TIME_EVENT__WHEN,
				oldWhen == EVIRTUAL_NO_VALUE
					? null
					: oldWhen, newWhen);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(ValueSpecification newWhen) {
		ValueSpecification when = (ValueSpecification) eVirtualGet(UMLPackage.TIME_EVENT__WHEN);
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject) when).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TIME_EVENT__WHEN, null,
					msgs);
			if (newWhen != null)
				msgs = ((InternalEObject) newWhen).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TIME_EVENT__WHEN, null,
					msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_EVENT__WHEN, newWhen, newWhen));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createWhen(EClass eClass) {
		ValueSpecification newWhen = (ValueSpecification) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setWhen(newWhen);
		return newWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhenNonNegative(DiagnosticChain diagnostics,
			Map context) {
		return TimeEventOperations.validateWhenNonNegative(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartingTime(DiagnosticChain diagnostics, Map context) {
		return TimeEventOperations.validateStartingTime(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TIME_EVENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TIME_EVENT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TIME_EVENT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TIME_EVENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.TIME_EVENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.TIME_EVENT__WHEN :
				return basicSetWhen(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TIME_EVENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_EVENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_EVENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_EVENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_EVENT__NAME :
				return getName();
			case UMLPackage.TIME_EVENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_EVENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_EVENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_EVENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_EVENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.TIME_EVENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_EVENT__IS_RELATIVE :
				return isRelative()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.TIME_EVENT__WHEN :
				if (resolve)
					return getWhen();
				return basicGetWhen();
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
			case UMLPackage.TIME_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_EVENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TIME_EVENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TIME_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_EVENT__IS_RELATIVE :
				setIsRelative(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.TIME_EVENT__WHEN :
				setWhen((ValueSpecification) newValue);
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
			case UMLPackage.TIME_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TIME_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TIME_EVENT__NAME :
				unsetName();
				return;
			case UMLPackage.TIME_EVENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TIME_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.TIME_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_EVENT__IS_RELATIVE :
				setIsRelative(IS_RELATIVE_EDEFAULT);
				return;
			case UMLPackage.TIME_EVENT__WHEN :
				setWhen((ValueSpecification) null);
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
			case UMLPackage.TIME_EVENT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TIME_EVENT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_EVENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_EVENT__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_EVENT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TIME_EVENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TIME_EVENT__NAME :
				return isSetName();
			case UMLPackage.TIME_EVENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TIME_EVENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_EVENT__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.TIME_EVENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.TIME_EVENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_EVENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.TIME_EVENT__NAME_EXPRESSION) != null;
			case UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.TIME_EVENT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.TIME_EVENT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.TIME_EVENT__IS_RELATIVE :
				return ((eFlags & IS_RELATIVE_EFLAG) != 0) != IS_RELATIVE_EDEFAULT;
			case UMLPackage.TIME_EVENT__WHEN :
				return eVirtualGet(UMLPackage.TIME_EVENT__WHEN) != null;
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
		result.append(" (isRelative: "); //$NON-NLS-1$
		result.append((eFlags & IS_RELATIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TIME_EVENT__WHEN);
	}

} //TimeEventImpl
