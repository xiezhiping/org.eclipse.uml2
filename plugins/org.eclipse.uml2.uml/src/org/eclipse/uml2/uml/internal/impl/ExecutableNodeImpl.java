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
 * $Id: ExecutableNodeImpl.java,v 1.8 2005/12/12 16:58:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutableNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutableNodeImpl#getHandlers <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableNodeImpl
		extends ActivityNodeImpl
		implements ExecutableNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXECUTABLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.EXECUTABLE_NODE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.EXECUTABLE_NODE__OWNED_ELEMENT, new int[]{
						UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT,
						UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION,
						UMLPackage.EXECUTABLE_NODE__HANDLER}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getHandlers() {
		List handler = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__HANDLER);
		if (handler == null) {
			eVirtualSet(UMLPackage.EXECUTABLE_NODE__HANDLER,
				handler = new EObjectContainmentWithInverseEList(
					ExceptionHandler.class, this,
					UMLPackage.EXECUTABLE_NODE__HANDLER,
					UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE));
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createHandler() {
		ExceptionHandler newHandler = UMLFactory.eINSTANCE
			.createExceptionHandler();
		getHandlers().add(newHandler);
		return newHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.EXECUTABLE_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__OUTGOING :
				return ((InternalEList) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.EXECUTABLE_NODE__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.EXECUTABLE_NODE__ACTIVITY, msgs);
			case UMLPackage.EXECUTABLE_NODE__INCOMING :
				return ((InternalEList) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.EXECUTABLE_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.EXECUTABLE_NODE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXECUTABLE_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.EXECUTABLE_NODE__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.EXECUTABLE_NODE__ACTIVITY, msgs);
			case UMLPackage.EXECUTABLE_NODE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXECUTABLE_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
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
			case UMLPackage.EXECUTABLE_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXECUTABLE_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXECUTABLE_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXECUTABLE_NODE__NAME :
				return getName();
			case UMLPackage.EXECUTABLE_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXECUTABLE_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXECUTABLE_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.EXECUTABLE_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXECUTABLE_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXECUTABLE_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXECUTABLE_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.EXECUTABLE_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.EXECUTABLE_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.EXECUTABLE_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.EXECUTABLE_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.EXECUTABLE_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.EXECUTABLE_NODE__HANDLER :
				return getHandlers();
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
			case UMLPackage.EXECUTABLE_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.EXECUTABLE_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTABLE_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
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
			case UMLPackage.EXECUTABLE_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.EXECUTABLE_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXECUTABLE_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.EXECUTABLE_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.EXECUTABLE_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.EXECUTABLE_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.EXECUTABLE_NODE__HANDLER :
				getHandlers().clear();
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
			case UMLPackage.EXECUTABLE_NODE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.EXECUTABLE_NODE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXECUTABLE_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__NAME :
				return isSetName();
			case UMLPackage.EXECUTABLE_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXECUTABLE_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXECUTABLE_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.EXECUTABLE_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXECUTABLE_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXECUTABLE_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXECUTABLE_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.EXECUTABLE_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.EXECUTABLE_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.EXECUTABLE_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.EXECUTABLE_NODE__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.EXECUTABLE_NODE__HANDLER);
				return handler != null && !handler.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.EXECUTABLE_NODE__HANDLER);
	}

} //ExecutableNodeImpl
