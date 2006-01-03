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
 * $Id: DestroyLinkActionImpl.java,v 1.10 2006/01/03 19:50:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destroy Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DESTROY_LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEndData() {
		EList endData = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__END_DATA);
		if (endData == null) {
			eVirtualSet(UMLPackage.DESTROY_LINK_ACTION__END_DATA,
				endData = new EObjectContainmentEList(
					LinkEndDestructionData.class, this,
					UMLPackage.DESTROY_LINK_ACTION__END_DATA));
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createEndData() {
		LinkEndDestructionData newEndData = UMLFactory.eINSTANCE
			.createLinkEndDestructionData();
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndData() {
		EList endData = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__END_DATA);
		return endData != null && !endData.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DESTROY_LINK_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				return getName();
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DESTROY_LINK_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DESTROY_LINK_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				return getInputs();
			case UMLPackage.DESTROY_LINK_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DESTROY_LINK_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__NAME :
				return isSetName();
			case UMLPackage.DESTROY_LINK_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DESTROY_LINK_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.DESTROY_LINK_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.DESTROY_LINK_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.DESTROY_LINK_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				return isSetEndData();
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
				EList inputValue = (EList) eVirtualGet(UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE);
				return inputValue != null && !inputValue.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //DestroyLinkActionImpl
