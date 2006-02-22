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
 * $Id: RaiseExceptionActionImpl.java,v 1.13 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RaiseExceptionAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RaiseExceptionActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RaiseExceptionActionImpl#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RaiseExceptionActionImpl
		extends ActionImpl
		implements RaiseExceptionAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaiseExceptionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RAISE_EXCEPTION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.RAISE_EXCEPTION_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.RAISE_EXCEPTION_ACTION__INPUT,
					new int[]{UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getException() {
		InputPin exception = (InputPin) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION);
		if (exception != null && exception.eIsProxy()) {
			InternalEObject oldException = (InternalEObject) exception;
			exception = (InputPin) eResolveProxy(oldException);
			if (exception != oldException) {
				InternalEObject newException = (InternalEObject) exception;
				NotificationChain msgs = oldException.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION, null,
					null);
				if (newException.eInternalContainer() == null) {
					msgs = newException.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
						oldException, exception));
			}
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetException() {
		return (InputPin) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(InputPin newException,
			NotificationChain msgs) {
		Object oldException = eVirtualSet(
			UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION, newException);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
				oldException == EVIRTUAL_NO_VALUE
					? null
					: oldException, newException);
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
	public void setException(InputPin newException) {
		InputPin exception = (InputPin) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION);
		if (newException != exception) {
			NotificationChain msgs = null;
			if (exception != null)
				msgs = ((InternalEObject) exception).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION, null,
					msgs);
			if (newException != null)
				msgs = ((InternalEObject) newException).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION, null,
					msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION, newException,
				newException));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createException(String name, Type type, EClass eClass) {
		InputPin newException = (InputPin) EcoreUtil.create(eClass);
		newException.setName(name);
		newException.setType(type);
		setException(newException);
		return newException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createException(String name, Type type) {
		InputPin newException = UMLFactory.eINSTANCE.createInputPin();
		newException.setName(name);
		newException.setType(type);
		setException(newException);
		return newException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				return basicSetException(null, msgs);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				return getName();
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.RAISE_EXCEPTION_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				if (resolve)
					return getException();
				return basicGetException();
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				setException((InputPin) newValue);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				setException((InputPin) null);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				return isSetName();
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.RAISE_EXCEPTION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				return eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION) != null;
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
			|| eIsSet(UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION);
	}

} //RaiseExceptionActionImpl
