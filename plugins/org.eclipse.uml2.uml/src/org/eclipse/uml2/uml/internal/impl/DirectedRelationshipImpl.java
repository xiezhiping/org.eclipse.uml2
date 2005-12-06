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
 * $Id: DirectedRelationshipImpl.java,v 1.6 2005/12/06 23:21:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl#getTargets <em>Target</em>}</li>
 * </ul>
 * </p>
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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DIRECTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.DIRECTED_RELATIONSHIP__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.DIRECTED_RELATIONSHIP__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.DIRECTED_RELATIONSHIP__SOURCE, new int[]{}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRelatedElements() {
		List relatedElement = (List) eVirtualGet(UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT,
					new int[]{UMLPackage.DIRECTED_RELATIONSHIP__SOURCE,
						UMLPackage.DIRECTED_RELATIONSHIP__TARGET}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.DIRECTED_RELATIONSHIP__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.DIRECTED_RELATIONSHIP__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.DIRECTED_RELATIONSHIP__TARGET, new int[]{}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DIRECTED_RELATIONSHIP__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT :
				return getOwnedComments();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DIRECTED_RELATIONSHIP__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DIRECTED_RELATIONSHIP__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNER :
				return isSetOwner();
			case UMLPackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
