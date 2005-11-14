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
 * $Id: PseudostateImpl.java,v 1.1 2005/11/14 22:26:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PseudostateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PseudostateImpl
		extends VertexImpl
		implements Pseudostate {

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PseudostateKind KIND_EDEFAULT = PseudostateKind.INITIAL_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getPseudostate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind getKind() {
		PseudostateKind kind = (PseudostateKind) eVirtualGet(UMLPackage.PSEUDOSTATE__KIND);
		return kind == null
			? KIND_EDEFAULT
			: kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PseudostateKind newKind) {
		PseudostateKind kind = newKind == null
			? KIND_EDEFAULT
			: newKind;
		Object oldKind = eVirtualSet(UMLPackage.PSEUDOSTATE__KIND, kind);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PSEUDOSTATE__KIND, oldKind == EVIRTUAL_NO_VALUE
					? KIND_EDEFAULT
					: oldKind, kind));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID != UMLPackage.PSEUDOSTATE__STATE_MACHINE)
			return null;
		return (StateMachine) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eContainer
			|| (eContainerFeatureID != UMLPackage.PSEUDOSTATE__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newStateMachine))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject) newStateMachine).eInverseAdd(this,
					UMLPackage.STATE_MACHINE__CONNECTION_POINT,
					StateMachine.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newStateMachine,
				UMLPackage.PSEUDOSTATE__STATE_MACHINE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PSEUDOSTATE__STATE_MACHINE, newStateMachine,
				newStateMachine));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID != UMLPackage.PSEUDOSTATE__STATE)
			return null;
		return (State) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eContainer
			|| (eContainerFeatureID != UMLPackage.PSEUDOSTATE__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newState))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
					UMLPackage.STATE__CONNECTION_POINT, State.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newState,
				UMLPackage.PSEUDOSTATE__STATE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PSEUDOSTATE__STATE, newState, newState));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialVertex(DiagnosticChain diagnostics,
			Map context) {
		return PseudostateOperations.validateInitialVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryVertices(DiagnosticChain diagnostics,
			Map context) {
		return PseudostateOperations.validateHistoryVertices(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinVertex(DiagnosticChain diagnostics, Map context) {
		return PseudostateOperations.validateJoinVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionsIncoming(DiagnosticChain diagnostics,
			Map context) {
		return PseudostateOperations.validateTransitionsIncoming(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkVertex(DiagnosticChain diagnostics, Map context) {
		return PseudostateOperations.validateForkVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionsOutgoing(DiagnosticChain diagnostics,
			Map context) {
		return PseudostateOperations.validateTransitionsOutgoing(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJunctionVertex(DiagnosticChain diagnostics,
			Map context) {
		return PseudostateOperations.validateJunctionVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoiceVertex(DiagnosticChain diagnostics, Map context) {
		return PseudostateOperations.validateChoiceVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutgoingFromInitial(DiagnosticChain diagnostics,
			Map context) {
		return PseudostateOperations.validateOutgoingFromInitial(this,
			diagnostics, context);
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
				case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.PSEUDOSTATE__INCOMING :
					return ((InternalEList) getIncomings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.PSEUDOSTATE__CONTAINER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PSEUDOSTATE__CONTAINER, msgs);
				case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PSEUDOSTATE__STATE_MACHINE, msgs);
				case UMLPackage.PSEUDOSTATE__STATE :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PSEUDOSTATE__STATE, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.PSEUDOSTATE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PSEUDOSTATE__CONTAINER :
					return eBasicSetContainer(null,
						UMLPackage.PSEUDOSTATE__CONTAINER, msgs);
				case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
					return eBasicSetContainer(null,
						UMLPackage.PSEUDOSTATE__STATE_MACHINE, msgs);
				case UMLPackage.PSEUDOSTATE__STATE :
					return eBasicSetContainer(null,
						UMLPackage.PSEUDOSTATE__STATE, msgs);
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
				case UMLPackage.PSEUDOSTATE__CONTAINER :
					return eContainer.eInverseRemove(this,
						UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
				case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
					return eContainer.eInverseRemove(this,
						UMLPackage.STATE_MACHINE__CONNECTION_POINT,
						StateMachine.class, msgs);
				case UMLPackage.PSEUDOSTATE__STATE :
					return eContainer.eInverseRemove(this,
						UMLPackage.STATE__CONNECTION_POINT, State.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PSEUDOSTATE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PSEUDOSTATE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PSEUDOSTATE__NAME :
				return getName();
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PSEUDOSTATE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PSEUDOSTATE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PSEUDOSTATE__OUTGOING :
				return getOutgoings();
			case UMLPackage.PSEUDOSTATE__INCOMING :
				return getIncomings();
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				return getContainer();
			case UMLPackage.PSEUDOSTATE__KIND :
				return getKind();
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				return getStateMachine();
			case UMLPackage.PSEUDOSTATE__STATE :
				return getState();
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
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__KIND :
				setKind((PseudostateKind) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				setStateMachine((StateMachine) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__STATE :
				setState((State) newValue);
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
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PSEUDOSTATE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PSEUDOSTATE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.PSEUDOSTATE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.PSEUDOSTATE__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				setStateMachine((StateMachine) null);
				return;
			case UMLPackage.PSEUDOSTATE__STATE :
				setState((State) null);
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
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PSEUDOSTATE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PSEUDOSTATE__OWNER :
				return isSetOwner();
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PSEUDOSTATE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PSEUDOSTATE__NAME :
				String name = eVirtualIsSet(UMLPackage.PSEUDOSTATE__NAME)
					? (String) eVirtualGet(UMLPackage.PSEUDOSTATE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.PSEUDOSTATE__VISIBILITY)
					&& eVirtualGet(UMLPackage.PSEUDOSTATE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.PSEUDOSTATE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PSEUDOSTATE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PSEUDOSTATE__NAME_EXPRESSION) != null;
			case UMLPackage.PSEUDOSTATE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.PSEUDOSTATE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.PSEUDOSTATE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.PSEUDOSTATE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				return getContainer() != null;
			case UMLPackage.PSEUDOSTATE__KIND :
				return eVirtualIsSet(UMLPackage.PSEUDOSTATE__KIND)
					&& eVirtualGet(UMLPackage.PSEUDOSTATE__KIND) != KIND_EDEFAULT;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				return getStateMachine() != null;
			case UMLPackage.PSEUDOSTATE__STATE :
				return getState() != null;
		}
		return eDynamicIsSet(eFeature);
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
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.PSEUDOSTATE__KIND)
			? eVirtualGet(UMLPackage.PSEUDOSTATE__KIND)
			: KIND_EDEFAULT);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		StateMachine stateMachine = getStateMachine();
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
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.eINSTANCE.getPseudostate_StateMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		State state = getState();
		if (state != null) {
			return state;
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
			|| eIsSet(UMLPackage.eINSTANCE.getPseudostate_State());
	}

} //PseudostateImpl
