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
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ModelOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ModelImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl
		extends PackageImpl
		implements Model {

	/**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String viewpoint = VIEWPOINT_EDEFAULT;

	/**
	 * The flag representing whether the Viewpoint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VIEWPOINT_ESETFLAG = 1 << 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		String oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		boolean oldViewpointESet = (eFlags & VIEWPOINT_ESETFLAG) != 0;
		eFlags |= VIEWPOINT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MODEL__VIEWPOINT, oldViewpoint, viewpoint,
				!oldViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewpoint() {
		String oldViewpoint = viewpoint;
		boolean oldViewpointESet = (eFlags & VIEWPOINT_ESETFLAG) != 0;
		viewpoint = VIEWPOINT_EDEFAULT;
		eFlags &= ~VIEWPOINT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.MODEL__VIEWPOINT, oldViewpoint, VIEWPOINT_EDEFAULT,
				oldViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewpoint() {
		return (eFlags & VIEWPOINT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetamodel() {
		return ModelOperations.isMetamodel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.MODEL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MODEL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MODEL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MODEL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MODEL__NAME :
				return getName();
			case UMLPackage.MODEL__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.MODEL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MODEL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MODEL__VISIBILITY :
				return getVisibility();
			case UMLPackage.MODEL__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.MODEL__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.MODEL__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.MODEL__MEMBER :
				return getMembers();
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.MODEL__URI :
				return getURI();
			case UMLPackage.MODEL__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.MODEL__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.MODEL__OWNED_STEREOTYPE :
				return getOwnedStereotypes();
			case UMLPackage.MODEL__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.MODEL__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				return getProfileApplications();
			case UMLPackage.MODEL__VIEWPOINT :
				return getViewpoint();
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
			case UMLPackage.MODEL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.MODEL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.MODEL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MODEL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MODEL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MODEL__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.MODEL__URI :
				setURI((String) newValue);
				return;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Package>) newValue);
				return;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.MODEL__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection<? extends Type>) newValue);
				return;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges()
					.addAll((Collection<? extends PackageMerge>) newValue);
				return;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll(
					(Collection<? extends PackageableElement>) newValue);
				return;
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				getProfileApplications().clear();
				getProfileApplications().addAll(
					(Collection<? extends ProfileApplication>) newValue);
				return;
			case UMLPackage.MODEL__VIEWPOINT :
				setViewpoint((String) newValue);
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
			case UMLPackage.MODEL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MODEL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MODEL__NAME :
				unsetName();
				return;
			case UMLPackage.MODEL__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MODEL__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.MODEL__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.MODEL__URI :
				setURI(URI_EDEFAULT);
				return;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.MODEL__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				getProfileApplications().clear();
				return;
			case UMLPackage.MODEL__VIEWPOINT :
				unsetViewpoint();
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
			case UMLPackage.MODEL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MODEL__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.MODEL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MODEL__OWNER :
				return isSetOwner();
			case UMLPackage.MODEL__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.MODEL__NAME :
				return isSetName();
			case UMLPackage.MODEL__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.MODEL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MODEL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MODEL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.MODEL__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.MODEL__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.MODEL__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.MODEL__MEMBER :
				return isSetMembers();
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.MODEL__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.MODEL__URI :
				return URI_EDEFAULT == null
					? uri != null
					: !URI_EDEFAULT.equals(uri);
			case UMLPackage.MODEL__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.MODEL__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.MODEL__OWNED_STEREOTYPE :
				return !getOwnedStereotypes().isEmpty();
			case UMLPackage.MODEL__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.MODEL__PACKAGE_MERGE :
				return packageMerges != null && !packageMerges.isEmpty();
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				return packagedElements != null && !packagedElements.isEmpty();
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				return profileApplications != null
					&& !profileApplications.isEmpty();
			case UMLPackage.MODEL__VIEWPOINT :
				return isSetViewpoint();
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
			case UMLPackage.MODEL___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.MODEL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.MODEL___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.MODEL___DESTROY :
				destroy();
				return null;
			case UMLPackage.MODEL___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.MODEL___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.MODEL___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.MODEL___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.MODEL___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.MODEL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.MODEL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___GET_MODEL :
				return getModel();
			case UMLPackage.MODEL___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.MODEL___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.MODEL___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.MODEL___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.MODEL___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.MODEL___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.MODEL___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.MODEL___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.MODEL___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.MODEL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.MODEL___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.MODEL___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.MODEL___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.MODEL___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.MODEL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.MODEL___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.MODEL___GET_LABEL :
				return getLabel();
			case UMLPackage.MODEL___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.MODEL___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.MODEL___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.MODEL___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.MODEL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.MODEL___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MODEL___SEPARATOR :
				return separator();
			case UMLPackage.MODEL___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.MODEL___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.MODEL___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.MODEL___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.MODEL___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.MODEL___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.MODEL___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.MODEL___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.MODEL___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.MODEL___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.MODEL___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.MODEL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.MODEL___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.MODEL___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.MODEL___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.MODEL___VALIDATE_ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP :
				return validateElementsPublicOrPrivate(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.MODEL___APPLY_PROFILE__PROFILE :
				return applyProfile((Profile) arguments.get(0));
			case UMLPackage.MODEL___CREATE_OWNED_CLASS__STRING_BOOLEAN :
				return createOwnedClass((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.MODEL___CREATE_OWNED_ENUMERATION__STRING :
				return createOwnedEnumeration((String) arguments.get(0));
			case UMLPackage.MODEL___CREATE_OWNED_INTERFACE__STRING :
				return createOwnedInterface((String) arguments.get(0));
			case UMLPackage.MODEL___CREATE_OWNED_PRIMITIVE_TYPE__STRING :
				return createOwnedPrimitiveType((String) arguments.get(0));
			case UMLPackage.MODEL___CREATE_OWNED_STEREOTYPE__STRING_BOOLEAN :
				return createOwnedStereotype((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.MODEL___GET_ALL_APPLIED_PROFILES :
				return getAllAppliedProfiles();
			case UMLPackage.MODEL___GET_ALL_PROFILE_APPLICATIONS :
				return getAllProfileApplications();
			case UMLPackage.MODEL___GET_APPLIED_PROFILE__STRING :
				return getAppliedProfile((String) arguments.get(0));
			case UMLPackage.MODEL___GET_APPLIED_PROFILE__STRING_BOOLEAN :
				return getAppliedProfile((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.MODEL___GET_APPLIED_PROFILES :
				return getAppliedProfiles();
			case UMLPackage.MODEL___GET_PROFILE_APPLICATION__PROFILE :
				return getProfileApplication((Profile) arguments.get(0));
			case UMLPackage.MODEL___GET_PROFILE_APPLICATION__PROFILE_BOOLEAN :
				return getProfileApplication((Profile) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.MODEL___IS_MODEL_LIBRARY :
				return isModelLibrary();
			case UMLPackage.MODEL___IS_PROFILE_APPLIED__PROFILE :
				return isProfileApplied((Profile) arguments.get(0));
			case UMLPackage.MODEL___UNAPPLY_PROFILE__PROFILE :
				return unapplyProfile((Profile) arguments.get(0));
			case UMLPackage.MODEL___APPLY_PROFILES__ELIST :
				return applyProfiles((EList<Profile>) arguments.get(0));
			case UMLPackage.MODEL___ALL_APPLICABLE_STEREOTYPES :
				return allApplicableStereotypes();
			case UMLPackage.MODEL___CONTAINING_PROFILE :
				return containingProfile();
			case UMLPackage.MODEL___MAKES_VISIBLE__NAMEDELEMENT :
				return makesVisible((NamedElement) arguments.get(0));
			case UMLPackage.MODEL___GET_NESTED_PACKAGES :
				return getNestedPackages();
			case UMLPackage.MODEL___GET_OWNED_STEREOTYPES :
				return getOwnedStereotypes();
			case UMLPackage.MODEL___GET_OWNED_TYPES :
				return getOwnedTypes();
			case UMLPackage.MODEL___VISIBLE_MEMBERS :
				return visibleMembers();
			case UMLPackage.MODEL___IS_METAMODEL :
				return isMetamodel();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (viewpoint: "); //$NON-NLS-1$
		if ((eFlags & VIEWPOINT_ESETFLAG) != 0)
			result.append(viewpoint);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //ModelImpl
