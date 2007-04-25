/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReceiveOperationEventImpl.java,v 1.9 2007/04/25 17:47:00 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ReceiveOperationEvent;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Operation Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReceiveOperationEventImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveOperationEventImpl
		extends MessageEventImpl
		implements ReceiveOperationEvent {

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveOperationEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RECEIVE_OPERATION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (Operation) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.RECEIVE_OPERATION_EVENT__OPERATION,
						oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RECEIVE_OPERATION_EVENT__OPERATION, oldOperation,
				operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.RECEIVE_OPERATION_EVENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME :
				return getName();
			case UMLPackage.RECEIVE_OPERATION_EVENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.RECEIVE_OPERATION_EVENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RECEIVE_OPERATION_EVENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.RECEIVE_OPERATION_EVENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OPERATION :
				if (resolve)
					return getOperation();
				return basicGetOperation();
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
			case UMLPackage.RECEIVE_OPERATION_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OPERATION :
				setOperation((Operation) newValue);
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
			case UMLPackage.RECEIVE_OPERATION_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME :
				unsetName();
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OPERATION :
				setOperation((Operation) null);
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
			case UMLPackage.RECEIVE_OPERATION_EVENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNER :
				return isSetOwner();
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME :
				return isSetName();
			case UMLPackage.RECEIVE_OPERATION_EVENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.RECEIVE_OPERATION_EVENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RECEIVE_OPERATION_EVENT__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.RECEIVE_OPERATION_EVENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.RECEIVE_OPERATION_EVENT__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.RECEIVE_OPERATION_EVENT__OPERATION :
				return operation != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ReceiveOperationEventImpl
