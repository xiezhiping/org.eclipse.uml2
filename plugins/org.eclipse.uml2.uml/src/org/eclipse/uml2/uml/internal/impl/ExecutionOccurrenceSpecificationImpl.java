/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutionOccurrenceSpecificationImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionOccurrenceSpecificationImpl
		extends OccurrenceSpecificationImpl
		implements ExecutionOccurrenceSpecification {

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected ExecutionSpecification execution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXECUTION_OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification getExecution() {
		if (execution != null && execution.eIsProxy()) {
			InternalEObject oldExecution = (InternalEObject) execution;
			execution = (ExecutionSpecification) eResolveProxy(oldExecution);
			if (execution != oldExecution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION,
						oldExecution, execution));
			}
		}
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification basicGetExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(ExecutionSpecification newExecution) {
		ExecutionSpecification oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION,
				oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER :
				return getToAfters();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return getToBefores();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION :
				if (resolve)
					return getExecution();
				return basicGetExecution();
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
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				getToAfters()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				getToBefores()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION :
				setExecution((ExecutionSpecification) newValue);
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
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER :
				getToAfters().clear();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				getToBefores().clear();
				return;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION :
				setExecution((ExecutionSpecification) null);
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
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__COVERED :
				return isSetCovereds();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER :
				return toAfters != null && !toAfters.isEmpty();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE :
				return toBefores != null && !toBefores.isEmpty();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION :
				return execution != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ExecutionOccurrenceSpecificationImpl
