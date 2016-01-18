/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConsiderIgnoreFragmentImpl#getMessages <em>Message</em>}</li>
 * </ul>
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				return getName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				return getCovereds();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				return getCfragmentGates();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				return getInteractionOperator();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				return getOperands();
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
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				getCfragmentGates()
					.addAll((Collection<? extends Gate>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator((InteractionOperatorKind) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				getOperands().clear();
				getOperands().addAll(
					(Collection<? extends InteractionOperand>) newValue);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				getMessages().clear();
				getMessages()
					.addAll((Collection<? extends NamedElement>) newValue);
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				getCfragmentGates().clear();
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				getOperands().clear();
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
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNER :
				return isSetOwner();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME :
				return isSetName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				return cfragmentGates != null && !cfragmentGates.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR :
				return (eFlags
					& INTERACTION_OPERATOR_EFLAG) != INTERACTION_OPERATOR_EFLAG_DEFAULT;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				return operands != null && !operands.isEmpty();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__MESSAGE :
				return messages != null && !messages.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___DESTROY :
				destroy();
				return null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_MODEL :
				return getModel();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_LABEL :
				return getLabel();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___SEPARATOR :
				return separator();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_BREAK__DIAGNOSTICCHAIN_MAP :
				return validateBreak((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_CONSIDER_AND_IGNORE__DIAGNOSTICCHAIN_MAP :
				return validateConsiderAndIgnore(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_OPT_LOOP_BREAK_NEG__DIAGNOSTICCHAIN_MAP :
				return validateOptLoopBreakNeg(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_CONSIDER_OR_IGNORE__DIAGNOSTICCHAIN_MAP :
				return validateConsiderOrIgnore(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT___VALIDATE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ConsiderIgnoreFragmentImpl
