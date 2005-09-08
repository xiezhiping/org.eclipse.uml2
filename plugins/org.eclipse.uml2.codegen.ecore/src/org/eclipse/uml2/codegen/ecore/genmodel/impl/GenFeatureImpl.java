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
 * $Id: GenFeatureImpl.java,v 1.5 2005/09/08 20:20:46 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPropertyKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.codegen.ecore.Generator;
import org.eclipse.uml2.codegen.ecore.genmodel.GenFeature;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenFeatureImpl#isKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFeatureImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenFeatureImpl
		implements GenFeature {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKey() {
		return (eFlags & KEY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(boolean newKey) {
		boolean oldKey = (eFlags & KEY_EFLAG) != 0;
		if (newKey)
			eFlags |= KEY_EFLAG;
		else
			eFlags &= ~KEY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_FEATURE__KEY, oldKey, newKey));
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
				case GenModelPackage.GEN_FEATURE__GEN_CLASS :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						GenModelPackage.GEN_FEATURE__GEN_CLASS, msgs);
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
				case GenModelPackage.GEN_FEATURE__GEN_CLASS :
					return eBasicSetContainer(null,
						GenModelPackage.GEN_FEATURE__GEN_CLASS, msgs);
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
				case GenModelPackage.GEN_FEATURE__GEN_CLASS :
					return eContainer
						.eInverseRemove(
							this,
							org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__GEN_FEATURES,
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
			case GenModelPackage.GEN_FEATURE__PROPERTY :
				return getProperty();
			case GenModelPackage.GEN_FEATURE__NOTIFY :
				return isNotify()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_FEATURE__CHILDREN :
				return isChildren()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_FEATURE__CREATE_CHILD :
				return isCreateChild()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_FEATURE__PROPERTY_CATEGORY :
				return getPropertyCategory();
			case GenModelPackage.GEN_FEATURE__PROPERTY_FILTER_FLAGS :
				return getPropertyFilterFlags();
			case GenModelPackage.GEN_FEATURE__PROPERTY_DESCRIPTION :
				return getPropertyDescription();
			case GenModelPackage.GEN_FEATURE__GEN_CLASS :
				return getGenClass();
			case GenModelPackage.GEN_FEATURE__ECORE_FEATURE :
				if (resolve)
					return getEcoreFeature();
				return basicGetEcoreFeature();
			case GenModelPackage.GEN_FEATURE__KEY :
				return isKey()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case GenModelPackage.GEN_FEATURE__PROPERTY :
				setProperty((GenPropertyKind) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__NOTIFY :
				setNotify(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_FEATURE__CHILDREN :
				setChildren(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_FEATURE__CREATE_CHILD :
				setCreateChild(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_FEATURE__PROPERTY_CATEGORY :
				setPropertyCategory((String) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__PROPERTY_FILTER_FLAGS :
				getPropertyFilterFlags().clear();
				getPropertyFilterFlags().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__PROPERTY_DESCRIPTION :
				setPropertyDescription((String) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__GEN_CLASS :
				setGenClass((GenClass) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__ECORE_FEATURE :
				setEcoreFeature((EStructuralFeature) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__KEY :
				setKey(((Boolean) newValue).booleanValue());
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
			case GenModelPackage.GEN_FEATURE__PROPERTY :
				setProperty(PROPERTY_EDEFAULT);
				return;
			case GenModelPackage.GEN_FEATURE__NOTIFY :
				setNotify(NOTIFY_EDEFAULT);
				return;
			case GenModelPackage.GEN_FEATURE__CHILDREN :
				setChildren(CHILDREN_EDEFAULT);
				return;
			case GenModelPackage.GEN_FEATURE__CREATE_CHILD :
				unsetCreateChild();
				return;
			case GenModelPackage.GEN_FEATURE__PROPERTY_CATEGORY :
				setPropertyCategory(PROPERTY_CATEGORY_EDEFAULT);
				return;
			case GenModelPackage.GEN_FEATURE__PROPERTY_FILTER_FLAGS :
				getPropertyFilterFlags().clear();
				return;
			case GenModelPackage.GEN_FEATURE__PROPERTY_DESCRIPTION :
				setPropertyDescription(PROPERTY_DESCRIPTION_EDEFAULT);
				return;
			case GenModelPackage.GEN_FEATURE__GEN_CLASS :
				setGenClass((GenClass) null);
				return;
			case GenModelPackage.GEN_FEATURE__ECORE_FEATURE :
				setEcoreFeature((EStructuralFeature) null);
				return;
			case GenModelPackage.GEN_FEATURE__KEY :
				setKey(KEY_EDEFAULT);
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
			case GenModelPackage.GEN_FEATURE__PROPERTY :
				return property != PROPERTY_EDEFAULT;
			case GenModelPackage.GEN_FEATURE__NOTIFY :
				return notify != NOTIFY_EDEFAULT;
			case GenModelPackage.GEN_FEATURE__CHILDREN :
				return children != CHILDREN_EDEFAULT;
			case GenModelPackage.GEN_FEATURE__CREATE_CHILD :
				return isSetCreateChild();
			case GenModelPackage.GEN_FEATURE__PROPERTY_CATEGORY :
				return PROPERTY_CATEGORY_EDEFAULT == null
					? propertyCategory != null
					: !PROPERTY_CATEGORY_EDEFAULT.equals(propertyCategory);
			case GenModelPackage.GEN_FEATURE__PROPERTY_FILTER_FLAGS :
				return propertyFilterFlags != null
					&& !propertyFilterFlags.isEmpty();
			case GenModelPackage.GEN_FEATURE__PROPERTY_DESCRIPTION :
				return PROPERTY_DESCRIPTION_EDEFAULT == null
					? propertyDescription != null
					: !PROPERTY_DESCRIPTION_EDEFAULT
						.equals(propertyDescription);
			case GenModelPackage.GEN_FEATURE__GEN_CLASS :
				return getGenClass() != null;
			case GenModelPackage.GEN_FEATURE__ECORE_FEATURE :
				return ecoreFeature != null;
			case GenModelPackage.GEN_FEATURE__KEY :
				return ((eFlags & KEY_EFLAG) != 0) != KEY_EDEFAULT;
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
		result.append(" (key: "); //$NON-NLS-1$
		result.append((eFlags & KEY_EFLAG) != 0);
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
			? findGenClass(Generator.getEcoreContainingClass(getEcoreFeature()))
			: super.getGenClass();
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenModel getGenModel() {
		return isDuplicate()
			? genModel
			: super.getGenModel();
	}

	protected org.eclipse.emf.codegen.ecore.genmodel.GenFeature findGenFeature(
			EStructuralFeature ecoreFeature) {

		return UML2GenModelUtil.findGenFeature(getGenClass(), ecoreFeature);
	}

	public String getAccessorName() {
		return isMapEntryFeature()
			? "Typed" + getCapName() //$NON-NLS-1$
			: (isListType()
				&& UML2GenModelUtil.isPluralizedGetters(getGenModel())
				? Generator.pluralize(getCapName())
				: ("Class".equals(getCapName()) //$NON-NLS-1$
					? "Class_" //$NON-NLS-1$
					: getCapName()));
	}

	public String getGetAccessor() {
		String result = isBooleanType()
			? "is" + getIsName() //$NON-NLS-1$
			: "get" + getAccessorName(); //$NON-NLS-1$

		if (!isMapEntryFeature()) {

			GenClass rootImplementsInterface = getGenModel()
				.getRootImplementsInterfaceGenClass();

			if (rootImplementsInterface != null
				&& !rootImplementsInterface.isEObject()) {

				for (Iterator i = rootImplementsInterface.getAllGenOperations()
					.iterator(); i.hasNext();) {

					GenOperation genOperation = (GenOperation) i.next();

					if (genOperation.getName().equals(result)
						&& genOperation.getGenParameters().isEmpty()
						&& !genOperation.getType().equals(getType())) {

						result = result + "_"; //$NON-NLS-1$
						break;
					}
				}
			}
		}

		return result;
	}

	public boolean isDuplicate() {
		return Generator.isDuplicate(getEcoreFeature());
	}

	public boolean isUnion() {
		return Generator.isUnion(getEcoreFeature());
	}

	public boolean isSubset() {
		return !isDerived() && Generator.isSubset(getEcoreFeature());
	}

	public List getSubsettedGenFeatures() {
		List subsettedGenFeatures = new ArrayList();

		for (Iterator subsettedEcoreFeatures = Generator
			.getSubsettedEcoreFeatures(getEcoreFeature()).iterator(); subsettedEcoreFeatures
			.hasNext();) {

			subsettedGenFeatures
				.add(findGenFeature((EStructuralFeature) subsettedEcoreFeatures
					.next()));
		}

		return subsettedGenFeatures;
	}

	public boolean isRedefinition() {
		return Generator.isRedefinition(getEcoreFeature());
	}

	public List getRedefinedGenFeatures() {
		List redefinedGenFeatures = new ArrayList();

		for (Iterator redefinedEcoreFeatures = Generator
			.getRedefinedEcoreFeatures(getEcoreFeature()).iterator(); redefinedEcoreFeatures
			.hasNext();) {

			redefinedGenFeatures
				.add(findGenFeature((EStructuralFeature) redefinedEcoreFeatures
					.next()));
		}

		return redefinedGenFeatures;
	}

	public String getRedefinedListItemType() {

		for (Iterator redefinedGenFeatures = getRedefinedGenFeatures()
			.iterator(); redefinedGenFeatures.hasNext();) {

			GenFeature redefinedGenFeature = (GenFeature) redefinedGenFeatures
				.next();

			if (getName().equals(redefinedGenFeature.getName())) {
				return redefinedGenFeature.getRedefinedListItemType();
			}
		}

		return super.getListItemType();
	}

	public String getFeatureAccessorName() {

		if (isDuplicate()) {

			for (Iterator redefinedGenFeatures = getRedefinedGenFeatures()
				.iterator(); redefinedGenFeatures.hasNext();) {

				GenFeature redefinedGenFeature = (GenFeature) redefinedGenFeatures
					.next();

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getFeatureAccessorName();
				}
			}
		}

		return super.getFeatureAccessorName();
	}

	public String getQualifiedFeatureAccessorName() {

		if (isDuplicate()) {

			for (Iterator redefinedGenFeatures = getRedefinedGenFeatures()
				.iterator(); redefinedGenFeatures.hasNext();) {

				GenFeature redefinedGenFeature = (GenFeature) redefinedGenFeatures
					.next();

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature
						.getQualifiedFeatureAccessorName();
				}
			}
		}

		return super.getQualifiedFeatureAccessorName();
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenFeature getReverse() {
		EReference reverseEcoreFeature = ((EReference) getEcoreFeature())
			.getEOpposite();

		return null != reverseEcoreFeature
			&& Generator.isDuplicate(reverseEcoreFeature)
			? findGenFeature(reverseEcoreFeature)
			: super.getReverse();
	}

	public boolean hasDelegateFeature() {

		if (isDuplicate()) {
			EStructuralFeature ecoreFeature = getEcoreFeature();
			EClass ecoreClass = Generator.getEcoreContainingClass(ecoreFeature);
			EStructuralFeature mixedFeature = getExtendedMetaData()
				.getMixedFeature(ecoreClass);
			return (mixedFeature != null && mixedFeature != ecoreFeature)
				|| getExtendedMetaData().getGroup(ecoreFeature) != null;
		}

		return super.hasDelegateFeature();
	}

	public boolean isVolatile() {
		return isDuplicate()
			? getEcoreFeature().isVolatile()
			: super.isVolatile();
	}

	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenFeature oldGenFeatureVersion) {
		super.reconcileSettings(oldGenFeatureVersion);

		setKey(UML2GenModelUtil.isKey(oldGenFeatureVersion));
	}

} // GenFeatureImpl
