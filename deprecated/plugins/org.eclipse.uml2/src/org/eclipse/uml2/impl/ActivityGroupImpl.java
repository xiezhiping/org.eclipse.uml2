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
 * $Id: ActivityGroupImpl.java,v 1.2 2004/04/10 04:09:49 khussey Exp $
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
	 * Returns the value of the '<em><b>Super Group</b></em>' reference, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup == null ? null : (ActivityGroup)eResolveProxy((InternalEObject)superGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Super Group</b></em>' reference, a derived union.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		// TODO: test this union basic getter
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Activity Group activity</b></em>' container reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.ActivityNode#getActivity}</li>
	 * </ul>
	 * </p>
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
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
	 * Returns the value of the '<em><b>Subgroup</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getSubgroups() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getActivityGroup().getEAllOperations().get(19))) {
			Set union = new LinkedHashSet();
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getActivityGroup().getEAllOperations().get(19),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getActivityGroup().getEAllOperations().get(19));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getInGroups <em>In Group</em>}'.
	 * @generated
	 */
    public EList getContainedEdgesGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getContainedEdges() {
		// TODO: test this method
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getInGroups <em>In Group</em>}'.
	 * @generated
	 */
	public EList getContainedNodesGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getContainedNodes() {
		// TODO: test this method
		return new BasicEList.UnmodifiableEList(0, Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Activity#getNodes <em>Node</em>}'.
	 * @generated
	 */
	public Activity getActivity() {
		// TODO: test this redefined getter
		return getActivityGroup_activity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		// TODO: test this redefined setter
		setActivityGroup_activity(newActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getSubgroups());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwnedElements <em>Owned Element</em>}'.
	 * @generated
	 */
	public Element basicGetOwner() {
		// TODO: test this union basic getter
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
