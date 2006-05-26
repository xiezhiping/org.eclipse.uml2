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
 * $Id: ActivityGroupImpl.java,v 1.25 2006/05/26 18:16:51 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Iterator;

import java.util.List;

import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
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
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getOwnedElements <em>Owned Element</em>}</li>
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
		return UML2Package.Literals.ACTIVITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy() ? (ActivityGroup)eResolveProxy((InternalEObject)superGroup) : superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperGroup() {
		return false;
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
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityGroup_activity(Activity newActivityGroup_activity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityGroup_activity, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (newActivityGroup_activity != eInternalContainer() || (eContainerFeatureID != UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY && newActivityGroup_activity != null)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityGroup_activity != null)
				msgs = ((InternalEObject)newActivityGroup_activity).eInverseAdd(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetActivityGroup_activity(newActivityGroup_activity, msgs);
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
	public boolean isSetActivityGroup_activity() {
		return getActivityGroup_activity() != null;
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
				EList subgroups = (EList) cache.get(eResource(), this, method);
				if (subgroups == null) {
					List union = getSubgroupsHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, subgroups = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return subgroups;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getSubgroupsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubgroups() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		ownedElements.addAll(super.getOwnedElements());
		if (isSetSubgroups()) {
			for (Iterator i = ((InternalEList) getSubgroups()).basicIterator(); i.hasNext(); ) {
				ownedElements.add(i.next());
			}
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElements = (EList) cache.get(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray()));
			}
			return ownedElements;
		}
		List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| isSetSubgroups();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.ACTIVITY_GROUP__OWNED_COMMENT};

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getContainedEdges() {
		return new EcoreEList.UnmodifiableEList(this, null, 0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getContainedEdge(String name) {
		return getContainedEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name, boolean ignoreCase, EClass eClass) {
		containedEdgeLoop: for (Iterator i = getContainedEdges().iterator(); i.hasNext(); ) {
			ActivityEdge containedEdge = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(containedEdge))
				continue containedEdgeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedEdge.getName()) : name.equals(containedEdge.getName())))
				continue containedEdgeLoop;
			return containedEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getContainedNodes() {
		return new EcoreEList.UnmodifiableEList(this, null, 0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		return getContainedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name, boolean ignoreCase, EClass eClass) {
		containedNodeLoop: for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(containedNode))
				continue containedNodeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedNode.getName()) : name.equals(containedNode.getName())))
				continue containedNodeLoop;
			return containedNode;
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
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		return basicSetActivityGroup_activity(newActivity, msgs);
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
	public boolean isSetActivity() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (isSetSuperGroup()) {
			return basicGetSuperGroup();
		}
		if (isSetActivityGroup_activity()) {
			return getActivityGroup_activity();
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| isSetSuperGroup()
			|| isSetActivityGroup_activity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSubgroupsHelper(EList subgroups) {
		return subgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_GROUP__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ACTIVITY_GROUP__OWNER:
				return isSetOwner();
			case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ACTIVITY_GROUP__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
		}
		return eDynamicIsSet(featureID);
	}


} //ActivityGroupImpl
