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
 * $Id: ValueSpecificationActionImpl.java,v 1.15 2006/02/22 23:49:05 khussey Exp $
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
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.ValueSpecificationAction;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ValueSpecificationActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValueSpecificationActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValueSpecificationActionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValueSpecificationActionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSpecificationActionImpl
		extends ActionImpl
		implements ValueSpecificationAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VALUE_SPECIFICATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.VALUE_SPECIFICATION_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.VALUE_SPECIFICATION_ACTION__OUTPUT,
					new int[]{UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValue() {
		ValueSpecification value = (ValueSpecification) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE);
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (ValueSpecification) eResolveProxy(oldValue);
			if (value != oldValue) {
				InternalEObject newValue = (InternalEObject) value;
				NotificationChain msgs = oldValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, null,
					null);
				if (newValue.eInternalContainer() == null) {
					msgs = newValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, null,
						msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, oldValue,
						value));
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
		return (ValueSpecification) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueSpecification newValue,
			NotificationChain msgs) {
		Object oldValue = eVirtualSet(
			UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, newValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE,
				oldValue == EVIRTUAL_NO_VALUE
					? null
					: oldValue, newValue);
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
		ValueSpecification value = (ValueSpecification) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE);
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, null,
					msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, null,
					msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE, newValue,
				newValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(String name, Type type, EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) EcoreUtil
			.create(eClass);
		if (name != null)
			newValue.setName(name);
		if (type != null)
			newValue.setType(type);
		setValue(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		OutputPin result = (OutputPin) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT);
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject) result;
			result = (OutputPin) eResolveProxy(oldResult);
			if (result != oldResult) {
				InternalEObject newResult = (InternalEObject) result;
				NotificationChain msgs = oldResult.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT, null,
					null);
				if (newResult.eInternalContainer() == null) {
					msgs = newResult.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT, null,
						msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT,
						oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetResult() {
		return (OutputPin) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult,
			NotificationChain msgs) {
		Object oldResult = eVirtualSet(
			UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT, newResult);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT,
				oldResult == EVIRTUAL_NO_VALUE
					? null
					: oldResult, newResult);
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
	public void setResult(OutputPin newResult) {
		OutputPin result = (OutputPin) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT);
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject) result).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT, null,
					msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT, null,
					msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT, newResult,
				newResult));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult(String name, Type type) {
		OutputPin newResult = UMLFactory.eINSTANCE.createOutputPin();
		if (name != null)
			newResult.setName(name);
		if (type != null)
			newResult.setType(type);
		setResult(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatibleType(DiagnosticChain diagnostics,
			Map context) {
		return ValueSpecificationActionOperations.validateCompatibleType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return ValueSpecificationActionOperations.validateMultiplicity(this,
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
			case UMLPackage.VALUE_SPECIFICATION_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE,
					msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE :
				return basicSetValue(null, msgs);
			case UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT :
				return basicSetResult(null, msgs);
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
			case UMLPackage.VALUE_SPECIFICATION_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME :
				return getName();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT :
				if (resolve)
					return getResult();
				return basicGetResult();
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
			case UMLPackage.VALUE_SPECIFICATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE :
				setValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT :
				setResult((OutputPin) newValue);
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
			case UMLPackage.VALUE_SPECIFICATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE :
				setValue((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT :
				setResult((OutputPin) null);
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
			case UMLPackage.VALUE_SPECIFICATION_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME :
				return isSetName();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE :
				return eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE) != null;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT :
				return eVirtualGet(UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT);
	}

} //ValueSpecificationActionImpl
