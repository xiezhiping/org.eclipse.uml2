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
 * $Id: GenFeatureImpl.java,v 1.18 2006/10/10 20:40:40 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
		return GenModelPackage.Literals.GEN_FEATURE;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenModelPackage.GEN_FEATURE__KEY :
				return isKey()
					? Boolean.TRUE
					: Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenModelPackage.GEN_FEATURE__KEY :
				setKey(((Boolean) newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenModelPackage.GEN_FEATURE__KEY :
				setKey(KEY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenModelPackage.GEN_FEATURE__KEY :
				return ((eFlags & KEY_EFLAG) != 0) != KEY_EDEFAULT;
		}
		return super.eIsSet(featureID);
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

	public String getSafeName() {
		return isListType()
			&& UML2GenModelUtil.isPluralizedGetters(getGenModel())
			? safeName(Generator.pluralize(uncapPrefixedName(getName())))
			: super.getSafeName();
	}

	public String getGetAccessor() {
		String result = isBooleanType()
			? "is" + getIsName() //$NON-NLS-1$
			: "get" + getAccessorName(); //$NON-NLS-1$

		if (isListType() && !isFeatureMapType() && !isMapType()
			&& getGenModel().isArrayAccessors()) {

			result += "List"; //$NON-NLS-1$
		}

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

	public boolean isCached() {
		return isListType() && isDerived();
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

	public boolean isEffectiveContainsSubset() {

		for (Iterator subsettedEcoreFeatures = Generator
			.getSubsettedEcoreFeatures(getEcoreFeature()).iterator(); subsettedEcoreFeatures
			.hasNext();) {

			EStructuralFeature.Internal subsettedEcoreFeature = (EStructuralFeature.Internal) subsettedEcoreFeatures
				.next();

			if (subsettedEcoreFeature.isContainment()
				&& !subsettedEcoreFeature.isDerived()) {

				return true;
			}
		}

		return false;
	}

	public boolean isFactoryMethods() {
		return UML2GenModelUtil.isFactoryMethods(getGenModel())
			&& isChangeable()
			&& (isEffectiveContains() || isEffectiveContainsSubset());
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

	public List getKeyGenFeatures() {
		List keyGenFeatures = new ArrayList();

		for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(getTypeGenClass())
			.iterator(); k.hasNext();) {

			GenFeature keyGenFeature = (GenFeature) k.next();

			if (keyGenFeature.isContains()) {
				keyGenFeatures.addAll(UML2GenModelUtil.getKeyGenFeatures(
					keyGenFeature.getTypeGenClass(), false));
			} else {
				keyGenFeatures.add(keyGenFeature);
			}
		}

		return keyGenFeatures;
	}

	public boolean hasStringTypeKeyGenFeature() {

		for (Iterator k = getKeyGenFeatures().iterator(); k.hasNext();) {

			if (((GenFeature) k.next()).isStringType()) {
				return true;
			}
		}

		return false;
	}

	public String getKeyFeatureParameter(int index) {
		return getKeyFeatureParameter(index, true);
	}

	public String getKeyFeatureParameter(int index, boolean formal) {
		StringBuffer keyFeatureParameter = new StringBuffer();
		int count = 0;

		for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(getTypeGenClass())
			.iterator(); k.hasNext(); count++) {

			GenFeature keyGenFeature = (GenFeature) k.next();

			if (keyGenFeature.isContains()) {

				for (Iterator n = UML2GenModelUtil.getKeyGenFeatures(
					keyGenFeature.getTypeGenClass(), false).iterator(); n
					.hasNext(); count++) {

					GenFeature nestedKeyGenFeature = (GenFeature) n.next();

					if (count == index) {

						if (formal) {
							keyFeatureParameter.append(keyGenFeature
								.isListType()
								? getGenModel().getImportedName(
									"org.eclipse.emf.common.util.EList") //$NON-NLS-1$
								: nestedKeyGenFeature.getImportedType());
							keyFeatureParameter.append(' ');
						}

						return keyFeatureParameter.append(
							keyGenFeature.getUncapName()
								+ (keyGenFeature.isListType()
									? Generator.pluralize(nestedKeyGenFeature
										.getCapName())
									: nestedKeyGenFeature.getCapName()))
							.toString();
					}
				}
			} else if (count == index) {

				if (formal) {
					keyFeatureParameter.append(keyGenFeature.getImportedType());
					keyFeatureParameter.append(' ');
				}

				return keyFeatureParameter.append(
					uncapName(keyGenFeature.getAccessorName())).toString();
			}
		}

		return keyFeatureParameter.toString();
	}

	public String getKeyFeatureParameters() {
		return getKeyFeatureParameters(true);
	}

	public String getKeyFeatureParameters(boolean formal) {
		StringBuffer keyFeatureParameters = new StringBuffer();

		for (int i = 0, size = getKeyGenFeatures().size(); i < size; i++) {
			keyFeatureParameters.append(getKeyFeatureParameter(i, formal));

			if (i + 1 < size) {
				keyFeatureParameters.append(", "); //$NON-NLS-1$
			}
		}

		return keyFeatureParameters.toString();
	}

	public String getFormattedKeyFeatureName(int index) {
		StringBuffer formattedKeyFeatureName = new StringBuffer();
		int count = 0;

		for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(getTypeGenClass())
			.iterator(); k.hasNext(); count++) {

			GenFeature keyGenFeature = (GenFeature) k.next();

			if (keyGenFeature.isContains()) {

				for (Iterator n = UML2GenModelUtil.getKeyGenFeatures(
					keyGenFeature.getTypeGenClass(), false).iterator(); n
					.hasNext(); count++) {

					GenFeature nestedKeyGenFeature = (GenFeature) n.next();

					if (count == index) {
						return formattedKeyFeatureName.append(
							"'<em><b>" //$NON-NLS-1$
								+ format(keyGenFeature.getCapName()
									+ (keyGenFeature.isListType()
										? Generator
											.pluralize(nestedKeyGenFeature
												.getCapName())
										: nestedKeyGenFeature.getCapName()),
									' ', null, false, false) + "</b></em>'") //$NON-NLS-1$
							.toString();
					}
				}
			} else if (count == index) {
				return formattedKeyFeatureName.append(
					"'<em><b>" //$NON-NLS-1$
						+ format(keyGenFeature.getAccessorName(), ' ', null,
							false, false) + "</b></em>'").toString(); //$NON-NLS-1$
			}
		}

		return formattedKeyFeatureName.toString();
	}

	public String getFormattedKeyFeatureNames() {
		StringBuffer formattedKeyFeatureNames = new StringBuffer();

		for (int i = 0, size = getKeyGenFeatures().size(); i < size; i++) {
			formattedKeyFeatureNames.append(getFormattedKeyFeatureName(i));

			if (i + 1 < size) {
				formattedKeyFeatureNames.append(", "); //$NON-NLS-1$

				if (i + 2 == size) {
					formattedKeyFeatureNames.append("and "); //$NON-NLS-1$
				}
			}
		}

		return formattedKeyFeatureNames.toString();
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

	public String getQualifiedFeatureAccessor() {

		if (isDuplicate()) {

			for (Iterator redefinedGenFeatures = getRedefinedGenFeatures()
				.iterator(); redefinedGenFeatures.hasNext();) {

				GenFeature redefinedGenFeature = (GenFeature) redefinedGenFeatures
					.next();

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getQualifiedFeatureAccessor();
				}
			}
		}

		return super.getQualifiedFeatureAccessor();
	}

	public boolean isBidirectional() {

		if (isDuplicate()) {

			for (Iterator redefinedGenFeatures = getRedefinedGenFeatures()
				.iterator(); redefinedGenFeatures.hasNext();) {

				GenFeature redefinedGenFeature = (GenFeature) redefinedGenFeatures
					.next();

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.isBidirectional();
				}
			}
		}

		return super.isBidirectional();
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenFeature getReverse() {

		if (isDuplicate()) {

			for (Iterator redefinedGenFeatures = getRedefinedGenFeatures()
				.iterator(); redefinedGenFeatures.hasNext();) {

				GenFeature redefinedGenFeature = (GenFeature) redefinedGenFeatures
					.next();

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getReverse();
				}
			}
		}

		return super.getReverse();
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

	public void initialize(EStructuralFeature eFeature) {

		if (eFeature != getEcoreFeature()) {
			super.initialize(eFeature);

			if (isEffectiveContainsSubset()) {
				setCreateChild(true);
				setNotify(true);
			}
		} else {
			super.initialize(eFeature);
		}
	}

} // GenFeatureImpl
