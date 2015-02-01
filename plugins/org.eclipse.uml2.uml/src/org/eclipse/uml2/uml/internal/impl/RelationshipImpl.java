/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 451350
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RelationshipImpl#getRelatedElements <em>Related Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationshipImpl
		extends ElementImpl
		implements Relationship {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						UMLPackage.RELATIONSHIP__RELATED_ELEMENT, null));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.RELATIONSHIP__RELATED_ELEMENT, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.RELATIONSHIP__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RELATIONSHIP__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RELATIONSHIP__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RELATIONSHIP__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
				return getRelatedElements();
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
			case UMLPackage.RELATIONSHIP__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RELATIONSHIP__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.RELATIONSHIP__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RELATIONSHIP__OWNER :
				return isSetOwner();
			case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
				return isSetRelatedElements();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return false;
	}

} //RelationshipImpl
