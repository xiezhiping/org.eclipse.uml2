/*
 * Copyright (c) 2005, 2013 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 208016, 397324
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.codegen.ecore.genmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenModelFactoryImpl
		extends EFactoryImpl
		implements GenModelFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenModelFactory init() {
		try {
			GenModelFactory theGenModelFactory = (GenModelFactory) EPackage.Registry.INSTANCE
				.getEFactory(GenModelPackage.eNS_URI);
			if (theGenModelFactory != null) {
				return theGenModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenModelPackage.GEN_CLASS :
				return createGenClass();
			case GenModelPackage.GEN_DATA_TYPE :
				return createGenDataType();
			case GenModelPackage.GEN_ENUM :
				return createGenEnum();
			case GenModelPackage.GEN_ENUM_LITERAL :
				return createGenEnumLiteral();
			case GenModelPackage.GEN_FEATURE :
				return createGenFeature();
			case GenModelPackage.GEN_MODEL :
				return createGenModel();
			case GenModelPackage.GEN_OPERATION :
				return createGenOperation();
			case GenModelPackage.GEN_PACKAGE :
				return createGenPackage();
			case GenModelPackage.GEN_PARAMETER :
				return createGenParameter();
			default :
				throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenModelPackage.GEN_CACHE_ADAPTER_SCOPE :
				return createGenCacheAdapterScopeFromString(eDataType,
					initialValue);
			default :
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenModelPackage.GEN_CACHE_ADAPTER_SCOPE :
				return convertGenCacheAdapterScopeToString(eDataType,
					instanceValue);
			default :
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass createGenClass() {
		GenClassImpl genClass = new GenClassImpl();
		return genClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType createGenDataType() {
		GenDataTypeImpl genDataType = new GenDataTypeImpl();
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEnum createGenEnum() {
		GenEnumImpl genEnum = new GenEnumImpl();
		return genEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEnumLiteral createGenEnumLiteral() {
		GenEnumLiteralImpl genEnumLiteral = new GenEnumLiteralImpl();
		return genEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature createGenFeature() {
		GenFeatureImpl genFeature = new GenFeatureImpl();
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel createGenModel() {
		GenModelImpl genModel = new GenModelImpl();
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOperation createGenOperation() {
		GenOperationImpl genOperation = new GenOperationImpl();
		return genOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage createGenPackage() {
		GenPackageImpl genPackage = new GenPackageImpl();
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenParameter createGenParameter() {
		GenParameterImpl genParameter = new GenParameterImpl();
		return genParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCacheAdapterScope createGenCacheAdapterScopeFromString(
			EDataType eDataType, String initialValue) {
		GenCacheAdapterScope result = GenCacheAdapterScope.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenCacheAdapterScopeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelPackage getGenModelPackage() {
		return (GenModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenModelPackage getPackage() {
		return GenModelPackage.eINSTANCE;
	}

} //GenModelFactoryImpl
