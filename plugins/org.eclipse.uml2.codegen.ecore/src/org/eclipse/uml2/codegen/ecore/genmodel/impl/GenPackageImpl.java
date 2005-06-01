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
 * $Id: GenPackageImpl.java,v 1.3 2005/06/01 21:43:44 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.uml2.codegen.ecore.Generator;

import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenPackageImpl#isResourceInterfaces <em>Resource Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenPackageImpl#getOperationsPackage <em>Operations Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPackageImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl
		implements GenPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isResourceInterfaces() <em>Resource Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_INTERFACES_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isResourceInterfaces() <em>Resource Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_INTERFACES_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #getOperationsPackage() <em>Operations Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATIONS_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationsPackage() <em>Operations Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsPackage()
	 * @generated
	 * @ordered
	 */
	protected String operationsPackage = OPERATIONS_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GenModelPackage.eINSTANCE.getGenPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResourceInterfaces() {
		return (eFlags & RESOURCE_INTERFACES_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInterfaces(boolean newResourceInterfaces) {
		boolean oldResourceInterfaces = (eFlags & RESOURCE_INTERFACES_EFLAG) != 0;
		if (newResourceInterfaces)
			eFlags |= RESOURCE_INTERFACES_EFLAG;
		else
			eFlags &= ~RESOURCE_INTERFACES_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_PACKAGE__RESOURCE_INTERFACES,
				oldResourceInterfaces, newResourceInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationsPackage() {
		return operationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationsPackage(String newOperationsPackage) {
		String oldOperationsPackage = operationsPackage;
		operationsPackage = newOperationsPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_PACKAGE__OPERATIONS_PACKAGE,
				oldOperationsPackage, operationsPackage));
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
				case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						GenModelPackage.GEN_PACKAGE__GEN_MODEL, msgs);
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
				case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
					return eBasicSetContainer(null,
						GenModelPackage.GEN_PACKAGE__GEN_MODEL, msgs);
				case GenModelPackage.GEN_PACKAGE__GEN_ENUMS :
					return ((InternalEList) getGenEnums()).basicRemove(
						otherEnd, msgs);
				case GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES :
					return ((InternalEList) getGenDataTypes()).basicRemove(
						otherEnd, msgs);
				case GenModelPackage.GEN_PACKAGE__GEN_CLASSES :
					return ((InternalEList) getGenClasses()).basicRemove(
						otherEnd, msgs);
				case GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES :
					return ((InternalEList) getNestedGenPackages())
						.basicRemove(otherEnd, msgs);
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
				case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
					return eContainer
						.eInverseRemove(
							this,
							org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__GEN_PACKAGES,
							GenModel.class, msgs);
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
			case GenModelPackage.GEN_PACKAGE__PREFIX :
				return getPrefix();
			case GenModelPackage.GEN_PACKAGE__BASE_PACKAGE :
				return getBasePackage();
			case GenModelPackage.GEN_PACKAGE__RESOURCE :
				return getResource();
			case GenModelPackage.GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY :
				return isDisposableProviderFactory()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_PACKAGE__ADAPTER_FACTORY :
				return isAdapterFactory()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_PACKAGE__LOAD_INITIALIZATION :
				return isLoadInitialization()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX :
				return getInterfacePackageSuffix();
			case GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX :
				return getClassPackageSuffix();
			case GenModelPackage.GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX :
				return getUtilityPackageSuffix();
			case GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX :
				return getProviderPackageSuffix();
			case GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX :
				return getPresentationPackageSuffix();
			case GenModelPackage.GEN_PACKAGE__TESTS_PACKAGE_SUFFIX :
				return getTestsPackageSuffix();
			case GenModelPackage.GEN_PACKAGE__GENERATE_EXAMPLE_CLASS :
				return isGenerateExampleClass()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_PACKAGE__ECORE_PACKAGE :
				if (resolve)
					return getEcorePackage();
				return basicGetEcorePackage();
			case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
				return getGenModel();
			case GenModelPackage.GEN_PACKAGE__GEN_ENUMS :
				return getGenEnums();
			case GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES :
				return getGenDataTypes();
			case GenModelPackage.GEN_PACKAGE__GEN_CLASSES :
				return getGenClasses();
			case GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES :
				return getNestedGenPackages();
			case GenModelPackage.GEN_PACKAGE__GEN_CLASSIFIERS :
				return getGenClassifiers();
			case GenModelPackage.GEN_PACKAGE__RESOURCE_INTERFACES :
				return isResourceInterfaces()
					? Boolean.TRUE
					: Boolean.FALSE;
			case GenModelPackage.GEN_PACKAGE__OPERATIONS_PACKAGE :
				return getOperationsPackage();
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
			case GenModelPackage.GEN_PACKAGE__PREFIX :
				setPrefix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__BASE_PACKAGE :
				setBasePackage((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__RESOURCE :
				setResource((GenResourceKind) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY :
				setDisposableProviderFactory(((Boolean) newValue)
					.booleanValue());
				return;
			case GenModelPackage.GEN_PACKAGE__ADAPTER_FACTORY :
				setAdapterFactory(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_PACKAGE__LOAD_INITIALIZATION :
				setLoadInitialization(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX :
				setInterfacePackageSuffix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX :
				setClassPackageSuffix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX :
				setUtilityPackageSuffix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX :
				setProviderPackageSuffix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX :
				setPresentationPackageSuffix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__TESTS_PACKAGE_SUFFIX :
				setTestsPackageSuffix((String) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__GENERATE_EXAMPLE_CLASS :
				setGenerateExampleClass(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_PACKAGE__ECORE_PACKAGE :
				setEcorePackage((EPackage) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
				setGenModel((GenModel) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_ENUMS :
				getGenEnums().clear();
				getGenEnums().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES :
				getGenDataTypes().clear();
				getGenDataTypes().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_CLASSES :
				getGenClasses().clear();
				getGenClasses().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES :
				getNestedGenPackages().clear();
				getNestedGenPackages().addAll((Collection) newValue);
				return;
			case GenModelPackage.GEN_PACKAGE__RESOURCE_INTERFACES :
				setResourceInterfaces(((Boolean) newValue).booleanValue());
				return;
			case GenModelPackage.GEN_PACKAGE__OPERATIONS_PACKAGE :
				setOperationsPackage((String) newValue);
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
			case GenModelPackage.GEN_PACKAGE__PREFIX :
				setPrefix(PREFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__BASE_PACKAGE :
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__RESOURCE :
				setResource(RESOURCE_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY :
				setDisposableProviderFactory(DISPOSABLE_PROVIDER_FACTORY_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__ADAPTER_FACTORY :
				setAdapterFactory(ADAPTER_FACTORY_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__LOAD_INITIALIZATION :
				setLoadInitialization(LOAD_INITIALIZATION_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX :
				setInterfacePackageSuffix(INTERFACE_PACKAGE_SUFFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX :
				setClassPackageSuffix(CLASS_PACKAGE_SUFFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX :
				setUtilityPackageSuffix(UTILITY_PACKAGE_SUFFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX :
				setProviderPackageSuffix(PROVIDER_PACKAGE_SUFFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX :
				setPresentationPackageSuffix(PRESENTATION_PACKAGE_SUFFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__TESTS_PACKAGE_SUFFIX :
				setTestsPackageSuffix(TESTS_PACKAGE_SUFFIX_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__GENERATE_EXAMPLE_CLASS :
				setGenerateExampleClass(GENERATE_EXAMPLE_CLASS_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__ECORE_PACKAGE :
				setEcorePackage((EPackage) null);
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
				setGenModel((GenModel) null);
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_ENUMS :
				getGenEnums().clear();
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES :
				getGenDataTypes().clear();
				return;
			case GenModelPackage.GEN_PACKAGE__GEN_CLASSES :
				getGenClasses().clear();
				return;
			case GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES :
				getNestedGenPackages().clear();
				return;
			case GenModelPackage.GEN_PACKAGE__RESOURCE_INTERFACES :
				setResourceInterfaces(RESOURCE_INTERFACES_EDEFAULT);
				return;
			case GenModelPackage.GEN_PACKAGE__OPERATIONS_PACKAGE :
				setOperationsPackage(OPERATIONS_PACKAGE_EDEFAULT);
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
			case GenModelPackage.GEN_PACKAGE__PREFIX :
				return PREFIX_EDEFAULT == null
					? prefix != null
					: !PREFIX_EDEFAULT.equals(prefix);
			case GenModelPackage.GEN_PACKAGE__BASE_PACKAGE :
				return BASE_PACKAGE_EDEFAULT == null
					? basePackage != null
					: !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case GenModelPackage.GEN_PACKAGE__RESOURCE :
				return resource != RESOURCE_EDEFAULT;
			case GenModelPackage.GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY :
				return disposableProviderFactory != DISPOSABLE_PROVIDER_FACTORY_EDEFAULT;
			case GenModelPackage.GEN_PACKAGE__ADAPTER_FACTORY :
				return adapterFactory != ADAPTER_FACTORY_EDEFAULT;
			case GenModelPackage.GEN_PACKAGE__LOAD_INITIALIZATION :
				return loadInitialization != LOAD_INITIALIZATION_EDEFAULT;
			case GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX :
				return INTERFACE_PACKAGE_SUFFIX_EDEFAULT == null
					? interfacePackageSuffix != null
					: !INTERFACE_PACKAGE_SUFFIX_EDEFAULT
						.equals(interfacePackageSuffix);
			case GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX :
				return CLASS_PACKAGE_SUFFIX_EDEFAULT == null
					? classPackageSuffix != null
					: !CLASS_PACKAGE_SUFFIX_EDEFAULT.equals(classPackageSuffix);
			case GenModelPackage.GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX :
				return UTILITY_PACKAGE_SUFFIX_EDEFAULT == null
					? utilityPackageSuffix != null
					: !UTILITY_PACKAGE_SUFFIX_EDEFAULT
						.equals(utilityPackageSuffix);
			case GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX :
				return PROVIDER_PACKAGE_SUFFIX_EDEFAULT == null
					? providerPackageSuffix != null
					: !PROVIDER_PACKAGE_SUFFIX_EDEFAULT
						.equals(providerPackageSuffix);
			case GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX :
				return PRESENTATION_PACKAGE_SUFFIX_EDEFAULT == null
					? presentationPackageSuffix != null
					: !PRESENTATION_PACKAGE_SUFFIX_EDEFAULT
						.equals(presentationPackageSuffix);
			case GenModelPackage.GEN_PACKAGE__TESTS_PACKAGE_SUFFIX :
				return TESTS_PACKAGE_SUFFIX_EDEFAULT == null
					? testsPackageSuffix != null
					: !TESTS_PACKAGE_SUFFIX_EDEFAULT.equals(testsPackageSuffix);
			case GenModelPackage.GEN_PACKAGE__GENERATE_EXAMPLE_CLASS :
				return generateExampleClass != GENERATE_EXAMPLE_CLASS_EDEFAULT;
			case GenModelPackage.GEN_PACKAGE__ECORE_PACKAGE :
				return ecorePackage != null;
			case GenModelPackage.GEN_PACKAGE__GEN_MODEL :
				return getGenModel() != null;
			case GenModelPackage.GEN_PACKAGE__GEN_ENUMS :
				return genEnums != null && !genEnums.isEmpty();
			case GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES :
				return genDataTypes != null && !genDataTypes.isEmpty();
			case GenModelPackage.GEN_PACKAGE__GEN_CLASSES :
				return genClasses != null && !genClasses.isEmpty();
			case GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES :
				return nestedGenPackages != null
					&& !nestedGenPackages.isEmpty();
			case GenModelPackage.GEN_PACKAGE__GEN_CLASSIFIERS :
				return !getGenClassifiers().isEmpty();
			case GenModelPackage.GEN_PACKAGE__RESOURCE_INTERFACES :
				return ((eFlags & RESOURCE_INTERFACES_EFLAG) != 0) != RESOURCE_INTERFACES_EDEFAULT;
			case GenModelPackage.GEN_PACKAGE__OPERATIONS_PACKAGE :
				return OPERATIONS_PACKAGE_EDEFAULT == null
					? operationsPackage != null
					: !OPERATIONS_PACKAGE_EDEFAULT.equals(operationsPackage);
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
		result.append(" (resourceInterfaces: "); //$NON-NLS-1$
		result.append((eFlags & RESOURCE_INTERFACES_EFLAG) != 0);
		result.append(", operationsPackage: "); //$NON-NLS-1$
		result.append(operationsPackage);
		result.append(')');
		return result.toString();
	}

	public String getOperationsPackageName() {
		String operationsPackageName = getOperationsPackage();

		return isBlank(operationsPackageName)
			? getClassPackageName() + ".operations"
			: operationsPackageName;
	}

	public boolean isOperationsClasses() {
		return !isBlank(getOperationsPackage());
	}

	public String getResourceInterfaceName() {
		return getPrefixedName("Resource");
	}

	public String getQualifiedResourceInterfaceName() {
		return getUtilitiesPackageName() + "." + getResourceInterfaceName();
	}

	public String getImportedResourceInterfaceName() {
		return getGenModel().getImportedName(
			getQualifiedResourceInterfaceName());
	}

	public String getImportedResourceBaseInterfaceName() {
		switch (getResource().getValue()) {
			case GenResourceKind.XML :
				return getGenModel().getImportedName(
					"org.eclipse.emf.ecore.xmi.XMLResource");
			case GenResourceKind.XMI :
				return getGenModel().getImportedName(
					"org.eclipse.emf.ecore.xmi.XMIResource");
			default :
				return getGenModel().getImportedName(
					"org.eclipse.emf.ecore.resource.Resource");
		}
	}

	public String getImportedResourceFactoryInterfaceName() {
		return getImportedResourceInterfaceName() + ".Factory";
	}

	public String getImportedResourceFactoryBaseInterfaceName() {
		return getGenModel().getImportedName(
			"org.eclipse.emf.ecore.resource.Resource")
			+ ".Factory";
	}

	public String getImportedResourceBaseClassName() {
		return isResourceInterfaces()
			? super.getImportedResourceBaseClassName() + " implements "
				+ getImportedResourceInterfaceName()
			: super.getImportedResourceBaseClassName();
	}

	public String getImportedResourceFactoryBaseClassName() {
		return isResourceInterfaces()
			? super.getImportedResourceFactoryBaseClassName() + " implements "
				+ getImportedResourceFactoryInterfaceName()
			: super.getImportedResourceFactoryBaseClassName();
	}

	public boolean isXMLResource() {
		switch (getResource().getValue()) {
			case GenResourceKind.XMI :
			case GenResourceKind.XML :
				return true;
			default :
				return false;
		}
	}

	public void generate(IProgressMonitor progressMonitor) {
		// TODO https://bugs.eclipse.org/bugs/show_bug.cgi?id=75925

		try {

			if (!canGenerate()) {
				return;
			}

			if (GenResourceKind.NONE_LITERAL != getResource()
				&& isResourceInterfaces()) {
				progressMonitor.beginTask("", 1);

				progressMonitor.subTask(CodeGenEcorePlugin.INSTANCE.getString(
					"_UI_GeneratingJavaClass_message",
					new Object[]{getQualifiedResourceInterfaceName()}));
				generate(
					new SubProgressMonitor(progressMonitor, 1),
					Generator.EMF_MODEL_PROJECT_STYLE,
					getGenModel().getEffectiveModelPluginVariables(),
					getGenModel().getModelDirectory(),
					getUtilitiesPackageName(),
					getResourceInterfaceName(),
					((org.eclipse.uml2.codegen.ecore.genmodel.GenModel) getGenModel())
						.getResourceInterfaceEmitter());
			}

			super.generate(progressMonitor);
		} finally {
			progressMonitor.done();
		}
	}

	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenPackage oldGenPackageVersion) {
		super.reconcileSettings(oldGenPackageVersion);

		setOperationsPackage(UML2GenModelUtil
			.getOperationsPackage(oldGenPackageVersion));
		setResourceInterfaces(UML2GenModelUtil
			.isResourceInterfaces(oldGenPackageVersion));
	}

} // GenPackageImpl
