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
 * $Id: TypeImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends PackageableElementImpl implements Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Package</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public org.eclipse.uml2.Package getPackage() {
		org.eclipse.uml2.Package package_ = basicGetPackage();
		return package_ == null ? null : (org.eclipse.uml2.Package)eResolveProxy((InternalEObject)package_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Package</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getNamespace}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public org.eclipse.uml2.Package basicGetPackageGen() {
		// TODO: implement this derived basic getter to return the 'Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public org.eclipse.uml2.Package basicGetPackage() {
		// TODO: test this redefined basic getter
		return org.eclipse.uml2.Package.class.isInstance(eContainer) ? (org.eclipse.uml2.Package) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.eclipse.uml2.Package newPackage, NotificationChain msgs) {
		// TODO: test this derived basic setter
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.TypeOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Namespace</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Namespace#getOwnedMembers <em>Owned Member</em>}'.
	 * @generated
	 */
	public Namespace getNamespace() {
		// TODO: test this union getter
		if (null != getPackage()) {
			return (Namespace) getPackage();
		}
		return super.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.TYPE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.TYPE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.TYPE__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.TYPE__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.TYPE__OWNING_PARAMETER, msgs);
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
				case UML2Package.TYPE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.TYPE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.TYPE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.TYPE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.TYPE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.TYPE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.TYPE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.TYPE__OWNING_PARAMETER, msgs);
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
				case UML2Package.TYPE__OWNING_PARAMETER:
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
			case UML2Package.TYPE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TYPE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TYPE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TYPE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TYPE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TYPE__NAME:
				return getName();
			case UML2Package.TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TYPE__VISIBILITY:
				return getVisibility();
			case UML2Package.TYPE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TYPE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TYPE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.TYPE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case UML2Package.TYPE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TYPE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.TYPE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.TYPE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.TYPE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.TYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.TYPE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
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
			case UML2Package.TYPE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TYPE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TYPE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.TYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.TYPE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.TYPE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.TYPE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.TYPE__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
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
			case UML2Package.TYPE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TYPE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.TYPE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.TYPE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TYPE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TYPE__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.TYPE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.TYPE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.TYPE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.TYPE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.TYPE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.TYPE__PACKAGE:
				return basicGetPackage() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Type#createAssociation(boolean, org.eclipse.uml2.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.Type, boolean, org.eclipse.uml2.AggregationKind, java.lang.String, int, int)
	 */
	public Association createAssociation(
		boolean thisEndIsNavigable,
		AggregationKind thisEndAggregation,
		String thisEndName,
		int thisEndLowerBound,
		int thisEndUpperBound,
		Type otherType,
		boolean otherEndIsNavigable,
		AggregationKind otherEndAggregation,
		String otherEndName,
		int otherEndLowerBound,
		int otherEndUpperBound) {

		return TypeOperations.createAssociation(
			this,
			thisEndIsNavigable,
			thisEndAggregation,
			thisEndName,
			thisEndLowerBound,
			thisEndUpperBound,
			otherType,
			otherEndIsNavigable,
			otherEndAggregation,
			otherEndName,
			otherEndLowerBound,
			otherEndUpperBound);
	}

	// <!-- end-custom-operations -->

} //TypeImpl
