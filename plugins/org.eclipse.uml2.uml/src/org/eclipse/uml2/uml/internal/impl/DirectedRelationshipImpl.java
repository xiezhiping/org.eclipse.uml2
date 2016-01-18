/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DirectedRelationshipImpl
		extends RelationshipImpl
		implements DirectedRelationship {

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DIRECTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						Element.class, this,
						UMLPackage.DIRECTED_RELATIONSHIP__SOURCE, null));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DIRECTED_RELATIONSHIP__SOURCE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> relatedElements = (EList<Element>) cache.get(
				eResource, this,
				UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
			if (relatedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT,
					relatedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT,
						RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT,
			RELATED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						Element.class, this,
						UMLPackage.DIRECTED_RELATIONSHIP__TARGET, null));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DIRECTED_RELATIONSHIP__TARGET, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DIRECTED_RELATIONSHIP__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
				return getSources();
			case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
				return getTargets();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DIRECTED_RELATIONSHIP__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNER :
				return isSetOwner();
			case UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
				return isSetSources();
			case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
				return isSetTargets();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return false;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.DIRECTED_RELATIONSHIP__SOURCE,
		UMLPackage.DIRECTED_RELATIONSHIP__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelatedElements() {
		return super.isSetRelatedElements() || isSetSources() || isSetTargets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return false;
	}

} //DirectedRelationshipImpl
