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
 * $Id: LinkActionImpl.java,v 1.5 2005/11/28 20:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkAction;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LinkActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkActionImpl#getEndData <em>End Data</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkActionImpl#getInputValues <em>Input Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LinkActionImpl
		extends ActionImpl
		implements LinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.LINK_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.LINK_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.LINK_ACTION__INPUT,
					new int[]{UMLPackage.LINK_ACTION__INPUT_VALUE}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEndData() {
		List endData = (List) eVirtualGet(UMLPackage.LINK_ACTION__END_DATA);
		if (endData == null) {
			eVirtualSet(UMLPackage.LINK_ACTION__END_DATA,
				endData = new EObjectContainmentEList(LinkEndData.class, this,
					UMLPackage.LINK_ACTION__END_DATA));
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createEndData(EClass eClass) {
		LinkEndData newEndData = (LinkEndData) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createEndData() {
		LinkEndData newEndData = UMLFactory.eINSTANCE.createLinkEndData();
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputValues() {
		List inputValue = (List) eVirtualGet(UMLPackage.LINK_ACTION__INPUT_VALUE);
		if (inputValue == null) {
			eVirtualSet(UMLPackage.LINK_ACTION__INPUT_VALUE,
				inputValue = new EObjectContainmentEList(InputPin.class, this,
					UMLPackage.LINK_ACTION__INPUT_VALUE));
		}
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputValue(EClass eClass) {
		InputPin newInputValue = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getInputValues().add(newInputValue);
		return newInputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputValue() {
		InputPin newInputValue = UMLFactory.eINSTANCE.createInputPin();
		getInputValues().add(newInputValue);
		return newInputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name) {
		for (Iterator i = getInputValues().iterator(); i.hasNext();) {
			InputPin inputValue = (InputPin) i.next();
			if (name.equals(inputValue.getName())) {
				return inputValue;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameAssociation(DiagnosticChain diagnostics,
			Map context) {
		return LinkActionOperations.validateSameAssociation(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotStatic(DiagnosticChain diagnostics, Map context) {
		return LinkActionOperations.validateNotStatic(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSamePins(DiagnosticChain diagnostics, Map context) {
		return LinkActionOperations
			.validateSamePins(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association association() {
		return LinkActionOperations.association(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.LINK_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.LINK_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.LINK_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.LINK_ACTION__ACTIVITY, msgs);
			case UMLPackage.LINK_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LINK_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LINK_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_ACTION__END_DATA :
				return ((InternalEList) getEndData()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LINK_ACTION__INPUT_VALUE :
				return ((InternalEList) getInputValues()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.LINK_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LINK_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LINK_ACTION__OWNER :
				return getOwner();
			case UMLPackage.LINK_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LINK_ACTION__NAME :
				return getName();
			case UMLPackage.LINK_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.LINK_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LINK_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LINK_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.LINK_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LINK_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.LINK_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.LINK_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.LINK_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.LINK_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.LINK_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.LINK_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.LINK_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.LINK_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.LINK_ACTION__INPUT :
				return getInputs();
			case UMLPackage.LINK_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.LINK_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.LINK_ACTION__END_DATA :
				return getEndData();
			case UMLPackage.LINK_ACTION__INPUT_VALUE :
				return getInputValues();
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
			case UMLPackage.LINK_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LINK_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LINK_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.LINK_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.LINK_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__END_DATA :
				getEndData().clear();
				getEndData().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__INPUT_VALUE :
				getInputValues().clear();
				getInputValues().addAll((Collection) newValue);
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
			case UMLPackage.LINK_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LINK_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LINK_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.LINK_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LINK_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LINK_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.LINK_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.LINK_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.LINK_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.LINK_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.LINK_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.LINK_ACTION__END_DATA :
				getEndData().clear();
				return;
			case UMLPackage.LINK_ACTION__INPUT_VALUE :
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.LINK_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LINK_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LINK_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.LINK_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.LINK_ACTION__VISIBILITY :
				return eVirtualGet(UMLPackage.LINK_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.LINK_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.LINK_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LINK_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.LINK_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.LINK_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.LINK_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.LINK_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.LINK_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.LINK_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.LINK_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.LINK_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.LINK_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.LINK_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.LINK_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.LINK_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.LINK_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.LINK_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.LINK_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.LINK_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.LINK_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.LINK_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.LINK_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.LINK_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.LINK_ACTION__END_DATA :
				List endData = (List) eVirtualGet(UMLPackage.LINK_ACTION__END_DATA);
				return endData != null && !endData.isEmpty();
			case UMLPackage.LINK_ACTION__INPUT_VALUE :
				List inputValue = (List) eVirtualGet(UMLPackage.LINK_ACTION__INPUT_VALUE);
				return inputValue != null && !inputValue.isEmpty();
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
			|| eIsSet(UMLPackage.LINK_ACTION__INPUT_VALUE);
	}

} //LinkActionImpl
