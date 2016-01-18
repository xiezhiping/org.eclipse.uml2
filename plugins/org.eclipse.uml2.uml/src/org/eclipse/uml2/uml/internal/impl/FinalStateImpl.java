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

import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.FinalStateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FinalStateImpl
		extends StateImpl
		implements FinalState {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.FINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOutgoingTransitions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalStateOperations.validateNoOutgoingTransitions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoRegions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalStateOperations.validateNoRegions(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotReferenceSubmachine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FinalStateOperations.validateCannotReferenceSubmachine(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoEntryBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalStateOperations.validateNoEntryBehavior(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoExitBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalStateOperations.validateNoExitBehavior(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoStateBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalStateOperations.validateNoStateBehavior(this, diagnostics,
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
			case UMLPackage.FINAL_STATE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___DESTROY :
				destroy();
				return null;
			case UMLPackage.FINAL_STATE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.FINAL_STATE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.FINAL_STATE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.FINAL_STATE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.FINAL_STATE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_MODEL :
				return getModel();
			case UMLPackage.FINAL_STATE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.FINAL_STATE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.FINAL_STATE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.FINAL_STATE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.FINAL_STATE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.FINAL_STATE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.FINAL_STATE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.FINAL_STATE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.FINAL_STATE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.FINAL_STATE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.FINAL_STATE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_STATE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.FINAL_STATE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.FINAL_STATE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.FINAL_STATE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_LABEL :
				return getLabel();
			case UMLPackage.FINAL_STATE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.FINAL_STATE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.FINAL_STATE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.FINAL_STATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.FINAL_STATE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.FINAL_STATE___SEPARATOR :
				return separator();
			case UMLPackage.FINAL_STATE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.FINAL_STATE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.FINAL_STATE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.FINAL_STATE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.FINAL_STATE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.FINAL_STATE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.FINAL_STATE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.FINAL_STATE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.FINAL_STATE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.FINAL_STATE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.FINAL_STATE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.FINAL_STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.FINAL_STATE___CONTAINING_STATE_MACHINE :
				return containingStateMachine();
			case UMLPackage.FINAL_STATE___GET_INCOMINGS :
				return getIncomings();
			case UMLPackage.FINAL_STATE___GET_OUTGOINGS :
				return getOutgoings();
			case UMLPackage.FINAL_STATE___IS_CONTAINED_IN_STATE__STATE :
				return isContainedInState((State) arguments.get(0));
			case UMLPackage.FINAL_STATE___IS_CONTAINED_IN_REGION__REGION :
				return isContainedInRegion((Region) arguments.get(0));
			case UMLPackage.FINAL_STATE___VALIDATE_ENTRY_OR_EXIT__DIAGNOSTICCHAIN_MAP :
				return validateEntryOrExit((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_SUBMACHINE_STATES__DIAGNOSTICCHAIN_MAP :
				return validateSubmachineStates(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_COMPOSITE_STATES__DIAGNOSTICCHAIN_MAP :
				return validateCompositeStates(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_DESTINATIONS_OR_SOURCES_OF_TRANSITIONS__DIAGNOSTICCHAIN_MAP :
				return validateDestinationsOrSourcesOfTransitions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_SUBMACHINE_OR_REGIONS__DIAGNOSTICCHAIN_MAP :
				return validateSubmachineOrRegions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___IS_COMPOSITE :
				return isComposite();
			case UMLPackage.FINAL_STATE___IS_ORTHOGONAL :
				return isOrthogonal();
			case UMLPackage.FINAL_STATE___IS_SIMPLE :
				return isSimple();
			case UMLPackage.FINAL_STATE___IS_SUBMACHINE_STATE :
				return isSubmachineState();
			case UMLPackage.FINAL_STATE___REDEFINITION_CONTEXT :
				return redefinitionContext();
			case UMLPackage.FINAL_STATE___VALIDATE_NO_EXIT_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateNoExitBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_NO_OUTGOING_TRANSITIONS__DIAGNOSTICCHAIN_MAP :
				return validateNoOutgoingTransitions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_NO_REGIONS__DIAGNOSTICCHAIN_MAP :
				return validateNoRegions((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_CANNOT_REFERENCE_SUBMACHINE__DIAGNOSTICCHAIN_MAP :
				return validateCannotReferenceSubmachine(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_NO_ENTRY_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateNoEntryBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_STATE___VALIDATE_NO_STATE_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateNoStateBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //FinalStateImpl
