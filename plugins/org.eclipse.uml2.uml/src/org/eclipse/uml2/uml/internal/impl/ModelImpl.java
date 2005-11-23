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
 * $Id: ModelImpl.java,v 1.4 2005/11/23 20:01:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ModelImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl
		extends PackageImpl
		implements Model {

	/**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return (String) eVirtualGet(UMLPackage.MODEL__VIEWPOINT,
			VIEWPOINT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		newViewpoint = newViewpoint == null
			? VIEWPOINT_EDEFAULT
			: newViewpoint;
		String viewpoint = newViewpoint;
		Object oldViewpoint = eVirtualSet(UMLPackage.MODEL__VIEWPOINT,
			viewpoint);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MODEL__VIEWPOINT, oldViewpoint == EVIRTUAL_NO_VALUE
					? VIEWPOINT_EDEFAULT
					: oldViewpoint, viewpoint));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MODEL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MODEL__OWNER :
				return getOwner();
			case UMLPackage.MODEL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MODEL__NAME :
				return getName();
			case UMLPackage.MODEL__VISIBILITY :
				return getVisibility();
			case UMLPackage.MODEL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MODEL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MODEL__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.MODEL__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.MODEL__MEMBER :
				return getMembers();
			case UMLPackage.MODEL__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.MODEL__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.MODEL__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.MODEL__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.MODEL__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.MODEL__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.MODEL__APPLIED_PROFILE :
				return getAppliedProfiles();
			case UMLPackage.MODEL__VIEWPOINT :
				return getViewpoint();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MODEL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.MODEL__APPLIED_PROFILE :
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection) newValue);
				return;
			case UMLPackage.MODEL__VIEWPOINT :
				setViewpoint((String) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MODEL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MODEL__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.MODEL__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.MODEL__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.MODEL__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.MODEL__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.MODEL__APPLIED_PROFILE :
				getAppliedProfiles().clear();
				return;
			case UMLPackage.MODEL__VIEWPOINT :
				setViewpoint(VIEWPOINT_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MODEL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MODEL__OWNER :
				return isSetOwner();
			case UMLPackage.MODEL__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.MODEL__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.MODEL__NAME :
				String name = (String) eVirtualGet(UMLPackage.MODEL__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.MODEL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.MODEL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.MODEL__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.MODEL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MODEL__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.MODEL__NAME_EXPRESSION) != null;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.MODEL__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.MODEL__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.MODEL__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.MODEL__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.MODEL__MEMBER :
				return isSetMembers();
			case UMLPackage.MODEL__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.MODEL__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.MODEL__TEMPLATE_PARAMETER) != null;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.MODEL__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				List packageMerge = (List) eVirtualGet(UMLPackage.MODEL__PACKAGE_MERGE);
				return packageMerge != null && !packageMerge.isEmpty();
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				List packagedElement = (List) eVirtualGet(UMLPackage.MODEL__PACKAGED_ELEMENT);
				return packagedElement != null && !packagedElement.isEmpty();
			case UMLPackage.MODEL__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.MODEL__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.MODEL__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.MODEL__APPLIED_PROFILE :
				List appliedProfile = (List) eVirtualGet(UMLPackage.MODEL__APPLIED_PROFILE);
				return appliedProfile != null && !appliedProfile.isEmpty();
			case UMLPackage.MODEL__VIEWPOINT :
				String viewpoint = (String) eVirtualGet(
					UMLPackage.MODEL__VIEWPOINT, VIEWPOINT_EDEFAULT);
				return VIEWPOINT_EDEFAULT == null
					? viewpoint != null
					: !VIEWPOINT_EDEFAULT.equals(viewpoint);
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (viewpoint: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.MODEL__VIEWPOINT,
			VIEWPOINT_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //ModelImpl
