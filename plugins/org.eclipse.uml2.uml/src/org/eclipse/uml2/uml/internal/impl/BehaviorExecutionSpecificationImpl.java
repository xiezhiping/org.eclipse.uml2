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
 * $Id: BehaviorExecutionSpecificationImpl.java,v 1.9 2006/01/19 23:06:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorExecutionSpecificationImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorExecutionSpecificationImpl
		extends ExecutionSpecificationImpl
		implements BehaviorExecutionSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BEHAVIOR_EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		Behavior behavior = (Behavior) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR);
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				eVirtualSet(
					UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR,
					behavior);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR,
						oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return (Behavior) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior behavior = newBehavior;
		Object oldBehavior = eVirtualSet(
			UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR, behavior);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR,
				oldBehavior == EVIRTUAL_NO_VALUE
					? null
					: oldBehavior, behavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				if (resolve)
					return getStart();
				return basicGetStart();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				if (resolve)
					return getFinish();
				return basicGetFinish();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR :
				if (resolve)
					return getBehavior();
				return basicGetBehavior();
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
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR :
				setBehavior((Behavior) newValue);
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
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR :
				setBehavior((Behavior) null);
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
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION) != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				EList covered = (EList) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				EList generalOrdering = (EList) eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				return eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START) != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				return eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH) != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR :
				return eVirtualGet(UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //BehaviorExecutionSpecificationImpl
