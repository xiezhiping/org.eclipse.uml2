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
 * $Id: TypedElementImpl.java,v 1.1 2005/11/14 22:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TypedElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedElementImpl
		extends NamedElementImpl
		implements TypedElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getTypedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = (Type) eVirtualGet(UMLPackage.TYPED_ELEMENT__TYPE);
		if (type != null && type.eIsProxy()) {
			Type oldType = type;
			type = (Type) eResolveProxy((InternalEObject) type);
			if (type != oldType) {
				eVirtualSet(UMLPackage.TYPED_ELEMENT__TYPE, type);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TYPED_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return (Type) eVirtualGet(UMLPackage.TYPED_ELEMENT__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type type = newType;
		Object oldType = eVirtualSet(UMLPackage.TYPED_ELEMENT__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TYPED_ELEMENT__TYPE, oldType == EVIRTUAL_NO_VALUE
					? null
					: oldType, type));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.TYPED_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TYPED_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TYPED_ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TYPED_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TYPED_ELEMENT__NAME :
				return getName();
			case UMLPackage.TYPED_ELEMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.TYPED_ELEMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TYPED_ELEMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TYPED_ELEMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TYPED_ELEMENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.TYPED_ELEMENT__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
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
			case UMLPackage.TYPED_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TYPED_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TYPED_ELEMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TYPED_ELEMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TYPED_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.TYPED_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TYPED_ELEMENT__TYPE :
				setType((Type) newValue);
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
			case UMLPackage.TYPED_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TYPED_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TYPED_ELEMENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.TYPED_ELEMENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.TYPED_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.TYPED_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TYPED_ELEMENT__TYPE :
				setType((Type) null);
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
			case UMLPackage.TYPED_ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TYPED_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TYPED_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.TYPED_ELEMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.TYPED_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TYPED_ELEMENT__NAME :
				String name = eVirtualIsSet(UMLPackage.TYPED_ELEMENT__NAME)
					? (String) eVirtualGet(UMLPackage.TYPED_ELEMENT__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.TYPED_ELEMENT__VISIBILITY :
				return eVirtualIsSet(UMLPackage.TYPED_ELEMENT__VISIBILITY)
					&& eVirtualGet(UMLPackage.TYPED_ELEMENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.TYPED_ELEMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TYPED_ELEMENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.TYPED_ELEMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.TYPED_ELEMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TYPED_ELEMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.TYPED_ELEMENT__NAME_EXPRESSION) != null;
			case UMLPackage.TYPED_ELEMENT__TYPE :
				return eVirtualGet(UMLPackage.TYPED_ELEMENT__TYPE) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TypedElementImpl
