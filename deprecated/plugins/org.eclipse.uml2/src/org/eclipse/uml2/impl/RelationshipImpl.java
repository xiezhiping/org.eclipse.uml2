/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RelationshipImpl.java,v 1.16 2006/01/05 13:53:04 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Element;

import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RelationshipImpl#getRelatedElements <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipImpl extends ElementImpl implements Relationship {
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
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		EList relatedElement = (EList)eVirtualGet(UML2Package.RELATIONSHIP__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UML2Package.RELATIONSHIP__RELATED_ELEMENT, relatedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.RELATIONSHIP__RELATED_ELEMENT, null));
		}
		return relatedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.RELATIONSHIP__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.RELATIONSHIP__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.RELATIONSHIP__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.RELATIONSHIP__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.RELATIONSHIP__RELATED_ELEMENT:
				return getRelatedElements();
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
			case UML2Package.RELATIONSHIP__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.RELATIONSHIP__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.RELATIONSHIP__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.RELATIONSHIP__OWNER:
				return isSetOwner();
			case UML2Package.RELATIONSHIP__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.RELATIONSHIP__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.RELATIONSHIP__RELATED_ELEMENT:
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
