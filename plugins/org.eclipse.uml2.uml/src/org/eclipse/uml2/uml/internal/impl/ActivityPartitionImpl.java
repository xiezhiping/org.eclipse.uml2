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
 * $Id: ActivityPartitionImpl.java,v 1.12 2006/01/03 18:01:57 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityGroupOperations;
import org.eclipse.uml2.uml.internal.operations.ActivityPartitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#isDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#isExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSubpartitions <em>Subpartition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getEdges <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl
		extends NamedElementImpl
		implements ActivityPartition {

	/**
	 * The default value of the '{@link #isDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DIMENSION_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_EXTERNAL_EFLAG = 1 << 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubgroups() {
		EList subgroup = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__SUBGROUP);
		if (subgroup == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__SUBGROUP,
				subgroup = new DerivedUnionEObjectEList(ActivityGroup.class,
					this, UMLPackage.ACTIVITY_PARTITION__SUBGROUP,
					new int[]{UMLPackage.ACTIVITY_PARTITION__SUBPARTITION}));
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT,
					new int[]{UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT,
						UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION,
						UMLPackage.ACTIVITY_PARTITION__SUBGROUP}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		EList containedNode = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE);
		if (containedNode == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE,
				containedNode = new DerivedUnionEObjectEList(
					ActivityNode.class, this,
					UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE,
					new int[]{UMLPackage.ACTIVITY_PARTITION__NODE}));
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
	public EList getContainedEdges() {
		EList containedEdge = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE);
		if (containedEdge == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE,
				containedEdge = new DerivedUnionEObjectEList(
					ActivityEdge.class, this,
					UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE,
					new int[]{UMLPackage.ACTIVITY_PARTITION__EDGE}));
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
		if (eContainerFeatureID != UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY)
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
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY && newInActivity != null)) {
			if (EcoreUtil.isAncestor(this, newInActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInActivity != null)
				msgs = ((InternalEObject) newInActivity).eInverseAdd(this,
					UMLPackage.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newInActivity,
				UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY, newInActivity,
				newInActivity));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDimension() {
		return (eFlags & IS_DIMENSION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = (eFlags & IS_DIMENSION_EFLAG) != 0;
		if (newIsDimension)
			eFlags |= IS_DIMENSION_EFLAG;
		else
			eFlags &= ~IS_DIMENSION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension,
				newIsDimension));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return (eFlags & IS_EXTERNAL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = (eFlags & IS_EXTERNAL_EFLAG) != 0;
		if (newIsExternal)
			eFlags |= IS_EXTERNAL_EFLAG;
		else
			eFlags &= ~IS_EXTERNAL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal,
				newIsExternal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		EList edge = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__EDGE);
		if (edge == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__EDGE,
				edge = new EObjectWithInverseResolvingEList.ManyInverse(
					ActivityEdge.class, this,
					UMLPackage.ACTIVITY_PARTITION__EDGE,
					UMLPackage.ACTIVITY_EDGE__IN_PARTITION));
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name) {
		for (Iterator i = getEdges().iterator(); i.hasNext();) {
			ActivityEdge edge = (ActivityEdge) i.next();
			if (name.equals(edge.getName())) {
				return edge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		EList node = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__NODE);
		if (node == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__NODE,
				node = new EObjectWithInverseResolvingEList.ManyInverse(
					ActivityNode.class, this,
					UMLPackage.ACTIVITY_PARTITION__NODE,
					UMLPackage.ACTIVITY_NODE__IN_PARTITION));
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		for (Iterator i = getNodes().iterator(); i.hasNext();) {
			ActivityNode node = (ActivityNode) i.next();
			if (name.equals(node.getName())) {
				return node;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubpartitions() {
		EList subpartition = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__SUBPARTITION);
		if (subpartition == null) {
			eVirtualSet(UMLPackage.ACTIVITY_PARTITION__SUBPARTITION,
				subpartition = new EObjectContainmentWithInverseEList(
					ActivityPartition.class, this,
					UMLPackage.ACTIVITY_PARTITION__SUBPARTITION,
					UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION));
		}
		return subpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createSubpartition() {
		ActivityPartition newSubpartition = UMLFactory.eINSTANCE
			.createActivityPartition();
		getSubpartitions().add(newSubpartition);
		return newSubpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSubpartition(String name) {
		for (Iterator i = getSubpartitions().iterator(); i.hasNext();) {
			ActivityPartition subpartition = (ActivityPartition) i.next();
			if (name.equals(subpartition.getName())) {
				return subpartition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		if (eContainerFeatureID != UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION)
			return null;
		return (ActivityPartition) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPartition))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPartition != null)
				msgs = ((InternalEObject) newSuperPartition).eInverseAdd(this,
					UMLPackage.ACTIVITY_PARTITION__SUBPARTITION,
					ActivityPartition.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newSuperPartition,
				UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION,
				newSuperPartition, newSuperPartition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRepresents() {
		Element represents = (Element) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__REPRESENTS);
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject) represents;
			represents = (Element) eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				eVirtualSet(UMLPackage.ACTIVITY_PARTITION__REPRESENTS,
					represents);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_PARTITION__REPRESENTS,
						oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRepresents() {
		return (Element) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__REPRESENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Element newRepresents) {
		Element represents = newRepresents;
		Object oldRepresents = eVirtualSet(
			UMLPackage.ACTIVITY_PARTITION__REPRESENTS, represents);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARTITION__REPRESENTS,
				oldRepresents == EVIRTUAL_NO_VALUE
					? null
					: oldRepresents, represents));

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
	public boolean validateDimensionNotContained(DiagnosticChain diagnostics,
			Map context) {
		return ActivityPartitionOperations.validateDimensionNotContained(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentsPart(DiagnosticChain diagnostics,
			Map context) {
		return ActivityPartitionOperations.validateRepresentsPart(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentsClassifier(DiagnosticChain diagnostics,
			Map context) {
		return ActivityPartitionOperations.validateRepresentsClassifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentsPartAndIsContained(
			DiagnosticChain diagnostics, Map context) {
		return ActivityPartitionOperations
			.validateRepresentsPartAndIsContained(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY, msgs);
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return ((InternalEList) getNodes()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return ((InternalEList) getSubpartitions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				return ((InternalEList) getEdges()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY, msgs);
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return ((InternalEList) getSubpartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				return eBasicSetContainer(null,
					UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.ACTIVITY__GROUP, Activity.class, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.ACTIVITY_PARTITION__SUBPARTITION,
					ActivityPartition.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_PARTITION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				return getName();
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_PARTITION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_PARTITION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACTIVITY_PARTITION__SUBGROUP :
				return getSubgroups();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				return isDimension()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				return isExternal()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return getNodes();
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return getSubpartitions();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				return getSuperPartition();
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				if (resolve)
					return getRepresents();
				return basicGetRepresents();
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				return getEdges();
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
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				setIsDimension(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				setIsExternal(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				getSubpartitions().clear();
				getSubpartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				setSuperPartition((ActivityPartition) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				setRepresents((Element) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
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
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				getNodes().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				getSubpartitions().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				setSuperPartition((ActivityPartition) null);
				return;
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				setRepresents((Element) null);
				return;
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				getEdges().clear();
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
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_PARTITION__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY_PARTITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION) != null;
			case UMLPackage.ACTIVITY_PARTITION__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				return getInActivity() != null;
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				return ((eFlags & IS_DIMENSION_EFLAG) != 0) != IS_DIMENSION_EDEFAULT;
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				return ((eFlags & IS_EXTERNAL_EFLAG) != 0) != IS_EXTERNAL_EDEFAULT;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				EList node = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				EList subpartition = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__SUBPARTITION);
				return subpartition != null && !subpartition.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				return getSuperPartition() != null;
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				return eVirtualGet(UMLPackage.ACTIVITY_PARTITION__REPRESENTS) != null;
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				EList edge = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARTITION__EDGE);
				return edge != null && !edge.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UMLPackage.ACTIVITY_PARTITION__SUBGROUP :
					return UMLPackage.ACTIVITY_GROUP__SUBGROUP;
				case UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP :
					return UMLPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
					return UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE :
					return UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				case UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE :
					return UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
					return UMLPackage.ACTIVITY_PARTITION__SUBGROUP;
				case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
					return UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP;
				case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
					return UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY;
				case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
					return UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE;
				case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
					return UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDimension: "); //$NON-NLS-1$
		result.append((eFlags & IS_DIMENSION_EFLAG) != 0);
		result.append(", isExternal: "); //$NON-NLS-1$
		result.append((eFlags & IS_EXTERNAL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubgroups() {
		return eIsSet(UMLPackage.ACTIVITY_PARTITION__SUBPARTITION);
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
		ActivityPartition superPartition = getSuperPartition();
		if (superPartition != null) {
			return superPartition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperGroup() {
		return eIsSet(UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (isSetSuperGroup()) {
			return getSuperGroup();
		}
		Activity inActivity = getInActivity();
		if (inActivity != null) {
			return inActivity;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner() || isSetSuperGroup()
			|| eIsSet(UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return eIsSet(UMLPackage.ACTIVITY_PARTITION__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return eIsSet(UMLPackage.ACTIVITY_PARTITION__EDGE);
	}

} //ActivityPartitionImpl
