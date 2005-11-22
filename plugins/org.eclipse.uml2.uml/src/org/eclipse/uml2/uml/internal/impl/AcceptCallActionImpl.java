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
 * $Id: AcceptCallActionImpl.java,v 1.3 2005/11/22 15:32:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AcceptCallActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptCallActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptCallActionImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptCallActionImpl
		extends AcceptEventActionImpl
		implements AcceptCallAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getAcceptCallAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOutputs() {
		List output = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.ACCEPT_CALL_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.ACCEPT_CALL_ACTION__OUTPUT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getAcceptEventAction_Result(),
						UMLPackage.eINSTANCE
							.getAcceptCallAction_ReturnInformation()}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getReturnInformation() {
		OutputPin returnInformation = (OutputPin) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION);
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject) returnInformation;
			returnInformation = (OutputPin) eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				eVirtualSet(UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					returnInformation);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
						oldReturnInformation, returnInformation));
			}
		}
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetReturnInformation() {
		return (OutputPin) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(OutputPin newReturnInformation) {
		OutputPin returnInformation = newReturnInformation;
		Object oldReturnInformation = eVirtualSet(
			UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
			returnInformation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
				oldReturnInformation == EVIRTUAL_NO_VALUE
					? null
					: oldReturnInformation, returnInformation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultPins(DiagnosticChain diagnostics, Map context) {
		return AcceptCallActionOperations.validateResultPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerCallEvent(DiagnosticChain diagnostics,
			Map context) {
		return AcceptCallActionOperations.validateTriggerCallEvent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshall(DiagnosticChain diagnostics, Map context) {
		return AcceptCallActionOperations.validateUnmarshall(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNER :
				return getOwner();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				return getName();
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACCEPT_CALL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.ACCEPT_CALL_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				return isUnmarshall()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return getResults();
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return getTriggers();
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				if (resolve)
					return getReturnInformation();
				return basicGetReturnInformation();
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				setReturnInformation((OutputPin) newValue);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				setReturnInformation((OutputPin) null);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.ACCEPT_CALL_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				return eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ACCEPT_CALL_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				return ((eFlags & IS_UNMARSHALL_EFLAG) != 0) != IS_UNMARSHALL_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				List result = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__RESULT);
				return result != null && !result.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				List trigger = (List) eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__TRIGGER);
				return trigger != null && !trigger.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				return eVirtualGet(UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.eINSTANCE
				.getAcceptCallAction_ReturnInformation());
	}

} //AcceptCallActionImpl
