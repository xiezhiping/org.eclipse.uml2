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
 * $Id: WriteVariableActionImpl.java,v 1.11 2006/01/03 19:50:25 khussey Exp $
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
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.WriteVariableAction;

import org.eclipse.uml2.uml.internal.operations.WriteVariableActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.WriteVariableActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.WriteVariableActionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WriteVariableActionImpl
		extends VariableActionImpl
		implements WriteVariableAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteVariableActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.WRITE_VARIABLE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.WRITE_VARIABLE_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.WRITE_VARIABLE_ACTION__INPUT,
					new int[]{UMLPackage.WRITE_VARIABLE_ACTION__VALUE}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		return (InputPin) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(InputPin newValue,
			NotificationChain msgs) {
		Object oldValue = eVirtualSet(UMLPackage.WRITE_VARIABLE_ACTION__VALUE,
			newValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.WRITE_VARIABLE_ACTION__VALUE,
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
	public void setValue(InputPin newValue) {
		InputPin value = (InputPin) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__VALUE);
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.WRITE_VARIABLE_ACTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.WRITE_VARIABLE_ACTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.WRITE_VARIABLE_ACTION__VALUE, newValue, newValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createValue(EClass eClass) {
		InputPin newValue = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setValue(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createValue() {
		InputPin newValue = UMLFactory.eINSTANCE.createInputPin();
		setValue(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return WriteVariableActionOperations.validateSameType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return WriteVariableActionOperations.validateMultiplicity(this,
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				return getName();
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.WRITE_VARIABLE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				if (resolve)
					return getVariable();
				return basicGetVariable();
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				return getValue();
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				setVariable((Variable) newValue);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				setValue((InputPin) newValue);
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				setVariable((Variable) null);
				return;
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				setValue((InputPin) null);
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
			case UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME :
				return isSetName();
			case UMLPackage.WRITE_VARIABLE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.WRITE_VARIABLE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.WRITE_VARIABLE_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE :
				return eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__VARIABLE) != null;
			case UMLPackage.WRITE_VARIABLE_ACTION__VALUE :
				return eVirtualGet(UMLPackage.WRITE_VARIABLE_ACTION__VALUE) != null;
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
			|| eIsSet(UMLPackage.WRITE_VARIABLE_ACTION__VALUE);
	}

} //WriteVariableActionImpl
