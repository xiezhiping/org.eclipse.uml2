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
 * $Id: LiteralIntegerImpl.java,v 1.7 2005/12/05 18:00:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LiteralIntegerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LiteralIntegerImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralIntegerImpl
		extends LiteralSpecificationImpl
		implements LiteralInteger {

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_ESETFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LITERAL_INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		boolean oldValueESet = (eFlags & VALUE_ESETFLAG) != 0;
		eFlags |= VALUE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LITERAL_INTEGER__VALUE, oldValue, value,
				!oldValueESet));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		int oldValue = value;
		boolean oldValueESet = (eFlags & VALUE_ESETFLAG) != 0;
		value = VALUE_EDEFAULT;
		eFlags &= ~VALUE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.LITERAL_INTEGER__VALUE, oldValue, VALUE_EDEFAULT,
				oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return (eFlags & VALUE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComputable() {
		return LiteralIntegerOperations.isComputable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int integerValue() {
		return LiteralIntegerOperations.integerValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		return LiteralIntegerOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.LITERAL_INTEGER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LITERAL_INTEGER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LITERAL_INTEGER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LITERAL_INTEGER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LITERAL_INTEGER__NAME :
				return getName();
			case UMLPackage.LITERAL_INTEGER__VISIBILITY :
				return getVisibility();
			case UMLPackage.LITERAL_INTEGER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LITERAL_INTEGER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LITERAL_INTEGER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LITERAL_INTEGER__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.LITERAL_INTEGER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.LITERAL_INTEGER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.LITERAL_INTEGER__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.LITERAL_INTEGER__VALUE :
				return new Integer(getValue());
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
			case UMLPackage.LITERAL_INTEGER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.LITERAL_INTEGER__VALUE :
				setValue(((Integer) newValue).intValue());
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
			case UMLPackage.LITERAL_INTEGER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LITERAL_INTEGER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LITERAL_INTEGER__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.LITERAL_INTEGER__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.LITERAL_INTEGER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LITERAL_INTEGER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LITERAL_INTEGER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.LITERAL_INTEGER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.LITERAL_INTEGER__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.LITERAL_INTEGER__VALUE :
				unsetValue();
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
			case UMLPackage.LITERAL_INTEGER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LITERAL_INTEGER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LITERAL_INTEGER__OWNER :
				return isSetOwner();
			case UMLPackage.LITERAL_INTEGER__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LITERAL_INTEGER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LITERAL_INTEGER__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.LITERAL_INTEGER__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.LITERAL_INTEGER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.LITERAL_INTEGER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LITERAL_INTEGER__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.LITERAL_INTEGER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.LITERAL_INTEGER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LITERAL_INTEGER__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.LITERAL_INTEGER__NAME_EXPRESSION) != null;
			case UMLPackage.LITERAL_INTEGER__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.LITERAL_INTEGER__TEMPLATE_PARAMETER) != null;
			case UMLPackage.LITERAL_INTEGER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.LITERAL_INTEGER__TYPE :
				return eVirtualGet(UMLPackage.LITERAL_INTEGER__TYPE) != null;
			case UMLPackage.LITERAL_INTEGER__VALUE :
				return isSetValue();
		}
		return eDynamicIsSet(featureID);
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
		if ((eFlags & VALUE_ESETFLAG) != 0)
			result.append(value);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //LiteralIntegerImpl
