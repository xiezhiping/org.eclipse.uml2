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
 * $Id: InvocationActionImpl.java,v 1.19 2006/03/15 19:34:01 khussey Exp $
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
import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InvocationActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InvocationActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InvocationActionImpl#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InvocationActionImpl#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InvocationActionImpl
		extends ActionImpl
		implements InvocationAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INVOCATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.INVOCATION_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.INVOCATION_ACTION__INPUT,
					new int[]{UMLPackage.INVOCATION_ACTION__ARGUMENT}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {
		EList argument = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__ARGUMENT);
		if (argument == null) {
			eVirtualSet(UMLPackage.INVOCATION_ACTION__ARGUMENT,
				argument = new EObjectContainmentEList.Resolving(
					InputPin.class, this,
					UMLPackage.INVOCATION_ACTION__ARGUMENT));
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createArgument(String name, Type type, EClass eClass) {
		InputPin newArgument = (InputPin) create(eClass);
		if (name != null)
			newArgument.setName(name);
		if (type != null)
			newArgument.setType(type);
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createArgument(String name, Type type) {
		return createArgument(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getArgument(String name, Type type) {
		return getArgument(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getArgument(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		argumentLoop : for (Iterator i = getArguments().iterator(); i.hasNext();) {
			InputPin argument = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(argument))
				continue argumentLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(argument.getName())
				: name.equals(argument.getName())))
				continue argumentLoop;
			if (type != null && !type.equals(argument.getType()))
				continue argumentLoop;
			return argument;
		}
		return createOnDemand && eClass != null
			? createArgument(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnPort() {
		Port onPort = (Port) eVirtualGet(UMLPackage.INVOCATION_ACTION__ON_PORT);
		if (onPort != null && onPort.eIsProxy()) {
			InternalEObject oldOnPort = (InternalEObject) onPort;
			onPort = (Port) eResolveProxy(oldOnPort);
			if (onPort != oldOnPort) {
				eVirtualSet(UMLPackage.INVOCATION_ACTION__ON_PORT, onPort);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INVOCATION_ACTION__ON_PORT, oldOnPort,
						onPort));
			}
		}
		return onPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetOnPort() {
		return (Port) eVirtualGet(UMLPackage.INVOCATION_ACTION__ON_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPort(Port newOnPort) {
		Port onPort = newOnPort;
		Object oldOnPort = eVirtualSet(UMLPackage.INVOCATION_ACTION__ON_PORT,
			onPort);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INVOCATION_ACTION__ON_PORT,
				oldOnPort == EVIRTUAL_NO_VALUE
					? null
					: oldOnPort, onPort));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnPortReceiver(DiagnosticChain diagnostics,
			Map context) {
		return InvocationActionOperations.validateOnPortReceiver(this,
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
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INVOCATION_ACTION__ARGUMENT :
				return ((InternalEList) getArguments()).basicRemove(otherEnd,
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
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INVOCATION_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INVOCATION_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INVOCATION_ACTION__NAME :
				return getName();
			case UMLPackage.INVOCATION_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.INVOCATION_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INVOCATION_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INVOCATION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INVOCATION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.INVOCATION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.INVOCATION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.INVOCATION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.INVOCATION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.INVOCATION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.INVOCATION_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.INVOCATION_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.INVOCATION_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
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
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__ON_PORT :
				setOnPort((Port) newValue);
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
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.INVOCATION_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INVOCATION_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__ON_PORT :
				setOnPort((Port) null);
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
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INVOCATION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INVOCATION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INVOCATION_ACTION__NAME :
				return isSetName();
			case UMLPackage.INVOCATION_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INVOCATION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INVOCATION_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.INVOCATION_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.INVOCATION_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.INVOCATION_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.INVOCATION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.INVOCATION_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.INVOCATION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.INVOCATION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.INVOCATION_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.INVOCATION_ACTION__ARGUMENT :
				EList argument = (EList) eVirtualGet(UMLPackage.INVOCATION_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UMLPackage.INVOCATION_ACTION__ON_PORT :
				return eVirtualGet(UMLPackage.INVOCATION_ACTION__ON_PORT) != null;
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
			|| eIsSet(UMLPackage.INVOCATION_ACTION__ARGUMENT);
	}

} //InvocationActionImpl
