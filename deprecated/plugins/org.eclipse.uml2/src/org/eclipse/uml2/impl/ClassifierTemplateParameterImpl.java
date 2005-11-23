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
 * $Id: ClassifierTemplateParameterImpl.java,v 1.13 2005/11/23 20:05:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.ClassifierTemplateParameter;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierTemplateParameterImpl#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierTemplateParameterImpl extends TemplateParameterImpl implements ClassifierTemplateParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SUBSTITUTABLE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOW_SUBSTITUTABLE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTemplateParameterImpl() {
		super();
		eFlags |= ALLOW_SUBSTITUTABLE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.CLASSIFIER_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSubstitutable() {
		return (eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSubstitutable(boolean newAllowSubstitutable) {
		boolean oldAllowSubstitutable = (eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0;
		if (newAllowSubstitutable) eFlags |= ALLOW_SUBSTITUTABLE_EFLAG; else eFlags &= ~ALLOW_SUBSTITUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE, oldAllowSubstitutable, newAllowSubstitutable));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				if (resolve) return getParameteredElement();
				return basicGetParameteredElement();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return getOwnedParameteredElement();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return getOwnedDefault();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				return isAllowSubstitutable() ? Boolean.TRUE : Boolean.FALSE;
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
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)newValue);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				setAllowSubstitutable(((Boolean)newValue).booleanValue());
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
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)null);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)null);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)null);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)null);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)null);
				return;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				setAllowSubstitutable(ALLOW_SUBSTITUTABLE_EDEFAULT);
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
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNER:
				return isSetOwner();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature() != null;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return eVirtualGet(UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) != null;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return eVirtualGet(UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != null;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT:
				return eVirtualGet(UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT) != null;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return eVirtualGet(UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT) != null;
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				return ((eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0) != ALLOW_SUBSTITUTABLE_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allowSubstitutable: "); //$NON-NLS-1$
		result.append((eFlags & ALLOW_SUBSTITUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //ClassifierTemplateParameterImpl
