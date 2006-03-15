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
 * $Id: VariableActionImpl.java,v 1.12 2006/03/15 19:34:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VariableAction;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.VariableActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableActionImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableActionImpl
		extends ActionImpl
		implements VariableAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VARIABLE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		Variable variable = (Variable) eVirtualGet(UMLPackage.VARIABLE_ACTION__VARIABLE);
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Variable) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				eVirtualSet(UMLPackage.VARIABLE_ACTION__VARIABLE, variable);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VARIABLE_ACTION__VARIABLE, oldVariable,
						variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return (Variable) eVirtualGet(UMLPackage.VARIABLE_ACTION__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable variable = newVariable;
		Object oldVariable = eVirtualSet(UMLPackage.VARIABLE_ACTION__VARIABLE,
			variable);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE_ACTION__VARIABLE,
				oldVariable == EVIRTUAL_NO_VALUE
					? null
					: oldVariable, variable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeOfVariable(DiagnosticChain diagnostics,
			Map context) {
		return VariableActionOperations.validateScopeOfVariable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.VARIABLE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VARIABLE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VARIABLE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VARIABLE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VARIABLE_ACTION__NAME :
				return getName();
			case UMLPackage.VARIABLE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.VARIABLE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VARIABLE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VARIABLE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VARIABLE_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VARIABLE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VARIABLE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.VARIABLE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.VARIABLE_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.VARIABLE_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.VARIABLE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.VARIABLE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.VARIABLE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.VARIABLE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.VARIABLE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.VARIABLE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.VARIABLE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.VARIABLE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.VARIABLE_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.VARIABLE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.VARIABLE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.VARIABLE_ACTION__VARIABLE :
				if (resolve)
					return getVariable();
				return basicGetVariable();
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
			case UMLPackage.VARIABLE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VARIABLE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE_ACTION__VARIABLE :
				setVariable((Variable) newValue);
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
			case UMLPackage.VARIABLE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.VARIABLE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VARIABLE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VARIABLE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.VARIABLE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.VARIABLE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.VARIABLE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.VARIABLE_ACTION__VARIABLE :
				setVariable((Variable) null);
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
			case UMLPackage.VARIABLE_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VARIABLE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VARIABLE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.VARIABLE_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.VARIABLE_ACTION__NAME :
				return isSetName();
			case UMLPackage.VARIABLE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VARIABLE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VARIABLE_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.VARIABLE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VARIABLE_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.VARIABLE_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.VARIABLE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.VARIABLE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.VARIABLE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.VARIABLE_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.VARIABLE_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.VARIABLE_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.VARIABLE_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.VARIABLE_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.VARIABLE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.VARIABLE_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.VARIABLE_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.VARIABLE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.VARIABLE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.VARIABLE_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.VARIABLE_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.VARIABLE_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.VARIABLE_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.VARIABLE_ACTION__VARIABLE :
				return eVirtualGet(UMLPackage.VARIABLE_ACTION__VARIABLE) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //VariableActionImpl
