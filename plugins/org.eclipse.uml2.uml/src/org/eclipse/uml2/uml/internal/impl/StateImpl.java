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
import java.util.Collections;
import java.util.List;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.StateOperations;
import org.eclipse.uml2.uml.internal.operations.VertexOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getConnections <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getDeferrableTriggers <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#isSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateImpl#getRegions <em>Region</em>}</li>
 * </ul>
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
	protected static final int IS_LEAF_EFLAG = 1 << 12;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointReference> connections;

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoints;

	/**
	 * The cached value of the '{@link #getDeferrableTriggers() <em>Deferrable Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTriggers;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

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
	 * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected State redefinedState;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant;

	/**
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine submachine;

	/**
	 * The cached value of the '{@link #getRegions() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						UMLPackage.STATE__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList<RedefinableElement>(
			RedefinableElement.class, this, UMLPackage.STATE__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Classifier> getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Classifier> result = (EList<Classifier>) cache.get(this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);

			if (result == null) {
				Classifier redefinitionContext = redefinitionContext();
				List<Classifier> redefinitionContexts = redefinitionContext == null
					? Collections.<Classifier> emptyList()
					: Collections.singletonList(redefinitionContext);
				cache.put(this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
					result = new EcoreEList.UnmodifiableEList<Classifier>(this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						redefinitionContexts.size(),
						redefinitionContexts.toArray()));
			}

			return result;
		}

		Classifier redefinitionContext = redefinitionContext();
		List<Classifier> redefinitionContexts = redefinitionContext == null
			? Collections.<Classifier> emptyList()
			: Collections.singletonList(redefinitionContext);
		return new EcoreEList.UnmodifiableEList<Classifier>(this,
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
		redefinitionContextLoop : for (Classifier redefinitionContext : getRedefinitionContexts()) {
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
	@Override
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
	public EList<Transition> getOutgoings() {
		return VertexOperations.getOutgoings(this);
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
	public Transition getOutgoing(String name, boolean ignoreCase,
			EClass eClass) {
		outgoingLoop : for (Transition outgoing : getOutgoings()) {
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
	public EList<Transition> getIncomings() {
		return VertexOperations.getIncomings(this);
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
	public Transition getIncoming(String name, boolean ignoreCase,
			EClass eClass) {
		incomingLoop : for (Transition incoming : getIncomings()) {
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
		if (eContainerFeatureID() != UMLPackage.STATE__CONTAINER)
			return null;
		return (Region) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetContainer() {
		if (eContainerFeatureID() != UMLPackage.STATE__CONTAINER)
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
			|| (eContainerFeatureID() != UMLPackage.STATE__CONTAINER
				&& newContainer != null)) {
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
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.STATE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.STATE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
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
						Element.class, this, UMLPackage.STATE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
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
						UMLPackage.STATE__SUBMACHINE, oldSubmachine,
						submachine));
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
	public EList<ConnectionPointReference> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList.Resolving<ConnectionPointReference>(
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
		ConnectionPointReference newConnection = (ConnectionPointReference) create(
			UMLPackage.Literals.CONNECTION_POINT_REFERENCE);
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
		connectionLoop : for (ConnectionPointReference connection : getConnections()) {
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
	public EList<Pseudostate> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentWithInverseEList.Resolving<Pseudostate>(
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
		Pseudostate newConnectionPoint = (Pseudostate) create(
			UMLPackage.Literals.PSEUDOSTATE);
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
		connectionPointLoop : for (Pseudostate connectionPoint : getConnectionPoints()) {
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
	public void setStateInvariant(Constraint newStateInvariant) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE__STATE_INVARIANT, oldStateInvariant,
				stateInvariant));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newStateInvariant != null) {
				EList<Constraint> ownedRules = getOwnedRules();
				if (!ownedRules.contains(newStateInvariant)) {
					ownedRules.add(newStateInvariant);
				}
			}
		}
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
					msgs = newEntry.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__ENTRY, null,
						msgs);
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
				NotificationChain msgs = oldExit.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__EXIT, null,
					null);
				if (newExit.eInternalContainer() == null) {
					msgs = newExit.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__EXIT, null,
						msgs);
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
				msgs = ((InternalEObject) exit).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__EXIT, null,
					msgs);
			if (newExit != null)
				msgs = ((InternalEObject) newExit).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.STATE__EXIT, null,
					msgs);
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
	public EList<Trigger> getDeferrableTriggers() {
		if (deferrableTriggers == null) {
			deferrableTriggers = new EObjectContainmentEList.Resolving<Trigger>(
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
		Trigger newDeferrableTrigger = (Trigger) create(
			UMLPackage.Literals.TRIGGER);
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
		deferrableTriggerLoop : for (Trigger deferrableTrigger : getDeferrableTriggers()) {
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
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentWithInverseEList.Resolving<Region>(
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
		regionLoop : for (Region region : getRegions()) {
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
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations
			.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonLeafRedefinition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RedefinableElementOperations.validateNonLeafRedefinition(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(
			RedefinableElement redefinedElement) {
		return StateOperations.isRedefinitionContextValid(this,
			redefinedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return StateOperations.isConsistentWith(this, redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmachineStates(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StateOperations.validateSubmachineStates(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationsOrSourcesOfTransitions(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StateOperations.validateDestinationsOrSourcesOfTransitions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmachineOrRegions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StateOperations.validateSubmachineOrRegions(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeStates(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StateOperations.validateCompositeStates(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryOrExit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
	public StateMachine containingStateMachine() {
		return StateOperations.containingStateMachine(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainedInState(State s) {
		return VertexOperations.isContainedInState(this, s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainedInRegion(Region r) {
		return VertexOperations.isContainedInRegion(this, r);
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
			case UMLPackage.STATE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
			case UMLPackage.STATE__CONNECTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnections())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__CONNECTION_POINT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectionPoints())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STATE__SUBMACHINE :
				if (submachine != null)
					msgs = ((InternalEObject) submachine).eInverseRemove(this,
						UMLPackage.STATE_MACHINE__SUBMACHINE_STATE,
						StateMachine.class, msgs);
				return basicSetSubmachine((StateMachine) otherEnd, msgs);
			case UMLPackage.STATE__REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegions())
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
			case UMLPackage.STATE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STATE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__CONTAINER :
				return basicSetContainer(null, msgs);
			case UMLPackage.STATE__CONNECTION :
				return ((InternalEList<?>) getConnections())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__CONNECTION_POINT :
				return ((InternalEList<?>) getConnectionPoints())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				return ((InternalEList<?>) getDeferrableTriggers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE__DO_ACTIVITY :
				return basicSetDoActivity(null, msgs);
			case UMLPackage.STATE__ENTRY :
				return basicSetEntry(null, msgs);
			case UMLPackage.STATE__EXIT :
				return basicSetExit(null, msgs);
			case UMLPackage.STATE__SUBMACHINE :
				return basicSetSubmachine(null, msgs);
			case UMLPackage.STATE__REGION :
				return ((InternalEList<?>) getRegions()).basicRemove(otherEnd,
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STATE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STATE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STATE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STATE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STATE__NAME :
				return getName();
			case UMLPackage.STATE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STATE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STATE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STATE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STATE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STATE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STATE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STATE__MEMBER :
				return getMembers();
			case UMLPackage.STATE__IS_LEAF :
				return isLeaf();
			case UMLPackage.STATE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STATE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STATE__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
			case UMLPackage.STATE__INCOMING :
				return getIncomings();
			case UMLPackage.STATE__OUTGOING :
				return getOutgoings();
			case UMLPackage.STATE__CONNECTION :
				return getConnections();
			case UMLPackage.STATE__CONNECTION_POINT :
				return getConnectionPoints();
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				return getDeferrableTriggers();
			case UMLPackage.STATE__DO_ACTIVITY :
				if (resolve)
					return getDoActivity();
				return basicGetDoActivity();
			case UMLPackage.STATE__ENTRY :
				if (resolve)
					return getEntry();
				return basicGetEntry();
			case UMLPackage.STATE__EXIT :
				if (resolve)
					return getExit();
				return basicGetExit();
			case UMLPackage.STATE__IS_COMPOSITE :
				return isComposite();
			case UMLPackage.STATE__IS_ORTHOGONAL :
				return isOrthogonal();
			case UMLPackage.STATE__IS_SIMPLE :
				return isSimple();
			case UMLPackage.STATE__IS_SUBMACHINE_STATE :
				return isSubmachineState();
			case UMLPackage.STATE__REDEFINED_STATE :
				if (resolve)
					return getRedefinedState();
				return basicGetRedefinedState();
			case UMLPackage.STATE__STATE_INVARIANT :
				if (resolve)
					return getStateInvariant();
				return basicGetStateInvariant();
			case UMLPackage.STATE__SUBMACHINE :
				if (resolve)
					return getSubmachine();
				return basicGetSubmachine();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.STATE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STATE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STATE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STATE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STATE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.STATE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.STATE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.STATE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.STATE__CONNECTION :
				getConnections().clear();
				getConnections().addAll(
					(Collection<? extends ConnectionPointReference>) newValue);
				return;
			case UMLPackage.STATE__CONNECTION_POINT :
				getConnectionPoints().clear();
				getConnectionPoints()
					.addAll((Collection<? extends Pseudostate>) newValue);
				return;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				getDeferrableTriggers().clear();
				getDeferrableTriggers()
					.addAll((Collection<? extends Trigger>) newValue);
				return;
			case UMLPackage.STATE__DO_ACTIVITY :
				setDoActivity((Behavior) newValue);
				return;
			case UMLPackage.STATE__ENTRY :
				setEntry((Behavior) newValue);
				return;
			case UMLPackage.STATE__EXIT :
				setExit((Behavior) newValue);
				return;
			case UMLPackage.STATE__REDEFINED_STATE :
				setRedefinedState((State) newValue);
				return;
			case UMLPackage.STATE__STATE_INVARIANT :
				setStateInvariant((Constraint) newValue);
				return;
			case UMLPackage.STATE__SUBMACHINE :
				setSubmachine((StateMachine) newValue);
				return;
			case UMLPackage.STATE__REGION :
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>) newValue);
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
			case UMLPackage.STATE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STATE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STATE__NAME :
				unsetName();
				return;
			case UMLPackage.STATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STATE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STATE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STATE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STATE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STATE__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.STATE__CONNECTION :
				getConnections().clear();
				return;
			case UMLPackage.STATE__CONNECTION_POINT :
				getConnectionPoints().clear();
				return;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				getDeferrableTriggers().clear();
				return;
			case UMLPackage.STATE__DO_ACTIVITY :
				setDoActivity((Behavior) null);
				return;
			case UMLPackage.STATE__ENTRY :
				setEntry((Behavior) null);
				return;
			case UMLPackage.STATE__EXIT :
				setExit((Behavior) null);
				return;
			case UMLPackage.STATE__REDEFINED_STATE :
				setRedefinedState((State) null);
				return;
			case UMLPackage.STATE__STATE_INVARIANT :
				setStateInvariant((Constraint) null);
				return;
			case UMLPackage.STATE__SUBMACHINE :
				setSubmachine((StateMachine) null);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STATE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STATE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE__OWNER :
				return isSetOwner();
			case UMLPackage.STATE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.STATE__NAME :
				return isSetName();
			case UMLPackage.STATE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STATE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STATE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.STATE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.STATE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.STATE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STATE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STATE__MEMBER :
				return isSetMembers();
			case UMLPackage.STATE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STATE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STATE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STATE__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.STATE__INCOMING :
				return !getIncomings().isEmpty();
			case UMLPackage.STATE__OUTGOING :
				return !getOutgoings().isEmpty();
			case UMLPackage.STATE__CONNECTION :
				return connections != null && !connections.isEmpty();
			case UMLPackage.STATE__CONNECTION_POINT :
				return connectionPoints != null && !connectionPoints.isEmpty();
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				return deferrableTriggers != null
					&& !deferrableTriggers.isEmpty();
			case UMLPackage.STATE__DO_ACTIVITY :
				return doActivity != null;
			case UMLPackage.STATE__ENTRY :
				return entry != null;
			case UMLPackage.STATE__EXIT :
				return exit != null;
			case UMLPackage.STATE__IS_COMPOSITE :
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UMLPackage.STATE__IS_ORTHOGONAL :
				return isOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
			case UMLPackage.STATE__IS_SIMPLE :
				return isSimple() != IS_SIMPLE_EDEFAULT;
			case UMLPackage.STATE__IS_SUBMACHINE_STATE :
				return isSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
			case UMLPackage.STATE__REDEFINED_STATE :
				return redefinedState != null;
			case UMLPackage.STATE__STATE_INVARIANT :
				return stateInvariant != null;
			case UMLPackage.STATE__SUBMACHINE :
				return submachine != null;
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
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
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
				case UMLPackage.STATE__CONTAINER :
					return UMLPackage.VERTEX__CONTAINER;
				case UMLPackage.STATE__INCOMING :
					return UMLPackage.VERTEX__INCOMING;
				case UMLPackage.STATE__OUTGOING :
					return UMLPackage.VERTEX__OUTGOING;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
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
				case UMLPackage.VERTEX__CONTAINER :
					return UMLPackage.STATE__CONTAINER;
				case UMLPackage.VERTEX__INCOMING :
					return UMLPackage.STATE__INCOMING;
				case UMLPackage.VERTEX__OUTGOING :
					return UMLPackage.STATE__OUTGOING;
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STATE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STATE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STATE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
					return UMLPackage.STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
					return UMLPackage.STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseOperationID) {
				case UMLPackage.VERTEX___CONTAINING_STATE_MACHINE :
					return UMLPackage.STATE___CONTAINING_STATE_MACHINE;
				case UMLPackage.VERTEX___GET_INCOMINGS :
					return UMLPackage.STATE___GET_INCOMINGS;
				case UMLPackage.VERTEX___GET_OUTGOINGS :
					return UMLPackage.STATE___GET_OUTGOINGS;
				case UMLPackage.VERTEX___IS_CONTAINED_IN_STATE__STATE :
					return UMLPackage.STATE___IS_CONTAINED_IN_STATE__STATE;
				case UMLPackage.VERTEX___IS_CONTAINED_IN_REGION__REGION :
					return UMLPackage.STATE___IS_CONTAINED_IN_REGION__REGION;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case UMLPackage.STATE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.STATE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.STATE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STATE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.STATE___DESTROY :
				destroy();
				return null;
			case UMLPackage.STATE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.STATE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.STATE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.STATE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.STATE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.STATE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STATE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.STATE___GET_MODEL :
				return getModel();
			case UMLPackage.STATE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.STATE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.STATE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.STATE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.STATE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.STATE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.STATE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STATE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.STATE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.STATE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.STATE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STATE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STATE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.STATE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STATE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.STATE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.STATE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.STATE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.STATE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.STATE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STATE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.STATE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.STATE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.STATE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.STATE___GET_LABEL :
				return getLabel();
			case UMLPackage.STATE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.STATE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.STATE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.STATE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.STATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.STATE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STATE___SEPARATOR :
				return separator();
			case UMLPackage.STATE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.STATE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.STATE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.STATE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.STATE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.STATE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.STATE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.STATE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.STATE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.STATE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.STATE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.STATE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.STATE___CONTAINING_STATE_MACHINE :
				return containingStateMachine();
			case UMLPackage.STATE___GET_INCOMINGS :
				return getIncomings();
			case UMLPackage.STATE___GET_OUTGOINGS :
				return getOutgoings();
			case UMLPackage.STATE___IS_CONTAINED_IN_STATE__STATE :
				return isContainedInState((State) arguments.get(0));
			case UMLPackage.STATE___IS_CONTAINED_IN_REGION__REGION :
				return isContainedInRegion((Region) arguments.get(0));
			case UMLPackage.STATE___VALIDATE_ENTRY_OR_EXIT__DIAGNOSTICCHAIN_MAP :
				return validateEntryOrExit((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_SUBMACHINE_STATES__DIAGNOSTICCHAIN_MAP :
				return validateSubmachineStates(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_COMPOSITE_STATES__DIAGNOSTICCHAIN_MAP :
				return validateCompositeStates(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_DESTINATIONS_OR_SOURCES_OF_TRANSITIONS__DIAGNOSTICCHAIN_MAP :
				return validateDestinationsOrSourcesOfTransitions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___VALIDATE_SUBMACHINE_OR_REGIONS__DIAGNOSTICCHAIN_MAP :
				return validateSubmachineOrRegions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STATE___IS_COMPOSITE :
				return isComposite();
			case UMLPackage.STATE___IS_ORTHOGONAL :
				return isOrthogonal();
			case UMLPackage.STATE___IS_SIMPLE :
				return isSimple();
			case UMLPackage.STATE___IS_SUBMACHINE_STATE :
				return isSubmachineState();
			case UMLPackage.STATE___REDEFINITION_CONTEXT :
				return redefinitionContext();
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
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.STATE__REDEFINED_STATE};

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
		redefinedElementLoop : for (RedefinableElement redefinedElement : getRedefinedElements()) {
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
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.STATE__REDEFINED_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
		UMLPackage.STATE__CONNECTION_POINT, UMLPackage.STATE__REGION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.STATE__CONNECTION)
			|| eIsSet(UMLPackage.STATE__CONNECTION_POINT)
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
		UMLPackage.STATE__OWNED_MEMBER, UMLPackage.STATE__DEFERRABLE_TRIGGER,
		UMLPackage.STATE__DO_ACTIVITY, UMLPackage.STATE__ENTRY,
		UMLPackage.STATE__EXIT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.STATE__OWNED_RULE, null,
				OWNED_RULE_ESUBSETS, UMLPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRules;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RULE_ESUBSETS = new int[]{
		UMLPackage.STATE__STATE_INVARIANT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STATE__DEFERRABLE_TRIGGER)
			|| eIsSet(UMLPackage.STATE__DO_ACTIVITY)
			|| eIsSet(UMLPackage.STATE__ENTRY)
			|| eIsSet(UMLPackage.STATE__EXIT);
	}

} //StateImpl
