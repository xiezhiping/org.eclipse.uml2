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
 * $Id: TransitionImpl.java,v 1.7 2005/12/01 20:04:36 khussey Exp $
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

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
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.TransitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TransitionImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
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
		extends RedefinableElementImpl
		implements Transition {

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionKind KIND_EDEFAULT = TransitionKind.INTERNAL_LITERAL;

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
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.TRANSITION__REDEFINED_ELEMENT);
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
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.TRANSITION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.TRANSITION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.TRANSITION__OWNED_ELEMENT, new int[]{
						UMLPackage.TRANSITION__OWNED_COMMENT,
						UMLPackage.TRANSITION__NAME_EXPRESSION,
						UMLPackage.TRANSITION__GUARD,
						UMLPackage.TRANSITION__EFFECT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List getRedefinitionContexts() {
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
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext();) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (name.equals(redefinitionContext.getName())) {
				return redefinitionContext;
			}
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
		boolean isSetChange = oldKind == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__KIND, isSetChange
					? KIND_EDEFAULT
					: oldKind, kind, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		Object oldKind = eVirtualUnset(UMLPackage.TRANSITION__KIND);
		boolean isSetChange = oldKind != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.TRANSITION__KIND, isSetChange
					? oldKind
					: KIND_EDEFAULT, KIND_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return eVirtualIsSet(UMLPackage.TRANSITION__KIND);
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
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.TRANSITION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newContainer))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
					UMLPackage.REGION__TRANSITION, Region.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newContainer,
				UMLPackage.TRANSITION__CONTAINER, msgs);
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
		return (Constraint) eVirtualGet(UMLPackage.TRANSITION__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Constraint newGuard,
			NotificationChain msgs) {
		Object oldGuard = eVirtualSet(UMLPackage.TRANSITION__GUARD, newGuard);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TRANSITION__GUARD,
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
	public void setGuard(Constraint newGuard) {
		Constraint guard = (Constraint) eVirtualGet(UMLPackage.TRANSITION__GUARD);
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TRANSITION__GUARD,
					null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TRANSITION__GUARD,
					null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TRANSITION__GUARD, newGuard, newGuard));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createGuard(EClass eClass) {
		Constraint newGuard = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createGuard() {
		Constraint newGuard = UMLFactory.eINSTANCE.createConstraint();
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEffect() {
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
	public Behavior createEffect(EClass eClass) {
		Behavior newEffect = (Behavior) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setEffect(newEffect);
		return newEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createEffect() {
		Behavior newEffect = UMLFactory.eINSTANCE.createBehavior();
		setEffect(newEffect);
		return newEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTriggers() {
		List trigger = (List) eVirtualGet(UMLPackage.TRANSITION__TRIGGER);
		if (trigger == null) {
			eVirtualSet(UMLPackage.TRANSITION__TRIGGER,
				trigger = new EObjectContainmentEList(Trigger.class, this,
					UMLPackage.TRANSITION__TRIGGER));
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		Trigger newTrigger = UMLFactory.eINSTANCE.createTrigger();
		getTriggers().add(newTrigger);
		return newTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name) {
		for (Iterator i = getTriggers().iterator(); i.hasNext();) {
			Trigger trigger = (Trigger) i.next();
			if (name.equals(trigger.getName())) {
				return trigger;
			}
		}
		return null;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TRANSITION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.TRANSITION__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.TRANSITION__CONTAINER, msgs);
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
			case UMLPackage.TRANSITION__CONTAINER :
				return eBasicSetContainer(null,
					UMLPackage.TRANSITION__CONTAINER, msgs);
			case UMLPackage.TRANSITION__TARGET :
				return basicSetTarget(null, msgs);
			case UMLPackage.TRANSITION__GUARD :
				return basicSetGuard(null, msgs);
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
				return getNameExpression();
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
				return getContainer();
			case UMLPackage.TRANSITION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				if (resolve)
					return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UMLPackage.TRANSITION__GUARD :
				return getGuard();
			case UMLPackage.TRANSITION__EFFECT :
				return getEffect();
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.TRANSITION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TRANSITION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.TRANSITION__KIND :
				unsetKind();
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TRANSITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TRANSITION__OWNER :
				return isSetOwner();
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.TRANSITION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TRANSITION__NAME :
				String name = (String) eVirtualGet(UMLPackage.TRANSITION__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.TRANSITION__VISIBILITY :
				return eVirtualGet(UMLPackage.TRANSITION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.TRANSITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TRANSITION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.TRANSITION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.TRANSITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.TRANSITION__NAME_EXPRESSION) != null;
			case UMLPackage.TRANSITION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.TRANSITION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.TRANSITION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.TRANSITION__KIND :
				return isSetKind();
			case UMLPackage.TRANSITION__CONTAINER :
				return getContainer() != null;
			case UMLPackage.TRANSITION__TARGET :
				return eVirtualGet(UMLPackage.TRANSITION__TARGET) != null;
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				return eVirtualGet(UMLPackage.TRANSITION__REDEFINED_TRANSITION) != null;
			case UMLPackage.TRANSITION__GUARD :
				return eVirtualGet(UMLPackage.TRANSITION__GUARD) != null;
			case UMLPackage.TRANSITION__EFFECT :
				return eVirtualGet(UMLPackage.TRANSITION__EFFECT) != null;
			case UMLPackage.TRANSITION__TRIGGER :
				List trigger = (List) eVirtualGet(UMLPackage.TRANSITION__TRIGGER);
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.TRANSITION__KIND))
			result.append(eVirtualGet(UMLPackage.TRANSITION__KIND));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Region container = getContainer();
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
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.TRANSITION__REDEFINED_TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TRANSITION__GUARD)
			|| eIsSet(UMLPackage.TRANSITION__EFFECT);
	}

} //TransitionImpl
