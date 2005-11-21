/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TypedElementImpl.java,v 1.12 2005/11/21 21:48:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TypedElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedElementImpl extends NamedElementImpl implements TypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getTypedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = (Type)eVirtualGet(UML2Package.TYPED_ELEMENT__TYPE);
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				eVirtualSet(UML2Package.TYPED_ELEMENT__TYPE, type);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TYPED_ELEMENT__TYPE, oldType, type));
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
		return (Type)eVirtualGet(UML2Package.TYPED_ELEMENT__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type type = newType;
		Object oldType = eVirtualSet(UML2Package.TYPED_ELEMENT__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TYPED_ELEMENT__TYPE, oldType == EVIRTUAL_NO_VALUE ? null : oldType, type));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TYPED_ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TYPED_ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TYPED_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TYPED_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TYPED_ELEMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TYPED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TYPED_ELEMENT__NAME:
				return getName();
			case UML2Package.TYPED_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TYPED_ELEMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.TYPED_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TYPED_ELEMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TYPED_ELEMENT__TYPE:
				if (resolve) return getType();
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
			case UML2Package.TYPED_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.TYPED_ELEMENT__TYPE:
				setType((Type)newValue);
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
			case UML2Package.TYPED_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TYPED_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TYPED_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TYPED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.TYPED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.TYPED_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.TYPED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.TYPED_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.TYPED_ELEMENT__TYPE:
				setType((Type)null);
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
			case UML2Package.TYPED_ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TYPED_ELEMENT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TYPED_ELEMENT__OWNER:
				return isSetOwner();
			case UML2Package.TYPED_ELEMENT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.TYPED_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TYPED_ELEMENT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.TYPED_ELEMENT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.TYPED_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.TYPED_ELEMENT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.TYPED_ELEMENT__NAME:
				String name = eVirtualIsSet(UML2Package.TYPED_ELEMENT__NAME) ? (String)eVirtualGet(UML2Package.TYPED_ELEMENT__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TYPED_ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.TYPED_ELEMENT__VISIBILITY:
				return eVirtualIsSet(UML2Package.TYPED_ELEMENT__VISIBILITY) && eVirtualGet(UML2Package.TYPED_ELEMENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.TYPED_ELEMENT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.TYPED_ELEMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.TYPED_ELEMENT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.TYPED_ELEMENT__NAME_EXPRESSION) != null;
			case UML2Package.TYPED_ELEMENT__TYPE:
				return eVirtualGet(UML2Package.TYPED_ELEMENT__TYPE) != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //TypedElementImpl
