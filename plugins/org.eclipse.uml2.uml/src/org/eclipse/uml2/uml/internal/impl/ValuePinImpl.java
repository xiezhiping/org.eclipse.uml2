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
 * $Id: ValuePinImpl.java,v 1.22 2006/05/16 15:07:26 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ValuePinOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValuePinImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuePinImpl
		extends InputPinImpl
		implements ValuePin {

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification value = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VALUE_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (ValueSpecification) eResolveProxy(oldValue);
			if (value != oldValue) {
				InternalEObject newValue = (InternalEObject) value;
				NotificationChain msgs = oldValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE, null,
					null);
				if (newValue.eInternalContainer() == null) {
					msgs = newValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_PIN__VALUE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VALUE_PIN__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueSpecification newValue,
			NotificationChain msgs) {
		ValueSpecification oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.VALUE_PIN__VALUE, oldValue,
				newValue);
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
	public void setValue(ValueSpecification newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE, null,
					msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE, null,
					msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VALUE_PIN__VALUE, newValue, newValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(String name, Type type, EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) create(eClass);
		setValue(newValue);
		if (name != null)
			newValue.setName(name);
		if (type != null)
			newValue.setType(type);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatibleType(DiagnosticChain diagnostics,
			Map context) {
		return ValuePinOperations.validateCompatibleType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoIncomingEdges(DiagnosticChain diagnostics,
			Map context) {
		return ValuePinOperations.validateNoIncomingEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.VALUE_PIN__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.VALUE_PIN__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_PIN__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.VALUE_PIN__VALUE :
				return basicSetValue(null, msgs);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VALUE_PIN__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VALUE_PIN__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VALUE_PIN__NAME :
				return getName();
			case UMLPackage.VALUE_PIN__VISIBILITY :
				return getVisibility();
			case UMLPackage.VALUE_PIN__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VALUE_PIN__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VALUE_PIN__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VALUE_PIN__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.VALUE_PIN__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.VALUE_PIN__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.VALUE_PIN__OUTGOING :
				return getOutgoings();
			case UMLPackage.VALUE_PIN__INCOMING :
				return getIncomings();
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.VALUE_PIN__IN_GROUP :
				return getInGroups();
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.VALUE_PIN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.VALUE_PIN__ORDERING :
				return getOrdering();
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				if (resolve)
					return getUpperBound();
				return basicGetUpperBound();
			case UMLPackage.VALUE_PIN__IN_STATE :
				return getInStates();
			case UMLPackage.VALUE_PIN__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VALUE_PIN__UPPER :
				return new Integer(getUpper());
			case UMLPackage.VALUE_PIN__LOWER :
				return new Integer(getLower());
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				return isControl()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VALUE_PIN__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VALUE_PIN__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.VALUE_PIN__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.VALUE_PIN__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.VALUE_PIN__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_PIN__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VALUE_PIN__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.VALUE_PIN__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				setIsControl(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VALUE_PIN__VALUE :
				setValue((ValueSpecification) newValue);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VALUE_PIN__NAME :
				unsetName();
				return;
			case UMLPackage.VALUE_PIN__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VALUE_PIN__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.VALUE_PIN__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.VALUE_PIN__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.VALUE_PIN__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.VALUE_PIN__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.VALUE_PIN__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_PIN__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.VALUE_PIN__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				setIsControl(IS_CONTROL_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__VALUE :
				setValue((ValueSpecification) null);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VALUE_PIN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VALUE_PIN__OWNER :
				return isSetOwner();
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.VALUE_PIN__NAME :
				return isSetName();
			case UMLPackage.VALUE_PIN__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VALUE_PIN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.VALUE_PIN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.VALUE_PIN__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.VALUE_PIN__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.VALUE_PIN__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.VALUE_PIN__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.VALUE_PIN__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.VALUE_PIN__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.VALUE_PIN__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.VALUE_PIN__TYPE :
				return type != null;
			case UMLPackage.VALUE_PIN__ORDERING :
				return ordering != ORDERING_EDEFAULT;
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				return upperBound != null;
			case UMLPackage.VALUE_PIN__IN_STATE :
				return inStates != null && !inStates.isEmpty();
			case UMLPackage.VALUE_PIN__SELECTION :
				return selection != null;
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.VALUE_PIN__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.VALUE_PIN__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				return ((eFlags & IS_CONTROL_EFLAG) != 0) != IS_CONTROL_EDEFAULT;
			case UMLPackage.VALUE_PIN__VALUE :
				return value != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ValuePinImpl
