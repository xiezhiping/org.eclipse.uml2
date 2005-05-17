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
 * $Id: GenModel.java,v 1.1 2005/05/17 22:06:28 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import org.eclipse.emf.codegen.jet.JETEmitter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GenModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isFactoryMethods <em>Factory Methods</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isPluralizedGetters <em>Pluralized Getters</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isCacheAdapterSupport <em>Cache Adapter Support</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isSafeStrings <em>Safe Strings</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#getInvariantPrefix <em>Invariant Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenModel()
 * @model
 * @generated
 */
public interface GenModel extends
		org.eclipse.emf.codegen.ecore.genmodel.GenModel, GenBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Factory Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Methods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Methods</em>' attribute.
	 * @see #setFactoryMethods(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenModel_FactoryMethods()
	 * @model
	 * @generated
	 */
	boolean isFactoryMethods();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isFactoryMethods <em>Factory Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Methods</em>' attribute.
	 * @see #isFactoryMethods()
	 * @generated
	 */
	void setFactoryMethods(boolean value);

	/**
	 * Returns the value of the '<em><b>Pluralized Getters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluralized Getters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluralized Getters</em>' attribute.
	 * @see #setPluralizedGetters(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenModel_PluralizedGetters()
	 * @model
	 * @generated
	 */
	boolean isPluralizedGetters();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isPluralizedGetters <em>Pluralized Getters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralized Getters</em>' attribute.
	 * @see #isPluralizedGetters()
	 * @generated
	 */
	void setPluralizedGetters(boolean value);

	/**
	 * Returns the value of the '<em><b>Cache Adapter Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Adapter Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Adapter Support</em>' attribute.
	 * @see #setCacheAdapterSupport(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenModel_CacheAdapterSupport()
	 * @model
	 * @generated
	 */
	boolean isCacheAdapterSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isCacheAdapterSupport <em>Cache Adapter Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Adapter Support</em>' attribute.
	 * @see #isCacheAdapterSupport()
	 * @generated
	 */
	void setCacheAdapterSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Safe Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe Strings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe Strings</em>' attribute.
	 * @see #setSafeStrings(boolean)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenModel_SafeStrings()
	 * @model
	 * @generated
	 */
	boolean isSafeStrings();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isSafeStrings <em>Safe Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe Strings</em>' attribute.
	 * @see #isSafeStrings()
	 * @generated
	 */
	void setSafeStrings(boolean value);

	/**
	 * Returns the value of the '<em><b>Invariant Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant Prefix</em>' attribute.
	 * @see #setInvariantPrefix(String)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenModel_InvariantPrefix()
	 * @model
	 * @generated
	 */
	String getInvariantPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#getInvariantPrefix <em>Invariant Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Prefix</em>' attribute.
	 * @see #getInvariantPrefix()
	 * @generated
	 */
	void setInvariantPrefix(String value);

	JETEmitter getResourceInterfaceEmitter();

	JETEmitter getOperationsClassEmitter();

} // GenModel
