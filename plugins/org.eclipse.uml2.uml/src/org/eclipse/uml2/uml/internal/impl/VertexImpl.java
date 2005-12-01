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
 * $Id: VertexImpl.java,v 1.6 2005/12/01 20:04:38 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
	public List getOutgoings() {
		List outgoing = (List) eVirtualGet(UMLPackage.VERTEX__OUTGOING);
		if (outgoing == null) {
			eVirtualSet(UMLPackage.VERTEX__OUTGOING,
				outgoing = new EObjectWithInverseResolvingEList(
					Transition.class, this, UMLPackage.VERTEX__OUTGOING,
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
	public List getIncomings() {
		List incoming = (List) eVirtualGet(UMLPackage.VERTEX__INCOMING);
		if (incoming == null) {
			eVirtualSet(UMLPackage.VERTEX__INCOMING,
				incoming = new EObjectWithInverseResolvingEList(
					Transition.class, this, UMLPackage.VERTEX__INCOMING,
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
		if (eContainerFeatureID != UMLPackage.VERTEX__CONTAINER)
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
			|| (eContainerFeatureID != UMLPackage.VERTEX__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newContainer))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
					UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newContainer,
				UMLPackage.VERTEX__CONTAINER, msgs);
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
	public StateMachine containingStatemachine() {
		return VertexOperations.containingStatemachine(this);
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
				return eBasicSetContainer(otherEnd,
					UMLPackage.VERTEX__CONTAINER, msgs);
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
				return eBasicSetContainer(null, UMLPackage.VERTEX__CONTAINER,
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
				return getNameExpression();
			case UMLPackage.VERTEX__OUTGOING :
				return getOutgoings();
			case UMLPackage.VERTEX__INCOMING :
				return getIncomings();
			case UMLPackage.VERTEX__CONTAINER :
				return getContainer();
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.VERTEX__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
				List ownedComment = (List) eVirtualGet(UMLPackage.VERTEX__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.VERTEX__NAME :
				String name = (String) eVirtualGet(UMLPackage.VERTEX__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.VERTEX__VISIBILITY :
				return eVirtualGet(UMLPackage.VERTEX__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.VERTEX__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VERTEX__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.VERTEX__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.VERTEX__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VERTEX__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.VERTEX__NAME_EXPRESSION) != null;
			case UMLPackage.VERTEX__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.VERTEX__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.VERTEX__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.VERTEX__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.VERTEX__CONTAINER :
				return getContainer() != null;
		}
		return eDynamicIsSet(featureID);
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
		return super.isSetNamespace() || eIsSet(UMLPackage.VERTEX__CONTAINER);
	}

} //VertexImpl
