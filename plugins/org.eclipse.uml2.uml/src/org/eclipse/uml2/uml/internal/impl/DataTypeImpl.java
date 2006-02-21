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
 * $Id: DataTypeImpl.java,v 1.16 2006/02/21 21:39:47 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DataTypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DataTypeImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DataTypeImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DataTypeImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DataTypeImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DataTypeImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl
		extends ClassifierImpl
		implements DataType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) eVirtualGet(UMLPackage.DATA_TYPE__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UMLPackage.DATA_TYPE__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(Property.class, this,
					UMLPackage.DATA_TYPE__ATTRIBUTE,
					new int[]{UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.DATA_TYPE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.DATA_TYPE__OWNED_MEMBER, new int[]{
						UMLPackage.DATA_TYPE__OWNED_RULE,
						UMLPackage.DATA_TYPE__OWNED_USE_CASE,
						UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE,
						UMLPackage.DATA_TYPE__OWNED_OPERATION}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) eVirtualGet(UMLPackage.DATA_TYPE__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.DATA_TYPE__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.DATA_TYPE__FEATURE, new int[]{
						UMLPackage.DATA_TYPE__ATTRIBUTE,
						UMLPackage.DATA_TYPE__OWNED_OPERATION}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(
				UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentWithInverseEList.Resolving(
					Property.class, this,
					UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE,
					UMLPackage.PROPERTY__DATATYPE));
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute() {
		Property newOwnedAttribute = UMLFactory.eINSTANCE.createProperty();
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name) {
		for (Iterator i = getOwnedAttributes().iterator(); i.hasNext();) {
			Property ownedAttribute = (Property) i.next();
			if (name.equals(ownedAttribute.getName())) {
				return ownedAttribute;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		EList ownedOperation = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(
				UMLPackage.DATA_TYPE__OWNED_OPERATION,
				ownedOperation = new EObjectContainmentWithInverseEList.Resolving(
					Operation.class, this,
					UMLPackage.DATA_TYPE__OWNED_OPERATION,
					UMLPackage.OPERATION__DATATYPE));
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation() {
		Operation newOwnedOperation = UMLFactory.eINSTANCE.createOperation();
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name) {
		for (Iterator i = getOwnedOperations().iterator(); i.hasNext();) {
			Operation ownedOperation = (Operation) i.next();
			if (name.equals(ownedOperation.getName())) {
				return ownedOperation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, Type returnType,
			EList parameterNames, EList parameterTypes) {
		return DataTypeOperations.createOwnedOperation(this, name, returnType,
			parameterNames, parameterTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower,
			int upper) {
		return DataTypeOperations.createOwnedAttribute(this, name, type, lower,
			upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList inherit(EList inhs) {
		return DataTypeOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DATA_TYPE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
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
			case UMLPackage.DATA_TYPE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
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
			case UMLPackage.DATA_TYPE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DATA_TYPE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DATA_TYPE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DATA_TYPE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DATA_TYPE__NAME :
				return getName();
			case UMLPackage.DATA_TYPE__VISIBILITY :
				return getVisibility();
			case UMLPackage.DATA_TYPE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DATA_TYPE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DATA_TYPE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.DATA_TYPE__MEMBER :
				return getMembers();
			case UMLPackage.DATA_TYPE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.DATA_TYPE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.DATA_TYPE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DATA_TYPE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DATA_TYPE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DATA_TYPE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.DATA_TYPE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.DATA_TYPE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.DATA_TYPE__FEATURE :
				return getFeatures();
			case UMLPackage.DATA_TYPE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.DATA_TYPE__GENERAL :
				return getGenerals();
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.DATA_TYPE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.DATA_TYPE__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.DATA_TYPE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.DATA_TYPE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.DATA_TYPE__USE_CASE :
				return getUseCases();
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				return getOwnedOperations();
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
			case UMLPackage.DATA_TYPE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DATA_TYPE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DATA_TYPE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.DATA_TYPE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.DATA_TYPE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
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
			case UMLPackage.DATA_TYPE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DATA_TYPE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DATA_TYPE__NAME :
				unsetName();
				return;
			case UMLPackage.DATA_TYPE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DATA_TYPE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.DATA_TYPE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DATA_TYPE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.DATA_TYPE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.DATA_TYPE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.DATA_TYPE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.DATA_TYPE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.DATA_TYPE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.DATA_TYPE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.DATA_TYPE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
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
			case UMLPackage.DATA_TYPE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DATA_TYPE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DATA_TYPE__OWNER :
				return isSetOwner();
			case UMLPackage.DATA_TYPE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DATA_TYPE__NAME :
				return isSetName();
			case UMLPackage.DATA_TYPE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DATA_TYPE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.DATA_TYPE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DATA_TYPE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DATA_TYPE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DATA_TYPE__NAME_EXPRESSION) != null;
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.DATA_TYPE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.DATA_TYPE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.DATA_TYPE__MEMBER :
				return isSetMembers();
			case UMLPackage.DATA_TYPE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.DATA_TYPE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DATA_TYPE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DATA_TYPE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DATA_TYPE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.DATA_TYPE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.DATA_TYPE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.DATA_TYPE__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.DATA_TYPE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.DATA_TYPE__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.DATA_TYPE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.DATA_TYPE__FEATURE :
				return isSetFeatures();
			case UMLPackage.DATA_TYPE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.DATA_TYPE__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.DATA_TYPE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.DATA_TYPE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.DATA_TYPE__REPRESENTATION :
				return eVirtualGet(UMLPackage.DATA_TYPE__REPRESENTATION) != null;
			case UMLPackage.DATA_TYPE__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.DATA_TYPE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.DATA_TYPE__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.DATA_TYPE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				EList ownedAttribute = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.DATA_TYPE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE)
			|| eIsSet(UMLPackage.DATA_TYPE__OWNED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.DATA_TYPE__OWNED_OPERATION);
	}

} //DataTypeImpl
