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
 * $Id: TransitionImpl.java,v 1.28 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Transition;
import org.eclipse.uml2.TransitionKind;
import org.eclipse.uml2.Trigger;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.StateMachineOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getTriggers <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TransitionImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends RedefinableElementImpl implements Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransitionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Vertex source = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Vertex target = null;

	/**
	 * The cached value of the '{@link #getRedefinedTransition() <em>Redefined Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition redefinedTransition = null;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList triggers = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Constraint guard = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected Activity effect = null;

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
		return UML2Package.Literals.TRANSITION;
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
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TRANSITION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TRANSITION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.TRANSITION__GUARD)
			|| eIsSet(UML2Package.TRANSITION__EFFECT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.TRANSITION__OWNED_COMMENT, UML2Package.TRANSITION__TEMPLATE_BINDING, UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE, UML2Package.TRANSITION__NAME_EXPRESSION, UML2Package.TRANSITION__GUARD, UML2Package.TRANSITION__EFFECT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransitionKind newKind) {
		TransitionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__KIND, oldKind, kind));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID != UML2Package.TRANSITION__CONTAINER) return null;
		return (Region)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, UML2Package.TRANSITION__CONTAINER, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID != UML2Package.TRANSITION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, UML2Package.REGION__TRANSITION, Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__CONTAINER, newContainer, newContainer));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Vertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TRANSITION__SOURCE, oldSource, source));
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
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Vertex newSource, NotificationChain msgs) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Vertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, UML2Package.VERTEX__OUTGOING, Vertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, UML2Package.VERTEX__OUTGOING, Vertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__SOURCE, newSource, newSource));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Vertex)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TRANSITION__TARGET, oldTarget, target));
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
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Vertex newTarget, NotificationChain msgs) {
		Vertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Vertex newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, UML2Package.VERTEX__INCOMING, Vertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, UML2Package.VERTEX__INCOMING, Vertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__TARGET, newTarget, newTarget));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRedefinedTransition() {
		if (redefinedTransition != null && redefinedTransition.eIsProxy()) {
			InternalEObject oldRedefinedTransition = (InternalEObject)redefinedTransition;
			redefinedTransition = (Transition)eResolveProxy(oldRedefinedTransition);
			if (redefinedTransition != oldRedefinedTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));
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
		return redefinedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedTransition(Transition newRedefinedTransition) {
		Transition oldRedefinedTransition = redefinedTransition;
		redefinedTransition = newRedefinedTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedTransition() {
		return redefinedTransition != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTriggers() {
		if (triggers == null) {
			triggers = new EObjectResolvingEList(Trigger.class, this, UML2Package.TRANSITION__TRIGGER);
		}
		return triggers;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Trigger getTrigger(String name) {
		return getTrigger(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name, boolean ignoreCase, EClass eClass) {
		triggerLoop: for (Iterator i = getTriggers().iterator(); i.hasNext(); ) {
			Trigger trigger = (Trigger) i.next();
			if (eClass != null && !eClass.isInstance(trigger))
				continue triggerLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(trigger.getName()) : name.equals(trigger.getName())))
				continue triggerLoop;
			return trigger;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Constraint newGuard, NotificationChain msgs) {
		Constraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Constraint newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__GUARD, newGuard, newGuard));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createGuard(EClass eClass) {
		Constraint newGuard = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TRANSITION__GUARD, null, newGuard));
		}
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createGuard() {
		Constraint newGuard = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TRANSITION__GUARD, null, newGuard));
		}
		setGuard(newGuard);
		return newGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Activity newEffect, NotificationChain msgs) {
		Activity oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(Activity newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TRANSITION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.TRANSITION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TRANSITION__EFFECT, newEffect, newEffect));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createEffect() instead.
	 */
	public Activity createEffect(EClass eClass) {
		Activity newEffect = (Activity) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TRANSITION__EFFECT, null, newEffect));
		}
		setEffect(newEffect);
		return newEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity createEffect() {
		Activity newEffect = UML2Factory.eINSTANCE.createActivity();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TRANSITION__EFFECT, null, newEffect));
		}
		setEffect(newEffect);
		return newEffect;
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
				UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);

			if (result == null) {
				EList redefinitionContexts = StateMachineOperations
					.getRedefinitionContexts(this);
				cache
					.put(
						this,
						UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						result = new EcoreEList.UnmodifiableEList(
							this,
							UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
							redefinitionContexts.size(), redefinitionContexts
								.toArray()));
			}

			return result;
		}

		EList redefinitionContexts = StateMachineOperations
			.getRedefinitionContexts(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
			redefinitionContexts.size(), redefinitionContexts.toArray());
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TRANSITION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.TRANSITION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.TRANSITION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.TRANSITION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region)otherEnd, msgs);
			case UML2Package.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, UML2Package.VERTEX__OUTGOING, Vertex.class, msgs);
				return basicSetSource((Vertex)otherEnd, msgs);
			case UML2Package.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, UML2Package.VERTEX__INCOMING, Vertex.class, msgs);
				return basicSetTarget((Vertex)otherEnd, msgs);
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
			case UML2Package.TRANSITION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.TRANSITION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.TRANSITION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.TRANSITION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.TRANSITION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.TRANSITION__CONTAINER:
				return basicSetContainer(null, msgs);
			case UML2Package.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case UML2Package.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case UML2Package.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case UML2Package.TRANSITION__EFFECT:
				return basicSetEffect(null, msgs);
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
			case UML2Package.TRANSITION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, UML2Package.REGION__TRANSITION, Region.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
	public Classifier getRedefinitionContext(String name, boolean ignoreCase, EClass eClass) {
		redefinitionContextLoop: for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinitionContext.getName()) : name.equals(redefinitionContext.getName())))
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
	public Element basicGetOwner() {
		Region container = getContainer();			
		if (container != null) {
			return container;
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
			|| eIsSet(UML2Package.TRANSITION__CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		return new EcoreEList.UnmodifiableEList(this, null, 0, Collections.EMPTY_LIST.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.TRANSITION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TRANSITION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TRANSITION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TRANSITION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TRANSITION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TRANSITION__NAME:
				return getName();
			case UML2Package.TRANSITION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TRANSITION__VISIBILITY:
				return getVisibility();
			case UML2Package.TRANSITION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TRANSITION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TRANSITION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.TRANSITION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.TRANSITION__KIND:
				return getKind();
			case UML2Package.TRANSITION__CONTAINER:
				return getContainer();
			case UML2Package.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UML2Package.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UML2Package.TRANSITION__REDEFINED_TRANSITION:
				if (resolve) return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UML2Package.TRANSITION__TRIGGER:
				return getTriggers();
			case UML2Package.TRANSITION__GUARD:
				return getGuard();
			case UML2Package.TRANSITION__EFFECT:
				return getEffect();
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
			case UML2Package.TRANSITION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TRANSITION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TRANSITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.TRANSITION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.TRANSITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.TRANSITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.TRANSITION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.TRANSITION__KIND:
				setKind((TransitionKind)newValue);
				return;
			case UML2Package.TRANSITION__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case UML2Package.TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case UML2Package.TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((Transition)newValue);
				return;
			case UML2Package.TRANSITION__TRIGGER:
				getTriggers().clear();
				getTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.TRANSITION__GUARD:
				setGuard((Constraint)newValue);
				return;
			case UML2Package.TRANSITION__EFFECT:
				setEffect((Activity)newValue);
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
			case UML2Package.TRANSITION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TRANSITION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TRANSITION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.TRANSITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.TRANSITION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.TRANSITION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.TRANSITION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.TRANSITION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UML2Package.TRANSITION__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case UML2Package.TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case UML2Package.TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((Transition)null);
				return;
			case UML2Package.TRANSITION__TRIGGER:
				getTriggers().clear();
				return;
			case UML2Package.TRANSITION__GUARD:
				setGuard((Constraint)null);
				return;
			case UML2Package.TRANSITION__EFFECT:
				setEffect((Activity)null);
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
			case UML2Package.TRANSITION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TRANSITION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TRANSITION__OWNER:
				return isSetOwner();
			case UML2Package.TRANSITION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.TRANSITION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.TRANSITION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TRANSITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.TRANSITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.TRANSITION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.TRANSITION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.TRANSITION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.TRANSITION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.TRANSITION__KIND:
				return kind != KIND_EDEFAULT;
			case UML2Package.TRANSITION__CONTAINER:
				return getContainer() != null;
			case UML2Package.TRANSITION__SOURCE:
				return source != null;
			case UML2Package.TRANSITION__TARGET:
				return target != null;
			case UML2Package.TRANSITION__REDEFINED_TRANSITION:
				return isSetRedefinedTransition();
			case UML2Package.TRANSITION__TRIGGER:
				return triggers != null && !triggers.isEmpty();
			case UML2Package.TRANSITION__GUARD:
				return guard != null;
			case UML2Package.TRANSITION__EFFECT:
				return effect != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(')');
		return result.toString();
	}


} //TransitionImpl
