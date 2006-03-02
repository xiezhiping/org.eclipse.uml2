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
 * $Id: ElementImpl.java,v 1.23 2006/03/02 20:49:57 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.UML2Util;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getOwnedComments <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl
		extends EObjectImpl
		implements Element {

	/**
	 * An array of objects representing the values of non-primitive features.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Object[] eVirtualValues = null;

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits0 = 0;

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEAnnotations() {
		EList eAnnotations = (EList) eVirtualGet(UMLPackage.ELEMENT__EANNOTATIONS);
		if (eAnnotations == null) {
			eVirtualSet(UMLPackage.ELEMENT__EANNOTATIONS,
				eAnnotations = new EObjectContainmentWithInverseEList(
					EAnnotation.class, this, UMLPackage.ELEMENT__EANNOTATIONS,
					EcorePackage.EANNOTATION__EMODEL_ELEMENT));
		}
		return eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.ELEMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ELEMENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ELEMENT__OWNED_ELEMENT,
					new int[]{UMLPackage.ELEMENT__OWNED_COMMENT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedComments() {
		EList ownedComment = (EList) eVirtualGet(UMLPackage.ELEMENT__OWNED_COMMENT);
		if (ownedComment == null) {
			eVirtualSet(UMLPackage.ELEMENT__OWNED_COMMENT,
				ownedComment = new EObjectContainmentEList.Resolving(
					Comment.class, this, UMLPackage.ELEMENT__OWNED_COMMENT));
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createOwnedComment() {
		Comment newOwnedComment = UMLFactory.eINSTANCE.createComment();
		getOwnedComments().add(newOwnedComment);
		return newOwnedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAnnotation getEAnnotation(String source) {

		for (Iterator eAnnotations = getEAnnotations().iterator(); eAnnotations
			.hasNext();) {

			EAnnotation eAnnotation = (EAnnotation) eAnnotations.next();

			if (UML2Util.safeEquals(eAnnotation.getSource(), source)) {
				return eAnnotation;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotOwnSelf(DiagnosticChain diagnostics, Map context) {
		return ElementOperations.validateNotOwnSelf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasOwner(DiagnosticChain diagnostics, Map context) {
		return ElementOperations.validateHasOwner(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStereotypeApplications() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.ELEMENT
				.getEOperations().get(16));
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
	public EList getRequiredStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.ELEMENT
				.getEOperations().get(18));
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
	public EList getAppliedStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.ELEMENT
				.getEOperations().get(20));
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
	public EList getAppliedSubstereotypes(Stereotype stereotype) {
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
	public EList getRelationships() {
		return ElementOperations.getRelationships(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelationships(EClass eClass) {
		return ElementOperations.getRelationships(this, eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceDirectedRelationships() {
		return ElementOperations.getSourceDirectedRelationships(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceDirectedRelationships(EClass eClass) {
		return ElementOperations.getSourceDirectedRelationships(this, eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetDirectedRelationships() {
		return ElementOperations.getTargetDirectedRelationships(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetDirectedRelationships(EClass eClass) {
		return ElementOperations.getTargetDirectedRelationships(this, eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKeywords() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
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
	public EList getApplicableStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.ELEMENT
				.getEOperations().get(14));
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
	public EList allOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(34));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.ELEMENT
					.getEOperations().get(34), result = ElementOperations
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ELEMENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
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
			case UMLPackage.ELEMENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ELEMENT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ELEMENT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == EModelElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.ELEMENT__EANNOTATIONS :
					return EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseFeatureID) {
				case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS :
					return UMLPackage.ELEMENT__EANNOTATIONS;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Object[] eVirtualValues() {
		return eVirtualValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualValues(Object[] newValues) {
		eVirtualValues = newValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
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
		return owner == null
			? null
			: (Element) eResolveProxy((InternalEObject) owner);
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

	protected void eBasicSetContainer(InternalEObject newContainer,
			int newContainerFeatureID) {
		super.eBasicSetContainer(newContainer, newContainerFeatureID);

		if (newContainer != null) {
			Resource.Internal eInternalResource = eInternalResource();

			if (eInternalResource == null || !eInternalResource.isLoading()) {
				ElementOperations.unapplyAllNonApplicableStereotypes(this);
				ElementOperations.applyAllRequiredStereotypes(this);
			}
		}
	}

	public EList eAdapters() {
		EList eAdapters = super.eAdapters();

		if (eAdapters.isEmpty()) {
			CacheAdapter cacheAdapter = getCacheAdapter();

			if (cacheAdapter != null) {
				eAdapters.add(cacheAdapter);
			}
		}

		return eAdapters;
	}

	public void eSetDeliver(boolean deliver) {

		if (deliver) {
			CacheAdapter cacheAdapter = getCacheAdapter();

			if (cacheAdapter != null) {
				getCacheAdapter().handleCrossReference(this);
			}
		}

		super.eSetDeliver(deliver);
	}

	public boolean eNotificationRequired() {
		return getCacheAdapter() == null
			? super.eNotificationRequired()
			: eDeliver();
	}

	public void eNotify(Notification notification) {

		if (eDeliver()) {
			BasicEList eBasicAdapters = eBasicAdapters();

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
