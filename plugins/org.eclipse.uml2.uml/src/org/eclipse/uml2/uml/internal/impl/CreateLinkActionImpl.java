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
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.CreateLinkActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CreateLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateLinkActionImpl
		extends WriteLinkActionImpl
		implements CreateLinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateLinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CREATE_LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkEndData> getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList.Resolving<LinkEndData>(
				LinkEndCreationData.class, this,
				UMLPackage.CREATE_LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkEndData createEndData() {
		LinkEndCreationData newEndData = (LinkEndCreationData) create(
			UMLPackage.Literals.LINK_END_CREATION_DATA);
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndData() {
		return endData != null && !endData.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationNotAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CreateLinkActionOperations.validateAssociationNotAbstract(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CREATE_LINK_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CREATE_LINK_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CREATE_LINK_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CREATE_LINK_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.CREATE_LINK_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CREATE_LINK_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CREATE_LINK_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CREATE_LINK_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CREATE_LINK_ACTION__END_DATA :
				return ((InternalEList<?>) getEndData()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CREATE_LINK_ACTION__INPUT_VALUE :
				return ((InternalEList<?>) getInputValues())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CREATE_LINK_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CREATE_LINK_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CREATE_LINK_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CREATE_LINK_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CREATE_LINK_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CREATE_LINK_ACTION__NAME :
				return getName();
			case UMLPackage.CREATE_LINK_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CREATE_LINK_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CREATE_LINK_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CREATE_LINK_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.CREATE_LINK_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CREATE_LINK_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CREATE_LINK_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.CREATE_LINK_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.CREATE_LINK_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.CREATE_LINK_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.CREATE_LINK_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.CREATE_LINK_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.CREATE_LINK_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.CREATE_LINK_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.CREATE_LINK_ACTION__INPUT :
				return getInputs();
			case UMLPackage.CREATE_LINK_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.CREATE_LINK_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.CREATE_LINK_ACTION__END_DATA :
				return getEndData();
			case UMLPackage.CREATE_LINK_ACTION__INPUT_VALUE :
				return getInputValues();
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
			case UMLPackage.CREATE_LINK_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__END_DATA :
				getEndData().clear();
				getEndData()
					.addAll((Collection<? extends LinkEndData>) newValue);
				return;
			case UMLPackage.CREATE_LINK_ACTION__INPUT_VALUE :
				getInputValues().clear();
				getInputValues()
					.addAll((Collection<? extends InputPin>) newValue);
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
			case UMLPackage.CREATE_LINK_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.CREATE_LINK_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CREATE_LINK_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CREATE_LINK_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CREATE_LINK_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.CREATE_LINK_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__END_DATA :
				getEndData().clear();
				return;
			case UMLPackage.CREATE_LINK_ACTION__INPUT_VALUE :
				getInputValues().clear();
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
			case UMLPackage.CREATE_LINK_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CREATE_LINK_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.CREATE_LINK_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__NAME :
				return isSetName();
			case UMLPackage.CREATE_LINK_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CREATE_LINK_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CREATE_LINK_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CREATE_LINK_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CREATE_LINK_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CREATE_LINK_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CREATE_LINK_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.CREATE_LINK_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.CREATE_LINK_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.CREATE_LINK_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.CREATE_LINK_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.CREATE_LINK_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.CREATE_LINK_ACTION__END_DATA :
				return isSetEndData();
			case UMLPackage.CREATE_LINK_ACTION__INPUT_VALUE :
				return inputValues != null && !inputValues.isEmpty();
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
			case UMLPackage.CREATE_LINK_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.CREATE_LINK_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.CREATE_LINK_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CREATE_LINK_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CREATE_LINK_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CREATE_LINK_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CREATE_LINK_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CREATE_LINK_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CREATE_LINK_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CREATE_LINK_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CREATE_LINK_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.CREATE_LINK_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CREATE_LINK_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CREATE_LINK_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CREATE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CREATE_LINK_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.CREATE_LINK_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.CREATE_LINK_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.CREATE_LINK_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.CREATE_LINK_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.CREATE_LINK_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_SAME_PINS__DIAGNOSTICCHAIN_MAP :
				return validateSamePins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_SAME_ASSOCIATION__DIAGNOSTICCHAIN_MAP :
				return validateSameAssociation(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_NOT_STATIC__DIAGNOSTICCHAIN_MAP :
				return validateNotStatic((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___ASSOCIATION :
				return association();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_ALLOW_ACCESS__DIAGNOSTICCHAIN_MAP :
				return validateAllowAccess((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_ASSOCIATION_NOT_ABSTRACT__DIAGNOSTICCHAIN_MAP :
				return validateAssociationNotAbstract(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //CreateLinkActionImpl
