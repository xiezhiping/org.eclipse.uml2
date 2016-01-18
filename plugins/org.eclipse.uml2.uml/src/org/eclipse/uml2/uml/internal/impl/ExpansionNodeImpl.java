/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.ExpansionNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionNodeImpl
		extends ObjectNodeImpl
		implements ExpansionNode {

	/**
	 * The cached value of the '{@link #getRegionAsInput() <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion regionAsInput;

	/**
	 * The cached value of the '{@link #getRegionAsOutput() <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion regionAsOutput;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXPANSION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getRegionAsOutput() {
		if (regionAsOutput != null && regionAsOutput.eIsProxy()) {
			InternalEObject oldRegionAsOutput = (InternalEObject) regionAsOutput;
			regionAsOutput = (ExpansionRegion) eResolveProxy(oldRegionAsOutput);
			if (regionAsOutput != oldRegionAsOutput) {
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
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsOutput(
			ExpansionRegion newRegionAsOutput, NotificationChain msgs) {
		ExpansionRegion oldRegionAsOutput = regionAsOutput;
		regionAsOutput = newRegionAsOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT,
				oldRegionAsOutput, newRegionAsOutput);
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
	public boolean validateRegionAsInputOrOutput(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExpansionNodeOperations.validateRegionAsInputOrOutput(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getRegionAsInput() {
		if (regionAsInput != null && regionAsInput.eIsProxy()) {
			InternalEObject oldRegionAsInput = (InternalEObject) regionAsInput;
			regionAsInput = (ExpansionRegion) eResolveProxy(oldRegionAsInput);
			if (regionAsInput != oldRegionAsInput) {
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
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsInput(
			ExpansionRegion newRegionAsInput, NotificationChain msgs) {
		ExpansionRegion oldRegionAsInput = regionAsInput;
		regionAsInput = newRegionAsInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.EXPANSION_NODE__REGION_AS_INPUT,
				oldRegionAsInput, newRegionAsInput);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInInterruptibleRegions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode(
					(StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__INCOMING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInPartitions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				if (regionAsInput != null)
					msgs = ((InternalEObject) regionAsInput).eInverseRemove(
						this, UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
						ExpansionRegion.class, msgs);
				return basicSetRegionAsInput((ExpansionRegion) otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				if (regionAsOutput != null)
					msgs = ((InternalEObject) regionAsOutput).eInverseRemove(
						this, UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
						ExpansionRegion.class, msgs);
				return basicSetRegionAsOutput((ExpansionRegion) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.EXPANSION_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				return basicSetRegionAsInput(null, msgs);
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				return basicSetRegionAsOutput(null, msgs);
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXPANSION_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXPANSION_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXPANSION_NODE__NAME :
				return getName();
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXPANSION_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXPANSION_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.EXPANSION_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXPANSION_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.EXPANSION_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.EXPANSION_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.EXPANSION_NODE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				return getInStates();
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				return isControlType();
			case UMLPackage.EXPANSION_NODE__ORDERING :
				return getOrdering();
			case UMLPackage.EXPANSION_NODE__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				if (resolve)
					return getUpperBound();
				return basicGetUpperBound();
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				if (resolve)
					return getRegionAsInput();
				return basicGetRegionAsInput();
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				if (resolve)
					return getRegionAsOutput();
				return basicGetRegionAsOutput();
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection<? extends State>) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				setIsControlType((Boolean) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				setRegionAsInput((ExpansionRegion) newValue);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				setRegionAsOutput((ExpansionRegion) newValue);
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXPANSION_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.EXPANSION_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.EXPANSION_NODE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_NODE__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				setRegionAsInput((ExpansionRegion) null);
				return;
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				setRegionAsOutput((ExpansionRegion) null);
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
			case UMLPackage.EXPANSION_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXPANSION_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXPANSION_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.EXPANSION_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.EXPANSION_NODE__NAME :
				return isSetName();
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXPANSION_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXPANSION_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXPANSION_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXPANSION_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXPANSION_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXPANSION_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.EXPANSION_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.EXPANSION_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.EXPANSION_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.EXPANSION_NODE__TYPE :
				return type != null;
			case UMLPackage.EXPANSION_NODE__IN_STATE :
				return inStates != null && !inStates.isEmpty();
			case UMLPackage.EXPANSION_NODE__IS_CONTROL_TYPE :
				return ((eFlags
					& IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.EXPANSION_NODE__ORDERING :
				return (eFlags & ORDERING_EFLAG) != ORDERING_EFLAG_DEFAULT;
			case UMLPackage.EXPANSION_NODE__SELECTION :
				return selection != null;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				return upperBound != null;
			case UMLPackage.EXPANSION_NODE__REGION_AS_INPUT :
				return regionAsInput != null;
			case UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT :
				return regionAsOutput != null;
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
			case UMLPackage.EXPANSION_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXPANSION_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXPANSION_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXPANSION_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXPANSION_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.EXPANSION_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXPANSION_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXPANSION_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXPANSION_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXPANSION_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXPANSION_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXPANSION_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXPANSION_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXPANSION_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXPANSION_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.EXPANSION_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.EXPANSION_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.EXPANSION_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.EXPANSION_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPANSION_NODE___SEPARATOR :
				return separator();
			case UMLPackage.EXPANSION_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.EXPANSION_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.EXPANSION_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.EXPANSION_NODE___VALIDATE_INPUT_OUTPUT_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validateInputOutputParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_SELECTION_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateSelectionBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_OBJECT_FLOW_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateObjectFlowEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_NODE___VALIDATE_REGION_AS_INPUT_OR_OUTPUT__DIAGNOSTICCHAIN_MAP :
				return validateRegionAsInputOrOutput(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ExpansionNodeImpl
