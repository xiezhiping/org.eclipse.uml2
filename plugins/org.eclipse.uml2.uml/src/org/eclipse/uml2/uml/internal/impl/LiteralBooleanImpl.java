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
 * $Id: LiteralBooleanImpl.java,v 1.1 2005/11/14 22:26:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LiteralBooleanOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LiteralBooleanImpl#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralBooleanImpl
		extends LiteralSpecificationImpl
		implements LiteralBoolean {

	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getLiteralBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return (eFlags & VALUE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = (eFlags & VALUE_EFLAG) != 0;
		if (newValue)
			eFlags |= VALUE_EFLAG;
		else
			eFlags &= ~VALUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LITERAL_BOOLEAN__VALUE, oldValue, newValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComputable() {
		return LiteralBooleanOperations.isComputable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean booleanValue() {
		return LiteralBooleanOperations.booleanValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.LITERAL_BOOLEAN__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LITERAL_BOOLEAN__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LITERAL_BOOLEAN__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LITERAL_BOOLEAN__NAME :
				return getName();
			case UMLPackage.LITERAL_BOOLEAN__VISIBILITY :
				return getVisibility();
			case UMLPackage.LITERAL_BOOLEAN__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LITERAL_BOOLEAN__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LITERAL_BOOLEAN__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LITERAL_BOOLEAN__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.LITERAL_BOOLEAN__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.LITERAL_BOOLEAN__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.LITERAL_BOOLEAN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.LITERAL_BOOLEAN__VALUE :
				return isValue()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.LITERAL_BOOLEAN__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.LITERAL_BOOLEAN__VALUE :
				setValue(((Boolean) newValue).booleanValue());
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
			case UMLPackage.LITERAL_BOOLEAN__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LITERAL_BOOLEAN__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.LITERAL_BOOLEAN__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.LITERAL_BOOLEAN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LITERAL_BOOLEAN__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LITERAL_BOOLEAN__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.LITERAL_BOOLEAN__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.LITERAL_BOOLEAN__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.LITERAL_BOOLEAN__VALUE :
				setValue(VALUE_EDEFAULT);
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
			case UMLPackage.LITERAL_BOOLEAN__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LITERAL_BOOLEAN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LITERAL_BOOLEAN__OWNER :
				return isSetOwner();
			case UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LITERAL_BOOLEAN__NAME :
				String name = eVirtualIsSet(UMLPackage.LITERAL_BOOLEAN__NAME)
					? (String) eVirtualGet(UMLPackage.LITERAL_BOOLEAN__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.LITERAL_BOOLEAN__VISIBILITY :
				return eVirtualIsSet(UMLPackage.LITERAL_BOOLEAN__VISIBILITY)
					&& eVirtualGet(UMLPackage.LITERAL_BOOLEAN__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.LITERAL_BOOLEAN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LITERAL_BOOLEAN__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.LITERAL_BOOLEAN__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.LITERAL_BOOLEAN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LITERAL_BOOLEAN__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.LITERAL_BOOLEAN__NAME_EXPRESSION) != null;
			case UMLPackage.LITERAL_BOOLEAN__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.LITERAL_BOOLEAN__TEMPLATE_PARAMETER) != null;
			case UMLPackage.LITERAL_BOOLEAN__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.LITERAL_BOOLEAN__TYPE :
				return eVirtualGet(UMLPackage.LITERAL_BOOLEAN__TYPE) != null;
			case UMLPackage.LITERAL_BOOLEAN__VALUE :
				return ((eFlags & VALUE_EFLAG) != 0) != VALUE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: "); //$NON-NLS-1$
		result.append((eFlags & VALUE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //LiteralBooleanImpl
