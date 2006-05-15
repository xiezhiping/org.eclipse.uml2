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
 * $Id: AcceptCallActionImpl.java,v 1.15 2006/05/15 22:13:40 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AcceptCallActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptCallActionImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptCallActionImpl
		extends AcceptEventActionImpl
		implements AcceptCallAction {

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected OutputPin returnInformation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACCEPT_CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList outputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__OUTPUT,
					outputs = new DerivedUnionEObjectEList(OutputPin.class,
						this, UMLPackage.ACCEPT_CALL_ACTION__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList(OutputPin.class, this,
			UMLPackage.ACCEPT_CALL_ACTION__OUTPUT, OUTPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getReturnInformation() {
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject) returnInformation;
			returnInformation = (OutputPin) eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				InternalEObject newReturnInformation = (InternalEObject) returnInformation;
				NotificationChain msgs = oldReturnInformation.eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					null, null);
				if (newReturnInformation.eInternalContainer() == null) {
					msgs = newReturnInformation
						.eInverseAdd(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
						oldReturnInformation, returnInformation));
			}
		}
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnInformation(
			OutputPin newReturnInformation, NotificationChain msgs) {
		OutputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
				oldReturnInformation, newReturnInformation);
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
	public void setReturnInformation(OutputPin newReturnInformation) {
		if (newReturnInformation != returnInformation) {
			NotificationChain msgs = null;
			if (returnInformation != null)
				msgs = ((InternalEObject) returnInformation).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					null, msgs);
			if (newReturnInformation != null)
				msgs = ((InternalEObject) newReturnInformation).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					null, msgs);
			msgs = basicSetReturnInformation(newReturnInformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
				newReturnInformation, newReturnInformation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createReturnInformation(String name, Type type) {
		OutputPin newReturnInformation = (OutputPin) create(UMLPackage.Literals.OUTPUT_PIN);
		setReturnInformation(newReturnInformation);
		if (name != null)
			newReturnInformation.setName(name);
		if (type != null)
			newReturnInformation.setType(type);
		return newReturnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultPins(DiagnosticChain diagnostics, Map context) {
		return AcceptCallActionOperations.validateResultPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerCallEvent(DiagnosticChain diagnostics,
			Map context) {
		return AcceptCallActionOperations.validateTriggerCallEvent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshall(DiagnosticChain diagnostics, Map context) {
		return AcceptCallActionOperations.validateUnmarshall(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return ((InternalEList) getResults()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return ((InternalEList) getTriggers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				return basicSetReturnInformation(null, msgs);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				return getName();
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACCEPT_CALL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.ACCEPT_CALL_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				return isUnmarshall()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return getResults();
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return getTriggers();
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				if (resolve)
					return getReturnInformation();
				return basicGetReturnInformation();
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				setReturnInformation((OutputPin) newValue);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				setReturnInformation((OutputPin) null);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				return isSetName();
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACCEPT_CALL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ACCEPT_CALL_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				return ((eFlags & IS_UNMARSHALL_EFLAG) != 0) != IS_UNMARSHALL_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return results != null && !results.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return triggers != null && !triggers.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				return returnInformation != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[]{
		UMLPackage.ACCEPT_CALL_ACTION__RESULT,
		UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION);
	}

} //AcceptCallActionImpl
