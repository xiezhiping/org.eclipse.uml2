/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ModelImpl.java,v 1.25 2006/04/10 20:40:19 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.ModelOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ModelImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends PackageImpl implements Model {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_EDEFAULT = ""; //$NON-NLS-1$

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
		return UML2Package.Literals.MODEL;
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
		newViewpoint = newViewpoint == null ? VIEWPOINT_EDEFAULT : newViewpoint;
		String oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MODEL__VIEWPOINT, oldViewpoint, viewpoint));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.MODEL__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.MODEL__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.MODEL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.MODEL__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.MODEL__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.MODEL__NAME:
				return getName();
			case UML2Package.MODEL__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.MODEL__VISIBILITY:
				return getVisibility();
			case UML2Package.MODEL__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.MODEL__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.MODEL__MEMBER:
				return getMembers();
			case UML2Package.MODEL__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.MODEL__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.MODEL__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.MODEL__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.MODEL__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.MODEL__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.MODEL__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.MODEL__NESTED_PACKAGE:
				return getNestedPackages();
			case UML2Package.MODEL__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case UML2Package.MODEL__OWNED_TYPE:
				return getOwnedTypes();
			case UML2Package.MODEL__OWNED_MEMBER:
				return getOwnedMembers();
			case UML2Package.MODEL__PACKAGE_MERGE:
				return getPackageMerges();
			case UML2Package.MODEL__APPLIED_PROFILE:
				return getAppliedProfiles();
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				return getPackageExtensions();
			case UML2Package.MODEL__VIEWPOINT:
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
			case UML2Package.MODEL__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.MODEL__NAME:
				setName((String)newValue);
				return;
			case UML2Package.MODEL__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.MODEL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.MODEL__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.MODEL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.MODEL__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.MODEL__OWNED_MEMBER:
				getOwnedMembers().clear();
				getOwnedMembers().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__PACKAGE_MERGE:
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				getPackageExtensions().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__VIEWPOINT:
				setViewpoint((String)newValue);
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
			case UML2Package.MODEL__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.MODEL__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.MODEL__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.MODEL__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.MODEL__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.MODEL__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.MODEL__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.MODEL__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.MODEL__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.MODEL__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.MODEL__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.MODEL__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.MODEL__OWNED_MEMBER:
				getOwnedMembers().clear();
				return;
			case UML2Package.MODEL__PACKAGE_MERGE:
				getPackageMerges().clear();
				return;
			case UML2Package.MODEL__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				return;
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				return;
			case UML2Package.MODEL__VIEWPOINT:
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
			case UML2Package.MODEL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.MODEL__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.MODEL__OWNER:
				return isSetOwner();
			case UML2Package.MODEL__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.MODEL__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.MODEL__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.MODEL__VISIBILITY:
				return isSetVisibility();
			case UML2Package.MODEL__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.MODEL__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.MODEL__MEMBER:
				return isSetMembers();
			case UML2Package.MODEL__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.MODEL__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.MODEL__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.MODEL__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.MODEL__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.MODEL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.MODEL__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.MODEL__NESTED_PACKAGE:
				return !getNestedPackages().isEmpty();
			case UML2Package.MODEL__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case UML2Package.MODEL__OWNED_TYPE:
				return !getOwnedTypes().isEmpty();
			case UML2Package.MODEL__OWNED_MEMBER:
				return isSetOwnedMembers();
			case UML2Package.MODEL__PACKAGE_MERGE:
				return packageMerges != null && !packageMerges.isEmpty();
			case UML2Package.MODEL__APPLIED_PROFILE:
				return appliedProfiles != null && !appliedProfiles.isEmpty();
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				return packageExtensions != null && !packageExtensions.isEmpty();
			case UML2Package.MODEL__VIEWPOINT:
				return VIEWPOINT_EDEFAULT == null ? viewpoint != null : !VIEWPOINT_EDEFAULT.equals(viewpoint);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (viewpoint: "); //$NON-NLS-1$
		result.append(viewpoint);
		result.append(')');
		return result.toString();
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Model#isLibrary()
	 */
	public boolean isLibrary() {
		return ModelOperations.isLibrary(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Model#isMetamodel()
	 */
	public boolean isMetamodel() {
		return ModelOperations.isMetamodel(this);
	}

	// <!-- end-custom-operations -->

} //ModelImpl
