/*
 * Copyright (c) 2005, 2013 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 208016, 206636
 *   Kenn Hussey (CEA) - 394623, 212765
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.util;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope;

/**
 * 
 */
public class UML2GenModelUtil {

	protected UML2GenModelUtil() {
		super();
	}

	public static final String UML2_GEN_MODEL_PACKAGE_1_1_NS_URI = "http://www.eclipse.org/uml2/1.1.0/GenModel"; //$NON-NLS-1$

	/**
	 * @since 1.3
	 */
	public static String getUpperName(String name) {
		return CodeGenUtil.format(name, '_', null, false, true).toUpperCase();
	}

	// GenBase utilities

	public static GenAnnotation createGenAnnotation(GenBase genBase,
			String source) {
		GenAnnotation genAnnotation = GenModelFactory.eINSTANCE
			.createGenAnnotation();

		genAnnotation.setSource(source);
		genAnnotation.setGenBase(genBase);

		return genAnnotation;
	}

	public static GenAnnotation getGenAnnotation(GenBase genBase,
			String source, boolean createOnDemand) {
		GenAnnotation genAnnotation = genBase.getGenAnnotation(source);

		return genAnnotation == null && createOnDemand
			? createGenAnnotation(genBase, source)
			: genAnnotation;
	}

	// GenModel utilities

	public static String getInvariantPrefix(GenModel genModel) {
		return genModel instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenModel
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenModel) genModel)
				.getInvariantPrefix()
			: null;
	}

	public static boolean isCacheAdapterSupport(GenModel genModel) {
		return genModel instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenModel
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenModel) genModel)
				.isCacheAdapterSupport();
	}

	public static boolean isFactoryMethods(GenModel genModel) {
		return genModel instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenModel
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenModel) genModel)
				.isFactoryMethods();
	}

	public static boolean isPluralizedGetters(GenModel genModel) {
		return genModel instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenModel
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenModel) genModel)
				.isPluralizedGetters();
	}

	public static boolean isSafeStrings(GenModel genModel) {
		return genModel instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenModel
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenModel) genModel)
				.isSafeStrings();
	}

	// GenPackage utilities

	public static boolean isResourceInterfaces(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.isResourceInterfaces();
	}

	public static boolean isOperationsClasses(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.isOperationsClasses();
	}

	public static String getOperationsPackage(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getOperationsPackage()
			: null;
	}

	public static String getOperationsPackageName(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getOperationsPackageName()
			: null;
	}

	public static String getResourceInterfaceName(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getResourceInterfaceName()
			: null;
	}

	public static String getQualifiedResourceInterfaceName(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getQualifiedResourceInterfaceName()
			: null;
	}

	public static String getImportedResourceInterfaceName(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getImportedResourceInterfaceName()
			: null;
	}

	public static String getImportedResourceBaseInterfaceName(
			GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getImportedResourceBaseInterfaceName()
			: null;
	}

	public static String getImportedResourceFactoryInterfaceName(
			GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getImportedResourceFactoryInterfaceName()
			: null;
	}

	public static String getImportedResourceFactoryBaseInterfaceName(
			GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getImportedResourceFactoryBaseInterfaceName()
			: null;
	}

	public static boolean isXMLResource(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.isXMLResource();
	}

	/**
	 * @since 1.9
	 */
	public static String getDerivedUnionAdapterClassName(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getDerivedUnionAdapterClassName()
			: null;
	}

	/**
	 * @since 1.9
	 */
	public static List<GenClass> getDerivedUnionAdapterGenClasses(
			GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.getDerivedUnionAdapterGenClasses()
			: Collections.<GenClass> emptyList();
	}

	/**
	 * @since 1.9
	 */
	public static boolean hasMultiplicityRedefinitions(GenPackage genPackage) {
		return genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage)
				.hasMultiplicityRedefinitions()
			: false;
	}

	// GenClass utilities

	public static String getOperationsClassName(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getOperationsClassName()
			: null;
	}

	public static String getQualifiedOperationsClassName(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getQualifiedOperationsClassName()
			: null;
	}

	public static String getImportedOperationsClassName(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImportedOperationsClassName()
			: null;
	}

	public static String getOperationsClassExtends(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getOperationsClassExtends()
			: ""; //$NON-NLS-1$
	}

	/**
	 * @since 1.4
	 */
	public static String getImportedOperationsClassName(GenClass genClass,
			GenOperation genOperation) {
		GenClass opGenClass = genOperation.getGenClass();
		return opGenClass.isInterface()
			? getImportedOperationsClassName(genClass)
			: getImportedOperationsClassName(opGenClass);
	}

	/**
	 * @since 1.4
	 */
	public static boolean hasOperationsClass(GenClass genClass,
			GenOperation genOperation) {
		GenClass opGenClass = genOperation.getGenClass();
		return opGenClass.isInterface()
			? isOperationsClasses(genClass.getGenPackage())
			: isOperationsClasses(opGenClass.getGenPackage());
	}

	/**
	 * @since 1.4
	 */
	public static List<GenOperation> getOperationsClassGenOperations(
			GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getOperationsClassGenOperations()
			: Collections.<GenOperation> emptyList();
	}

	public static List<GenFeature> getKeyGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getKeyGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getKeyGenFeatures(GenClass genClass,
			boolean includeContains) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getKeyGenFeatures(includeContains)
			: Collections.<GenFeature> emptyList();
	}

	public static boolean isFactoryMethods(GenClass genClass,
			GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isFactoryMethods(genFeature);
	}

	public static GenFeature findGenFeature(GenClass genClass,
			EStructuralFeature ecoreFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.findGenFeature(ecoreFeature)
			: null;
	}

	public static GenOperation findGenOperation(GenClass genClass,
			EOperation ecoreOperation) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.findGenOperation(ecoreOperation)
			: null;
	}

	public static List<GenFeature> getDuplicateGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getDuplicateGenFeatures()
			: genClass.getGenFeatures();
	}

	public static List<GenOperation> getDuplicateGenOperations(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getDuplicateGenOperations()
			: genClass.getGenOperations();
	}

	public static boolean isDerivedUnionListType(GenClass genClass,
			GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isDerivedUnionListType(genFeature)
			: false;
	}

	public static List<GenFeature> getUnionGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getUnionGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getImplementedUnionGenFeatures(
			GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedUnionGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSubsetGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getImplementedSubsetGenFeatures(
			GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSubsetGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getImplementedSubsetGenFeatures(
			GenClass genClass, boolean listType) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSubsetGenFeatures(listType)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSupersetGenFeatures(GenClass genClass,
			GenFeature subsetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetGenFeatures(subsetGenFeature)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSupersetGenFeatures(GenClass genClass,
			GenFeature subsetGenFeature, boolean includeDerived,
			boolean includeListType) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetGenFeatures(subsetGenFeature, includeDerived,
					includeListType)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSupersetGenFeatures(GenClass genClass,
			GenFeature subsetGenFeature, boolean includeDerived) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetGenFeatures(subsetGenFeature, includeDerived)
			: Collections.<GenFeature> emptyList();
	}

	public static String getSupersetFeatureAccessorArray(GenClass genClass,
			GenFeature subsetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetFeatureAccessorArray(subsetGenFeature)
			: null;
	}

	public static String getSupersetFeatureIDArray(GenClass genClass,
			GenFeature subsetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetFeatureIDArray(subsetGenFeature)
			: null;
	}

	public static boolean isSuperset(GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isSuperset(genFeature);
	}

	public static List<GenFeature> getSupersetGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getImplementedSupersetGenFeatures(
			GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSupersetGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getImplementedSupersetGenFeatures(
			GenClass genClass, boolean listType) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSupersetGenFeatures(listType)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSubsetGenFeatures(GenClass genClass,
			GenFeature supersetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetGenFeatures(supersetGenFeature)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSubsetGenFeatures(GenClass genClass,
			GenFeature supersetGenFeature, boolean includeDerived) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetGenFeatures(supersetGenFeature, includeDerived)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getSubsetGenFeatures(GenClass genClass,
			GenFeature supersetGenFeature, boolean includeDerived,
			boolean includeListType) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetGenFeatures(supersetGenFeature, includeDerived,
					includeListType)
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getIsSetSubsetGenFeatures(GenClass genClass,
			GenFeature unionGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getIsSetSubsetGenFeatures(unionGenFeature)
			: Collections.<GenFeature> emptyList();
	}

	public static String getSubsetFeatureAccessorArray(GenClass genClass,
			GenFeature supersetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetFeatureAccessorArray(supersetGenFeature)
			: null;
	}

	public static String getSubsetFeatureIDArray(GenClass genClass,
			GenFeature supersetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetFeatureIDArray(supersetGenFeature)
			: null;
	}

	public static String getSubsetFeatureIDArray(GenClass genClass,
			GenFeature supersetGenFeature, boolean includeDerived) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetFeatureIDArray(supersetGenFeature, includeDerived)
			: null;
	}

	public static boolean isRedefined(GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isRedefined(genFeature);
	}

	public static List<GenFeature> getRedefinedGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinedGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getImplementedRedefinedGenFeatures(
			GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedRedefinedGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static List<GenFeature> getRedefinitionGenFeatures(
			GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinitionGenFeatures(genFeature)
			: Collections.<GenFeature> emptyList();
	}

	public static boolean isRedefined(GenClass genClass,
			GenOperation genOperation) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isRedefined(genOperation);
	}

	public static List<GenOperation> getRedefinedGenOperations(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinedGenOperations()
			: Collections.<GenOperation> emptyList();
	}

	public static List<GenOperation> getImplementedRedefinedGenOperations(
			GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedRedefinedGenOperations()
			: Collections.<GenOperation> emptyList();
	}

	public static List<GenOperation> getRedefinitionGenOperations(
			GenClass genClass, GenOperation genOperation) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinitionGenOperations(genOperation)
			: Collections.<GenOperation> emptyList();
	}

	public static GenOperation getImplementedCollidingGetGenOperation(
			GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedCollidingGetGenOperation(genFeature)
			: null;
	}

	public static GenOperation getImplementedCollidingSetGenOperation(
			GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedCollidingSetGenOperation(genFeature)
			: null;
	}

	public static GenOperation getImplementedCollidingIsSetGenOperation(
			GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedCollidingIsSetGenOperation(genFeature)
			: null;
	}

	public static GenOperation getImplementedCollidingUnsetGenOperation(
			GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedCollidingUnsetGenOperation(genFeature)
			: null;
	}

	public static boolean isFactoryMethods(GenClass genClass) {

		for (GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); classExtendsGenClass != null; classExtendsGenClass = classExtendsGenClass
			.getClassExtendsGenClass()) {

			if (isFactoryMethods(classExtendsGenClass.getGenModel())) {
				return false;
			}
		}

		return isFactoryMethods(genClass.getGenModel());
	}

	public static boolean isCacheAdapterSupport(GenClass genClass) {

		for (GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); classExtendsGenClass != null; classExtendsGenClass = classExtendsGenClass
			.getClassExtendsGenClass()) {

			if (isCacheAdapterSupport(classExtendsGenClass.getGenModel())) {
				return false;
			}
		}

		return isCacheAdapterSupport(genClass.getGenModel());
	}

	/**
	 * @since 1.3
	 */
	public static boolean hasOCLOperationBodies(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.hasOCLOperationBodies()
			: false;
	}

	/**
	 * @since 1.9
	 */
	public static List<GenFeature> getAllUnionGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getAllUnionGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	// GenFeature utilities

	public static boolean isCached(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isCached();
	}

	public static boolean isKey(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isKey();
	}

	public static boolean isUnion(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isUnion();
	}

	public static boolean isDuplicate(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isDuplicate();
	}

	public static boolean isSubset(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isSubset();
	}

	public static boolean isEffectiveContainsSubset(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isEffectiveContainsSubset();
	}

	public static List<GenFeature> getSubsettedGenFeatures(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getSubsettedGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static boolean isRedefinition(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isRedefinition();
	}

	public static List<GenFeature> getRedefinedGenFeatures(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinedGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	/**
	 * Use {@link #getRedefinedListItemType(GenClass, GenFeature)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getRedefinedListItemType(genFeature.getGenClass(), genFeature)</code>.
	 * 
	 * @see #getRedefinedListItemType(GenClass, GenFeature)
	 */
	@Deprecated
	public static String getRedefinedListItemType(GenFeature genFeature) {
		return getRedefinedListItemType(genFeature.getGenClass(), genFeature);
	}

	/**
	 * @since 1.3
	 */
	public static String getRedefinedListItemType(GenClass context,
			GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinedListItemType(context)
			: genFeature.getListItemType(context);
	}

	public static List<GenFeature> getKeyGenFeatures(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getKeyGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	public static boolean hasStringTypeKeyGenFeature(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.hasStringTypeKeyGenFeature()
			: false;
	}

	/**
	 * Use {@link #getKeyFeatureParameter(GenClass, GenFeature, int)} with
	 * either <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameter(genFeature.getGenClass(), genFeature, index)</code>.
	 * 
	 * @see #getKeyFeatureParameter(GenClass, GenFeature, int)
	 */
	@Deprecated
	public static String getKeyFeatureParameter(GenFeature genFeature, int index) {
		return getKeyFeatureParameter(genFeature.getGenClass(), genFeature,
			index);
	}

	/**
	 * @since 1.3
	 */
	public static String getKeyFeatureParameter(GenClass genClass,
			GenFeature genFeature, int index) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getKeyFeatureParameter(genClass, index)
			: ""; //$NON-NLS-1$
	}

	/**
	 * Use {@link #getKeyFeatureParameter(GenClass, GenFeature, int, boolean)}
	 * with either <code>null</code> for erasing type parameter references or
	 * a {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getRedefinedListItemType(genFeature.getGenClass(), genFeature, index, formal)</code>.
	 * 
	 * @see #getKeyFeatureParameter(GenClass, GenFeature, int, boolean)
	 */
	@Deprecated
	public static String getKeyFeatureParameter(GenFeature genFeature,
			int index, boolean formal) {
		return getKeyFeatureParameter(genFeature.getGenClass(), genFeature,
			index, formal);
	}

	/**
	 * @since 1.3
	 */
	public static String getKeyFeatureParameter(GenClass context,
			GenFeature genFeature, int index, boolean formal) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getKeyFeatureParameter(context, index, formal)
			: ""; //$NON-NLS-1$
	}

	/**
	 * Use {@link #getKeyFeatureParameters(GenClass, GenFeature)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameters(genFeature.getGenClass(), genFeature)</code>.
	 * 
	 * @see #getKeyFeatureParameters(GenClass, GenFeature)
	 */
	@Deprecated
	public static String getKeyFeatureParameters(GenFeature genFeature) {
		return getKeyFeatureParameters(genFeature.getGenClass(), genFeature);
	}

	/**
	 * @since 1.3
	 */
	public static String getKeyFeatureParameters(GenClass genClass,
			GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getKeyFeatureParameters(genClass)
			: ""; //$NON-NLS-1$		
	}

	/**
	 * Use {@link #getKeyFeatureParameters(GenClass, GenFeature, boolean)} with
	 * either <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameters(genFeature.getGenClass(), genFeature, formal)</code>.
	 * 
	 * @see #getKeyFeatureParameters(GenClass, GenFeature)
	 */
	@Deprecated
	public static String getKeyFeatureParameters(GenFeature genFeature,
			boolean formal) {
		return getKeyFeatureParameters(genFeature.getGenClass(), genFeature,
			formal);
	}

	/**
	 * @since 1.3
	 */
	public static String getKeyFeatureParameters(GenClass context,
			GenFeature genFeature, boolean formal) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getKeyFeatureParameters(context, formal)
			: ""; //$NON-NLS-1$		
	}

	public static String getFormattedKeyFeatureName(GenFeature genFeature,
			int index) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getFormattedKeyFeatureName(index)
			: ""; //$NON-NLS-1$		
	}

	public static String getFormattedKeyFeatureNames(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getFormattedKeyFeatureNames()
			: ""; //$NON-NLS-1$				
	}

	public static boolean isTest(GenFeature genFeature) {
		return genFeature.isTested();
	}

	/**
	 * @since 1.4
	 */
	public static boolean isPluralizationException(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isPluralizationException();
	}

	/**
	 * @since 1.9
	 */
	public static List<GenFeature> getAllSubsettedUnionGenFeatures(
			GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getAllSubsettedUnionGenFeatures()
			: Collections.<GenFeature> emptyList();
	}

	/**
	 * @since 1.9
	 */
	public static String getRedefinitionLowerBound(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinitionLowerBound()
			: genFeature.getLowerBound();
	}

	/**
	 * @since 1.9
	 */
	public static String getRedefinitionUpperBound(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinitionUpperBound()
			: genFeature.getUpperBound();
	}

	/**
	 * @since 1.9
	 */
	public static GenClassifier getRedefinitionTypeGenClassifier(
			GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinitionTypeGenClassifier()
			: genFeature.getTypeGenClassifier();
	}

	// GenOperation utilities

	public static boolean isCached(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.isCached();
	}

	public static boolean isResourceCacheAdapterScope(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.isResourceCacheAdapterScope();
	}

	public static GenCacheAdapterScope getCacheAdapterScope(
			GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.getCacheAdapterScope()
			: GenCacheAdapterScope.NONE_LITERAL;
	}

	public static boolean isDuplicate(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.isDuplicate();
	}

	public static boolean isRedefinition(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.isRedefinition();
	}

	public static List<GenOperation> getRedefinedGenOperations(
			GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.getRedefinedGenOperations()
			: Collections.<GenOperation> emptyList();
	}

	/**
	 * @since 1.3
	 */
	public static String getOCLBody(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.getOCLBody()
			: null;
	}

	/**
	 * @since 1.3
	 */
	public static boolean hasOCLBody(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.hasOCLBody()
			: false;
	}

}