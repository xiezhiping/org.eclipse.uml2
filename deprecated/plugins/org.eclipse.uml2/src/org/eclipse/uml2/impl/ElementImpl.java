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
 * $Id: ElementImpl.java,v 1.24 2005/06/09 02:18:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
//import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

//import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Comment;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.Model;
import org.eclipse.uml2.Stereotype;

import org.eclipse.uml2.internal.operation.ElementOperations;
import org.eclipse.uml2.internal.operation.StereotypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#getOwnedComments <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends EModelElementImpl implements Element {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedComments() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComments()
	 * @generated
	 * @ordered
	 */
	protected EList ownedComment = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated NOT
     */
	protected ElementImpl() {
        super();
        
        CacheAdapter.INSTANCE.adapt(this);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElement = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getElement_OwnedElement());
			if (ownedElement == null) {
				EList union = getOwnedElementsHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement = new UnionEObjectEList(this, union.size(), union.toArray()));
			}
			return ownedElement;
		}
		EList union = getOwnedElementsHelper(new UniqueEList());
		return new UnionEObjectEList(this, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner == null ? null : (Element)eResolveProxy((InternalEObject)owner);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwner() {
		return eContainer instanceof Element ? (Element) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedComments() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList(Comment.class, this, UML2Package.ELEMENT__OWNED_COMMENT);
		}
		return ownedComment;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedComment() instead.
	 */
	public Comment createOwnedComment(EClass eClass) {
		Comment newOwnedComment = (Comment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ELEMENT__OWNED_COMMENT, null, newOwnedComment));
		}
		getOwnedComments().add(newOwnedComment);
		return newOwnedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createOwnedComment() {
		Comment newOwnedComment = UML2Factory.eINSTANCE.createComment();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ELEMENT__OWNED_COMMENT, null, newOwnedComment));
		}
		getOwnedComments().add(newOwnedComment);
		return newOwnedComment;
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
	public Set allOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this, UML2Package.eINSTANCE.getElement().getEOperations().get(2));
			if (result == null) {
				cache.put(eResource(), this, UML2Package.eINSTANCE.getElement().getEOperations().get(2), result = ElementOperations.allOwnedElements(this));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
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
				case UML2Package.ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ELEMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
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
			case UML2Package.ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
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
			case UML2Package.ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
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
			case UML2Package.ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ELEMENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ELEMENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ELEMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
		}
		return eDynamicIsSet(eFeature);
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
	protected EList getOwnedElementsHelper(EList ownedElement) {
		if (ownedComment != null) {
			ownedElement.addAll(ownedComment);
		}
		return ownedElement;
	}

	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.InternalEObject#eSetResource(org.eclipse.emf.ecore.resource.Resource.Internal,
	 *      org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain eSetResource(Resource.Internal resource,
			NotificationChain notifications) {
		CacheAdapter.INSTANCE.adapt(resource);

		return super.eSetResource(resource, notifications);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#createEAnnotation(String)
	 */
	public EAnnotation createEAnnotation(String source) {
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();

		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0,
				EcorePackage.EMODEL_ELEMENT__EANNOTATIONS, null, eAnnotation));
		}

		eAnnotation.setSource(source);
		eAnnotation.setEModelElement(this);

		return eAnnotation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#apply(org.eclipse.uml2.Stereotype)
	 */
	public void apply(Stereotype stereotype) {
		StereotypeOperations.apply(stereotype, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getApplicableStereotype(java.lang.String)
	 */
	public Stereotype getApplicableStereotype(String qualifiedStereotypeName) {
		return StereotypeOperations.getApplicableStereotype(this,
			qualifiedStereotypeName);
	}

	private static Method GET_APPLICABLE_STEREOTYPES = null;

	static {
		try {
			GET_APPLICABLE_STEREOTYPES = ElementImpl.class.getMethod(
				"getApplicableStereotypes", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getApplicableStereotypes()
	 */
	public Set getApplicableStereotypes() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_APPLICABLE_STEREOTYPES);

			if (result == null) {
				cache.put(this, GET_APPLICABLE_STEREOTYPES,
					result = Collections.unmodifiableSet(StereotypeOperations
						.getApplicableStereotypes(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(StereotypeOperations
			.getApplicableStereotypes(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getAppliedStereotype(java.lang.String)
	 */
	public Stereotype getAppliedStereotype(String qualifiedStereotypeName) {
		return StereotypeOperations.getAppliedStereotype(this,
			qualifiedStereotypeName);
	}

	private static Method GET_APPLIED_STEREOTYPES = null;

	static {
		try {
			GET_APPLIED_STEREOTYPES = ElementImpl.class.getMethod(
				"getAppliedStereotypes", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getAppliedStereotypes()
	 */
	public Set getAppliedStereotypes() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_APPLIED_STEREOTYPES);

			if (result == null) {
				cache.put(this, GET_APPLIED_STEREOTYPES, result = Collections
					.unmodifiableSet(StereotypeOperations
						.getAppliedStereotypes(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(StereotypeOperations
			.getAppliedStereotypes(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getModel()
	 */
	public Model getModel() {
		return ElementOperations.getModel(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getNearestPackage()
	 */
	public org.eclipse.uml2.Package getNearestPackage() {
		return ElementOperations.getNearestPackage(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getValue(org.eclipse.uml2.Stereotype,
	 *      java.lang.String)
	 */
	public Object getValue(Stereotype stereotype, String propertyName) {
		return StereotypeOperations.getValue(stereotype, this, propertyName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#isApplied(org.eclipse.uml2.Stereotype)
	 */
	public boolean isApplied(Stereotype stereotype) {
		return StereotypeOperations.isApplied(stereotype, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#isRequired(org.eclipse.uml2.Stereotype)
	 */
	public boolean isRequired(Stereotype stereotype) {
		return StereotypeOperations.isRequired(stereotype, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#setValue(org.eclipse.uml2.Stereotype,
	 *      java.lang.String, java.lang.Object)
	 */
	public void setValue(Stereotype stereotype, String propertyName,
			Object value) {
		StereotypeOperations.setValue(stereotype, this, propertyName, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#hasValue(org.eclipse.uml2.Stereotype,
	 *      java.lang.String)
	 */
	public boolean hasValue(Stereotype stereotype, String propertyName) {
		return StereotypeOperations.hasValue(stereotype, this, propertyName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#unapply(org.eclipse.uml2.Stereotype)
	 */
	public void unapply(Stereotype stereotype) {
		StereotypeOperations.unapply(stereotype, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#destroy()
	 */
	public void destroy() {
		ElementOperations.destroy(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getAppliedVersion(org.eclipse.uml2.Stereotype)
	 */
	public String getAppliedVersion(Stereotype stereotype) {
		return StereotypeOperations.getAppliedVersion(stereotype, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#addKeyword(java.lang.String)
	 */
	public void addKeyword(String keyword) {
		ElementOperations.addKeyword(this, keyword);
	}

	private static Method GET_KEYWORDS = null;

	static {
		try {
			GET_KEYWORDS = ElementImpl.class.getMethod("getKeywords", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#getKeywords()
	 */
	public Set getKeywords() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this, GET_KEYWORDS);

			if (result == null) {
				cache.put(eResource(), this, GET_KEYWORDS, result = Collections
					.unmodifiableSet(ElementOperations.getKeywords(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ElementOperations.getKeywords(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#hasKeyword(java.lang.String)
	 */
	public boolean hasKeyword(String keyword) {
		return ElementOperations.hasKeyword(this, keyword);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Element#removeKeyword(java.lang.String)
	 */
	public void removeKeyword(String keyword) {
		ElementOperations.removeKeyword(this, keyword);
	}
	
	// <!-- end-custom-operations -->

} //ElementImpl
