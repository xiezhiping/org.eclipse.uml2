/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ModelImpl.java,v 1.5 2004/05/25 20:05:05 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getModel();
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
		viewpoint = newViewpoint == null ? VIEWPOINT_EDEFAULT : newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MODEL__VIEWPOINT, oldViewpoint, viewpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.MODEL__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.MODEL__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.MODEL__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.MODEL__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.MODEL__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.MODEL__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.MODEL__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.MODEL__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.MODEL__OWNING_PARAMETER, msgs);
				case UML2Package.MODEL__PACKAGE_MERGE:
					return ((InternalEList)getPackageMerges()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.MODEL__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.MODEL__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.MODEL__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.MODEL__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.MODEL__OWNING_PARAMETER, msgs);
				case UML2Package.MODEL__OWNED_MEMBER:
					return ((InternalEList)getOwnedMembers()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__PACKAGE_MERGE:
					return ((InternalEList)getPackageMerges()).basicRemove(otherEnd, msgs);
				case UML2Package.MODEL__PACKAGE_EXTENSION:
					return ((InternalEList)getPackageExtensions()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
				case UML2Package.MODEL__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				return getPackageExtensions();
			case UML2Package.MODEL__APPLIED_PROFILE:
				return getAppliedProfiles();
			case UML2Package.MODEL__VIEWPOINT:
				return getViewpoint();
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
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				getPackageExtensions().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection)newValue);
				return;
			case UML2Package.MODEL__VIEWPOINT:
				setViewpoint((String)newValue);
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
				setOwningParameter(null);
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
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				return;
			case UML2Package.MODEL__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				return;
			case UML2Package.MODEL__VIEWPOINT:
				setViewpoint(VIEWPOINT_EDEFAULT);
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
			case UML2Package.MODEL__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.MODEL__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.MODEL__OWNER:
				return basicGetOwner() != null;
			case UML2Package.MODEL__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.MODEL__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.MODEL__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.MODEL__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.MODEL__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.MODEL__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.MODEL__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.MODEL__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.MODEL__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.MODEL__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.MODEL__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.MODEL__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.MODEL__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.MODEL__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.MODEL__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.MODEL__NESTED_PACKAGE:
				return !getNestedPackages().isEmpty();
			case UML2Package.MODEL__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case UML2Package.MODEL__OWNED_TYPE:
				return !getOwnedTypes().isEmpty();
			case UML2Package.MODEL__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case UML2Package.MODEL__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case UML2Package.MODEL__PACKAGE_EXTENSION:
				return packageExtension != null && !packageExtension.isEmpty();
			case UML2Package.MODEL__APPLIED_PROFILE:
				return appliedProfile != null && !appliedProfile.isEmpty();
			case UML2Package.MODEL__VIEWPOINT:
				return VIEWPOINT_EDEFAULT == null ? viewpoint != null : !VIEWPOINT_EDEFAULT.equals(viewpoint);
		}
		return eDynamicIsSet(eFeature);
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
