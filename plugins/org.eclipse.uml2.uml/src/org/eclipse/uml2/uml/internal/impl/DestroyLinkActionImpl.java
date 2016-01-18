/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
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
import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destroy Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestroyLinkActionImpl
		extends WriteLinkActionImpl
		implements DestroyLinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestroyLinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DESTROY_LINK_ACTION;
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
				LinkEndDestructionData.class, this,
				UMLPackage.DESTROY_LINK_ACTION__END_DATA);
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
		LinkEndDestructionData newEndData = (LinkEndDestructionData) create(
			UMLPackage.Literals.LINK_END_DESTRUCTION_DATA);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				return ((InternalEList<?>) getEndData()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
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
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DESTROY_LINK_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				return getName();
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DESTROY_LINK_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.DESTROY_LINK_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.DESTROY_LINK_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				return getInputs();
			case UMLPackage.DESTROY_LINK_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				return getEndData();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
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
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				getEndData().clear();
				getEndData()
					.addAll((Collection<? extends LinkEndData>) newValue);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
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
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				getEndData().clear();
				return;
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
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
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DESTROY_LINK_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				return isSetName();
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DESTROY_LINK_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.DESTROY_LINK_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.DESTROY_LINK_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				return isSetEndData();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
				return inputValues != null && !inputValues.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //DestroyLinkActionImpl
