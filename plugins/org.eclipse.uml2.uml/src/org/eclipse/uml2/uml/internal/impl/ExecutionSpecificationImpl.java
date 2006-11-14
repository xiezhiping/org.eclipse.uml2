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
 * $Id: ExecutionSpecificationImpl.java,v 1.13 2006/11/14 18:02:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ExecutionSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutionSpecificationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutionSpecificationImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutionSpecificationImpl
		extends InteractionFragmentImpl
		implements ExecutionSpecification {

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification start = null;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification finish = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (OccurrenceSpecification) eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXECUTION_SPECIFICATION__START, oldStart,
						start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(OccurrenceSpecification newStart) {

		OccurrenceSpecification oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXECUTION_SPECIFICATION__START, oldStart, start));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject) finish;
			finish = (OccurrenceSpecification) eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish,
						finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(OccurrenceSpecification newFinish) {

		OccurrenceSpecification oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish, finish));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameLifeline(DiagnosticChain diagnostics, Map context) {
		return ExecutionSpecificationOperations.validateSameLifeline(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXECUTION_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				if (resolve)
					return getStart();
				return basicGetStart();
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				if (resolve)
					return getFinish();
				return basicGetFinish();
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
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) newValue);
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
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) null);
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
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				return start != null;
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				return finish != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ExecutionSpecificationImpl
