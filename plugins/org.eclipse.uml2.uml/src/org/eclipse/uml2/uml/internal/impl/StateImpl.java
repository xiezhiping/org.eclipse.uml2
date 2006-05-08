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
 * $Id: StateImpl.java,v 1.27 2006/05/08 17:46:11 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getContainer <em>Container</em>}</li>
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
	 * The cached value of the '{@link #getOutgoings() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList outgoings = null;

	/**
	 * The cached value of the '{@link #getIncomings() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList incomings = null;

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
	protected static final boolean IS_SIMPLE_EDEFAULT = true;

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
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine submachine = null;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList connections = null;

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList connectionPoints = null;

	/**
	 * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected State redefinedState = null;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant = null;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry = null;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit = null;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity = null;

	/**
	 * The cached value of the '{@link #getDeferrableTriggers() <em>Deferrable Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList deferrableTriggers = null;

	/**
	 * The cached value of the '{@link #getRegions() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList regions = null;

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
						UMLPackage.STATE__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList(RedefinableElement.class, this,
			UMLPackage.STATE__REDEFINED_ELEMENT, REDEFINED_ELEMENT_ESUBSETS);
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
				UMLPackage.STATE__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList(Transition.class,
				this, UMLPackage.STATE__OUTGOING, UMLPackage.TRANSITION__SOURCE);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutgoing(String name) {
		return getOutgoing(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutgoing(String name, boolean ignoreCase, EClass eClass) {
		outgoingLoop : for (Iterator i = getOutgoings().iterator(); i.hasNext();) {
			Transition outgoing = (Transition) i.next();
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
	public EList getIncomings() {
		if (incomings == null) {
			incomings = new EObjectWithInverseResolvingEList(Transition.class,
				this, UMLPackage.STATE__INCOMING, UMLPackage.TRANSITION__TARGET);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getIncoming(String name) {
		return getIncoming(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getIncoming(String name, boolean ignoreCase, EClass eClass) {
		incomingLoop : for (Iterator i = getIncomings().iterator(); i.hasNext();) {
			Transition incoming = (Transition) i.next();
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
	public Region basicGetContainer() {
		if (eContainerFeatureID != UMLPackage.STATE__CONTAINER)
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
			UMLPackage.STATE__CONTAINER, msgs);

		return msgs;
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
			msgs = basicSetContainer(newContainer, msgs);
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
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedMembers = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList(
						NamedElement.class, this,
						UMLPackage.STATE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.STATE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
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
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.STATE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.STATE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
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
		if (submachine != null && submachine.eIsProxy()) {
			InternalEObject oldSubmachine = (InternalEObject) submachine;
			submachine = (StateMachine) eResolveProxy(oldSubmachine);
			if (submachine != oldSubmachine) {
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
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmachine(StateMachine newSubmachine,
			NotificationChain msgs) {
		StateMachine oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__SUBMACHINE, oldSubmachine,
				newSubmachine);
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
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList.Resolving(
				ConnectionPointReference.class, this,
				UMLPackage.STATE__CONNECTION,
				UMLPackage.CONNECTION_POINT_REFERENCE__STATE);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnection(String name) {
		ConnectionPointReference newConnection = (ConnectionPointReference) create(UMLPackage.Literals.CONNECTION_POINT_REFERENCE);
		getConnections().add(newConnection);
		if (name != null)
			newConnection.setName(name);
		return newConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference getConnection(String name) {
		return getConnection(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference getConnection(String name,
			boolean ignoreCase, boolean createOnDemand) {
		connectionLoop : for (Iterator i = getConnections().iterator(); i
			.hasNext();) {
			ConnectionPointReference connection = (ConnectionPointReference) i
				.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(connection.getName())
				: name.equals(connection.getName())))
				continue connectionLoop;
			return connection;
		}
		return createOnDemand
			? createConnection(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentWithInverseEList.Resolving(
				Pseudostate.class, this, UMLPackage.STATE__CONNECTION_POINT,
				UMLPackage.PSEUDOSTATE__STATE);
		}
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createConnectionPoint(String name) {
		Pseudostate newConnectionPoint = (Pseudostate) create(UMLPackage.Literals.PSEUDOSTATE);
		getConnectionPoints().add(newConnectionPoint);
		if (name != null)
			newConnectionPoint.setName(name);
		return newConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getConnectionPoint(String name) {
		return getConnectionPoint(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getConnectionPoint(String name, boolean ignoreCase,
			boolean createOnDemand) {
		connectionPointLoop : for (Iterator i = getConnectionPoints()
			.iterator(); i.hasNext();) {
			Pseudostate connectionPoint = (Pseudostate) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(connectionPoint.getName())
				: name.equals(connectionPoint.getName())))
				continue connectionPointLoop;
			return connectionPoint;
		}
		return createOnDemand
			? createConnectionPoint(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getRedefinedState() {
		if (redefinedState != null && redefinedState.eIsProxy()) {
			InternalEObject oldRedefinedState = (InternalEObject) redefinedState;
			redefinedState = (State) eResolveProxy(oldRedefinedState);
			if (redefinedState != oldRedefinedState) {
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
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState(State newRedefinedState) {
		State oldRedefinedState = redefinedState;
		redefinedState = newRedefinedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__REDEFINED_STATE, oldRedefinedState,
				redefinedState));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		if (stateInvariant != null && stateInvariant.eIsProxy()) {
			InternalEObject oldStateInvariant = (InternalEObject) stateInvariant;
			stateInvariant = (Constraint) eResolveProxy(oldStateInvariant);
			if (stateInvariant != oldStateInvariant) {
				InternalEObject newStateInvariant = (InternalEObject) stateInvariant;
				NotificationChain msgs = oldStateInvariant.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__STATE_INVARIANT,
					null, null);
				if (newStateInvariant.eInternalContainer() == null) {
					msgs = newStateInvariant.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STATE__STATE_INVARIANT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE__STATE_INVARIANT, oldStateInvariant,
						stateInvariant));
			}
		}
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(
			Constraint newStateInvariant, NotificationChain msgs) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__STATE_INVARIANT,
				oldStateInvariant, newStateInvariant);
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
	public Constraint createStateInvariant(String name, EClass eClass) {
		Constraint newStateInvariant = (Constraint) create(eClass);
		setStateInvariant(newStateInvariant);
		if (name != null)
			newStateInvariant.setName(name);
		return newStateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createStateInvariant(String name) {
		return createStateInvariant(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject) entry;
			entry = (Behavior) eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				InternalEObject newEntry = (InternalEObject) entry;
				NotificationChain msgs = oldEntry.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__ENTRY, null,
					null);
				if (newEntry.eInternalContainer() == null) {
					msgs = newEntry.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE__ENTRY, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry,
			NotificationChain msgs) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__ENTRY, oldEntry, newEntry);
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
	public Behavior createEntry(String name, EClass eClass) {
		Behavior newEntry = (Behavior) create(eClass);
		setEntry(newEntry);
		if (name != null)
			newEntry.setName(name);
		return newEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		if (exit != null && exit.eIsProxy()) {
			InternalEObject oldExit = (InternalEObject) exit;
			exit = (Behavior) eResolveProxy(oldExit);
			if (exit != oldExit) {
				InternalEObject newExit = (InternalEObject) exit;
				NotificationChain msgs = oldExit
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE__EXIT, null, null);
				if (newExit.eInternalContainer() == null) {
					msgs = newExit.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.STATE__EXIT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE__EXIT, oldExit, exit));
			}
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit,
			NotificationChain msgs) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__EXIT, oldExit, newExit);
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
	public Behavior createExit(String name, EClass eClass) {
		Behavior newExit = (Behavior) create(eClass);
		setExit(newExit);
		if (name != null)
			newExit.setName(name);
		return newExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		if (doActivity != null && doActivity.eIsProxy()) {
			InternalEObject oldDoActivity = (InternalEObject) doActivity;
			doActivity = (Behavior) eResolveProxy(oldDoActivity);
			if (doActivity != oldDoActivity) {
				InternalEObject newDoActivity = (InternalEObject) doActivity;
				NotificationChain msgs = oldDoActivity.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__DO_ACTIVITY,
					null, null);
				if (newDoActivity.eInternalContainer() == null) {
					msgs = newDoActivity.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__DO_ACTIVITY,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE__DO_ACTIVITY, oldDoActivity,
						doActivity));
			}
		}
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity,
			NotificationChain msgs) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STATE__DO_ACTIVITY, oldDoActivity,
				newDoActivity);
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
	public Behavior createDoActivity(String name, EClass eClass) {
		Behavior newDoActivity = (Behavior) create(eClass);
		setDoActivity(newDoActivity);
		if (name != null)
			newDoActivity.setName(name);
		return newDoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeferrableTriggers() {
		if (deferrableTriggers == null) {
			deferrableTriggers = new EObjectContainmentEList.Resolving(
				Trigger.class, this, UMLPackage.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createDeferrableTrigger(String name) {
		Trigger newDeferrableTrigger = (Trigger) create(UMLPackage.Literals.TRIGGER);
		getDeferrableTriggers().add(newDeferrableTrigger);
		if (name != null)
			newDeferrableTrigger.setName(name);
		return newDeferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getDeferrableTrigger(String name) {
		return getDeferrableTrigger(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getDeferrableTrigger(String name, boolean ignoreCase,
			boolean createOnDemand) {
		deferrableTriggerLoop : for (Iterator i = getDeferrableTriggers()
			.iterator(); i.hasNext();) {
			Trigger deferrableTrigger = (Trigger) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deferrableTrigger.getName())
				: name.equals(deferrableTrigger.getName())))
				continue deferrableTriggerLoop;
			return deferrableTrigger;
		}
		return createOnDemand
			? createDeferrableTrigger(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentWithInverseEList.Resolving(
				Region.class, this, UMLPackage.STATE__REGION,
				UMLPackage.REGION__STATE);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion(String name) {
		Region newRegion = (Region) create(UMLPackage.Literals.REGION);
		getRegions().add(newRegion);
		if (name != null)
			newRegion.setName(name);
		return newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion(String name) {
		return getRegion(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion(String name, boolean ignoreCase,
			boolean createOnDemand) {
		regionLoop : for (Iterator i = getRegions().iterator(); i.hasNext();) {
			Region region = (Region) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(region.getName())
				: name.equals(region.getName())))
				continue regionLoop;
			return region;
		}
		return createOnDemand
			? createRegion(name)
			: null;
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
				return basicSetContainer((Region) otherEnd, msgs);
			case UMLPackage.STATE__SUBMACHINE :
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
				return basicSetContainer(null, msgs);
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
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
				if (resolve)
					return getContainer();
				return basicGetContainer();
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
				if (resolve)
					return getStateInvariant();
				return basicGetStateInvariant();
			case UMLPackage.STATE__ENTRY :
				if (resolve)
					return getEntry();
				return basicGetEntry();
			case UMLPackage.STATE__EXIT :
				if (resolve)
					return getExit();
				return basicGetExit();
			case UMLPackage.STATE__DO_ACTIVITY :
				if (resolve)
					return getDoActivity();
				return basicGetDoActivity();
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE__OWNER :
				return isSetOwner();
			case UMLPackage.STATE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STATE__NAME :
				return isSetName();
			case UMLPackage.STATE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STATE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.STATE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.STATE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
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
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.STATE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.STATE__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.STATE__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.STATE__IS_ORTHOGONAL :
				return isOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
			case UMLPackage.STATE__IS_SIMPLE :
				return isSimple() != IS_SIMPLE_EDEFAULT;
			case UMLPackage.STATE__IS_SUBMACHINE_STATE :
				return isSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
			case UMLPackage.STATE__SUBMACHINE :
				return submachine != null;
			case UMLPackage.STATE__CONNECTION :
				return connections != null && !connections.isEmpty();
			case UMLPackage.STATE__CONNECTION_POINT :
				return connectionPoints != null && !connectionPoints.isEmpty();
			case UMLPackage.STATE__REDEFINED_STATE :
				return redefinedState != null;
			case UMLPackage.STATE__STATE_INVARIANT :
				return stateInvariant != null;
			case UMLPackage.STATE__ENTRY :
				return entry != null;
			case UMLPackage.STATE__EXIT :
				return exit != null;
			case UMLPackage.STATE__DO_ACTIVITY :
				return doActivity != null;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				return deferrableTriggers != null
					&& !deferrableTriggers.isEmpty();
			case UMLPackage.STATE__REGION :
				return regions != null && !regions.isEmpty();
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
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{UMLPackage.STATE__REDEFINED_STATE};

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
		return super.isSetNamespace() || eIsSet(UMLPackage.STATE__CONTAINER);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.STATE__OWNED_RULE, UMLPackage.STATE__CONNECTION,
		UMLPackage.STATE__REGION};

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
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.STATE__OWNED_COMMENT, UMLPackage.STATE__NAME_EXPRESSION,
		UMLPackage.STATE__ELEMENT_IMPORT, UMLPackage.STATE__PACKAGE_IMPORT,
		UMLPackage.STATE__OWNED_MEMBER, UMLPackage.STATE__CONNECTION_POINT,
		UMLPackage.STATE__STATE_INVARIANT, UMLPackage.STATE__ENTRY,
		UMLPackage.STATE__EXIT, UMLPackage.STATE__DO_ACTIVITY};

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

} //StateImpl
