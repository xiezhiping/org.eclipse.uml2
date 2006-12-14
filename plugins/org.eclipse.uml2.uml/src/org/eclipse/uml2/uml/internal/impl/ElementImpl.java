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
 * $Id: ElementImpl.java,v 1.36 2006/12/14 15:49:31 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

//import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EModelElementImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getOwnedComments <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl
		extends EModelElementImpl
		implements Element {

	/**
	 * The cached value of the '{@link #getOwnedComments() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComments = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedElements() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(
				eResource, this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.ELEMENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ELEMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComments() {
		if (ownedComments == null) {
			ownedComments = new EObjectContainmentEList.Resolving<Comment>(
				Comment.class, this, UMLPackage.ELEMENT__OWNED_COMMENT);
		}
		return ownedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createOwnedComment() {
		Comment newOwnedComment = (Comment) create(UMLPackage.Literals.COMMENT);
		getOwnedComments().add(newOwnedComment);
		return newOwnedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotOwnSelf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ElementOperations.validateNotOwnSelf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasOwner(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ElementOperations.validateHasOwner(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStereotypeApplications() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<EObject> result = (EList<EObject>) cache.get(this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(16));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
					.get(16), result = ElementOperations
					.getStereotypeApplications(this));
			}
			return result;
		}
		return ElementOperations.getStereotypeApplications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStereotypeApplication(Stereotype stereotype) {
		return ElementOperations.getStereotypeApplication(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getRequiredStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Stereotype> result = (EList<Stereotype>) cache.get(this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(18));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
					.get(18), result = ElementOperations
					.getRequiredStereotypes(this));
			}
			return result;
		}
		return ElementOperations.getRequiredStereotypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getRequiredStereotype(String qualifiedName) {
		return ElementOperations.getRequiredStereotype(this, qualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getAppliedStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Stereotype> result = (EList<Stereotype>) cache.get(this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(20));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
					.get(20), result = ElementOperations
					.getAppliedStereotypes(this));
			}
			return result;
		}
		return ElementOperations.getAppliedStereotypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getAppliedStereotype(String qualifiedName) {
		return ElementOperations.getAppliedStereotype(this, qualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getAppliedSubstereotypes(Stereotype stereotype) {
		return ElementOperations.getAppliedSubstereotypes(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getAppliedSubstereotype(Stereotype stereotype,
			String qualifiedName) {
		return ElementOperations.getAppliedSubstereotype(this, stereotype,
			qualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasValue(Stereotype stereotype, String propertyName) {
		return ElementOperations.hasValue(this, stereotype, propertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue(Stereotype stereotype, String propertyName) {
		return ElementOperations.getValue(this, stereotype, propertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Stereotype stereotype, String propertyName,
			Object newValue) {
		ElementOperations.setValue(this, stereotype, propertyName, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEAnnotation(String source) {
		return ElementOperations.createEAnnotation(this, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Relationship> result = (EList<Relationship>) cache.get(this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(28));
			if (result == null) {
				cache
					.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
						.get(28), result = ElementOperations
						.getRelationships(this));
			}
			return result;
		}
		return ElementOperations.getRelationships(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships(EClass eClass) {
		return ElementOperations.getRelationships(this, eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getSourceDirectedRelationships() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<DirectedRelationship> result = (EList<DirectedRelationship>) cache
				.get(this, UMLPackage.Literals.ELEMENT.getEOperations().get(30));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
					.get(30), result = ElementOperations
					.getSourceDirectedRelationships(this));
			}
			return result;
		}
		return ElementOperations.getSourceDirectedRelationships(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getSourceDirectedRelationships(
			EClass eClass) {
		return ElementOperations.getSourceDirectedRelationships(this, eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getTargetDirectedRelationships() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<DirectedRelationship> result = (EList<DirectedRelationship>) cache
				.get(this, UMLPackage.Literals.ELEMENT.getEOperations().get(32));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
					.get(32), result = ElementOperations
					.getTargetDirectedRelationships(this));
			}
			return result;
		}
		return ElementOperations.getTargetDirectedRelationships(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getTargetDirectedRelationships(
			EClass eClass) {
		return ElementOperations.getTargetDirectedRelationships(this, eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeywords() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<String> result = (EList<String>) cache.get(eResource(), this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(4));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.ELEMENT
					.getEOperations().get(4), result = ElementOperations
					.getKeywords(this));
			}
			return result;
		}
		return ElementOperations.getKeywords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addKeyword(String keyword) {
		return ElementOperations.addKeyword(this, keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeKeyword(String keyword) {
		return ElementOperations.removeKeyword(this, keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNearestPackage() {
		return ElementOperations.getNearestPackage(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		return ElementOperations.getModel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereotypeApplicable(Stereotype stereotype) {
		return ElementOperations.isStereotypeApplicable(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereotypeRequired(Stereotype stereotype) {
		return ElementOperations.isStereotypeRequired(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereotypeApplied(Stereotype stereotype) {
		return ElementOperations.isStereotypeApplied(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject applyStereotype(Stereotype stereotype) {
		return ElementOperations.applyStereotype(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject unapplyStereotype(Stereotype stereotype) {
		return ElementOperations.unapplyStereotype(this, stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getApplicableStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Stereotype> result = (EList<Stereotype>) cache.get(this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(14));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
					.get(14), result = ElementOperations
					.getApplicableStereotypes(this));
			}
			return result;
		}
		return ElementOperations.getApplicableStereotypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getApplicableStereotype(String qualifiedName) {
		return ElementOperations.getApplicableStereotype(this, qualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasKeyword(String keyword) {
		return ElementOperations.hasKeyword(this, keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void destroy() {
		ElementOperations.destroy(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> allOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Element> result = (EList<Element>) cache.get(this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(34));
			if (result == null) {
				cache
					.put(this, UMLPackage.Literals.ELEMENT.getEOperations()
						.get(34), result = ElementOperations
						.allOwnedElements(this));
			}
			return result;
		}
		return ElementOperations.allOwnedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustBeOwned() {
		return ElementOperations.mustBeOwned(this);
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
			case UMLPackage.ELEMENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
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
			case UMLPackage.ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
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
			case UMLPackage.ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
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
			case UMLPackage.ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected EObject create(EClass eClass) {
		return EcoreUtil.create(eClass);
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Element</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Element</b></em>'.
	 * @generated NOT
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.INSTANCE;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{UMLPackage.ELEMENT__OWNED_COMMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return eIsSet(UMLPackage.ELEMENT__OWNED_COMMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwnerGen() {

		return null;
	}

	public Element basicGetOwner() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof Element
			? (Element) eInternalContainer
			: basicGetOwnerGen();
	}

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
	public boolean isSetOwnerGen() {
		return false;
	}

	public boolean isSetOwner() {
		return basicGetOwner() != null;
	}

	@Override
	public NotificationChain eBasicSetContainer(InternalEObject newContainer,
			int newContainerFeatureID, NotificationChain msgs) {
		msgs = super.eBasicSetContainer(newContainer, newContainerFeatureID,
			msgs);

		if (newContainer != null) {
			Resource.Internal eInternalResource = eInternalResource();

			if (eInternalResource == null || !eInternalResource.isLoading()) {
				ElementOperations.unapplyAllNonApplicableStereotypes(this,
					false);
				ElementOperations.applyAllRequiredStereotypes(this, false);
			}
		}

		return msgs;
	}

	private static final int ADAPTING = 1 << 7;

	@Override
	public EList<Adapter> eAdapters() {
		EList<Adapter> eAdapters = super.eAdapters();

		if ((eFlags & ADAPTING) == 0 && eAdapters.isEmpty()) {
			CacheAdapter cacheAdapter = getCacheAdapter();

			if (cacheAdapter != null) {
				eFlags |= ADAPTING;
				cacheAdapter.adapt(this);
				eFlags &= ~ADAPTING;
			}
		}

		return eAdapters;
	}

	@Override
	public void eSetDeliver(boolean deliver) {

		if (deliver) {
			CacheAdapter cacheAdapter = getCacheAdapter();

			if (cacheAdapter != null) {
				cacheAdapter.handleCrossReference(this);
			}
		}

		super.eSetDeliver(deliver);
	}

	@Override
	public boolean eNotificationRequired() {
		return getCacheAdapter() == null
			? super.eNotificationRequired()
			: eDeliver();
	}

	@Override
	public void eNotify(Notification notification) {

		if (eDeliver()) {
			BasicEList<Adapter> eBasicAdapters = eBasicAdapters();

			if (eBasicAdapters == null || eBasicAdapters.isEmpty()) {
				CacheAdapter cacheAdapter = getCacheAdapter();

				if (cacheAdapter != null) {
					cacheAdapter.notifyChanged(notification);
				}
			} else {
				Adapter[] adapters = (Adapter[]) eBasicAdapters.data();

				for (int i = 0, size = eBasicAdapters.size(); i < size; i++) {
					adapters[i].notifyChanged(notification);
				}
			}
		}
	}

} // ElementImpl
