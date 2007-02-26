/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectionPointReferenceImpl.java,v 1.19 2007/02/26 16:17:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConnectionPointReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getExits <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPointReferenceImpl
		extends VertexImpl
		implements ConnectionPointReference {

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> entries;

	/**
	 * The cached value of the '{@link #getExits() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExits()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> exits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTION_POINT_REFERENCE;
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
	public EList<Pseudostate> getEntries() {
		if (entries == null) {
			entries = new EObjectResolvingEList<Pseudostate>(Pseudostate.class,
				this, UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getEntry(String name) {
		return getEntry(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getEntry(String name, boolean ignoreCase) {
		entryLoop : for (Pseudostate entry : getEntries()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(entry.getName())
				: name.equals(entry.getName())))
				continue entryLoop;
			return entry;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getExits() {
		if (exits == null) {
			exits = new EObjectResolvingEList<Pseudostate>(Pseudostate.class,
				this, UMLPackage.CONNECTION_POINT_REFERENCE__EXIT);
		}
		return exits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getExit(String name) {
		return getExit(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getExit(String name, boolean ignoreCase) {
		exitLoop : for (Pseudostate exit : getExits()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(exit.getName())
				: name.equals(exit.getName())))
				continue exitLoop;
			return exit;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID != UMLPackage.CONNECTION_POINT_REFERENCE__STATE)
			return null;
		return (State) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		if (eContainerFeatureID != UMLPackage.CONNECTION_POINT_REFERENCE__STATE)
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
			UMLPackage.CONNECTION_POINT_REFERENCE__STATE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {

		if (newState != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.CONNECTION_POINT_REFERENCE__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
					UMLPackage.STATE__CONNECTION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTION_POINT_REFERENCE__STATE, newState,
				newState));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPseudostates(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectionPointReferenceOperations.validateEntryPseudostates(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPseudostates(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectionPointReferenceOperations.validateExitPseudostates(
			this, diagnostics, context);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State) otherEnd, msgs);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return basicSetContainer(null, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return basicSetState(null, msgs);
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
		switch (eContainerFeatureID) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STATE__CONNECTION, State.class, msgs);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				return getName();
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return getOutgoings();
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return getIncomings();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				return getEntries();
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				return getExits();
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				if (resolve)
					return getState();
				return basicGetState();
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll(
					(Collection<? extends Transition>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll(
					(Collection<? extends Transition>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				getEntries().clear();
				getEntries().addAll(
					(Collection<? extends Pseudostate>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				getExits().clear();
				getExits().addAll((Collection<? extends Pseudostate>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				setState((State) newValue);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				unsetName();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				getEntries().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				getExits().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				setState((State) null);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				return isSetName();
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				return entries != null && !entries.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				return exits != null && !exits.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return basicGetState() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetNamespace() {

		State state = basicGetState();
		if (state != null) {
			return state;
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
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.CONNECTION_POINT_REFERENCE__STATE);
	}

} //ConnectionPointReferenceImpl
