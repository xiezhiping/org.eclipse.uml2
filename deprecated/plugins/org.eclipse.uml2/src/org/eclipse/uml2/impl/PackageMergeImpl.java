/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageMergeImpl.java,v 1.8 2005/06/15 20:06:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.PackageMerge;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageMergeImpl#getMergingPackage <em>Merging Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageMergeImpl#getMergedPackage <em>Merged Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMergeImpl extends DirectedRelationshipImpl implements PackageMerge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMergedPackage() <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.Package mergedPackage = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getPackageMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getMergingPackage() {
		if (eContainerFeatureID != UML2Package.PACKAGE_MERGE__MERGING_PACKAGE) return null;
		return (org.eclipse.uml2.Package)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergingPackage(org.eclipse.uml2.Package newMergingPackage) {
		if (newMergingPackage != eContainer || (eContainerFeatureID != UML2Package.PACKAGE_MERGE__MERGING_PACKAGE && newMergingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newMergingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMergingPackage != null)
				msgs = ((InternalEObject)newMergingPackage).eInverseAdd(this, UML2Package.PACKAGE__PACKAGE_MERGE, org.eclipse.uml2.Package.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newMergingPackage, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE, newMergingPackage, newMergingPackage));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getMergedPackage() {
		if (mergedPackage != null && mergedPackage.eIsProxy()) {
			org.eclipse.uml2.Package oldMergedPackage = mergedPackage;
			mergedPackage = (org.eclipse.uml2.Package)eResolveProxy((InternalEObject)mergedPackage);
			if (mergedPackage != oldMergedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
			}
		}
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package basicGetMergedPackage() {
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage(org.eclipse.uml2.Package newMergedPackage) {
		org.eclipse.uml2.Package oldMergedPackage = mergedPackage;
		mergedPackage = newMergedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		org.eclipse.uml2.Package mergingPackage = getMergingPackage();			
		if (mergingPackage != null) {
			return mergingPackage;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getTargetsHelper(EList target) {
		super.getTargetsHelper(target);
		if (eIsSet(UML2Package.eINSTANCE.getPackageMerge_MergedPackage())) {
			target.add(getMergedPackage());
		}
		return target;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE, msgs);
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
				case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
					return eBasicSetContainer(null, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE, msgs);
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
				case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
					return eContainer.eInverseRemove(this, UML2Package.PACKAGE__PACKAGE_MERGE, org.eclipse.uml2.Package.class, msgs);
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
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PACKAGE_MERGE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PACKAGE_MERGE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PACKAGE_MERGE__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.PACKAGE_MERGE__SOURCE:
				return getSources();
			case UML2Package.PACKAGE_MERGE__TARGET:
				return getTargets();
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				return getMergingPackage();
			case UML2Package.PACKAGE_MERGE__MERGED_PACKAGE:
				if (resolve) return getMergedPackage();
				return basicGetMergedPackage();
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
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				setMergingPackage((org.eclipse.uml2.Package)newValue);
				return;
			case UML2Package.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((org.eclipse.uml2.Package)newValue);
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
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				setMergingPackage((org.eclipse.uml2.Package)null);
				return;
			case UML2Package.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((org.eclipse.uml2.Package)null);
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
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PACKAGE_MERGE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.PACKAGE_MERGE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PACKAGE_MERGE__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.PACKAGE_MERGE__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.PACKAGE_MERGE__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				return getMergingPackage() != null;
			case UML2Package.PACKAGE_MERGE__MERGED_PACKAGE:
				return mergedPackage != null;
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSourcesHelper(EList source) {
		super.getSourcesHelper(source);
		org.eclipse.uml2.Package mergingPackage = getMergingPackage();
		if (mergingPackage != null) {
			source.add(mergingPackage);
		}
		return source;
	}


} //PackageMergeImpl
