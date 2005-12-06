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
 * $Id: CombinedFragmentImpl.java,v 1.7 2005/12/06 23:21:50 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.CombinedFragmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getOperands <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CombinedFragmentImpl#getCfragmentGates <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl
		extends InteractionFragmentImpl
		implements CombinedFragment {

	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperatorKind INTERACTION_OPERATOR_EDEFAULT = InteractionOperatorKind.SEQ_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMBINED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT,
					new int[]{UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT,
						UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION,
						UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING,
						UMLPackage.COMBINED_FRAGMENT__OPERAND,
						UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind getInteractionOperator() {
		return (InteractionOperatorKind) eVirtualGet(
			UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR,
			INTERACTION_OPERATOR_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(
			InteractionOperatorKind newInteractionOperator) {
		InteractionOperatorKind interactionOperator = newInteractionOperator == null
			? INTERACTION_OPERATOR_EDEFAULT
			: newInteractionOperator;
		Object oldInteractionOperator = eVirtualSet(
			UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR,
			interactionOperator);
		boolean isSetChange = oldInteractionOperator == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, isSetChange
					? INTERACTION_OPERATOR_EDEFAULT
					: oldInteractionOperator, interactionOperator, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInteractionOperator() {
		Object oldInteractionOperator = eVirtualUnset(UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		boolean isSetChange = oldInteractionOperator != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, isSetChange
					? oldInteractionOperator
					: INTERACTION_OPERATOR_EDEFAULT,
				INTERACTION_OPERATOR_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInteractionOperator() {
		return eVirtualIsSet(UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOperands() {
		List operand = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__OPERAND);
		if (operand == null) {
			eVirtualSet(UMLPackage.COMBINED_FRAGMENT__OPERAND,
				operand = new EObjectContainmentEList(InteractionOperand.class,
					this, UMLPackage.COMBINED_FRAGMENT__OPERAND));
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createOperand() {
		InteractionOperand newOperand = UMLFactory.eINSTANCE
			.createInteractionOperand();
		getOperands().add(newOperand);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand(String name) {
		for (Iterator i = getOperands().iterator(); i.hasNext();) {
			InteractionOperand operand = (InteractionOperand) i.next();
			if (name.equals(operand.getName())) {
				return operand;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCfragmentGates() {
		List cfragmentGate = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		if (cfragmentGate == null) {
			eVirtualSet(UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE,
				cfragmentGate = new EObjectContainmentEList(Gate.class, this,
					UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE));
		}
		return cfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createCfragmentGate() {
		Gate newCfragmentGate = UMLFactory.eINSTANCE.createGate();
		getCfragmentGates().add(newCfragmentGate);
		return newCfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getCfragmentGate(String name) {
		for (Iterator i = getCfragmentGates().iterator(); i.hasNext();) {
			Gate cfragmentGate = (Gate) i.next();
			if (name.equals(cfragmentGate.getName())) {
				return cfragmentGate;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptLoopBreakNeg(DiagnosticChain diagnostics,
			Map context) {
		return CombinedFragmentOperations.validateOptLoopBreakNeg(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinintAndMaxint(DiagnosticChain diagnostics,
			Map context) {
		return CombinedFragmentOperations.validateMinintAndMaxint(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak(DiagnosticChain diagnostics, Map context) {
		return CombinedFragmentOperations.validateBreak(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderAndIgnore(DiagnosticChain diagnostics,
			Map context) {
		return CombinedFragmentOperations.validateConsiderAndIgnore(this,
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				return ((InternalEList) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				return ((InternalEList) getGeneralOrderings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				return eBasicSetContainer(null,
					UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				return eBasicSetContainer(null,
					UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND, msgs);
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				return ((InternalEList) getOperands()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				return ((InternalEList) getCfragmentGates()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMBINED_FRAGMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				return getName();
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.COMBINED_FRAGMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COMBINED_FRAGMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				return getInteractionOperator();
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				return getOperands();
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				return getCfragmentGates();
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator((InteractionOperatorKind) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				getOperands().clear();
				getOperands().addAll((Collection) newValue);
				return;
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				getCfragmentGates().addAll((Collection) newValue);
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				unsetInteractionOperator();
				return;
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				getOperands().clear();
				return;
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
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
			case UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMBINED_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.COMBINED_FRAGMENT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.COMBINED_FRAGMENT__VISIBILITY :
				return eVirtualGet(UMLPackage.COMBINED_FRAGMENT__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.COMBINED_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION) != null;
			case UMLPackage.COMBINED_FRAGMENT__COVERED :
				List covered = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR :
				return isSetInteractionOperator();
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				List operand = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__OPERAND);
				return operand != null && !operand.isEmpty();
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				List cfragmentGate = (List) eVirtualGet(UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
				return cfragmentGate != null && !cfragmentGate.isEmpty();
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
		result.append(" (interactionOperator: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR))
			result
				.append(eVirtualGet(UMLPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.COMBINED_FRAGMENT__OPERAND)
			|| eIsSet(UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
	}

} //CombinedFragmentImpl
