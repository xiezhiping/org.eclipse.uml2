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

import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LiteralNullOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LiteralNullImpl
		extends LiteralSpecificationImpl
		implements LiteralNull {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LITERAL_NULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isComputable() {
		return LiteralNullOperations.isComputable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNull() {
		return LiteralNullOperations.isNull(this);
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
			case UMLPackage.LITERAL_NULL___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LITERAL_NULL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LITERAL_NULL___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___DESTROY :
				destroy();
				return null;
			case UMLPackage.LITERAL_NULL___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.LITERAL_NULL___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.LITERAL_NULL___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.LITERAL_NULL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LITERAL_NULL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_MODEL :
				return getModel();
			case UMLPackage.LITERAL_NULL___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.LITERAL_NULL___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.LITERAL_NULL___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.LITERAL_NULL___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.LITERAL_NULL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.LITERAL_NULL___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.LITERAL_NULL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LITERAL_NULL___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LITERAL_NULL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.LITERAL_NULL___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.LITERAL_NULL___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LITERAL_NULL___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.LITERAL_NULL___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.LITERAL_NULL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LITERAL_NULL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LITERAL_NULL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LITERAL_NULL___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.LITERAL_NULL___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_LABEL :
				return getLabel();
			case UMLPackage.LITERAL_NULL___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.LITERAL_NULL___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.LITERAL_NULL___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.LITERAL_NULL___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.LITERAL_NULL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.LITERAL_NULL___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LITERAL_NULL___SEPARATOR :
				return separator();
			case UMLPackage.LITERAL_NULL___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.LITERAL_NULL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.LITERAL_NULL___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.LITERAL_NULL___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LITERAL_NULL___BOOLEAN_VALUE :
				return booleanValue();
			case UMLPackage.LITERAL_NULL___INTEGER_VALUE :
				return integerValue();
			case UMLPackage.LITERAL_NULL___IS_COMPUTABLE :
				return isComputable();
			case UMLPackage.LITERAL_NULL___IS_NULL :
				return isNull();
			case UMLPackage.LITERAL_NULL___REAL_VALUE :
				return realValue();
			case UMLPackage.LITERAL_NULL___STRING_VALUE :
				return stringValue();
			case UMLPackage.LITERAL_NULL___UNLIMITED_VALUE :
				return unlimitedValue();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //LiteralNullImpl
