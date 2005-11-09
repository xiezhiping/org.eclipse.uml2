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
 * $Id: ElementImportImpl.java,v 1.15 2005/11/09 22:53:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.ElementImportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImportImpl extends DirectedRelationshipImpl implements ElementImport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	protected static final String ALIAS_EDEFAULT = ""; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getElementImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		if (target == null) {
			target = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ELEMENT_IMPORT__TARGET, new EStructuralFeature[] {UML2Package.eINSTANCE.getElementImport_ImportedElement()});
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
			|| eIsSet(UML2Package.eINSTANCE.getElementImport_ImportedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		if (source == null) {
			source = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ELEMENT_IMPORT__SOURCE, new EStructuralFeature[] {UML2Package.eINSTANCE.getElementImport_ImportingNamespace()});
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
			|| eIsSet(UML2Package.eINSTANCE.getElementImport_ImportingNamespace());
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
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ELEMENT_IMPORT__VISIBILITY, oldVisibility, visibility));

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
		newAlias = newAlias == null ? ALIAS_EDEFAULT : newAlias;
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ELEMENT_IMPORT__ALIAS, oldAlias, alias));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedElement() {
		if (importedElement != null && importedElement.eIsProxy()) {
			PackageableElement oldImportedElement = importedElement;
			importedElement = (PackageableElement)eResolveProxy((InternalEObject)importedElement);
			if (importedElement != oldImportedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ELEMENT_IMPORT__IMPORTED_ELEMENT, oldImportedElement, importedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ELEMENT_IMPORT__IMPORTED_ELEMENT, oldImportedElement, importedElement));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportingNamespace() {
		if (eContainerFeatureID != UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE) return null;
		return (Namespace)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(Namespace newImportingNamespace) {
		if (newImportingNamespace != eContainer || (eContainerFeatureID != UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE && newImportingNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newImportingNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingNamespace != null)
				msgs = ((InternalEObject)newImportingNamespace).eInverseAdd(this, UML2Package.NAMESPACE__ELEMENT_IMPORT, Namespace.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newImportingNamespace, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE, newImportingNamespace, newImportingNamespace));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityPublicOrPrivate(DiagnosticChain diagnostics, Map context) {
		return ElementImportOperations.validateVisibilityPublicOrPrivate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportedElementIsPublic(DiagnosticChain diagnostics, Map context) {
		return ElementImportOperations.validateImportedElementIsPublic(this, diagnostics, context);
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
			|| eIsSet(UML2Package.eINSTANCE.getElementImport_ImportingNamespace());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ELEMENT_IMPORT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE, msgs);
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
				case UML2Package.ELEMENT_IMPORT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ELEMENT_IMPORT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
					return eBasicSetContainer(null, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE, msgs);
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
				case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
					return eContainer.eInverseRemove(this, UML2Package.NAMESPACE__ELEMENT_IMPORT, Namespace.class, msgs);
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
			case UML2Package.ELEMENT_IMPORT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ELEMENT_IMPORT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ELEMENT_IMPORT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ELEMENT_IMPORT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ELEMENT_IMPORT__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.ELEMENT_IMPORT__SOURCE:
				return getSources();
			case UML2Package.ELEMENT_IMPORT__TARGET:
				return getTargets();
			case UML2Package.ELEMENT_IMPORT__VISIBILITY:
				return getVisibility();
			case UML2Package.ELEMENT_IMPORT__ALIAS:
				return getAlias();
			case UML2Package.ELEMENT_IMPORT__IMPORTED_ELEMENT:
				if (resolve) return getImportedElement();
				return basicGetImportedElement();
			case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
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
			case UML2Package.ELEMENT_IMPORT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ELEMENT_IMPORT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ELEMENT_IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ELEMENT_IMPORT__ALIAS:
				setAlias((String)newValue);
				return;
			case UML2Package.ELEMENT_IMPORT__IMPORTED_ELEMENT:
				setImportedElement((PackageableElement)newValue);
				return;
			case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)newValue);
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
			case UML2Package.ELEMENT_IMPORT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ELEMENT_IMPORT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ELEMENT_IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ELEMENT_IMPORT__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case UML2Package.ELEMENT_IMPORT__IMPORTED_ELEMENT:
				setImportedElement((PackageableElement)null);
				return;
			case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)null);
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
			case UML2Package.ELEMENT_IMPORT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ELEMENT_IMPORT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ELEMENT_IMPORT__OWNER:
				return isSetOwner();
			case UML2Package.ELEMENT_IMPORT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ELEMENT_IMPORT__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.ELEMENT_IMPORT__SOURCE:
				return isSetSources();
			case UML2Package.ELEMENT_IMPORT__TARGET:
				return isSetTargets();
			case UML2Package.ELEMENT_IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ELEMENT_IMPORT__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case UML2Package.ELEMENT_IMPORT__IMPORTED_ELEMENT:
				return importedElement != null;
			case UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(", alias: "); //$NON-NLS-1$
		result.append(alias);
		result.append(')');
		return result.toString();
	}


} //ElementImportImpl
