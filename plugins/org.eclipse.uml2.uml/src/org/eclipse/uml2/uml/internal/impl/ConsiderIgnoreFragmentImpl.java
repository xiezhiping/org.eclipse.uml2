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
 * $Id: ConsiderIgnoreFragmentImpl.java,v 1.15 2007/02/26 16:17:58 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConsiderIgnoreFragmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consider Ignore Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConsiderIgnoreFragmentImpl#getMessages <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsiderIgnoreFragmentImpl
		extends CombinedFragmentImpl
		implements ConsiderIgnoreFragment {

	/**
	 * The cached value of the '{@link #getMessages() <em>Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsiderIgnoreFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONSIDER_IGNORE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMessages() {
		if (messages == null) {
			messages = new EObjectResolvingEList<NamedElement>(
				NamedElement.class, this,
				UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMessage(String name) {
		return getMessage(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMessage(String name, boolean ignoreCase,
			EClass eClass) {
		messageLoop : for (NamedElement message : getMessages()) {
			if (eClass != null && !eClass.isInstance(message))
				continue messageLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(message.getName())
				: name.equals(message.getName())))
				continue messageLoop;
			return message;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderOrIgnore(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsiderIgnoreFragmentOperations.validateConsiderOrIgnore(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsiderIgnoreFragmentOperations.validateType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				return getName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				return getInteractionOperator();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				return getOperands();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				return getCfragmentGates();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				return getMessages();
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator((InteractionOperatorKind) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				getOperands().clear();
				getOperands().addAll(
					(Collection<? extends InteractionOperand>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				getCfragmentGates().addAll(
					(Collection<? extends Gate>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				getMessages().clear();
				getMessages().addAll(
					(Collection<? extends NamedElement>) newValue);
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				unsetName();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				getOperands().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				getMessages().clear();
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				return isSetName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				return operands != null && !operands.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				return cfragmentGates != null && !cfragmentGates.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				return messages != null && !messages.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ConsiderIgnoreFragmentImpl
