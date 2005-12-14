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
 * $Id: ActionInputPinImpl.java,v 1.9 2005/12/14 22:34:17 khussey Exp $
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

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActionInputPinOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionInputPinImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionInputPinImpl#getFromAction <em>From Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInputPinImpl
		extends InputPinImpl
		implements ActionInputPin {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionInputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTION_INPUT_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT,
					new int[]{UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT,
						UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION,
						UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND,
						UMLPackage.ACTION_INPUT_PIN__FROM_ACTION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getFromAction() {
		return (Action) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__FROM_ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAction(Action newFromAction,
			NotificationChain msgs) {
		Object oldFromAction = eVirtualSet(
			UMLPackage.ACTION_INPUT_PIN__FROM_ACTION, newFromAction);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTION_INPUT_PIN__FROM_ACTION,
				oldFromAction == EVIRTUAL_NO_VALUE
					? null
					: oldFromAction, newFromAction);
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
	public void setFromAction(Action newFromAction) {
		Action fromAction = (Action) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__FROM_ACTION);
		if (newFromAction != fromAction) {
			NotificationChain msgs = null;
			if (fromAction != null)
				msgs = ((InternalEObject) fromAction).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACTION_INPUT_PIN__FROM_ACTION, null, msgs);
			if (newFromAction != null)
				msgs = ((InternalEObject) newFromAction).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACTION_INPUT_PIN__FROM_ACTION, null, msgs);
			msgs = basicSetFromAction(newFromAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTION_INPUT_PIN__FROM_ACTION, newFromAction,
				newFromAction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createFromAction(EClass eClass) {
		Action newFromAction = (Action) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setFromAction(newFromAction);
		return newFromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createFromAction() {
		Action newFromAction = UMLFactory.eINSTANCE.createAction();
		setFromAction(newFromAction);
		return newFromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOutputPin(DiagnosticChain diagnostics, Map context) {
		return ActionInputPinOperations.validateOneOutputPin(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(DiagnosticChain diagnostics, Map context) {
		return ActionInputPinOperations.validateInputPin(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoControlOrDataFlow(DiagnosticChain diagnostics,
			Map context) {
		return ActionInputPinOperations.validateNoControlOrDataFlow(this,
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
			case UMLPackage.ACTION_INPUT_PIN__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.ACTION_INPUT_PIN__ACTIVITY, msgs);
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				return basicSetFromAction(null, msgs);
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
			case UMLPackage.ACTION_INPUT_PIN__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTION_INPUT_PIN__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTION_INPUT_PIN__NAME :
				return getName();
			case UMLPackage.ACTION_INPUT_PIN__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTION_INPUT_PIN__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTION_INPUT_PIN__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACTION_INPUT_PIN__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACTION_INPUT_PIN__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				return getActivity();
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				return getIncomings();
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACTION_INPUT_PIN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.ACTION_INPUT_PIN__ORDERING :
				return getOrdering();
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				return getUpperBound();
			case UMLPackage.ACTION_INPUT_PIN__IN_STATE :
				return getInStates();
			case UMLPackage.ACTION_INPUT_PIN__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL :
				return isControl()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				return getFromAction();
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
			case UMLPackage.ACTION_INPUT_PIN__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL :
				setIsControl(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				setFromAction((Action) newValue);
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
			case UMLPackage.ACTION_INPUT_PIN__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__NAME :
				unsetName();
				return;
			case UMLPackage.ACTION_INPUT_PIN__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL :
				setIsControl(IS_CONTROL_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				setFromAction((Action) null);
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
			case UMLPackage.ACTION_INPUT_PIN__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTION_INPUT_PIN__OWNER :
				return isSetOwner();
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__NAME :
				return isSetName();
			case UMLPackage.ACTION_INPUT_PIN__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTION_INPUT_PIN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION) != null;
			case UMLPackage.ACTION_INPUT_PIN__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__TYPE :
				return eVirtualGet(UMLPackage.ACTION_INPUT_PIN__TYPE) != null;
			case UMLPackage.ACTION_INPUT_PIN__ORDERING :
				return eVirtualGet(UMLPackage.ACTION_INPUT_PIN__ORDERING,
					ORDERING_EDEFAULT) != ORDERING_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				return eVirtualGet(UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND) != null;
			case UMLPackage.ACTION_INPUT_PIN__IN_STATE :
				EList inState = (EList) eVirtualGet(UMLPackage.ACTION_INPUT_PIN__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__SELECTION :
				return eVirtualGet(UMLPackage.ACTION_INPUT_PIN__SELECTION) != null;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL :
				return ((eFlags & IS_CONTROL_EFLAG) != 0) != IS_CONTROL_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				return eVirtualGet(UMLPackage.ACTION_INPUT_PIN__FROM_ACTION) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ACTION_INPUT_PIN__FROM_ACTION);
	}

} //ActionInputPinImpl
