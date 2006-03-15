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
 * $Id: ProfileApplicationImpl.java,v 1.15 2006/03/15 19:34:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROFILE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList) eVirtualGet(UMLPackage.PROFILE_APPLICATION__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.PROFILE_APPLICATION__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PROFILE_APPLICATION__TARGET,
					new int[]{UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList) eVirtualGet(UMLPackage.PROFILE_APPLICATION__SOURCE);
		if (source == null) {
			eVirtualSet(
				UMLPackage.PROFILE_APPLICATION__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PROFILE_APPLICATION__SOURCE,
					new int[]{UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile() {
		Profile appliedProfile = (Profile) eVirtualGet(UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE);
		if (appliedProfile != null && appliedProfile.eIsProxy()) {
			InternalEObject oldAppliedProfile = (InternalEObject) appliedProfile;
			appliedProfile = (Profile) eResolveProxy(oldAppliedProfile);
			if (appliedProfile != oldAppliedProfile) {
				eVirtualSet(UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE,
					appliedProfile);
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
		return (Profile) eVirtualGet(UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedProfile(Profile newAppliedProfile) {
		Profile appliedProfile = newAppliedProfile;
		Object oldAppliedProfile = eVirtualSet(
			UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE, appliedProfile);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE,
				oldAppliedProfile == EVIRTUAL_NO_VALUE
					? null
					: oldAppliedProfile, appliedProfile));

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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.PROFILE_APPLICATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROFILE_APPLICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROFILE_APPLICATION__OWNER :
				return isSetOwner();
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PROFILE_APPLICATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PROFILE_APPLICATION__SOURCE :
				return isSetSources();
			case UMLPackage.PROFILE_APPLICATION__TARGET :
				return isSetTargets();
			case UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE :
				return eVirtualGet(UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE) != null;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
	}

} //ProfileApplicationImpl
