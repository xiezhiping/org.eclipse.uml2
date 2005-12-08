/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OpaqueBehaviorImpl.java,v 1.9 2005/12/08 14:56:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueBehaviorImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueBehaviorImpl#getLanguages <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueBehaviorImpl
		extends BehaviorImpl
		implements OpaqueBehavior {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPAQUE_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBodies() {
		List body = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__BODY);
		if (body == null) {
			eVirtualSet(UMLPackage.OPAQUE_BEHAVIOR__BODY,
				body = new EDataTypeUniqueEList.Unsettable(String.class, this,
					UMLPackage.OPAQUE_BEHAVIOR__BODY));
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodies() {
		((InternalEList.Unsettable) getBodies()).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodies() {
		List body = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__BODY);
		return body != null && ((InternalEList.Unsettable) body).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getLanguages() {
		List language = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE);
		if (language == null) {
			eVirtualSet(UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE,
				language = new EDataTypeUniqueEList(String.class, this,
					UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE));
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				return getName();
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.OPAQUE_BEHAVIOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OPAQUE_BEHAVIOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.OPAQUE_BEHAVIOR__MEMBER :
				return getMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.OPAQUE_BEHAVIOR__FEATURE :
				return getFeatures();
			case UMLPackage.OPAQUE_BEHAVIOR__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				return getGenerals();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				return getUseCases();
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.OPAQUE_BEHAVIOR__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__PART :
				return getParts();
			case UMLPackage.OPAQUE_BEHAVIOR__ROLE :
				return getRoles();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				return getClassifierBehavior();
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.OPAQUE_BEHAVIOR__EXTENSION :
				return getExtensions();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				return isReentrant()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				return getBodies();
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				return getLanguages();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				setIsReentrant(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				setContext((BehavioredClassifier) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				getBodies().clear();
				getBodies().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				getLanguages().clear();
				getLanguages().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				unsetIsActive();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				setContext((BehavioredClassifier) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				unsetBodies();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				getLanguages().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNER :
				return isSetOwner();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.OPAQUE_BEHAVIOR__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPAQUE_BEHAVIOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION) != null;
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__MEMBER :
				return isSetMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__FEATURE :
				return isSetFeatures();
			case UMLPackage.OPAQUE_BEHAVIOR__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				return isSetGenerals();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				return eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION) != null;
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_SIGNATURE) != null;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__PART :
				return !getParts().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__ROLE :
				return isSetRoles();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				return isSetIsActive();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				List redefinedBehavior = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null
					&& !redefinedBehavior.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				List ownedParameterSet = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				return eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION) != null;
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				return isSetBodies();
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				List language = (List) eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE);
				return language != null && !language.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (body: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__BODY));
		result.append(", language: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE));
		result.append(')');
		return result.toString();
	}

} //OpaqueBehaviorImpl
