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
 * $Id: PackageImportImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PackageImportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImportImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImportImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImportImpl
		extends DirectedRelationshipImpl
		implements PackageImport {

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getPackageImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.PACKAGE_IMPORT__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.PACKAGE_IMPORT__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PACKAGE_IMPORT__TARGET,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getPackageImport_ImportedPackage()}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.PACKAGE_IMPORT__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.PACKAGE_IMPORT__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PACKAGE_IMPORT__SOURCE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getPackageImport_ImportingNamespace()}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		VisibilityKind visibility = (VisibilityKind) eVirtualGet(UMLPackage.PACKAGE_IMPORT__VISIBILITY);
		return visibility == null
			? VISIBILITY_EDEFAULT
			: visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		Object oldVisibility = eVirtualSet(
			UMLPackage.PACKAGE_IMPORT__VISIBILITY, visibility);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE_IMPORT__VISIBILITY,
				oldVisibility == EVIRTUAL_NO_VALUE
					? VISIBILITY_EDEFAULT
					: oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getImportedPackage() {
		org.eclipse.uml2.uml.Package importedPackage = (org.eclipse.uml2.uml.Package) eVirtualGet(UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE);
		if (importedPackage != null && importedPackage.eIsProxy()) {
			org.eclipse.uml2.uml.Package oldImportedPackage = importedPackage;
			importedPackage = (org.eclipse.uml2.uml.Package) eResolveProxy((InternalEObject) importedPackage);
			if (importedPackage != oldImportedPackage) {
				eVirtualSet(UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE,
					importedPackage);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE,
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
		return (org.eclipse.uml2.uml.Package) eVirtualGet(UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE);
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
			UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, importedPackage);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE,
				oldImportedPackage == EVIRTUAL_NO_VALUE
					? null
					: oldImportedPackage, importedPackage));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportingNamespace() {
		if (eContainerFeatureID != UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE)
			return null;
		return (Namespace) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(Namespace newImportingNamespace) {
		if (newImportingNamespace != eContainer
			|| (eContainerFeatureID != UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE && newImportingNamespace != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newImportingNamespace))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingNamespace != null)
				msgs = ((InternalEObject) newImportingNamespace).eInverseAdd(
					this, UMLPackage.NAMESPACE__PACKAGE_IMPORT,
					Namespace.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newImportingNamespace,
				UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE,
				newImportingNamespace, newImportingNamespace));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicOrPrivate(DiagnosticChain diagnostics,
			Map context) {
		return PackageImportOperations.validatePublicOrPrivate(this,
			diagnostics, context);
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
				case UMLPackage.PACKAGE_IMPORT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PACKAGE_IMPORT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
					return eBasicSetContainer(null,
						UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE, msgs);
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
				case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
					return eContainer.eInverseRemove(this,
						UMLPackage.NAMESPACE__PACKAGE_IMPORT, Namespace.class,
						msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PACKAGE_IMPORT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PACKAGE_IMPORT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PACKAGE_IMPORT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PACKAGE_IMPORT__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.PACKAGE_IMPORT__SOURCE :
				return getSources();
			case UMLPackage.PACKAGE_IMPORT__TARGET :
				return getTargets();
			case UMLPackage.PACKAGE_IMPORT__VISIBILITY :
				return getVisibility();
			case UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE :
				if (resolve)
					return getImportedPackage();
				return basicGetImportedPackage();
			case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
				return getImportingNamespace();
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
			case UMLPackage.PACKAGE_IMPORT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE_IMPORT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE :
				setImportedPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
				setImportingNamespace((Namespace) newValue);
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
			case UMLPackage.PACKAGE_IMPORT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PACKAGE_IMPORT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE :
				setImportedPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
				setImportingNamespace((Namespace) null);
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
			case UMLPackage.PACKAGE_IMPORT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PACKAGE_IMPORT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PACKAGE_IMPORT__OWNER :
				return isSetOwner();
			case UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PACKAGE_IMPORT__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PACKAGE_IMPORT__SOURCE :
				return isSetSources();
			case UMLPackage.PACKAGE_IMPORT__TARGET :
				return isSetTargets();
			case UMLPackage.PACKAGE_IMPORT__VISIBILITY :
				return eVirtualIsSet(UMLPackage.PACKAGE_IMPORT__VISIBILITY)
					&& eVirtualGet(UMLPackage.PACKAGE_IMPORT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE :
				return eVirtualGet(UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE) != null;
			case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
				return getImportingNamespace() != null;
		}
		return eDynamicIsSet(eFeature);
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
		result.append(" (visibility: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.PACKAGE_IMPORT__VISIBILITY)
			? eVirtualGet(UMLPackage.PACKAGE_IMPORT__VISIBILITY)
			: VISIBILITY_EDEFAULT);
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
			|| eIsSet(UMLPackage.eINSTANCE.getPackageImport_ImportedPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.eINSTANCE
				.getPackageImport_ImportingNamespace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Namespace importingNamespace = getImportingNamespace();
		if (importingNamespace != null) {
			return importingNamespace;
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
			|| eIsSet(UMLPackage.eINSTANCE
				.getPackageImport_ImportingNamespace());
	}

} //PackageImportImpl
