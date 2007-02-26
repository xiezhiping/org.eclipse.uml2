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
 * $Id: SignalImpl.java,v 1.28 2007/02/26 16:17:58 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.SignalOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SignalImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SignalImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SignalImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl
		extends ClassifierImpl
		implements Signal {

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getAttributes() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Property> attributes = (EList<Property>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE,
					attributes = new DerivedUnionEObjectEList<Property>(
						Property.class, this, UMLPackage.SIGNAL__ATTRIBUTE,
						ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList<Property>(Property.class, this,
			UMLPackage.SIGNAL__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
						ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
							NamedElement.class, this,
							UMLPackage.SIGNAL__OWNED_MEMBER,
							OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.SIGNAL__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving<Property>(
				Property.class, this, UMLPackage.SIGNAL__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) create(eClass);
		getOwnedAttributes().add(newOwnedAttribute);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type) {
		return createOwnedAttribute(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type) {
		return getOwnedAttribute(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		ownedAttributeLoop : for (Property ownedAttribute : getOwnedAttributes()) {
			if (eClass != null && !eClass.isInstance(ownedAttribute))
				continue ownedAttributeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedAttribute.getName())
				: name.equals(ownedAttribute.getName())))
				continue ownedAttributeLoop;
			if (type != null && !type.equals(ownedAttribute.getType()))
				continue ownedAttributeLoop;
			return ownedAttribute;
		}
		return createOnDemand && eClass != null
			? createOwnedAttribute(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower,
			int upper) {
		return SignalOperations.createOwnedAttribute(this, name, type, lower,
			upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.SIGNAL__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SIGNAL__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.SIGNAL__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.SIGNAL__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.SIGNAL__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.SIGNAL__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SIGNAL__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SIGNAL__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.SIGNAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SIGNAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SIGNAL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SIGNAL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SIGNAL__NAME :
				return getName();
			case UMLPackage.SIGNAL__VISIBILITY :
				return getVisibility();
			case UMLPackage.SIGNAL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SIGNAL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SIGNAL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SIGNAL__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.SIGNAL__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.SIGNAL__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.SIGNAL__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.SIGNAL__MEMBER :
				return getMembers();
			case UMLPackage.SIGNAL__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.SIGNAL__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.SIGNAL__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SIGNAL__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.SIGNAL__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.SIGNAL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.SIGNAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.SIGNAL__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.SIGNAL__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.SIGNAL__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.SIGNAL__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SIGNAL__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.SIGNAL__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.SIGNAL__FEATURE :
				return getFeatures();
			case UMLPackage.SIGNAL__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.SIGNAL__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.SIGNAL__GENERAL :
				return getGenerals();
			case UMLPackage.SIGNAL__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.SIGNAL__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.SIGNAL__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.SIGNAL__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.SIGNAL__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.SIGNAL__USE_CASE :
				return getUseCases();
			case UMLPackage.SIGNAL__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
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
			case UMLPackage.SIGNAL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.SIGNAL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.SIGNAL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SIGNAL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SIGNAL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.SIGNAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SIGNAL__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.SIGNAL__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.SIGNAL__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.SIGNAL__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.SIGNAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SIGNAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SIGNAL__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.SIGNAL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll(
					(Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.SIGNAL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.SIGNAL__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.SIGNAL__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll(
					(Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.SIGNAL__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll(
					(Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.SIGNAL__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.SIGNAL__GENERAL :
				getGenerals().clear();
				getGenerals().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.SIGNAL__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll(
					(Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.SIGNAL__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.SIGNAL__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll(
					(Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.SIGNAL__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll(
					(Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.SIGNAL__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.SIGNAL__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll(
					(Collection<? extends Property>) newValue);
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
			case UMLPackage.SIGNAL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SIGNAL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SIGNAL__NAME :
				unsetName();
				return;
			case UMLPackage.SIGNAL__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.SIGNAL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SIGNAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SIGNAL__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.SIGNAL__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.SIGNAL__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.SIGNAL__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.SIGNAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SIGNAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SIGNAL__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.SIGNAL__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.SIGNAL__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.SIGNAL__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.SIGNAL__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.SIGNAL__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.SIGNAL__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.SIGNAL__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.SIGNAL__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.SIGNAL__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.SIGNAL__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.SIGNAL__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.SIGNAL__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.SIGNAL__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
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
			case UMLPackage.SIGNAL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SIGNAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SIGNAL__OWNER :
				return isSetOwner();
			case UMLPackage.SIGNAL__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.SIGNAL__NAME :
				return isSetName();
			case UMLPackage.SIGNAL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SIGNAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SIGNAL__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.SIGNAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SIGNAL__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.SIGNAL__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.SIGNAL__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.SIGNAL__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.SIGNAL__MEMBER :
				return isSetMembers();
			case UMLPackage.SIGNAL__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.SIGNAL__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.SIGNAL__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.SIGNAL__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.SIGNAL__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.SIGNAL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.SIGNAL__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.SIGNAL__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.SIGNAL__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.SIGNAL__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.SIGNAL__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.SIGNAL__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.SIGNAL__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.SIGNAL__FEATURE :
				return isSetFeatures();
			case UMLPackage.SIGNAL__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.SIGNAL__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.SIGNAL__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.SIGNAL__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.SIGNAL__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.SIGNAL__REPRESENTATION :
				return representation != null;
			case UMLPackage.SIGNAL__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.SIGNAL__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.SIGNAL__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.SIGNAL__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[]{UMLPackage.SIGNAL__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.SIGNAL__OWNED_ATTRIBUTE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.SIGNAL__OWNED_RULE, UMLPackage.SIGNAL__OWNED_USE_CASE,
		UMLPackage.SIGNAL__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.SIGNAL__OWNED_ATTRIBUTE);
	}

} //SignalImpl
