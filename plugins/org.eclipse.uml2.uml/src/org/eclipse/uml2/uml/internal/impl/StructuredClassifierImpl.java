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
 * $Id: StructuredClassifierImpl.java,v 1.8 2005/12/01 21:57:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StructuredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuredClassifierImpl
		extends ClassifierImpl
		implements StructuredClassifier {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRoles() {
		List role = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__ROLE);
		if (role == null) {
			eVirtualSet(
				UMLPackage.STRUCTURED_CLASSIFIER__ROLE,
				role = new DerivedUnionEObjectEList(
					ConnectableElement.class,
					this,
					UMLPackage.STRUCTURED_CLASSIFIER__ROLE,
					new int[]{UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE}));
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole(String name) {
		for (Iterator i = getRoles().iterator(); i.hasNext();) {
			ConnectableElement role = (ConnectableElement) i.next();
			if (name.equals(role.getName())) {
				return role;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER,
					new int[]{UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE,
						UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE,
						UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
						UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAttributes() {
		List attribute = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(
				UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE,
				attribute = new DerivedUnionEObjectEList(
					Property.class,
					this,
					UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE,
					new int[]{UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMembers() {
		List member = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__MEMBER);
		if (member == null) {
			eVirtualSet(UMLPackage.STRUCTURED_CLASSIFIER__MEMBER,
				member = new DerivedUnionEObjectEList(NamedElement.class, this,
					UMLPackage.STRUCTURED_CLASSIFIER__MEMBER, new int[]{
						UMLPackage.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER,
						UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER,
						UMLPackage.STRUCTURED_CLASSIFIER__FEATURE,
						UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER,
						UMLPackage.STRUCTURED_CLASSIFIER__ROLE}));
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFeatures() {
		List feature = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.STRUCTURED_CLASSIFIER__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.STRUCTURED_CLASSIFIER__FEATURE, new int[]{
						UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE,
						UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedAttributes() {
		List ownedAttribute = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				ownedAttribute = new EObjectContainmentEList(Property.class,
					this, UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE));
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

	protected static class PartEList
			extends DerivedEObjectEList {

		protected PartEList(Class dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		public List basicList() {
			return new PartEList(dataClass, owner, featureID, sourceFeatureIDs) {

				public ListIterator listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}

		protected boolean isIncluded(Object object) {
			return super.isIncluded(object)
				&& ((Property) object).isComposite();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List getParts() {
		List part = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__PART);
		if (part == null) {
			eVirtualSet(
				UMLPackage.STRUCTURED_CLASSIFIER__PART,
				part = new PartEList(
					Property.class,
					this,
					UMLPackage.STRUCTURED_CLASSIFIER__PART,
					new int[]{UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE}));
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPart(String name) {
		for (Iterator i = getParts().iterator(); i.hasNext();) {
			Property part = (Property) i.next();
			if (name.equals(part.getName())) {
				return part;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedConnectors() {
		List ownedConnector = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		if (ownedConnector == null) {
			eVirtualSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR,
				ownedConnector = new EObjectContainmentEList(Connector.class,
					this, UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR));
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createOwnedConnector() {
		Connector newOwnedConnector = UMLFactory.eINSTANCE.createConnector();
		getOwnedConnectors().add(newOwnedConnector);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getOwnedConnector(String name) {
		for (Iterator i = getOwnedConnectors().iterator(); i.hasNext();) {
			Connector ownedConnector = (Connector) i.next();
			if (name.equals(ownedConnector.getName())) {
				return ownedConnector;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicities(DiagnosticChain diagnostics,
			Map context) {
		return StructuredClassifierOperations.validateMultiplicities(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(
					null,
					UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER,
					msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				return getName();
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURED_CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STRUCTURED_CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.STRUCTURED_CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER__PART :
				return getParts();
			case UMLPackage.STRUCTURED_CLASSIFIER__ROLE :
				return getRoles();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				return getOwnedConnectors();
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.STRUCTURED_CLASSIFIER__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRUCTURED_CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION) != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				return eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION) != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_SIGNATURE) != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__PART :
				return !getParts().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__ROLE :
				return isSetRoles();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE)
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers() || isSetRoles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
	}

} //StructuredClassifierImpl
