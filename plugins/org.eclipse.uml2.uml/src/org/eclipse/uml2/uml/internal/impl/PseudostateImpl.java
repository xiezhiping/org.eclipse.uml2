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
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PseudostateImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
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
	 * The offset of the flags representing the value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_EFLAG_OFFSET = 12;

	/**
	 * The flags representing the default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_EFLAG_DEFAULT = KIND_EDEFAULT
		.ordinal() << KIND_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link PseudostateKind Pseudostate Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final PseudostateKind[] KIND_EFLAG_VALUES = PseudostateKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final int KIND_EFLAG = 0xf << KIND_EFLAG_OFFSET;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PSEUDOSTATE;
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
	public PseudostateKind getKind() {
		return KIND_EFLAG_VALUES[(eFlags & KIND_EFLAG) >>> KIND_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PseudostateKind newKind) {
		PseudostateKind oldKind = KIND_EFLAG_VALUES[(eFlags
			& KIND_EFLAG) >>> KIND_EFLAG_OFFSET];
		if (newKind == null)
			newKind = KIND_EDEFAULT;
		eFlags = eFlags & ~KIND_EFLAG | newKind.ordinal() << KIND_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PSEUDOSTATE__KIND, oldKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != UMLPackage.PSEUDOSTATE__STATE_MACHINE)
			return null;
		return (StateMachine) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetStateMachine() {
		if (eContainerFeatureID() != UMLPackage.PSEUDOSTATE__STATE_MACHINE)
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
			UMLPackage.PSEUDOSTATE__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PSEUDOSTATE__STATE_MACHINE
				&& newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject) newStateMachine).eInverseAdd(this,
					UMLPackage.STATE_MACHINE__CONNECTION_POINT,
					StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
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
		if (eContainerFeatureID() != UMLPackage.PSEUDOSTATE__STATE)
			return null;
		return (State) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		if (eContainerFeatureID() != UMLPackage.PSEUDOSTATE__STATE)
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
			UMLPackage.PSEUDOSTATE__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.PSEUDOSTATE__STATE
				&& newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
					UMLPackage.STATE__CONNECTION_POINT, State.class, msgs);
			msgs = basicSetState(newState, msgs);
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
			Map<Object, Object> context) {
		return PseudostateOperations.validateInitialVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryVertices(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateHistoryVertices(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateJoinVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionsIncoming(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateTransitionsIncoming(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateForkVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionsOutgoing(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateTransitionsOutgoing(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJunctionVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateJunctionVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoiceVertex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateChoiceVertex(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutgoingFromInitial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PseudostateOperations.validateOutgoingFromInitial(this,
			diagnostics, context);
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
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
			case UMLPackage.PSEUDOSTATE__STATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State) otherEnd, msgs);
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				return basicSetContainer(null, msgs);
			case UMLPackage.PSEUDOSTATE__STATE :
				return basicSetState(null, msgs);
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				return basicSetStateMachine(null, msgs);
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
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
			case UMLPackage.PSEUDOSTATE__STATE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STATE__CONNECTION_POINT, State.class, msgs);
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STATE_MACHINE__CONNECTION_POINT,
					StateMachine.class, msgs);
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
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PSEUDOSTATE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PSEUDOSTATE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PSEUDOSTATE__NAME :
				return getName();
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PSEUDOSTATE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PSEUDOSTATE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
			case UMLPackage.PSEUDOSTATE__INCOMING :
				return getIncomings();
			case UMLPackage.PSEUDOSTATE__OUTGOING :
				return getOutgoings();
			case UMLPackage.PSEUDOSTATE__STATE :
				if (resolve)
					return getState();
				return basicGetState();
			case UMLPackage.PSEUDOSTATE__KIND :
				return getKind();
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__STATE :
				setState((State) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__KIND :
				setKind((PseudostateKind) newValue);
				return;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PSEUDOSTATE__NAME :
				unsetName();
				return;
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.PSEUDOSTATE__STATE :
				setState((State) null);
				return;
			case UMLPackage.PSEUDOSTATE__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PSEUDOSTATE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PSEUDOSTATE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PSEUDOSTATE__OWNER :
				return isSetOwner();
			case UMLPackage.PSEUDOSTATE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PSEUDOSTATE__NAME :
				return isSetName();
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PSEUDOSTATE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PSEUDOSTATE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PSEUDOSTATE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.PSEUDOSTATE__INCOMING :
				return !getIncomings().isEmpty();
			case UMLPackage.PSEUDOSTATE__OUTGOING :
				return !getOutgoings().isEmpty();
			case UMLPackage.PSEUDOSTATE__STATE :
				return basicGetState() != null;
			case UMLPackage.PSEUDOSTATE__KIND :
				return (eFlags & KIND_EFLAG) != KIND_EFLAG_DEFAULT;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				return basicGetStateMachine() != null;
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.PSEUDOSTATE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___DESTROY :
				destroy();
				return null;
			case UMLPackage.PSEUDOSTATE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PSEUDOSTATE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PSEUDOSTATE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PSEUDOSTATE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_MODEL :
				return getModel();
			case UMLPackage.PSEUDOSTATE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PSEUDOSTATE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PSEUDOSTATE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PSEUDOSTATE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PSEUDOSTATE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PSEUDOSTATE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PSEUDOSTATE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PSEUDOSTATE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PSEUDOSTATE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PSEUDOSTATE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_LABEL :
				return getLabel();
			case UMLPackage.PSEUDOSTATE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PSEUDOSTATE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PSEUDOSTATE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PSEUDOSTATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PSEUDOSTATE___SEPARATOR :
				return separator();
			case UMLPackage.PSEUDOSTATE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PSEUDOSTATE___CONTAINING_STATE_MACHINE :
				return containingStateMachine();
			case UMLPackage.PSEUDOSTATE___GET_INCOMINGS :
				return getIncomings();
			case UMLPackage.PSEUDOSTATE___GET_OUTGOINGS :
				return getOutgoings();
			case UMLPackage.PSEUDOSTATE___IS_CONTAINED_IN_STATE__STATE :
				return isContainedInState((State) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___IS_CONTAINED_IN_REGION__REGION :
				return isContainedInRegion((Region) arguments.get(0));
			case UMLPackage.PSEUDOSTATE___VALIDATE_TRANSITIONS_OUTGOING__DIAGNOSTICCHAIN_MAP :
				return validateTransitionsOutgoing(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_CHOICE_VERTEX__DIAGNOSTICCHAIN_MAP :
				return validateChoiceVertex((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_OUTGOING_FROM_INITIAL__DIAGNOSTICCHAIN_MAP :
				return validateOutgoingFromInitial(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_JOIN_VERTEX__DIAGNOSTICCHAIN_MAP :
				return validateJoinVertex((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_JUNCTION_VERTEX__DIAGNOSTICCHAIN_MAP :
				return validateJunctionVertex(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_HISTORY_VERTICES__DIAGNOSTICCHAIN_MAP :
				return validateHistoryVertices(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_INITIAL_VERTEX__DIAGNOSTICCHAIN_MAP :
				return validateInitialVertex((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_FORK_VERTEX__DIAGNOSTICCHAIN_MAP :
				return validateForkVertex((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PSEUDOSTATE___VALIDATE_TRANSITIONS_INCOMING__DIAGNOSTICCHAIN_MAP :
				return validateTransitionsIncoming(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(
			KIND_EFLAG_VALUES[(eFlags & KIND_EFLAG) >>> KIND_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
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
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.PSEUDOSTATE__STATE)
			|| eIsSet(UMLPackage.PSEUDOSTATE__STATE_MACHINE);
	}

} //PseudostateImpl
