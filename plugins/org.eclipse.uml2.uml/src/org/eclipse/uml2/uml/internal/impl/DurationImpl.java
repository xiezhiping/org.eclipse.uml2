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
 * $Id: DurationImpl.java,v 1.10 2006/01/05 21:27:53 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DurationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationImpl#getObservations <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl
		extends ValueSpecificationImpl
		implements Duration {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
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
	public ValueSpecification getExpr() {
		ValueSpecification expr = (ValueSpecification) eVirtualGet(UMLPackage.DURATION__EXPR);
		if (expr != null && expr.eIsProxy()) {
			InternalEObject oldExpr = (InternalEObject) expr;
			expr = (ValueSpecification) eResolveProxy(oldExpr);
			if (expr != oldExpr) {
				eVirtualSet(UMLPackage.DURATION__EXPR, expr);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DURATION__EXPR, oldExpr, expr));
			}
		}
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetExpr() {
		return (ValueSpecification) eVirtualGet(UMLPackage.DURATION__EXPR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(ValueSpecification newExpr) {
		ValueSpecification expr = newExpr;
		Object oldExpr = eVirtualSet(UMLPackage.DURATION__EXPR, expr);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION__EXPR, oldExpr == EVIRTUAL_NO_VALUE
					? null
					: oldExpr, expr));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getObservations() {
		EList observation = (EList) eVirtualGet(UMLPackage.DURATION__OBSERVATION);
		if (observation == null) {
			eVirtualSet(UMLPackage.DURATION__OBSERVATION,
				observation = new EObjectResolvingEList(Observation.class,
					this, UMLPackage.DURATION__OBSERVATION));
		}
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation(String name) {
		for (Iterator i = getObservations().iterator(); i.hasNext();) {
			Observation observation = (Observation) i.next();
			if (name.equals(observation.getName())) {
				return observation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		return DurationOperations.stringValue(this);
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
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DURATION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.DURATION__EXPR :
				if (resolve)
					return getExpr();
				return basicGetExpr();
			case UMLPackage.DURATION__OBSERVATION :
				return getObservations();
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
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DURATION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.DURATION__EXPR :
				setExpr((ValueSpecification) newValue);
				return;
			case UMLPackage.DURATION__OBSERVATION :
				getObservations().clear();
				getObservations().addAll((Collection) newValue);
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
				unsetName();
				return;
			case UMLPackage.DURATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DURATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DURATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DURATION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.DURATION__EXPR :
				setExpr((ValueSpecification) null);
				return;
			case UMLPackage.DURATION__OBSERVATION :
				getObservations().clear();
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
				EList ownedComment = (EList) eVirtualGet(UMLPackage.DURATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DURATION__NAME :
				return isSetName();
			case UMLPackage.DURATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.DURATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DURATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DURATION__NAME_EXPRESSION) != null;
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DURATION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DURATION__TYPE :
				return eVirtualGet(UMLPackage.DURATION__TYPE) != null;
			case UMLPackage.DURATION__EXPR :
				return eVirtualGet(UMLPackage.DURATION__EXPR) != null;
			case UMLPackage.DURATION__OBSERVATION :
				EList observation = (EList) eVirtualGet(UMLPackage.DURATION__OBSERVATION);
				return observation != null && !observation.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //DurationImpl
