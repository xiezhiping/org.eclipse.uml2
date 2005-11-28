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
 * $Id: PackageMergeImpl.java,v 1.17 2005/11/28 17:18:05 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.PackageMerge;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageMergeImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageMergeImpl#getTargets <em>Target</em>}</li>
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
		return UML2Package.Literals.PACKAGE_MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList)eVirtualGet(UML2Package.PACKAGE_MERGE__SOURCE);
		if (source == null) {
			eVirtualSet(UML2Package.PACKAGE_MERGE__SOURCE, source = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PACKAGE_MERGE__SOURCE, new int[] {UML2Package.PACKAGE_MERGE__MERGING_PACKAGE}));
		}
		return source;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.PACKAGE_MERGE__MERGING_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList)eVirtualGet(UML2Package.PACKAGE_MERGE__TARGET);
		if (target == null) {
			eVirtualSet(UML2Package.PACKAGE_MERGE__TARGET, target = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PACKAGE_MERGE__TARGET, new int[] {UML2Package.PACKAGE_MERGE__MERGED_PACKAGE}));
		}
		return target;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.PACKAGE_MERGE__MERGED_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getMergingPackage() {
		if (eContainerFeatureID != UML2Package.PACKAGE_MERGE__MERGING_PACKAGE) return null;
		return (org.eclipse.uml2.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergingPackage(org.eclipse.uml2.Package newMergingPackage) {
		if (newMergingPackage != eInternalContainer() || (eContainerFeatureID != UML2Package.PACKAGE_MERGE__MERGING_PACKAGE && newMergingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newMergingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
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
		org.eclipse.uml2.Package mergedPackage = (org.eclipse.uml2.Package)eVirtualGet(UML2Package.PACKAGE_MERGE__MERGED_PACKAGE);
		if (mergedPackage != null && mergedPackage.eIsProxy()) {
			InternalEObject oldMergedPackage = (InternalEObject)mergedPackage;
			mergedPackage = (org.eclipse.uml2.Package)eResolveProxy(oldMergedPackage);
			if (mergedPackage != oldMergedPackage) {
				eVirtualSet(UML2Package.PACKAGE_MERGE__MERGED_PACKAGE, mergedPackage);
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
		return (org.eclipse.uml2.Package)eVirtualGet(UML2Package.PACKAGE_MERGE__MERGED_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage(org.eclipse.uml2.Package newMergedPackage) {
		org.eclipse.uml2.Package mergedPackage = newMergedPackage;
		Object oldMergedPackage = eVirtualSet(UML2Package.PACKAGE_MERGE__MERGED_PACKAGE, mergedPackage);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage == EVIRTUAL_NO_VALUE ? null : oldMergedPackage, mergedPackage));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				return eBasicSetContainer(null, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, UML2Package.PACKAGE__PACKAGE_MERGE, org.eclipse.uml2.Package.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.PACKAGE_MERGE__MERGING_PACKAGE);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.PACKAGE_MERGE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PACKAGE_MERGE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PACKAGE_MERGE__OWNER:
				return isSetOwner();
			case UML2Package.PACKAGE_MERGE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PACKAGE_MERGE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PACKAGE_MERGE__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.PACKAGE_MERGE__SOURCE:
				return isSetSources();
			case UML2Package.PACKAGE_MERGE__TARGET:
				return isSetTargets();
			case UML2Package.PACKAGE_MERGE__MERGING_PACKAGE:
				return getMergingPackage() != null;
			case UML2Package.PACKAGE_MERGE__MERGED_PACKAGE:
				return eVirtualGet(UML2Package.PACKAGE_MERGE__MERGED_PACKAGE) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //PackageMergeImpl
