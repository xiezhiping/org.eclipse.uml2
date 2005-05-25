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
 * $Id: GenEnumImpl.java,v 1.2 2005/05/25 21:24:30 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.codegen.ecore.genmodel.GenEnum;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenEnumImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenEnumImpl
		implements GenEnum {

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
	protected GenEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenEnum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS :
					return ((InternalEList) getGenEnumLiterals()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS :
					return ((InternalEList) getGenEnumLiterals()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GenModelPackage.GEN_ENUM__GEN_PACKAGE :
				return getGenPackage();
			case GenModelPackage.GEN_ENUM__ECORE_DATA_TYPE :
				if (resolve)
					return getEcoreDataType();
				return basicGetEcoreDataType();
			case GenModelPackage.GEN_ENUM__ECORE_ENUM :
				if (resolve)
					return getEcoreEnum();
				return basicGetEcoreEnum();
			case GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS :
				return getGenEnumLiterals();
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
			case GenModelPackage.GEN_ENUM__ECORE_DATA_TYPE :
				setEcoreDataType((EDataType) newValue);
				return;
			case GenModelPackage.GEN_ENUM__ECORE_ENUM :
				setEcoreEnum((EEnum) newValue);
				return;
			case GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS :
				getGenEnumLiterals().clear();
				getGenEnumLiterals().addAll((Collection) newValue);
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
			case GenModelPackage.GEN_ENUM__ECORE_DATA_TYPE :
				setEcoreDataType((EDataType) null);
				return;
			case GenModelPackage.GEN_ENUM__ECORE_ENUM :
				setEcoreEnum((EEnum) null);
				return;
			case GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS :
				getGenEnumLiterals().clear();
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
			case GenModelPackage.GEN_ENUM__GEN_PACKAGE :
				return getGenPackage() != null;
			case GenModelPackage.GEN_ENUM__ECORE_DATA_TYPE :
				return ecoreDataType != null;
			case GenModelPackage.GEN_ENUM__ECORE_ENUM :
				return ecoreEnum != null;
			case GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS :
				return genEnumLiterals != null && !genEnumLiterals.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //GenEnumImpl
