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
 * $Id: ActivityEdgeImpl.java,v 1.7 2005/12/06 23:21:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getRedefinedEdges <em>Redefined Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEdgeImpl
		extends RedefinableElementImpl
		implements ActivityEdge {

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInGroups() {
		List inGroup = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__IN_GROUP);
		if (inGroup == null) {
			eVirtualSet(UMLPackage.ACTIVITY_EDGE__IN_GROUP,
				inGroup = new DerivedUnionEObjectEList(ActivityGroup.class,
					this, UMLPackage.ACTIVITY_EDGE__IN_GROUP, new int[]{
						UMLPackage.ACTIVITY_EDGE__IN_PARTITION,
						UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE}));
		}
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT,
					new int[]{UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT, new int[]{
						UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT,
						UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION,
						UMLPackage.ACTIVITY_EDGE__GUARD,
						UMLPackage.ACTIVITY_EDGE__WEIGHT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID != UMLPackage.ACTIVITY_EDGE__ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_EDGE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this,
					UMLPackage.ACTIVITY__EDGE, Activity.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newActivity,
				UMLPackage.ACTIVITY_EDGE__ACTIVITY, msgs);
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
	public List getInPartitions() {
		List inPartition = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__IN_PARTITION);
		if (inPartition == null) {
			eVirtualSet(UMLPackage.ACTIVITY_EDGE__IN_PARTITION,
				inPartition = new EObjectWithInverseResolvingEList.ManyInverse(
					ActivityPartition.class, this,
					UMLPackage.ACTIVITY_EDGE__IN_PARTITION,
					UMLPackage.ACTIVITY_PARTITION__EDGE));
		}
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getInPartition(String name) {
		for (Iterator i = getInPartitions().iterator(); i.hasNext();) {
			ActivityPartition inPartition = (ActivityPartition) i.next();
			if (name.equals(inPartition.getName())) {
				return inPartition;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID != UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE)
			return null;
		return (StructuredActivityNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject) newInStructuredNode).eInverseAdd(
					this, UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE,
					StructuredActivityNode.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newInStructuredNode,
				UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);
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
		ActivityNode target = (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ActivityNode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				eVirtualSet(UMLPackage.ACTIVITY_EDGE__TARGET, target);
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
		return (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget,
			NotificationChain msgs) {
		Object oldTarget = eVirtualSet(UMLPackage.ACTIVITY_EDGE__TARGET,
			newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__TARGET,
				oldTarget == EVIRTUAL_NO_VALUE
					? null
					: oldTarget, newTarget);
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
		ActivityNode target = (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__TARGET);
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
	public List getRedefinedEdges() {
		List redefinedEdge = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE);
		if (redefinedEdge == null) {
			eVirtualSet(UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE,
				redefinedEdge = new EObjectResolvingEList(ActivityEdge.class,
					this, UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE));
		}
		return redefinedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getRedefinedEdge(String name) {
		for (Iterator i = getRedefinedEdges().iterator(); i.hasNext();) {
			ActivityEdge redefinedEdge = (ActivityEdge) i.next();
			if (name.equals(redefinedEdge.getName())) {
				return redefinedEdge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		return (ValueSpecification) eVirtualGet(UMLPackage.ACTIVITY_EDGE__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard,
			NotificationChain msgs) {
		Object oldGuard = eVirtualSet(UMLPackage.ACTIVITY_EDGE__GUARD, newGuard);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__GUARD,
				oldGuard == EVIRTUAL_NO_VALUE
					? null
					: oldGuard, newGuard);
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
		ValueSpecification guard = (ValueSpecification) eVirtualGet(UMLPackage.ACTIVITY_EDGE__GUARD);
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
	public ValueSpecification createGuard(EClass eClass) {
		ValueSpecification newGuard = (ValueSpecification) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWeight() {
		return (ValueSpecification) eVirtualGet(UMLPackage.ACTIVITY_EDGE__WEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight,
			NotificationChain msgs) {
		Object oldWeight = eVirtualSet(UMLPackage.ACTIVITY_EDGE__WEIGHT,
			newWeight);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__WEIGHT,
				oldWeight == EVIRTUAL_NO_VALUE
					? null
					: oldWeight, newWeight);
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
		ValueSpecification weight = (ValueSpecification) eVirtualGet(UMLPackage.ACTIVITY_EDGE__WEIGHT);
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
	public ValueSpecification createWeight(EClass eClass) {
		ValueSpecification newWeight = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setWeight(newWeight);
		return newWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInterrupts() {
		InterruptibleActivityRegion interrupts = (InterruptibleActivityRegion) eVirtualGet(UMLPackage.ACTIVITY_EDGE__INTERRUPTS);
		if (interrupts != null && interrupts.eIsProxy()) {
			InternalEObject oldInterrupts = (InternalEObject) interrupts;
			interrupts = (InterruptibleActivityRegion) eResolveProxy(oldInterrupts);
			if (interrupts != oldInterrupts) {
				eVirtualSet(UMLPackage.ACTIVITY_EDGE__INTERRUPTS, interrupts);
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
		return (InterruptibleActivityRegion) eVirtualGet(UMLPackage.ACTIVITY_EDGE__INTERRUPTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterrupts(
			InterruptibleActivityRegion newInterrupts, NotificationChain msgs) {
		Object oldInterrupts = eVirtualSet(
			UMLPackage.ACTIVITY_EDGE__INTERRUPTS, newInterrupts);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__INTERRUPTS,
				oldInterrupts == EVIRTUAL_NO_VALUE
					? null
					: oldInterrupts, newInterrupts);
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
		InterruptibleActivityRegion interrupts = (InterruptibleActivityRegion) eVirtualGet(UMLPackage.ACTIVITY_EDGE__INTERRUPTS);
		if (newInterrupts != interrupts) {
			NotificationChain msgs = null;
			if (interrupts != null)
				msgs = ((InternalEObject) interrupts)
					.eInverseRemove(
						this,
						UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
						InterruptibleActivityRegion.class, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject) newInterrupts)
					.eInverseAdd(
						this,
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
		ActivityNode source = (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__SOURCE);
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ActivityNode) eResolveProxy(oldSource);
			if (source != oldSource) {
				eVirtualSet(UMLPackage.ACTIVITY_EDGE__SOURCE, source);
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
		return (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource,
			NotificationChain msgs) {
		Object oldSource = eVirtualSet(UMLPackage.ACTIVITY_EDGE__SOURCE,
			newSource);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTIVITY_EDGE__SOURCE,
				oldSource == EVIRTUAL_NO_VALUE
					? null
					: oldSource, newSource);
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
		ActivityNode source = (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__SOURCE);
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
			Map context) {
		return ActivityEdgeOperations.validateSourceAndTarget(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwned(DiagnosticChain diagnostics, Map context) {
		return ActivityEdgeOperations.validateOwned(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredNode(DiagnosticChain diagnostics,
			Map context) {
		return ActivityEdgeOperations.validateStructuredNode(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ACTIVITY_EDGE__ACTIVITY, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				ActivityNode target = (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__TARGET);
				if (target != null)
					msgs = ((InternalEObject) target).eInverseRemove(this,
						UMLPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class,
						msgs);
				return basicSetTarget((ActivityNode) otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				InterruptibleActivityRegion interrupts = (InterruptibleActivityRegion) eVirtualGet(UMLPackage.ACTIVITY_EDGE__INTERRUPTS);
				if (interrupts != null)
					msgs = ((InternalEObject) interrupts)
						.eInverseRemove(
							this,
							UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
							InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts(
					(InterruptibleActivityRegion) otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				ActivityNode source = (ActivityNode) eVirtualGet(UMLPackage.ACTIVITY_EDGE__SOURCE);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.ACTIVITY_EDGE__ACTIVITY, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				return basicSetTarget(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				return basicSetGuard(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				return basicSetWeight(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				return basicSetInterrupts(null, msgs);
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				return basicSetSource(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_EDGE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_EDGE__NAME :
				return getName();
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_EDGE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_EDGE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTIVITY_EDGE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				return getActivity();
			case UMLPackage.ACTIVITY_EDGE__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				return getRedefinedEdges();
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				return getGuard();
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				return getWeight();
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				if (resolve)
					return getInterrupts();
				return basicGetInterrupts();
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				setTarget((ActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				getRedefinedEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				setGuard((ValueSpecification) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				setWeight((ValueSpecification) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) newValue);
				return;
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				setSource((ActivityNode) newValue);
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				setTarget((ActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				return;
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				setGuard((ValueSpecification) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				setWeight((ValueSpecification) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) null);
				return;
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				setSource((ActivityNode) null);
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
			case UMLPackage.ACTIVITY_EDGE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ACTIVITY_EDGE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_EDGE__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.ACTIVITY_EDGE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ACTIVITY_EDGE__VISIBILITY :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.ACTIVITY_EDGE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__NAME_EXPRESSION) != null;
			case UMLPackage.ACTIVITY_EDGE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTIVITY_EDGE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTIVITY_EDGE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.ACTIVITY_EDGE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTIVITY_EDGE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.ACTIVITY_EDGE__TARGET :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__TARGET) != null;
			case UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE :
				List redefinedEdge = (List) eVirtualGet(UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE);
				return redefinedEdge != null && !redefinedEdge.isEmpty();
			case UMLPackage.ACTIVITY_EDGE__GUARD :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__GUARD) != null;
			case UMLPackage.ACTIVITY_EDGE__WEIGHT :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__WEIGHT) != null;
			case UMLPackage.ACTIVITY_EDGE__INTERRUPTS :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__INTERRUPTS) != null;
			case UMLPackage.ACTIVITY_EDGE__SOURCE :
				return eVirtualGet(UMLPackage.ACTIVITY_EDGE__SOURCE) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Activity activity = getActivity();
		if (activity != null) {
			return activity;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.ACTIVITY_EDGE__ACTIVITY);
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
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__REDEFINED_EDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__GUARD)
			|| eIsSet(UMLPackage.ACTIVITY_EDGE__WEIGHT);
	}

} //ActivityEdgeImpl
