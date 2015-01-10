/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 208016
 *   Kenn Hussey (CEA) - 394623, 212765, 451350
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isPluralizationException <em>Pluralization Exception</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenFeature()
 * @model
 * @generated
 */
public interface GenFeature
		extends org.eclipse.emf.codegen.ecore.genmodel.GenFeature,
		GenTypedElement {

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenFeature_Key()
	 * @model
	 * @generated
	 */
	boolean isKey();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Pluralization Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluralization Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluralization Exception</em>' attribute.
	 * @see #setPluralizationException(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenFeature_PluralizationException()
	 * @model
	 * @generated
	 */
	boolean isPluralizationException();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isPluralizationException <em>Pluralization Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralization Exception</em>' attribute.
	 * @see #isPluralizationException()
	 * @generated
	 */
	void setPluralizationException(boolean value);

	boolean isCached();

	boolean isDuplicate();

	boolean isUnion();

	boolean isSubset();

	boolean isEffectiveContainsSubset();

	boolean isFactoryMethods();

	List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getSubsettedGenFeatures();

	boolean isRedefinition();

	List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getRedefinedGenFeatures();

	/**
	 * @since 1.3
	 */
	String getRedefinedListItemType(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass context);

	/**
	 * Use {@link #getRedefinedListItemType(GenClass)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getRedefinedListItemType(getGenClass())</code>.
	 * 
	 * @see #getRedefinedListItemType(GenClass)
	 */
	@Deprecated
	String getRedefinedListItemType();

	List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getKeyGenFeatures();

	boolean hasStringTypeKeyGenFeature();

	/**
	 * @since 1.3
	 */
	String getKeyFeatureParameter(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass context, int index);

	/**
	 * Use {@link #getKeyFeatureParameter(GenClass, int)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameter(getGenClass(), index)</code>.
	 * 
	 * @see #getKeyFeatureParameter(GenClass, int)
	 */
	@Deprecated
	String getKeyFeatureParameter(int index);

	/**
	 * @since 1.3
	 */
	String getKeyFeatureParameter(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass context, int index,
			boolean formal);

	/**
	 * Use {@link #getKeyFeatureParameter(GenClass, int, boolean)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameter(getGenClass(), index, formal)</code>.
	 * 
	 * @see #getKeyFeatureParameter(GenClass, boolean)
	 */
	@Deprecated
	String getKeyFeatureParameter(int index, boolean formal);

	/**
	 * @since 1.3
	 */
	String getKeyFeatureParameters(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass context);

	/**
	 * Use {@link #getKeyFeatureParameters(GenClass)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameters(getGenClass())</code>.
	 * 
	 * @see #getKeyFeatureParameters(GenClass)
	 */
	@Deprecated
	String getKeyFeatureParameters();

	/**
	 * @since 1.3
	 */
	String getKeyFeatureParameters(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass context,
			boolean formal);

	/**
	 * Use {@link #getKeyFeatureParameters(GenClass, boolean)} with either
	 * <code>null</code> for erasing type parameter references or a
	 * {@link GenClass} context representing potential type substitutions for
	 * type parameter references. By default, this will just do
	 * <code>getKeyFeatureParameter(getGenClass(), formal)</code>.
	 * 
	 * @see #getKeyFeatureParameters(GenClass, boolean)
	 */
	@Deprecated
	String getKeyFeatureParameters(boolean formal);

	String getFormattedKeyFeatureName(int index);

	String getFormattedKeyFeatureNames();

	/**
	 * @since 1.9
	 */
	List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getAllSubsettedUnionGenFeatures();

	/**
	 * @since 1.9
	 */
	String getRedefinitionLowerBound();

	/**
	 * @since 1.9
	 */
	String getRedefinitionUpperBound();

	/**
	 * @since 1.9
	 */
	GenClassifier getRedefinitionTypeGenClassifier();

} // GenFeature