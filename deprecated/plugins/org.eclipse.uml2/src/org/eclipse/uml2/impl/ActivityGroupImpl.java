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
 * $Id: ActivityGroupImpl.java,v 1.4 2004/06/02 05:02:26 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityGroupImpl#getActivityGroup_activity <em>Activity Group activity</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * @generated
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY) {
			return null;
		}
		return (Activity) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (eContainer != newActivityGroup_activity || (eContainerFeatureID != UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY && null != newActivityGroup_activity)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newActivityGroup_activity) {
				msgs = ((InternalEObject) newActivityGroup_activity).eInverseAdd(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newActivityGroup_activity, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, newActivityGroup_activity, newActivityGroup_activity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubgroups() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getActivityGroup().getEAllOperations().get(19));

		if (null == result) {
			Set union = new LinkedHashSet();

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getActivityGroup().getEAllOperations().get(19), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getContainedEdges() {
		// TODO: implement this method
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getContainedNodes() {
		// TODO: implement this method
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
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
	public EList getOwnedElements() {
		EList ownedElement = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());

		if (null == ownedElement) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getSubgroups());

			ownedElement = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getElement_OwnedElement(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement);
		}

		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (null != getSuperGroup()) {
			return (Element) getSuperGroup();
		}
		if (null != getActivityGroup_activity()) {
			return (Element) getActivityGroup_activity();
		}
		return super.basicGetOwner();
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
				case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);
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
				case UML2Package.ACTIVITY_GROUP__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_GROUP__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY:
					return eBasicSetContainer(null, UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY, msgs);
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
				setActivityGroup_activity(null);
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
