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
 * $Id: ElementImportImpl.java,v 1.14 2006/11/14 18:02:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ElementImportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImportImpl
		extends DirectedRelationshipImpl
		implements ElementImport {

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
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The flag representing whether the Alias attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ALIAS_ESETFLAG = 1 << 8;

	/**
	 * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElement()
	 * @generated
	 * @ordered
	 */
	protected PackageableElement importedElement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ELEMENT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList targets = (EList) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
					targets = new DerivedUnionEObjectEList(Element.class, this,
						UMLPackage.ELEMENT_IMPORT__TARGET, TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.ELEMENT_IMPORT__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList sources = (EList) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
					sources = new DerivedUnionEObjectEList(Element.class, this,
						UMLPackage.ELEMENT_IMPORT__SOURCE, SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.ELEMENT_IMPORT__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {

		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ELEMENT_IMPORT__VISIBILITY, oldVisibility,
				visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {

		String oldAlias = alias;
		alias = newAlias;
		boolean oldAliasESet = (eFlags & ALIAS_ESETFLAG) != 0;
		eFlags |= ALIAS_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ELEMENT_IMPORT__ALIAS, oldAlias, alias,
				!oldAliasESet));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlias() {
		String oldAlias = alias;
		boolean oldAliasESet = (eFlags & ALIAS_ESETFLAG) != 0;
		alias = ALIAS_EDEFAULT;
		eFlags &= ~ALIAS_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.ELEMENT_IMPORT__ALIAS, oldAlias, ALIAS_EDEFAULT,
				oldAliasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlias() {
		return (eFlags & ALIAS_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedElement() {
		if (importedElement != null && importedElement.eIsProxy()) {
			InternalEObject oldImportedElement = (InternalEObject) importedElement;
			importedElement = (PackageableElement) eResolveProxy(oldImportedElement);
			if (importedElement != oldImportedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT,
						oldImportedElement, importedElement));
			}
		}
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement basicGetImportedElement() {
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedElement(PackageableElement newImportedElement) {

		PackageableElement oldImportedElement = importedElement;
		importedElement = newImportedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT,
				oldImportedElement, importedElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportingNamespace() {
		if (eContainerFeatureID != UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE)
			return null;
		return (Namespace) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetImportingNamespace() {
		if (eContainerFeatureID != UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE)
			return null;
		return (Namespace) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportingNamespace(
			Namespace newImportingNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newImportingNamespace,
			UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(Namespace newImportingNamespace) {

		if (newImportingNamespace != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE && newImportingNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newImportingNamespace))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingNamespace != null)
				msgs = ((InternalEObject) newImportingNamespace).eInverseAdd(
					this, UMLPackage.NAMESPACE__ELEMENT_IMPORT,
					Namespace.class, msgs);
			msgs = basicSetImportingNamespace(newImportingNamespace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE,
				newImportingNamespace, newImportingNamespace));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityPublicOrPrivate(
			DiagnosticChain diagnostics, Map context) {
		return ElementImportOperations.validateVisibilityPublicOrPrivate(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportedElementIsPublic(DiagnosticChain diagnostics,
			Map context) {
		return ElementImportOperations.validateImportedElementIsPublic(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return ElementImportOperations.getName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportingNamespace((Namespace) otherEnd, msgs);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				return basicSetImportingNamespace(null, msgs);
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
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				return eInternalContainer()
					.eInverseRemove(this, UMLPackage.NAMESPACE__ELEMENT_IMPORT,
						Namespace.class, msgs);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ELEMENT_IMPORT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ELEMENT_IMPORT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ELEMENT_IMPORT__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.ELEMENT_IMPORT__SOURCE :
				return getSources();
			case UMLPackage.ELEMENT_IMPORT__TARGET :
				return getTargets();
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				return getVisibility();
			case UMLPackage.ELEMENT_IMPORT__ALIAS :
				return getAlias();
			case UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT :
				if (resolve)
					return getImportedElement();
				return basicGetImportedElement();
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				if (resolve)
					return getImportingNamespace();
				return basicGetImportingNamespace();
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ELEMENT_IMPORT__ALIAS :
				setAlias((String) newValue);
				return;
			case UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT :
				setImportedElement((PackageableElement) newValue);
				return;
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				setImportingNamespace((Namespace) newValue);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ELEMENT_IMPORT__ALIAS :
				unsetAlias();
				return;
			case UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT :
				setImportedElement((PackageableElement) null);
				return;
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				setImportingNamespace((Namespace) null);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ELEMENT_IMPORT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ELEMENT_IMPORT__OWNER :
				return isSetOwner();
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ELEMENT_IMPORT__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.ELEMENT_IMPORT__SOURCE :
				return isSetSources();
			case UMLPackage.ELEMENT_IMPORT__TARGET :
				return isSetTargets();
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				return visibility != VISIBILITY_EDEFAULT;
			case UMLPackage.ELEMENT_IMPORT__ALIAS :
				return isSetAlias();
			case UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT :
				return importedElement != null;
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				return basicGetImportingNamespace() != null;
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
		result.append(" (visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(", alias: "); //$NON-NLS-1$
		if ((eFlags & ALIAS_ESETFLAG) != 0)
			result.append(alias);
		else
			result.append("<unset>"); //$NON-NLS-1$
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
	protected static final int[] TARGET_ESUBSETS = new int[]{UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[]{UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE};

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
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {

		Namespace importingNamespace = basicGetImportingNamespace();
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
			|| eIsSet(UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
	}

} //ElementImportImpl
