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
 * $Id: ActionInputPinImpl.java,v 1.24 2006/05/24 20:54:28 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
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
	 * The cached value of the '{@link #getFromAction() <em>From Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAction()
	 * @generated
	 * @ordered
	 */
	protected Action fromAction = null;

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
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getFromAction() {
		if (fromAction != null && fromAction.eIsProxy()) {
			InternalEObject oldFromAction = (InternalEObject) fromAction;
			fromAction = (Action) eResolveProxy(oldFromAction);
			if (fromAction != oldFromAction) {
				InternalEObject newFromAction = (InternalEObject) fromAction;
				NotificationChain msgs = oldFromAction.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACTION_INPUT_PIN__FROM_ACTION, null, null);
				if (newFromAction.eInternalContainer() == null) {
					msgs = newFromAction.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.ACTION_INPUT_PIN__FROM_ACTION, null,
						msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTION_INPUT_PIN__FROM_ACTION,
						oldFromAction, fromAction));
			}
		}
		return fromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetFromAction() {
		return fromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAction(Action newFromAction,
			NotificationChain msgs) {
		Action oldFromAction = fromAction;
		fromAction = newFromAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ACTION_INPUT_PIN__FROM_ACTION,
				oldFromAction, newFromAction);
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
	public Action createFromAction(String name, EClass eClass) {
		Action newFromAction = (Action) create(eClass);
		setFromAction(newFromAction);
		if (name != null)
			newFromAction.setName(name);
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
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
			case UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTION_INPUT_PIN__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				return getIncomings();
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACTION_INPUT_PIN__IN_GROUP :
				return getInGroups();
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
				if (resolve)
					return getUpperBound();
				return basicGetUpperBound();
			case UMLPackage.ACTION_INPUT_PIN__IN_STATE :
				return getInStates();
			case UMLPackage.ACTION_INPUT_PIN__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.ACTION_INPUT_PIN__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__UPPER :
				return new Integer(getUpper());
			case UMLPackage.ACTION_INPUT_PIN__LOWER :
				return new Integer(getLower());
			case UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL :
				return isControl()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				if (resolve)
					return getFromAction();
				return basicGetFromAction();
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
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
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
			case UMLPackage.ACTION_INPUT_PIN__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
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
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				getInPartitions().clear();
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
			case UMLPackage.ACTION_INPUT_PIN__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTION_INPUT_PIN__OWNER :
				return isSetOwner();
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__NAME :
				return isSetName();
			case UMLPackage.ACTION_INPUT_PIN__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTION_INPUT_PIN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTION_INPUT_PIN__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTION_INPUT_PIN__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACTION_INPUT_PIN__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__TYPE :
				return type != null;
			case UMLPackage.ACTION_INPUT_PIN__ORDERING :
				return ordering != ORDERING_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				return upperBound != null;
			case UMLPackage.ACTION_INPUT_PIN__IN_STATE :
				return inStates != null && !inStates.isEmpty();
			case UMLPackage.ACTION_INPUT_PIN__SELECTION :
				return selection != null;
			case UMLPackage.ACTION_INPUT_PIN__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.ACTION_INPUT_PIN__IS_CONTROL :
				return ((eFlags & IS_CONTROL_EFLAG) != 0) != IS_CONTROL_EDEFAULT;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				return fromAction != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT,
		UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION,
		UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND,
		UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE,
		UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE,
		UMLPackage.ACTION_INPUT_PIN__FROM_ACTION};

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
