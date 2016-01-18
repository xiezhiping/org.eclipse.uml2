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
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InformationItem;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InformationItemOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationItemImpl#getRepresenteds <em>Represented</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationItemImpl
		extends ClassifierImpl
		implements InformationItem {

	/**
	 * The cached value of the '{@link #getRepresenteds() <em>Represented</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresenteds()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> representeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INFORMATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRepresenteds() {
		if (representeds == null) {
			representeds = new EObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.INFORMATION_ITEM__REPRESENTED);
		}
		return representeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRepresented(String name) {
		return getRepresented(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRepresented(String name, boolean ignoreCase,
			EClass eClass) {
		representedLoop : for (Classifier represented : getRepresenteds()) {
			if (eClass != null && !eClass.isInstance(represented))
				continue representedLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(represented.getName())
				: name.equals(represented.getName())))
				continue representedLoop;
			return represented;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcesAndTargets(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationItemOperations.validateSourcesAndTargets(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasNo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationItemOperations.validateHasNo(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotInstantiable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationItemOperations.validateNotInstantiable(this,
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
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INFORMATION_ITEM__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INFORMATION_ITEM__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INFORMATION_ITEM__NAME :
				return getName();
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INFORMATION_ITEM__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INFORMATION_ITEM__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				return getVisibility();
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.INFORMATION_ITEM__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.INFORMATION_ITEM__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.INFORMATION_ITEM__MEMBER :
				return getMembers();
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				return isLeaf();
			case UMLPackage.INFORMATION_ITEM__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.INFORMATION_ITEM__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.INFORMATION_ITEM__FEATURE :
				return getFeatures();
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				return getGenerals();
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.INFORMATION_ITEM__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				return getUseCases();
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				return getRepresenteds();
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
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				getRepresenteds().clear();
				getRepresenteds()
					.addAll((Collection<? extends Classifier>) newValue);
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
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__NAME :
				unsetName();
				return;
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				getRepresenteds().clear();
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
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INFORMATION_ITEM__OWNER :
				return isSetOwner();
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INFORMATION_ITEM__NAME :
				return isSetName();
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INFORMATION_ITEM__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INFORMATION_ITEM__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.INFORMATION_ITEM__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.INFORMATION_ITEM__MEMBER :
				return isSetMembers();
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.INFORMATION_ITEM__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.INFORMATION_ITEM__FEATURE :
				return isSetFeatures();
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.INFORMATION_ITEM__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				return representation != null;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				return representeds != null && !representeds.isEmpty();
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
			case UMLPackage.INFORMATION_ITEM___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___DESTROY :
				destroy();
				return null;
			case UMLPackage.INFORMATION_ITEM___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.INFORMATION_ITEM___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.INFORMATION_ITEM___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.INFORMATION_ITEM___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_MODEL :
				return getModel();
			case UMLPackage.INFORMATION_ITEM___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.INFORMATION_ITEM___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.INFORMATION_ITEM___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.INFORMATION_ITEM___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.INFORMATION_ITEM___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.INFORMATION_ITEM___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.INFORMATION_ITEM___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.INFORMATION_ITEM___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.INFORMATION_ITEM___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.INFORMATION_ITEM___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_LABEL :
				return getLabel();
			case UMLPackage.INFORMATION_ITEM___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.INFORMATION_ITEM___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.INFORMATION_ITEM___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.INFORMATION_ITEM___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INFORMATION_ITEM___SEPARATOR :
				return separator();
			case UMLPackage.INFORMATION_ITEM___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.INFORMATION_ITEM___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.INFORMATION_ITEM___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.INFORMATION_ITEM___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.INFORMATION_ITEM___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.INFORMATION_ITEM___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.INFORMATION_ITEM___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.INFORMATION_ITEM___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.INFORMATION_ITEM___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.INFORMATION_ITEM___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.INFORMATION_ITEM___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.INFORMATION_ITEM___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.INFORMATION_ITEM___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.INFORMATION_ITEM___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.INFORMATION_ITEM___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.INFORMATION_ITEM___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.INFORMATION_ITEM___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.INFORMATION_ITEM___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.INFORMATION_ITEM___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.INFORMATION_ITEM___ALL_PARENTS :
				return allParents();
			case UMLPackage.INFORMATION_ITEM___GET_GENERALS :
				return getGenerals();
			case UMLPackage.INFORMATION_ITEM___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.INFORMATION_ITEM___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___PARENTS :
				return parents();
			case UMLPackage.INFORMATION_ITEM___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.INFORMATION_ITEM___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.INFORMATION_ITEM___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.INFORMATION_ITEM___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.INFORMATION_ITEM___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.INFORMATION_ITEM___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.INFORMATION_ITEM___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.INFORMATION_ITEM___VALIDATE_SOURCES_AND_TARGETS__DIAGNOSTICCHAIN_MAP :
				return validateSourcesAndTargets(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_HAS_NO__DIAGNOSTICCHAIN_MAP :
				return validateHasNo((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INFORMATION_ITEM___VALIDATE_NOT_INSTANTIABLE__DIAGNOSTICCHAIN_MAP :
				return validateNotInstantiable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //InformationItemImpl
