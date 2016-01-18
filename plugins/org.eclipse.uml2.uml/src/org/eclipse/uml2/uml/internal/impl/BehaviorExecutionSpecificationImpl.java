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

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.BehaviorExecutionSpecificationImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorExecutionSpecificationImpl
		extends ExecutionSpecificationImpl
		implements BehaviorExecutionSpecification {

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.BEHAVIOR_EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
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
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR,
				oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				if (resolve)
					return getFinish();
				return basicGetFinish();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				if (resolve)
					return getStart();
				return basicGetStart();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) newValue);
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
	@Override
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
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) null);
				return;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) null);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH :
				return finish != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START :
				return start != null;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR :
				return behavior != null;
		}
		return eDynamicIsSet(featureID);
	}

} //BehaviorExecutionSpecificationImpl
