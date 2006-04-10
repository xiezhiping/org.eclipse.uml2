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
 * $Id: DurationIntervalImpl.java,v 1.11 2006/04/10 19:16:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Duration;
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
		return UMLPackage.Literals.DURATION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject) min;
			min = (ValueSpecification) eResolveProxy(oldMin);
			if (min != oldMin) {
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
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinGen(ValueSpecification newMin) {
		ValueSpecification oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION_INTERVAL__MIN, oldMin, min));

	}

	public void setMin(ValueSpecification newMin) {

		if (newMin != null && !(newMin instanceof Duration)) {
			throw new IllegalArgumentException(newMin.toString());
		}

		setMinGen(newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return min != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject) max;
			max = (ValueSpecification) eResolveProxy(oldMax);
			if (max != oldMax) {
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
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxGen(ValueSpecification newMax) {
		ValueSpecification oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION_INTERVAL__MAX, oldMax, max));

	}

	public void setMax(ValueSpecification newMax) {

		if (newMax != null && !(newMax instanceof Duration)) {
			throw new IllegalArgumentException(newMax.toString());
		}

		setMaxGen(newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return max != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DURATION_INTERVAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DURATION_INTERVAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DURATION_INTERVAL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DURATION_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DURATION_INTERVAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DURATION_INTERVAL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION_INTERVAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION_INTERVAL__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION_INTERVAL__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DURATION_INTERVAL__NAME :
				return isSetName();
			case UMLPackage.DURATION_INTERVAL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION_INTERVAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION_INTERVAL__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.DURATION_INTERVAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION_INTERVAL__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DURATION_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION_INTERVAL__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.DURATION_INTERVAL__TYPE :
				return type != null;
			case UMLPackage.DURATION_INTERVAL__MIN :
				return isSetMin();
			case UMLPackage.DURATION_INTERVAL__MAX :
				return isSetMax();
		}
		return eDynamicIsSet(featureID);
	}

} //DurationIntervalImpl
