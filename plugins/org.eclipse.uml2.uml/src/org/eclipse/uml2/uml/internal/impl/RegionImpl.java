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
 * $Id: RegionImpl.java,v 1.23 2006/05/24 20:54:27 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.RegionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getSubvertices <em>Subvertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getTransitions <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl
		extends NamespaceImpl
		implements Region {

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
	protected static final int IS_LEAF_EFLAG = 1 << 10;

	/**
	 * The cached value of the '{@link #getSubvertices() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertices()
	 * @generated
	 * @ordered
	 */
	protected EList subvertices = null;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList transitions = null;

	/**
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected Region extendedRegion = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList(
						RedefinableElement.class, this,
						UMLPackage.REGION__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList(RedefinableElement.class, this,
			UMLPackage.REGION__REDEFINED_ELEMENT, REDEFINED_ELEMENT_ESUBSETS);
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
				UMLPackage.REGION__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedMembers = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache
					.put(eResource, this,
						UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
						ownedMembers = new DerivedUnionEObjectEList(
							NamedElement.class, this,
							UMLPackage.REGION__OWNED_MEMBER,
							OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.REGION__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubvertices() {
		if (subvertices == null) {
			subvertices = new EObjectContainmentWithInverseEList.Resolving(
				Vertex.class, this, UMLPackage.REGION__SUBVERTEX,
				UMLPackage.VERTEX__CONTAINER);
		}
		return subvertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createSubvertex(String name, EClass eClass) {
		Vertex newSubvertex = (Vertex) create(eClass);
		getSubvertices().add(newSubvertex);
		if (name != null)
			newSubvertex.setName(name);
		return newSubvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSubvertex(String name) {
		return getSubvertex(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSubvertex(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		subvertexLoop : for (Iterator i = getSubvertices().iterator(); i
			.hasNext();) {
			Vertex subvertex = (Vertex) i.next();
			if (eClass != null && !eClass.isInstance(subvertex))
				continue subvertexLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(subvertex.getName())
				: name.equals(subvertex.getName())))
				continue subvertexLoop;
			return subvertex;
		}
		return createOnDemand && eClass != null
			? createSubvertex(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList.Resolving(
				Transition.class, this, UMLPackage.REGION__TRANSITION,
				UMLPackage.TRANSITION__CONTAINER);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition(String name, EClass eClass) {
		Transition newTransition = (Transition) create(eClass);
		getTransitions().add(newTransition);
		if (name != null)
			newTransition.setName(name);
		return newTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition(String name) {
		return createTransition(name, UMLPackage.Literals.TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition(String name) {
		return getTransition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		transitionLoop : for (Iterator i = getTransitions().iterator(); i
			.hasNext();) {
			Transition transition = (Transition) i.next();
			if (eClass != null && !eClass.isInstance(transition))
				continue transitionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(transition.getName())
				: name.equals(transition.getName())))
				continue transitionLoop;
			return transition;
		}
		return createOnDemand && eClass != null
			? createTransition(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID != UMLPackage.REGION__STATE)
			return null;
		return (State) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		if (eContainerFeatureID != UMLPackage.REGION__STATE)
			return null;
		return (State) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newState,
			UMLPackage.REGION__STATE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
					UMLPackage.STATE__REGION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REGION__STATE, newState, newState));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getExtendedRegion() {
		if (extendedRegion != null && extendedRegion.eIsProxy()) {
			InternalEObject oldExtendedRegion = (InternalEObject) extendedRegion;
			extendedRegion = (Region) eResolveProxy(oldExtendedRegion);
			if (extendedRegion != oldExtendedRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REGION__EXTENDED_REGION, oldExtendedRegion,
						extendedRegion));
			}
		}
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetExtendedRegion() {
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(Region newExtendedRegion) {
		Region oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REGION__EXTENDED_REGION, oldExtendedRegion,
				extendedRegion));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID != UMLPackage.REGION__STATE_MACHINE)
			return null;
		return (StateMachine) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetStateMachine() {
		if (eContainerFeatureID != UMLPackage.REGION__STATE_MACHINE)
			return null;
		return (StateMachine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStateMachine,
			UMLPackage.REGION__STATE_MACHINE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.REGION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject) newStateMachine).eInverseAdd(this,
					UMLPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REGION__STATE_MACHINE, newStateMachine,
				newStateMachine));

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
	public boolean isRedefinitionContextValidGen(RedefinableElement redefined) {
		return isRedefinitionContextValid(redefined);
	}

	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return redefined instanceof Region
			&& isRedefinitionContextValid((Region) redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RegionOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialVertex(DiagnosticChain diagnostics,
			Map context) {
		return RegionOperations.validateInitialVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeepHistoryVertex(DiagnosticChain diagnostics,
			Map context) {
		return RegionOperations.validateDeepHistoryVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShallowHistoryVertex(DiagnosticChain diagnostics,
			Map context) {
		return RegionOperations.validateShallowHistoryVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwned(DiagnosticChain diagnostics, Map context) {
		return RegionOperations.validateOwned(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier redefinitionContext() {
		return RegionOperations.redefinitionContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(Region redefined) {
		return RegionOperations.isRedefinitionContextValid(this, redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine containingStateMachine() {
		return RegionOperations.containingStateMachine(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean belongsToPSM() {
		return RegionOperations.belongsToPSM(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REGION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REGION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.REGION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REGION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REGION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REGION__SUBVERTEX :
				return ((InternalEList) getSubvertices()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REGION__TRANSITION :
				return ((InternalEList) getTransitions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.REGION__STATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State) otherEnd, msgs);
			case UMLPackage.REGION__STATE_MACHINE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((StateMachine) otherEnd, msgs);
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
			case UMLPackage.REGION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REGION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REGION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REGION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REGION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REGION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REGION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REGION__SUBVERTEX :
				return ((InternalEList) getSubvertices()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REGION__TRANSITION :
				return ((InternalEList) getTransitions()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REGION__STATE :
				return basicSetState(null, msgs);
			case UMLPackage.REGION__STATE_MACHINE :
				return basicSetStateMachine(null, msgs);
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
			case UMLPackage.REGION__STATE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STATE__REGION, State.class, msgs);
			case UMLPackage.REGION__STATE_MACHINE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
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
			case UMLPackage.REGION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REGION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REGION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REGION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REGION__NAME :
				return getName();
			case UMLPackage.REGION__VISIBILITY :
				return getVisibility();
			case UMLPackage.REGION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REGION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REGION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REGION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.REGION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.REGION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.REGION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.REGION__MEMBER :
				return getMembers();
			case UMLPackage.REGION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.REGION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.REGION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REGION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REGION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REGION__SUBVERTEX :
				return getSubvertices();
			case UMLPackage.REGION__TRANSITION :
				return getTransitions();
			case UMLPackage.REGION__STATE :
				if (resolve)
					return getState();
				return basicGetState();
			case UMLPackage.REGION__EXTENDED_REGION :
				if (resolve)
					return getExtendedRegion();
				return basicGetExtendedRegion();
			case UMLPackage.REGION__STATE_MACHINE :
				if (resolve)
					return getStateMachine();
				return basicGetStateMachine();
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
			case UMLPackage.REGION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REGION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REGION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REGION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REGION__SUBVERTEX :
				getSubvertices().clear();
				getSubvertices().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__TRANSITION :
				getTransitions().clear();
				getTransitions().addAll((Collection) newValue);
				return;
			case UMLPackage.REGION__STATE :
				setState((State) newValue);
				return;
			case UMLPackage.REGION__EXTENDED_REGION :
				setExtendedRegion((Region) newValue);
				return;
			case UMLPackage.REGION__STATE_MACHINE :
				setStateMachine((StateMachine) newValue);
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
			case UMLPackage.REGION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REGION__NAME :
				unsetName();
				return;
			case UMLPackage.REGION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REGION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REGION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.REGION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.REGION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.REGION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REGION__SUBVERTEX :
				getSubvertices().clear();
				return;
			case UMLPackage.REGION__TRANSITION :
				getTransitions().clear();
				return;
			case UMLPackage.REGION__STATE :
				setState((State) null);
				return;
			case UMLPackage.REGION__EXTENDED_REGION :
				setExtendedRegion((Region) null);
				return;
			case UMLPackage.REGION__STATE_MACHINE :
				setStateMachine((StateMachine) null);
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
			case UMLPackage.REGION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REGION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REGION__OWNER :
				return isSetOwner();
			case UMLPackage.REGION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.REGION__NAME :
				return isSetName();
			case UMLPackage.REGION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REGION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REGION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.REGION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REGION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.REGION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.REGION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.REGION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.REGION__MEMBER :
				return isSetMembers();
			case UMLPackage.REGION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.REGION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.REGION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REGION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REGION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REGION__SUBVERTEX :
				return subvertices != null && !subvertices.isEmpty();
			case UMLPackage.REGION__TRANSITION :
				return transitions != null && !transitions.isEmpty();
			case UMLPackage.REGION__STATE :
				return basicGetState() != null;
			case UMLPackage.REGION__EXTENDED_REGION :
				return extendedRegion != null;
			case UMLPackage.REGION__STATE_MACHINE :
				return basicGetStateMachine() != null;
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
				case UMLPackage.REGION__IS_LEAF :
					return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLPackage.REGION__REDEFINED_ELEMENT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLPackage.REGION__REDEFINITION_CONTEXT :
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
					return UMLPackage.REGION__IS_LEAF;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
					return UMLPackage.REGION__REDEFINED_ELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
					return UMLPackage.REGION__REDEFINITION_CONTEXT;
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
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{UMLPackage.REGION__EXTENDED_REGION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.REGION__OWNED_RULE, UMLPackage.REGION__SUBVERTEX,
		UMLPackage.REGION__TRANSITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.REGION__EXTENDED_REGION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.REGION__SUBVERTEX)
			|| eIsSet(UMLPackage.REGION__TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		State state = basicGetState();
		if (state != null) {
			return state;
		}
		StateMachine stateMachine = basicGetStateMachine();
		if (stateMachine != null) {
			return stateMachine;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.REGION__STATE)
			|| eIsSet(UMLPackage.REGION__STATE_MACHINE);
	}

} //RegionImpl
