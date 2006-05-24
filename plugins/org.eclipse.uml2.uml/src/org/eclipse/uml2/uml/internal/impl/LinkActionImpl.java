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
 * $Id: LinkActionImpl.java,v 1.21 2006/05/24 20:54:28 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkAction;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
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
	 * The cached value of the '{@link #getEndData() <em>End Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndData()
	 * @generated
	 * @ordered
	 */
	protected EList endData = null;

	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList inputValues = null;

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
	public EList getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList(InputPin.class, this,
						UMLPackage.LINK_ACTION__INPUT, INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this,
			UMLPackage.LINK_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList.Resolving(LinkEndData.class,
				this, UMLPackage.LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createEndData(EClass eClass) {
		LinkEndData newEndData = (LinkEndData) create(eClass);
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createEndData() {
		return createEndData(UMLPackage.Literals.LINK_END_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputValues() {
		if (inputValues == null) {
			inputValues = new EObjectContainmentEList.Resolving(InputPin.class,
				this, UMLPackage.LINK_ACTION__INPUT_VALUE);
		}
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputValue(String name, Type type, EClass eClass) {
		InputPin newInputValue = (InputPin) create(eClass);
		getInputValues().add(newInputValue);
		if (name != null)
			newInputValue.setName(name);
		if (type != null)
			newInputValue.setType(type);
		return newInputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputValue(String name, Type type) {
		return createInputValue(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name, Type type) {
		return getInputValue(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		inputValueLoop : for (Iterator i = getInputValues().iterator(); i
			.hasNext();) {
			InputPin inputValue = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(inputValue))
				continue inputValueLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inputValue.getName())
				: name.equals(inputValue.getName())))
				continue inputValueLoop;
			if (type != null && !type.equals(inputValue.getType()))
				continue inputValueLoop;
			return inputValue;
		}
		return createOnDemand && eClass != null
			? createInputValue(name, type, eClass)
			: null;
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
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.LINK_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.LINK_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LINK_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
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
				if (resolve)
					return getOwner();
				return basicGetOwner();
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.LINK_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LINK_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.LINK_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.LINK_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.LINK_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.LINK_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.LINK_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.LINK_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.LINK_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.LINK_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.LINK_ACTION__INPUT :
				return getInputs();
			case UMLPackage.LINK_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
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
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.LINK_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
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
				unsetName();
				return;
			case UMLPackage.LINK_ACTION__VISIBILITY :
				unsetVisibility();
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
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.LINK_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.LINK_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.LINK_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				getInPartitions().clear();
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
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LINK_ACTION__NAME :
				return isSetName();
			case UMLPackage.LINK_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.LINK_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LINK_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.LINK_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LINK_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.LINK_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.LINK_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.LINK_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.LINK_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.LINK_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.LINK_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.LINK_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.LINK_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.LINK_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.LINK_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.LINK_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.LINK_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.LINK_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.LINK_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.LINK_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.LINK_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.LINK_ACTION__END_DATA :
				return endData != null && !endData.isEmpty();
			case UMLPackage.LINK_ACTION__INPUT_VALUE :
				return inputValues != null && !inputValues.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{UMLPackage.LINK_ACTION__INPUT_VALUE};

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
