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
 * $Id: InterruptibleActivityRegionImpl.java,v 1.3 2004/05/20 03:20:03 khussey Exp $
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getInterruptingEdges() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList interruptingEdge = null;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
    protected EList containedNode = null;

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
		if (interruptingEdge == null) {
			interruptingEdge = new EObjectWithInverseResolvingEList(ActivityEdge.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, UML2Package.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdge;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ActivityEdge getInterruptingEdge(String unqualifiedName) {
    	for (Iterator i = getInterruptingEdges().iterator(); i.hasNext(); ) {
    		ActivityEdge namedInterruptingEdge = (ActivityEdge) i.next();
    		
    		if (unqualifiedName.equals(namedInterruptingEdge.getName())) {
    			return namedInterruptingEdge;
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
		if (containedNode == null) {
			containedNode = new EObjectWithInverseResolvingEList.ManyInverse(ActivityNode.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		}
		return containedNode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
     */
    public ActivityNode getContainedNode(String unqualifiedName) {
    	for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
    		ActivityNode namedContainedNode = (ActivityNode) i.next();
    		
    		if (unqualifiedName.equals(namedContainedNode.getName())) {
    			return namedContainedNode;
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
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
				setActivityGroup_activity(null);
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
				return !getOwnedElements().isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity() != null;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return interruptingEdge != null && !interruptingEdge.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //InterruptibleActivityRegionImpl
