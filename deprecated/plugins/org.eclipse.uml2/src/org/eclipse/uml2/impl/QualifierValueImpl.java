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
 * $Id: QualifierValueImpl.java,v 1.9 2005/11/14 17:31:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.QualifierValue;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.QualifierValueImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.QualifierValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifierValueImpl extends ElementImpl implements QualifierValue {
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
	protected QualifierValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getQualifierValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier() {
		Property qualifier = (Property)eVirtualGet(UML2Package.QUALIFIER_VALUE__QUALIFIER);
		if (qualifier != null && qualifier.eIsProxy()) {
			Property oldQualifier = qualifier;
			qualifier = (Property)eResolveProxy((InternalEObject)qualifier);
			if (qualifier != oldQualifier) {
				eVirtualSet(UML2Package.QUALIFIER_VALUE__QUALIFIER, qualifier);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.QUALIFIER_VALUE__QUALIFIER, oldQualifier, qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetQualifier() {
		return (Property)eVirtualGet(UML2Package.QUALIFIER_VALUE__QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Property newQualifier) {
		Property qualifier = newQualifier;
		Object oldQualifier = eVirtualSet(UML2Package.QUALIFIER_VALUE__QUALIFIER, qualifier);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.QUALIFIER_VALUE__QUALIFIER, oldQualifier == EVIRTUAL_NO_VALUE ? null : oldQualifier, qualifier));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		InputPin value = (InputPin)eVirtualGet(UML2Package.QUALIFIER_VALUE__VALUE);
		if (value != null && value.eIsProxy()) {
			InputPin oldValue = value;
			value = (InputPin)eResolveProxy((InternalEObject)value);
			if (value != oldValue) {
				eVirtualSet(UML2Package.QUALIFIER_VALUE__VALUE, value);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.QUALIFIER_VALUE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetValue() {
		return (InputPin)eVirtualGet(UML2Package.QUALIFIER_VALUE__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		InputPin value = newValue;
		Object oldValue = eVirtualSet(UML2Package.QUALIFIER_VALUE__VALUE, value);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.QUALIFIER_VALUE__VALUE, oldValue == EVIRTUAL_NO_VALUE ? null : oldValue, value));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.QUALIFIER_VALUE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.QUALIFIER_VALUE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.QUALIFIER_VALUE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.QUALIFIER_VALUE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.QUALIFIER_VALUE__QUALIFIER:
				if (resolve) return getQualifier();
				return basicGetQualifier();
			case UML2Package.QUALIFIER_VALUE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case UML2Package.QUALIFIER_VALUE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.QUALIFIER_VALUE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.QUALIFIER_VALUE__QUALIFIER:
				setQualifier((Property)newValue);
				return;
			case UML2Package.QUALIFIER_VALUE__VALUE:
				setValue((InputPin)newValue);
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
			case UML2Package.QUALIFIER_VALUE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.QUALIFIER_VALUE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.QUALIFIER_VALUE__QUALIFIER:
				setQualifier((Property)null);
				return;
			case UML2Package.QUALIFIER_VALUE__VALUE:
				setValue((InputPin)null);
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
			case UML2Package.QUALIFIER_VALUE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.QUALIFIER_VALUE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.QUALIFIER_VALUE__OWNER:
				return isSetOwner();
			case UML2Package.QUALIFIER_VALUE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.QUALIFIER_VALUE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.QUALIFIER_VALUE__QUALIFIER:
				return eVirtualGet(UML2Package.QUALIFIER_VALUE__QUALIFIER) != null;
			case UML2Package.QUALIFIER_VALUE__VALUE:
				return eVirtualGet(UML2Package.QUALIFIER_VALUE__VALUE) != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //QualifierValueImpl
