/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.GateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GateImpl
		extends MessageEndImpl
		implements Gate {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualGateMatched(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GateOperations.validateActualGateMatched(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsideCfMatched(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GateOperations.validateInsideCfMatched(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutsideCfMatched(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GateOperations.validateOutsideCfMatched(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalGateDistinguishable(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GateOperations.validateFormalGateDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualGateDistinguishable(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GateOperations.validateActualGateDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutsideCfGateDistinguishable(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GateOperations.validateOutsideCfGateDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsideCfGateDistinguishable(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GateOperations.validateInsideCfGateDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutsideCF() {
		return GateOperations.isOutsideCF(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsideCF() {
		return GateOperations.isInsideCF(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActual() {
		return GateOperations.isActual(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormal() {
		return GateOperations.isFormal(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean matches(Gate gateToMatch) {
		return GateOperations.matches(this, gateToMatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand() {
		return GateOperations.getOperand(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		return GateOperations.isDistinguishableFrom(this, n, ns);
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
			case UMLPackage.GATE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.GATE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.GATE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.GATE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.GATE___DESTROY :
				destroy();
				return null;
			case UMLPackage.GATE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.GATE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.GATE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.GATE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.GATE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.GATE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GATE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.GATE___GET_MODEL :
				return getModel();
			case UMLPackage.GATE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.GATE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.GATE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.GATE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.GATE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.GATE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.GATE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.GATE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.GATE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.GATE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.GATE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.GATE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GATE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.GATE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GATE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.GATE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.GATE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.GATE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.GATE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.GATE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.GATE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.GATE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.GATE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.GATE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.GATE___GET_LABEL :
				return getLabel();
			case UMLPackage.GATE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.GATE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.GATE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.GATE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.GATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.GATE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.GATE___SEPARATOR :
				return separator();
			case UMLPackage.GATE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.GATE___OPPOSITE_END :
				return oppositeEnd();
			case UMLPackage.GATE___IS_SEND :
				return isSend();
			case UMLPackage.GATE___IS_RECEIVE :
				return isReceive();
			case UMLPackage.GATE___ENCLOSING_FRAGMENT :
				return enclosingFragment();
			case UMLPackage.GATE___VALIDATE_ACTUAL_GATE_MATCHED__DIAGNOSTICCHAIN_MAP :
				return validateActualGateMatched(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_INSIDE_CF_MATCHED__DIAGNOSTICCHAIN_MAP :
				return validateInsideCfMatched(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_OUTSIDE_CF_MATCHED__DIAGNOSTICCHAIN_MAP :
				return validateOutsideCfMatched(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_FORMAL_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateFormalGateDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_ACTUAL_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateActualGateDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_OUTSIDE_CF_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateOutsideCfGateDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___VALIDATE_INSIDE_CF_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateInsideCfGateDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GATE___IS_OUTSIDE_CF :
				return isOutsideCF();
			case UMLPackage.GATE___IS_INSIDE_CF :
				return isInsideCF();
			case UMLPackage.GATE___IS_ACTUAL :
				return isActual();
			case UMLPackage.GATE___IS_FORMAL :
				return isFormal();
			case UMLPackage.GATE___GET_NAME :
				return getName();
			case UMLPackage.GATE___MATCHES__GATE :
				return matches((Gate) arguments.get(0));
			case UMLPackage.GATE___GET_OPERAND :
				return getOperand();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	@Override
	public String getName() {
		String name = super.getName();

		if (!UML2Util.isEmpty(name)) {
			return name;
		}

		Message message = getMessage();

		if (message != null) {

			if (isActual() || isOutsideCF()) {
				return (isSend()
					? "out_" //$NON-NLS-1$
					: "in_") + message.getName(); //$NON-NLS-1$
			} else {
				return (isSend()
					? "in_" //$NON-NLS-1$
					: "out_") + message.getName(); //$NON-NLS-1$
			}
		}

		return null;
	}

} //GateImpl
