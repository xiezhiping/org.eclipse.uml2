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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReceptionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReceptionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceptionImpl
		extends BehavioralFeatureImpl
		implements Reception {

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RECEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject) signal;
			signal = (Signal) eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.RECEPTION__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RECEPTION__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameNameAsSignal(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReceptionOperations.validateSameNameAsSignal(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameStructureAsSignal(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReceptionOperations.validateSameStructureAsSignal(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.RECEPTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RECEPTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RECEPTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RECEPTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.RECEPTION__NAME :
				return getName();
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.RECEPTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.RECEPTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RECEPTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.RECEPTION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.RECEPTION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.RECEPTION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.RECEPTION__MEMBER :
				return getMembers();
			case UMLPackage.RECEPTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.RECEPTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.RECEPTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.RECEPTION__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.RECEPTION__IS_STATIC :
				return isStatic();
			case UMLPackage.RECEPTION__CONCURRENCY :
				return getConcurrency();
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.RECEPTION__METHOD :
				return getMethods();
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				return getRaisedExceptions();
			case UMLPackage.RECEPTION__SIGNAL :
				if (resolve)
					return getSignal();
				return basicGetSignal();
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
			case UMLPackage.RECEPTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.RECEPTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.RECEPTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.RECEPTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.RECEPTION__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.RECEPTION__CONCURRENCY :
				setConcurrency((CallConcurrencyKind) newValue);
				return;
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.RECEPTION__METHOD :
				getMethods().clear();
				getMethods().addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				getRaisedExceptions()
					.addAll((Collection<? extends Type>) newValue);
				return;
			case UMLPackage.RECEPTION__SIGNAL :
				setSignal((Signal) newValue);
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
			case UMLPackage.RECEPTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.RECEPTION__NAME :
				unsetName();
				return;
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.RECEPTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.RECEPTION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.RECEPTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__CONCURRENCY :
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__METHOD :
				getMethods().clear();
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				return;
			case UMLPackage.RECEPTION__SIGNAL :
				setSignal((Signal) null);
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
			case UMLPackage.RECEPTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.RECEPTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RECEPTION__OWNER :
				return isSetOwner();
			case UMLPackage.RECEPTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.RECEPTION__NAME :
				return isSetName();
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.RECEPTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.RECEPTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RECEPTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.RECEPTION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.RECEPTION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.RECEPTION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.RECEPTION__MEMBER :
				return isSetMembers();
			case UMLPackage.RECEPTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.RECEPTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.RECEPTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.RECEPTION__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.RECEPTION__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.RECEPTION__CONCURRENCY :
				return (eFlags
					& CONCURRENCY_EFLAG) != CONCURRENCY_EFLAG_DEFAULT;
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.RECEPTION__METHOD :
				return methods != null && !methods.isEmpty();
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				return raisedExceptions != null && !raisedExceptions.isEmpty();
			case UMLPackage.RECEPTION__SIGNAL :
				return signal != null;
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
			case UMLPackage.RECEPTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.RECEPTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.RECEPTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.RECEPTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.RECEPTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.RECEPTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.RECEPTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.RECEPTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.RECEPTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.RECEPTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.RECEPTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___GET_MODEL :
				return getModel();
			case UMLPackage.RECEPTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.RECEPTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.RECEPTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.RECEPTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.RECEPTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.RECEPTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.RECEPTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.RECEPTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.RECEPTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.RECEPTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.RECEPTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.RECEPTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.RECEPTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.RECEPTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.RECEPTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.RECEPTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.RECEPTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.RECEPTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.RECEPTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.RECEPTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.RECEPTION___GET_LABEL :
				return getLabel();
			case UMLPackage.RECEPTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.RECEPTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.RECEPTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.RECEPTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.RECEPTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.RECEPTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RECEPTION___SEPARATOR :
				return separator();
			case UMLPackage.RECEPTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.RECEPTION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.RECEPTION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.RECEPTION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.RECEPTION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.RECEPTION___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.RECEPTION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.RECEPTION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.RECEPTION___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.RECEPTION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.RECEPTION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.RECEPTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.RECEPTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.RECEPTION___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP :
				return validateAbstractNoMethod(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___CREATE_RETURN_RESULT__STRING_TYPE :
				return createReturnResult((String) arguments.get(0),
					(Type) arguments.get(1));
			case UMLPackage.RECEPTION___INPUT_PARAMETERS :
				return inputParameters();
			case UMLPackage.RECEPTION___OUTPUT_PARAMETERS :
				return outputParameters();
			case UMLPackage.RECEPTION___VALIDATE_SAME_NAME_AS_SIGNAL__DIAGNOSTICCHAIN_MAP :
				return validateSameNameAsSignal(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.RECEPTION___VALIDATE_SAME_STRUCTURE_AS_SIGNAL__DIAGNOSTICCHAIN_MAP :
				return validateSameStructureAsSignal(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ReceptionImpl
