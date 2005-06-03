/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ActivityGroupImpl.java,v 1.10 2005/06/03 20:40:30 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;

import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getContainedEdges <em>Contained Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityGroupImpl extends ElementImpl implements ActivityGroup {

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
	protected ActivityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getActivityGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup == null ? null : (ActivityGroup)eResolveProxy((InternalEObject)superGroup);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (newActivityGroup_activity != eContainer || (eContainerFeatureID != UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY && newActivityGroup_activity != null)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityGroup_activity != null)
				msgs = ((InternalEObject)newActivityGroup_activity).eInverseAdd(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newActivityGroup_activity, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, newActivityGroup_activity, newActivityGroup_activity));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubgroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getSubgroups", null); //$NON-NLS-1$
				EList subgroup = (EList) cache.get(eResource(), this, method);
				if (subgroup == null) {
					EList union = getSubgroupsHelper(new UniqueEList());
					cache.put(eResource(), this, method, subgroup = new UnionEObjectEList(this, union.size(), union.toArray()));
				}
				return subgroup;
			} catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		EList union = getSubgroupsHelper(new UniqueEList());
		return new UnionEObjectEList(this, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		for (Iterator i = ((InternalEList) getSubgroups()).basicIterator(); i.hasNext(); ) {
			ownedElement.add(i.next());
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getContainedEdges() {
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getContainedEdge(String name) {
		for (Iterator i = getContainedEdges().iterator(); i.hasNext(); ) {
			ActivityEdge containedEdge = (ActivityEdge) i.next();
			if (name.equals(containedEdge.getName())) {
				return containedEdge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getContainedNodes() {
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
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
	public Activity getActivity() {
		return getActivityGroup_activity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		setActivityGroup_activity(newActivity);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		ActivityGroup superGroup = basicGetSuperGroup();			
		if (superGroup != null) {
			return superGroup;
		}
		Activity activityGroup_activity = getActivityGroup_activity();			
		if (activityGroup_activity != null) {
			return activityGroup_activity;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSubgroupsHelper(EList subgroup) {
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	public NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				return eBasicSetContainer(null, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseRemove(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
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
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTIVITY_GROUP__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTIVITY_GROUP__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTIVITY_GROUP__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
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
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
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
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
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
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_GROUP__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ACTIVITY_GROUP__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ACTIVITY_GROUP__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity() != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //ActivityGroupImpl
