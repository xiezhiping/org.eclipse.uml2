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
 * $Id: PackageMergeImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageMergeImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageMergeImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageMergeImpl#getMergedPackage <em>Merged Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageMergeImpl#getReceivingPackage <em>Receiving Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMergeImpl
		extends DirectedRelationshipImpl
		implements PackageMerge {

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
		return UMLPackage.eINSTANCE.getPackageMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.PACKAGE_MERGE__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.PACKAGE_MERGE__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PACKAGE_MERGE__TARGET,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getPackageMerge_MergedPackage()}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.PACKAGE_MERGE__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.PACKAGE_MERGE__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PACKAGE_MERGE__SOURCE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getPackageMerge_ReceivingPackage()}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getMergedPackage() {
		org.eclipse.uml2.uml.Package mergedPackage = (org.eclipse.uml2.uml.Package) eVirtualGet(UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE);
		if (mergedPackage != null && mergedPackage.eIsProxy()) {
			InternalEObject oldMergedPackage = (InternalEObject) mergedPackage;
			mergedPackage = (org.eclipse.uml2.uml.Package) eResolveProxy(oldMergedPackage);
			if (mergedPackage != oldMergedPackage) {
				eVirtualSet(UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE,
					mergedPackage);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE,
						oldMergedPackage, mergedPackage));
			}
		}
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetMergedPackage() {
		return (org.eclipse.uml2.uml.Package) eVirtualGet(UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage(org.eclipse.uml2.uml.Package newMergedPackage) {
		org.eclipse.uml2.uml.Package mergedPackage = newMergedPackage;
		Object oldMergedPackage = eVirtualSet(
			UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE, mergedPackage);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE,
				oldMergedPackage == EVIRTUAL_NO_VALUE
					? null
					: oldMergedPackage, mergedPackage));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getReceivingPackage() {
		if (eContainerFeatureID != UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE)
			return null;
		return (org.eclipse.uml2.uml.Package) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingPackage(
			org.eclipse.uml2.uml.Package newReceivingPackage) {
		if (newReceivingPackage != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE && newReceivingPackage != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newReceivingPackage))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReceivingPackage != null)
				msgs = ((InternalEObject) newReceivingPackage).eInverseAdd(
					this, UMLPackage.PACKAGE__PACKAGE_MERGE,
					org.eclipse.uml2.uml.Package.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newReceivingPackage,
				UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE,
				newReceivingPackage, newReceivingPackage));

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
				case UMLPackage.PACKAGE_MERGE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, msgs);
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
				case UMLPackage.PACKAGE_MERGE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE_MERGE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
					return eBasicSetContainer(null,
						UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, msgs);
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
				case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.PACKAGE__PACKAGE_MERGE,
						org.eclipse.uml2.uml.Package.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PACKAGE_MERGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PACKAGE_MERGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PACKAGE_MERGE__OWNER :
				return getOwner();
			case UMLPackage.PACKAGE_MERGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PACKAGE_MERGE__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.PACKAGE_MERGE__SOURCE :
				return getSources();
			case UMLPackage.PACKAGE_MERGE__TARGET :
				return getTargets();
			case UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE :
				if (resolve)
					return getMergedPackage();
				return basicGetMergedPackage();
			case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
				return getReceivingPackage();
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
			case UMLPackage.PACKAGE_MERGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE_MERGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE :
				setMergedPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
				setReceivingPackage((org.eclipse.uml2.uml.Package) newValue);
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
			case UMLPackage.PACKAGE_MERGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PACKAGE_MERGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE :
				setMergedPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
				setReceivingPackage((org.eclipse.uml2.uml.Package) null);
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
			case UMLPackage.PACKAGE_MERGE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PACKAGE_MERGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PACKAGE_MERGE__OWNER :
				return isSetOwner();
			case UMLPackage.PACKAGE_MERGE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PACKAGE_MERGE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PACKAGE_MERGE__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PACKAGE_MERGE__SOURCE :
				return isSetSources();
			case UMLPackage.PACKAGE_MERGE__TARGET :
				return isSetTargets();
			case UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE :
				return eVirtualGet(UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE) != null;
			case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
				return getReceivingPackage() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.eINSTANCE.getPackageMerge_MergedPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.eINSTANCE.getPackageMerge_ReceivingPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		org.eclipse.uml2.uml.Package receivingPackage = getReceivingPackage();
		if (receivingPackage != null) {
			return receivingPackage;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.eINSTANCE.getPackageMerge_ReceivingPackage());
	}

} //PackageMergeImpl
