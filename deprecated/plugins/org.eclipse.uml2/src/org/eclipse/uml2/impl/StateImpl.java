/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StateImpl.java,v 1.20 2005/11/09 22:53:08 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.ConnectionPointReference;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.State;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Transition;
import org.eclipse.uml2.Trigger;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.internal.operation.RedefinableElementOperations;
import org.eclipse.uml2.internal.operation.StateMachineOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getConnections <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getDeferrableTriggers <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getOutgoings() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList outgoing = null;

	/**
	 * The cached value of the '{@link #getIncomings() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList incoming = null;

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
	protected EList connection = null;

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
	 * The cached value of the '{@link #getDeferrableTriggers() <em>Deferrable Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList deferrableTrigger = null;

	/**
	 * The cached value of the '{@link #getRegions() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList region = null;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Activity entry = null;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Activity exit = null;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity doActivity = null;

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
		return UML2Package.eINSTANCE.getState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Classifier getRedefinitionContext(String name) {
		for (Iterator i = getRedefinitionContexts().iterator(); i.hasNext(); ) {
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
		if (newIsLeaf) eFlags |= IS_LEAF_EFLAG; else eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__IS_LEAF, oldIsLeaf, newIsLeaf));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID != UML2Package.STATE__CONTAINER) return null;
		return (Region)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eContainer || (eContainerFeatureID != UML2Package.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newContainer, UML2Package.STATE__CONTAINER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__CONTAINER, newContainer, newContainer));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainer() {
		return getContainer() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoings() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList(Transition.class, this, UML2Package.STATE__OUTGOING, UML2Package.TRANSITION__SOURCE);
		}
		return outgoing;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Transition getOutgoing(String name) {
		for (Iterator i = getOutgoings().iterator(); i.hasNext(); ) {
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
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList(Transition.class, this, UML2Package.STATE__INCOMING, UML2Package.TRANSITION__TARGET);
		}
		return incoming;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Transition getIncoming(String name) {
		for (Iterator i = getIncomings().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 */
	public boolean isComposite() {
		return getRegions().size() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isOrthogonal() {
		return getRegions().size() > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSimple() {
		return getRegions().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSubmachineState() {
		return null != getSubmachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getSubmachine() {
		if (submachine != null && submachine.eIsProxy()) {
			StateMachine oldSubmachine = submachine;
			submachine = (StateMachine)eResolveProxy((InternalEObject)submachine);
			if (submachine != oldSubmachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STATE__SUBMACHINE, oldSubmachine, submachine));
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
	public void setSubmachine(StateMachine newSubmachine) {
		StateMachine oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__SUBMACHINE, oldSubmachine, submachine));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnections() {
		if (connection == null) {
			connection = new EObjectContainmentEList(ConnectionPointReference.class, this, UML2Package.STATE__CONNECTION);
		}
		return connection;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ConnectionPointReference getConnection(String name) {
		for (Iterator i = getConnections().iterator(); i.hasNext(); ) {
			ConnectionPointReference connection = (ConnectionPointReference) i.next();
			if (name.equals(connection.getName())) {
				return connection;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createConnection() instead.
	 */
	public ConnectionPointReference createConnection(EClass eClass) {
		ConnectionPointReference newConnection = (ConnectionPointReference) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__CONNECTION, null, newConnection));
		}
		getConnections().add(newConnection);
		return newConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnection() {
		ConnectionPointReference newConnection = UML2Factory.eINSTANCE.createConnectionPointReference();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__CONNECTION, null, newConnection));
		}
		getConnections().add(newConnection);
		return newConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getRedefinedState() {
		if (redefinedState != null && redefinedState.eIsProxy()) {
			State oldRedefinedState = redefinedState;
			redefinedState = (State)eResolveProxy((InternalEObject)redefinedState);
			if (redefinedState != oldRedefinedState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedState() {
		return redefinedState != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeferrableTriggers() {
		if (deferrableTrigger == null) {
			deferrableTrigger = new EObjectResolvingEList(Trigger.class, this, UML2Package.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTrigger;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Trigger getDeferrableTrigger(String name) {
		for (Iterator i = getDeferrableTriggers().iterator(); i.hasNext(); ) {
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
		if (region == null) {
			region = new EObjectContainmentWithInverseEList(Region.class, this, UML2Package.STATE__REGION, UML2Package.REGION__STATE);
		}
		return region;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Region getRegion(String name) {
		for (Iterator i = getRegions().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createRegion() instead.
	 */
	public Region createRegion(EClass eClass) {
		Region newRegion = (Region) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__REGION, null, newRegion));
		}
		getRegions().add(newRegion);
		return newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		Region newRegion = UML2Factory.eINSTANCE.createRegion();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__REGION, null, newRegion));
		}
		getRegions().add(newRegion);
		return newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Activity newEntry, NotificationChain msgs) {
		Activity oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Activity newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__ENTRY, newEntry, newEntry));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createEntry() instead.
	 */
	public Activity createEntry(EClass eClass) {
		Activity newEntry = (Activity) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__ENTRY, null, newEntry));
		}
		setEntry(newEntry);
		return newEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createEntry() {
		Activity newEntry = UML2Factory.eINSTANCE.createActivity();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__ENTRY, null, newEntry));
		}
		setEntry(newEntry);
		return newEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Activity newExit, NotificationChain msgs) {
		Activity oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Activity newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__EXIT, newExit, newExit));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createExit() instead.
	 */
	public Activity createExit(EClass eClass) {
		Activity newExit = (Activity) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__EXIT, null, newExit));
		}
		setExit(newExit);
		return newExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createExit() {
		Activity newExit = UML2Factory.eINSTANCE.createActivity();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__EXIT, null, newExit));
		}
		setExit(newExit);
		return newExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Activity newDoActivity, NotificationChain msgs) {
		Activity oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Activity newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createDoActivity() instead.
	 */
	public Activity createDoActivity(EClass eClass) {
		Activity newDoActivity = (Activity) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__DO_ACTIVITY, null, newDoActivity));
		}
		setDoActivity(newDoActivity);
		return newDoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createDoActivity() {
		Activity newDoActivity = UML2Factory.eINSTANCE.createActivity();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__DO_ACTIVITY, null, newDoActivity));
		}
		setDoActivity(newDoActivity);
		return newDoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(Constraint newStateInvariant, NotificationChain msgs) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)stateInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__STATE_INVARIANT, null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject)newStateInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__STATE_INVARIANT, null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__STATE_INVARIANT, newStateInvariant, newStateInvariant));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createStateInvariant(EClass eClass) {
		Constraint newStateInvariant = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__STATE_INVARIANT, null, newStateInvariant));
		}
		setStateInvariant(newStateInvariant);
		return newStateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createStateInvariant() {
		Constraint newStateInvariant = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE__STATE_INVARIANT, null, newStateInvariant));
		}
		setStateInvariant(newStateInvariant);
		return newStateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableElementOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinable) {
		return RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		return getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		if (newOwner != null && !(newOwner instanceof Region)) {
			throw new IllegalArgumentException(String.valueOf(newOwner));
		}
		setContainer((Region) newOwner);
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return basicGetOwner() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getRedefinableElement_RedefinitionContext());

			if (result == null) {
				EList redefinitionContexts = StateMachineOperations
					.getRedefinitionContexts(this);
				cache.put(this, UML2Package.eINSTANCE
					.getRedefinableElement_RedefinitionContext(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE
							.getRedefinableElement_RedefinitionContext(),
						redefinitionContexts.size(), redefinitionContexts
							.toArray()));
			}

			return result;
		}

		EList redefinitionContexts = StateMachineOperations
			.getRedefinitionContexts(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getRedefinableElement_RedefinitionContext(), redefinitionContexts
			.size(), redefinitionContexts.toArray());
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
		return !getRedefinedElements().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public RedefinableElement getRedefinedElement(String name) {
		for (Iterator i = getRedefinedElements().iterator(); i.hasNext(); ) {
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
	 * @generated
	 */
	public Element getOwner() {
		return getContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STATE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.STATE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__CONTAINER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STATE__CONTAINER, msgs);
				case UML2Package.STATE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE__REGION:
					return ((InternalEList)getRegions()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STATE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.STATE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.STATE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__CONTAINER:
					return eBasicSetContainer(null, UML2Package.STATE__CONTAINER, msgs);
				case UML2Package.STATE__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__CONNECTION:
					return ((InternalEList)getConnections()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__REGION:
					return ((InternalEList)getRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE__ENTRY:
					return basicSetEntry(null, msgs);
				case UML2Package.STATE__EXIT:
					return basicSetExit(null, msgs);
				case UML2Package.STATE__DO_ACTIVITY:
					return basicSetDoActivity(null, msgs);
				case UML2Package.STATE__STATE_INVARIANT:
					return basicSetStateInvariant(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.STATE__CONTAINER:
					return eContainer.eInverseRemove(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STATE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STATE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STATE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STATE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STATE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STATE__NAME:
				return getName();
			case UML2Package.STATE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.STATE__VISIBILITY:
				return getVisibility();
			case UML2Package.STATE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.STATE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.STATE__MEMBER:
				return getMembers();
			case UML2Package.STATE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.STATE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.STATE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.STATE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.STATE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.STATE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE__CONTAINER:
				return getContainer();
			case UML2Package.STATE__OUTGOING:
				return getOutgoings();
			case UML2Package.STATE__INCOMING:
				return getIncomings();
			case UML2Package.STATE__IS_COMPOSITE:
				return isComposite() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE__IS_ORTHOGONAL:
				return isOrthogonal() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE__IS_SIMPLE:
				return isSimple() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STATE__SUBMACHINE:
				if (resolve) return getSubmachine();
				return basicGetSubmachine();
			case UML2Package.STATE__CONNECTION:
				return getConnections();
			case UML2Package.STATE__REDEFINED_STATE:
				if (resolve) return getRedefinedState();
				return basicGetRedefinedState();
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTriggers();
			case UML2Package.STATE__REGION:
				return getRegions();
			case UML2Package.STATE__ENTRY:
				return getEntry();
			case UML2Package.STATE__EXIT:
				return getExit();
			case UML2Package.STATE__DO_ACTIVITY:
				return getDoActivity();
			case UML2Package.STATE__STATE_INVARIANT:
				return getStateInvariant();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STATE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STATE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.STATE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.STATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.STATE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STATE__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.STATE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__SUBMACHINE:
				setSubmachine((StateMachine)newValue);
				return;
			case UML2Package.STATE__CONNECTION:
				getConnections().clear();
				getConnections().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__REDEFINED_STATE:
				setRedefinedState((State)newValue);
				return;
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTriggers().clear();
				getDeferrableTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__REGION:
				getRegions().clear();
				getRegions().addAll((Collection)newValue);
				return;
			case UML2Package.STATE__ENTRY:
				setEntry((Activity)newValue);
				return;
			case UML2Package.STATE__EXIT:
				setExit((Activity)newValue);
				return;
			case UML2Package.STATE__DO_ACTIVITY:
				setDoActivity((Activity)newValue);
				return;
			case UML2Package.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STATE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STATE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STATE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.STATE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STATE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.STATE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.STATE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.STATE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.STATE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.STATE__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.STATE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.STATE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.STATE__SUBMACHINE:
				setSubmachine((StateMachine)null);
				return;
			case UML2Package.STATE__CONNECTION:
				getConnections().clear();
				return;
			case UML2Package.STATE__REDEFINED_STATE:
				setRedefinedState((State)null);
				return;
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTriggers().clear();
				return;
			case UML2Package.STATE__REGION:
				getRegions().clear();
				return;
			case UML2Package.STATE__ENTRY:
				setEntry((Activity)null);
				return;
			case UML2Package.STATE__EXIT:
				setExit((Activity)null);
				return;
			case UML2Package.STATE__DO_ACTIVITY:
				setDoActivity((Activity)null);
				return;
			case UML2Package.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STATE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STATE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.STATE__OWNER:
				return isSetOwner();
			case UML2Package.STATE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STATE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STATE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STATE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STATE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.STATE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.STATE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STATE__MEMBER:
				return isSetMembers();
			case UML2Package.STATE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.STATE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.STATE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.STATE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.STATE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.STATE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.STATE__CONTAINER:
				return isSetContainer();
			case UML2Package.STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.STATE__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case UML2Package.STATE__IS_ORTHOGONAL:
				return isOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
			case UML2Package.STATE__IS_SIMPLE:
				return isSimple() != IS_SIMPLE_EDEFAULT;
			case UML2Package.STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
			case UML2Package.STATE__SUBMACHINE:
				return submachine != null;
			case UML2Package.STATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case UML2Package.STATE__REDEFINED_STATE:
				return isSetRedefinedState();
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				return deferrableTrigger != null && !deferrableTrigger.isEmpty();
			case UML2Package.STATE__REGION:
				return region != null && !region.isEmpty();
			case UML2Package.STATE__ENTRY:
				return entry != null;
			case UML2Package.STATE__EXIT:
				return exit != null;
			case UML2Package.STATE__DO_ACTIVITY:
				return doActivity != null;
			case UML2Package.STATE__STATE_INVARIANT:
				return stateInvariant != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.STATE__REDEFINITION_CONTEXT: return UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2Package.STATE__IS_LEAF: return UML2Package.REDEFINABLE_ELEMENT__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (derivedFeatureID) {
				case UML2Package.STATE__CONTAINER: return UML2Package.VERTEX__CONTAINER;
				case UML2Package.STATE__OUTGOING: return UML2Package.VERTEX__OUTGOING;
				case UML2Package.STATE__INCOMING: return UML2Package.VERTEX__INCOMING;
				default: return -1;
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
				case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2Package.STATE__REDEFINITION_CONTEXT;
				case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF: return UML2Package.STATE__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseFeatureID) {
				case UML2Package.VERTEX__CONTAINER: return UML2Package.STATE__CONTAINER;
				case UML2Package.VERTEX__OUTGOING: return UML2Package.STATE__OUTGOING;
				case UML2Package.VERTEX__INCOMING: return UML2Package.STATE__INCOMING;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

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
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (eIsSet(UML2Package.eINSTANCE.getState_Connection())) {
			ownedElement.addAll(getConnections());
		}
		Activity entry = getEntry();
		if (entry != null) {
			ownedElement.add(entry);
		}
		Activity exit = getExit();
		if (exit != null) {
			ownedElement.add(exit);
		}
		Activity doActivity = getDoActivity();
		if (doActivity != null) {
			ownedElement.add(doActivity);
		}
		Constraint stateInvariant = getStateInvariant();
		if (stateInvariant != null) {
			ownedElement.add(stateInvariant);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getState_Connection())
			|| eIsSet(UML2Package.eINSTANCE.getState_Entry())
			|| eIsSet(UML2Package.eINSTANCE.getState_Exit())
			|| eIsSet(UML2Package.eINSTANCE.getState_DoActivity())
			|| eIsSet(UML2Package.eINSTANCE.getState_StateInvariant());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		if (eIsSet(UML2Package.eINSTANCE.getState_Region())) {
			ownedMember.addAll(getRegions());
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.eINSTANCE.getState_Region());
	}


} //StateImpl
