/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 208016, 247980
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 394623, 212765, 451350
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.codegen.ecore.genmodel.GenBase;
import org.eclipse.uml2.codegen.ecore.Generator;
import org.eclipse.uml2.codegen.ecore.genmodel.GenFeature;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenFeatureImpl#isKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenFeatureImpl#isPluralizationException <em>Pluralization Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenFeatureImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenFeatureImpl
		implements GenFeature {

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
	 * The default value of the '{@link #isPluralizationException() <em>Pluralization Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluralizationException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLURALIZATION_EXCEPTION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isPluralizationException() <em>Pluralization Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluralizationException()
	 * @generated
	 * @ordered
	 */
	protected static final int PLURALIZATION_EXCEPTION_EFLAG = 1 << 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int EOFFSET_CORRECTION = GenModelPackage.Literals.GEN_FEATURE
		.getFeatureID(GenModelPackage.Literals.GEN_FEATURE__KEY)
		- GenModelPackage.GEN_FEATURE__KEY;

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
	@Override
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
				GenModelPackage.GEN_FEATURE__KEY + EOFFSET_CORRECTION, oldKey,
				newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPluralizationException() {
		return (eFlags & PLURALIZATION_EXCEPTION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralizationException(boolean newPluralizationException) {
		boolean oldPluralizationException = (eFlags & PLURALIZATION_EXCEPTION_EFLAG) != 0;
		if (newPluralizationException)
			eFlags |= PLURALIZATION_EXCEPTION_EFLAG;
		else
			eFlags &= ~PLURALIZATION_EXCEPTION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION
					+ EOFFSET_CORRECTION, oldPluralizationException,
				newPluralizationException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_FEATURE__KEY :
				return isKey();
			case GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION :
				return isPluralizationException();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_FEATURE__KEY :
				setKey((Boolean) newValue);
				return;
			case GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION :
				setPluralizationException((Boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_FEATURE__KEY :
				setKey(KEY_EDEFAULT);
				return;
			case GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION :
				setPluralizationException(PLURALIZATION_EXCEPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_FEATURE__KEY :
				return ((eFlags & KEY_EFLAG) != 0) != KEY_EDEFAULT;
			case GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION :
				return ((eFlags & PLURALIZATION_EXCEPTION_EFLAG) != 0) != PLURALIZATION_EXCEPTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenBase.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == GenTypedElement.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == GenFeature.class) {
			switch (baseFeatureID - EOFFSET_CORRECTION) {
				case GenModelPackage.GEN_FEATURE__KEY :
					return GenModelPackage.GEN_FEATURE__KEY
						+ EOFFSET_CORRECTION;
				case GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION :
					return GenModelPackage.GEN_FEATURE__PLURALIZATION_EXCEPTION
						+ EOFFSET_CORRECTION;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: "); //$NON-NLS-1$
		result.append((eFlags & KEY_EFLAG) != 0);
		result.append(", pluralizationException: "); //$NON-NLS-1$
		result.append((eFlags & PLURALIZATION_EXCEPTION_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	private org.eclipse.emf.codegen.ecore.genmodel.GenModel genModel;

	protected void setGenModel(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel genModel) {
		this.genModel = genModel;
	}

	@Override
	public GenClass getGenClass() {
		return isDuplicate()
			? findGenClass(Generator.getEcoreContainingClass(getEcoreFeature()))
			: super.getGenClass();
	}

	@Override
	public org.eclipse.emf.codegen.ecore.genmodel.GenModel getGenModel() {
		return isDuplicate()
			? genModel
			: super.getGenModel();
	}

	@Override
	protected org.eclipse.emf.codegen.ecore.genmodel.GenFeature findGenFeature(
			EStructuralFeature ecoreFeature) {

		return UML2GenModelUtil.findGenFeature(getGenClass(), ecoreFeature);
	}

	@Override
	public String getAccessorName() {
		return isMapEntryFeature()
			? "Typed" + getCapName() //$NON-NLS-1$
			: (isListType()
				&& UML2GenModelUtil.isPluralizedGetters(getGenModel())
				&& !isPluralizationException()
				? Generator.pluralize(getCapName())
				: ("Class".equals(getCapName()) //$NON-NLS-1$
					? "Class_" //$NON-NLS-1$
					: getCapName()));
	}

	@Override
	public String getSafeName() {
		return isListType()
			&& UML2GenModelUtil.isPluralizedGetters(getGenModel())
			&& !isPluralizationException()
			? safeName(Generator.pluralize(uncapPrefixedName(getName())))
			: super.getSafeName();
	}

	@Override
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

			GenClass context = getContext();

			if (rootImplementsInterface != null
				&& !rootImplementsInterface.isEObject()) {

				for (GenOperation genOperation : rootImplementsInterface
					.getAllGenOperations()) {

					if (genOperation.getName().equals(result)
						&& genOperation.getGenParameters().isEmpty()
						&& !genOperation.getType(context).equals(
							getType(context))) {

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

		for (EStructuralFeature subsettedEcoreFeature : Generator
			.getSubsettedEcoreFeatures(getEcoreFeature())) {

			if (((EStructuralFeature.Internal) subsettedEcoreFeature)
				.isContainment() && !subsettedEcoreFeature.isDerived()) {

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

	public List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getSubsettedGenFeatures() {
		List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> subsettedGenFeatures = new ArrayList<org.eclipse.emf.codegen.ecore.genmodel.GenFeature>();

		for (EStructuralFeature subsettedEcoreFeature : Generator
			.getSubsettedEcoreFeatures(getEcoreFeature())) {

			subsettedGenFeatures.add(findGenFeature(subsettedEcoreFeature));
		}

		return subsettedGenFeatures;
	}

	public boolean isRedefinition() {
		return Generator.isRedefinition(getEcoreFeature());
	}

	public List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getRedefinedGenFeatures() {
		List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> redefinedGenFeatures = new ArrayList<org.eclipse.emf.codegen.ecore.genmodel.GenFeature>();

		for (EStructuralFeature redefinedEcoreFeature : Generator
			.getRedefinedEcoreFeatures(getEcoreFeature())) {

			redefinedGenFeatures.add(findGenFeature(redefinedEcoreFeature));
		}

		return redefinedGenFeatures;
	}

	@Deprecated
	public String getRedefinedListItemType() {
		return getRedefinedListItemType(getContext());
	}

	public String getRedefinedListItemType(GenClass context) {

		for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

			if (getName().equals(redefinedGenFeature.getName())) {
				return UML2GenModelUtil.getRedefinedListItemType(context,
					redefinedGenFeature);
			}
		}

		return super.getListItemType(context);
	}

	@Override
	public String getListItemType(GenClass context) {
		return getRedefinedListItemType(context);
	}

	@Override
	public String getImportedType(GenClass context) {

		if (isListType()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getImportedType(context);
				}
			}
		}

		return super.getImportedType(context);
	}

	public List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getKeyGenFeatures() {
		List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> keyGenFeatures = new ArrayList<org.eclipse.emf.codegen.ecore.genmodel.GenFeature>();

		for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature keyGenFeature : UML2GenModelUtil
			.getKeyGenFeatures(getTypeGenClass())) {

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

		for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature keyGenFeature : getKeyGenFeatures()) {

			if (keyGenFeature.isStringType()) {
				return true;
			}
		}

		return false;
	}

	@Deprecated
	public String getKeyFeatureParameter(int index) {
		return getKeyFeatureParameter(getContext(), index);
	}

	public String getKeyFeatureParameter(GenClass context, int index) {
		return getKeyFeatureParameter(context, index, true);
	}

	@Deprecated
	public String getKeyFeatureParameter(int index, boolean formal) {
		return getKeyFeatureParameter(getContext(), index, formal);
	}

	public String getKeyFeatureParameter(GenClass context, int index,
			boolean formal) {
		StringBuffer keyFeatureParameter = new StringBuffer();
		int count = 0;

		for (Iterator<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> k = UML2GenModelUtil
			.getKeyGenFeatures(getTypeGenClass()).iterator(); k.hasNext();) {

			org.eclipse.emf.codegen.ecore.genmodel.GenFeature keyGenFeature = k
				.next();

			if (keyGenFeature.isContains()) {

				for (Iterator<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> n = UML2GenModelUtil
					.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false)
					.iterator(); n.hasNext();) {

					org.eclipse.emf.codegen.ecore.genmodel.GenFeature nestedKeyGenFeature = n
						.next();

					if (count++ == index) {

						if (formal) {

							if (keyGenFeature.isListType()) {
								keyFeatureParameter.append(getGenModel()
									.getImportedName(
										"org.eclipse.emf.common.util.EList")); //$NON-NLS-1$

								if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
									keyFeatureParameter.append('<');
									keyFeatureParameter
										.append(nestedKeyGenFeature
											.getListItemType(context));
									keyFeatureParameter.append('>');
								}
							} else {
								keyFeatureParameter.append(nestedKeyGenFeature
									.getImportedType(context));
							}

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
			} else if (count++ == index) {

				if (formal) {
					keyFeatureParameter.append(keyGenFeature
						.getImportedType(context));
					keyFeatureParameter.append(' ');
				}

				return keyFeatureParameter.append(
					uncapName(keyGenFeature.getAccessorName())).toString();
			}
		}

		return keyFeatureParameter.toString();
	}

	@Deprecated
	public String getKeyFeatureParameters() {
		return getKeyFeatureParameters(getContext());
	}

	public String getKeyFeatureParameters(GenClass context) {
		return getKeyFeatureParameters(context, true);
	}

	@Deprecated
	public String getKeyFeatureParameters(boolean formal) {
		return getKeyFeatureParameters(getContext(), formal);
	}

	public String getKeyFeatureParameters(GenClass context, boolean formal) {
		StringBuffer keyFeatureParameters = new StringBuffer();

		for (int i = 0, size = getKeyGenFeatures().size(); i < size; i++) {
			keyFeatureParameters.append(getKeyFeatureParameter(context, i,
				formal));

			if (i + 1 < size) {
				keyFeatureParameters.append(", "); //$NON-NLS-1$
			}
		}

		return keyFeatureParameters.toString();
	}

	public String getFormattedKeyFeatureName(int index) {
		StringBuffer formattedKeyFeatureName = new StringBuffer();
		int count = 0;

		for (Iterator<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> k = UML2GenModelUtil
			.getKeyGenFeatures(getTypeGenClass()).iterator(); k.hasNext();) {

			org.eclipse.emf.codegen.ecore.genmodel.GenFeature keyGenFeature = k
				.next();

			if (keyGenFeature.isContains()) {

				for (Iterator<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> n = UML2GenModelUtil
					.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false)
					.iterator(); n.hasNext();) {

					org.eclipse.emf.codegen.ecore.genmodel.GenFeature nestedKeyGenFeature = n
						.next();

					if (count++ == index) {
						return formattedKeyFeatureName
							.append(
								"'<em><b>" //$NON-NLS-1$
									+ format(
										keyGenFeature.getCapName()
											+ (keyGenFeature.isListType()
												? Generator
													.pluralize(nestedKeyGenFeature
														.getCapName())
												: nestedKeyGenFeature
													.getCapName()), ' ', null,
										false, false) + "</b></em>'") //$NON-NLS-1$
							.toString();
					}
				}
			} else if (count++ == index) {
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

	@Override
	public String getFeatureAccessorName() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getFeatureAccessorName();
				}
			}
		}

		return super.getFeatureAccessorName();
	}

	@Override
	public String getQualifiedFeatureAccessorName() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature
						.getQualifiedFeatureAccessorName();
				}
			}
		}

		return super.getQualifiedFeatureAccessorName();
	}

	@Override
	public String getQualifiedFeatureAccessor() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getQualifiedFeatureAccessor();
				}
			}
		}

		return super.getQualifiedFeatureAccessor();
	}

	@Override
	public boolean isBidirectional() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.isBidirectional();
				}
			}
		}

		return super.isBidirectional();
	}

	@Override
	public org.eclipse.emf.codegen.ecore.genmodel.GenFeature getReverse() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenFeature redefinedGenFeature : getRedefinedGenFeatures()) {

				if (getName().equals(redefinedGenFeature.getName())) {
					return redefinedGenFeature.getReverse();
				}
			}
		}

		return super.getReverse();
	}

	@Override
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

	@Override
	public boolean isVolatile() {
		return isDuplicate()
			? getEcoreFeature().isVolatile()
			: super.isVolatile();
	}

	@Override
	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenFeature oldGenFeatureVersion) {
		super.reconcileSettings(oldGenFeatureVersion);

		setKey(UML2GenModelUtil.isKey(oldGenFeatureVersion));
		setPluralizationException(UML2GenModelUtil
			.isPluralizationException(oldGenFeatureVersion));
	}

	@Override
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

	@Override
	public boolean isTested() {
		return super.isTested() && !isUnion();
	}

	@Override
	public boolean hasSettingDelegate() {

		if (isDuplicate()
			&& getGenModel().getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE) {

			for (String settingDelegate : EcoreUtil
				.getSettingDelegates(getGenClass().getGenPackage()
					.getEcorePackage())) {
				if (getEcoreFeature().getEAnnotation(settingDelegate) != null)
					return EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
						.getFactory(settingDelegate) != null;
			}
			return false;
		} else {
			return super.hasSettingDelegate();
		}
	}

	public List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> getAllSubsettedUnionGenFeatures() {
		List<org.eclipse.emf.codegen.ecore.genmodel.GenFeature> allSubsettedGenFeatures = new ArrayList<org.eclipse.emf.codegen.ecore.genmodel.GenFeature>();

		for (EStructuralFeature subsettedEcoreFeature : Generator
			.getSubsettedEcoreFeatures(getEcoreFeature(), true)) {

			if (Generator.isUnion(subsettedEcoreFeature)) {
				allSubsettedGenFeatures
					.add(findGenFeature(subsettedEcoreFeature));
			}
		}

		return allSubsettedGenFeatures;
	}

	public String getRedefinitionLowerBound() {
		return String.valueOf(Generator
			.getRedefinitionLowerBound(getEcoreFeature()));
	}

	public String getRedefinitionUpperBound() {
		return String.valueOf(Generator
			.getRedefinitionUpperBound(getEcoreFeature()));
	}

	public GenClassifier getRedefinitionTypeGenClassifier() {
		return findGenClassifier(Generator
			.getRedefinitionEType(getEcoreFeature()));
	}

} // GenFeatureImpl
