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
 * $Id: ElementImpl.java,v 1.7 2005/12/01 17:12:30 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EModelElementImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ElementImpl#getOwnedElements <em>Owned Element</em>}</li>
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
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.ELEMENT__OWNED_ELEMENT);
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
	public List getOwnedComments() {
		List ownedComment = (List) eVirtualGet(UMLPackage.ELEMENT__OWNED_COMMENT);
		if (ownedComment == null) {
			eVirtualSet(UMLPackage.ELEMENT__OWNED_COMMENT,
				ownedComment = new EObjectContainmentEList(Comment.class, this,
					UMLPackage.ELEMENT__OWNED_COMMENT));
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
	public List allOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(eResource(), this,
				UMLPackage.Literals.ELEMENT.getEOperations().get(2));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.ELEMENT
					.getEOperations().get(2), result = ElementOperations
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
				return getOwner();
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.ELEMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		for (Iterator i = eAdapters().iterator(); i.hasNext();) {
			Adapter adapter = (Adapter) i.next();
			if (adapter instanceof CacheAdapter) {
				return (CacheAdapter) adapter;
			}
		}
		return null;
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
	public Element getOwnerGen() {
		return null;
	}

	public Element getOwner() {
		return eInternalContainer() instanceof Element
			? (Element) eContainer()
			: getOwnerGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return false;
	}

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

} //ElementImpl
