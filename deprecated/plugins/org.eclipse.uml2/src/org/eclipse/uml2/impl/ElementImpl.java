/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Comment;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.Model;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.internal.operation.ElementOperations;
import org.eclipse.uml2.internal.operation.StereotypeOperations;
import org.eclipse.uml2.util.CacheAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ElementImpl#getOwner <em>Owner</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
        
        eAdapters().add(getCacheAdapter());
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
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(getOwnedComments());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' reference, a derived union.
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner == null ? null : (Element)eResolveProxy((InternalEObject)owner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' reference, a derived union.
	 * @generated
	 */
	public Element basicGetOwnerGen() {
		// TODO: test this union basic getter
		return null;
	}

	public Element basicGetOwner() {
		return Element.class.isInstance(eContainer) ? (Element) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		// TODO: test this derived basic setter
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
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
	 * @generated
	 */
	public Comment createOwnedComment(EClass eClass) {
		Comment newOwnedComment = (Comment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.ELEMENT__OWNED_COMMENT, null, newOwnedComment));
		}
		getOwnedComments().add(newOwnedComment);
		return newOwnedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotOwnSelf(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasOwner(DiagnosticChain diagnostics, Map data) {
		// TODO: implement this OCL constraint
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set allOwnedElements() {
		// TODO: test this OCL operation
		try {
			java.lang.reflect.Method method = getClass().getMethod("allOwnedElements", new Class[] {}); //$NON-NLS-1$
			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this,
					method,
					java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ElementOperations.allOwnedElements(this)));
			}
			return (Set) getCacheAdapter().get(this, method);
		} catch (Exception e) {
			return org.eclipse.uml2.internal.operation.ElementOperations.allOwnedElements(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustBeOwned() {
		// TODO: test this OCL operation
		return org.eclipse.uml2.internal.operation.ElementOperations.mustBeOwned(this);
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

	// <!-- begin-custom-operations -->

	/**
	 * Retrieves the cache adapter for this element.
	 * 
	 * @return The cache adapter for this element.
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#createEAnnotation(String)
	 */
	public EAnnotation createEAnnotation(String source) {
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();

		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE,
					EcorePackage.EMODEL_ELEMENT__EANNOTATIONS, null,
					eAnnotation));
		}

		eAnnotation.setSource(source);
		eAnnotation.setEModelElement(this);

		eAnnotation.eAdapters().add(getCacheAdapter());

		return eAnnotation;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#apply(org.eclipse.uml2.Stereotype)
	 */
	public void apply(Stereotype stereotype) {
		StereotypeOperations.apply(stereotype, this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getApplicableStereotype(java.lang.String)
	 */
	public Stereotype getApplicableStereotype(String qualifiedStereotypeName) {
		return StereotypeOperations.getApplicableStereotype(this,
			qualifiedStereotypeName);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getApplicableStereotypes()
	 */
	public Set getApplicableStereotypes() {

		try {
			Method method = getClass().getMethod("getApplicableStereotypes", //$NON-NLS-1$
				new Class[] {});

			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this, method,
					StereotypeOperations.getApplicableStereotypes(this));
			}

			return (Set) getCacheAdapter().get(this, method);

		} catch (Exception e) {
			return StereotypeOperations.getApplicableStereotypes(this);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getAppliedStereotype(java.lang.String)
	 */
	public Stereotype getAppliedStereotype(String qualifiedStereotypeName) {
		return StereotypeOperations.getAppliedStereotype(this,
			qualifiedStereotypeName);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getAppliedStereotypes()
	 */
	public Set getAppliedStereotypes() {

		try {
			Method method = getClass().getMethod("getAppliedStereotypes", //$NON-NLS-1$
				new Class[] {});

			if (!getCacheAdapter().containsKey(this, method)) {
				getCacheAdapter().put(this, method,
					StereotypeOperations.getAppliedStereotypes(this));
			}

			return (Set) getCacheAdapter().get(this, method);

		} catch (Exception e) {
			return StereotypeOperations.getAppliedStereotypes(this);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getModel()
	 */
	public Model getModel() {
		return ElementOperations.getModel(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getNearestPackage()
	 */
	public org.eclipse.uml2.Package getNearestPackage() {
		return ElementOperations.getNearestPackage(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getValue(org.eclipse.uml2.Stereotype, java.lang.String)
	 */
	public Object getValue(Stereotype stereotype, String propertyName) {
		return StereotypeOperations.getValue(stereotype, this, propertyName);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#isApplied(org.eclipse.uml2.Stereotype)
	 */
	public boolean isApplied(Stereotype stereotype) {
		return StereotypeOperations.isApplied(stereotype, this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#isRequired(org.eclipse.uml2.Stereotype)
	 */
	public boolean isRequired(Stereotype stereotype) {
		return StereotypeOperations.isRequired(stereotype, this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#setValue(org.eclipse.uml2.Stereotype, java.lang.String, java.lang.Object)
	 */
	public void setValue(Stereotype stereotype, String propertyName,
			Object value) {
		StereotypeOperations.setValue(stereotype, this, propertyName, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#unapply(org.eclipse.uml2.Stereotype)
	 */
	public void unapply(Stereotype stereotype) {
		StereotypeOperations.unapply(stereotype, this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#destroy()
	 */
	public void destroy() {
		ElementOperations.destroy(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Element#getAppliedVersion(org.eclipse.uml2.Stereotype)
	 */
	public String getAppliedVersion(Stereotype stereotype) {
		return StereotypeOperations.getAppliedVersion(stereotype, this);
	}
	
	// <!-- end-custom-operations -->

} //ElementImpl
