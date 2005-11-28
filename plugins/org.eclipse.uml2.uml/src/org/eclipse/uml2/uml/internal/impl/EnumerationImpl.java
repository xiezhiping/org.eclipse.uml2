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
 * $Id: EnumerationImpl.java,v 1.5 2005/11/28 20:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationImpl#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl
		extends DataTypeImpl
		implements Enumeration {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.ENUMERATION__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.ENUMERATION__OWNED_MEMBER, new int[]{
						UMLPackage.ENUMERATION__OWNED_RULE,
						UMLPackage.ENUMERATION__OWNED_USE_CASE,
						UMLPackage.ENUMERATION__OWNED_ATTRIBUTE,
						UMLPackage.ENUMERATION__OWNED_OPERATION,
						UMLPackage.ENUMERATION__OWNED_LITERAL}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedLiterals() {
		List ownedLiteral = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_LITERAL);
		if (ownedLiteral == null) {
			eVirtualSet(UMLPackage.ENUMERATION__OWNED_LITERAL,
				ownedLiteral = new EObjectContainmentWithInverseEList(
					EnumerationLiteral.class, this,
					UMLPackage.ENUMERATION__OWNED_LITERAL,
					UMLPackage.ENUMERATION_LITERAL__ENUMERATION));
		}
		return ownedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createOwnedLiteral() {
		EnumerationLiteral newOwnedLiteral = UMLFactory.eINSTANCE
			.createEnumerationLiteral();
		getOwnedLiterals().add(newOwnedLiteral);
		return newOwnedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getOwnedLiteral(String name) {
		for (Iterator i = getOwnedLiterals().iterator(); i.hasNext();) {
			EnumerationLiteral ownedLiteral = (EnumerationLiteral) i.next();
			if (name.equals(ownedLiteral.getName())) {
				return ownedLiteral;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.ENUMERATION__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.ENUMERATION__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ENUMERATION__OWNED_SIGNATURE, null,
						msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return ((InternalEList) getOwnedLiterals()).basicAdd(otherEnd,
					msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return ((InternalEList) getOwnedLiterals()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ENUMERATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ENUMERATION__OWNER :
				return getOwner();
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ENUMERATION__NAME :
				return getName();
			case UMLPackage.ENUMERATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ENUMERATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ENUMERATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ENUMERATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ENUMERATION__MEMBER :
				return getMembers();
			case UMLPackage.ENUMERATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ENUMERATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ENUMERATION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ENUMERATION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ENUMERATION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ENUMERATION__PACKAGE :
				return getPackage();
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ENUMERATION__FEATURE :
				return getFeatures();
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ENUMERATION__GENERAL :
				return getGenerals();
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ENUMERATION__USE_CASE :
				return getUseCases();
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ENUMERATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ENUMERATION__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ENUMERATION__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				return getOwnedLiterals();
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ENUMERATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENUMERATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				getOwnedLiterals().clear();
				getOwnedLiterals().addAll((Collection) newValue);
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ENUMERATION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ENUMERATION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENUMERATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ENUMERATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ENUMERATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ENUMERATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				getOwnedLiterals().clear();
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
			case UMLPackage.ENUMERATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ENUMERATION__OWNER :
				return isSetOwner();
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ENUMERATION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.ENUMERATION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ENUMERATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ENUMERATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ENUMERATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ENUMERATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ENUMERATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ENUMERATION__NAME_EXPRESSION) != null;
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.ENUMERATION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.ENUMERATION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.ENUMERATION__MEMBER :
				return isSetMembers();
			case UMLPackage.ENUMERATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ENUMERATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ENUMERATION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ENUMERATION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ENUMERATION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ENUMERATION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ENUMERATION__PACKAGE :
				return getPackage() != null;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.ENUMERATION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.ENUMERATION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.ENUMERATION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.ENUMERATION__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.ENUMERATION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.ENUMERATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.ENUMERATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.ENUMERATION__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.ENUMERATION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.ENUMERATION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.ENUMERATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ENUMERATION__REPRESENTATION :
				return eVirtualGet(UMLPackage.ENUMERATION__REPRESENTATION) != null;
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.ENUMERATION__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.ENUMERATION__OWNED_SIGNATURE) != null;
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				List ownedLiteral = (List) eVirtualGet(UMLPackage.ENUMERATION__OWNED_LITERAL);
				return ownedLiteral != null && !ownedLiteral.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ENUMERATION__OWNED_LITERAL);
	}

} //EnumerationImpl
