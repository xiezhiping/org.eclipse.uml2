/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityPartitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#isDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#isExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSubpartitions <em>Subpartition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityPartitionImpl#getEdges <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPartitionImpl
		extends ActivityGroupImpl
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
	protected static final int IS_DIMENSION_EFLAG = 1 << 12;

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
	protected static final int IS_EXTERNAL_EFLAG = 1 << 13;

	/**
	 * The cached value of the '{@link #getNodes() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> nodes;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected Element represents;

	/**
	 * The cached value of the '{@link #getSubpartitions() <em>Subpartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> subpartitions;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edges;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityGroup> getSubgroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityGroup> subgroups = (EList<ActivityGroup>) cache.get(
				eResource, this, UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP);
			if (subgroups == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP,
					subgroups = new DerivedUnionEObjectEList<ActivityGroup>(
						ActivityGroup.class, this,
						UMLPackage.ACTIVITY_PARTITION__SUBGROUP,
						SUBGROUP_ESUBSETS));
			}
			return subgroups;
		}
		return new DerivedUnionEObjectEList<ActivityGroup>(ActivityGroup.class,
			this, UMLPackage.ACTIVITY_PARTITION__SUBGROUP, SUBGROUP_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> getContainedNodes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityNode> containedNodes = (EList<ActivityNode>) cache
				.get(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
			if (containedNodes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE,
					containedNodes = new DerivedUnionEObjectEList<ActivityNode>(
						ActivityNode.class, this,
						UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE,
						CONTAINED_NODE_ESUBSETS));
			}
			return containedNodes;
		}
		return new DerivedUnionEObjectEList<ActivityNode>(ActivityNode.class,
			this, UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE,
			CONTAINED_NODE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getContainedEdges() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityEdge> containedEdges = (EList<ActivityEdge>) cache
				.get(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
			if (containedEdges == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE,
					containedEdges = new DerivedUnionEObjectEList<ActivityEdge>(
						ActivityEdge.class, this,
						UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE,
						CONTAINED_EDGE_ESUBSETS));
			}
			return containedEdges;
		}
		return new DerivedUnionEObjectEList<ActivityEdge>(ActivityEdge.class,
			this, UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE,
			CONTAINED_EDGE_ESUBSETS);
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
	public EList<ActivityEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(
				ActivityEdge.class, this, UMLPackage.ACTIVITY_PARTITION__EDGE,
				UMLPackage.ACTIVITY_EDGE__IN_PARTITION);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name) {
		return getEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name, boolean ignoreCase,
			EClass eClass) {
		edgeLoop : for (ActivityEdge edge : getEdges()) {
			if (eClass != null && !eClass.isInstance(edge))
				continue edgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(edge.getName())
				: name.equals(edge.getName())))
				continue edgeLoop;
			return edge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(
				ActivityNode.class, this, UMLPackage.ACTIVITY_PARTITION__NODE,
				UMLPackage.ACTIVITY_NODE__IN_PARTITION);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		return getNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name, boolean ignoreCase,
			EClass eClass) {
		nodeLoop : for (ActivityNode node : getNodes()) {
			if (eClass != null && !eClass.isInstance(node))
				continue nodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(node.getName())
				: name.equals(node.getName())))
				continue nodeLoop;
			return node;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getSubpartitions() {
		if (subpartitions == null) {
			subpartitions = new EObjectContainmentWithInverseEList.Resolving<ActivityPartition>(
				ActivityPartition.class, this,
				UMLPackage.ACTIVITY_PARTITION__SUBPARTITION,
				UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION);
		}
		return subpartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createSubpartition(String name) {
		ActivityPartition newSubpartition = (ActivityPartition) create(
			UMLPackage.Literals.ACTIVITY_PARTITION);
		getSubpartitions().add(newSubpartition);
		if (name != null)
			newSubpartition.setName(name);
		return newSubpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSubpartition(String name) {
		return getSubpartition(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSubpartition(String name, boolean ignoreCase,
			boolean createOnDemand) {
		subpartitionLoop : for (ActivityPartition subpartition : getSubpartitions()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(subpartition.getName())
				: name.equals(subpartition.getName())))
				continue subpartitionLoop;
			return subpartition;
		}
		return createOnDemand
			? createSubpartition(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION)
			return null;
		return (ActivityPartition) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetSuperPartition() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION)
			return null;
		return (ActivityPartition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPartition(
			ActivityPartition newSuperPartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperPartition,
			UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION
				&& newSuperPartition != null)) {
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
			msgs = basicSetSuperPartition(newSuperPartition, msgs);
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
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject) represents;
			represents = (Element) eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
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
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Element newRepresents) {
		Element oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents,
				represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionNotContained(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityPartitionOperations.validateDimensionNotContained(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentsClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityPartitionOperations.validateRepresentsClassifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentsPropertyAndIsContained(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ActivityPartitionOperations
			.validateRepresentsPropertyAndIsContained(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentsProperty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityPartitionOperations.validateRepresentsProperty(this,
			diagnostics, context);
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
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getNodes())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubpartitions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperPartition((ActivityPartition) otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges())
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
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return ((InternalEList<?>) getSubpartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				return basicSetSuperPartition(null, msgs);
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_PARTITION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				return getName();
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTIVITY_PARTITION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_PARTITION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.ACTIVITY_PARTITION__SUBGROUP :
				return getSubgroups();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				return isDimension();
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				return isExternal();
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return getNodes();
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				if (resolve)
					return getRepresents();
				return basicGetRepresents();
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return getSubpartitions();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				if (resolve)
					return getSuperPartition();
				return basicGetSuperPartition();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				setIsDimension((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				setIsExternal((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				setRepresents((Element) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				getSubpartitions().clear();
				getSubpartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				setSuperPartition((ActivityPartition) newValue);
				return;
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
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
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				unsetVisibility();
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
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				setRepresents((Element) null);
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				getSubpartitions().clear();
				return;
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				setSuperPartition((ActivityPartition) null);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARTITION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_PARTITION__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_PARTITION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTIVITY_PARTITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_PARTITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_PARTITION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.ACTIVITY_PARTITION__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				return basicGetInActivity() != null;
			case UMLPackage.ACTIVITY_PARTITION__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.ACTIVITY_PARTITION__IS_DIMENSION :
				return ((eFlags
					& IS_DIMENSION_EFLAG) != 0) != IS_DIMENSION_EDEFAULT;
			case UMLPackage.ACTIVITY_PARTITION__IS_EXTERNAL :
				return ((eFlags
					& IS_EXTERNAL_EFLAG) != 0) != IS_EXTERNAL_EDEFAULT;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				return nodes != null && !nodes.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__REPRESENTS :
				return represents != null;
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				return subpartitions != null && !subpartitions.isEmpty();
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				return basicGetSuperPartition() != null;
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				return edges != null && !edges.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.ACTIVITY_PARTITION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTIVITY_PARTITION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTIVITY_PARTITION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTIVITY_PARTITION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTIVITY_PARTITION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_MODEL :
				return getModel();
			case UMLPackage.ACTIVITY_PARTITION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTIVITY_PARTITION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTIVITY_PARTITION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTIVITY_PARTITION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTIVITY_PARTITION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTIVITY_PARTITION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTIVITY_PARTITION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTIVITY_PARTITION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTIVITY_PARTITION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTIVITY_PARTITION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTIVITY_PARTITION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTIVITY_PARTITION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTIVITY_PARTITION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTIVITY_PARTITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_PARTITION___SEPARATOR :
				return separator();
			case UMLPackage.ACTIVITY_PARTITION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_PARTITION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNodesAndEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateNotContained((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_REPRESENTS_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateRepresentsClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_REPRESENTS_PROPERTY_AND_IS_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateRepresentsPropertyAndIsContained(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_REPRESENTS_PROPERTY__DIAGNOSTICCHAIN_MAP :
				return validateRepresentsProperty(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_PARTITION___VALIDATE_DIMENSION_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateDimensionNotContained(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isSetSubgroups() {
		return super.isSetSubgroups()
			|| eIsSet(UMLPackage.ACTIVITY_PARTITION__SUBPARTITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup basicGetSuperGroup() {
		ActivityPartition superPartition = basicGetSuperPartition();
		if (superPartition != null) {
			return superPartition;
		}
		return super.basicGetSuperGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy()
			? (ActivityGroup) eResolveProxy((InternalEObject) superGroup)
			: superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSuperGroup() {
		return super.isSetSuperGroup()
			|| eIsSet(UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CONTAINED_NODE_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_PARTITION__NODE};

	/**
	 * The array of subset feature identifiers for the '{@link #getSubgroups() <em>Subgroup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroups()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUBGROUP_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_PARTITION__SUBPARTITION};

	/**
	 * The array of subset feature identifiers for the '{@link #getContainedEdges() <em>Contained Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdges()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CONTAINED_EDGE_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_PARTITION__EDGE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainedNodes() {
		return super.isSetContainedNodes()
			|| eIsSet(UMLPackage.ACTIVITY_PARTITION__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainedEdges() {
		return super.isSetContainedEdges()
			|| eIsSet(UMLPackage.ACTIVITY_PARTITION__EDGE);
	}

} //ActivityPartitionImpl
