/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InformationItemImpl.java,v 1.18 2007/02/26 16:17:58 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InformationItem;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
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
			case UMLPackage.INFORMATION_ITEM__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INFORMATION_ITEM__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
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
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				return getUseCases();
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
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
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
				getTemplateBindings().addAll(
					(Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll(
					(Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll(
					(Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				getGenerals().clear();
				getGenerals().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll(
					(Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll(
					(Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll(
					(Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				getRepresenteds().clear();
				getRepresenteds().addAll(
					(Collection<? extends Classifier>) newValue);
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
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				unsetVisibility();
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
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				getGenerals().clear();
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
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				getUseCases().clear();
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
			case UMLPackage.INFORMATION_ITEM__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INFORMATION_ITEM__OWNER :
				return isSetOwner();
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INFORMATION_ITEM__NAME :
				return isSetName();
			case UMLPackage.INFORMATION_ITEM__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INFORMATION_ITEM__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INFORMATION_ITEM__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.INFORMATION_ITEM__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
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
			case UMLPackage.INFORMATION_ITEM__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.INFORMATION_ITEM__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.INFORMATION_ITEM__FEATURE :
				return isSetFeatures();
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.INFORMATION_ITEM__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				return representation != null;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.INFORMATION_ITEM__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.INFORMATION_ITEM__REPRESENTED :
				return representeds != null && !representeds.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //InformationItemImpl
