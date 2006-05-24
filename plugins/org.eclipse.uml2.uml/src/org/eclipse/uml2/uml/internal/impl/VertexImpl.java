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
 * $Id: VertexImpl.java,v 1.16 2006/05/24 20:54:28 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.VertexOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VertexImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VertexImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VertexImpl#getIncomings <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VertexImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VertexImpl
		extends NamedElementImpl
		implements Vertex {

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VERTEX;
	}

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
	public EList getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList(Transition.class,
				this, UMLPackage.VERTEX__OUTGOING,
				UMLPackage.TRANSITION__SOURCE);
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
				this, UMLPackage.VERTEX__INCOMING,
				UMLPackage.TRANSITION__TARGET);
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
		if (eContainerFeatureID != UMLPackage.VERTEX__CONTAINER)
			return null;
		return (Region) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetContainer() {
		if (eContainerFeatureID != UMLPackage.VERTEX__CONTAINER)
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
			UMLPackage.VERTEX__CONTAINER, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.VERTEX__CONTAINER && newContainer != null)) {
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
				UMLPackage.VERTEX__CONTAINER, newContainer, newContainer));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine containingStateMachine() {
		return VertexOperations.containingStateMachine(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.VERTEX__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.VERTEX__OUTGOING :
				return ((InternalEList) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.VERTEX__INCOMING :
				return ((InternalEList) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.VERTEX__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
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
			case UMLPackage.VERTEX__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VERTEX__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VERTEX__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.VERTEX__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VERTEX__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VERTEX__CONTAINER :
				return basicSetContainer(null, msgs);
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
			case UMLPackage.VERTEX__CONTAINER :
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
			case UMLPackage.VERTEX__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VERTEX__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VERTEX__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VERTEX__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VERTEX__NAME :
				return getName();
			case UMLPackage.VERTEX__VISIBILITY :
				return getVisibility();
			case UMLPackage.VERTEX__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VERTEX__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VERTEX__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VERTEX__OUTGOING :
				return getOutgoings();
			case UMLPackage.VERTEX__INCOMING :
				return getIncomings();
			case UMLPackage.VERTEX__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
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
			case UMLPackage.VERTEX__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.VERTEX__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.VERTEX__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VERTEX__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.VERTEX__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VERTEX__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.VERTEX__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.VERTEX__CONTAINER :
				setContainer((Region) newValue);
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
			case UMLPackage.VERTEX__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VERTEX__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VERTEX__NAME :
				unsetName();
				return;
			case UMLPackage.VERTEX__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.VERTEX__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VERTEX__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.VERTEX__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.VERTEX__CONTAINER :
				setContainer((Region) null);
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
			case UMLPackage.VERTEX__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VERTEX__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VERTEX__OWNER :
				return isSetOwner();
			case UMLPackage.VERTEX__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.VERTEX__NAME :
				return isSetName();
			case UMLPackage.VERTEX__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VERTEX__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.VERTEX__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VERTEX__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.VERTEX__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.VERTEX__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.VERTEX__CONTAINER :
				return basicGetContainer() != null;
		}
		return eDynamicIsSet(featureID);
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
		return super.isSetNamespace() || eIsSet(UMLPackage.VERTEX__CONTAINER);
	}

} //VertexImpl
