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
 * $Id: LinkEndCreationDataImpl.java,v 1.1 2005/11/14 22:26:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LinkEndCreationDataOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndCreationDataImpl#isReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndCreationDataImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndCreationDataImpl
		extends LinkEndDataImpl
		implements LinkEndCreationData {

	/**
	 * The default value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REPLACE_ALL_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndCreationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getLinkEndCreationData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceAll() {
		return (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(boolean newIsReplaceAll) {
		boolean oldIsReplaceAll = (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
		if (newIsReplaceAll)
			eFlags |= IS_REPLACE_ALL_EFLAG;
		else
			eFlags &= ~IS_REPLACE_ALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL,
				oldIsReplaceAll, newIsReplaceAll));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		InputPin insertAt = (InputPin) eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__INSERT_AT);
		if (insertAt != null && insertAt.eIsProxy()) {
			InputPin oldInsertAt = insertAt;
			insertAt = (InputPin) eResolveProxy((InternalEObject) insertAt);
			if (insertAt != oldInsertAt) {
				eVirtualSet(UMLPackage.LINK_END_CREATION_DATA__INSERT_AT,
					insertAt);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_CREATION_DATA__INSERT_AT,
						oldInsertAt, insertAt));
			}
		}
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetInsertAt() {
		return (InputPin) eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__INSERT_AT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		InputPin insertAt = newInsertAt;
		Object oldInsertAt = eVirtualSet(
			UMLPackage.LINK_END_CREATION_DATA__INSERT_AT, insertAt);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_CREATION_DATA__INSERT_AT,
				oldInsertAt == EVIRTUAL_NO_VALUE
					? null
					: oldInsertAt, insertAt));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkAction(DiagnosticChain diagnostics,
			Map context) {
		return LinkEndCreationDataOperations.validateCreateLinkAction(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleInputPin(DiagnosticChain diagnostics,
			Map context) {
		return LinkEndCreationDataOperations.validateSingleInputPin(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LINK_END_CREATION_DATA__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.LINK_END_CREATION_DATA__END :
				if (resolve)
					return getEnd();
				return basicGetEnd();
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				return getQualifiers();
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				return isReplaceAll()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				if (resolve)
					return getInsertAt();
				return basicGetInsertAt();
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
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__END :
				setEnd((Property) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				getQualifiers().clear();
				getQualifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				setIsReplaceAll(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				setInsertAt((InputPin) newValue);
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
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__END :
				setEnd((Property) null);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				setInsertAt((InputPin) null);
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
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_END_CREATION_DATA__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				return eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__VALUE) != null;
			case UMLPackage.LINK_END_CREATION_DATA__END :
				return eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__END) != null;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				List qualifier = (List) eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__QUALIFIER);
				return qualifier != null && !qualifier.isEmpty();
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				return ((eFlags & IS_REPLACE_ALL_EFLAG) != 0) != IS_REPLACE_ALL_EDEFAULT;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				return eVirtualGet(UMLPackage.LINK_END_CREATION_DATA__INSERT_AT) != null;
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
		result.append(" (isReplaceAll: "); //$NON-NLS-1$
		result.append((eFlags & IS_REPLACE_ALL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //LinkEndCreationDataImpl
