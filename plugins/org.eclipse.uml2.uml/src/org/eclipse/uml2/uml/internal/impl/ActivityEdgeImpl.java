/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityEdgeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getRedefinedEdges <em>Redefined Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityEdgeImpl
		extends RedefinableElementImpl
		implements ActivityEdge {

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard;

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
	 * The cached value of the '{@link #getInterrupts() <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion interrupts;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getRedefinedEdges() <em>Redefined Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> redefinedEdges;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification weight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_EDGE;
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
				eResource, this, UMLPackage.Literals.ACTIVITY_EDGE__IN_GROUP);
			if (inGroups == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_EDGE__IN_GROUP,
					inGroups = new DerivedUnionEObjectEList<ActivityGroup>(
						ActivityGroup.class, this,
						UMLPackage.ACTIVITY_EDGE__IN_GROUP, IN_GROUP_ESUBSETS));
			}
			return inGroups;
		}
		return new DerivedUnionEObjectEList<ActivityGroup>(ActivityGroup.class,
			this, UMLPackage.ACTIVITY_EDGE__IN_GROUP, IN_GROUP_ESUBSETS);
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
						UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this,
			UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_EDGE__ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_EDGE__ACTIVITY)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newActivity,
			UMLPackage.ACTIVITY_EDGE__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.ACTIVITY_EDGE__ACTIVITY
				&& newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this,
					UMLPackage.ACTIVITY__EDGE, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__ACTIVITY, newActivity, newActivity));
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
				UMLPackage.ACTIVITY_EDGE__IN_PARTITION,
				UMLPackage.ACTIVITY_PARTITION__EDGE);
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
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE)
			return null;
		return (StructuredActivityNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetInStructuredNode() {
		if (eContainerFeatureID() != UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE)
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
			UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);
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
			|| (eContainerFeatureID() != UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE
				&& newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject) newInStructuredNode).eInverseAdd(this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE,
					StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE,
				newInStructuredNode, newInStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ActivityNode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget,
			NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__TARGET, oldTarget,
				newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
					UMLPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class,
					msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
					UMLPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class,
					msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRedefinedEdges() {
		if (redefinedEdges == null) {
			redefinedEdges = new EObjectResolvingEList<ActivityEdge>(
				ActivityEdge.class, this,
				UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE);
		}
		return redefinedEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getRedefinedEdge(String name) {
		return getRedefinedEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getRedefinedEdge(String name, boolean ignoreCase,
			EClass eClass) {
		redefinedEdgeLoop : for (ActivityEdge redefinedEdge : getRedefinedEdges()) {
			if (eClass != null && !eClass.isInstance(redefinedEdge))
				continue redefinedEdgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedEdge.getName())
				: name.equals(redefinedEdge.getName())))
				continue redefinedEdgeLoop;
			return redefinedEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject) guard;
			guard = (ValueSpecification) eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				InternalEObject newGuard = (InternalEObject) guard;
				NotificationChain msgs = oldGuard.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ACTIVITY_EDGE__GUARD,
					null, null);
				if (newGuard.eInternalContainer() == null) {
					msgs = newGuard.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACTIVITY_EDGE__GUARD, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_EDGE__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard,
			NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__GUARD, oldGuard,
				newGuard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValueSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ACTIVITY_EDGE__GUARD,
					null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ACTIVITY_EDGE__GUARD,
					null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createGuard(String name, Type type,
			EClass eClass) {
		ValueSpecification newGuard = (ValueSpecification) create(eClass);
		setGuard(newGuard);
		if (name != null)
			newGuard.setName(name);
		if (type != null)
			newGuard.setType(type);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWeight() {
		if (weight != null && weight.eIsProxy()) {
			InternalEObject oldWeight = (InternalEObject) weight;
			weight = (ValueSpecification) eResolveProxy(oldWeight);
			if (weight != oldWeight) {
				InternalEObject newWeight = (InternalEObject) weight;
				NotificationChain msgs = oldWeight.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ACTIVITY_EDGE__WEIGHT,
					null, null);
				if (newWeight.eInternalContainer() == null) {
					msgs = newWeight.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACTIVITY_EDGE__WEIGHT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_EDGE__WEIGHT, oldWeight, weight));
			}
		}
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight,
			NotificationChain msgs) {
		ValueSpecification oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__WEIGHT, oldWeight,
				newWeight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(ValueSpecification newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject) weight).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ACTIVITY_EDGE__WEIGHT,
					null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject) newWeight).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ACTIVITY_EDGE__WEIGHT,
					null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createWeight(String name, Type type,
			EClass eClass) {
		ValueSpecification newWeight = (ValueSpecification) create(eClass);
		setWeight(newWeight);
		if (name != null)
			newWeight.setName(name);
		if (type != null)
			newWeight.setType(type);
		return newWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInterrupts() {
		if (interrupts != null && interrupts.eIsProxy()) {
			InternalEObject oldInterrupts = (InternalEObject) interrupts;
			interrupts = (InterruptibleActivityRegion) eResolveProxy(
				oldInterrupts);
			if (interrupts != oldInterrupts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts,
						interrupts));
			}
		}
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInterrupts() {
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterrupts(
			InterruptibleActivityRegion newInterrupts, NotificationChain msgs) {
		InterruptibleActivityRegion oldInterrupts = interrupts;
		interrupts = newInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__INTERRUPTS,
				oldInterrupts, newInterrupts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupts(InterruptibleActivityRegion newInterrupts) {
		if (newInterrupts != interrupts) {
			NotificationChain msgs = null;
			if (interrupts != null)
				msgs = ((InternalEObject) interrupts).eInverseRemove(this,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
					InterruptibleActivityRegion.class, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject) newInterrupts).eInverseAdd(this,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
					InterruptibleActivityRegion.class, msgs);
			msgs = basicSetInterrupts(newInterrupts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__INTERRUPTS, newInterrupts,
				newInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ActivityNode) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource,
			NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__SOURCE, oldSource,
				newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
					UMLPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class,
					msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
					UMLPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class,
					msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceAndTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityEdgeOperations.validateSourceAndTarget(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return ActivityEdgeOperations.isConsistentWith(this, redefiningElement);
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity) otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInPartitions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				if (interrupts != null)
					msgs = ((InternalEObject) interrupts).eInverseRemove(this,
						UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
						InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts(
					(InterruptibleActivityRegion) otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode(
					(StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				if (target != null)
					msgs = ((InternalEObject) target).eInverseRemove(this,
						UMLPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class,
						msgs);
				return basicSetTarget((ActivityNode) otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				if (source != null)
					msgs = ((InternalEObject) source).eInverseRemove(this,
						UMLPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class,
						msgs);
				return basicSetSource((ActivityNode) otherEnd, msgs);
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				return basicSetGuard(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				return basicSetInterrupts(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				return basicSetTarget(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				return basicSetSource(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				return basicSetWeight(null, msgs);
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
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.ACTIVITY__EDGE, Activity.class, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE,
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_EDGE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_EDGE__NAME :
				return getName();
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTIVITY_EDGE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_EDGE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				return isLeaf();
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTIVITY_EDGE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				if (resolve)
					return getGuard();
				return basicGetGuard();
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				if (resolve)
					return getInterrupts();
				return basicGetInterrupts();
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				return getRedefinedEdges();
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				if (resolve)
					return getWeight();
				return basicGetWeight();
			case UMLPackage.ACTIVITY_EDGE__IN_GROUP :
				return getInGroups();
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				setGuard((ValueSpecification) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				setTarget((ActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				setSource((ActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				getRedefinedEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				setWeight((ValueSpecification) newValue);
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				setGuard((ValueSpecification) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				setTarget((ActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				setSource((ActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				setWeight((ValueSpecification) null);
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_EDGE__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTIVITY_EDGE__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTIVITY_EDGE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_EDGE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTIVITY_EDGE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				return guard != null;
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				return interrupts != null;
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				return target != null;
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				return source != null;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				return redefinedEdges != null && !redefinedEdges.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				return weight != null;
			case UMLPackage.ACTIVITY_EDGE__IN_GROUP :
				return isSetInGroups();
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
			case UMLPackage.ACTIVITY_EDGE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTIVITY_EDGE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTIVITY_EDGE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTIVITY_EDGE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTIVITY_EDGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_MODEL :
				return getModel();
			case UMLPackage.ACTIVITY_EDGE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTIVITY_EDGE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTIVITY_EDGE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTIVITY_EDGE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTIVITY_EDGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTIVITY_EDGE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTIVITY_EDGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTIVITY_EDGE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTIVITY_EDGE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTIVITY_EDGE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTIVITY_EDGE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTIVITY_EDGE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTIVITY_EDGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_EDGE___SEPARATOR :
				return separator();
			case UMLPackage.ACTIVITY_EDGE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_EDGE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ACTIVITY_EDGE___VALIDATE_SOURCE_AND_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateSourceAndTarget(
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
		return super.isSetOwner() || eIsSet(UMLPackage.ACTIVITY_EDGE__ACTIVITY)
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInGroups() {
		return eIsSet(UMLPackage.ACTIVITY_EDGE__IN_PARTITION)
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT,
		UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION,
		UMLPackage.ACTIVITY_EDGE__GUARD, UMLPackage.ACTIVITY_EDGE__WEIGHT};

	/**
	 * The array of subset feature identifiers for the '{@link #getInGroups() <em>In Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int[] IN_GROUP_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_EDGE__IN_PARTITION,
		UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE};

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
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE};

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
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__GUARD)
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__WEIGHT);
	}

} //ActivityEdgeImpl
