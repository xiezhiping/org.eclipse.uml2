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
 * $Id: DurationObservationActionImpl.java,v 1.4 2005/11/23 13:27:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationObservationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DurationObservationActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationObservationActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DurationObservationActionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationObservationActionImpl
		extends WriteStructuralFeatureActionImpl
		implements DurationObservationAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationObservationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getDurationObservationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return DurationObservationActionOperations.getDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		DurationObservationActionOperations.setDuration(this, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		return (InputPin) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(InputPin newValue,
			NotificationChain msgs) {
		Object oldValue = eVirtualSet(
			UMLPackage.DURATION_OBSERVATION_ACTION__VALUE, newValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.DURATION_OBSERVATION_ACTION__VALUE,
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
		InputPin value = (InputPin) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__VALUE);
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DURATION_OBSERVATION_ACTION__VALUE, null,
					msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.DURATION_OBSERVATION_ACTION__VALUE, null,
					msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DURATION_OBSERVATION_ACTION__VALUE, newValue,
				newValue));

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
	public boolean isSetValue() {
		return eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__VALUE) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputValueDuration(DiagnosticChain diagnostics,
			Map context) {
		return DurationObservationActionOperations.validateInputValueDuration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DURATION_OBSERVATION_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNER :
				return getOwner();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME :
				return getName();
			case UMLPackage.DURATION_OBSERVATION_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DURATION_OBSERVATION_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.DURATION_OBSERVATION_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.DURATION_OBSERVATION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DURATION_OBSERVATION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.DURATION_OBSERVATION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.DURATION_OBSERVATION_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE :
				if (resolve)
					return getStructuralFeature();
				return basicGetStructuralFeature();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OBJECT :
				return getObject();
			case UMLPackage.DURATION_OBSERVATION_ACTION__VALUE :
				return getValue();
			case UMLPackage.DURATION_OBSERVATION_ACTION__DURATION :
				return getDuration();
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
			case UMLPackage.DURATION_OBSERVATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OBJECT :
				setObject((InputPin) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__DURATION :
				setDuration((Duration) newValue);
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
			case UMLPackage.DURATION_OBSERVATION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) null);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OBJECT :
				setObject((InputPin) null);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.DURATION_OBSERVATION_ACTION__DURATION :
				setDuration((Duration) null);
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
			case UMLPackage.DURATION_OBSERVATION_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.DURATION_OBSERVATION_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DURATION_OBSERVATION_ACTION__VISIBILITY :
				return eVirtualGet(
					UMLPackage.DURATION_OBSERVATION_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.DURATION_OBSERVATION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.DURATION_OBSERVATION_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.DURATION_OBSERVATION_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.DURATION_OBSERVATION_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.DURATION_OBSERVATION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.DURATION_OBSERVATION_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE :
				return eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__STRUCTURAL_FEATURE) != null;
			case UMLPackage.DURATION_OBSERVATION_ACTION__OBJECT :
				return eVirtualGet(UMLPackage.DURATION_OBSERVATION_ACTION__OBJECT) != null;
			case UMLPackage.DURATION_OBSERVATION_ACTION__VALUE :
				return isSetValue();
			case UMLPackage.DURATION_OBSERVATION_ACTION__DURATION :
				return getDuration() != null;
		}
		return eDynamicIsSet(featureID);
	}

} //DurationObservationActionImpl
