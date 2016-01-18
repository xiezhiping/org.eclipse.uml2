/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ElementImportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImportImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImportImpl
		extends DirectedRelationshipImpl
		implements ElementImport {

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
	protected PackageableElement importedElement;

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
	 * The offset of the flags representing the value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_EFLAG_OFFSET = 9;

	/**
	 * The flags representing the default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_EFLAG_DEFAULT = VISIBILITY_EDEFAULT
		.ordinal() << VISIBILITY_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link VisibilityKind Visibility Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final VisibilityKind[] VISIBILITY_EFLAG_VALUES = VisibilityKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBILITY_EFLAG = 0x3 << VISIBILITY_EFLAG_OFFSET;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ELEMENT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> targets = (EList<Element>) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
					targets = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.ELEMENT_IMPORT__TARGET,
						TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ELEMENT_IMPORT__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> sources = (EList<Element>) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
					sources = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.ELEMENT_IMPORT__SOURCE,
						SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ELEMENT_IMPORT__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET];
		if (newVisibility == null)
			newVisibility = VISIBILITY_EDEFAULT;
		eFlags = eFlags & ~VISIBILITY_EFLAG
			| newVisibility.ordinal() << VISIBILITY_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ELEMENT_IMPORT__VISIBILITY, oldVisibility,
				newVisibility));
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
			importedElement = (PackageableElement) eResolveProxy(
				oldImportedElement);
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
				UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT, oldImportedElement,
				importedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportingNamespace() {
		if (eContainerFeatureID() != UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE)
			return null;
		return (Namespace) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetImportingNamespace() {
		if (eContainerFeatureID() != UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE)
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
			|| (eContainerFeatureID() != UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE
				&& newImportingNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newImportingNamespace))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingNamespace != null)
				msgs = ((InternalEObject) newImportingNamespace).eInverseAdd(
					this, UMLPackage.NAMESPACE__ELEMENT_IMPORT, Namespace.class,
					msgs);
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
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ElementImportOperations.validateVisibilityPublicOrPrivate(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportedElementIsPublic(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
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
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.NAMESPACE__ELEMENT_IMPORT, Namespace.class,
					msgs);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ELEMENT_IMPORT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ELEMENT_IMPORT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ELEMENT_IMPORT__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.ELEMENT_IMPORT__SOURCE :
				return getSources();
			case UMLPackage.ELEMENT_IMPORT__TARGET :
				return getTargets();
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
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				return getVisibility();
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
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
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				getOwnedComments().clear();
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
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.ELEMENT_IMPORT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ELEMENT_IMPORT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ELEMENT_IMPORT__OWNER :
				return isSetOwner();
			case UMLPackage.ELEMENT_IMPORT__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.ELEMENT_IMPORT__SOURCE :
				return isSetSources();
			case UMLPackage.ELEMENT_IMPORT__TARGET :
				return isSetTargets();
			case UMLPackage.ELEMENT_IMPORT__ALIAS :
				return isSetAlias();
			case UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT :
				return importedElement != null;
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				return basicGetImportingNamespace() != null;
			case UMLPackage.ELEMENT_IMPORT__VISIBILITY :
				return (eFlags & VISIBILITY_EFLAG) != VISIBILITY_EFLAG_DEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.ELEMENT_IMPORT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___DESTROY :
				destroy();
				return null;
			case UMLPackage.ELEMENT_IMPORT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ELEMENT_IMPORT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ELEMENT_IMPORT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ELEMENT_IMPORT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_MODEL :
				return getModel();
			case UMLPackage.ELEMENT_IMPORT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ELEMENT_IMPORT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ELEMENT_IMPORT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ELEMENT_IMPORT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ELEMENT_IMPORT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ELEMENT_IMPORT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ELEMENT_IMPORT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ELEMENT_IMPORT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ELEMENT_IMPORT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ELEMENT_IMPORT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ELEMENT_IMPORT___VALIDATE_IMPORTED_ELEMENT_IS_PUBLIC__DIAGNOSTICCHAIN_MAP :
				return validateImportedElementIsPublic(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___VALIDATE_VISIBILITY_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityPublicOrPrivate(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ELEMENT_IMPORT___GET_NAME :
				return getName();
		}
		return eDynamicInvoke(operationID, arguments);
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
		result.append(" (alias: "); //$NON-NLS-1$
		if ((eFlags & ALIAS_ESETFLAG) != 0)
			result.append(alias);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(VISIBILITY_EFLAG_VALUES[(eFlags
			& VISIBILITY_EFLAG) >>> VISIBILITY_EFLAG_OFFSET]);
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
	protected static final int[] TARGET_ESUBSETS = new int[]{
		UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	protected static final int[] SOURCE_ESUBSETS = new int[]{
		UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			|| eIsSet(UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
	}

} //ElementImportImpl
