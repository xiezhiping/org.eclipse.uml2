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
 * $Id: ExpansionNodeImpl.java,v 1.4 2005/11/23 20:01:14 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionNodeImpl
		extends ObjectNodeImpl
		implements ExpansionNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXPANSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getRegionAsOutput() {
		ExpansionRegion regionAsOutput = (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
		if (regionAsOutput != null && regionAsOutput.eIsProxy()) {
			InternalEObject oldRegionAsOutput = (InternalEObject) regionAsOutput;
			regionAsOutput = (ExpansionRegion) eResolveProxy(oldRegionAsOutput);
			if (regionAsOutput != oldRegionAsOutput) {
				eVirtualSet(UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT,
					regionAsOutput);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT,
						oldRegionAsOutput, regionAsOutput));
			}
		}
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion basicGetRegionAsOutput() {
		return (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsOutput(
			ExpansionRegion newRegionAsOutput, NotificationChain msgs) {
		Object oldRegionAsOutput = eVirtualSet(
			UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT, newRegionAsOutput);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT,
				oldRegionAsOutput == EVIRTUAL_NO_VALUE
					? null
					: oldRegionAsOutput, newRegionAsOutput);
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
	public void setRegionAsOutput(ExpansionRegion newRegionAsOutput) {
		ExpansionRegion regionAsOutput = (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
		if (newRegionAsOutput != regionAsOutput) {
			NotificationChain msgs = null;
			if (regionAsOutput != null)
				msgs = ((InternalEObject) regionAsOutput).eInverseRemove(this,
					UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
					ExpansionRegion.class, msgs);
			if (newRegionAsOutput != null)
				msgs = ((InternalEObject) newRegionAsOutput).eInverseAdd(this,
					UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
					ExpansionRegion.class, msgs);
			msgs = basicSetRegionAsOutput(newRegionAsOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT, newRegionAsOutput,
				newRegionAsOutput));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getRegionAsInput() {
		ExpansionRegion regionAsInput = (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_INPUT);
		if (regionAsInput != null && regionAsInput.eIsProxy()) {
			InternalEObject oldRegionAsInput = (InternalEObject) regionAsInput;
			regionAsInput = (ExpansionRegion) eResolveProxy(oldRegionAsInput);
			if (regionAsInput != oldRegionAsInput) {
				eVirtualSet(UMLPackage.EXPANSION_NODE__REGION_AS_INPUT,
					regionAsInput);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXPANSION_NODE__REGION_AS_INPUT,
						oldRegionAsInput, regionAsInput));
			}
		}
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion basicGetRegionAsInput() {
		return (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsInput(
			ExpansionRegion newRegionAsInput, NotificationChain msgs) {
		Object oldRegionAsInput = eVirtualSet(
			UMLPackage.EXPANSION_NODE__REGION_AS_INPUT, newRegionAsInput);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.EXPANSION_NODE__REGION_AS_INPUT,
				oldRegionAsInput == EVIRTUAL_NO_VALUE
					? null
					: oldRegionAsInput, newRegionAsInput);
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
	public void setRegionAsInput(ExpansionRegion newRegionAsInput) {
		ExpansionRegion regionAsInput = (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_INPUT);
		if (newRegionAsInput != regionAsInput) {
			NotificationChain msgs = null;
			if (regionAsInput != null)
				msgs = ((InternalEObject) regionAsInput).eInverseRemove(this,
					UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
					ExpansionRegion.class, msgs);
			if (newRegionAsInput != null)
				msgs = ((InternalEObject) newRegionAsInput).eInverseAdd(this,
					UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
					ExpansionRegion.class, msgs);
			msgs = basicSetRegionAsInput(newRegionAsInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXPANSION_NODE__REGION_AS_INPUT, newRegionAsInput,
				newRegionAsInput));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.EXPANSION_NODE__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.EXPANSION_NODE__ACTIVITY :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.EXPANSION_NODE__ACTIVITY, msgs);
				case UMLPackage.EXPANSION_NODE__INCOMING :
					return ((InternalEList) getIncomings()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicAdd(otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
					ExpansionRegion regionAsOutput = (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
					if (regionAsOutput != null)
						msgs = ((InternalEObject) regionAsOutput)
							.eInverseRemove(this,
								UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
								ExpansionRegion.class, msgs);
					return basicSetRegionAsOutput((ExpansionRegion) otherEnd,
						msgs);
				case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
					ExpansionRegion regionAsInput = (ExpansionRegion) eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_INPUT);
					if (regionAsInput != null)
						msgs = ((InternalEObject) regionAsInput)
							.eInverseRemove(this,
								UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
								ExpansionRegion.class, msgs);
					return basicSetRegionAsInput((ExpansionRegion) otherEnd,
						msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.EXPANSION_NODE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
					return eBasicSetContainer(null,
						UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.EXPANSION_NODE__ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.EXPANSION_NODE__ACTIVITY, msgs);
				case UMLPackage.EXPANSION_NODE__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
					return basicSetUpperBound(null, msgs);
				case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
					return basicSetRegionAsOutput(null, msgs);
				case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
					return basicSetRegionAsInput(null, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXPANSION_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXPANSION_NODE__OWNER :
				return getOwner();
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXPANSION_NODE__NAME :
				return getName();
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXPANSION_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXPANSION_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXPANSION_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXPANSION_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.EXPANSION_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.EXPANSION_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.EXPANSION_NODE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.EXPANSION_NODE__ORDERING :
				return getOrdering();
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				return getUpperBound();
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				return getInStates();
			case UMLPackage.EXPANSION_NODE__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				if (resolve)
					return getRegionAsOutput();
				return basicGetRegionAsOutput();
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				if (resolve)
					return getRegionAsInput();
				return basicGetRegionAsInput();
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				setRegionAsOutput((ExpansionRegion) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				setRegionAsInput((ExpansionRegion) newValue);
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXPANSION_NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.EXPANSION_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.EXPANSION_NODE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.EXPANSION_NODE__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.EXPANSION_NODE__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				setRegionAsOutput((ExpansionRegion) null);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				setRegionAsInput((ExpansionRegion) null);
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXPANSION_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXPANSION_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXPANSION_NODE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.EXPANSION_NODE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.EXPANSION_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXPANSION_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXPANSION_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXPANSION_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.EXPANSION_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.EXPANSION_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.EXPANSION_NODE__TYPE :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__TYPE) != null;
			case UMLPackage.EXPANSION_NODE__ORDERING :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__ORDERING,
					ORDERING_EDEFAULT) != ORDERING_EDEFAULT;
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__UPPER_BOUND) != null;
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				List inState = (List) eVirtualGet(UMLPackage.EXPANSION_NODE__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UMLPackage.EXPANSION_NODE__SELECTION :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__SELECTION) != null;
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT) != null;
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				return eVirtualGet(UMLPackage.EXPANSION_NODE__REGION_AS_INPUT) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ExpansionNodeImpl
