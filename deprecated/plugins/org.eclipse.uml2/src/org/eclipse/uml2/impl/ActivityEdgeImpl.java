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
 * $Id: ActivityEdgeImpl.java,v 1.26 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.ActivityPartition;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActivityEdgeImpl#getInterrupts <em>Interrupts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityEdgeImpl extends RedefinableElementImpl implements ActivityEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard = null;

	/**
	 * The cached value of the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedElements = null;

	/**
	 * The cached value of the '{@link #getInPartitions() <em>In Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList inPartitions = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification weight = null;

	/**
	 * The cached value of the '{@link #getInterrupts() <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion interrupts = null;

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
		return UML2Package.Literals.ACTIVITY_EDGE;
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
	public Activity getActivity() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_EDGE__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, UML2Package.ACTIVITY_EDGE__ACTIVITY, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID != UML2Package.ACTIVITY_EDGE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, UML2Package.ACTIVITY__EDGE, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__ACTIVITY, newActivity, newActivity));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_EDGE__SOURCE, oldSource, source));
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
	public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, UML2Package.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, UML2Package.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__SOURCE, newSource, newSource));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_EDGE__TARGET, oldTarget, target));
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
	public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, UML2Package.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, UML2Package.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__TARGET, newTarget, newTarget));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInGroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inGroups = (EList) cache.get(eResource, this, UML2Package.Literals.ACTIVITY_EDGE__IN_GROUP);
			if (inGroups == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTIVITY_EDGE__IN_GROUP, inGroups = new DerivedUnionEObjectEList(ActivityGroup.class, this, UML2Package.ACTIVITY_EDGE__IN_GROUP, IN_GROUP_ESUBSETS));
			}
			return inGroups;
		}
		return new DerivedUnionEObjectEList(ActivityGroup.class, this, UML2Package.ACTIVITY_EDGE__IN_GROUP, IN_GROUP_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInGroups() {
		return eIsSet(UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE)
			|| eIsSet(UML2Package.ACTIVITY_EDGE__IN_PARTITION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInGroups() <em>In Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int[] IN_GROUP_ESUBSETS = new int[] {UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE, UML2Package.ACTIVITY_EDGE__IN_PARTITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ACTIVITY_EDGE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.ACTIVITY_EDGE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.ACTIVITY_EDGE__GUARD)
			|| eIsSet(UML2Package.ACTIVITY_EDGE__WEIGHT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.ACTIVITY_EDGE__OWNED_COMMENT, UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING, UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE, UML2Package.ACTIVITY_EDGE__NAME_EXPRESSION, UML2Package.ACTIVITY_EDGE__GUARD, UML2Package.ACTIVITY_EDGE__WEIGHT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard, NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_EDGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_EDGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__GUARD, newGuard, newGuard));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createGuard(EClass eClass) {
		ValueSpecification newGuard = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY_EDGE__GUARD, null, newGuard));
		}
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		if (redefinedElements == null) {
			redefinedElements = new EObjectResolvingEList(ActivityEdge.class, this, UML2Package.ACTIVITY_EDGE__REDEFINED_ELEMENT);
		}
		return redefinedElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return redefinedElements != null && !redefinedElements.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public RedefinableElement getRedefinedElement(String name) {
		return getRedefinedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name, boolean ignoreCase, EClass eClass) {
		redefinedElementLoop: for (Iterator i = getRedefinedElements().iterator(); i.hasNext(); ) {
			ActivityEdge redefinedElement = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedElement.getName()) : name.equals(redefinedElement.getName())))
				continue redefinedElementLoop;
			return redefinedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID != UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID != UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInPartitions() {
		if (inPartitions == null) {
			inPartitions = new EObjectWithInverseResolvingEList.ManyInverse(ActivityPartition.class, this, UML2Package.ACTIVITY_EDGE__IN_PARTITION, UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE);
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
		inPartitionLoop: for (Iterator i = getInPartitions().iterator(); i.hasNext(); ) {
			ActivityPartition inPartition = (ActivityPartition) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(inPartition.getName()) : name.equals(inPartition.getName())))
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
	public ValueSpecification getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight, NotificationChain msgs) {
		ValueSpecification oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_EDGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_EDGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__WEIGHT, newWeight, newWeight));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createWeight(EClass eClass) {
		ValueSpecification newWeight = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ACTIVITY_EDGE__WEIGHT, null, newWeight));
		}
		setWeight(newWeight);
		return newWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInterrupts() {
		if (interrupts != null && interrupts.eIsProxy()) {
			InternalEObject oldInterrupts = (InternalEObject)interrupts;
			interrupts = (InterruptibleActivityRegion)eResolveProxy(oldInterrupts);
			if (interrupts != oldInterrupts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts, interrupts));
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
	public NotificationChain basicSetInterrupts(InterruptibleActivityRegion newInterrupts, NotificationChain msgs) {
		InterruptibleActivityRegion oldInterrupts = interrupts;
		interrupts = newInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts, newInterrupts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)interrupts).eInverseRemove(this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject)newInterrupts).eInverseAdd(this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
			msgs = basicSetInterrupts(newInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_EDGE__INTERRUPTS, newInterrupts, newInterrupts));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ACTIVITY_EDGE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, UML2Package.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
				return basicSetSource((ActivityNode)otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, UML2Package.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
				return basicSetTarget((ActivityNode)otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__INTERRUPTS:
				if (interrupts != null)
					msgs = ((InternalEObject)interrupts).eInverseRemove(this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts((InterruptibleActivityRegion)otherEnd, msgs);
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
			case UML2Package.ACTIVITY_EDGE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ACTIVITY_EDGE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.ACTIVITY_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case UML2Package.ACTIVITY_EDGE__TARGET:
				return basicSetTarget(null, msgs);
			case UML2Package.ACTIVITY_EDGE__GUARD:
				return basicSetGuard(null, msgs);
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.ACTIVITY_EDGE__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_EDGE__WEIGHT:
				return basicSetWeight(null, msgs);
			case UML2Package.ACTIVITY_EDGE__INTERRUPTS:
				return basicSetInterrupts(null, msgs);
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
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY__EDGE, Activity.class, msgs);
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return eInternalContainer().eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, StructuredActivityNode.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
		return super.isSetOwner()
			|| eIsSet(UML2Package.ACTIVITY_EDGE__ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ACTIVITY_EDGE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ACTIVITY_EDGE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ACTIVITY_EDGE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ACTIVITY_EDGE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ACTIVITY_EDGE__NAME:
				return getName();
			case UML2Package.ACTIVITY_EDGE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ACTIVITY_EDGE__VISIBILITY:
				return getVisibility();
			case UML2Package.ACTIVITY_EDGE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ACTIVITY_EDGE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ACTIVITY_EDGE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ACTIVITY_EDGE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				return getActivity();
			case UML2Package.ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UML2Package.ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UML2Package.ACTIVITY_EDGE__IN_GROUP:
				return getInGroups();
			case UML2Package.ACTIVITY_EDGE__GUARD:
				return getGuard();
			case UML2Package.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.ACTIVITY_EDGE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.ACTIVITY_EDGE__WEIGHT:
				return getWeight();
			case UML2Package.ACTIVITY_EDGE__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
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
			case UML2Package.ACTIVITY_EDGE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case UML2Package.ACTIVITY_EDGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
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
			case UML2Package.ACTIVITY_EDGE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ACTIVITY_EDGE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ACTIVITY_EDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_EDGE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_EDGE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ACTIVITY_EDGE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ACTIVITY_EDGE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case UML2Package.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case UML2Package.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case UML2Package.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.ACTIVITY_EDGE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.ACTIVITY_EDGE__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case UML2Package.ACTIVITY_EDGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
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
			case UML2Package.ACTIVITY_EDGE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ACTIVITY_EDGE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ACTIVITY_EDGE__OWNER:
				return isSetOwner();
			case UML2Package.ACTIVITY_EDGE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ACTIVITY_EDGE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ACTIVITY_EDGE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ACTIVITY_EDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ACTIVITY_EDGE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ACTIVITY_EDGE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ACTIVITY_EDGE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ACTIVITY_EDGE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ACTIVITY_EDGE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ACTIVITY_EDGE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ACTIVITY_EDGE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.ACTIVITY_EDGE__SOURCE:
				return source != null;
			case UML2Package.ACTIVITY_EDGE__TARGET:
				return target != null;
			case UML2Package.ACTIVITY_EDGE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.ACTIVITY_EDGE__GUARD:
				return guard != null;
			case UML2Package.ACTIVITY_EDGE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.ACTIVITY_EDGE__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.ACTIVITY_EDGE__WEIGHT:
				return weight != null;
			case UML2Package.ACTIVITY_EDGE__INTERRUPTS:
				return interrupts != null;
		}
		return eDynamicIsSet(featureID);
	}


} //ActivityEdgeImpl
