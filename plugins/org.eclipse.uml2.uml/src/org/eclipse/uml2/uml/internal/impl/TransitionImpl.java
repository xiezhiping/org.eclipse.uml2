/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TransitionImpl.java,v 1.19 2006/03/15 19:34:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Collections;
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TransitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getTriggers <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl
		extends NamespaceImpl
		implements Transition {

	/**
	 * The default value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_LEAF_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionKind KIND_EDEFAULT = TransitionKind.EXTERNAL_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.TRANSITION__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.TRANSITION__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.TRANSITION__REDEFINED_ELEMENT,
					new int[]{UMLPackage.TRANSITION__REDEFINED_TRANSITION}));
		}
		return redefinedElement;
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
	public RedefinableElement getRedefinedElement(String name,
			boolean ignoreCase, EClass eClass) {
		redefinedElementLoop : for (Iterator i = getRedefinedElements()
			.iterator(); i.hasNext();) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedElement.getName())
				: name.equals(redefinedElement.getName())))
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
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.TRANSITION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.TRANSITION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.TRANSITION__OWNED_ELEMENT, new int[]{
						UMLPackage.TRANSITION__OWNED_COMMENT,
						UMLPackage.TRANSITION__NAME_EXPRESSION,
						UMLPackage.TRANSITION__ELEMENT_IMPORT,
						UMLPackage.TRANSITION__PACKAGE_IMPORT,
						UMLPackage.TRANSITION__OWNED_MEMBER,
						UMLPackage.TRANSITION__EFFECT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		EList ownedRule = (EList) eVirtualGet(UMLPackage.TRANSITION__OWNED_RULE);
		if (ownedRule == null) {
			eVirtualSet(
				UMLPackage.TRANSITION__OWNED_RULE,
				ownedRule = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
					Constraint.class, this, UMLPackage.TRANSITION__OWNED_RULE,
					null, new int[]{UMLPackage.TRANSITION__GUARD},
					UMLPackage.CONSTRAINT__CONTEXT));
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);

			if (result == null) {
				Classifier redefinitionContext = redefinitionContext();
				List redefinitionContexts = redefinitionContext == null
					? Collections.EMPTY_LIST
					: Collections.singletonList(redefinitionContext);
				cache
					.put(
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						result = new EcoreEList.UnmodifiableEList(
							this,
							UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
							redefinitionContexts.size(), redefinitionContexts
								.toArray()));
			}

			return result;
		}

		Classifier redefinitionContext = redefinitionContext();
		List redefinitionContexts = redefinitionContext == null
			? Collections.EMPTY_LIST
			: Collections.singletonList(redefinitionContext);
		return new EcoreEList.UnmodifiableEList(this,
			UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
			redefinitionContexts.size(), redefinitionContexts.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		return getRedefinitionContext(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name, boolean ignoreCase,
			EClass eClass) {
		redefinitionContextLoop : for (Iterator i = getRedefinitionContexts()
			.iterator(); i.hasNext();) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinitionContext.getName())
				: name.equals(redefinitionContext.getName())))
				continue redefinitionContextLoop;
			return redefinitionContext;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return !getRedefinitionContexts().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return (eFlags & IS_LEAF_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = (eFlags & IS_LEAF_EFLAG) != 0;
		if (newIsLeaf)
			eFlags |= IS_LEAF_EFLAG;
		else
			eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind getKind() {
		return (TransitionKind) eVirtualGet(UMLPackage.TRANSITION__KIND,
			KIND_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransitionKind newKind) {
		TransitionKind kind = newKind == null
			? KIND_EDEFAULT
			: newKind;
		Object oldKind = eVirtualSet(UMLPackage.TRANSITION__KIND, kind);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__KIND, oldKind == EVIRTUAL_NO_VALUE
					? KIND_EDEFAULT
					: oldKind, kind));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID != UMLPackage.TRANSITION__CONTAINER)
			return null;
		return (Region) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetContainer() {
		if (eContainerFeatureID != UMLPackage.TRANSITION__CONTAINER)
			return null;
		return (Region) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer,
			UMLPackage.TRANSITION__CONTAINER, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.TRANSITION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
					UMLPackage.REGION__TRANSITION, Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__CONTAINER, newContainer, newContainer));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTarget() {
		Vertex target = (Vertex) eVirtualGet(UMLPackage.TRANSITION__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Vertex) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				eVirtualSet(UMLPackage.TRANSITION__TARGET, target);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetTarget() {
		return (Vertex) eVirtualGet(UMLPackage.TRANSITION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Vertex newTarget,
			NotificationChain msgs) {
		Object oldTarget = eVirtualSet(UMLPackage.TRANSITION__TARGET, newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TRANSITION__TARGET,
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
	public void setTarget(Vertex newTarget) {
		Vertex target = (Vertex) eVirtualGet(UMLPackage.TRANSITION__TARGET);
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
					UMLPackage.VERTEX__INCOMING, Vertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
					UMLPackage.VERTEX__INCOMING, Vertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__TARGET, newTarget, newTarget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRedefinedTransition() {
		Transition redefinedTransition = (Transition) eVirtualGet(UMLPackage.TRANSITION__REDEFINED_TRANSITION);
		if (redefinedTransition != null && redefinedTransition.eIsProxy()) {
			InternalEObject oldRedefinedTransition = (InternalEObject) redefinedTransition;
			redefinedTransition = (Transition) eResolveProxy(oldRedefinedTransition);
			if (redefinedTransition != oldRedefinedTransition) {
				eVirtualSet(UMLPackage.TRANSITION__REDEFINED_TRANSITION,
					redefinedTransition);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TRANSITION__REDEFINED_TRANSITION,
						oldRedefinedTransition, redefinedTransition));
			}
		}
		return redefinedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetRedefinedTransition() {
		return (Transition) eVirtualGet(UMLPackage.TRANSITION__REDEFINED_TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedTransition(Transition newRedefinedTransition) {
		Transition redefinedTransition = newRedefinedTransition;
		Object oldRedefinedTransition = eVirtualSet(
			UMLPackage.TRANSITION__REDEFINED_TRANSITION, redefinedTransition);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__REDEFINED_TRANSITION,
				oldRedefinedTransition == EVIRTUAL_NO_VALUE
					? null
					: oldRedefinedTransition, redefinedTransition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		Constraint guard = (Constraint) eVirtualGet(UMLPackage.TRANSITION__GUARD);
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject) guard;
			guard = (Constraint) eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				eVirtualSet(UMLPackage.TRANSITION__GUARD, guard);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TRANSITION__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetGuard() {
		return (Constraint) eVirtualGet(UMLPackage.TRANSITION__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Constraint newGuard) {
		Constraint guard = newGuard;
		Object oldGuard = eVirtualSet(UMLPackage.TRANSITION__GUARD, guard);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__GUARD, oldGuard == EVIRTUAL_NO_VALUE
					? null
					: oldGuard, guard));

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newGuard != null) {
				EList ownedRule = getOwnedRules();
				if (!ownedRule.contains(newGuard)) {
					ownedRule.add(newGuard);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createGuard(String name, EClass eClass) {
		Constraint newGuard = (Constraint) create(eClass);
		if (name != null)
			newGuard.setName(name);
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createGuard(String name) {
		return createGuard(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEffect() {
		Behavior effect = (Behavior) eVirtualGet(UMLPackage.TRANSITION__EFFECT);
		if (effect != null && effect.eIsProxy()) {
			InternalEObject oldEffect = (InternalEObject) effect;
			effect = (Behavior) eResolveProxy(oldEffect);
			if (effect != oldEffect) {
				InternalEObject newEffect = (InternalEObject) effect;
				NotificationChain msgs = oldEffect.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TRANSITION__EFFECT,
					null, null);
				if (newEffect.eInternalContainer() == null) {
					msgs = newEffect.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TRANSITION__EFFECT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TRANSITION__EFFECT, oldEffect, effect));
			}
		}
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetEffect() {
		return (Behavior) eVirtualGet(UMLPackage.TRANSITION__EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Behavior newEffect,
			NotificationChain msgs) {
		Object oldEffect = eVirtualSet(UMLPackage.TRANSITION__EFFECT, newEffect);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TRANSITION__EFFECT,
				oldEffect == EVIRTUAL_NO_VALUE
					? null
					: oldEffect, newEffect);
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
	public void setEffect(Behavior newEffect) {
		Behavior effect = (Behavior) eVirtualGet(UMLPackage.TRANSITION__EFFECT);
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject) effect).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TRANSITION__EFFECT,
					null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject) newEffect).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TRANSITION__EFFECT,
					null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__EFFECT, newEffect, newEffect));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createEffect(String name, EClass eClass) {
		Behavior newEffect = (Behavior) create(eClass);
		if (name != null)
			newEffect.setName(name);
		setEffect(newEffect);
		return newEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTriggers() {
		EList trigger = (EList) eVirtualGet(UMLPackage.TRANSITION__TRIGGER);
		if (trigger == null) {
			eVirtualSet(UMLPackage.TRANSITION__TRIGGER,
				trigger = new EObjectContainmentEList.Resolving(Trigger.class,
					this, UMLPackage.TRANSITION__TRIGGER));
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger(String name) {
		Trigger newTrigger = (Trigger) create(UMLPackage.Literals.TRIGGER);
		if (name != null)
			newTrigger.setName(name);
		getTriggers().add(newTrigger);
		return newTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name) {
		return getTrigger(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name, boolean ignoreCase,
			boolean createOnDemand) {
		triggerLoop : for (Iterator i = getTriggers().iterator(); i.hasNext();) {
			Trigger trigger = (Trigger) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(trigger.getName())
				: name.equals(trigger.getName())))
				continue triggerLoop;
			return trigger;
		}
		return createOnDemand
			? createTrigger(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		Vertex source = (Vertex) eVirtualGet(UMLPackage.TRANSITION__SOURCE);
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Vertex) eResolveProxy(oldSource);
			if (source != oldSource) {
				eVirtualSet(UMLPackage.TRANSITION__SOURCE, source);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		return (Vertex) eVirtualGet(UMLPackage.TRANSITION__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Vertex newSource,
			NotificationChain msgs) {
		Object oldSource = eVirtualSet(UMLPackage.TRANSITION__SOURCE, newSource);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TRANSITION__SOURCE,
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
	public void setSource(Vertex newSource) {
		Vertex source = (Vertex) eVirtualGet(UMLPackage.TRANSITION__SOURCE);
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
					UMLPackage.VERTEX__OUTGOING, Vertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
					UMLPackage.VERTEX__OUTGOING, Vertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__SOURCE, newSource, newSource));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(
			DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkSegmentGuards(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateForkSegmentGuards(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinSegmentGuards(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateJoinSegmentGuards(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkSegmentState(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateForkSegmentState(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinSegmentState(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateJoinSegmentState(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutgoingPseudostates(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateOutgoingPseudostates(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialTransition(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateInitialTransition(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignaturesCompatible(DiagnosticChain diagnostics,
			Map context) {
		return TransitionOperations.validateSignaturesCompatible(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier redefinitionContext() {
		return TransitionOperations.redefinitionContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine containingStateMachine() {
		return TransitionOperations.containingStateMachine(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return TransitionOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TRANSITION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
			case UMLPackage.TRANSITION__TARGET :
				Vertex target = (Vertex) eVirtualGet(UMLPackage.TRANSITION__TARGET);
				if (target != null)
					msgs = ((InternalEObject) target).eInverseRemove(this,
						UMLPackage.VERTEX__INCOMING, Vertex.class, msgs);
				return basicSetTarget((Vertex) otherEnd, msgs);
			case UMLPackage.TRANSITION__SOURCE :
				Vertex source = (Vertex) eVirtualGet(UMLPackage.TRANSITION__SOURCE);
				if (source != null)
					msgs = ((InternalEObject) source).eInverseRemove(this,
						UMLPackage.VERTEX__OUTGOING, Vertex.class, msgs);
				return basicSetSource((Vertex) otherEnd, msgs);
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
			case UMLPackage.TRANSITION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__CONTAINER :
				return basicSetContainer(null, msgs);
			case UMLPackage.TRANSITION__TARGET :
				return basicSetTarget(null, msgs);
			case UMLPackage.TRANSITION__EFFECT :
				return basicSetEffect(null, msgs);
			case UMLPackage.TRANSITION__TRIGGER :
				return ((InternalEList) getTriggers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__SOURCE :
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
			case UMLPackage.TRANSITION__CONTAINER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.REGION__TRANSITION, Region.class, msgs);
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
			case UMLPackage.TRANSITION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TRANSITION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TRANSITION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TRANSITION__NAME :
				return getName();
			case UMLPackage.TRANSITION__VISIBILITY :
				return getVisibility();
			case UMLPackage.TRANSITION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TRANSITION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.TRANSITION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.TRANSITION__MEMBER :
				return getMembers();
			case UMLPackage.TRANSITION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.TRANSITION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.TRANSITION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.TRANSITION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.TRANSITION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.TRANSITION__KIND :
				return getKind();
			case UMLPackage.TRANSITION__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
			case UMLPackage.TRANSITION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				if (resolve)
					return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UMLPackage.TRANSITION__GUARD :
				if (resolve)
					return getGuard();
				return basicGetGuard();
			case UMLPackage.TRANSITION__EFFECT :
				if (resolve)
					return getEffect();
				return basicGetEffect();
			case UMLPackage.TRANSITION__TRIGGER :
				return getTriggers();
			case UMLPackage.TRANSITION__SOURCE :
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
			case UMLPackage.TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TRANSITION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.TRANSITION__KIND :
				setKind((TransitionKind) newValue);
				return;
			case UMLPackage.TRANSITION__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.TRANSITION__TARGET :
				setTarget((Vertex) newValue);
				return;
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) newValue);
				return;
			case UMLPackage.TRANSITION__GUARD :
				setGuard((Constraint) newValue);
				return;
			case UMLPackage.TRANSITION__EFFECT :
				setEffect((Behavior) newValue);
				return;
			case UMLPackage.TRANSITION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.TRANSITION__SOURCE :
				setSource((Vertex) newValue);
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
			case UMLPackage.TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TRANSITION__NAME :
				unsetName();
				return;
			case UMLPackage.TRANSITION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.TRANSITION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.TRANSITION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.TRANSITION__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case UMLPackage.TRANSITION__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.TRANSITION__TARGET :
				setTarget((Vertex) null);
				return;
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) null);
				return;
			case UMLPackage.TRANSITION__GUARD :
				setGuard((Constraint) null);
				return;
			case UMLPackage.TRANSITION__EFFECT :
				setEffect((Behavior) null);
				return;
			case UMLPackage.TRANSITION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.TRANSITION__SOURCE :
				setSource((Vertex) null);
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
			case UMLPackage.TRANSITION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TRANSITION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TRANSITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TRANSITION__OWNER :
				return isSetOwner();
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TRANSITION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TRANSITION__NAME :
				return isSetName();
			case UMLPackage.TRANSITION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TRANSITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.TRANSITION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.TRANSITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.TRANSITION__NAME_EXPRESSION) != null;
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.TRANSITION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.TRANSITION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.TRANSITION__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.TRANSITION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.TRANSITION__MEMBER :
				return isSetMembers();
			case UMLPackage.TRANSITION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.TRANSITION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.TRANSITION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.TRANSITION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.TRANSITION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.TRANSITION__KIND :
				return eVirtualGet(UMLPackage.TRANSITION__KIND, KIND_EDEFAULT) != KIND_EDEFAULT;
			case UMLPackage.TRANSITION__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.TRANSITION__TARGET :
				return eVirtualGet(UMLPackage.TRANSITION__TARGET) != null;
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				return eVirtualGet(UMLPackage.TRANSITION__REDEFINED_TRANSITION) != null;
			case UMLPackage.TRANSITION__GUARD :
				return eVirtualGet(UMLPackage.TRANSITION__GUARD) != null;
			case UMLPackage.TRANSITION__EFFECT :
				return eVirtualGet(UMLPackage.TRANSITION__EFFECT) != null;
			case UMLPackage.TRANSITION__TRIGGER :
				EList trigger = (EList) eVirtualGet(UMLPackage.TRANSITION__TRIGGER);
				return trigger != null && !trigger.isEmpty();
			case UMLPackage.TRANSITION__SOURCE :
				return eVirtualGet(UMLPackage.TRANSITION__SOURCE) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.TRANSITION__IS_LEAF :
					return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLPackage.TRANSITION__REDEFINED_ELEMENT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLPackage.TRANSITION__REDEFINITION_CONTEXT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
					return UMLPackage.TRANSITION__IS_LEAF;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
					return UMLPackage.TRANSITION__REDEFINED_ELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
					return UMLPackage.TRANSITION__REDEFINITION_CONTEXT;
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
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", kind: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.TRANSITION__KIND, KIND_EDEFAULT));
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Region container = basicGetContainer();
		if (container != null) {
			return container;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.TRANSITION__CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.TRANSITION__REDEFINED_TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TRANSITION__EFFECT);
	}

} //TransitionImpl
