/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehavioredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationImpl#getCollaborationRoles <em>Collaboration Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationImpl
		extends StructuredClassifierImpl
		implements Collaboration {

	/**
	 * The cached value of the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehaviors;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior;

	/**
	 * The cached value of the '{@link #getInterfaceRealizations() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> interfaceRealizations;

	/**
	 * The cached value of the '{@link #getCollaborationRoles() <em>Collaboration Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableElement> collaborationRoles;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.COLLABORATION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.COLLABORATION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.COLLABORATION__OWNED_COMMENT,
		UMLPackage.COLLABORATION__NAME_EXPRESSION,
		UMLPackage.COLLABORATION__ELEMENT_IMPORT,
		UMLPackage.COLLABORATION__PACKAGE_IMPORT,
		UMLPackage.COLLABORATION__OWNED_MEMBER,
		UMLPackage.COLLABORATION__TEMPLATE_BINDING,
		UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.COLLABORATION__COLLABORATION_USE,
		UMLPackage.COLLABORATION__GENERALIZATION,
		UMLPackage.COLLABORATION__SUBSTITUTION,
		UMLPackage.COLLABORATION__INTERFACE_REALIZATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectableElement> getRoles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ConnectableElement> roles = (EList<ConnectableElement>) cache
				.get(eResource, this,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
			if (roles == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE,
					roles = new DerivedUnionEObjectEList<ConnectableElement>(
						ConnectableElement.class, this,
						UMLPackage.COLLABORATION__ROLE, ROLE_ESUBSETS));
			}
			return roles;
		}
		return new DerivedUnionEObjectEList<ConnectableElement>(
			ConnectableElement.class, this, UMLPackage.COLLABORATION__ROLE,
			ROLE_ESUBSETS);
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
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.COLLABORATION__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.COLLABORATION__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getParts() <em>Part</em>}' reference list.
	 * @see #getParts()
	 */
	protected static final int[] PART_ESUPERSETS = new int[]{
		UMLPackage.COLLABORATION__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Property> getParts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Property> parts = (EList<Property>) cache.get(eResource, this,
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
	public EList<ConnectableElement> getCollaborationRoles() {
		if (collaborationRoles == null) {
			collaborationRoles = new EObjectResolvingEList<ConnectableElement>(
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
		collaborationRoleLoop : for (ConnectableElement collaborationRole : getCollaborationRoles()) {
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
	public boolean validateClassBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BehavioredClassifierOperations.validateClassBehavior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllImplementedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES,
					result = BehavioredClassifierOperations
						.getAllImplementedInterfaces(this));
			}
			return result;
		}
		return BehavioredClassifierOperations.getAllImplementedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES,
					result = BehavioredClassifierOperations
						.getImplementedInterfaces(this));
			}
			return result;
		}
		return BehavioredClassifierOperations.getImplementedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.COLLABORATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COLLABORATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COLLABORATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COLLABORATION__NAME :
				return getName();
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.COLLABORATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COLLABORATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COLLABORATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.COLLABORATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.COLLABORATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.COLLABORATION__MEMBER :
				return getMembers();
			case UMLPackage.COLLABORATION__IS_LEAF :
				return isLeaf();
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
			case UMLPackage.COLLABORATION__FEATURE :
				return getFeatures();
			case UMLPackage.COLLABORATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.COLLABORATION__GENERAL :
				return getGenerals();
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.COLLABORATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.COLLABORATION__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.COLLABORATION__USE_CASE :
				return getUseCases();
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.COLLABORATION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.COLLABORATION__PART :
				return getParts();
			case UMLPackage.COLLABORATION__ROLE :
				return getRoles();
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.COLLABORATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COLLABORATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.COLLABORATION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
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
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.COLLABORATION__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.COLLABORATION__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.COLLABORATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.COLLABORATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.COLLABORATION__COLLABORATION_ROLE :
				getCollaborationRoles().clear();
				getCollaborationRoles().addAll(
					(Collection<? extends ConnectableElement>) newValue);
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
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COLLABORATION__NAME :
				unsetName();
				return;
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COLLABORATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.COLLABORATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.COLLABORATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.COLLABORATION__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.COLLABORATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.COLLABORATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.COLLABORATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COLLABORATION__OWNER :
				return isSetOwner();
			case UMLPackage.COLLABORATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.COLLABORATION__NAME :
				return isSetName();
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.COLLABORATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COLLABORATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COLLABORATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COLLABORATION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.COLLABORATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.COLLABORATION__MEMBER :
				return isSetMembers();
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
			case UMLPackage.COLLABORATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.COLLABORATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.COLLABORATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.COLLABORATION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.COLLABORATION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.COLLABORATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.COLLABORATION__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.COLLABORATION__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.COLLABORATION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.COLLABORATION__REPRESENTATION :
				return representation != null;
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.COLLABORATION__PART :
				return !getParts().isEmpty();
			case UMLPackage.COLLABORATION__ROLE :
				return isSetRoles();
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
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
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
					return UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
					return UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
					return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
					return UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR;
				case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
					return UMLPackage.COLLABORATION__INTERFACE_REALIZATION;
				case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
					return UMLPackage.COLLABORATION__OWNED_BEHAVIOR;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.COLLABORATION___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES :
					return UMLPackage.COLLABORATION___GET_ALL_IMPLEMENTED_INTERFACES;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES :
					return UMLPackage.COLLABORATION___GET_IMPLEMENTED_INTERFACES;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.COLLABORATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.COLLABORATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.COLLABORATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.COLLABORATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.COLLABORATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.COLLABORATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.COLLABORATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.COLLABORATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COLLABORATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_MODEL :
				return getModel();
			case UMLPackage.COLLABORATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.COLLABORATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.COLLABORATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.COLLABORATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.COLLABORATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.COLLABORATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.COLLABORATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COLLABORATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.COLLABORATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COLLABORATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.COLLABORATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.COLLABORATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.COLLABORATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.COLLABORATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.COLLABORATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_LABEL :
				return getLabel();
			case UMLPackage.COLLABORATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.COLLABORATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.COLLABORATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.COLLABORATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.COLLABORATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COLLABORATION___SEPARATOR :
				return separator();
			case UMLPackage.COLLABORATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.COLLABORATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.COLLABORATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.COLLABORATION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.COLLABORATION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.COLLABORATION___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.COLLABORATION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.COLLABORATION___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.COLLABORATION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.COLLABORATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.COLLABORATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.COLLABORATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.COLLABORATION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.COLLABORATION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.COLLABORATION___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.COLLABORATION___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.COLLABORATION___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.COLLABORATION___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.COLLABORATION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.COLLABORATION___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.COLLABORATION___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.COLLABORATION___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.COLLABORATION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.COLLABORATION___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.COLLABORATION___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.COLLABORATION___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.COLLABORATION___ALL_PARENTS :
				return allParents();
			case UMLPackage.COLLABORATION___GET_GENERALS :
				return getGenerals();
			case UMLPackage.COLLABORATION___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.COLLABORATION___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.COLLABORATION___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.COLLABORATION___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.COLLABORATION___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.COLLABORATION___PARENTS :
				return parents();
			case UMLPackage.COLLABORATION___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.COLLABORATION___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.COLLABORATION___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.COLLABORATION___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.COLLABORATION___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.COLLABORATION___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.COLLABORATION___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.COLLABORATION___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.COLLABORATION___GET_PARTS :
				return getParts();
			case UMLPackage.COLLABORATION___ALL_ROLES :
				return allRoles();
			case UMLPackage.COLLABORATION___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.COLLABORATION___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.COLLABORATION__INTERFACE_REALIZATION);
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
		UMLPackage.COLLABORATION__OWNED_RULE,
		UMLPackage.COLLABORATION__OWNED_USE_CASE,
		UMLPackage.COLLABORATION__OWNED_ATTRIBUTE,
		UMLPackage.COLLABORATION__OWNED_CONNECTOR,
		UMLPackage.COLLABORATION__OWNED_BEHAVIOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehaviors() {
		if (ownedBehaviors == null) {
			ownedBehaviors = new SubsetSupersetEObjectContainmentEList.Resolving<Behavior>(
				Behavior.class, this, UMLPackage.COLLABORATION__OWNED_BEHAVIOR,
				null, OWNED_BEHAVIOR_ESUBSETS);
		}
		return ownedBehaviors;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_BEHAVIOR_ESUBSETS = new int[]{
		UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(String name, EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) create(eClass);
		getOwnedBehaviors().add(newOwnedBehavior);
		if (name != null)
			newOwnedBehavior.setName(name);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name) {
		return getOwnedBehavior(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedBehaviorLoop : for (Behavior ownedBehavior : getOwnedBehaviors()) {
			if (eClass != null && !eClass.isInstance(ownedBehavior))
				continue ownedBehaviorLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedBehavior.getName())
				: name.equals(ownedBehavior.getName())))
				continue ownedBehaviorLoop;
			return ownedBehavior;
		}
		return createOnDemand && eClass != null
			? createOwnedBehavior(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject) classifierBehavior;
			classifierBehavior = (Behavior) eResolveProxy(
				oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR,
						oldClassifierBehavior, classifierBehavior));
			}
		}
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR,
				oldClassifierBehavior, classifierBehavior));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newClassifierBehavior != null) {
				EList<Behavior> ownedBehaviors = getOwnedBehaviors();
				if (!ownedBehaviors.contains(newClassifierBehavior)) {
					ownedBehaviors.add(newClassifierBehavior);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		Behavior newClassifierBehavior = (Behavior) create(eClass);
		setClassifierBehavior(newClassifierBehavior);
		if (name != null)
			newClassifierBehavior.setName(name);
		return newClassifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealizations() {
		if (interfaceRealizations == null) {
			interfaceRealizations = new EObjectContainmentWithInverseEList.Resolving<InterfaceRealization>(
				InterfaceRealization.class, this,
				UMLPackage.COLLABORATION__INTERFACE_REALIZATION,
				UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		}
		return interfaceRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization(String name,
			Interface contract) {
		InterfaceRealization newInterfaceRealization = (InterfaceRealization) create(
			UMLPackage.Literals.INTERFACE_REALIZATION);
		getInterfaceRealizations().add(newInterfaceRealization);
		if (name != null)
			newInterfaceRealization.setName(name);
		if (contract != null)
			newInterfaceRealization.setContract(contract);
		return newInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name,
			Interface contract) {
		return getInterfaceRealization(name, contract, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name,
			Interface contract, boolean ignoreCase, boolean createOnDemand) {
		interfaceRealizationLoop : for (InterfaceRealization interfaceRealization : getInterfaceRealizations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(interfaceRealization.getName())
				: name.equals(interfaceRealization.getName())))
				continue interfaceRealizationLoop;
			if (contract != null
				&& !contract.equals(interfaceRealization.getContract()))
				continue interfaceRealizationLoop;
			return interfaceRealization;
		}
		return createOnDemand
			? createInterfaceRealization(name, contract)
			: null;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRoles() {
		return super.isSetRoles()
			|| eIsSet(UMLPackage.COLLABORATION__COLLABORATION_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.COLLABORATION__OWNED_BEHAVIOR);
	}

} //CollaborationImpl
