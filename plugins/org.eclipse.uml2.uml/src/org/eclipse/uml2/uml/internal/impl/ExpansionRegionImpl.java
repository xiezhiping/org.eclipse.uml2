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
 * $Id: ExpansionRegionImpl.java,v 1.13 2006/02/22 20:48:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ExpansionKind;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ExpansionRegionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionRegionImpl#getInputElements <em>Input Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionRegionImpl#getOutputElements <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl
		extends StructuredActivityNodeImpl
		implements ExpansionRegion {

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.ITERATIVE_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXPANSION_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode() {
		return (ExpansionKind) eVirtualGet(UMLPackage.EXPANSION_REGION__MODE,
			MODE_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode) {
		ExpansionKind mode = newMode == null
			? MODE_EDEFAULT
			: newMode;
		Object oldMode = eVirtualSet(UMLPackage.EXPANSION_REGION__MODE, mode);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXPANSION_REGION__MODE, oldMode == EVIRTUAL_NO_VALUE
					? MODE_EDEFAULT
					: oldMode, mode));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputElements() {
		EList inputElement = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__INPUT_ELEMENT);
		if (inputElement == null) {
			eVirtualSet(UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
				inputElement = new EObjectWithInverseResolvingEList(
					ExpansionNode.class, this,
					UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
					UMLPackage.EXPANSION_NODE__REGION_AS_INPUT));
		}
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getInputElement(String name, Type type) {
		return getInputElement(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getInputElement(String name, Type type,
			boolean ignoreCase) {
		inputElementLoop : for (Iterator i = getInputElements().iterator(); i
			.hasNext();) {
			ExpansionNode inputElement = (ExpansionNode) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inputElement.getName())
				: name.equals(inputElement.getName())))
				continue inputElementLoop;
			if (type != null && !type.equals(inputElement.getType()))
				continue inputElementLoop;
			return inputElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputElements() {
		EList outputElement = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT);
		if (outputElement == null) {
			eVirtualSet(UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
				outputElement = new EObjectWithInverseResolvingEList(
					ExpansionNode.class, this,
					UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
					UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT));
		}
		return outputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getOutputElement(String name, Type type) {
		return getOutputElement(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getOutputElement(String name, Type type,
			boolean ignoreCase) {
		outputElementLoop : for (Iterator i = getOutputElements().iterator(); i
			.hasNext();) {
			ExpansionNode outputElement = (ExpansionNode) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(outputElement.getName())
				: name.equals(outputElement.getName())))
				continue outputElementLoop;
			if (type != null && !type.equals(outputElement.getType()))
				continue outputElementLoop;
			return outputElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNodes(DiagnosticChain diagnostics,
			Map context) {
		return ExpansionRegionOperations.validateExpansionNodes(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.EXPANSION_REGION__ACTIVITY, msgs);
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return ((InternalEList) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return ((InternalEList) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return ((InternalEList) getHandlers()).basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.EXPANSION_REGION__IN_ACTIVITY, msgs);
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return ((InternalEList) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__EDGE :
				return ((InternalEList) getEdges()).basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__NODE :
				return ((InternalEList) getNodes()).basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return ((InternalEList) getInputElements()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return ((InternalEList) getOutputElements()).basicAdd(otherEnd,
					msgs);
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.EXPANSION_REGION__ACTIVITY, msgs);
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.EXPANSION_REGION__IN_ACTIVITY, msgs);
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return ((InternalEList) getInputElements()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return ((InternalEList) getOutputElements()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXPANSION_REGION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXPANSION_REGION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXPANSION_REGION__NAME :
				return getName();
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXPANSION_REGION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXPANSION_REGION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXPANSION_REGION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXPANSION_REGION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				return getActivity();
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return getOutgoings();
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return getIncomings();
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.EXPANSION_REGION__IN_GROUP :
				return getInGroups();
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return getHandlers();
			case UMLPackage.EXPANSION_REGION__OUTPUT :
				return getOutputs();
			case UMLPackage.EXPANSION_REGION__INPUT :
				return getInputs();
			case UMLPackage.EXPANSION_REGION__CONTEXT :
				return getContext();
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.EXPANSION_REGION__MEMBER :
				return getMembers();
			case UMLPackage.EXPANSION_REGION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.EXPANSION_REGION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.EXPANSION_REGION__SUBGROUP :
				return getSubgroups();
			case UMLPackage.EXPANSION_REGION__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.EXPANSION_REGION__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.EXPANSION_REGION__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return getVariables();
			case UMLPackage.EXPANSION_REGION__EDGE :
				return getEdges();
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXPANSION_REGION__NODE :
				return getNodes();
			case UMLPackage.EXPANSION_REGION__MODE :
				return getMode();
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return getInputElements();
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return getOutputElements();
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.EXPANSION_REGION__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__MODE :
				setMode((ExpansionKind) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				getInputElements().clear();
				getInputElements().addAll((Collection) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				getOutputElements().clear();
				getOutputElements().addAll((Collection) newValue);
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXPANSION_REGION__NAME :
				unsetName();
				return;
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.EXPANSION_REGION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.EXPANSION_REGION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.EXPANSION_REGION__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_REGION__NODE :
				getNodes().clear();
				return;
			case UMLPackage.EXPANSION_REGION__MODE :
				setMode(MODE_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				getInputElements().clear();
				return;
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				getOutputElements().clear();
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXPANSION_REGION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXPANSION_REGION__OWNER :
				return isSetOwner();
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXPANSION_REGION__NAME :
				return isSetName();
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXPANSION_REGION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXPANSION_REGION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXPANSION_REGION__NAME_EXPRESSION) != null;
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXPANSION_REGION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXPANSION_REGION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				return isSetActivity();
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.EXPANSION_REGION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.EXPANSION_REGION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.EXPANSION_REGION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.EXPANSION_REGION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.EXPANSION_REGION__INPUT :
				return isSetInputs();
			case UMLPackage.EXPANSION_REGION__CONTEXT :
				return getContext() != null;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.EXPANSION_REGION__MEMBER :
				return isSetMembers();
			case UMLPackage.EXPANSION_REGION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.EXPANSION_REGION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.EXPANSION_REGION__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.EXPANSION_REGION__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.EXPANSION_REGION__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.EXPANSION_REGION__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				EList variable = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__VARIABLE);
				return variable != null && !variable.isEmpty();
			case UMLPackage.EXPANSION_REGION__EDGE :
				EList edge = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__EDGE);
				return edge != null && !edge.isEmpty();
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.EXPANSION_REGION__NODE :
				EList node = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.EXPANSION_REGION__MODE :
				return eVirtualGet(UMLPackage.EXPANSION_REGION__MODE,
					MODE_EDEFAULT) != MODE_EDEFAULT;
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				EList inputElement = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__INPUT_ELEMENT);
				return inputElement != null && !inputElement.isEmpty();
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				EList outputElement = (EList) eVirtualGet(UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT);
				return outputElement != null && !outputElement.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mode: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.EXPANSION_REGION__MODE,
			MODE_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //ExpansionRegionImpl
