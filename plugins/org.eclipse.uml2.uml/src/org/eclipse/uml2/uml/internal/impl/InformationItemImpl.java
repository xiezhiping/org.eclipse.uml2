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
 * $Id: InformationItemImpl.java,v 1.3 2005/11/23 13:27:42 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.InformationItem;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InformationItemOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationItemImpl#getRepresenteds <em>Represented</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationItemImpl
		extends ClassifierImpl
		implements InformationItem {

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
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getInformationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRepresenteds() {
		List represented = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__REPRESENTED);
		if (represented == null) {
			eVirtualSet(UMLPackage.INFORMATION_ITEM__REPRESENTED,
				represented = new EObjectResolvingEList(Classifier.class, this,
					UMLPackage.INFORMATION_ITEM__REPRESENTED));
		}
		return represented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRepresented(String name) {
		for (Iterator i = getRepresenteds().iterator(); i.hasNext();) {
			Classifier represented = (Classifier) i.next();
			if (name.equals(represented.getName())) {
				return represented;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcesAndTargets(DiagnosticChain diagnostics,
			Map context) {
		return InformationItemOperations.validateSourcesAndTargets(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasNo(DiagnosticChain diagnostics, Map context) {
		return InformationItemOperations.validateHasNo(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotInstantiable(DiagnosticChain diagnostics,
			Map context) {
		return InformationItemOperations.validateNotInstantiable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INFORMATION_ITEM__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INFORMATION_ITEM__OWNER :
				return getOwner();
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INFORMATION_ITEM__NAME :
				return getName();
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				return getVisibility();
			case UMLPackage.INFORMATION_ITEM__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INFORMATION_ITEM__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.INFORMATION_ITEM__MEMBER :
				return getMembers();
			case UMLPackage.INFORMATION_ITEM__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.INFORMATION_ITEM__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.INFORMATION_ITEM__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				return getPackage();
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.INFORMATION_ITEM__FEATURE :
				return getFeatures();
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				return getGenerals();
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				return getUseCases();
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INFORMATION_ITEM__OWNED_SIGNATURE :
				return getOwnedSignature();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				getRepresenteds().clear();
				getRepresenteds().addAll((Collection) newValue);
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
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.INFORMATION_ITEM__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INFORMATION_ITEM__OWNER :
				return isSetOwner();
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INFORMATION_ITEM__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.INFORMATION_ITEM__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INFORMATION_ITEM__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INFORMATION_ITEM__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION) != null;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.INFORMATION_ITEM__MEMBER :
				return isSetMembers();
			case UMLPackage.INFORMATION_ITEM__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.INFORMATION_ITEM__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				return getPackage() != null;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.INFORMATION_ITEM__FEATURE :
				return isSetFeatures();
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				return eVirtualGet(UMLPackage.INFORMATION_ITEM__REPRESENTATION) != null;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.INFORMATION_ITEM__OWNED_SIGNATURE) != null;
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				List represented = (List) eVirtualGet(UMLPackage.INFORMATION_ITEM__REPRESENTED);
				return represented != null && !represented.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //InformationItemImpl
