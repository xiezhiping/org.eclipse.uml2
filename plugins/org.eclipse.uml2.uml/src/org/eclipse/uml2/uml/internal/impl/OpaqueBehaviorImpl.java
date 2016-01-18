/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueBehaviorImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueBehaviorImpl#getLanguages <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueBehaviorImpl
		extends BehaviorImpl
		implements OpaqueBehavior {

	/**
	 * The cached value of the '{@link #getBodies() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bodies;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> languages;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPAQUE_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBodies() {
		if (bodies == null) {
			bodies = new EDataTypeEList.Unsettable<String>(String.class, this,
				UMLPackage.OPAQUE_BEHAVIOR__BODY);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodies() {
		if (bodies != null)
			((InternalEList.Unsettable<?>) bodies).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodies() {
		return bodies != null && ((InternalEList.Unsettable<?>) bodies).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList.Unsettable<String>(
				String.class, this, UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguages() {
		if (languages != null)
			((InternalEList.Unsettable<?>) languages).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguages() {
		return languages != null
			&& ((InternalEList.Unsettable<?>) languages).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				return getName();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OPAQUE_BEHAVIOR__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OPAQUE_BEHAVIOR__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				return getVisibility();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__MEMBER :
				return getMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				return isLeaf();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.OPAQUE_BEHAVIOR__FEATURE :
				return getFeatures();
			case UMLPackage.OPAQUE_BEHAVIOR__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				return getGenerals();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.OPAQUE_BEHAVIOR__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				return getUseCases();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.OPAQUE_BEHAVIOR__PART :
				return getParts();
			case UMLPackage.OPAQUE_BEHAVIOR__ROLE :
				return getRoles();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.OPAQUE_BEHAVIOR__EXTENSION :
				return getExtensions();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				return isActive();
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				return isReentrant();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.OPAQUE_BEHAVIOR__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.OPAQUE_BEHAVIOR__PRECONDITION :
				return getPreconditions();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				setIsReentrant((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PRECONDITION :
				getPreconditions().clear();
				getPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				getBodies().clear();
				getBodies().addAll((Collection<? extends String>) newValue);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends String>) newValue);
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
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				unsetName();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				unsetBodies();
				return;
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				unsetLanguages();
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
			case UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNER :
				return isSetOwner();
			case UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME :
				return isSetName();
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.OPAQUE_BEHAVIOR__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPAQUE_BEHAVIOR__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__MEMBER :
				return isSetMembers();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.OPAQUE_BEHAVIOR__FEATURE :
				return isSetFeatures();
			case UMLPackage.OPAQUE_BEHAVIOR__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERAL :
				return isSetGenerals();
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				return representation != null;
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__PART :
				return !getParts().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__ROLE :
				return isSetRoles();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION :
				return specification != null;
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__POSTCONDITION :
				return postconditions != null && !postconditions.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__PRECONDITION :
				return preconditions != null && !preconditions.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				return redefinedBehaviors != null
					&& !redefinedBehaviors.isEmpty();
			case UMLPackage.OPAQUE_BEHAVIOR__BODY :
				return isSetBodies();
			case UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE :
				return isSetLanguages();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (body: "); //$NON-NLS-1$
		result.append(bodies);
		result.append(", language: "); //$NON-NLS-1$
		result.append(languages);
		result.append(')');
		return result.toString();
	}

} //OpaqueBehaviorImpl
