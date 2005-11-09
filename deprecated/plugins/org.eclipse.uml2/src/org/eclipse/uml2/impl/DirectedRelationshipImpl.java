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
 * $Id: DirectedRelationshipImpl.java,v 1.12 2005/11/09 22:53:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getTargets <em>Target</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList source = null;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList target = null;

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
		if (source == null) {
			source = new DerivedUnionEObjectEList(Element.class, this, UML2Package.DIRECTED_RELATIONSHIP__SOURCE, new EStructuralFeature[] {});
		}
		return source;
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
	public EList getRelatedElements() {
		if (relatedElement == null) {
			relatedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.DIRECTED_RELATIONSHIP__RELATED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getDirectedRelationship_Source(), UML2Package.eINSTANCE.getDirectedRelationship_Target()});
		}
		return relatedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return super.isSetRelatedElements()
			|| isSetSources()
			|| isSetTargets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		if (target == null) {
			target = new DerivedUnionEObjectEList(Element.class, this, UML2Package.DIRECTED_RELATIONSHIP__TARGET, new EStructuralFeature[] {});
		}
		return target;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return false;
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
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DIRECTED_RELATIONSHIP__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNER:
				return isSetOwner();
			case UML2Package.DIRECTED_RELATIONSHIP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DIRECTED_RELATIONSHIP__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.DIRECTED_RELATIONSHIP__SOURCE:
				return isSetSources();
			case UML2Package.DIRECTED_RELATIONSHIP__TARGET:
				return isSetTargets();
		}
		return eDynamicIsSet(eFeature);
	}


} //DirectedRelationshipImpl
