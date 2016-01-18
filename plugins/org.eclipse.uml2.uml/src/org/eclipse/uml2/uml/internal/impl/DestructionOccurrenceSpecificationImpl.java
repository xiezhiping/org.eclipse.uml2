/*
 * Copyright (c) 2011, 2016 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 297216, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.DestructionOccurrenceSpecification;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.DestructionOccurrenceSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destruction Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DestructionOccurrenceSpecificationImpl
		extends MessageOccurrenceSpecificationImpl
		implements DestructionOccurrenceSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestructionOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DESTRUCTION_OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOccurrenceSpecificationsBelow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestructionOccurrenceSpecificationOperations
			.validateNoOccurrenceSpecificationsBelow(this, diagnostics,
				context);
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
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_MODEL :
				return getModel();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_LABEL :
				return getLabel();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___SEPARATOR :
				return separator();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___GET_COVERED :
				return getCovered();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___SET_COVERED__LIFELINE :
				setCovered((Lifeline) arguments.get(0));
				return null;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___OPPOSITE_END :
				return oppositeEnd();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_SEND :
				return isSend();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_RECEIVE :
				return isReceive();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT :
				return enclosingFragment();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION___VALIDATE_NO_OCCURRENCE_SPECIFICATIONS_BELOW__DIAGNOSTICCHAIN_MAP :
				return validateNoOccurrenceSpecificationsBelow(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //DestructionOccurrenceSpecificationImpl
