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
 * $Id: GenModelImpl.java,v 1.4 2005/06/07 14:36:03 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenParameter;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.codegen.ecore.CodeGenEcorePlugin;

import org.eclipse.uml2.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GenModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isFactoryMethods <em>Factory Methods</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isPluralizedGetters <em>Pluralized Getters</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isCacheAdapterSupport <em>Cache Adapter Support</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#isSafeStrings <em>Safe Strings</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl#getInvariantPrefix <em>Invariant Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenModelImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelImpl
		implements GenModel {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isFactoryMethods() <em>Factory Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactoryMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FACTORY_METHODS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isFactoryMethods() <em>Factory Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactoryMethods()
	 * @generated
	 * @ordered
	 */
	protected static final int FACTORY_METHODS_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isPluralizedGetters() <em>Pluralized Getters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluralizedGetters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLURALIZED_GETTERS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isPluralizedGetters() <em>Pluralized Getters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluralizedGetters()
	 * @generated
	 * @ordered
	 */
	protected static final int PLURALIZED_GETTERS_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isCacheAdapterSupport() <em>Cache Adapter Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheAdapterSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHE_ADAPTER_SUPPORT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isCacheAdapterSupport() <em>Cache Adapter Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheAdapterSupport()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_ADAPTER_SUPPORT_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #isSafeStrings() <em>Safe Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeStrings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_STRINGS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSafeStrings() <em>Safe Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeStrings()
	 * @generated
	 * @ordered
	 */
	protected static final int SAFE_STRINGS_EFLAG = 1 << 11;

	/**
	 * The default value of the '{@link #getInvariantPrefix() <em>Invariant Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariantPrefix() <em>Invariant Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantPrefix()
	 * @generated
	 * @ordered
	 */
	protected String invariantPrefix = INVARIANT_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryMethods() {
		return (eFlags & FACTORY_METHODS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryMethods(boolean newFactoryMethods) {
		boolean oldFactoryMethods = (eFlags & FACTORY_METHODS_EFLAG) != 0;
		if (newFactoryMethods)
			eFlags |= FACTORY_METHODS_EFLAG;
		else
			eFlags &= ~FACTORY_METHODS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__FACTORY_METHODS, oldFactoryMethods,
				newFactoryMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPluralizedGetters() {
		return (eFlags & PLURALIZED_GETTERS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralizedGetters(boolean newPluralizedGetters) {
		boolean oldPluralizedGetters = (eFlags & PLURALIZED_GETTERS_EFLAG) != 0;
		if (newPluralizedGetters)
			eFlags |= PLURALIZED_GETTERS_EFLAG;
		else
			eFlags &= ~PLURALIZED_GETTERS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS,
				oldPluralizedGetters, newPluralizedGetters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCacheAdapterSupport() {
		return (eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheAdapterSupport(boolean newCacheAdapterSupport) {
		boolean oldCacheAdapterSupport = (eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0;
		if (newCacheAdapterSupport)
			eFlags |= CACHE_ADAPTER_SUPPORT_EFLAG;
		else
			eFlags &= ~CACHE_ADAPTER_SUPPORT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT,
				oldCacheAdapterSupport, newCacheAdapterSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafeStrings() {
		return (eFlags & SAFE_STRINGS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeStrings(boolean newSafeStrings) {
		boolean oldSafeStrings = (eFlags & SAFE_STRINGS_EFLAG) != 0;
		if (newSafeStrings)
			eFlags |= SAFE_STRINGS_EFLAG;
		else
			eFlags &= ~SAFE_STRINGS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__SAFE_STRINGS, oldSafeStrings,
				newSafeStrings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariantPrefix() {
		return invariantPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantPrefix(String newInvariantPrefix) {
		String oldInvariantPrefix = invariantPrefix;
		invariantPrefix = newInvariantPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_MODEL__INVARIANT_PREFIX,
				oldInvariantPrefix, invariantPrefix));
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
				case GenModelPackage.GEN_MODEL__GEN_PACKAGES :
					return ((InternalEList) getGenPackages()).basicAdd(
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
				case GenModelPackage.GEN_MODEL__GEN_PACKAGES :
					return ((InternalEList) getGenPackages()).basicRemove(
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT :
				return getCopyrightText();
			case GenModelPackage.GEN_MODEL__MODEL_DIRECTORY :
				return getModelDirectory();
			case GenModelPackage.GEN_MODEL__CREATION_COMMANDS :
				return isCreationCommands()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__CREATION_ICONS :
				return isCreationIcons()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__EDIT_DIRECTORY :
				return getEditDirectory();
			case GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY :
				return getEditorDirectory();
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID :
				return getModelPluginID();
			case GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY :
				return getTemplateDirectory();
			case GenModelPackage.GEN_MODEL__RUNTIME_JAR :
				return isRuntimeJar()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__FOREIGN_MODEL :
				return getForeignModel();
			case GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES :
				return isDynamicTemplates()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__REDIRECTION :
				return getRedirection();
			case GenModelPackage.GEN_MODEL__FORCE_OVERWRITE :
				return isForceOverwrite()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG :
				return getNonExternalizedStringTag();
			case GenModelPackage.GEN_MODEL__MODEL_NAME :
				return getModelName();
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS :
				return getModelPluginClass();
			case GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS :
				return getEditPluginClass();
			case GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS :
				return getEditorPluginClass();
			case GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH :
				return isUpdateClasspath()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__GENERATE_SCHEMA :
				return isGenerateSchema()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__NON_NLS_MARKERS :
				return isNonNLSMarkers()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__STATIC_PACKAGES :
				return getStaticPackages();
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES :
				return getModelPluginVariables();
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE :
				return getRootExtendsInterface();
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS :
				return getRootExtendsClass();
			case GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE :
				return getRootImplementsInterface();
			case GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES :
				return isSuppressEMFTypes()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE :
				return getFeatureMapWrapperInterface();
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE :
				return getFeatureMapWrapperInternalInterface();
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS :
				return getFeatureMapWrapperClass();
			case GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY :
				return isRuntimeCompatibility()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM :
				return isRichClientPlatform()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION :
				return isReflectiveDelegation()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__CODE_FORMATTING :
				return isCodeFormatting()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__TESTS_DIRECTORY :
				return getTestsDirectory();
			case GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS :
				return getTestSuiteClass();
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD :
				return getBooleanFlagsField();
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS :
				return new Integer(getBooleanFlagsReservedBits());
			case GenModelPackage.GEN_MODEL__IMPORTER_ID :
				return getImporterID();
			case GenModelPackage.GEN_MODEL__BUNDLE_MANIFEST :
				return isBundleManifest()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__GEN_PACKAGES :
				return getGenPackages();
			case GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES :
				return getUsedGenPackages();
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				return isFactoryMethods()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				return isPluralizedGetters()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				return isCacheAdapterSupport()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				return isSafeStrings()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				return getInvariantPrefix();
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
			case GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT :
				setCopyrightText((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_DIRECTORY :
				setModelDirectory((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__CREATION_COMMANDS :
				setCreationCommands(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__CREATION_ICONS :
				setCreationIcons(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__EDIT_DIRECTORY :
				setEditDirectory((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY :
				setEditorDirectory((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID :
				setModelPluginID((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY :
				setTemplateDirectory((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__RUNTIME_JAR :
				setRuntimeJar(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__FOREIGN_MODEL :
				getForeignModel().clear();
				getForeignModel().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES :
				setDynamicTemplates(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__REDIRECTION :
				setRedirection((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__FORCE_OVERWRITE :
				setForceOverwrite(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG :
				setNonExternalizedStringTag((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_NAME :
				setModelName((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS :
				setModelPluginClass((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS :
				setEditPluginClass((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS :
				setEditorPluginClass((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH :
				setUpdateClasspath(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__GENERATE_SCHEMA :
				setGenerateSchema(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__NON_NLS_MARKERS :
				setNonNLSMarkers(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__STATIC_PACKAGES :
				getStaticPackages().clear();
				getStaticPackages().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES :
				getModelPluginVariables().clear();
				getModelPluginVariables().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE :
				setRootExtendsInterface((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS :
				setRootExtendsClass((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE :
				setRootImplementsInterface((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES :
				setSuppressEMFTypes(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE :
				setFeatureMapWrapperInterface((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE :
				setFeatureMapWrapperInternalInterface((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS :
				setFeatureMapWrapperClass((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY :
				setRuntimeCompatibility(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM :
				setRichClientPlatform(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION :
				setReflectiveDelegation(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__CODE_FORMATTING :
				setCodeFormatting(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__TESTS_DIRECTORY :
				setTestsDirectory((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS :
				setTestSuiteClass((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD :
				setBooleanFlagsField((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS :
				setBooleanFlagsReservedBits(((Integer) newValue).intValue());
				return;
			case GenModelPackage.GEN_MODEL__IMPORTER_ID :
				setImporterID((String) newValue);
				return;
			case GenModelPackage.GEN_MODEL__BUNDLE_MANIFEST :
				setBundleManifest(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__GEN_PACKAGES :
				getGenPackages().clear();
				getGenPackages().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES :
				getUsedGenPackages().clear();
				getUsedGenPackages().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				setFactoryMethods(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				setPluralizedGetters(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				setCacheAdapterSupport(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				setSafeStrings(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				setInvariantPrefix((String) newValue);
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
			case GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT :
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_DIRECTORY :
				setModelDirectory(MODEL_DIRECTORY_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__CREATION_COMMANDS :
				setCreationCommands(CREATION_COMMANDS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__CREATION_ICONS :
				setCreationIcons(CREATION_ICONS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__EDIT_DIRECTORY :
				unsetEditDirectory();
				return;
			case GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY :
				unsetEditorDirectory();
				return;
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID :
				setModelPluginID(MODEL_PLUGIN_ID_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY :
				setTemplateDirectory(TEMPLATE_DIRECTORY_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__RUNTIME_JAR :
				setRuntimeJar(RUNTIME_JAR_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__FOREIGN_MODEL :
				getForeignModel().clear();
				return;
			case GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES :
				setDynamicTemplates(DYNAMIC_TEMPLATES_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__REDIRECTION :
				setRedirection(REDIRECTION_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__FORCE_OVERWRITE :
				setForceOverwrite(FORCE_OVERWRITE_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG :
				setNonExternalizedStringTag(NON_EXTERNALIZED_STRING_TAG_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_NAME :
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS :
				setModelPluginClass(MODEL_PLUGIN_CLASS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS :
				unsetEditPluginClass();
				return;
			case GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS :
				unsetEditorPluginClass();
				return;
			case GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH :
				setUpdateClasspath(UPDATE_CLASSPATH_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__GENERATE_SCHEMA :
				setGenerateSchema(GENERATE_SCHEMA_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__NON_NLS_MARKERS :
				setNonNLSMarkers(NON_NLS_MARKERS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__STATIC_PACKAGES :
				getStaticPackages().clear();
				return;
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES :
				getModelPluginVariables().clear();
				return;
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE :
				setRootExtendsInterface(ROOT_EXTENDS_INTERFACE_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS :
				setRootExtendsClass(ROOT_EXTENDS_CLASS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE :
				setRootImplementsInterface(ROOT_IMPLEMENTS_INTERFACE_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES :
				setSuppressEMFTypes(SUPPRESS_EMF_TYPES_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE :
				setFeatureMapWrapperInterface(FEATURE_MAP_WRAPPER_INTERFACE_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE :
				setFeatureMapWrapperInternalInterface(FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS :
				setFeatureMapWrapperClass(FEATURE_MAP_WRAPPER_CLASS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY :
				setRuntimeCompatibility(RUNTIME_COMPATIBILITY_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM :
				setRichClientPlatform(RICH_CLIENT_PLATFORM_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION :
				setReflectiveDelegation(REFLECTIVE_DELEGATION_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__CODE_FORMATTING :
				setCodeFormatting(CODE_FORMATTING_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__TESTS_DIRECTORY :
				unsetTestsDirectory();
				return;
			case GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS :
				unsetTestSuiteClass();
				return;
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD :
				setBooleanFlagsField(BOOLEAN_FLAGS_FIELD_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS :
				setBooleanFlagsReservedBits(BOOLEAN_FLAGS_RESERVED_BITS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__IMPORTER_ID :
				setImporterID(IMPORTER_ID_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__BUNDLE_MANIFEST :
				setBundleManifest(BUNDLE_MANIFEST_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__GEN_PACKAGES :
				getGenPackages().clear();
				return;
			case GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES :
				getUsedGenPackages().clear();
				return;
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				setFactoryMethods(FACTORY_METHODS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				setPluralizedGetters(PLURALIZED_GETTERS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				setCacheAdapterSupport(CACHE_ADAPTER_SUPPORT_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				setSafeStrings(SAFE_STRINGS_EDEFAULT);
				return;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				setInvariantPrefix(INVARIANT_PREFIX_EDEFAULT);
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
			case GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT :
				return COPYRIGHT_TEXT_EDEFAULT == null
					? copyrightText != null
					: !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case GenModelPackage.GEN_MODEL__MODEL_DIRECTORY :
				return MODEL_DIRECTORY_EDEFAULT == null
					? modelDirectory != null
					: !MODEL_DIRECTORY_EDEFAULT.equals(modelDirectory);
			case GenModelPackage.GEN_MODEL__CREATION_COMMANDS :
				return creationCommands != CREATION_COMMANDS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__CREATION_ICONS :
				return creationIcons != CREATION_ICONS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__EDIT_DIRECTORY :
				return isSetEditDirectory();
			case GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY :
				return isSetEditorDirectory();
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID :
				return MODEL_PLUGIN_ID_EDEFAULT == null
					? modelPluginID != null
					: !MODEL_PLUGIN_ID_EDEFAULT.equals(modelPluginID);
			case GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY :
				return TEMPLATE_DIRECTORY_EDEFAULT == null
					? templateDirectory != null
					: !TEMPLATE_DIRECTORY_EDEFAULT.equals(templateDirectory);
			case GenModelPackage.GEN_MODEL__RUNTIME_JAR :
				return runtimeJar != RUNTIME_JAR_EDEFAULT;
			case GenModelPackage.GEN_MODEL__FOREIGN_MODEL :
				return foreignModel != null && !foreignModel.isEmpty();
			case GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES :
				return dynamicTemplates != DYNAMIC_TEMPLATES_EDEFAULT;
			case GenModelPackage.GEN_MODEL__REDIRECTION :
				return REDIRECTION_EDEFAULT == null
					? redirection != null
					: !REDIRECTION_EDEFAULT.equals(redirection);
			case GenModelPackage.GEN_MODEL__FORCE_OVERWRITE :
				return forceOverwrite != FORCE_OVERWRITE_EDEFAULT;
			case GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG :
				return NON_EXTERNALIZED_STRING_TAG_EDEFAULT == null
					? nonExternalizedStringTag != null
					: !NON_EXTERNALIZED_STRING_TAG_EDEFAULT
						.equals(nonExternalizedStringTag);
			case GenModelPackage.GEN_MODEL__MODEL_NAME :
				return MODEL_NAME_EDEFAULT == null
					? modelName != null
					: !MODEL_NAME_EDEFAULT.equals(modelName);
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS :
				return MODEL_PLUGIN_CLASS_EDEFAULT == null
					? modelPluginClass != null
					: !MODEL_PLUGIN_CLASS_EDEFAULT.equals(modelPluginClass);
			case GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS :
				return isSetEditPluginClass();
			case GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS :
				return isSetEditorPluginClass();
			case GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH :
				return updateClasspath != UPDATE_CLASSPATH_EDEFAULT;
			case GenModelPackage.GEN_MODEL__GENERATE_SCHEMA :
				return generateSchema != GENERATE_SCHEMA_EDEFAULT;
			case GenModelPackage.GEN_MODEL__NON_NLS_MARKERS :
				return nonNLSMarkers != NON_NLS_MARKERS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__STATIC_PACKAGES :
				return staticPackages != null && !staticPackages.isEmpty();
			case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES :
				return modelPluginVariables != null
					&& !modelPluginVariables.isEmpty();
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE :
				return ROOT_EXTENDS_INTERFACE_EDEFAULT == null
					? rootExtendsInterface != null
					: !ROOT_EXTENDS_INTERFACE_EDEFAULT
						.equals(rootExtendsInterface);
			case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS :
				return ROOT_EXTENDS_CLASS_EDEFAULT == null
					? rootExtendsClass != null
					: !ROOT_EXTENDS_CLASS_EDEFAULT.equals(rootExtendsClass);
			case GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE :
				return ROOT_IMPLEMENTS_INTERFACE_EDEFAULT == null
					? rootImplementsInterface != null
					: !ROOT_IMPLEMENTS_INTERFACE_EDEFAULT
						.equals(rootImplementsInterface);
			case GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES :
				return suppressEMFTypes != SUPPRESS_EMF_TYPES_EDEFAULT;
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE :
				return FEATURE_MAP_WRAPPER_INTERFACE_EDEFAULT == null
					? featureMapWrapperInterface != null
					: !FEATURE_MAP_WRAPPER_INTERFACE_EDEFAULT
						.equals(featureMapWrapperInterface);
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE :
				return FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE_EDEFAULT == null
					? featureMapWrapperInternalInterface != null
					: !FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE_EDEFAULT
						.equals(featureMapWrapperInternalInterface);
			case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS :
				return FEATURE_MAP_WRAPPER_CLASS_EDEFAULT == null
					? featureMapWrapperClass != null
					: !FEATURE_MAP_WRAPPER_CLASS_EDEFAULT
						.equals(featureMapWrapperClass);
			case GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY :
				return runtimeCompatibility != RUNTIME_COMPATIBILITY_EDEFAULT;
			case GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM :
				return richClientPlatform != RICH_CLIENT_PLATFORM_EDEFAULT;
			case GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION :
				return reflectiveDelegation != REFLECTIVE_DELEGATION_EDEFAULT;
			case GenModelPackage.GEN_MODEL__CODE_FORMATTING :
				return codeFormatting != CODE_FORMATTING_EDEFAULT;
			case GenModelPackage.GEN_MODEL__TESTS_DIRECTORY :
				return isSetTestsDirectory();
			case GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS :
				return isSetTestSuiteClass();
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD :
				return BOOLEAN_FLAGS_FIELD_EDEFAULT == null
					? booleanFlagsField != null
					: !BOOLEAN_FLAGS_FIELD_EDEFAULT.equals(booleanFlagsField);
			case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS :
				return booleanFlagsReservedBits != BOOLEAN_FLAGS_RESERVED_BITS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__IMPORTER_ID :
				return IMPORTER_ID_EDEFAULT == null
					? importerID != null
					: !IMPORTER_ID_EDEFAULT.equals(importerID);
			case GenModelPackage.GEN_MODEL__BUNDLE_MANIFEST :
				return bundleManifest != BUNDLE_MANIFEST_EDEFAULT;
			case GenModelPackage.GEN_MODEL__GEN_PACKAGES :
				return genPackages != null && !genPackages.isEmpty();
			case GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES :
				return usedGenPackages != null && !usedGenPackages.isEmpty();
			case GenModelPackage.GEN_MODEL__FACTORY_METHODS :
				return ((eFlags & FACTORY_METHODS_EFLAG) != 0) != FACTORY_METHODS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__PLURALIZED_GETTERS :
				return ((eFlags & PLURALIZED_GETTERS_EFLAG) != 0) != PLURALIZED_GETTERS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__CACHE_ADAPTER_SUPPORT :
				return ((eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0) != CACHE_ADAPTER_SUPPORT_EDEFAULT;
			case GenModelPackage.GEN_MODEL__SAFE_STRINGS :
				return ((eFlags & SAFE_STRINGS_EFLAG) != 0) != SAFE_STRINGS_EDEFAULT;
			case GenModelPackage.GEN_MODEL__INVARIANT_PREFIX :
				return INVARIANT_PREFIX_EDEFAULT == null
					? invariantPrefix != null
					: !INVARIANT_PREFIX_EDEFAULT.equals(invariantPrefix);
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
		result.append(" (factoryMethods: "); //$NON-NLS-1$
		result.append((eFlags & FACTORY_METHODS_EFLAG) != 0);
		result.append(", pluralizedGetters: "); //$NON-NLS-1$
		result.append((eFlags & PLURALIZED_GETTERS_EFLAG) != 0);
		result.append(", cacheAdapterSupport: "); //$NON-NLS-1$
		result.append((eFlags & CACHE_ADAPTER_SUPPORT_EFLAG) != 0);
		result.append(", safeStrings: "); //$NON-NLS-1$
		result.append((eFlags & SAFE_STRINGS_EFLAG) != 0);
		result.append(", invariantPrefix: "); //$NON-NLS-1$
		result.append(invariantPrefix);
		result.append(')');
		return result.toString();
	}

	public GenClass createGenClass() {
		return GenModelFactory.eINSTANCE.createGenClass();
	}

	public GenDataType createGenDataType() {
		return GenModelFactory.eINSTANCE.createGenDataType();
	}

	public GenEnum createGenEnum() {
		return GenModelFactory.eINSTANCE.createGenEnum();
	}

	public GenEnumLiteral createGenEnumLiteral() {
		return GenModelFactory.eINSTANCE.createGenEnumLiteral();
	}

	public GenFeature createGenFeature() {
		GenFeatureImpl genFeature = new GenFeatureImpl();
		genFeature.setGenModel(this);
		return genFeature;
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenModel createGenModel() {
		return GenModelFactory.eINSTANCE.createGenModel();
	}

	public GenOperation createGenOperation() {
		GenOperationImpl genOperation = new GenOperationImpl();
		genOperation.setGenModel(this);
		return genOperation;
	}

	public org.eclipse.emf.codegen.ecore.genmodel.GenPackage createGenPackage() {
		return GenModelFactory.eINSTANCE.createGenPackage();
	}

	public GenParameter createGenParameter() {
		return GenModelFactory.eINSTANCE.createGenParameter();
	}

	protected String[] getTemplatePath() {

		if (null == templatePath) {
			String[] superTemplatePath = super.getTemplatePath();
			templatePath = new String[3];
			System.arraycopy(superTemplatePath, 0, templatePath, 0, 2);
			templatePath[2] = templatePath[1];
			templatePath[1] = CodeGenEcorePlugin.INSTANCE.getBaseURL()
				.toString()
				+ "templates"; //$NON-NLS-1$
		}
		return templatePath;
	}

	protected void addClasspathEntries(JETEmitter jetEmitter)
			throws JETException {
		super.addClasspathEntries(jetEmitter);

		jetEmitter.addVariable("UML2_CODEGEN_ECORE", //$NON-NLS-1$
			"org.eclipse.uml2.codegen.ecore"); //$NON-NLS-1$
	}

	public List getEditRequiredPlugins() {
		List result = super.getEditRequiredPlugins();
		result.add("org.eclipse.uml2.common.edit"); //$NON-NLS-1$
		return result;
	}

	public List getModelRequiredPlugins() {
		List result = super.getModelRequiredPlugins();
		result.add("org.eclipse.uml2.common"); //$NON-NLS-1$
		return result;
	}

	public JETEmitter getClassEmitter() {
		if (classEmitter == null) {
			classEmitter = createJETEmitter(classTemplateName);
			setMethod(classEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.model.Class"); //$NON-NLS-1$
		}
		return classEmitter;
	}

	public JETEmitter getInterfaceEmitter() {
		if (interfaceEmitter == null) {
			interfaceEmitter = createJETEmitter(interfaceTemplateName);
			setMethod(interfaceEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.model.Interface"); //$NON-NLS-1$
		}
		return interfaceEmitter;
	}

	public JETEmitter getResourceFactoryClassEmitter() {
		if (resourceFactoryClassEmitter == null) {
			resourceFactoryClassEmitter = createJETEmitter(resourceFactoryTemplateName);
			setMethod(resourceFactoryClassEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.model.ResourceFactoryClass"); //$NON-NLS-1$
		}
		return resourceFactoryClassEmitter;
	}

	public JETEmitter getItemProviderEmitter() {
		if (itemProviderEmitter == null) {
			itemProviderEmitter = createJETEmitter(itemProviderTemplateName);
			setMethod(itemProviderEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.edit.ItemProvider"); //$NON-NLS-1$
		}
		return itemProviderEmitter;
	}

	public JETEmitter getTestCaseEmitter() {
		if (testCaseEmitter == null) {
			testCaseEmitter = createJETEmitter(testCaseTemplateName);
			setMethod(testCaseEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.model.tests.TestCase"); //$NON-NLS-1$
		}
		return testCaseEmitter;
	}

	protected String resourceInterfaceTemplateName = "model/ResourceInterface.javajet"; //$NON-NLS-1$

	protected JETEmitter resourceInterfaceEmitter = null;

	public JETEmitter getResourceInterfaceEmitter() {
		// TODO https://bugs.eclipse.org/bugs/show_bug.cgi?id=75925

		if (resourceInterfaceEmitter == null) {
			resourceInterfaceEmitter = createJETEmitter(resourceInterfaceTemplateName);
			setMethod(resourceInterfaceEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.model.ResourceInterface"); //$NON-NLS-1$
		}

		return resourceInterfaceEmitter;
	}

	protected String operationsClassTemplateName = "model/OperationsClass.javajet"; //$NON-NLS-1$

	protected JETEmitter operationsClassEmitter = null;

	public JETEmitter getOperationsClassEmitter() {
		// TODO https://bugs.eclipse.org/bugs/show_bug.cgi?id=75925

		if (operationsClassEmitter == null) {
			operationsClassEmitter = createJETEmitter(operationsClassTemplateName);
			setMethod(operationsClassEmitter,
				"org.eclipse.uml2.codegen.ecore.templates.model.OperationsClass"); //$NON-NLS-1$
		}

		return operationsClassEmitter;
	}

	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel oldGenModelVersion) {
		super.reconcileSettings(oldGenModelVersion);

		setCacheAdapterSupport(UML2GenModelUtil
			.isCacheAdapterSupport(oldGenModelVersion));
		setFactoryMethods(UML2GenModelUtil.isFactoryMethods(oldGenModelVersion));
		setInvariantPrefix(UML2GenModelUtil
			.getInvariantPrefix(oldGenModelVersion));
		setPluralizedGetters(UML2GenModelUtil
			.isPluralizedGetters(oldGenModelVersion));
		setSafeStrings(UML2GenModelUtil.isSafeStrings(oldGenModelVersion));
	}

}
