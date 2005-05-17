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
 * $Id: UML2GenModelUtil.java,v 1.1 2005/05/17 22:06:28 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.util;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope;

/**
 * 
 */
public class UML2GenModelUtil {

	protected UML2GenModelUtil() {
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

	public static List getKeyGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getKeyGenFeatures()
			: Collections.EMPTY_LIST;
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

	public static List getDuplicateGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getDuplicateGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getDuplicateGenOperations(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getDuplicateGenOperations()
			: Collections.EMPTY_LIST;
	}

	public static List getUnionGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getUnionGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedUnionGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedUnionGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getSubsetGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedSubsetGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSubsetGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedSubsetGenFeatures(GenClass genClass,
			boolean listType) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSubsetGenFeatures(listType)
			: Collections.EMPTY_LIST;
	}

	public static List getSupersetGenFeatures(GenClass genClass,
			GenFeature subsetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetGenFeatures(subsetGenFeature)
			: Collections.EMPTY_LIST;
	}

	public static String getSupersetFeatureAccessorArray(GenClass genClass,
			GenFeature subsetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetFeatureAccessorArray(subsetGenFeature)
			: null;
	}

	public static boolean isSuperset(GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isSuperset(genFeature);
	}

	public static List getSupersetGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSupersetGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedSupersetGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSupersetGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedSupersetGenFeatures(GenClass genClass,
			boolean listType) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedSupersetGenFeatures(listType)
			: Collections.EMPTY_LIST;
	}

	public static List getSubsetGenFeatures(GenClass genClass,
			GenFeature supersetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetGenFeatures(supersetGenFeature)
			: Collections.EMPTY_LIST;
	}

	public static String getSubsetFeatureAccessorArray(GenClass genClass,
			GenFeature supersetGenFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getSubsetFeatureAccessorArray(supersetGenFeature)
			: null;
	}

	public static boolean isRedefined(GenClass genClass, GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isRedefined(genFeature);
	}

	public static List getRedefinedGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinedGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedRedefinedGenFeatures(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedRedefinedGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static List getRedefinitionGenFeatures(GenClass genClass,
			GenFeature genFeature) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinitionGenFeatures(genFeature)
			: Collections.EMPTY_LIST;
	}

	public static boolean isRedefined(GenClass genClass,
			GenOperation genOperation) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.isRedefined(genOperation);
	}

	public static List getRedefinedGenOperations(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinedGenOperations()
			: Collections.EMPTY_LIST;
	}

	public static List getImplementedRedefinedGenOperations(GenClass genClass) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getImplementedRedefinedGenOperations()
			: Collections.EMPTY_LIST;
	}

	public static List getRedefinitionGenOperations(GenClass genClass,
			GenOperation genOperation) {
		return genClass instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenClass
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenClass) genClass)
				.getRedefinitionGenOperations(genOperation)
			: Collections.EMPTY_LIST;
	}

	// GenFeature utilities

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

	public static List getSubsettedGenFeatures(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getSubsettedGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static boolean isRedefinition(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			&& ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.isRedefinition();
	}

	public static List getRedefinedGenFeatures(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinedGenFeatures()
			: Collections.EMPTY_LIST;
	}

	public static String getRedefinedListItemType(GenFeature genFeature) {
		return genFeature instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenFeature) genFeature)
				.getRedefinedListItemType()
			: null;
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
			: null;
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

	public static List getRedefinedGenOperations(GenOperation genOperation) {
		return genOperation instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
			? ((org.eclipse.uml2.codegen.ecore.genmodel.GenOperation) genOperation)
				.getRedefinedGenOperations()
			: Collections.EMPTY_LIST;
	}

}