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
 * $Id: RemoveVariableValueActionImpl.java,v 1.11 2006/01/03 19:50:26 khussey Exp $
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

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.RemoveVariableValueActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RemoveVariableValueActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RemoveVariableValueActionImpl#isRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RemoveVariableValueActionImpl#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveVariableValueActionImpl
		extends WriteVariableActionImpl
		implements RemoveVariableValueAction {

	/**
	 * The default value of the '{@link #isRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOVE_DUPLICATES_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REMOVE_DUPLICATES_EFLAG = 1 << 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveVariableValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REMOVE_VARIABLE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INPUT, new int[]{
						UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE,
						UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveDuplicates() {
		return (eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoveDuplicates(boolean newIsRemoveDuplicates) {
		boolean oldIsRemoveDuplicates = (eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0;
		if (newIsRemoveDuplicates)
			eFlags |= IS_REMOVE_DUPLICATES_EFLAG;
		else
			eFlags &= ~IS_REMOVE_DUPLICATES_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES,
				oldIsRemoveDuplicates, newIsRemoveDuplicates));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRemoveAt() {
		return (InputPin) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveAt(InputPin newRemoveAt,
			NotificationChain msgs) {
		Object oldRemoveAt = eVirtualSet(
			UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, newRemoveAt);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT,
				oldRemoveAt == EVIRTUAL_NO_VALUE
					? null
					: oldRemoveAt, newRemoveAt);
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
	public void setRemoveAt(InputPin newRemoveAt) {
		InputPin removeAt = (InputPin) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);
		if (newRemoveAt != removeAt) {
			NotificationChain msgs = null;
			if (removeAt != null)
				msgs = ((InternalEObject) removeAt).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT,
					null, msgs);
			if (newRemoveAt != null)
				msgs = ((InternalEObject) newRemoveAt).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT,
					null, msgs);
			msgs = basicSetRemoveAt(newRemoveAt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT,
				newRemoveAt, newRemoveAt));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRemoveAt(EClass eClass) {
		InputPin newRemoveAt = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setRemoveAt(newRemoveAt);
		return newRemoveAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRemoveAt() {
		InputPin newRemoveAt = UMLFactory.eINSTANCE.createInputPin();
		setRemoveAt(newRemoveAt);
		return newRemoveAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedNatural(DiagnosticChain diagnostics,
			Map context) {
		return RemoveVariableValueActionOperations.validateUnlimitedNatural(
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
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(
					null,
					UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE,
					msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE :
				return basicSetValue(null, msgs);
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT :
				return basicSetRemoveAt(null, msgs);
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
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME :
				return getName();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VARIABLE :
				if (resolve)
					return getVariable();
				return basicGetVariable();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE :
				return getValue();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				return isRemoveDuplicates()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT :
				return getRemoveAt();
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
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VARIABLE :
				setVariable((Variable) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				setIsRemoveDuplicates(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT :
				setRemoveAt((InputPin) newValue);
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
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VARIABLE :
				setVariable((Variable) null);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				setIsRemoveDuplicates(IS_REMOVE_DUPLICATES_EDEFAULT);
				return;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT :
				setRemoveAt((InputPin) null);
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
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME :
				return isSetName();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VARIABLE :
				return eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VARIABLE) != null;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE :
				return eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE) != null;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES :
				return ((eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0) != IS_REMOVE_DUPLICATES_EDEFAULT;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT :
				return eVirtualGet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isRemoveDuplicates: "); //$NON-NLS-1$
		result.append((eFlags & IS_REMOVE_DUPLICATES_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);
	}

} //RemoveVariableValueActionImpl
