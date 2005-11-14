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
 * $Id: InvocationActionImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
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
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.uml2.uml.UMLFactory;
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
		return UMLPackage.eINSTANCE.getInvocationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.INVOCATION_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.INVOCATION_ACTION__INPUT,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getInvocationAction_Argument()}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getArguments() {
		List argument = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__ARGUMENT);
		if (argument == null) {
			eVirtualSet(UMLPackage.INVOCATION_ACTION__ARGUMENT,
				argument = new EObjectContainmentEList(InputPin.class, this,
					UMLPackage.INVOCATION_ACTION__ARGUMENT));
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createArgument(EClass eClass) {
		InputPin newArgument = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createArgument() {
		InputPin newArgument = UMLFactory.eINSTANCE.createInputPin();
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getArgument(String name) {
		for (Iterator i = getArguments().iterator(); i.hasNext();) {
			InputPin argument = (InputPin) i.next();
			if (name.equals(argument.getName())) {
				return argument;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnPort() {
		Port onPort = (Port) eVirtualGet(UMLPackage.INVOCATION_ACTION__ON_PORT);
		if (onPort != null && onPort.eIsProxy()) {
			Port oldOnPort = onPort;
			onPort = (Port) eResolveProxy((InternalEObject) onPort);
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
	public boolean validateOnPort(DiagnosticChain diagnostics, Map context) {
		return InvocationActionOperations.validateOnPort(this, diagnostics,
			context);
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
				case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.INVOCATION_ACTION__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
					return eBasicSetContainer(null,
						UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.INVOCATION_ACTION__ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.INVOCATION_ACTION__ACTIVITY, msgs);
				case UMLPackage.INVOCATION_ACTION__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__HANDLER :
					return ((InternalEList) getHandlers()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
					return ((InternalEList) getLocalPreconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
					return ((InternalEList) getLocalPostconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INVOCATION_ACTION__ARGUMENT :
					return ((InternalEList) getArguments()).basicRemove(
						otherEnd, msgs);
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
				return getNameExpression();
			case UMLPackage.INVOCATION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INVOCATION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.INVOCATION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.INVOCATION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.INVOCATION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.INVOCATION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.INVOCATION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.INVOCATION_ACTION__CONTEXT :
				return getContext();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INVOCATION_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				getIncomings().clear();
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.INVOCATION_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INVOCATION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INVOCATION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.INVOCATION_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INVOCATION_ACTION__NAME :
				String name = eVirtualIsSet(UMLPackage.INVOCATION_ACTION__NAME)
					? (String) eVirtualGet(UMLPackage.INVOCATION_ACTION__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INVOCATION_ACTION__VISIBILITY :
				return eVirtualIsSet(UMLPackage.INVOCATION_ACTION__VISIBILITY)
					&& eVirtualGet(UMLPackage.INVOCATION_ACTION__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.INVOCATION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__CLIENT_DEPENDENCY);
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
			case UMLPackage.INVOCATION_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.INVOCATION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.INVOCATION_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.INVOCATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.INVOCATION_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.INVOCATION_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.INVOCATION_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.INVOCATION_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.INVOCATION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.INVOCATION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.INVOCATION_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.INVOCATION_ACTION__ARGUMENT :
				List argument = (List) eVirtualGet(UMLPackage.INVOCATION_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UMLPackage.INVOCATION_ACTION__ON_PORT :
				return eVirtualGet(UMLPackage.INVOCATION_ACTION__ON_PORT) != null;
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
			|| eIsSet(UMLPackage.eINSTANCE.getInvocationAction_Argument());
	}

} //InvocationActionImpl
