/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GenFeature.java,v 1.6 2006/12/14 15:45:13 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isKey <em>Key</em>}</li>
 * </ul>
 * </p>
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

	boolean isCached();

	boolean isDuplicate();

	boolean isUnion();

	boolean isSubset();

	boolean isEffectiveContainsSubset();

	boolean isFactoryMethods();

	List/* GenFeature */getSubsettedGenFeatures();

	boolean isRedefinition();

	List/* GenFeature */getRedefinedGenFeatures();

	String getRedefinedListItemType();

	List/* GenFeature */getKeyGenFeatures();

	boolean hasStringTypeKeyGenFeature();

	String getKeyFeatureParameter(int index);

	String getKeyFeatureParameter(int index, boolean formal);

	String getKeyFeatureParameters();

	String getKeyFeatureParameters(boolean formal);

	String getFormattedKeyFeatureName(int index);

	String getFormattedKeyFeatureNames();

} // GenFeature