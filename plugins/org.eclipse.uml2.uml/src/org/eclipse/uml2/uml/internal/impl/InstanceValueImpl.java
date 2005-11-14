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
 * $Id: InstanceValueImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceValueImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceValueImpl
		extends ValueSpecificationImpl
		implements InstanceValue {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getInstanceValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getInstance() {
		InstanceSpecification instance = (InstanceSpecification) eVirtualGet(UMLPackage.INSTANCE_VALUE__INSTANCE);
		if (instance != null && instance.eIsProxy()) {
			InstanceSpecification oldInstance = instance;
			instance = (InstanceSpecification) eResolveProxy((InternalEObject) instance);
			if (instance != oldInstance) {
				eVirtualSet(UMLPackage.INSTANCE_VALUE__INSTANCE, instance);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INSTANCE_VALUE__INSTANCE, oldInstance,
						instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetInstance() {
		return (InstanceSpecification) eVirtualGet(UMLPackage.INSTANCE_VALUE__INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(InstanceSpecification newInstance) {
		InstanceSpecification instance = newInstance;
		Object oldInstance = eVirtualSet(UMLPackage.INSTANCE_VALUE__INSTANCE,
			instance);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INSTANCE_VALUE__INSTANCE,
				oldInstance == EVIRTUAL_NO_VALUE
					? null
					: oldInstance, instance));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INSTANCE_VALUE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INSTANCE_VALUE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INSTANCE_VALUE__NAME :
				return getName();
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INSTANCE_VALUE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INSTANCE_VALUE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.INSTANCE_VALUE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				if (resolve)
					return getInstance();
				return basicGetInstance();
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
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				setInstance((InstanceSpecification) newValue);
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
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INSTANCE_VALUE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INSTANCE_VALUE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				setInstance((InstanceSpecification) null);
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
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INSTANCE_VALUE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INSTANCE_VALUE__OWNER :
				return isSetOwner();
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INSTANCE_VALUE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INSTANCE_VALUE__NAME :
				String name = eVirtualIsSet(UMLPackage.INSTANCE_VALUE__NAME)
					? (String) eVirtualGet(UMLPackage.INSTANCE_VALUE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.INSTANCE_VALUE__VISIBILITY)
					&& eVirtualGet(UMLPackage.INSTANCE_VALUE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.INSTANCE_VALUE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INSTANCE_VALUE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION) != null;
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.INSTANCE_VALUE__TYPE :
				return eVirtualGet(UMLPackage.INSTANCE_VALUE__TYPE) != null;
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				return eVirtualGet(UMLPackage.INSTANCE_VALUE__INSTANCE) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //InstanceValueImpl
