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
 * $Id: LiteralBooleanImpl.java,v 1.13 2005/11/23 13:25:33 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.internal.operation.LiteralBooleanOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LiteralBooleanImpl#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralBooleanImpl extends LiteralSpecificationImpl implements LiteralBoolean {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getLiteralBoolean();
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
		if (newValue) eFlags |= VALUE_EFLAG; else eFlags &= ~VALUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LITERAL_BOOLEAN__VALUE, oldValue, newValue));

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.LITERAL_BOOLEAN__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.LITERAL_BOOLEAN__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.LITERAL_BOOLEAN__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.LITERAL_BOOLEAN__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.LITERAL_BOOLEAN__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.LITERAL_BOOLEAN__NAME:
				return getName();
			case UML2Package.LITERAL_BOOLEAN__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.LITERAL_BOOLEAN__VISIBILITY:
				return getVisibility();
			case UML2Package.LITERAL_BOOLEAN__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.LITERAL_BOOLEAN__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.LITERAL_BOOLEAN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.LITERAL_BOOLEAN__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.LITERAL_BOOLEAN__VALUE:
				return isValue() ? Boolean.TRUE : Boolean.FALSE;
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
			case UML2Package.LITERAL_BOOLEAN__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__NAME:
				setName((String)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.LITERAL_BOOLEAN__VALUE:
				setValue(((Boolean)newValue).booleanValue());
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
			case UML2Package.LITERAL_BOOLEAN__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.LITERAL_BOOLEAN__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.LITERAL_BOOLEAN__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.LITERAL_BOOLEAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.LITERAL_BOOLEAN__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.LITERAL_BOOLEAN__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.LITERAL_BOOLEAN__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.LITERAL_BOOLEAN__TYPE:
				setType((Type)null);
				return;
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.LITERAL_BOOLEAN__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.LITERAL_BOOLEAN__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case UML2Package.LITERAL_BOOLEAN__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.LITERAL_BOOLEAN__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.LITERAL_BOOLEAN__OWNER:
				return isSetOwner();
			case UML2Package.LITERAL_BOOLEAN__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.LITERAL_BOOLEAN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.LITERAL_BOOLEAN__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.LITERAL_BOOLEAN__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.LITERAL_BOOLEAN__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.LITERAL_BOOLEAN__NAME:
				String name = (String)eVirtualGet(UML2Package.LITERAL_BOOLEAN__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.LITERAL_BOOLEAN__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.LITERAL_BOOLEAN__VISIBILITY:
				return eVirtualGet(UML2Package.LITERAL_BOOLEAN__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.LITERAL_BOOLEAN__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.LITERAL_BOOLEAN__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.LITERAL_BOOLEAN__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.LITERAL_BOOLEAN__NAME_EXPRESSION) != null;
			case UML2Package.LITERAL_BOOLEAN__TYPE:
				return eVirtualGet(UML2Package.LITERAL_BOOLEAN__TYPE) != null;
			case UML2Package.LITERAL_BOOLEAN__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.LITERAL_BOOLEAN__TEMPLATE_PARAMETER) != null;
			case UML2Package.LITERAL_BOOLEAN__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.LITERAL_BOOLEAN__VALUE:
				return ((eFlags & VALUE_EFLAG) != 0) != VALUE_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: "); //$NON-NLS-1$
		result.append((eFlags & VALUE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	/**
	 * @see org.eclipse.uml2.ValueSpecification#stringValue()
	 */
	public String stringValue() {
		return String.valueOf(isValue());
	}

} //LiteralBooleanImpl
