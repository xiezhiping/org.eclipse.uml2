/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: DirectedRelationshipImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DirectedRelationshipImpl#getSources <em>Source</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * Returns the value of the '<em><b>Source</b></em>' reference list, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Relationship#getRelatedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getSources() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Source())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Source(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Source(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Source());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Target</b></em>' reference list, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Relationship#getRelatedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getTargets() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Target())) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Target(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Target(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * @generated
	 */
	public EList getRelatedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getRelationship_RelatedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRelatedElements());
			union.addAll(getSources());
			union.addAll(getTargets());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getRelationship_RelatedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getRelationship_RelatedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRelationship_RelatedElement());
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

} //DirectedRelationshipImpl
