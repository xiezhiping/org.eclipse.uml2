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
 * $Id: GenEnumLiteralImpl.java,v 1.1 2005/05/17 22:06:28 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.codegen.ecore.genmodel.GenEnumLiteral;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenEnumLiteralImpl extends
		org.eclipse.emf.codegen.ecore.genmodel.impl.GenEnumLiteralImpl
		implements GenEnumLiteral {

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
	protected GenEnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenEnumLiteral();
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
			case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
						GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM, msgs);
			default:
				return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
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
			case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
				return eBasicSetContainer(null,
						GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM, msgs);
			default:
				return eDynamicInverseRemove(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
			case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
				return eContainer
						.eInverseRemove(
								this,
								org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS,
								GenEnum.class, msgs);
			default:
				return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
				- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
		case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
			return getGenEnum();
		case GenModelPackage.GEN_ENUM_LITERAL__ECORE_ENUM_LITERAL:
			if (resolve)
				return getEcoreEnumLiteral();
			return basicGetEcoreEnumLiteral();
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
		case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
			setGenEnum((GenEnum) newValue);
			return;
		case GenModelPackage.GEN_ENUM_LITERAL__ECORE_ENUM_LITERAL:
			setEcoreEnumLiteral((EEnumLiteral) newValue);
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
		case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
			setGenEnum((GenEnum) null);
			return;
		case GenModelPackage.GEN_ENUM_LITERAL__ECORE_ENUM_LITERAL:
			setEcoreEnumLiteral((EEnumLiteral) null);
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
		case GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM:
			return getGenEnum() != null;
		case GenModelPackage.GEN_ENUM_LITERAL__ECORE_ENUM_LITERAL:
			return ecoreEnumLiteral != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //GenEnumLiteralImpl
