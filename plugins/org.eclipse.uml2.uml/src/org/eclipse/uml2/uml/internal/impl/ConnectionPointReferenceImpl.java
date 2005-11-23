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
 * $Id: ConnectionPointReferenceImpl.java,v 1.4 2005/11/23 20:01:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StringExpression;
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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTION_POINT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEntries() {
		List entry = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY);
		if (entry == null) {
			eVirtualSet(UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY,
				entry = new EObjectResolvingEList(Pseudostate.class, this,
					UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY));
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getEntry(String name) {
		for (Iterator i = getEntries().iterator(); i.hasNext();) {
			Pseudostate entry = (Pseudostate) i.next();
			if (name.equals(entry.getName())) {
				return entry;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExits() {
		List exit = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__EXIT);
		if (exit == null) {
			eVirtualSet(UMLPackage.CONNECTION_POINT_REFERENCE__EXIT,
				exit = new EObjectResolvingEList(Pseudostate.class, this,
					UMLPackage.CONNECTION_POINT_REFERENCE__EXIT));
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getExit(String name) {
		for (Iterator i = getExits().iterator(); i.hasNext();) {
			Pseudostate exit = (Pseudostate) i.next();
			if (name.equals(exit.getName())) {
				return exit;
			}
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
	public void setState(State newState) {
		if (newState != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.CONNECTION_POINT_REFERENCE__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newState))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
					UMLPackage.STATE__CONNECTION, State.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newState,
				UMLPackage.CONNECTION_POINT_REFERENCE__STATE, msgs);
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
			Map context) {
		return ConnectionPointReferenceOperations.validateEntryPseudostates(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPseudostates(DiagnosticChain diagnostics,
			Map context) {
		return ConnectionPointReferenceOperations.validateExitPseudostates(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
					return ((InternalEList) getIncomings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.CONNECTION_POINT_REFERENCE__STATE, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
					return eBasicSetContainer(null,
						UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
					return eBasicSetContainer(null,
						UMLPackage.CONNECTION_POINT_REFERENCE__STATE, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
				case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.STATE__CONNECTION, State.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNER :
				return getOwner();
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
				return getNameExpression();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return getOutgoings();
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return getIncomings();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return getContainer();
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				return getEntries();
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				return getExits();
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return getState();
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				getEntries().clear();
				getEntries().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				getExits().clear();
				getExits().addAll((Collection) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.CONNECTION_POINT_REFERENCE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				return eVirtualGet(
					UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION) != null;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return getContainer() != null;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				List entry = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY);
				return entry != null && !entry.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				List exit = (List) eVirtualGet(UMLPackage.CONNECTION_POINT_REFERENCE__EXIT);
				return exit != null && !exit.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return getState() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		State state = getState();
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.CONNECTION_POINT_REFERENCE__STATE);
	}

} //ConnectionPointReferenceImpl
