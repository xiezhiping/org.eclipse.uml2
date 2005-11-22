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
 * $Id: IntervalImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IntervalImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl
		extends ValueSpecificationImpl
		implements Interval {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMin() {
		ValueSpecification min = (ValueSpecification) eVirtualGet(UMLPackage.INTERVAL__MIN);
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject) min;
			min = (ValueSpecification) eResolveProxy(oldMin);
			if (min != oldMin) {
				eVirtualSet(UMLPackage.INTERVAL__MIN, min);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERVAL__MIN, oldMin, min));
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
		return (ValueSpecification) eVirtualGet(UMLPackage.INTERVAL__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(ValueSpecification newMin) {
		ValueSpecification min = newMin;
		Object oldMin = eVirtualSet(UMLPackage.INTERVAL__MIN, min);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERVAL__MIN, oldMin == EVIRTUAL_NO_VALUE
					? null
					: oldMin, min));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMax() {
		ValueSpecification max = (ValueSpecification) eVirtualGet(UMLPackage.INTERVAL__MAX);
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject) max;
			max = (ValueSpecification) eResolveProxy(oldMax);
			if (max != oldMax) {
				eVirtualSet(UMLPackage.INTERVAL__MAX, max);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERVAL__MAX, oldMax, max));
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
		return (ValueSpecification) eVirtualGet(UMLPackage.INTERVAL__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(ValueSpecification newMax) {
		ValueSpecification max = newMax;
		Object oldMax = eVirtualSet(UMLPackage.INTERVAL__MAX, max);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERVAL__MAX, oldMax == EVIRTUAL_NO_VALUE
					? null
					: oldMax, max));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INTERVAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERVAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERVAL__OWNER :
				return getOwner();
			case UMLPackage.INTERVAL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERVAL__NAME :
				return getName();
			case UMLPackage.INTERVAL__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERVAL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERVAL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERVAL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERVAL__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INTERVAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERVAL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INTERVAL__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.INTERVAL__MIN :
				if (resolve)
					return getMin();
				return basicGetMin();
			case UMLPackage.INTERVAL__MAX :
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
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INTERVAL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERVAL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERVAL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERVAL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERVAL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERVAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERVAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERVAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERVAL__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.INTERVAL__MIN :
				setMin((ValueSpecification) newValue);
				return;
			case UMLPackage.INTERVAL__MAX :
				setMax((ValueSpecification) newValue);
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
			case UMLPackage.INTERVAL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERVAL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERVAL__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INTERVAL__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INTERVAL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERVAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERVAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERVAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERVAL__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.INTERVAL__MIN :
				setMin((ValueSpecification) null);
				return;
			case UMLPackage.INTERVAL__MAX :
				setMax((ValueSpecification) null);
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
			case UMLPackage.INTERVAL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERVAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERVAL__OWNER :
				return isSetOwner();
			case UMLPackage.INTERVAL__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INTERVAL__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERVAL__NAME :
				String name = (String) eVirtualGet(UMLPackage.INTERVAL__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INTERVAL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERVAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERVAL__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INTERVAL__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERVAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERVAL__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERVAL__NAME_EXPRESSION) != null;
			case UMLPackage.INTERVAL__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INTERVAL__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INTERVAL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERVAL__TYPE :
				return eVirtualGet(UMLPackage.INTERVAL__TYPE) != null;
			case UMLPackage.INTERVAL__MIN :
				return eVirtualGet(UMLPackage.INTERVAL__MIN) != null;
			case UMLPackage.INTERVAL__MAX :
				return eVirtualGet(UMLPackage.INTERVAL__MAX) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //IntervalImpl
