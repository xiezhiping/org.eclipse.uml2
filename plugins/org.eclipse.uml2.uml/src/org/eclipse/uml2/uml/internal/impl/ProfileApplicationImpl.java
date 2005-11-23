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
 * $Id: ProfileApplicationImpl.java,v 1.3 2005/11/23 13:27:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#getImportedProfile <em>Imported Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileApplicationImpl#isStrict <em>Is Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl
		extends PackageImportImpl
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
		return UMLPackage.eINSTANCE.getProfileApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getImportedPackage() {
		org.eclipse.uml2.uml.Package importedPackage = (org.eclipse.uml2.uml.Package) eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE);
		if (importedPackage != null && importedPackage.eIsProxy()) {
			InternalEObject oldImportedPackage = (InternalEObject) importedPackage;
			importedPackage = (org.eclipse.uml2.uml.Package) eResolveProxy(oldImportedPackage);
			if (importedPackage != oldImportedPackage) {
				eVirtualSet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE,
					importedPackage);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE,
						oldImportedPackage, importedPackage));
			}
		}
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetImportedPackage() {
		return (org.eclipse.uml2.uml.Package) eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage(
			org.eclipse.uml2.uml.Package newImportedPackage) {
		org.eclipse.uml2.uml.Package importedPackage = newImportedPackage;
		Object oldImportedPackage = eVirtualSet(
			UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE, importedPackage);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE,
				oldImportedPackage == EVIRTUAL_NO_VALUE
					? null
					: oldImportedPackage, importedPackage));

		if (eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE) != null
			&& eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE) != newImportedPackage) {
			setImportedProfile(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getImportedProfile() {
		Profile importedProfile = (Profile) eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE);
		if (importedProfile != null && importedProfile.eIsProxy()) {
			InternalEObject oldImportedProfile = (InternalEObject) importedProfile;
			importedProfile = (Profile) eResolveProxy(oldImportedProfile);
			if (importedProfile != oldImportedProfile) {
				eVirtualSet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE,
					importedProfile);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE,
						oldImportedProfile, importedProfile));
			}
		}
		return importedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetImportedProfile() {
		return (Profile) eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedProfile(Profile newImportedProfile) {
		Profile importedProfile = newImportedProfile;
		Object oldImportedProfile = eVirtualSet(
			UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE, importedProfile);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE,
				oldImportedProfile == EVIRTUAL_NO_VALUE
					? null
					: oldImportedProfile, importedProfile));

		if (newImportedProfile != null
			|| oldImportedProfile == eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE)) {
			setImportedPackage(newImportedProfile);
		}
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PROFILE_APPLICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROFILE_APPLICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROFILE_APPLICATION__OWNER :
				return getOwner();
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROFILE_APPLICATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.PROFILE_APPLICATION__SOURCE :
				return getSources();
			case UMLPackage.PROFILE_APPLICATION__TARGET :
				return getTargets();
			case UMLPackage.PROFILE_APPLICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE :
				if (resolve)
					return getImportedPackage();
				return basicGetImportedPackage();
			case UMLPackage.PROFILE_APPLICATION__IMPORTING_NAMESPACE :
				return getImportingNamespace();
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE :
				if (resolve)
					return getImportedProfile();
				return basicGetImportedProfile();
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				return isStrict()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.PROFILE_APPLICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE :
				setImportedPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__IMPORTING_NAMESPACE :
				setImportingNamespace((Namespace) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE :
				setImportedProfile((Profile) newValue);
				return;
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				setIsStrict(((Boolean) newValue).booleanValue());
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
			case UMLPackage.PROFILE_APPLICATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE :
				setImportedPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PROFILE_APPLICATION__IMPORTING_NAMESPACE :
				setImportingNamespace((Namespace) null);
				return;
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE :
				setImportedProfile((Profile) null);
				return;
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				setIsStrict(IS_STRICT_EDEFAULT);
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROFILE_APPLICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROFILE_APPLICATION__OWNER :
				return isSetOwner();
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PROFILE_APPLICATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PROFILE_APPLICATION__SOURCE :
				return isSetSources();
			case UMLPackage.PROFILE_APPLICATION__TARGET :
				return isSetTargets();
			case UMLPackage.PROFILE_APPLICATION__VISIBILITY :
				return eVirtualGet(UMLPackage.PROFILE_APPLICATION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE :
				return eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PACKAGE) != null;
			case UMLPackage.PROFILE_APPLICATION__IMPORTING_NAMESPACE :
				return getImportingNamespace() != null;
			case UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE :
				return eVirtualGet(UMLPackage.PROFILE_APPLICATION__IMPORTED_PROFILE) != null;
			case UMLPackage.PROFILE_APPLICATION__IS_STRICT :
				return ((eFlags & IS_STRICT_EFLAG) != 0) != IS_STRICT_EDEFAULT;
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

} //ProfileApplicationImpl
