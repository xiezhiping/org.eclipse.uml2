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
 * $Id: GenDataTypeImpl.java,v 1.2 2005/05/25 21:24:30 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.codegen.ecore.genmodel.GenDataType;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenDataTypeImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl
		implements GenDataType {

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
	protected GenDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GenModelPackage.GEN_DATA_TYPE__GEN_PACKAGE :
				return getGenPackage();
			case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE :
				if (resolve)
					return getEcoreDataType();
				return basicGetEcoreDataType();
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
			case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE :
				setEcoreDataType((EDataType) newValue);
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
			case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE :
				setEcoreDataType((EDataType) null);
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
			case GenModelPackage.GEN_DATA_TYPE__GEN_PACKAGE :
				return getGenPackage() != null;
			case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE :
				return ecoreDataType != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //GenDataTypeImpl
