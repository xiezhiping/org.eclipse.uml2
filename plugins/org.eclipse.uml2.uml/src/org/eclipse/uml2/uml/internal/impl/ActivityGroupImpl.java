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
 * $Id: ActivityGroupImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ActivityGroupOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getInActivity <em>In Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityGroupImpl
		extends ElementImpl
		implements ActivityGroup {

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
		return UMLPackage.eINSTANCE.getActivityGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSubgroups() {
		List subgroup = (List) eVirtualGet(UMLPackage.ACTIVITY_GROUP__SUBGROUP);
		if (subgroup == null) {
			eVirtualSet(UMLPackage.ACTIVITY_GROUP__SUBGROUP,
				subgroup = new DerivedUnionEObjectEList(ActivityGroup.class,
					this, UMLPackage.ACTIVITY_GROUP__SUBGROUP,
					new EStructuralFeature[]{}));
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getActivityGroup_Subgroup()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getContainedNodes() {
		List containedNode = (List) eVirtualGet(UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE);
		if (containedNode == null) {
			eVirtualSet(UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE,
				containedNode = new DerivedUnionEObjectEList(
					ActivityNode.class, this,
					UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE,
					new EStructuralFeature[]{}));
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name) {
		for (Iterator i = getContainedNodes().iterator(); i.hasNext();) {
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
	public List getContainedEdges() {
		List containedEdge = (List) eVirtualGet(UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE);
		if (containedEdge == null) {
			eVirtualSet(UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE,
				containedEdge = new DerivedUnionEObjectEList(
					ActivityEdge.class, this,
					UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE,
					new EStructuralFeature[]{}));
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name) {
		for (Iterator i = getContainedEdges().iterator(); i.hasNext();) {
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
	 * @generated
	 */
	public Activity getInActivity() {
		if (eContainerFeatureID != UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		if (newInActivity != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY && newInActivity != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newInActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInActivity != null)
				msgs = ((InternalEObject) newInActivity).eInverseAdd(this,
					UMLPackage.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newInActivity,
				UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY, newInActivity,
				newInActivity));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesAndEdges(DiagnosticChain diagnostics,
			Map context) {
		return ActivityGroupOperations.validateNodesAndEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotContained(DiagnosticChain diagnostics, Map context) {
		return ActivityGroupOperations.validateNotContained(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupOwned(DiagnosticChain diagnostics, Map context) {
		return ActivityGroupOperations.validateGroupOwned(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.ACTIVITY__GROUP, Activity.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_GROUP__OWNER :
				return getOwner();
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
				return getSubgroups();
			case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
				return getContainedEdges();
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
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				setInActivity((Activity) newValue);
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
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				setInActivity((Activity) null);
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
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_GROUP__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				return getInActivity() != null;
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
				return isSetContainedEdges();
		}
		return eDynamicIsSet(eFeature);
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
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || isSetSubgroups();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		return null;
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
	public Element getOwner() {
		if (isSetSuperGroup()) {
			return getSuperGroup();
		}
		Activity inActivity = getInActivity();
		if (inActivity != null) {
			return inActivity;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner() || isSetSuperGroup()
			|| eIsSet(UMLPackage.eINSTANCE.getActivityGroup_InActivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return false;
	}

} //ActivityGroupImpl
