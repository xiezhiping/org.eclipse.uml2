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
 * $Id: SendObjectActionImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
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
		return UMLPackage.eINSTANCE.getSendObjectAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.SEND_OBJECT_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.SEND_OBJECT_ACTION__INPUT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getInvocationAction_Argument(),
						UMLPackage.eINSTANCE.getSendObjectAction_Target()}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
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
	public InputPin createTarget(EClass eClass) {
		InputPin newTarget = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget() {
		InputPin newTarget = UMLFactory.eINSTANCE.createInputPin();
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRequest() {
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
	public InputPin createRequest(EClass eClass) {
		InputPin newRequest = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setRequest(newRequest);
		return newRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRequest() {
		InputPin newRequest = UMLFactory.eINSTANCE.createInputPin();
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
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
					return eBasicSetContainer(null,
						UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.SEND_OBJECT_ACTION__ACTIVITY, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
					return ((InternalEList) getHandlers()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
					return ((InternalEList) getLocalPreconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
					return ((InternalEList) getLocalPostconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
					return ((InternalEList) getArguments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__TARGET :
					return basicSetTarget(null, msgs);
				case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
					return basicSetRequest(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SEND_OBJECT_ACTION__OWNER :
				return getOwner();
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
				return getNameExpression();
			case UMLPackage.SEND_OBJECT_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.SEND_OBJECT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
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
				return getTarget();
			case UMLPackage.SEND_OBJECT_ACTION__REQUEST :
				return getRequest();
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
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.SEND_OBJECT_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SEND_OBJECT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.SEND_OBJECT_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.SEND_OBJECT_ACTION__VISIBILITY :
				return eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.SEND_OBJECT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY);
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
			case UMLPackage.SEND_OBJECT_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.SEND_OBJECT_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.SEND_OBJECT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.SEND_OBJECT_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION);
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
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.eINSTANCE.getSendObjectAction_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getArguments() {
		return new EcoreEList.UnmodifiableEList(this, UMLPackage.eINSTANCE
			.getInvocationAction_Argument(), 0, Collections.EMPTY_LIST
			.toArray());
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
