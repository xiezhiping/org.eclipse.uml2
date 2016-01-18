/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DecisionNodeImpl#getDecisionInput <em>Decision Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DecisionNodeImpl#getDecisionInputFlow <em>Decision Input Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionNodeImpl
		extends ControlNodeImpl
		implements DecisionNode {

	/**
	 * The cached value of the '{@link #getDecisionInput() <em>Decision Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInput()
	 * @generated
	 * @ordered
	 */
	protected Behavior decisionInput;

	/**
	 * The cached value of the '{@link #getDecisionInputFlow() <em>Decision Input Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInputFlow()
	 * @generated
	 * @ordered
	 */
	protected ObjectFlow decisionInputFlow;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DECISION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDecisionInput() {
		if (decisionInput != null && decisionInput.eIsProxy()) {
			InternalEObject oldDecisionInput = (InternalEObject) decisionInput;
			decisionInput = (Behavior) eResolveProxy(oldDecisionInput);
			if (decisionInput != oldDecisionInput) {
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
		return decisionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInput(Behavior newDecisionInput) {
		Behavior oldDecisionInput = decisionInput;
		decisionInput = newDecisionInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DECISION_NODE__DECISION_INPUT, oldDecisionInput,
				decisionInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow getDecisionInputFlow() {
		if (decisionInputFlow != null && decisionInputFlow.eIsProxy()) {
			InternalEObject oldDecisionInputFlow = (InternalEObject) decisionInputFlow;
			decisionInputFlow = (ObjectFlow) eResolveProxy(
				oldDecisionInputFlow);
			if (decisionInputFlow != oldDecisionInputFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DECISION_NODE__DECISION_INPUT_FLOW,
						oldDecisionInputFlow, decisionInputFlow));
			}
		}
		return decisionInputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow basicGetDecisionInputFlow() {
		return decisionInputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInputFlow(ObjectFlow newDecisionInputFlow) {
		ObjectFlow oldDecisionInputFlow = decisionInputFlow;
		decisionInputFlow = newDecisionInputFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DECISION_NODE__DECISION_INPUT_FLOW,
				oldDecisionInputFlow, decisionInputFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingOutgoingEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DecisionNodeOperations.validateIncomingOutgoingEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DecisionNodeOperations.validateEdges(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionInputFlowIncoming(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DecisionNodeOperations.validateDecisionInputFlowIncoming(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DecisionNodeOperations.validateParameters(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeroInputParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DecisionNodeOperations.validateZeroInputParameters(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingObjectOneInputParameter(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DecisionNodeOperations.validateIncomingObjectOneInputParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingControlOneInputParameter(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DecisionNodeOperations.validateIncomingControlOneInputParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwoInputParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DecisionNodeOperations.validateTwoInputParameters(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DECISION_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DECISION_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DECISION_NODE__NAME :
				return getName();
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DECISION_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DECISION_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DECISION_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.DECISION_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.DECISION_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DECISION_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DECISION_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.DECISION_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.DECISION_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.DECISION_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				if (resolve)
					return getDecisionInput();
				return basicGetDecisionInput();
			case UMLPackage.DECISION_NODE__DECISION_INPUT_FLOW :
				if (resolve)
					return getDecisionInputFlow();
				return basicGetDecisionInputFlow();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DECISION_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DECISION_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DECISION_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.DECISION_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.DECISION_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.DECISION_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				setDecisionInput((Behavior) newValue);
				return;
			case UMLPackage.DECISION_NODE__DECISION_INPUT_FLOW :
				setDecisionInputFlow((ObjectFlow) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DECISION_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DECISION_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DECISION_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DECISION_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.DECISION_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.DECISION_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				setDecisionInput((Behavior) null);
				return;
			case UMLPackage.DECISION_NODE__DECISION_INPUT_FLOW :
				setDecisionInputFlow((ObjectFlow) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DECISION_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DECISION_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DECISION_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.DECISION_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.DECISION_NODE__NAME :
				return isSetName();
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DECISION_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DECISION_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DECISION_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DECISION_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DECISION_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DECISION_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DECISION_NODE__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.DECISION_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.DECISION_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.DECISION_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.DECISION_NODE__DECISION_INPUT :
				return decisionInput != null;
			case UMLPackage.DECISION_NODE__DECISION_INPUT_FLOW :
				return decisionInputFlow != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.DECISION_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.DECISION_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.DECISION_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.DECISION_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.DECISION_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DECISION_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.DECISION_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.DECISION_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.DECISION_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.DECISION_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.DECISION_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.DECISION_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.DECISION_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DECISION_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DECISION_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.DECISION_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.DECISION_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DECISION_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.DECISION_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.DECISION_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.DECISION_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.DECISION_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.DECISION_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.DECISION_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.DECISION_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.DECISION_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.DECISION_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DECISION_NODE___SEPARATOR :
				return separator();
			case UMLPackage.DECISION_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.DECISION_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.DECISION_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.DECISION_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.DECISION_NODE___VALIDATE_ZERO_INPUT_PARAMETERS__DIAGNOSTICCHAIN_MAP :
				return validateZeroInputParameters(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_DECISION_INPUT_FLOW_INCOMING__DIAGNOSTICCHAIN_MAP :
				return validateDecisionInputFlowIncoming(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_TWO_INPUT_PARAMETERS__DIAGNOSTICCHAIN_MAP :
				return validateTwoInputParameters(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_INCOMING_OUTGOING_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateIncomingOutgoingEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_INCOMING_CONTROL_ONE_INPUT_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validateIncomingControlOneInputParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_PARAMETERS__DIAGNOSTICCHAIN_MAP :
				return validateParameters((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DECISION_NODE___VALIDATE_INCOMING_OBJECT_ONE_INPUT_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validateIncomingObjectOneInputParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //DecisionNodeImpl
