/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GenClass.java,v 1.17 2007/05/08 19:24:02 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenClass()
 * @model
 * @generated
 */
public interface GenClass
		extends org.eclipse.emf.codegen.ecore.genmodel.GenClass, GenClassifier {

	String getOperationsClassName();

	String getImportedOperationsClassName();

	String getQualifiedOperationsClassName();

	String getOperationsClassExtends();

	List<GenFeature> getKeyGenFeatures();

	List<GenFeature> getKeyGenFeatures(boolean includeContains);

	boolean isFactoryMethods(GenFeature genFeature);

	GenFeature findGenFeature(EStructuralFeature ecoreFeature);

	GenOperation findGenOperation(EOperation ecoreOperation);

	List<GenFeature> getDuplicateGenFeatures();

	List<GenOperation> getDuplicateGenOperations();

	boolean isDerivedUnionListType(GenFeature genFeature);

	List<GenFeature> getUnionGenFeatures();

	List<GenFeature> getImplementedUnionGenFeatures();

	List<GenFeature> getSubsetGenFeatures();

	List<GenFeature> getImplementedSubsetGenFeatures();

	List<GenFeature> getImplementedSubsetGenFeatures(boolean listType);

	List<GenFeature> getSupersetGenFeatures(GenFeature subsetGenFeature);

	List<GenFeature> getSupersetGenFeatures(GenFeature subsetGenFeature,
			boolean includeDerived);

	List<GenFeature> getSupersetGenFeatures(GenFeature subsetGenFeature,
			boolean includeDerived, boolean includeListType);

	String getSupersetFeatureAccessorArray(GenFeature subsetGenFeature);

	String getSupersetFeatureIDArray(GenFeature subsetGenFeature);

	boolean isSuperset(GenFeature genFeature);

	List<GenFeature> getSupersetGenFeatures();

	List<GenFeature> getImplementedSupersetGenFeatures();

	List<GenFeature> getImplementedSupersetGenFeatures(boolean listType);

	List<GenFeature> getSubsetGenFeatures(GenFeature supersetGenFeature);

	List<GenFeature> getSubsetGenFeatures(GenFeature supersetGenFeature,
			boolean includeDerived);

	List<GenFeature> getSubsetGenFeatures(GenFeature supersetGenFeature,
			boolean includeDerived, boolean includeListType);

	List<GenFeature> getIsSetSubsetGenFeatures(GenFeature unionGenFeature);

	String getSubsetFeatureAccessorArray(GenFeature supersetGenFeature);

	String getSubsetFeatureIDArray(GenFeature supersetGenFeature);

	String getSubsetFeatureIDArray(GenFeature supersetGenFeature,
			boolean includeDerived);

	boolean isRedefined(GenFeature genFeature);

	List<GenFeature> getRedefinedGenFeatures();

	List<GenFeature> getImplementedRedefinedGenFeatures();

	List<GenFeature> getRedefinitionGenFeatures(GenFeature redefinedGenFeature);

	boolean isRedefined(GenOperation genOperation);

	List<GenOperation> getRedefinedGenOperations();

	List<GenOperation> getImplementedRedefinedGenOperations();

	List<GenOperation> getRedefinitionGenOperations(
			GenOperation redefinedGenOperation);

	GenOperation getImplementedCollidingGetGenOperation(GenFeature genFeature);

	GenOperation getImplementedCollidingSetGenOperation(GenFeature genFeature);

	GenOperation getImplementedCollidingIsSetGenOperation(GenFeature genFeature);

	GenOperation getImplementedCollidingUnsetGenOperation(GenFeature genFeature);

	/**
	 * @since 2.1
	 */
	boolean hasOCLOperationBodies();

} // GenClass
