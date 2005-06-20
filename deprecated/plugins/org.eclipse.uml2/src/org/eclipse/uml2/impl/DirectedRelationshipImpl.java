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
 * $Id: DirectedRelationshipImpl.java,v 1.9 2005/06/20 19:57:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DirectedRelationshipImpl extends RelationshipImpl implements DirectedRelationship {
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
	protected DirectedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDirectedRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList source = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Source());
			if (source == null) {
				EList union = getSourcesHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), source = new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray()));
			}
			return source;
		}
		EList union = getSourcesHelper(new UniqueEList());
		return new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getRelatedElementsHelper(EList relatedElement) {
		super.getRelatedElementsHelper(relatedElement);
		EList source = getSources();
		if (!source.isEmpty()) {
			for (Iterator i = ((InternalEList) source).basicIterator(); i.hasNext(); ) {
				relatedElement.add(i.next());
			}
		}
		EList target = getTargets();
		if (!target.isEmpty()) {
			for (Iterator i = ((InternalEList) target).basicIterator(); i.hasNext(); ) {
				relatedElement.add(i.next());
			}
		}
		return relatedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getTargetsHelper(EList target) {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList target = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Target());
			if (target == null) {
				EList union = getTargetsHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), target = new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray()));
			}
			return target;
		}
		EList union = getTargetsHelper(new UniqueEList());
		return new UnionEObjectEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
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
				case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.DIRECTED_RELATIONSHIP__OWNED_COMMENT:
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
			case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DIRECTED_RELATIONSHIP__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.DIRECTED_RELATIONSHIP__SOURCE:
				return getSources();
			case UML2Package.DIRECTED_RELATIONSHIP__TARGET:
				return getTargets();
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
			case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_COMMENT:
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
			case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_COMMENT:
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
			case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNER:
				return basicGetOwner() != null;
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__TARGET:
				return !getTargets().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSourcesHelper(EList source) {
		return source;
	}

} //DirectedRelationshipImpl
