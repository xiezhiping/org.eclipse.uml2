/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200, 208016, 247980
 *
 * $Id: GenModelPackageImpl.java,v 1.9 2009/05/15 20:43:18 jbruck Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.codegen.ecore.genmodel.GenBase;
import org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope;
import org.eclipse.uml2.codegen.ecore.genmodel.GenClass;
import org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.uml2.codegen.ecore.genmodel.GenDataType;
import org.eclipse.uml2.codegen.ecore.genmodel.GenEnum;
import org.eclipse.uml2.codegen.ecore.genmodel.GenEnumLiteral;
import org.eclipse.uml2.codegen.ecore.genmodel.GenFeature;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenOperation;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenParameter;

import org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenModelPackageImpl
		extends EPackageImpl
		implements GenModelPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genCacheAdapterScopeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenModelPackageImpl() {
		super(eNS_URI, GenModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GenModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenModelPackage init() {
		if (isInited)
			return (GenModelPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenModelPackage.eNS_URI);

		// Obtain or create and register package
		GenModelPackageImpl theGenModelPackage = (GenModelPackageImpl) (EPackage.Registry.INSTANCE
			.get(eNS_URI) instanceof GenModelPackageImpl
			? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new GenModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eINSTANCE
			.eClass();

		// Create package meta-data objects
		theGenModelPackage.createPackageContents();

		// Initialize created meta-data
		theGenModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI,
			theGenModelPackage);
		return theGenModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenBase() {
		return genBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenClass() {
		return genClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenClassifier() {
		return genClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDataType() {
		return genDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEnum() {
		return genEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEnumLiteral() {
		return genEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeature() {
		return genFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_Key() {
		return (EAttribute) genFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_PluralizationException() {
		return (EAttribute) genFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenModel() {
		return genModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModel_FactoryMethods() {
		return (EAttribute) genModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModel_PluralizedGetters() {
		return (EAttribute) genModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModel_CacheAdapterSupport() {
		return (EAttribute) genModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModel_SafeStrings() {
		return (EAttribute) genModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModel_InvariantPrefix() {
		return (EAttribute) genModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenOperation() {
		return genOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOperation_CacheAdapterScope() {
		return (EAttribute) genOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPackage() {
		return genPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPackage_ResourceInterfaces() {
		return (EAttribute) genPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPackage_OperationsPackage() {
		return (EAttribute) genPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenParameter() {
		return genParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenTypedElement() {
		return genTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenCacheAdapterScope() {
		return genCacheAdapterScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelFactory getGenModelFactory() {
		return (GenModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		genBaseEClass = createEClass(GEN_BASE);

		genClassEClass = createEClass(GEN_CLASS);

		genClassifierEClass = createEClass(GEN_CLASSIFIER);

		genDataTypeEClass = createEClass(GEN_DATA_TYPE);

		genEnumEClass = createEClass(GEN_ENUM);

		genEnumLiteralEClass = createEClass(GEN_ENUM_LITERAL);

		genFeatureEClass = createEClass(GEN_FEATURE);
		createEAttribute(genFeatureEClass, GEN_FEATURE__KEY);
		createEAttribute(genFeatureEClass, GEN_FEATURE__PLURALIZATION_EXCEPTION);

		genModelEClass = createEClass(GEN_MODEL);
		createEAttribute(genModelEClass, GEN_MODEL__FACTORY_METHODS);
		createEAttribute(genModelEClass, GEN_MODEL__PLURALIZED_GETTERS);
		createEAttribute(genModelEClass, GEN_MODEL__CACHE_ADAPTER_SUPPORT);
		createEAttribute(genModelEClass, GEN_MODEL__SAFE_STRINGS);
		createEAttribute(genModelEClass, GEN_MODEL__INVARIANT_PREFIX);

		genOperationEClass = createEClass(GEN_OPERATION);
		createEAttribute(genOperationEClass, GEN_OPERATION__CACHE_ADAPTER_SCOPE);

		genPackageEClass = createEClass(GEN_PACKAGE);
		createEAttribute(genPackageEClass, GEN_PACKAGE__RESOURCE_INTERFACES);
		createEAttribute(genPackageEClass, GEN_PACKAGE__OPERATIONS_PACKAGE);

		genParameterEClass = createEClass(GEN_PARAMETER);

		genTypedElementEClass = createEClass(GEN_TYPED_ELEMENT);

		// Create enums
		genCacheAdapterScopeEEnum = createEEnum(GEN_CACHE_ADAPTER_SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage theGenModelPackage_1 = (org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage) EPackage.Registry.INSTANCE
			.getEPackage(org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
			.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genBaseEClass.getESuperTypes().add(theGenModelPackage_1.getGenBase());
		genClassEClass.getESuperTypes().add(theGenModelPackage_1.getGenClass());
		genClassEClass.getESuperTypes().add(this.getGenClassifier());
		genClassifierEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenClassifier());
		genClassifierEClass.getESuperTypes().add(this.getGenBase());
		genDataTypeEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenDataType());
		genDataTypeEClass.getESuperTypes().add(this.getGenClassifier());
		genEnumEClass.getESuperTypes().add(theGenModelPackage_1.getGenEnum());
		genEnumEClass.getESuperTypes().add(this.getGenDataType());
		genEnumLiteralEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenEnumLiteral());
		genEnumLiteralEClass.getESuperTypes().add(this.getGenBase());
		genFeatureEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenFeature());
		genFeatureEClass.getESuperTypes().add(this.getGenTypedElement());
		genModelEClass.getESuperTypes().add(theGenModelPackage_1.getGenModel());
		genModelEClass.getESuperTypes().add(this.getGenBase());
		genOperationEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenOperation());
		genOperationEClass.getESuperTypes().add(this.getGenTypedElement());
		genPackageEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenPackage());
		genPackageEClass.getESuperTypes().add(this.getGenBase());
		genParameterEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenParameter());
		genParameterEClass.getESuperTypes().add(this.getGenTypedElement());
		genTypedElementEClass.getESuperTypes().add(
			theGenModelPackage_1.getGenTypedElement());
		genTypedElementEClass.getESuperTypes().add(this.getGenBase());

		// Initialize classes and features; add operations and parameters
		initEClass(genBaseEClass, GenBase.class,
			"GenBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
			genClassEClass,
			GenClass.class,
			"GenClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
			genClassifierEClass,
			GenClassifier.class,
			"GenClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
			genDataTypeEClass,
			GenDataType.class,
			"GenDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(genEnumEClass, GenEnum.class,
			"GenEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
			genEnumLiteralEClass,
			GenEnumLiteral.class,
			"GenEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
			genFeatureEClass,
			GenFeature.class,
			"GenFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
			getGenFeature_Key(),
			theEcorePackage.getEBoolean(),
			"key", null, 0, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getGenFeature_PluralizationException(),
			theEcorePackage.getEBoolean(),
			"pluralizationException", null, 0, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
			genModelEClass,
			GenModel.class,
			"GenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
			getGenModel_FactoryMethods(),
			theEcorePackage.getEBoolean(),
			"factoryMethods", null, 0, 1, GenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getGenModel_PluralizedGetters(),
			theEcorePackage.getEBoolean(),
			"pluralizedGetters", null, 0, 1, GenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getGenModel_CacheAdapterSupport(),
			theEcorePackage.getEBoolean(),
			"cacheAdapterSupport", null, 0, 1, GenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getGenModel_SafeStrings(),
			theEcorePackage.getEBoolean(),
			"safeStrings", null, 0, 1, GenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getGenModel_InvariantPrefix(),
			theEcorePackage.getEString(),
			"invariantPrefix", null, 0, 1, GenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
			genOperationEClass,
			GenOperation.class,
			"GenOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
			getGenOperation_CacheAdapterScope(),
			this.getGenCacheAdapterScope(),
			"cacheAdapterScope", null, 0, 1, GenOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
			genPackageEClass,
			GenPackage.class,
			"GenPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
			getGenPackage_ResourceInterfaces(),
			theEcorePackage.getEBoolean(),
			"resourceInterfaces", null, 0, 1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getGenPackage_OperationsPackage(),
			theEcorePackage.getEString(),
			"operationsPackage", null, 0, 1, GenPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
			genParameterEClass,
			GenParameter.class,
			"GenParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
			genTypedElementEClass,
			GenTypedElement.class,
			"GenTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(genCacheAdapterScopeEEnum, GenCacheAdapterScope.class,
			"GenCacheAdapterScope"); //$NON-NLS-1$
		addEEnumLiteral(genCacheAdapterScopeEEnum,
			GenCacheAdapterScope.NONE_LITERAL);
		addEEnumLiteral(genCacheAdapterScopeEEnum,
			GenCacheAdapterScope.GLOBAL_LITERAL);
		addEEnumLiteral(genCacheAdapterScopeEEnum,
			GenCacheAdapterScope.RESOURCE_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GenModelPackageImpl
