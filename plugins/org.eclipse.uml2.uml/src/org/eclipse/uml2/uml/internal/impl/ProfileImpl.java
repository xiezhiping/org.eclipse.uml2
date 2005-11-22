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
 * $Id: ProfileImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl
		extends PackageImpl
		implements Profile {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackagedElements() {
		List packagedElement = (List) eVirtualGet(UMLPackage.PROFILE__PACKAGED_ELEMENT);
		if (packagedElement == null) {
			eVirtualSet(
				UMLPackage.PROFILE__PACKAGED_ELEMENT,
				packagedElement = new SupersetEObjectContainmentEList.Resolving(
					PackageableElement.class, this,
					UMLPackage.PROFILE__PACKAGED_ELEMENT,
					new int[]{UMLPackage.PROFILE__OWNED_STEREOTYPE}));
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getElementImports() {
		List elementImport = (List) eVirtualGet(UMLPackage.PROFILE__ELEMENT_IMPORT);
		if (elementImport == null) {
			eVirtualSet(UMLPackage.PROFILE__ELEMENT_IMPORT,
				elementImport = new SupersetEObjectContainmentWithInverseEList(
					ElementImport.class, this,
					UMLPackage.PROFILE__ELEMENT_IMPORT,
					new int[]{UMLPackage.PROFILE__METACLASS_REFERENCE},
					UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE));
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackageImports() {
		List packageImport = (List) eVirtualGet(UMLPackage.PROFILE__PACKAGE_IMPORT);
		if (packageImport == null) {
			eVirtualSet(UMLPackage.PROFILE__PACKAGE_IMPORT,
				packageImport = new SupersetEObjectContainmentWithInverseEList(
					PackageImport.class, this,
					UMLPackage.PROFILE__PACKAGE_IMPORT, new int[]{
						UMLPackage.PROFILE__APPLIED_PROFILE,
						UMLPackage.PROFILE__METAMODEL_REFERENCE},
					UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE));
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedStereotypes() {
		List ownedStereotype = (List) eVirtualGet(UMLPackage.PROFILE__OWNED_STEREOTYPE);
		if (ownedStereotype == null) {
			eVirtualSet(UMLPackage.PROFILE__OWNED_STEREOTYPE,
				ownedStereotype = new SubsetEObjectResolvingEList(
					Stereotype.class, this,
					UMLPackage.PROFILE__OWNED_STEREOTYPE,
					new int[]{UMLPackage.PROFILE__PACKAGED_ELEMENT}));
		}
		return ownedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getOwnedStereotype(String name) {
		for (Iterator i = getOwnedStereotypes().iterator(); i.hasNext();) {
			Stereotype ownedStereotype = (Stereotype) i.next();
			if (name.equals(ownedStereotype.getName())) {
				return ownedStereotype;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMetaclassReferences() {
		List metaclassReference = (List) eVirtualGet(UMLPackage.PROFILE__METACLASS_REFERENCE);
		if (metaclassReference == null) {
			eVirtualSet(UMLPackage.PROFILE__METACLASS_REFERENCE,
				metaclassReference = new SubsetEObjectEList(
					ElementImport.class, this,
					UMLPackage.PROFILE__METACLASS_REFERENCE,
					new int[]{UMLPackage.PROFILE__ELEMENT_IMPORT}));
		}
		return metaclassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMetamodelReferences() {
		List metamodelReference = (List) eVirtualGet(UMLPackage.PROFILE__METAMODEL_REFERENCE);
		if (metamodelReference == null) {
			eVirtualSet(UMLPackage.PROFILE__METAMODEL_REFERENCE,
				metamodelReference = new SubsetEObjectEList(
					PackageImport.class, this,
					UMLPackage.PROFILE__METAMODEL_REFERENCE,
					new int[]{UMLPackage.PROFILE__PACKAGE_IMPORT}));
		}
		return metamodelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaclassReferenceNotSpecialized(
			DiagnosticChain diagnostics, Map context) {
		return ProfileOperations.validateMetaclassReferenceNotSpecialized(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencesSameMetamodel(DiagnosticChain diagnostics,
			Map context) {
		return ProfileOperations.validateReferencesSameMetamodel(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List allOwningPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(eResource(), this,
				UMLPackage.eINSTANCE.getProfile().getEOperations().get(2));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.eINSTANCE.getProfile()
					.getEOperations().get(2), result = ProfileOperations
					.allOwningPackages(this));
			}
			return result;
		}
		return ProfileOperations.allOwningPackages(this);
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
				case UMLPackage.PROFILE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PROFILE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PROFILE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PROFILE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PROFILE__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.PROFILE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE,
								null, msgs);
					return basicSetOwnedTemplateSignature(
						(TemplateSignature) otherEnd, msgs);
				case UMLPackage.PROFILE__PACKAGE_MERGE :
					return ((InternalEList) getPackageMerges()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
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
				case UMLPackage.PROFILE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.PROFILE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.PROFILE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.PROFILE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
					return basicSetOwnedTemplateSignature(null, msgs);
				case UMLPackage.PROFILE__PACKAGE_MERGE :
					return ((InternalEList) getPackageMerges()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROFILE__PACKAGED_ELEMENT :
					return ((InternalEList) getPackagedElements()).basicRemove(
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROFILE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROFILE__OWNER :
				return getOwner();
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROFILE__NAME :
				return getName();
			case UMLPackage.PROFILE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROFILE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROFILE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PROFILE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PROFILE__MEMBER :
				return getMembers();
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PROFILE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.PROFILE__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.PROFILE__APPLIED_PROFILE :
				return getAppliedProfiles();
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				return getOwnedStereotypes();
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				return getMetaclassReferences();
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				return getMetamodelReferences();
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROFILE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PROFILE__APPLIED_PROFILE :
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				getOwnedStereotypes().clear();
				getOwnedStereotypes().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				getMetaclassReferences().clear();
				getMetaclassReferences().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				getMetamodelReferences().clear();
				getMetamodelReferences().addAll((Collection) newValue);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROFILE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROFILE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PROFILE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PROFILE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.PROFILE__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PROFILE__APPLIED_PROFILE :
				getAppliedProfiles().clear();
				return;
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				getOwnedStereotypes().clear();
				return;
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				getMetaclassReferences().clear();
				return;
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				getMetamodelReferences().clear();
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROFILE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROFILE__OWNER :
				return isSetOwner();
			case UMLPackage.PROFILE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PROFILE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PROFILE__NAME :
				String name = (String) eVirtualGet(UMLPackage.PROFILE__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PROFILE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROFILE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PROFILE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PROFILE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PROFILE__NAME_EXPRESSION) != null;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.PROFILE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.PROFILE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.PROFILE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.PROFILE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.PROFILE__MEMBER :
				return isSetMembers();
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PROFILE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.PROFILE__TEMPLATE_PARAMETER) != null;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.PROFILE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				List packageMerge = (List) eVirtualGet(UMLPackage.PROFILE__PACKAGE_MERGE);
				return packageMerge != null && !packageMerge.isEmpty();
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				List packagedElement = (List) eVirtualGet(UMLPackage.PROFILE__PACKAGED_ELEMENT);
				return packagedElement != null && !packagedElement.isEmpty();
			case UMLPackage.PROFILE__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.PROFILE__APPLIED_PROFILE :
				List appliedProfile = (List) eVirtualGet(UMLPackage.PROFILE__APPLIED_PROFILE);
				return appliedProfile != null && !appliedProfile.isEmpty();
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				List ownedStereotype = (List) eVirtualGet(UMLPackage.PROFILE__OWNED_STEREOTYPE);
				return ownedStereotype != null && !ownedStereotype.isEmpty();
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				List metaclassReference = (List) eVirtualGet(UMLPackage.PROFILE__METACLASS_REFERENCE);
				return metaclassReference != null
					&& !metaclassReference.isEmpty();
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				List metamodelReference = (List) eVirtualGet(UMLPackage.PROFILE__METAMODEL_REFERENCE);
				return metamodelReference != null
					&& !metamodelReference.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ProfileImpl
