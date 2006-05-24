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
 * $Id: CollaborationImpl.java,v 1.25 2006/05/24 20:54:28 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StructuredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getCollaborationRoles <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl
		extends BehavioredClassifierImpl
		implements Collaboration {

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList ownedAttributes = null;

	/**
	 * The cached value of the '{@link #getOwnedConnectors() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList ownedConnectors = null;

	/**
	 * The cached value of the '{@link #getCollaborationRoles() <em>Collaboration Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList collaborationRoles = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList roles = (EList) cache.get(eResource, this,
				UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
			if (roles == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE,
					roles = new DerivedUnionEObjectEList(
						ConnectableElement.class, this,
						UMLPackage.COLLABORATION__ROLE, ROLE_ESUBSETS));
			}
			return roles;
		}
		return new DerivedUnionEObjectEList(ConnectableElement.class, this,
			UMLPackage.COLLABORATION__ROLE, ROLE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole(String name, Type type) {
		return getRole(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole(String name, Type type,
			boolean ignoreCase, EClass eClass) {
		roleLoop : for (Iterator i = getRoles().iterator(); i.hasNext();) {
			ConnectableElement role = (ConnectableElement) i.next();
			if (eClass != null && !eClass.isInstance(role))
				continue roleLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(role.getName())
				: name.equals(role.getName())))
				continue roleLoop;
			if (type != null && !type.equals(role.getType()))
				continue roleLoop;
			return role;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedMembers = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList(
						NamedElement.class, this,
						UMLPackage.COLLABORATION__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.COLLABORATION__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList attributes = (EList) cache.get(eResource, this,
				UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE,
					attributes = new DerivedUnionEObjectEList(Property.class,
						this, UMLPackage.COLLABORATION__ATTRIBUTE,
						ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList(Property.class, this,
			UMLPackage.COLLABORATION__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList members = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache
					.put(eResource, this,
						UMLPackage.Literals.NAMESPACE__MEMBER,
						members = new DerivedUnionEObjectEList(
							NamedElement.class, this,
							UMLPackage.COLLABORATION__MEMBER, MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.COLLABORATION__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList features = (EList) cache.get(eResource, this,
				UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__FEATURE,
					features = new DerivedUnionEObjectEList(Feature.class,
						this, UMLPackage.COLLABORATION__FEATURE,
						FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this,
			UMLPackage.COLLABORATION__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving(
				Property.class, this, UMLPackage.COLLABORATION__OWNED_ATTRIBUTE);
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
		ownedAttributeLoop : for (Iterator i = getOwnedAttributes().iterator(); i
			.hasNext();) {
			Property ownedAttribute = (Property) i.next();
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
	 * The array of superset feature identifiers for the '{@link #getParts() <em>Part</em>}' reference list.
	 * @see #getParts()
	 */
	protected static final int[] PART_ESUPERSETS = new int[]{UMLPackage.COLLABORATION__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getParts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList parts = (EList) cache.get(eResource, this,
				UMLPackage.Literals.STRUCTURED_CLASSIFIER__PART);
			if (parts == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__PART,
					parts = new StructuredClassifierImpl.PartEList(
						Property.class, this, UMLPackage.COLLABORATION__PART,
						PART_ESUPERSETS));
			}
			return parts;
		}
		return new StructuredClassifierImpl.PartEList(Property.class, this,
			UMLPackage.COLLABORATION__PART, PART_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPart(String name, Type type) {
		return getPart(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPart(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		partLoop : for (Iterator i = getParts().iterator(); i.hasNext();) {
			Property part = (Property) i.next();
			if (eClass != null && !eClass.isInstance(part))
				continue partLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(part.getName())
				: name.equals(part.getName())))
				continue partLoop;
			if (type != null && !type.equals(part.getType()))
				continue partLoop;
			return part;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedConnectors() {
		if (ownedConnectors == null) {
			ownedConnectors = new EObjectContainmentEList.Resolving(
				Connector.class, this,
				UMLPackage.COLLABORATION__OWNED_CONNECTOR);
		}
		return ownedConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createOwnedConnector(String name) {
		Connector newOwnedConnector = (Connector) create(UMLPackage.Literals.CONNECTOR);
		getOwnedConnectors().add(newOwnedConnector);
		if (name != null)
			newOwnedConnector.setName(name);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getOwnedConnector(String name) {
		return getOwnedConnector(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getOwnedConnector(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedConnectorLoop : for (Iterator i = getOwnedConnectors().iterator(); i
			.hasNext();) {
			Connector ownedConnector = (Connector) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedConnector.getName())
				: name.equals(ownedConnector.getName())))
				continue ownedConnectorLoop;
			return ownedConnector;
		}
		return createOnDemand
			? createOwnedConnector(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCollaborationRoles() {
		if (collaborationRoles == null) {
			collaborationRoles = new EObjectResolvingEList(
				ConnectableElement.class, this,
				UMLPackage.COLLABORATION__COLLABORATION_ROLE);
		}
		return collaborationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getCollaborationRole(String name, Type type) {
		return getCollaborationRole(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getCollaborationRole(String name, Type type,
			boolean ignoreCase, EClass eClass) {
		collaborationRoleLoop : for (Iterator i = getCollaborationRoles()
			.iterator(); i.hasNext();) {
			ConnectableElement collaborationRole = (ConnectableElement) i
				.next();
			if (eClass != null && !eClass.isInstance(collaborationRole))
				continue collaborationRoleLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(collaborationRole.getName())
				: name.equals(collaborationRole.getName())))
				continue collaborationRoleLoop;
			if (type != null && !type.equals(collaborationRole.getType()))
				continue collaborationRoleLoop;
			return collaborationRole;
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
	public Property createOwnedAttribute(String name, Type type, int lower,
			int upper) {
		return StructuredClassifierOperations.createOwnedAttribute(this, name,
			type, lower, upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COLLABORATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COLLABORATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COLLABORATION__NAME :
				return getName();
			case UMLPackage.COLLABORATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.COLLABORATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COLLABORATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.COLLABORATION__MEMBER :
				return getMembers();
			case UMLPackage.COLLABORATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.COLLABORATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.COLLABORATION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.COLLABORATION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.COLLABORATION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.COLLABORATION__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.COLLABORATION__FEATURE :
				return getFeatures();
			case UMLPackage.COLLABORATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.COLLABORATION__GENERAL :
				return getGenerals();
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.COLLABORATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.COLLABORATION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.COLLABORATION__USE_CASE :
				return getUseCases();
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.COLLABORATION__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.COLLABORATION__PART :
				return getParts();
			case UMLPackage.COLLABORATION__ROLE :
				return getRoles();
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.COLLABORATION__COLLABORATION_ROLE :
				return getCollaborationRoles();
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COLLABORATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COLLABORATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION__COLLABORATION_ROLE :
				getCollaborationRoles().clear();
				getCollaborationRoles().addAll((Collection) newValue);
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COLLABORATION__NAME :
				unsetName();
				return;
			case UMLPackage.COLLABORATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.COLLABORATION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COLLABORATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.COLLABORATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.COLLABORATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.COLLABORATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.COLLABORATION__COLLABORATION_ROLE :
				getCollaborationRoles().clear();
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COLLABORATION__OWNER :
				return isSetOwner();
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COLLABORATION__NAME :
				return isSetName();
			case UMLPackage.COLLABORATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COLLABORATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.COLLABORATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.COLLABORATION__MEMBER :
				return isSetMembers();
			case UMLPackage.COLLABORATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.COLLABORATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.COLLABORATION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.COLLABORATION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.COLLABORATION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.COLLABORATION__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.COLLABORATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.COLLABORATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.COLLABORATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.COLLABORATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.COLLABORATION__REPRESENTATION :
				return representation != null;
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.COLLABORATION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_TRIGGER :
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.COLLABORATION__PART :
				return !getParts().isEmpty();
			case UMLPackage.COLLABORATION__ROLE :
				return isSetRoles();
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.COLLABORATION__COLLABORATION_ROLE :
				return collaborationRoles != null
					&& !collaborationRoles.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
					return UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case UMLPackage.COLLABORATION__PART :
					return UMLPackage.STRUCTURED_CLASSIFIER__PART;
				case UMLPackage.COLLABORATION__ROLE :
					return UMLPackage.STRUCTURED_CLASSIFIER__ROLE;
				case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
					return UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
					return UMLPackage.COLLABORATION__OWNED_ATTRIBUTE;
				case UMLPackage.STRUCTURED_CLASSIFIER__PART :
					return UMLPackage.COLLABORATION__PART;
				case UMLPackage.STRUCTURED_CLASSIFIER__ROLE :
					return UMLPackage.COLLABORATION__ROLE;
				case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
					return UMLPackage.COLLABORATION__OWNED_CONNECTOR;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRoles() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ROLE_ESUBSETS = new int[]{
		UMLPackage.COLLABORATION__OWNED_ATTRIBUTE,
		UMLPackage.COLLABORATION__COLLABORATION_ROLE};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.COLLABORATION__OWNED_RULE,
		UMLPackage.COLLABORATION__OWNED_USE_CASE,
		UMLPackage.COLLABORATION__OWNED_BEHAVIOR,
		UMLPackage.COLLABORATION__OWNED_TRIGGER,
		UMLPackage.COLLABORATION__OWNED_ATTRIBUTE,
		UMLPackage.COLLABORATION__OWNED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return eIsSet(UMLPackage.COLLABORATION__OWNED_ATTRIBUTE)
			|| eIsSet(UMLPackage.COLLABORATION__COLLABORATION_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.COLLABORATION__OWNED_ATTRIBUTE)
			|| eIsSet(UMLPackage.COLLABORATION__OWNED_CONNECTOR);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[]{UMLPackage.COLLABORATION__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.COLLABORATION__OWNED_ATTRIBUTE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.COLLABORATION__IMPORTED_MEMBER,
		UMLPackage.COLLABORATION__OWNED_MEMBER,
		UMLPackage.COLLABORATION__FEATURE,
		UMLPackage.COLLABORATION__INHERITED_MEMBER,
		UMLPackage.COLLABORATION__ROLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers() || isSetRoles();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[]{
		UMLPackage.COLLABORATION__ATTRIBUTE,
		UMLPackage.COLLABORATION__OWNED_CONNECTOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.COLLABORATION__OWNED_CONNECTOR);
	}

} //CollaborationImpl
