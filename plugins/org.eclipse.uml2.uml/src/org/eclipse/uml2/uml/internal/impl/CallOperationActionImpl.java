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
 * $Id: CallOperationActionImpl.java,v 1.14 2006/02/22 23:07:15 khussey Exp $
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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.CallOperationActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CallOperationActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CallOperationActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CallOperationActionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallOperationActionImpl
		extends CallActionImpl
		implements CallOperationAction {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallOperationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CALL_OPERATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.CALL_OPERATION_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.CALL_OPERATION_ACTION__INPUT, new int[]{
						UMLPackage.CALL_OPERATION_ACTION__ARGUMENT,
						UMLPackage.CALL_OPERATION_ACTION__TARGET}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		Operation operation = (Operation) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__OPERATION);
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (Operation) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				eVirtualSet(UMLPackage.CALL_OPERATION_ACTION__OPERATION,
					operation);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CALL_OPERATION_ACTION__OPERATION,
						oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return (Operation) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation operation = newOperation;
		Object oldOperation = eVirtualSet(
			UMLPackage.CALL_OPERATION_ACTION__OPERATION, operation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CALL_OPERATION_ACTION__OPERATION,
				oldOperation == EVIRTUAL_NO_VALUE
					? null
					: oldOperation, operation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		InputPin target = (InputPin) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (InputPin) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CALL_OPERATION_ACTION__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.CALL_OPERATION_ACTION__TARGET, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CALL_OPERATION_ACTION__TARGET, oldTarget,
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
		return (InputPin) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget,
			NotificationChain msgs) {
		Object oldTarget = eVirtualSet(
			UMLPackage.CALL_OPERATION_ACTION__TARGET, newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CALL_OPERATION_ACTION__TARGET,
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
		InputPin target = (InputPin) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__TARGET);
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CALL_OPERATION_ACTION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CALL_OPERATION_ACTION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CALL_OPERATION_ACTION__TARGET, newTarget, newTarget));

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
	public boolean validateArgumentPinEqualParameter(
			DiagnosticChain diagnostics, Map context) {
		return CallOperationActionOperations.validateArgumentPinEqualParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultPinEqualParameter(DiagnosticChain diagnostics,
			Map context) {
		return CallOperationActionOperations.validateResultPinEqualParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTargetPin(DiagnosticChain diagnostics,
			Map context) {
		return CallOperationActionOperations.validateTypeTargetPin(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOrderingMultiplicity(
			DiagnosticChain diagnostics, Map context) {
		return CallOperationActionOperations.validateTypeOrderingMultiplicity(
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
			case UMLPackage.CALL_OPERATION_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.CALL_OPERATION_ACTION__ACTIVITY, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CALL_OPERATION_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CALL_OPERATION_ACTION__ARGUMENT :
				return ((InternalEList) getArguments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CALL_OPERATION_ACTION__RESULT :
				return ((InternalEList) getResults()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CALL_OPERATION_ACTION__TARGET :
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
			case UMLPackage.CALL_OPERATION_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CALL_OPERATION_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CALL_OPERATION_ACTION__NAME :
				return getName();
			case UMLPackage.CALL_OPERATION_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.CALL_OPERATION_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CALL_OPERATION_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CALL_OPERATION_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CALL_OPERATION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.CALL_OPERATION_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.CALL_OPERATION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.CALL_OPERATION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.CALL_OPERATION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.CALL_OPERATION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.CALL_OPERATION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.CALL_OPERATION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.CALL_OPERATION_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.CALL_OPERATION_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.CALL_OPERATION_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
			case UMLPackage.CALL_OPERATION_ACTION__IS_SYNCHRONOUS :
				return isSynchronous()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CALL_OPERATION_ACTION__RESULT :
				return getResults();
			case UMLPackage.CALL_OPERATION_ACTION__OPERATION :
				if (resolve)
					return getOperation();
				return basicGetOperation();
			case UMLPackage.CALL_OPERATION_ACTION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
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
			case UMLPackage.CALL_OPERATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__ON_PORT :
				setOnPort((Port) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IS_SYNCHRONOUS :
				setIsSynchronous(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CALL_OPERATION_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__OPERATION :
				setOperation((Operation) newValue);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__TARGET :
				setTarget((InputPin) newValue);
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
			case UMLPackage.CALL_OPERATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__ON_PORT :
				setOnPort((Port) null);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__IS_SYNCHRONOUS :
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.CALL_OPERATION_ACTION__OPERATION :
				setOperation((Operation) null);
				return;
			case UMLPackage.CALL_OPERATION_ACTION__TARGET :
				setTarget((InputPin) null);
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
			case UMLPackage.CALL_OPERATION_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CALL_OPERATION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__NAME :
				return isSetName();
			case UMLPackage.CALL_OPERATION_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CALL_OPERATION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CALL_OPERATION_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.CALL_OPERATION_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.CALL_OPERATION_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.CALL_OPERATION_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.CALL_OPERATION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.CALL_OPERATION_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__ARGUMENT :
				EList argument = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__ON_PORT :
				return eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__ON_PORT) != null;
			case UMLPackage.CALL_OPERATION_ACTION__IS_SYNCHRONOUS :
				return ((eFlags & IS_SYNCHRONOUS_EFLAG) != 0) != IS_SYNCHRONOUS_EDEFAULT;
			case UMLPackage.CALL_OPERATION_ACTION__RESULT :
				EList result = (EList) eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__RESULT);
				return result != null && !result.isEmpty();
			case UMLPackage.CALL_OPERATION_ACTION__OPERATION :
				return eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__OPERATION) != null;
			case UMLPackage.CALL_OPERATION_ACTION__TARGET :
				return eVirtualGet(UMLPackage.CALL_OPERATION_ACTION__TARGET) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.CALL_OPERATION_ACTION__TARGET);
	}

} //CallOperationActionImpl
