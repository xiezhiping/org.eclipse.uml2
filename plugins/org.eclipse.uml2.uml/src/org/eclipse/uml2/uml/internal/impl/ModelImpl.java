/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *
 * $Id: ModelImpl.java,v 1.15 2008/04/21 16:32:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ModelOperations;

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
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String viewpoint = VIEWPOINT_EDEFAULT;

	/**
	 * The flag representing whether the Viewpoint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VIEWPOINT_ESETFLAG = 1 << 12;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		String oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		boolean oldViewpointESet = (eFlags & VIEWPOINT_ESETFLAG) != 0;
		eFlags |= VIEWPOINT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MODEL__VIEWPOINT, oldViewpoint, viewpoint,
				!oldViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewpoint() {
		String oldViewpoint = viewpoint;
		boolean oldViewpointESet = (eFlags & VIEWPOINT_ESETFLAG) != 0;
		viewpoint = VIEWPOINT_EDEFAULT;
		eFlags &= ~VIEWPOINT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.MODEL__VIEWPOINT, oldViewpoint, VIEWPOINT_EDEFAULT,
				oldViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewpoint() {
		return (eFlags & VIEWPOINT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetamodel() {
		return ModelOperations.isMetamodel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MODEL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MODEL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
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
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.MODEL__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.MODEL__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.MODEL__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.MODEL__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				return getProfileApplications();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.MODEL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.MODEL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MODEL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.MODEL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.MODEL__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll(
					(Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.MODEL__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection<? extends Type>) newValue);
				return;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges().addAll(
					(Collection<? extends PackageMerge>) newValue);
				return;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll(
					(Collection<? extends PackageableElement>) newValue);
				return;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages()
					.addAll(
						(Collection<? extends org.eclipse.uml2.uml.Package>) newValue);
				return;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				getProfileApplications().clear();
				getProfileApplications().addAll(
					(Collection<? extends ProfileApplication>) newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MODEL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MODEL__NAME :
				unsetName();
				return;
			case UMLPackage.MODEL__VISIBILITY :
				unsetVisibility();
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
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.MODEL__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				getProfileApplications().clear();
				return;
			case UMLPackage.MODEL__VIEWPOINT :
				unsetViewpoint();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MODEL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MODEL__OWNER :
				return isSetOwner();
			case UMLPackage.MODEL__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.MODEL__NAME :
				return isSetName();
			case UMLPackage.MODEL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.MODEL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.MODEL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MODEL__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.MODEL__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.MODEL__MEMBER :
				return isSetMembers();
			case UMLPackage.MODEL__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.MODEL__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.MODEL__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.MODEL__PACKAGE_MERGE :
				return packageMerges != null && !packageMerges.isEmpty();
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				return packagedElements != null && !packagedElements.isEmpty();
			case UMLPackage.MODEL__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.MODEL__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				return profileApplications != null
					&& !profileApplications.isEmpty();
			case UMLPackage.MODEL__VIEWPOINT :
				return isSetViewpoint();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (viewpoint: "); //$NON-NLS-1$
		if ((eFlags & VIEWPOINT_ESETFLAG) != 0)
			result.append(viewpoint);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //ModelImpl
