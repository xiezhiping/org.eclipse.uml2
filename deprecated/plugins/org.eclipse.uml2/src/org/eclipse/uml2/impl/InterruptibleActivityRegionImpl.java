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
 * $Id: InterruptibleActivityRegionImpl.java,v 1.11 2005/11/14 17:31:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InterruptibleActivityRegionImpl#getInterruptingEdges <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InterruptibleActivityRegionImpl#getContainedNodes <em>Contained Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion {
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
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInterruptibleActivityRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterruptingEdges() {
		EList interruptingEdge = (EList)eVirtualGet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		if (interruptingEdge == null) {
			eVirtualSet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, interruptingEdge = new EObjectWithInverseResolvingEList(ActivityEdge.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, UML2Package.ACTIVITY_EDGE__INTERRUPTS));
		}
		return interruptingEdge;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getInterruptingEdge(String name) {
		for (Iterator i = getInterruptingEdges().iterator(); i.hasNext(); ) {
			ActivityEdge interruptingEdge = (ActivityEdge) i.next();
			if (name.equals(interruptingEdge.getName())) {
				return interruptingEdge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		EList containedNode = (EList)eVirtualGet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE);
		if (containedNode == null) {
			eVirtualSet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE, containedNode = new EObjectWithInverseResolvingEList.ManyInverse(ActivityNode.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION));
		}
		return containedNode;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		EList containedNode = (EList)eVirtualGet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE);
		return containedNode != null && !containedNode.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (name.equals(containedNode.getName())) {
				return containedNode;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
					return ((InternalEList)getInterruptingEdges()).basicAdd(otherEnd, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
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
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
					return eBasicSetContainer(null, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
					return ((InternalEList)getInterruptingEdges()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdges();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return getContainedNodes();
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdges().clear();
				getInterruptingEdges().addAll((Collection)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdges().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNodes().clear();
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNER:
				return isSetOwner();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				EList interruptingEdge = (EList)eVirtualGet(UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
				return interruptingEdge != null && !interruptingEdge.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return isSetContainedNodes();
		}
		return eDynamicIsSet(eFeature);
	}


} //InterruptibleActivityRegionImpl
