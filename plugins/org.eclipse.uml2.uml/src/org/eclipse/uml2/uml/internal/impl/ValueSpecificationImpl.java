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
 * $Id: ValueSpecificationImpl.java,v 1.12 2006/12/14 15:49:30 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ValueSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValueSpecificationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueSpecificationImpl
		extends PackageableElementImpl
		implements ValueSpecification {

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VALUE_SPECIFICATION__TYPE, oldType, type));
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
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {

		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VALUE_SPECIFICATION__TYPE, oldType, type));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComputable() {
		return ValueSpecificationOperations.isComputable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int integerValue() {
		return ValueSpecificationOperations.integerValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean booleanValue() {
		return ValueSpecificationOperations.booleanValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		return ValueSpecificationOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int unlimitedValue() {
		return ValueSpecificationOperations.unlimitedValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNull() {
		return ValueSpecificationOperations.isNull(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ValueSpecificationOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.VALUE_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VALUE_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VALUE_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VALUE_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VALUE_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.VALUE_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.VALUE_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VALUE_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VALUE_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.VALUE_SPECIFICATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.VALUE_SPECIFICATION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.VALUE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION__TYPE :
				setType((Type) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.VALUE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.VALUE_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION__TYPE :
				setType((Type) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.VALUE_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VALUE_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.VALUE_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.VALUE_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VALUE_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VALUE_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.VALUE_SPECIFICATION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.VALUE_SPECIFICATION__TYPE :
				return type != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.VALUE_SPECIFICATION__TYPE :
					return UMLPackage.TYPED_ELEMENT__TYPE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE :
					return UMLPackage.VALUE_SPECIFICATION__TYPE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ValueSpecificationImpl
