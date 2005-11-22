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
 * $Id: DurationConstraintImpl.java,v 1.2 2005/11/22 15:32:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationConstraintImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationConstraintImpl
		extends IntervalConstraintImpl
		implements DurationConstraint {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getDurationConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		return (ValueSpecification) eVirtualGet(UMLPackage.DURATION_CONSTRAINT__SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(
			ValueSpecification newSpecification, NotificationChain msgs) {
		Object oldSpecification = eVirtualSet(
			UMLPackage.DURATION_CONSTRAINT__SPECIFICATION, newSpecification);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.DURATION_CONSTRAINT__SPECIFICATION,
				oldSpecification == EVIRTUAL_NO_VALUE
					? null
					: oldSpecification, newSpecification);
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
	public void setSpecification(ValueSpecification newSpecification) {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.DURATION_CONSTRAINT__SPECIFICATION);
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DURATION_CONSTRAINT__SPECIFICATION, null,
					msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DURATION_CONSTRAINT__SPECIFICATION, null,
					msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION_CONSTRAINT__SPECIFICATION,
				newSpecification, newSpecification));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSpecification(EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setSpecification(newSpecification);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecification() {
		return eVirtualGet(UMLPackage.DURATION_CONSTRAINT__SPECIFICATION) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.DURATION_CONSTRAINT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DURATION_CONSTRAINT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DURATION_CONSTRAINT__OWNER :
				return getOwner();
			case UMLPackage.DURATION_CONSTRAINT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DURATION_CONSTRAINT__NAME :
				return getName();
			case UMLPackage.DURATION_CONSTRAINT__VISIBILITY :
				return getVisibility();
			case UMLPackage.DURATION_CONSTRAINT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DURATION_CONSTRAINT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DURATION_CONSTRAINT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DURATION_CONSTRAINT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DURATION_CONSTRAINT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DURATION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DURATION_CONSTRAINT__CONSTRAINED_ELEMENT :
				return getConstrainedElements();
			case UMLPackage.DURATION_CONSTRAINT__SPECIFICATION :
				return getSpecification();
			case UMLPackage.DURATION_CONSTRAINT__CONTEXT :
				return getContext();
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
			case UMLPackage.DURATION_CONSTRAINT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION_CONSTRAINT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION_CONSTRAINT__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION_CONSTRAINT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DURATION_CONSTRAINT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DURATION_CONSTRAINT__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.DURATION_CONSTRAINT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DURATION_CONSTRAINT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DURATION_CONSTRAINT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION_CONSTRAINT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DURATION_CONSTRAINT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DURATION_CONSTRAINT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION_CONSTRAINT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DURATION_CONSTRAINT__NAME_EXPRESSION) != null;
			case UMLPackage.DURATION_CONSTRAINT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DURATION_CONSTRAINT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DURATION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DURATION_CONSTRAINT__CONSTRAINED_ELEMENT :
				List constrainedElement = (List) eVirtualGet(UMLPackage.DURATION_CONSTRAINT__CONSTRAINED_ELEMENT);
				return constrainedElement != null
					&& !constrainedElement.isEmpty();
			case UMLPackage.DURATION_CONSTRAINT__SPECIFICATION :
				return isSetSpecification();
			case UMLPackage.DURATION_CONSTRAINT__CONTEXT :
				return getContext() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //DurationConstraintImpl
