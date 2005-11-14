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
 * $Id: TimeIntervalImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeIntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeIntervalImpl#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeIntervalImpl
		extends IntervalImpl
		implements TimeInterval {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getTimeInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax() {
		ValueSpecification max = (ValueSpecification) eVirtualGet(UMLPackage.TIME_INTERVAL__MAX);
		if (max != null && max.eIsProxy()) {
			ValueSpecification oldMax = max;
			max = (ValueSpecification) eResolveProxy((InternalEObject) max);
			if (max != oldMax) {
				eVirtualSet(UMLPackage.TIME_INTERVAL__MAX, max);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_INTERVAL__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetMax() {
		return (ValueSpecification) eVirtualGet(UMLPackage.TIME_INTERVAL__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(ValueSpecification newMax) {
		ValueSpecification max = newMax;
		Object oldMax = eVirtualSet(UMLPackage.TIME_INTERVAL__MAX, max);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_INTERVAL__MAX, oldMax == EVIRTUAL_NO_VALUE
					? null
					: oldMax, max));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return eVirtualGet(UMLPackage.TIME_INTERVAL__MAX) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin() {
		ValueSpecification min = (ValueSpecification) eVirtualGet(UMLPackage.TIME_INTERVAL__MIN);
		if (min != null && min.eIsProxy()) {
			ValueSpecification oldMin = min;
			min = (ValueSpecification) eResolveProxy((InternalEObject) min);
			if (min != oldMin) {
				eVirtualSet(UMLPackage.TIME_INTERVAL__MIN, min);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_INTERVAL__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetMin() {
		return (ValueSpecification) eVirtualGet(UMLPackage.TIME_INTERVAL__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(ValueSpecification newMin) {
		ValueSpecification min = newMin;
		Object oldMin = eVirtualSet(UMLPackage.TIME_INTERVAL__MIN, min);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_INTERVAL__MIN, oldMin == EVIRTUAL_NO_VALUE
					? null
					: oldMin, min));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return eVirtualGet(UMLPackage.TIME_INTERVAL__MIN) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.TIME_INTERVAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_INTERVAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_INTERVAL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_INTERVAL__NAME :
				return getName();
			case UMLPackage.TIME_INTERVAL__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_INTERVAL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_INTERVAL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_INTERVAL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.TIME_INTERVAL__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.TIME_INTERVAL__MIN :
				if (resolve)
					return getMin();
				return basicGetMin();
			case UMLPackage.TIME_INTERVAL__MAX :
				if (resolve)
					return getMax();
				return basicGetMax();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.TIME_INTERVAL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_INTERVAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_INTERVAL__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.TIME_INTERVAL__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TIME_INTERVAL__NAME :
				String name = eVirtualIsSet(UMLPackage.TIME_INTERVAL__NAME)
					? (String) eVirtualGet(UMLPackage.TIME_INTERVAL__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.TIME_INTERVAL__VISIBILITY :
				return eVirtualIsSet(UMLPackage.TIME_INTERVAL__VISIBILITY)
					&& eVirtualGet(UMLPackage.TIME_INTERVAL__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.TIME_INTERVAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_INTERVAL__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.TIME_INTERVAL__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.TIME_INTERVAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.TIME_INTERVAL__NAME_EXPRESSION) != null;
			case UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER) != null;
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.TIME_INTERVAL__TYPE :
				return eVirtualGet(UMLPackage.TIME_INTERVAL__TYPE) != null;
			case UMLPackage.TIME_INTERVAL__MIN :
				return eVirtualGet(UMLPackage.TIME_INTERVAL__MIN) != null;
			case UMLPackage.TIME_INTERVAL__MAX :
				return eVirtualGet(UMLPackage.TIME_INTERVAL__MAX) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TimeIntervalImpl
