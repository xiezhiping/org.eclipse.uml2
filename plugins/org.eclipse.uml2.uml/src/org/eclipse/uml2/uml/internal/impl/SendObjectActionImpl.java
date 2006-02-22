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
 * $Id: SendObjectActionImpl.java,v 1.14 2006/02/22 23:07:15 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendObjectActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendObjectActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SendObjectActionImpl#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendObjectActionImpl
		extends InvocationActionImpl
		implements SendObjectAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SEND_OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.SEND_OBJECT_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.SEND_OBJECT_ACTION__INPUT, new int[]{
						UMLPackage.SEND_OBJECT_ACTION__ARGUMENT,
						UMLPackage.SEND_OBJECT_ACTION__TARGET}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		InputPin target = (InputPin) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (InputPin) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__TARGET, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SEND_OBJECT_ACTION__TARGET, oldTarget,
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
		return (InputPin) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget,
			NotificationChain msgs) {
		Object oldTarget = eVirtualSet(UMLPackage.SEND_OBJECT_ACTION__TARGET,
			newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.SEND_OBJECT_ACTION__TARGET,
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
		InputPin target = (InputPin) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__TARGET);
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SEND_OBJECT_ACTION__TARGET, newTarget, newTarget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type, EClass eClass) {
		InputPin newTarget = (InputPin) EcoreUtil.create(eClass);
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
		InputPin newTarget = UMLFactory.eINSTANCE.createInputPin();
		newTarget.setName(name);
		newTarget.setType(type);
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRequest() {
		InputPin request = (InputPin) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__REQUEST);
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject) request;
			request = (InputPin) eResolveProxy(oldRequest);
			if (request != oldRequest) {
				InternalEObject newRequest = (InternalEObject) request;
				NotificationChain msgs = oldRequest.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__REQUEST, null, null);
				if (newRequest.eInternalContainer() == null) {
					msgs = newRequest.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__REQUEST, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SEND_OBJECT_ACTION__REQUEST, oldRequest,
						request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetRequest() {
		return (InputPin) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__REQUEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(InputPin newRequest,
			NotificationChain msgs) {
		Object oldRequest = eVirtualSet(UMLPackage.SEND_OBJECT_ACTION__REQUEST,
			newRequest);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.SEND_OBJECT_ACTION__REQUEST,
				oldRequest == EVIRTUAL_NO_VALUE
					? null
					: oldRequest, newRequest);
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
	public void setRequest(InputPin newRequest) {
		InputPin request = (InputPin) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__REQUEST);
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject) request).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject) newRequest).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.SEND_OBJECT_ACTION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SEND_OBJECT_ACTION__REQUEST, newRequest, newRequest));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRequest(String name, Type type, EClass eClass) {
		InputPin newRequest = (InputPin) EcoreUtil.create(eClass);
		if (name != null)
			newRequest.setName(name);
		if (type != null)
			newRequest.setType(type);
		setRequest(newRequest);
		return newRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRequest(String name, Type type) {
		InputPin newRequest = UMLFactory.eINSTANCE.createInputPin();
		newRequest.setName(name);
		newRequest.setType(type);
		setRequest(newRequest);
		return newRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequest() {
		return eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__REQUEST) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.SEND_OBJECT_ACTION__ACTIVITY, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
				return ((InternalEList) getArguments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEND_OBJECT_ACTION__TARGET :
				return basicSetTarget(null, msgs);
			case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
				return basicSetRequest(null, msgs);
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
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SEND_OBJECT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SEND_OBJECT_ACTION__NAME :
				return getName();
			case UMLPackage.SEND_OBJECT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.SEND_OBJECT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SEND_OBJECT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.SEND_OBJECT_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.SEND_OBJECT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.SEND_OBJECT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.SEND_OBJECT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.SEND_OBJECT_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.SEND_OBJECT_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
			case UMLPackage.SEND_OBJECT_ACTION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
				if (resolve)
					return getRequest();
				return basicGetRequest();
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
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ON_PORT :
				setOnPort((Port) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__TARGET :
				setTarget((InputPin) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
				setRequest((InputPin) newValue);
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
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ON_PORT :
				setOnPort((Port) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__TARGET :
				setTarget((InputPin) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
				setRequest((InputPin) null);
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
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SEND_OBJECT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__NAME :
				return isSetName();
			case UMLPackage.SEND_OBJECT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SEND_OBJECT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.SEND_OBJECT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.SEND_OBJECT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.SEND_OBJECT_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
				return isSetArguments();
			case UMLPackage.SEND_OBJECT_ACTION__ON_PORT :
				return eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__ON_PORT) != null;
			case UMLPackage.SEND_OBJECT_ACTION__TARGET :
				return eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__TARGET) != null;
			case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
				return isSetRequest();
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
			|| eIsSet(UMLPackage.SEND_OBJECT_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {
		return new EcoreEList.UnmodifiableEList(this,
			UMLPackage.Literals.INVOCATION_ACTION__ARGUMENT, 0,
			Collections.EMPTY_LIST.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArguments() {
		return false;
	}

} //SendObjectActionImpl
