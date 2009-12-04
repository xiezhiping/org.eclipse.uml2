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
 * $Id: ExtensionImpl.java,v 1.30 2009/12/04 15:30:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.ExtensionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#isRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#getOwnedEnds <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl
		extends AssociationImpl
		implements Extension {

	/**
	 * The default value of the '{@link #isRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEndsGen() {
		if (ownedEnds == null) {
			ownedEnds = new EObjectContainmentWithInverseEList.Resolving<Property>(
				ExtensionEnd.class, this, UMLPackage.EXTENSION__OWNED_END,
				UMLPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
	}

	@Override
	public EList<Property> getOwnedEnds() {
		if (ownedEnds == null) {
			ownedEnds = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Property>(
				ExtensionEnd.class, this, UMLPackage.EXTENSION__OWNED_END,
				OWNED_END_ESUPERSETS, OWNED_END_ESUBSETS,
				UMLPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createOwnedEnd(String name, Type type) {
		ExtensionEnd newOwnedEnd = (ExtensionEnd) create(UMLPackage.Literals.EXTENSION_END);
		getOwnedEnds().add(newOwnedEnd);
		if (name != null)
			newOwnedEnd.setName(name);
		if (type != null)
			newOwnedEnd.setType(type);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getOwnedEnd(String name, Type type) {
		return getOwnedEnd(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		ownedEndLoop : for (Property ownedEnd : getOwnedEnds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedEnd.getName())
				: name.equals(ownedEnd.getName())))
				continue ownedEndLoop;
			if (type != null && !type.equals(ownedEnd.getType()))
				continue ownedEndLoop;
			return ownedEnd;
		}
		return createOnDemand
			? createOwnedEnd(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedEnds() {
		return ownedEnds != null && !ownedEnds.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return ExtensionOperations.isRequired(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getMetaclass() {
		org.eclipse.uml2.uml.Class metaclass = basicGetMetaclass();
		return metaclass != null && metaclass.eIsProxy()
			? (org.eclipse.uml2.uml.Class) eResolveProxy((InternalEObject) metaclass)
			: metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetMetaclass() {
		return ExtensionOperations.getMetaclass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonOwnedEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionOperations.validateNonOwnedEnd(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsBinary(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionOperations.validateIsBinary(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getStereotypeEnd() {
		return ExtensionOperations.getStereotypeEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getStereotype() {
		return ExtensionOperations.getStereotype(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property metaclassEnd() {
		return ExtensionOperations.metaclassEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXTENSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXTENSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXTENSION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXTENSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXTENSION__NAME :
				return getName();
			case UMLPackage.EXTENSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXTENSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXTENSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXTENSION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXTENSION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.EXTENSION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.EXTENSION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.EXTENSION__MEMBER :
				return getMembers();
			case UMLPackage.EXTENSION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.EXTENSION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.EXTENSION__IS_LEAF :
				return isLeaf();
			case UMLPackage.EXTENSION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXTENSION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.EXTENSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.EXTENSION__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.EXTENSION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.EXTENSION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.EXTENSION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.EXTENSION__FEATURE :
				return getFeatures();
			case UMLPackage.EXTENSION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.EXTENSION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.EXTENSION__GENERAL :
				return getGenerals();
			case UMLPackage.EXTENSION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.EXTENSION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.EXTENSION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.EXTENSION__USE_CASE :
				return getUseCases();
			case UMLPackage.EXTENSION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.EXTENSION__OWNED_END :
				return getOwnedEnds();
			case UMLPackage.EXTENSION__MEMBER_END :
				return getMemberEnds();
			case UMLPackage.EXTENSION__IS_DERIVED :
				return isDerived();
			case UMLPackage.EXTENSION__END_TYPE :
				return getEndTypes();
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				return getNavigableOwnedEnds();
			case UMLPackage.EXTENSION__IS_REQUIRED :
				return isRequired();
			case UMLPackage.EXTENSION__METACLASS :
				if (resolve)
					return getMetaclass();
				return basicGetMetaclass();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.EXTENSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTENSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTENSION__OWNER :
				return isSetOwner();
			case UMLPackage.EXTENSION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXTENSION__NAME :
				return isSetName();
			case UMLPackage.EXTENSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXTENSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTENSION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.EXTENSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTENSION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXTENSION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.EXTENSION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.EXTENSION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.EXTENSION__MEMBER :
				return isSetMembers();
			case UMLPackage.EXTENSION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.EXTENSION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.EXTENSION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXTENSION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXTENSION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.EXTENSION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.EXTENSION__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.EXTENSION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.EXTENSION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.EXTENSION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.EXTENSION__FEATURE :
				return isSetFeatures();
			case UMLPackage.EXTENSION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.EXTENSION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.EXTENSION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.EXTENSION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.EXTENSION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.EXTENSION__REPRESENTATION :
				return representation != null;
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.EXTENSION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.EXTENSION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.EXTENSION__OWNED_END :
				return isSetOwnedEnds();
			case UMLPackage.EXTENSION__MEMBER_END :
				return memberEnds != null && !memberEnds.isEmpty();
			case UMLPackage.EXTENSION__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.EXTENSION__END_TYPE :
				return !getEndTypes().isEmpty();
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				return navigableOwnedEnds != null
					&& !navigableOwnedEnds.isEmpty();
			case UMLPackage.EXTENSION__IS_REQUIRED :
				return isRequired() != IS_REQUIRED_EDEFAULT;
			case UMLPackage.EXTENSION__METACLASS :
				return basicGetMetaclass() != null;
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
			case UMLPackage.EXTENSION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTENSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXTENSION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXTENSION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXTENSION___GET_MODEL :
				return getModel();
			case UMLPackage.EXTENSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXTENSION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXTENSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXTENSION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXTENSION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0), (String) arguments
					.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXTENSION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTENSION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXTENSION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXTENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXTENSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXTENSION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXTENSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION___GET_LABEL :
				return getLabel();
			case UMLPackage.EXTENSION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.EXTENSION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.EXTENSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.EXTENSION___SEPARATOR :
				return separator();
			case UMLPackage.EXTENSION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.EXTENSION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport((PackageableElement) arguments
					.get(0), (VisibilityKind) arguments.get(1));
			case UMLPackage.EXTENSION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.EXTENSION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.EXTENSION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.EXTENSION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.EXTENSION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.EXTENSION___IMPORT_MEMBERS__ELIST :
				return importMembers((EList<PackageableElement>) arguments
					.get(0));
			case UMLPackage.EXTENSION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions((EList<PackageableElement>) arguments
					.get(0));
			case UMLPackage.EXTENSION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.EXTENSION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid((RedefinableElement) arguments
					.get(0));
			case UMLPackage.EXTENSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith((ParameterableElement) arguments.get(0));
			case UMLPackage.EXTENSION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.EXTENSION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1), (String) arguments
						.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6), (AggregationKind) arguments
						.get(7), (String) arguments.get(8), (Integer) arguments
						.get(9), (Integer) arguments.get(10));
			case UMLPackage.EXTENSION___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.EXTENSION___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.EXTENSION___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.EXTENSION___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.EXTENSION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_GENERALIZATION_HIERARCHIES__DIAGNOSTICCHAIN_MAP :
				return validateGeneralizationHierarchies(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.EXTENSION___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.EXTENSION___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.EXTENSION___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1), (EList<Type>) arguments
						.get(2));
			case UMLPackage.EXTENSION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1), (EList<Type>) arguments
						.get(2), (Boolean) arguments.get(3));
			case UMLPackage.EXTENSION___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.EXTENSION___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.EXTENSION___GET_GENERALS :
				return getGenerals();
			case UMLPackage.EXTENSION___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.EXTENSION___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.EXTENSION___PARENTS :
				return parents();
			case UMLPackage.EXTENSION___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.EXTENSION___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION___CONFORMS_TO__CLASSIFIER :
				return conformsTo((Classifier) arguments.get(0));
			case UMLPackage.EXTENSION___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.EXTENSION___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.EXTENSION___ALL_PARENTS :
				return allParents();
			case UMLPackage.EXTENSION___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP :
				return validateSpecializedEndNumber((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP :
				return validateSpecializedEndTypes((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP :
				return validateBinaryAssociations((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP :
				return validateAssociationEnds((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___IS_BINARY :
				return isBinary();
			case UMLPackage.EXTENSION___GET_END_TYPES :
				return getEndTypes();
			case UMLPackage.EXTENSION___VALIDATE_NON_OWNED_END__DIAGNOSTICCHAIN_MAP :
				return validateNonOwnedEnd((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___VALIDATE_IS_BINARY__DIAGNOSTICCHAIN_MAP :
				return validateIsBinary((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION___GET_STEREOTYPE_END :
				return getStereotypeEnd();
			case UMLPackage.EXTENSION___GET_STEREOTYPE :
				return getStereotype();
			case UMLPackage.EXTENSION___METACLASS_END :
				return metaclassEnd();
			case UMLPackage.EXTENSION___GET_METACLASS :
				return getMetaclass();
			case UMLPackage.EXTENSION___IS_REQUIRED :
				return isRequired();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ExtensionImpl
