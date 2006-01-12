/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StereotypeImpl.java,v 1.14 2006/01/12 16:55:47 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StereotypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StereotypeImpl#getIcons <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StereotypeImpl
		extends ClassImpl
		implements Stereotype {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIcons() {
		EList icon = (EList) eVirtualGet(UMLPackage.STEREOTYPE__ICON);
		if (icon == null) {
			eVirtualSet(UMLPackage.STEREOTYPE__ICON,
				icon = new EObjectContainmentEList.Resolving(Image.class, this,
					UMLPackage.STEREOTYPE__ICON));
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createIcon() {
		Image newIcon = UMLFactory.eINSTANCE.createImage();
		getIcons().add(newIcon);
		return newIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameNotClash(DiagnosticChain diagnostics, Map context) {
		return StereotypeOperations.validateNameNotClash(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralize(DiagnosticChain diagnostics, Map context) {
		return StereotypeOperations.validateGeneralize(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension(org.eclipse.uml2.uml.Class metaclass,
			boolean isRequired) {
		return StereotypeOperations
			.createExtension(this, metaclass, isRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile() {
		return StereotypeOperations.getProfile(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return StereotypeOperations.getKeyword(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword(boolean isLocalized) {
		return StereotypeOperations.getKeyword(this, isLocalized);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtendedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.STEREOTYPE.getEOperations().get(6));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.STEREOTYPE.getEOperations()
					.get(6), result = StereotypeOperations
					.getExtendedMetaclasses(this));
			}
			return result;
		}
		return StereotypeOperations.getExtendedMetaclasses(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllExtendedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.STEREOTYPE.getEOperations().get(7));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.STEREOTYPE.getEOperations()
					.get(7), result = StereotypeOperations
					.getAllExtendedMetaclasses(this));
			}
			return result;
		}
		return StereotypeOperations.getAllExtendedMetaclasses(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.STEREOTYPE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STEREOTYPE__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STEREOTYPE__ICON :
				return ((InternalEList) getIcons()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STEREOTYPE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STEREOTYPE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STEREOTYPE__NAME :
				return getName();
			case UMLPackage.STEREOTYPE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STEREOTYPE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STEREOTYPE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STEREOTYPE__MEMBER :
				return getMembers();
			case UMLPackage.STEREOTYPE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STEREOTYPE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STEREOTYPE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STEREOTYPE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STEREOTYPE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.STEREOTYPE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.STEREOTYPE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.STEREOTYPE__FEATURE :
				return getFeatures();
			case UMLPackage.STEREOTYPE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.STEREOTYPE__GENERAL :
				return getGenerals();
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.STEREOTYPE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.STEREOTYPE__USE_CASE :
				return getUseCases();
			case UMLPackage.STEREOTYPE__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.STEREOTYPE__PART :
				return getParts();
			case UMLPackage.STEREOTYPE__ROLE :
				return getRoles();
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				return getClassifierBehavior();
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.STEREOTYPE__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.STEREOTYPE__EXTENSION :
				return getExtensions();
			case UMLPackage.STEREOTYPE__ICON :
				return getIcons();
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STEREOTYPE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STEREOTYPE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STEREOTYPE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.STEREOTYPE__ICON :
				getIcons().clear();
				getIcons().addAll((Collection) newValue);
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STEREOTYPE__NAME :
				unsetName();
				return;
			case UMLPackage.STEREOTYPE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STEREOTYPE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STEREOTYPE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STEREOTYPE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.STEREOTYPE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.STEREOTYPE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.STEREOTYPE__ICON :
				getIcons().clear();
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.STEREOTYPE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STEREOTYPE__OWNER :
				return isSetOwner();
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STEREOTYPE__NAME :
				return isSetName();
			case UMLPackage.STEREOTYPE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STEREOTYPE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STEREOTYPE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STEREOTYPE__NAME_EXPRESSION) != null;
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.STEREOTYPE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.STEREOTYPE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.STEREOTYPE__MEMBER :
				return isSetMembers();
			case UMLPackage.STEREOTYPE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STEREOTYPE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STEREOTYPE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STEREOTYPE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.STEREOTYPE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.STEREOTYPE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.STEREOTYPE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.STEREOTYPE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.STEREOTYPE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.STEREOTYPE__FEATURE :
				return isSetFeatures();
			case UMLPackage.STEREOTYPE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.STEREOTYPE__GENERAL :
				return isSetGenerals();
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.STEREOTYPE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.STEREOTYPE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				return eVirtualGet(UMLPackage.STEREOTYPE__REPRESENTATION) != null;
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.STEREOTYPE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.STEREOTYPE__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.STEREOTYPE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.STEREOTYPE__OWNED_SIGNATURE) != null;
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.STEREOTYPE__PART :
				return !getParts().isEmpty();
			case UMLPackage.STEREOTYPE__ROLE :
				return isSetRoles();
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				EList ownedConnector = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				EList ownedBehavior = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				EList interfaceRealization = (EList) eVirtualGet(UMLPackage.STEREOTYPE__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_TRIGGER :
				EList ownedTrigger = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				EList nestedClassifier = (EList) eVirtualGet(UMLPackage.STEREOTYPE__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				EList ownedReception = (EList) eVirtualGet(UMLPackage.STEREOTYPE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.STEREOTYPE__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.STEREOTYPE__ICON :
				EList icon = (EList) eVirtualGet(UMLPackage.STEREOTYPE__ICON);
				return icon != null && !icon.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //StereotypeImpl
