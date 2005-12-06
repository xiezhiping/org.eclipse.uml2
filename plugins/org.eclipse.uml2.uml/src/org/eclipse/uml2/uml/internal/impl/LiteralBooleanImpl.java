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
 * $Id: LiteralBooleanImpl.java,v 1.8 2005/12/06 23:21:49 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
	 * The flag representing whether the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_ESETFLAG = 1 << 9;

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
		return UMLPackage.Literals.LITERAL_BOOLEAN;
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
		boolean oldValueESet = (eFlags & VALUE_ESETFLAG) != 0;
		eFlags |= VALUE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LITERAL_BOOLEAN__VALUE, oldValue, newValue,
				!oldValueESet));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		boolean oldValue = (eFlags & VALUE_EFLAG) != 0;
		boolean oldValueESet = (eFlags & VALUE_ESETFLAG) != 0;
		if (VALUE_EDEFAULT)
			eFlags |= VALUE_EFLAG;
		else
			eFlags &= ~VALUE_EFLAG;
		eFlags &= ~VALUE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.LITERAL_BOOLEAN__VALUE, oldValue, VALUE_EDEFAULT,
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
	public String stringValue() {
		return LiteralBooleanOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.LITERAL_BOOLEAN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.LITERAL_BOOLEAN__VALUE :
				return isValue()
					? Boolean.TRUE
					: Boolean.FALSE;
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
			case UMLPackage.LITERAL_BOOLEAN__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.LITERAL_BOOLEAN__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LITERAL_BOOLEAN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LITERAL_BOOLEAN__OWNER :
				return isSetOwner();
			case UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LITERAL_BOOLEAN__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.LITERAL_BOOLEAN__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.LITERAL_BOOLEAN__VISIBILITY :
				return isSetVisibility();
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
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.LITERAL_BOOLEAN__TYPE :
				return eVirtualGet(UMLPackage.LITERAL_BOOLEAN__TYPE) != null;
			case UMLPackage.LITERAL_BOOLEAN__VALUE :
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
			result.append((eFlags & VALUE_EFLAG) != 0);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //LiteralBooleanImpl
