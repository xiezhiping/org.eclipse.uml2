/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 465214, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityContent;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInInterruptibleRegions <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getRedefinedNodes <em>Redefined Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl#getInPartitions <em>In Partition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityNodeImpl
		extends RedefinableElementImpl
		implements ActivityNode {

	/**
	 * The cached value of the '{@link #getInInterruptibleRegions() <em>In Interruptible Region</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<InterruptibleActivityRegion> inInterruptibleRegions;

	/**
	 * The cached value of the '{@link #getIncomings() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incomings;

	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoings;

	/**
	 * The cached value of the '{@link #getRedefinedNodes() <em>Redefined Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> redefinedNodes;

	/**
	 * The cached value of the '{@link #getInPartitions() <em>In Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> inPartitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getInGroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityGroup> inGroups = (EList<ActivityGroup>) cache.get(
				eResource, this, UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
			if (inGroups == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP,
					inGroups = new DerivedUnionEObjectEList<ActivityGroup>(
						ActivityGroup.class, this,
						UMLPackage.ACTIVITY_NODE__IN_GROUP, IN_GROUP_ESUBSETS));
			}
			return inGroups;
		}
		return new DerivedUnionEObjectEList<ActivityGroup>(ActivityGroup.class,
			this, UMLPackage.ACTIVITY_NODE__IN_GROUP, IN_GROUP_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedefinableElement> getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<RedefinableElement> redefinedElements = (EList<RedefinableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList<RedefinableElement>(
						RedefinableElement.class, this,
						UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList<ActivityEdge>(
				ActivityEdge.class, this, UMLPackage.ACTIVITY_NODE__OUTGOING,
				UMLPackage.ACTIVITY_EDGE__SOURCE);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getOutgoing(String name) {
		return getOutgoing(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getOutgoing(String name, boolean ignoreCase,
			EClass eClass) {
		outgoingLoop : for (ActivityEdge outgoing : getOutgoings()) {
			if (eClass != null && !eClass.isInstance(outgoing))
				continue outgoingLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(outgoing.getName())
				: name.equals(outgoing.getName())))
				continue outgoingLoop;
			return outgoing;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartitions() {
		if (inPartitions == null) {
			inPartitions = new EObjectWithInverseResolvingEList.ManyInverse<ActivityPartition>(
				ActivityPartition.class, this,
				UMLPackage.ACTIVITY_NODE__IN_PARTITION,
				UMLPackage.ACTIVITY_PARTITION__NODE);
		}
		return inPartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getInPartition(String name) {
		return getInPartition(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getInPartition(String name, boolean ignoreCase) {
		inPartitionLoop : for (ActivityPartition inPartition : getInPartitions()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inPartition.getName())
				: name.equals(inPartition.getName())))
				continue inPartitionLoop;
			return inPartition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity containingActivity() {
		return ActivityNodeOperations.containingActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return ActivityNodeOperations.isConsistentWith(this, redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE)
			return null;
		return (StructuredActivityNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetInStructuredNode() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE)
			return null;
		return (StructuredActivityNode) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(
			StructuredActivityNode newInStructuredNode,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInStructuredNode,
			UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(
			StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE
				&& newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject) newInStructuredNode).eInverseAdd(this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
					StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE,
				newInStructuredNode, newInStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		Activity activity = basicGetActivity();
		return activity != null && activity.eIsProxy()
			? (Activity) eResolveProxy((InternalEObject) activity)
			: activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity basicGetActivity() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof Activity
			? (Activity) eInternalContainer
			: null;
	}

	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		InternalEObject eInternalContainer = eInternalContainer();
		if (eInternalContainer instanceof Activity) {
			return ((InternalEList<ActivityNode>) ((Activity) eInternalContainer)
				.getNodes()).basicRemove(this, msgs);
		}
		return super.eBasicRemoveFromContainer(msgs);
	}

	@Override
	public NotificationChain eBasicSetContainer(InternalEObject newContainer,
			int newContainerFeatureID, NotificationChain msgs) {
		InternalEObject eInternalContainer = eInternalContainer();
		if (eInternalContainer instanceof Activity) {
			msgs = ((InternalEList<ActivityNode>) ((Activity) eInternalContainer)
				.getNodes()).basicRemove(this, msgs);
		}
		return super.eBasicSetContainer(newContainer, newContainerFeatureID,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEList<ActivityNode>) newActivity
					.getOwnedNodes()).basicAdd(this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newActivity,
				InternalEObject.EOPPOSITE_FEATURE_BASE
					- UMLPackage.ACTIVITY__OWNED_NODE,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_NODE__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectWithInverseResolvingEList<ActivityEdge>(
				ActivityEdge.class, this, UMLPackage.ACTIVITY_NODE__INCOMING,
				UMLPackage.ACTIVITY_EDGE__TARGET);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getIncoming(String name) {
		return getIncoming(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getIncoming(String name, boolean ignoreCase,
			EClass eClass) {
		incomingLoop : for (ActivityEdge incoming : getIncomings()) {
			if (eClass != null && !eClass.isInstance(incoming))
				continue incomingLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(incoming.getName())
				: name.equals(incoming.getName())))
				continue incomingLoop;
			return incoming;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptibleActivityRegion> getInInterruptibleRegions() {
		if (inInterruptibleRegions == null) {
			inInterruptibleRegions = new EObjectWithInverseResolvingEList.ManyInverse<InterruptibleActivityRegion>(
				InterruptibleActivityRegion.class, this,
				UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION,
				UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE);
		}
		return inInterruptibleRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInInterruptibleRegion(String name) {
		return getInInterruptibleRegion(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInInterruptibleRegion(String name,
			boolean ignoreCase) {
		inInterruptibleRegionLoop : for (InterruptibleActivityRegion inInterruptibleRegion : getInInterruptibleRegions()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inInterruptibleRegion.getName())
				: name.equals(inInterruptibleRegion.getName())))
				continue inInterruptibleRegionLoop;
			return inInterruptibleRegion;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getRedefinedNodes() {
		if (redefinedNodes == null) {
			redefinedNodes = new EObjectResolvingEList<ActivityNode>(
				ActivityNode.class, this,
				UMLPackage.ACTIVITY_NODE__REDEFINED_NODE);
		}
		return redefinedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getRedefinedNode(String name) {
		return getRedefinedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getRedefinedNode(String name, boolean ignoreCase,
			EClass eClass) {
		redefinedNodeLoop : for (ActivityNode redefinedNode : getRedefinedNodes()) {
			if (eClass != null && !eClass.isInstance(redefinedNode))
				continue redefinedNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedNode.getName())
				: name.equals(redefinedNode.getName())))
				continue redefinedNodeLoop;
			return redefinedNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInInterruptibleRegions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode(
					(StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInPartitions())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
					StructuredActivityNode.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_NODE__NAME :
				return getName();
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTIVITY_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACTIVITY_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				return getInPartitions();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTIVITY_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTIVITY_NODE__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTIVITY_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTIVITY_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTIVITY_NODE__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACTIVITY_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACTIVITY_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ACTIVITY_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ACTIVITY_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ACTIVITY_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ActivityContent.class) {
			switch (baseOperationID) {
				case UMLPackage.ACTIVITY_CONTENT___CONTAINING_ACTIVITY :
					return UMLPackage.ACTIVITY_NODE___CONTAINING_ACTIVITY;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.ACTIVITY_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTIVITY_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTIVITY_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTIVITY_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTIVITY_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.ACTIVITY_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTIVITY_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTIVITY_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTIVITY_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTIVITY_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTIVITY_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTIVITY_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTIVITY_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTIVITY_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTIVITY_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTIVITY_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTIVITY_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTIVITY_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_NODE___SEPARATOR :
				return separator();
			case UMLPackage.ACTIVITY_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ACTIVITY_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInGroups() <em>In Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int[] IN_GROUP_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION,
		UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE,
		UMLPackage.ACTIVITY_NODE__IN_PARTITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getInGroup(String name) {
		return getInGroup(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getInGroup(String name, boolean ignoreCase,
			EClass eClass) {
		inGroupLoop : for (ActivityGroup inGroup : getInGroups()) {
			if (eClass != null && !eClass.isInstance(inGroup))
				continue inGroupLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inGroup.getName())
				: name.equals(inGroup.getName())))
				continue inGroupLoop;
			return inGroup;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInGroups() {
		return eIsSet(UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION)
			|| eIsSet(UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE)
			|| eIsSet(UMLPackage.ACTIVITY_NODE__IN_PARTITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		Activity activity = basicGetActivity();
		if (activity != null) {
			return activity;
		}
		StructuredActivityNode inStructuredNode = basicGetInStructuredNode();
		if (inStructuredNode != null) {
			return inStructuredNode;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.ACTIVITY_NODE__ACTIVITY)
			|| eIsSet(UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_NODE__REDEFINED_NODE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.ACTIVITY_NODE__REDEFINED_NODE);
	}

} //ActivityNodeImpl
