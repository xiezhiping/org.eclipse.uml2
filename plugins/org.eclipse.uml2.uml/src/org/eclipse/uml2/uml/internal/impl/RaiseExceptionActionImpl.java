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
 * $Id: RaiseExceptionActionImpl.java,v 1.6 2005/12/01 20:04:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RaiseExceptionAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
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
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__INPUT);
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
	public InputPin createException(EClass eClass) {
		InputPin newException = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setException(newException);
		return newException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createException() {
		InputPin newException = UMLFactory.eINSTANCE.createInputPin();
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
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
				return getNameExpression();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
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
				return getException();
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				getIncomings().clear();
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.RAISE_EXCEPTION_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				return eVirtualGet(
					UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.RAISE_EXCEPTION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION);
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
