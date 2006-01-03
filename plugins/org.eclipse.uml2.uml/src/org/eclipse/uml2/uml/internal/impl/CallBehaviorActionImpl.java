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
 * $Id: CallBehaviorActionImpl.java,v 1.10 2006/01/03 19:50:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.CallBehaviorActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CallBehaviorActionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallBehaviorActionImpl
		extends CallActionImpl
		implements CallBehaviorAction {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBehaviorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CALL_BEHAVIOR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		Behavior behavior = (Behavior) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR);
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				eVirtualSet(UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR, behavior);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR, oldBehavior,
						behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return (Behavior) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior behavior = newBehavior;
		Object oldBehavior = eVirtualSet(
			UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR, behavior);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR,
				oldBehavior == EVIRTUAL_NO_VALUE
					? null
					: oldBehavior, behavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentPinEqualParameter(
			DiagnosticChain diagnostics, Map context) {
		return CallBehaviorActionOperations.validateArgumentPinEqualParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultPinEqualParameter(DiagnosticChain diagnostics,
			Map context) {
		return CallBehaviorActionOperations.validateResultPinEqualParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOrderingMultiplicity(
			DiagnosticChain diagnostics, Map context) {
		return CallBehaviorActionOperations.validateTypeOrderingMultiplicity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CALL_BEHAVIOR_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME :
				return getName();
			case UMLPackage.CALL_BEHAVIOR_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.CALL_BEHAVIOR_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.CALL_BEHAVIOR_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.CALL_BEHAVIOR_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.CALL_BEHAVIOR_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.CALL_BEHAVIOR_ACTION__INPUT :
				return getInputs();
			case UMLPackage.CALL_BEHAVIOR_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.CALL_BEHAVIOR_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.CALL_BEHAVIOR_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				return isSynchronous()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CALL_BEHAVIOR_ACTION__RESULT :
				return getResults();
			case UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR :
				if (resolve)
					return getBehavior();
				return basicGetBehavior();
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
			case UMLPackage.CALL_BEHAVIOR_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ON_PORT :
				setOnPort((Port) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				setIsSynchronous(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR :
				setBehavior((Behavior) newValue);
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
			case UMLPackage.CALL_BEHAVIOR_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ON_PORT :
				setOnPort((Port) null);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR :
				setBehavior((Behavior) null);
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
			case UMLPackage.CALL_BEHAVIOR_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME :
				return isSetName();
			case UMLPackage.CALL_BEHAVIOR_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CALL_BEHAVIOR_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.CALL_BEHAVIOR_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.CALL_BEHAVIOR_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__ARGUMENT :
				EList argument = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__ON_PORT :
				return eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__ON_PORT) != null;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				return ((eFlags & IS_SYNCHRONOUS_EFLAG) != 0) != IS_SYNCHRONOUS_EDEFAULT;
			case UMLPackage.CALL_BEHAVIOR_ACTION__RESULT :
				EList result = (EList) eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__RESULT);
				return result != null && !result.isEmpty();
			case UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR :
				return eVirtualGet(UMLPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

} //CallBehaviorActionImpl
