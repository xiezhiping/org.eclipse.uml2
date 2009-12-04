/*
 * Copyright (c) 2005, 2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *
 * $Id: CreateLinkActionImpl.java,v 1.19 2009/12/04 15:30:45 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.CreateLinkActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CreateLinkActionImpl#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateLinkActionImpl
		extends WriteLinkActionImpl
		implements CreateLinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateLinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CREATE_LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkEndData> getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList.Resolving<LinkEndData>(
				LinkEndCreationData.class, this,
				UMLPackage.CREATE_LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkEndData createEndData() {
		LinkEndCreationData newEndData = (LinkEndCreationData) create(UMLPackage.Literals.LINK_END_CREATION_DATA);
		getEndData().add(newEndData);
		return newEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndData() {
		return endData != null && !endData.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationNotAbstract(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CreateLinkActionOperations.validateAssociationNotAbstract(this,
			diagnostics, context);
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
			case UMLPackage.CREATE_LINK_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.CREATE_LINK_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CREATE_LINK_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CREATE_LINK_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.CREATE_LINK_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CREATE_LINK_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CREATE_LINK_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0), (String) arguments
					.get(1), arguments.get(2));
				return null;
			case UMLPackage.CREATE_LINK_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CREATE_LINK_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CREATE_LINK_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CREATE_LINK_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CREATE_LINK_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.CREATE_LINK_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CREATE_LINK_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CREATE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.CREATE_LINK_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.CREATE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid((RedefinableElement) arguments
					.get(0));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_OWNED_STRUCTURED_NODE__DIAGNOSTICCHAIN_MAP :
				return validateOwnedStructuredNode((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_OWNED__DIAGNOSTICCHAIN_MAP :
				return validateOwned((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_SAME_ASSOCIATION__DIAGNOSTICCHAIN_MAP :
				return validateSameAssociation((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_NOT_STATIC__DIAGNOSTICCHAIN_MAP :
				return validateNotStatic((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_SAME_PINS__DIAGNOSTICCHAIN_MAP :
				return validateSamePins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___ASSOCIATION :
				return association();
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_ALLOW_ACCESS__DIAGNOSTICCHAIN_MAP :
				return validateAllowAccess((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CREATE_LINK_ACTION___VALIDATE_ASSOCIATION_NOT_ABSTRACT__DIAGNOSTICCHAIN_MAP :
				return validateAssociationNotAbstract(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //CreateLinkActionImpl
