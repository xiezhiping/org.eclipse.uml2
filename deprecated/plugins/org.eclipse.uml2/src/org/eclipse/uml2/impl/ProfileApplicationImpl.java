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
 * $Id: ProfileApplicationImpl.java,v 1.17 2005/12/06 23:18:02 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProfileApplicationImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileApplicationImpl#getImportedProfile <em>Imported Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl extends PackageImportImpl implements ProfileApplication {
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
	protected ProfileApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.PROFILE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getImportedPackage() {
		org.eclipse.uml2.Package importedPackage = (org.eclipse.uml2.Package)eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE);
		if (importedPackage != null && importedPackage.eIsProxy()) {
			InternalEObject oldImportedPackage = (InternalEObject)importedPackage;
			importedPackage = (org.eclipse.uml2.Package)eResolveProxy(oldImportedPackage);
			if (importedPackage != oldImportedPackage) {
				eVirtualSet(UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE, importedPackage);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
			}
		}
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package basicGetImportedPackage() {
		return (org.eclipse.uml2.Package)eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getImportedProfile() {
		Profile importedProfile = (Profile)eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE);
		if (importedProfile != null && importedProfile.eIsProxy()) {
			InternalEObject oldImportedProfile = (InternalEObject)importedProfile;
			importedProfile = (Profile)eResolveProxy(oldImportedProfile);
			if (importedProfile != oldImportedProfile) {
				eVirtualSet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE, importedProfile);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE, oldImportedProfile, importedProfile));
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
		return (Profile)eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedProfile(Profile newImportedProfile) {
		Profile importedProfile = newImportedProfile;
		Object oldImportedProfile = eVirtualSet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE, importedProfile);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE, oldImportedProfile == EVIRTUAL_NO_VALUE ? null : oldImportedProfile, importedProfile));

		if (newImportedProfile != null || oldImportedProfile == eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE)) {
			setImportedPackage(newImportedProfile);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PROFILE_APPLICATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROFILE_APPLICATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROFILE_APPLICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROFILE_APPLICATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROFILE_APPLICATION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.PROFILE_APPLICATION__SOURCE:
				return getSources();
			case UML2Package.PROFILE_APPLICATION__TARGET:
				return getTargets();
			case UML2Package.PROFILE_APPLICATION__VISIBILITY:
				return getVisibility();
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE:
				if (resolve) return getImportedPackage();
				return basicGetImportedPackage();
			case UML2Package.PROFILE_APPLICATION__IMPORTING_NAMESPACE:
				return getImportingNamespace();
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				if (resolve) return getImportedProfile();
				return basicGetImportedProfile();
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
			case UML2Package.PROFILE_APPLICATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE_APPLICATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE_APPLICATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE:
				setImportedPackage((org.eclipse.uml2.Package)newValue);
				return;
			case UML2Package.PROFILE_APPLICATION__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)newValue);
				return;
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				setImportedProfile((Profile)newValue);
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
			case UML2Package.PROFILE_APPLICATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROFILE_APPLICATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROFILE_APPLICATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE:
				setImportedPackage((org.eclipse.uml2.Package)null);
				return;
			case UML2Package.PROFILE_APPLICATION__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)null);
				return;
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				setImportedProfile((Profile)null);
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
			case UML2Package.PROFILE_APPLICATION__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.PROFILE_APPLICATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROFILE_APPLICATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROFILE_APPLICATION__OWNER:
				return isSetOwner();
			case UML2Package.PROFILE_APPLICATION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PROFILE_APPLICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PROFILE_APPLICATION__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.PROFILE_APPLICATION__SOURCE:
				return isSetSources();
			case UML2Package.PROFILE_APPLICATION__TARGET:
				return isSetTargets();
			case UML2Package.PROFILE_APPLICATION__VISIBILITY:
				return eVirtualGet(UML2Package.PROFILE_APPLICATION__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE:
				return eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE) != null;
			case UML2Package.PROFILE_APPLICATION__IMPORTING_NAMESPACE:
				return getImportingNamespace() != null;
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				return eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE) != null;
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage(org.eclipse.uml2.Package newImportedPackage) {
		org.eclipse.uml2.Package importedPackage = newImportedPackage;
		Object oldImportedPackage = eVirtualSet(UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE, importedPackage);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROFILE_APPLICATION__IMPORTED_PACKAGE, oldImportedPackage == EVIRTUAL_NO_VALUE ? null : oldImportedPackage, importedPackage));

		if (eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE) != null && eVirtualGet(UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE) != newImportedPackage) {
			setImportedProfile(null);
		}
	}


} //ProfileApplicationImpl
