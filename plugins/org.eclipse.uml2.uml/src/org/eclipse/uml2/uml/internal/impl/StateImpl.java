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
 * $Id: StateImpl.java,v 1.16 2006/01/04 17:47:24 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.StateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getConnections <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getDeferrableTriggers <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRegions <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl
		extends NamespaceImpl
		implements State {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

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
	 * The default value of the '{@link #isComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList redefinedElement = (EList) eVirtualGet(UMLPackage.STATE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.STATE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.STATE__REDEFINED_ELEMENT,
					new int[]{UMLPackage.STATE__REDEFINED_STATE}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext();) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
			if (name.equals(redefinedElement.getName())) {
				return redefinedElement;
			}
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
				UMLPackage.STATE__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoings() {
		EList outgoing = (EList) eVirtualGet(UMLPackage.STATE__OUTGOING);
		if (outgoing == null) {
			eVirtualSet(UMLPackage.STATE__OUTGOING,
				outgoing = new EObjectWithInverseResolvingEList(
					Transition.class, this, UMLPackage.STATE__OUTGOING,
					UMLPackage.TRANSITION__SOURCE));
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutgoing(String name) {
		for (Iterator i = getOutgoings().iterator(); i.hasNext();) {
			Transition outgoing = (Transition) i.next();
			if (name.equals(outgoing.getName())) {
				return outgoing;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomings() {
		EList incoming = (EList) eVirtualGet(UMLPackage.STATE__INCOMING);
		if (incoming == null) {
			eVirtualSet(UMLPackage.STATE__INCOMING,
				incoming = new EObjectWithInverseResolvingEList(
					Transition.class, this, UMLPackage.STATE__INCOMING,
					UMLPackage.TRANSITION__TARGET));
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getIncoming(String name) {
		for (Iterator i = getIncomings().iterator(); i.hasNext();) {
			Transition incoming = (Transition) i.next();
			if (name.equals(incoming.getName())) {
				return incoming;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID != UMLPackage.STATE__CONTAINER)
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
			|| (eContainerFeatureID != UMLPackage.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
					UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newContainer,
				UMLPackage.STATE__CONTAINER, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__CONTAINER, newContainer, newContainer));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.STATE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(
				UMLPackage.STATE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.STATE__OWNED_MEMBER, new int[]{
						UMLPackage.STATE__OWNED_RULE,
						UMLPackage.STATE__CONNECTION, UMLPackage.STATE__REGION}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.STATE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.STATE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.STATE__OWNED_ELEMENT, new int[]{
						UMLPackage.STATE__OWNED_COMMENT,
						UMLPackage.STATE__NAME_EXPRESSION,
						UMLPackage.STATE__ELEMENT_IMPORT,
						UMLPackage.STATE__PACKAGE_IMPORT,
						UMLPackage.STATE__OWNED_MEMBER,
						UMLPackage.STATE__CONNECTION_POINT,
						UMLPackage.STATE__STATE_INVARIANT,
						UMLPackage.STATE__ENTRY, UMLPackage.STATE__EXIT,
						UMLPackage.STATE__DO_ACTIVITY}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposite() {
		return StateOperations.isComposite(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrthogonal() {
		return StateOperations.isOrthogonal(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimple() {
		return StateOperations.isSimple(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubmachineState() {
		return StateOperations.isSubmachineState(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getSubmachine() {
		StateMachine submachine = (StateMachine) eVirtualGet(UMLPackage.STATE__SUBMACHINE);
		if (submachine != null && submachine.eIsProxy()) {
			InternalEObject oldSubmachine = (InternalEObject) submachine;
			submachine = (StateMachine) eResolveProxy(oldSubmachine);
			if (submachine != oldSubmachine) {
				eVirtualSet(UMLPackage.STATE__SUBMACHINE, submachine);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE__SUBMACHINE, oldSubmachine, submachine));
			}
		}
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetSubmachine() {
		return (StateMachine) eVirtualGet(UMLPackage.STATE__SUBMACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmachine(StateMachine newSubmachine,
			NotificationChain msgs) {
		Object oldSubmachine = eVirtualSet(UMLPackage.STATE__SUBMACHINE,
			newSubmachine);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__SUBMACHINE,
				oldSubmachine == EVIRTUAL_NO_VALUE
					? null
					: oldSubmachine, newSubmachine);
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
	public void setSubmachine(StateMachine newSubmachine) {
		StateMachine submachine = (StateMachine) eVirtualGet(UMLPackage.STATE__SUBMACHINE);
		if (newSubmachine != submachine) {
			NotificationChain msgs = null;
			if (submachine != null)
				msgs = ((InternalEObject) submachine).eInverseRemove(this,
					UMLPackage.STATE_MACHINE__SUBMACHINE_STATE,
					StateMachine.class, msgs);
			if (newSubmachine != null)
				msgs = ((InternalEObject) newSubmachine).eInverseAdd(this,
					UMLPackage.STATE_MACHINE__SUBMACHINE_STATE,
					StateMachine.class, msgs);
			msgs = basicSetSubmachine(newSubmachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__SUBMACHINE, newSubmachine, newSubmachine));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnections() {
		EList connection = (EList) eVirtualGet(UMLPackage.STATE__CONNECTION);
		if (connection == null) {
			eVirtualSet(UMLPackage.STATE__CONNECTION,
				connection = new EObjectContainmentWithInverseEList(
					ConnectionPointReference.class, this,
					UMLPackage.STATE__CONNECTION,
					UMLPackage.CONNECTION_POINT_REFERENCE__STATE));
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnection() {
		ConnectionPointReference newConnection = UMLFactory.eINSTANCE
			.createConnectionPointReference();
		getConnections().add(newConnection);
		return newConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference getConnection(String name) {
		for (Iterator i = getConnections().iterator(); i.hasNext();) {
			ConnectionPointReference connection = (ConnectionPointReference) i
				.next();
			if (name.equals(connection.getName())) {
				return connection;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnectionPoints() {
		EList connectionPoint = (EList) eVirtualGet(UMLPackage.STATE__CONNECTION_POINT);
		if (connectionPoint == null) {
			eVirtualSet(UMLPackage.STATE__CONNECTION_POINT,
				connectionPoint = new EObjectContainmentWithInverseEList(
					Pseudostate.class, this,
					UMLPackage.STATE__CONNECTION_POINT,
					UMLPackage.PSEUDOSTATE__STATE));
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createConnectionPoint() {
		Pseudostate newConnectionPoint = UMLFactory.eINSTANCE
			.createPseudostate();
		getConnectionPoints().add(newConnectionPoint);
		return newConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getConnectionPoint(String name) {
		for (Iterator i = getConnectionPoints().iterator(); i.hasNext();) {
			Pseudostate connectionPoint = (Pseudostate) i.next();
			if (name.equals(connectionPoint.getName())) {
				return connectionPoint;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getRedefinedState() {
		State redefinedState = (State) eVirtualGet(UMLPackage.STATE__REDEFINED_STATE);
		if (redefinedState != null && redefinedState.eIsProxy()) {
			InternalEObject oldRedefinedState = (InternalEObject) redefinedState;
			redefinedState = (State) eResolveProxy(oldRedefinedState);
			if (redefinedState != oldRedefinedState) {
				eVirtualSet(UMLPackage.STATE__REDEFINED_STATE, redefinedState);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE__REDEFINED_STATE, oldRedefinedState,
						redefinedState));
			}
		}
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetRedefinedState() {
		return (State) eVirtualGet(UMLPackage.STATE__REDEFINED_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState(State newRedefinedState) {
		State redefinedState = newRedefinedState;
		Object oldRedefinedState = eVirtualSet(
			UMLPackage.STATE__REDEFINED_STATE, redefinedState);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__REDEFINED_STATE,
				oldRedefinedState == EVIRTUAL_NO_VALUE
					? null
					: oldRedefinedState, redefinedState));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		return (Constraint) eVirtualGet(UMLPackage.STATE__STATE_INVARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(
			Constraint newStateInvariant, NotificationChain msgs) {
		Object oldStateInvariant = eVirtualSet(
			UMLPackage.STATE__STATE_INVARIANT, newStateInvariant);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__STATE_INVARIANT,
				oldStateInvariant == EVIRTUAL_NO_VALUE
					? null
					: oldStateInvariant, newStateInvariant);
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
	public void setStateInvariant(Constraint newStateInvariant) {
		Constraint stateInvariant = (Constraint) eVirtualGet(UMLPackage.STATE__STATE_INVARIANT);
		if (newStateInvariant != stateInvariant) {
			NotificationChain msgs = null;
			if (stateInvariant != null)
				msgs = ((InternalEObject) stateInvariant).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__STATE_INVARIANT,
					null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject) newStateInvariant).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__STATE_INVARIANT,
					null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__STATE_INVARIANT, newStateInvariant,
				newStateInvariant));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createStateInvariant(EClass eClass) {
		Constraint newStateInvariant = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setStateInvariant(newStateInvariant);
		return newStateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createStateInvariant() {
		Constraint newStateInvariant = UMLFactory.eINSTANCE.createConstraint();
		setStateInvariant(newStateInvariant);
		return newStateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		return (Behavior) eVirtualGet(UMLPackage.STATE__ENTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry,
			NotificationChain msgs) {
		Object oldEntry = eVirtualSet(UMLPackage.STATE__ENTRY, newEntry);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__ENTRY,
				oldEntry == EVIRTUAL_NO_VALUE
					? null
					: oldEntry, newEntry);
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
	public void setEntry(Behavior newEntry) {
		Behavior entry = (Behavior) eVirtualGet(UMLPackage.STATE__ENTRY);
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject) entry).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__ENTRY, null,
					msgs);
			if (newEntry != null)
				msgs = ((InternalEObject) newEntry).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__ENTRY, null,
					msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__ENTRY, newEntry, newEntry));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createEntry(EClass eClass) {
		Behavior newEntry = (Behavior) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setEntry(newEntry);
		return newEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		return (Behavior) eVirtualGet(UMLPackage.STATE__EXIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit,
			NotificationChain msgs) {
		Object oldExit = eVirtualSet(UMLPackage.STATE__EXIT, newExit);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__EXIT,
				oldExit == EVIRTUAL_NO_VALUE
					? null
					: oldExit, newExit);
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
	public void setExit(Behavior newExit) {
		Behavior exit = (Behavior) eVirtualGet(UMLPackage.STATE__EXIT);
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject) exit)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject) newExit)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__EXIT, newExit, newExit));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createExit(EClass eClass) {
		Behavior newExit = (Behavior) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setExit(newExit);
		return newExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		return (Behavior) eVirtualGet(UMLPackage.STATE__DO_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity,
			NotificationChain msgs) {
		Object oldDoActivity = eVirtualSet(UMLPackage.STATE__DO_ACTIVITY,
			newDoActivity);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__DO_ACTIVITY,
				oldDoActivity == EVIRTUAL_NO_VALUE
					? null
					: oldDoActivity, newDoActivity);
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
	public void setDoActivity(Behavior newDoActivity) {
		Behavior doActivity = (Behavior) eVirtualGet(UMLPackage.STATE__DO_ACTIVITY);
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject) doActivity).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__DO_ACTIVITY,
					null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject) newDoActivity).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__DO_ACTIVITY,
					null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createDoActivity(EClass eClass) {
		Behavior newDoActivity = (Behavior) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setDoActivity(newDoActivity);
		return newDoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeferrableTriggers() {
		EList deferrableTrigger = (EList) eVirtualGet(UMLPackage.STATE__DEFERRABLE_TRIGGER);
		if (deferrableTrigger == null) {
			eVirtualSet(UMLPackage.STATE__DEFERRABLE_TRIGGER,
				deferrableTrigger = new EObjectContainmentEList(Trigger.class,
					this, UMLPackage.STATE__DEFERRABLE_TRIGGER));
		}
		return deferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createDeferrableTrigger() {
		Trigger newDeferrableTrigger = UMLFactory.eINSTANCE.createTrigger();
		getDeferrableTriggers().add(newDeferrableTrigger);
		return newDeferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getDeferrableTrigger(String name) {
		for (Iterator i = getDeferrableTriggers().iterator(); i.hasNext();) {
			Trigger deferrableTrigger = (Trigger) i.next();
			if (name.equals(deferrableTrigger.getName())) {
				return deferrableTrigger;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegions() {
		EList region = (EList) eVirtualGet(UMLPackage.STATE__REGION);
		if (region == null) {
			eVirtualSet(UMLPackage.STATE__REGION,
				region = new EObjectContainmentWithInverseEList(Region.class,
					this, UMLPackage.STATE__REGION, UMLPackage.REGION__STATE));
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		Region newRegion = UMLFactory.eINSTANCE.createRegion();
		getRegions().add(newRegion);
		return newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion(String name) {
		for (Iterator i = getRegions().iterator(); i.hasNext();) {
			Region region = (Region) i.next();
			if (name.equals(region.getName())) {
				return region;
			}
		}
		return null;
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
		return redefined instanceof State
			&& isRedefinitionContextValid((State) redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return StateOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmachineStates(DiagnosticChain diagnostics,
			Map context) {
		return StateOperations.validateSubmachineStates(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationsOrSourcesOfTransitions(
			DiagnosticChain diagnostics, Map context) {
		return StateOperations.validateDestinationsOrSourcesOfTransitions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmachineOrRegions(DiagnosticChain diagnostics,
			Map context) {
		return StateOperations.validateSubmachineOrRegions(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeStates(DiagnosticChain diagnostics,
			Map context) {
		return StateOperations.validateCompositeStates(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryOrExit(DiagnosticChain diagnostics, Map context) {
		return StateOperations.validateEntryOrExit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier redefinitionContext() {
		return StateOperations.redefinitionContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(State redefined) {
		return StateOperations.isRedefinitionContextValid(this, redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine containingStateMachine() {
		return StateOperations.containingStateMachine(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STATE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE__OUTGOING :
				return ((InternalEList) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__INCOMING :
				return ((InternalEList) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STATE__CONTAINER, msgs);
			case UMLPackage.STATE__SUBMACHINE :
				StateMachine submachine = (StateMachine) eVirtualGet(UMLPackage.STATE__SUBMACHINE);
				if (submachine != null)
					msgs = ((InternalEObject) submachine).eInverseRemove(this,
						UMLPackage.STATE_MACHINE__SUBMACHINE_STATE,
						StateMachine.class, msgs);
				return basicSetSubmachine((StateMachine) otherEnd, msgs);
			case UMLPackage.STATE__CONNECTION :
				return ((InternalEList) getConnections()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE__CONNECTION_POINT :
				return ((InternalEList) getConnectionPoints()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE__REGION :
				return ((InternalEList) getRegions()).basicAdd(otherEnd, msgs);
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
			case UMLPackage.STATE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE__CONTAINER :
				return eBasicSetContainer(null, UMLPackage.STATE__CONTAINER,
					msgs);
			case UMLPackage.STATE__SUBMACHINE :
				return basicSetSubmachine(null, msgs);
			case UMLPackage.STATE__CONNECTION :
				return ((InternalEList) getConnections()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE__CONNECTION_POINT :
				return ((InternalEList) getConnectionPoints()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__STATE_INVARIANT :
				return basicSetStateInvariant(null, msgs);
			case UMLPackage.STATE__ENTRY :
				return basicSetEntry(null, msgs);
			case UMLPackage.STATE__EXIT :
				return basicSetExit(null, msgs);
			case UMLPackage.STATE__DO_ACTIVITY :
				return basicSetDoActivity(null, msgs);
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				return ((InternalEList) getDeferrableTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE__REGION :
				return ((InternalEList) getRegions()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.STATE__CONTAINER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
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
			case UMLPackage.STATE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STATE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STATE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STATE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STATE__NAME :
				return getName();
			case UMLPackage.STATE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STATE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STATE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STATE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STATE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STATE__MEMBER :
				return getMembers();
			case UMLPackage.STATE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STATE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STATE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STATE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STATE__OUTGOING :
				return getOutgoings();
			case UMLPackage.STATE__INCOMING :
				return getIncomings();
			case UMLPackage.STATE__CONTAINER :
				return getContainer();
			case UMLPackage.STATE__IS_COMPOSITE :
				return isComposite()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE__IS_ORTHOGONAL :
				return isOrthogonal()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE__IS_SIMPLE :
				return isSimple()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE__IS_SUBMACHINE_STATE :
				return isSubmachineState()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE__SUBMACHINE :
				if (resolve)
					return getSubmachine();
				return basicGetSubmachine();
			case UMLPackage.STATE__CONNECTION :
				return getConnections();
			case UMLPackage.STATE__CONNECTION_POINT :
				return getConnectionPoints();
			case UMLPackage.STATE__REDEFINED_STATE :
				if (resolve)
					return getRedefinedState();
				return basicGetRedefinedState();
			case UMLPackage.STATE__STATE_INVARIANT :
				return getStateInvariant();
			case UMLPackage.STATE__ENTRY :
				return getEntry();
			case UMLPackage.STATE__EXIT :
				return getExit();
			case UMLPackage.STATE__DO_ACTIVITY :
				return getDoActivity();
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				return getDeferrableTriggers();
			case UMLPackage.STATE__REGION :
				return getRegions();
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
			case UMLPackage.STATE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STATE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STATE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.STATE__SUBMACHINE :
				setSubmachine((StateMachine) newValue);
				return;
			case UMLPackage.STATE__CONNECTION :
				getConnections().clear();
				getConnections().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__CONNECTION_POINT :
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__REDEFINED_STATE :
				setRedefinedState((State) newValue);
				return;
			case UMLPackage.STATE__STATE_INVARIANT :
				setStateInvariant((Constraint) newValue);
				return;
			case UMLPackage.STATE__ENTRY :
				setEntry((Behavior) newValue);
				return;
			case UMLPackage.STATE__EXIT :
				setExit((Behavior) newValue);
				return;
			case UMLPackage.STATE__DO_ACTIVITY :
				setDoActivity((Behavior) newValue);
				return;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				getDeferrableTriggers().clear();
				getDeferrableTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE__REGION :
				getRegions().clear();
				getRegions().addAll((Collection) newValue);
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
			case UMLPackage.STATE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STATE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STATE__NAME :
				unsetName();
				return;
			case UMLPackage.STATE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STATE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STATE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STATE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STATE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.STATE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.STATE__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.STATE__SUBMACHINE :
				setSubmachine((StateMachine) null);
				return;
			case UMLPackage.STATE__CONNECTION :
				getConnections().clear();
				return;
			case UMLPackage.STATE__CONNECTION_POINT :
				getConnectionPoints().clear();
				return;
			case UMLPackage.STATE__REDEFINED_STATE :
				setRedefinedState((State) null);
				return;
			case UMLPackage.STATE__STATE_INVARIANT :
				setStateInvariant((Constraint) null);
				return;
			case UMLPackage.STATE__ENTRY :
				setEntry((Behavior) null);
				return;
			case UMLPackage.STATE__EXIT :
				setExit((Behavior) null);
				return;
			case UMLPackage.STATE__DO_ACTIVITY :
				setDoActivity((Behavior) null);
				return;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				getDeferrableTriggers().clear();
				return;
			case UMLPackage.STATE__REGION :
				getRegions().clear();
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
			case UMLPackage.STATE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.STATE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE__OWNER :
				return isSetOwner();
			case UMLPackage.STATE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.STATE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STATE__NAME :
				return isSetName();
			case UMLPackage.STATE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STATE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.STATE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STATE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STATE__NAME_EXPRESSION) != null;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.STATE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.STATE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.STATE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.STATE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.STATE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.STATE__MEMBER :
				return isSetMembers();
			case UMLPackage.STATE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STATE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STATE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STATE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STATE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STATE__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.STATE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.STATE__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.STATE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.STATE__CONTAINER :
				return getContainer() != null;
			case UMLPackage.STATE__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.STATE__IS_ORTHOGONAL :
				return isOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
			case UMLPackage.STATE__IS_SIMPLE :
				return isSimple() != IS_SIMPLE_EDEFAULT;
			case UMLPackage.STATE__IS_SUBMACHINE_STATE :
				return isSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
			case UMLPackage.STATE__SUBMACHINE :
				return eVirtualGet(UMLPackage.STATE__SUBMACHINE) != null;
			case UMLPackage.STATE__CONNECTION :
				EList connection = (EList) eVirtualGet(UMLPackage.STATE__CONNECTION);
				return connection != null && !connection.isEmpty();
			case UMLPackage.STATE__CONNECTION_POINT :
				EList connectionPoint = (EList) eVirtualGet(UMLPackage.STATE__CONNECTION_POINT);
				return connectionPoint != null && !connectionPoint.isEmpty();
			case UMLPackage.STATE__REDEFINED_STATE :
				return eVirtualGet(UMLPackage.STATE__REDEFINED_STATE) != null;
			case UMLPackage.STATE__STATE_INVARIANT :
				return eVirtualGet(UMLPackage.STATE__STATE_INVARIANT) != null;
			case UMLPackage.STATE__ENTRY :
				return eVirtualGet(UMLPackage.STATE__ENTRY) != null;
			case UMLPackage.STATE__EXIT :
				return eVirtualGet(UMLPackage.STATE__EXIT) != null;
			case UMLPackage.STATE__DO_ACTIVITY :
				return eVirtualGet(UMLPackage.STATE__DO_ACTIVITY) != null;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				EList deferrableTrigger = (EList) eVirtualGet(UMLPackage.STATE__DEFERRABLE_TRIGGER);
				return deferrableTrigger != null
					&& !deferrableTrigger.isEmpty();
			case UMLPackage.STATE__REGION :
				EList region = (EList) eVirtualGet(UMLPackage.STATE__REGION);
				return region != null && !region.isEmpty();
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
				case UMLPackage.STATE__IS_LEAF :
					return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLPackage.STATE__REDEFINED_ELEMENT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLPackage.STATE__REDEFINITION_CONTEXT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STATE__OUTGOING :
					return UMLPackage.VERTEX__OUTGOING;
				case UMLPackage.STATE__INCOMING :
					return UMLPackage.VERTEX__INCOMING;
				case UMLPackage.STATE__CONTAINER :
					return UMLPackage.VERTEX__CONTAINER;
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
					return UMLPackage.STATE__IS_LEAF;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
					return UMLPackage.STATE__REDEFINED_ELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
					return UMLPackage.STATE__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseFeatureID) {
				case UMLPackage.VERTEX__OUTGOING :
					return UMLPackage.STATE__OUTGOING;
				case UMLPackage.VERTEX__INCOMING :
					return UMLPackage.STATE__INCOMING;
				case UMLPackage.VERTEX__CONTAINER :
					return UMLPackage.STATE__CONTAINER;
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
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.STATE__REDEFINED_STATE);
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
		return super.isSetNamespace() || eIsSet(UMLPackage.STATE__CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.STATE__CONNECTION)
			|| eIsSet(UMLPackage.STATE__REGION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STATE__CONNECTION_POINT)
			|| eIsSet(UMLPackage.STATE__STATE_INVARIANT)
			|| eIsSet(UMLPackage.STATE__ENTRY)
			|| eIsSet(UMLPackage.STATE__EXIT)
			|| eIsSet(UMLPackage.STATE__DO_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine containingStatemachine() {
		return containingStateMachine();
	}

} //StateImpl
