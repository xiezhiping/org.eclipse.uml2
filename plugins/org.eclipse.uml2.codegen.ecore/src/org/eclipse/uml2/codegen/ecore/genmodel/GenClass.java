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
 * $Id: GenClass.java,v 1.1 2005/05/17 22:06:28 khussey Exp $
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
public interface GenClass extends
		org.eclipse.emf.codegen.ecore.genmodel.GenClass, GenClassifier {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	String getOperationsClassName();

	String getImportedOperationsClassName();

	String getQualifiedOperationsClassName();

	List/* GenFeature */getKeyGenFeatures();

	GenFeature findGenFeature(EStructuralFeature ecoreFeature);

	GenOperation findGenOperation(EOperation ecoreOperation);

	List/* GenFeature */getDuplicateGenFeatures();

	List/* GenOperation */getDuplicateGenOperations();

	List/* GenFeature */getUnionGenFeatures();

	List/* GenFeature */getImplementedUnionGenFeatures();

	List/* GenFeature */getSubsetGenFeatures();

	List/* GenFeature */getImplementedSubsetGenFeatures();

	List/* GenFeature */getImplementedSubsetGenFeatures(boolean listType);

	List/* GenFeature */getSupersetGenFeatures(GenFeature subsetGenFeature);

	String getSupersetFeatureAccessorArray(GenFeature subsetGenFeature);

	boolean isSuperset(GenFeature genFeature);

	List/* GenFeature */getSupersetGenFeatures();

	List/* GenFeature */getImplementedSupersetGenFeatures();

	List/* GenFeature */getImplementedSupersetGenFeatures(boolean listType);

	List/* GenFeature */getSubsetGenFeatures(GenFeature supersetGenFeature);

	String getSubsetFeatureAccessorArray(GenFeature supersetGenFeature);

	boolean isRedefined(GenFeature genFeature);

	List/* GenFeature */getRedefinedGenFeatures();

	List/* GenFeature */getImplementedRedefinedGenFeatures();

	List/* GenFeature */getRedefinitionGenFeatures(GenFeature redefinedGenFeature);

	boolean isRedefined(GenOperation genOperation);

	List/* GenOperation */getRedefinedGenOperations();

	List/* GenOperation */getImplementedRedefinedGenOperations();

	List/* GenFeature */getRedefinitionGenOperations(GenOperation redefinedGenOperation);

} // GenClass
