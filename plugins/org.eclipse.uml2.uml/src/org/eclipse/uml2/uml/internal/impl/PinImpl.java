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
 * $Id: PinImpl.java,v 1.6 2005/12/06 23:21:50 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PinOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#isControl <em>Is Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PinImpl
		extends ObjectNodeImpl
		implements Pin {

	/**
	 * The default value of the '{@link #isControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControl()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_CONTROL_EFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControl() {
		return (eFlags & IS_CONTROL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControl(boolean newIsControl) {
		boolean oldIsControl = (eFlags & IS_CONTROL_EFLAG) != 0;
		if (newIsControl)
			eFlags |= IS_CONTROL_EFLAG;
		else
			eFlags &= ~IS_CONTROL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PIN__IS_CONTROL, oldIsControl, newIsControl));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlPins(DiagnosticChain diagnostics, Map context) {
		return PinOperations.validateControlPins(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PIN__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PIN__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PIN__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PIN__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PIN__NAME :
				return getName();
			case UMLPackage.PIN__VISIBILITY :
				return getVisibility();
			case UMLPackage.PIN__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PIN__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PIN__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PIN__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PIN__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PIN__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PIN__OUTGOING :
				return getOutgoings();
			case UMLPackage.PIN__IN_GROUP :
				return getInGroups();
			case UMLPackage.PIN__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.PIN__ACTIVITY :
				return getActivity();
			case UMLPackage.PIN__INCOMING :
				return getIncomings();
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.PIN__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.PIN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PIN__ORDERING :
				return getOrdering();
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PIN__UPPER_BOUND :
				return getUpperBound();
			case UMLPackage.PIN__IN_STATE :
				return getInStates();
			case UMLPackage.PIN__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.PIN__IS_CONTROL :
				return isControl()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.PIN__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PIN__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PIN__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PIN__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.PIN__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.PIN__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PIN__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.PIN__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.PIN__IS_CONTROL :
				setIsControl(((Boolean) newValue).booleanValue());
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
			case UMLPackage.PIN__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PIN__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PIN__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PIN__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PIN__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.PIN__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.PIN__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.PIN__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.PIN__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.PIN__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.PIN__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.PIN__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.PIN__IS_CONTROL :
				setIsControl(IS_CONTROL_EDEFAULT);
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
			case UMLPackage.PIN__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.PIN__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PIN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PIN__OWNER :
				return isSetOwner();
			case UMLPackage.PIN__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PIN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PIN__NAME :
				String name = (String) eVirtualGet(UMLPackage.PIN__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PIN__VISIBILITY :
				return eVirtualGet(UMLPackage.PIN__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.PIN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PIN__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PIN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PIN__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PIN__NAME_EXPRESSION) != null;
			case UMLPackage.PIN__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PIN__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PIN__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PIN__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.PIN__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.PIN__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.PIN__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.PIN__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.PIN__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.PIN__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.PIN__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.PIN__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.PIN__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.PIN__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.PIN__TYPE :
				return eVirtualGet(UMLPackage.PIN__TYPE) != null;
			case UMLPackage.PIN__ORDERING :
				return eVirtualGet(UMLPackage.PIN__ORDERING, ORDERING_EDEFAULT) != ORDERING_EDEFAULT;
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.PIN__UPPER_BOUND :
				return eVirtualGet(UMLPackage.PIN__UPPER_BOUND) != null;
			case UMLPackage.PIN__IN_STATE :
				List inState = (List) eVirtualGet(UMLPackage.PIN__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UMLPackage.PIN__SELECTION :
				return eVirtualGet(UMLPackage.PIN__SELECTION) != null;
			case UMLPackage.PIN__IS_CONTROL :
				return ((eFlags & IS_CONTROL_EFLAG) != 0) != IS_CONTROL_EDEFAULT;
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
		result.append(" (isControl: "); //$NON-NLS-1$
		result.append((eFlags & IS_CONTROL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //PinImpl
