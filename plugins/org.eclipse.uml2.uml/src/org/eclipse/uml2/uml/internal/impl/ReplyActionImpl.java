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
 * $Id: ReplyActionImpl.java,v 1.18 2006/03/15 19:34:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReplyActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getReplyValues <em>Reply Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionImpl
		extends ActionImpl
		implements ReplyAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REPLY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.REPLY_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.REPLY_ACTION__INPUT, new int[]{
						UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
						UMLPackage.REPLY_ACTION__REPLY_VALUE}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getReplyToCall() {
		Trigger replyToCall = (Trigger) eVirtualGet(UMLPackage.REPLY_ACTION__REPLY_TO_CALL);
		if (replyToCall != null && replyToCall.eIsProxy()) {
			InternalEObject oldReplyToCall = (InternalEObject) replyToCall;
			replyToCall = (Trigger) eResolveProxy(oldReplyToCall);
			if (replyToCall != oldReplyToCall) {
				eVirtualSet(UMLPackage.REPLY_ACTION__REPLY_TO_CALL, replyToCall);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall,
						replyToCall));
			}
		}
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetReplyToCall() {
		return (Trigger) eVirtualGet(UMLPackage.REPLY_ACTION__REPLY_TO_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall(Trigger newReplyToCall) {
		Trigger replyToCall = newReplyToCall;
		Object oldReplyToCall = eVirtualSet(
			UMLPackage.REPLY_ACTION__REPLY_TO_CALL, replyToCall);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REPLY_ACTION__REPLY_TO_CALL,
				oldReplyToCall == EVIRTUAL_NO_VALUE
					? null
					: oldReplyToCall, replyToCall));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReturnInformation() {
		InputPin returnInformation = (InputPin) eVirtualGet(UMLPackage.REPLY_ACTION__RETURN_INFORMATION);
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject) returnInformation;
			returnInformation = (InputPin) eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				InternalEObject newReturnInformation = (InternalEObject) returnInformation;
				NotificationChain msgs = oldReturnInformation.eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.REPLY_ACTION__RETURN_INFORMATION, null,
					null);
				if (newReturnInformation.eInternalContainer() == null) {
					msgs = newReturnInformation.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
						oldReturnInformation, returnInformation));
			}
		}
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetReturnInformation() {
		return (InputPin) eVirtualGet(UMLPackage.REPLY_ACTION__RETURN_INFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnInformation(
			InputPin newReturnInformation, NotificationChain msgs) {
		Object oldReturnInformation = eVirtualSet(
			UMLPackage.REPLY_ACTION__RETURN_INFORMATION, newReturnInformation);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
				oldReturnInformation == EVIRTUAL_NO_VALUE
					? null
					: oldReturnInformation, newReturnInformation);
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
	public void setReturnInformation(InputPin newReturnInformation) {
		InputPin returnInformation = (InputPin) eVirtualGet(UMLPackage.REPLY_ACTION__RETURN_INFORMATION);
		if (newReturnInformation != returnInformation) {
			NotificationChain msgs = null;
			if (returnInformation != null)
				msgs = ((InternalEObject) returnInformation).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.REPLY_ACTION__RETURN_INFORMATION, null,
					msgs);
			if (newReturnInformation != null)
				msgs = ((InternalEObject) newReturnInformation).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.REPLY_ACTION__RETURN_INFORMATION, null,
					msgs);
			msgs = basicSetReturnInformation(newReturnInformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
				newReturnInformation, newReturnInformation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReturnInformation(String name, Type type,
			EClass eClass) {
		InputPin newReturnInformation = (InputPin) create(eClass);
		if (name != null)
			newReturnInformation.setName(name);
		if (type != null)
			newReturnInformation.setType(type);
		setReturnInformation(newReturnInformation);
		return newReturnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReturnInformation(String name, Type type) {
		return createReturnInformation(name, type,
			UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReplyValues() {
		EList replyValue = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__REPLY_VALUE);
		if (replyValue == null) {
			eVirtualSet(UMLPackage.REPLY_ACTION__REPLY_VALUE,
				replyValue = new EObjectContainmentEList.Resolving(
					InputPin.class, this, UMLPackage.REPLY_ACTION__REPLY_VALUE));
		}
		return replyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReplyValue(String name, Type type, EClass eClass) {
		InputPin newReplyValue = (InputPin) create(eClass);
		if (name != null)
			newReplyValue.setName(name);
		if (type != null)
			newReplyValue.setType(type);
		getReplyValues().add(newReplyValue);
		return newReplyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReplyValue(String name, Type type) {
		return createReplyValue(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReplyValue(String name, Type type) {
		return getReplyValue(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReplyValue(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		replyValueLoop : for (Iterator i = getReplyValues().iterator(); i
			.hasNext();) {
			InputPin replyValue = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(replyValue))
				continue replyValueLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(replyValue.getName())
				: name.equals(replyValue.getName())))
				continue replyValueLoop;
			if (type != null && !type.equals(replyValue.getType()))
				continue replyValueLoop;
			return replyValue;
		}
		return createOnDemand && eClass != null
			? createReplyValue(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinsMatchParameter(DiagnosticChain diagnostics,
			Map context) {
		return ReplyActionOperations.validatePinsMatchParameter(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventOnReplyToCallTrigger(
			DiagnosticChain diagnostics, Map context) {
		return ReplyActionOperations.validateEventOnReplyToCallTrigger(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.REPLY_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REPLY_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				return basicSetReturnInformation(null, msgs);
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				return ((InternalEList) getReplyValues()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REPLY_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REPLY_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REPLY_ACTION__NAME :
				return getName();
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.REPLY_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REPLY_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REPLY_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REPLY_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.REPLY_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.REPLY_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.REPLY_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.REPLY_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.REPLY_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.REPLY_ACTION__INPUT :
				return getInputs();
			case UMLPackage.REPLY_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				if (resolve)
					return getReplyToCall();
				return basicGetReplyToCall();
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				if (resolve)
					return getReturnInformation();
				return basicGetReturnInformation();
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				return getReplyValues();
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
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.REPLY_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				setReplyToCall((Trigger) newValue);
				return;
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				setReturnInformation((InputPin) newValue);
				return;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				getReplyValues().clear();
				getReplyValues().addAll((Collection) newValue);
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
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REPLY_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.REPLY_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.REPLY_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.REPLY_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				setReplyToCall((Trigger) null);
				return;
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				setReturnInformation((InputPin) null);
				return;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				getReplyValues().clear();
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
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REPLY_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REPLY_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.REPLY_ACTION__NAME :
				return isSetName();
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REPLY_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.REPLY_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.REPLY_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REPLY_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REPLY_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.REPLY_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.REPLY_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.REPLY_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.REPLY_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.REPLY_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.REPLY_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.REPLY_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				return eVirtualGet(UMLPackage.REPLY_ACTION__REPLY_TO_CALL) != null;
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				return eVirtualGet(UMLPackage.REPLY_ACTION__RETURN_INFORMATION) != null;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				EList replyValue = (EList) eVirtualGet(UMLPackage.REPLY_ACTION__REPLY_VALUE);
				return replyValue != null && !replyValue.isEmpty();
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
			|| eIsSet(UMLPackage.REPLY_ACTION__RETURN_INFORMATION)
			|| eIsSet(UMLPackage.REPLY_ACTION__REPLY_VALUE);
	}

} //ReplyActionImpl
