/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProfileApplicationImpl.java,v 1.20 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ProfileApplicationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#isStrict <em>Is Strict</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getApplyingPackage <em>Applying Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl
		extends DirectedRelationshipImpl
		implements ProfileApplication {

	/**
	 * The cached value of the '{@link #getAppliedProfile() <em>Applied Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile appliedProfile = null;

	/**
	 * The default value of the '{@link #isStrict() <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRICT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isStrict() <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_STRICT_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROFILE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargets() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> targets = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache
					.put(eResource, this,
						UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
						targets = new DerivedUnionEObjectEList<Element>(
							Element.class, this,
							UMLPackage.PROFILE_APPLICATION__TARGET,
							TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PROFILE_APPLICATION__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSources() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> sources = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache
					.put(eResource, this,
						UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
						sources = new DerivedUnionEObjectEList<Element>(
							Element.class, this,
							UMLPackage.PROFILE_APPLICATION__SOURCE,
							SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PROFILE_APPLICATION__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile() {
		if (appliedProfile != null && appliedProfile.eIsProxy()) {
			InternalEObject oldAppliedProfile = (InternalEObject) appliedProfile;
			appliedProfile = (Profile) eResolveProxy(oldAppliedProfile);
			if (appliedProfile != oldAppliedProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE,
						oldAppliedProfile, appliedProfile));
			}
		}
		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetAppliedProfile() {
		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedProfile(Profile newAppliedProfile) {

		Profile oldAppliedProfile = appliedProfile;
		appliedProfile = newAppliedProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE,
				oldAppliedProfile, appliedProfile));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		return (eFlags & IS_STRICT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrict(boolean newIsStrict) {

		boolean oldIsStrict = (eFlags & IS_STRICT_EFLAG) != 0;
		if (newIsStrict)
			eFlags |= IS_STRICT_EFLAG;
		else
			eFlags &= ~IS_STRICT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROFILE_APPLICATION__IS_STRICT, oldIsStrict,
				newIsStrict));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getApplyingPackage() {
		if (eContainerFeatureID != UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE)
			return null;
		return (org.eclipse.uml2.uml.Package) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetApplyingPackage() {
		if (eContainerFeatureID != UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE)
			return null;
		return (org.eclipse.uml2.uml.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplyingPackage(
			org.eclipse.uml2.uml.Package newApplyingPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newApplyingPackage,
			UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyingPackage(
			org.eclipse.uml2.uml.Package newApplyingPackage) {

		if (newApplyingPackage != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE && newApplyingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newApplyingPackage))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplyingPackage != null)
				msgs = ((InternalEObject) newApplyingPackage).eInverseAdd(this,
					UMLPackage.PACKAGE__PROFILE_APPLICATION,
					org.eclipse.uml2.uml.Package.class, msgs);
			msgs = basicSetApplyingPackage(newApplyingPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE,
				newApplyingPackage, newApplyingPackage));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getAppliedDefinition() {
		return ProfileApplicationOperations.getAppliedDefinition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement getAppliedDefinition(NamedElement namedElement) {
		return ProfileApplicationOperations.getAppliedDefinition(this,
			namedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplyingPackage(
					(org.eclipse.uml2.uml.Package) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				return basicSetApplyingPackage(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.PACKAGE__PROFILE_APPLICATION,
					org.eclipse.uml2.uml.Package.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROFILE_APPLICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROFILE_APPLICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROFILE_APPLICATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.PROFILE_APPLICATION__SOURCE :
				return getSources();
			case UMLPackage.PROFILE_APPLICATION__TARGET :
				return getTargets();
			case UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE :
				if (resolve)
					return getAppliedProfile();
				return basicGetAppliedProfile();
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				return isStrict()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				if (resolve)
					return getApplyingPackage();
				return basicGetApplyingPackage();
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
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE :
				setAppliedProfile((Profile) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				setIsStrict(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				setApplyingPackage((org.eclipse.uml2.uml.Package) newValue);
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
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE :
				setAppliedProfile((Profile) null);
				return;
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				setIsStrict(IS_STRICT_EDEFAULT);
				return;
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				setApplyingPackage((org.eclipse.uml2.uml.Package) null);
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
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROFILE_APPLICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROFILE_APPLICATION__OWNER :
				return isSetOwner();
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROFILE_APPLICATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PROFILE_APPLICATION__SOURCE :
				return isSetSources();
			case UMLPackage.PROFILE_APPLICATION__TARGET :
				return isSetTargets();
			case UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE :
				return appliedProfile != null;
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				return ((eFlags & IS_STRICT_EFLAG) != 0) != IS_STRICT_EDEFAULT;
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				return basicGetApplyingPackage() != null;
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
		result.append(" (isStrict: "); //$NON-NLS-1$
		result.append((eFlags & IS_STRICT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[]{UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[]{UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {

		org.eclipse.uml2.uml.Package applyingPackage = basicGetApplyingPackage();
		if (applyingPackage != null) {
			return applyingPackage;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
	}

} //ProfileApplicationImpl
