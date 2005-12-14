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
 * $Id: AcceptEventActionImpl.java,v 1.10 2005/12/14 22:34:18 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AcceptEventActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#isUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getTriggers <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptEventActionImpl
		extends ActionImpl
		implements AcceptEventAction {

	/**
	 * The default value of the '{@link #isUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNMARSHALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNMARSHALL_EFLAG = 1 << 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACCEPT_EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT,
					new int[]{UMLPackage.ACCEPT_EVENT_ACTION__RESULT}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnmarshall() {
		return (eFlags & IS_UNMARSHALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnmarshall(boolean newIsUnmarshall) {
		boolean oldIsUnmarshall = (eFlags & IS_UNMARSHALL_EFLAG) != 0;
		if (newIsUnmarshall)
			eFlags |= IS_UNMARSHALL_EFLAG;
		else
			eFlags &= ~IS_UNMARSHALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL, oldIsUnmarshall,
				newIsUnmarshall));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResults() {
		EList result = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__RESULT);
		if (result == null) {
			eVirtualSet(UMLPackage.ACCEPT_EVENT_ACTION__RESULT,
				result = new EObjectResolvingEList(OutputPin.class, this,
					UMLPackage.ACCEPT_EVENT_ACTION__RESULT));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name) {
		for (Iterator i = getResults().iterator(); i.hasNext();) {
			OutputPin result = (OutputPin) i.next();
			if (name.equals(result.getName())) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTriggers() {
		EList trigger = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER);
		if (trigger == null) {
			eVirtualSet(UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER,
				trigger = new EObjectContainmentEList(Trigger.class, this,
					UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER));
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		Trigger newTrigger = UMLFactory.eINSTANCE.createTrigger();
		getTriggers().add(newTrigger);
		return newTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name) {
		for (Iterator i = getTriggers().iterator(); i.hasNext();) {
			Trigger trigger = (Trigger) i.next();
			if (name.equals(trigger.getName())) {
				return trigger;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoInputPins(DiagnosticChain diagnostics, Map context) {
		return AcceptEventActionOperations.validateNoInputPins(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOutputPins(DiagnosticChain diagnostics, Map context) {
		return AcceptEventActionOperations.validateNoOutputPins(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEvents(DiagnosticChain diagnostics,
			Map context) {
		return AcceptEventActionOperations.validateTriggerEvents(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallSignalEvents(DiagnosticChain diagnostics,
			Map context) {
		return AcceptEventActionOperations.validateUnmarshallSignalEvents(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				return ((InternalEList) getTriggers()).basicRemove(otherEnd,
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				return getName();
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACCEPT_EVENT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				return isUnmarshall()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				return getResults();
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				return getTriggers();
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection) newValue);
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				getTriggers().clear();
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				return isSetName();
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACCEPT_EVENT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				return ((eFlags & IS_UNMARSHALL_EFLAG) != 0) != IS_UNMARSHALL_EDEFAULT;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				EList result = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__RESULT);
				return result != null && !result.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				EList trigger = (EList) eVirtualGet(UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER);
				return trigger != null && !trigger.isEmpty();
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
		result.append(" (isUnmarshall: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNMARSHALL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.ACCEPT_EVENT_ACTION__RESULT);
	}

} //AcceptEventActionImpl
