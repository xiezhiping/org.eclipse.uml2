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
 * $Id: DurationIntervalImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.DurationInterval;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationIntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationIntervalImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationIntervalImpl
		extends IntervalImpl
		implements DurationInterval {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getDurationInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin() {
		ValueSpecification min = (ValueSpecification) eVirtualGet(UMLPackage.DURATION_INTERVAL__MIN);
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject) min;
			min = (ValueSpecification) eResolveProxy(oldMin);
			if (min != oldMin) {
				eVirtualSet(UMLPackage.DURATION_INTERVAL__MIN, min);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DURATION_INTERVAL__MIN, oldMin, min));
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
		return (ValueSpecification) eVirtualGet(UMLPackage.DURATION_INTERVAL__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(ValueSpecification newMin) {
		ValueSpecification min = newMin;
		Object oldMin = eVirtualSet(UMLPackage.DURATION_INTERVAL__MIN, min);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION_INTERVAL__MIN, oldMin == EVIRTUAL_NO_VALUE
					? null
					: oldMin, min));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return eVirtualGet(UMLPackage.DURATION_INTERVAL__MIN) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax() {
		ValueSpecification max = (ValueSpecification) eVirtualGet(UMLPackage.DURATION_INTERVAL__MAX);
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject) max;
			max = (ValueSpecification) eResolveProxy(oldMax);
			if (max != oldMax) {
				eVirtualSet(UMLPackage.DURATION_INTERVAL__MAX, max);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DURATION_INTERVAL__MAX, oldMax, max));
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
		return (ValueSpecification) eVirtualGet(UMLPackage.DURATION_INTERVAL__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(ValueSpecification newMax) {
		ValueSpecification max = newMax;
		Object oldMax = eVirtualSet(UMLPackage.DURATION_INTERVAL__MAX, max);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION_INTERVAL__MAX, oldMax == EVIRTUAL_NO_VALUE
					? null
					: oldMax, max));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return eVirtualGet(UMLPackage.DURATION_INTERVAL__MAX) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.DURATION_INTERVAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DURATION_INTERVAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DURATION_INTERVAL__OWNER :
				return getOwner();
			case UMLPackage.DURATION_INTERVAL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DURATION_INTERVAL__NAME :
				return getName();
			case UMLPackage.DURATION_INTERVAL__VISIBILITY :
				return getVisibility();
			case UMLPackage.DURATION_INTERVAL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DURATION_INTERVAL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DURATION_INTERVAL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DURATION_INTERVAL__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DURATION_INTERVAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DURATION_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DURATION_INTERVAL__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.DURATION_INTERVAL__MIN :
				if (resolve)
					return getMin();
				return basicGetMin();
			case UMLPackage.DURATION_INTERVAL__MAX :
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
			case UMLPackage.DURATION_INTERVAL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION_INTERVAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION_INTERVAL__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION_INTERVAL__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DURATION_INTERVAL__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DURATION_INTERVAL__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.DURATION_INTERVAL__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DURATION_INTERVAL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION_INTERVAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION_INTERVAL__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DURATION_INTERVAL__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DURATION_INTERVAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION_INTERVAL__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DURATION_INTERVAL__NAME_EXPRESSION) != null;
			case UMLPackage.DURATION_INTERVAL__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DURATION_INTERVAL__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DURATION_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION_INTERVAL__TYPE :
				return eVirtualGet(UMLPackage.DURATION_INTERVAL__TYPE) != null;
			case UMLPackage.DURATION_INTERVAL__MIN :
				return isSetMin();
			case UMLPackage.DURATION_INTERVAL__MAX :
				return isSetMax();
		}
		return eDynamicIsSet(eFeature);
	}

} //DurationIntervalImpl
