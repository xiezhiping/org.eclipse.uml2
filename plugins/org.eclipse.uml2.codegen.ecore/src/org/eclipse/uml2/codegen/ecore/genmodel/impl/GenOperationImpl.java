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
 * $Id: GenOperationImpl.java,v 1.4 2005/06/03 19:53:35 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.codegen.ecore.Generator;
import org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenOperation;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenOperationImpl#getCacheAdapterScope <em>Cache Adapter Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenOperationImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenOperationImpl
		implements GenOperation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getCacheAdapterScope() <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAdapterScope()
	 * @generated
	 * @ordered
	 */
	protected static final GenCacheAdapterScope CACHE_ADAPTER_SCOPE_EDEFAULT = GenCacheAdapterScope.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getCacheAdapterScope() <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAdapterScope()
	 * @generated
	 * @ordered
	 */
	protected GenCacheAdapterScope cacheAdapterScope = CACHE_ADAPTER_SCOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCacheAdapterScope getCacheAdapterScope() {
		return cacheAdapterScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheAdapterScope(GenCacheAdapterScope newCacheAdapterScope) {
		GenCacheAdapterScope oldCacheAdapterScope = cacheAdapterScope;
		cacheAdapterScope = newCacheAdapterScope == null
			? CACHE_ADAPTER_SCOPE_EDEFAULT
			: newCacheAdapterScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE,
				oldCacheAdapterScope, cacheAdapterScope));
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
				case GenModelPackage.GEN_OPERATION__GEN_CLASS :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						GenModelPackage.GEN_OPERATION__GEN_CLASS, msgs);
				case GenModelPackage.GEN_OPERATION__GEN_PARAMETERS :
					return ((InternalEList) getGenParameters()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
				case GenModelPackage.GEN_OPERATION__GEN_CLASS :
					return eBasicSetContainer(null,
						GenModelPackage.GEN_OPERATION__GEN_CLASS, msgs);
				case GenModelPackage.GEN_OPERATION__GEN_PARAMETERS :
					return ((InternalEList) getGenParameters()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case GenModelPackage.GEN_OPERATION__GEN_CLASS :
					return eContainer
						.eInverseRemove(
							this,
							org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__GEN_OPERATIONS,
							GenClass.class, msgs);
				default :
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
			case GenModelPackage.GEN_OPERATION__GEN_CLASS :
				return getGenClass();
			case GenModelPackage.GEN_OPERATION__ECORE_OPERATION :
				if (resolve)
					return getEcoreOperation();
				return basicGetEcoreOperation();
			case GenModelPackage.GEN_OPERATION__GEN_PARAMETERS :
				return getGenParameters();
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				return getCacheAdapterScope();
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
			case GenModelPackage.GEN_OPERATION__GEN_CLASS :
				setGenClass((GenClass) newValue);
				return;
			case GenModelPackage.GEN_OPERATION__ECORE_OPERATION :
				setEcoreOperation((EOperation) newValue);
				return;
			case GenModelPackage.GEN_OPERATION__GEN_PARAMETERS :
				getGenParameters().clear();
				getGenParameters().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				setCacheAdapterScope((GenCacheAdapterScope) newValue);
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
			case GenModelPackage.GEN_OPERATION__GEN_CLASS :
				setGenClass((GenClass) null);
				return;
			case GenModelPackage.GEN_OPERATION__ECORE_OPERATION :
				setEcoreOperation((EOperation) null);
				return;
			case GenModelPackage.GEN_OPERATION__GEN_PARAMETERS :
				getGenParameters().clear();
				return;
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				setCacheAdapterScope(CACHE_ADAPTER_SCOPE_EDEFAULT);
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
			case GenModelPackage.GEN_OPERATION__GEN_CLASS :
				return getGenClass() != null;
			case GenModelPackage.GEN_OPERATION__ECORE_OPERATION :
				return ecoreOperation != null;
			case GenModelPackage.GEN_OPERATION__GEN_PARAMETERS :
				return genParameters != null && !genParameters.isEmpty();
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				return cacheAdapterScope != CACHE_ADAPTER_SCOPE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cacheAdapterScope: "); //$NON-NLS-1$
		result.append(cacheAdapterScope);
		result.append(')');
		return result.toString();
	}

	private org.eclipse.emf.codegen.ecore.genmodel.GenModel genModel = null;

	protected void setGenModel(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel genModel) {
		this.genModel = genModel;
	}

	public GenClass getGenClass() {
		return isDuplicate()
			? findGenClass(Generator
				.getEcoreContainingClass(getEcoreOperation()))
			: super.getGenClass();
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenModel getGenModel() {
		return isDuplicate()
			? genModel
			: super.getGenModel();
	}

	protected String format(String name, String separator, String prefix,
			boolean includePrefix) {
		List parsedName = new ArrayList();

		if (prefix != null) {

			if (name.startsWith(prefix)) {
				name = name.substring(prefix.length());
			}

			if (includePrefix) {
				parsedName = CodeGenUtil.parseName(prefix, '_');
			}
		}

		if (name.length() != 0)
			parsedName.addAll(CodeGenUtil.parseName(name, '_'));

		StringBuffer result = new StringBuffer();

		for (Iterator i = parsedName.iterator(); i.hasNext();) {
			String nameComponent = (String) i.next();
			result.append(result.length() == 0
				? nameComponent
				: capName(nameComponent));

			if (i.hasNext() && nameComponent.length() > 1) {
				result.append(separator);
			}
		}

		return result.length() == 0 && prefix != null
			? prefix
			: result.toString();
	}

	public String getName() {

		if (isInvariant()) {
			String prefix = UML2GenModelUtil.getInvariantPrefix(getGenModel());

			if (!isBlank(prefix)) {
				return format(super.getName(), "", prefix, true); //$NON-NLS-1$
			}
		}

		return super.getName();
	}

	protected org.eclipse.emf.codegen.ecore.genmodel.GenOperation findGenOperation(
			EOperation ecoreOperation) {

		return UML2GenModelUtil.findGenOperation(getGenClass(), ecoreOperation);
	}

	public boolean isCached() {
		return GenCacheAdapterScope.NONE_LITERAL != getCacheAdapterScope();
	}

	public boolean isResourceCacheAdapterScope() {
		return GenCacheAdapterScope.RESOURCE_LITERAL == getCacheAdapterScope();
	}

	public boolean isDuplicate() {
		return Generator.isDuplicate(getEcoreOperation());
	}

	public boolean isRedefinition() {
		return Generator.isRedefinition(getEcoreOperation());
	}

	public List getRedefinedGenOperations() {
		List redefinedGenOperations = new ArrayList();

		for (Iterator redefinedEcoreOperations = Generator
			.getRedefinedEcoreOperations(getEcoreOperation()).iterator(); redefinedEcoreOperations
			.hasNext();) {

			redefinedGenOperations
				.add(findGenOperation((EOperation) redefinedEcoreOperations
					.next()));
		}

		return redefinedGenOperations;
	}

	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenOperation oldGenOperationVersion) {
		super.reconcileSettings(oldGenOperationVersion);

		setCacheAdapterScope(UML2GenModelUtil
			.getCacheAdapterScope(oldGenOperationVersion));
	}

} // GenOperationImpl
