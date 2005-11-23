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
 * $Id: EncapsulatedClassifierImpl.java,v 1.3 2005/11/23 13:27:42 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.SubsetEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentEList;

import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EncapsulatedClassifierImpl
		extends StructuredClassifierImpl
		implements EncapsulatedClassifier {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getEncapsulatedClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedAttributes() {
		List ownedAttribute = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE,
				ownedAttribute = new SupersetEObjectContainmentEList(
					Property.class, this,
					UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE,
					new int[]{UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT}));
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedPorts() {
		List ownedPort = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
		if (ownedPort == null) {
			eVirtualSet(
				UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
				ownedPort = new SubsetEObjectEList(
					Port.class,
					this,
					UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
					new int[]{UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE}));
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOwnedPort(String name) {
		for (Iterator i = getOwnedPorts().iterator(); i.hasNext();) {
			Port ownedPort = (Port) i.next();
			if (name.equals(ownedPort.getName())) {
				return ownedPort;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(
						null,
						UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
					return basicSetOwnedTemplateSignature(null, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
					return ((InternalEList) getOwnedAttributes()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
					return ((InternalEList) getOwnedConnectors()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNER :
				return getOwner();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				return getName();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				return getPackage();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PART :
				return getParts();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ROLE :
				return getRoles();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT :
				return getOwnedPorts();
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT :
				getOwnedPorts().clear();
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.ENCAPSULATED_CLASSIFIER__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION) != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				return getPackage() != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				return eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION) != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_SIGNATURE) != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PART :
				return !getParts().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ROLE :
				return isSetRoles();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //EncapsulatedClassifierImpl
