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
 * $Id: DecisionNodeImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
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

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DecisionNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DecisionNodeImpl#getDecisionInput <em>Decision Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionNodeImpl
		extends ControlNodeImpl
		implements DecisionNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getDecisionNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDecisionInput() {
		Behavior decisionInput = (Behavior) eVirtualGet(UMLPackage.DECISION_NODE__DECISION_INPUT);
		if (decisionInput != null && decisionInput.eIsProxy()) {
			InternalEObject oldDecisionInput = (InternalEObject) decisionInput;
			decisionInput = (Behavior) eResolveProxy(oldDecisionInput);
			if (decisionInput != oldDecisionInput) {
				eVirtualSet(UMLPackage.DECISION_NODE__DECISION_INPUT,
					decisionInput);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DECISION_NODE__DECISION_INPUT,
						oldDecisionInput, decisionInput));
			}
		}
		return decisionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetDecisionInput() {
		return (Behavior) eVirtualGet(UMLPackage.DECISION_NODE__DECISION_INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInput(Behavior newDecisionInput) {
		Behavior decisionInput = newDecisionInput;
		Object oldDecisionInput = eVirtualSet(
			UMLPackage.DECISION_NODE__DECISION_INPUT, decisionInput);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DECISION_NODE__DECISION_INPUT,
				oldDecisionInput == EVIRTUAL_NO_VALUE
					? null
					: oldDecisionInput, decisionInput));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneIncomingEdge(DiagnosticChain diagnostics,
			Map context) {
		return DecisionNodeOperations.validateOneIncomingEdge(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputParameter(DiagnosticChain diagnostics,
			Map context) {
		return DecisionNodeOperations.validateInputParameter(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdges(DiagnosticChain diagnostics, Map context) {
		return DecisionNodeOperations.validateEdges(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DECISION_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DECISION_NODE__OWNER :
				return getOwner();
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DECISION_NODE__NAME :
				return getName();
			case UMLPackage.DECISION_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.DECISION_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DECISION_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DECISION_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DECISION_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DECISION_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DECISION_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.DECISION_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.DECISION_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.DECISION_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				if (resolve)
					return getDecisionInput();
				return basicGetDecisionInput();
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
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DECISION_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DECISION_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DECISION_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.DECISION_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.DECISION_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				setDecisionInput((Behavior) newValue);
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
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DECISION_NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.DECISION_NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DECISION_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DECISION_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.DECISION_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.DECISION_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				setDecisionInput((Behavior) null);
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
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DECISION_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DECISION_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DECISION_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DECISION_NODE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.DECISION_NODE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DECISION_NODE__VISIBILITY :
				return eVirtualGet(UMLPackage.DECISION_NODE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.DECISION_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DECISION_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DECISION_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.DECISION_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DECISION_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DECISION_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DECISION_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.DECISION_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.DECISION_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.DECISION_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.DECISION_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.DECISION_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.DECISION_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.DECISION_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				return eVirtualGet(UMLPackage.DECISION_NODE__DECISION_INPUT) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //DecisionNodeImpl
