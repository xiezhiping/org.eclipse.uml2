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
 * $Id: ConsiderIgnoreFragmentImpl.java,v 1.4 2005/11/23 20:01:20 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONSIDER_IGNORE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMessages() {
		List message = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE);
		if (message == null) {
			eVirtualSet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE,
				message = new EObjectResolvingEList(NamedElement.class, this,
					UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE));
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMessage(String name) {
		for (Iterator i = getMessages().iterator(); i.hasNext();) {
			NamedElement message = (NamedElement) i.next();
			if (name.equals(message.getName())) {
				return message;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderOrIgnore(DiagnosticChain diagnostics,
			Map context) {
		return ConsiderIgnoreFragmentOperations.validateConsiderOrIgnore(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(DiagnosticChain diagnostics, Map context) {
		return ConsiderIgnoreFragmentOperations.validateType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNER :
				return getOwner();
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
				return getNameExpression();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				return getEnclosingOperand();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
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
				getOperands().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				getCfragmentGates().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				getMessages().clear();
				getMessages().addAll((Collection) newValue);
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				return eVirtualGet(
					UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION) != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				List covered = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				return eVirtualGet(
					UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR,
					INTERACTION_OPERATOR_EDEFAULT) != INTERACTION_OPERATOR_EDEFAULT;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				List operand = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND);
				return operand != null && !operand.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				List cfragmentGate = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE);
				return cfragmentGate != null && !cfragmentGate.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				List message = (List) eVirtualGet(UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE);
				return message != null && !message.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ConsiderIgnoreFragmentImpl
