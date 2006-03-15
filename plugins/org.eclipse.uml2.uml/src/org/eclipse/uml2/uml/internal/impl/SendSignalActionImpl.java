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
 * $Id: SendSignalActionImpl.java,v 1.18 2006/03/15 19:34:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.SendSignalActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendSignalActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendSignalActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendSignalActionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendSignalActionImpl
		extends InvocationActionImpl
		implements SendSignalAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendSignalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SEND_SIGNAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.SEND_SIGNAL_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.SEND_SIGNAL_ACTION__INPUT, new int[]{
						UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT,
						UMLPackage.SEND_SIGNAL_ACTION__TARGET}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		InputPin target = (InputPin) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (InputPin) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_SIGNAL_ACTION__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_SIGNAL_ACTION__TARGET, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SEND_SIGNAL_ACTION__TARGET, oldTarget,
						target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetTarget() {
		return (InputPin) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget,
			NotificationChain msgs) {
		Object oldTarget = eVirtualSet(UMLPackage.SEND_SIGNAL_ACTION__TARGET,
			newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.SEND_SIGNAL_ACTION__TARGET,
				oldTarget == EVIRTUAL_NO_VALUE
					? null
					: oldTarget, newTarget);
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
	public void setTarget(InputPin newTarget) {
		InputPin target = (InputPin) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__TARGET);
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_SIGNAL_ACTION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_SIGNAL_ACTION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SEND_SIGNAL_ACTION__TARGET, newTarget, newTarget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type, EClass eClass) {
		InputPin newTarget = (InputPin) create(eClass);
		if (name != null)
			newTarget.setName(name);
		if (type != null)
			newTarget.setType(type);
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type) {
		return createTarget(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		Signal signal = (Signal) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__SIGNAL);
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject) signal;
			signal = (Signal) eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				eVirtualSet(UMLPackage.SEND_SIGNAL_ACTION__SIGNAL, signal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SEND_SIGNAL_ACTION__SIGNAL, oldSignal,
						signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return (Signal) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__SIGNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal signal = newSignal;
		Object oldSignal = eVirtualSet(UMLPackage.SEND_SIGNAL_ACTION__SIGNAL,
			signal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SEND_SIGNAL_ACTION__SIGNAL,
				oldSignal == EVIRTUAL_NO_VALUE
					? null
					: oldSignal, signal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOrder(DiagnosticChain diagnostics, Map context) {
		return SendSignalActionOperations.validateNumberOrder(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOrderingMultiplicity(
			DiagnosticChain diagnostics, Map context) {
		return SendSignalActionOperations.validateTypeOrderingMultiplicity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.SEND_SIGNAL_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT :
				return ((InternalEList) getArguments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_SIGNAL_ACTION__TARGET :
				return basicSetTarget(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.SEND_SIGNAL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SEND_SIGNAL_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SEND_SIGNAL_ACTION__NAME :
				return getName();
			case UMLPackage.SEND_SIGNAL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.SEND_SIGNAL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SEND_SIGNAL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.SEND_SIGNAL_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.SEND_SIGNAL_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.SEND_SIGNAL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.SEND_SIGNAL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.SEND_SIGNAL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.SEND_SIGNAL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.SEND_SIGNAL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.SEND_SIGNAL_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.SEND_SIGNAL_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
			case UMLPackage.SEND_SIGNAL_ACTION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.SEND_SIGNAL_ACTION__SIGNAL :
				if (resolve)
					return getSignal();
				return basicGetSignal();
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
			case UMLPackage.SEND_SIGNAL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__ON_PORT :
				setOnPort((Port) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__TARGET :
				setTarget((InputPin) newValue);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__SIGNAL :
				setSignal((Signal) newValue);
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
			case UMLPackage.SEND_SIGNAL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__ON_PORT :
				setOnPort((Port) null);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__TARGET :
				setTarget((InputPin) null);
				return;
			case UMLPackage.SEND_SIGNAL_ACTION__SIGNAL :
				setSignal((Signal) null);
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
			case UMLPackage.SEND_SIGNAL_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SEND_SIGNAL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__NAME :
				return isSetName();
			case UMLPackage.SEND_SIGNAL_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SEND_SIGNAL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.SEND_SIGNAL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.SEND_SIGNAL_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.SEND_SIGNAL_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.SEND_SIGNAL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.SEND_SIGNAL_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT :
				EList argument = (EList) eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UMLPackage.SEND_SIGNAL_ACTION__ON_PORT :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__ON_PORT) != null;
			case UMLPackage.SEND_SIGNAL_ACTION__TARGET :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__TARGET) != null;
			case UMLPackage.SEND_SIGNAL_ACTION__SIGNAL :
				return eVirtualGet(UMLPackage.SEND_SIGNAL_ACTION__SIGNAL) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.SEND_SIGNAL_ACTION__TARGET);
	}

} //SendSignalActionImpl
