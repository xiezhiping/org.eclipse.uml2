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
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StructuredClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl#getParts <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuredClassifierImpl
		extends ClassifierImpl
		implements StructuredClassifier {

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
	 * The cached value of the '{@link #getOwnedConnectors() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnectors;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						UMLPackage.STRUCTURED_CLASSIFIER__ROLE, ROLE_ESUBSETS));
			}
			return roles;
		}
		return new DerivedUnionEObjectEList<ConnectableElement>(
			ConnectableElement.class, this,
			UMLPackage.STRUCTURED_CLASSIFIER__ROLE, ROLE_ESUBSETS);
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
						UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
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
						Property.class, this,
						UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE,
						ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList<Property>(Property.class, this,
			UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> members = (EList<NamedElement>) cache
				.get(eResource, this, UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__MEMBER,
					members = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.STRUCTURED_CLASSIFIER__MEMBER,
						MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.STRUCTURED_CLASSIFIER__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Feature> features = (EList<Feature>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__FEATURE,
					features = new DerivedUnionEObjectEList<Feature>(
						Feature.class, this,
						UMLPackage.STRUCTURED_CLASSIFIER__FEATURE,
						FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList<Feature>(Feature.class, this,
			UMLPackage.STRUCTURED_CLASSIFIER__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving<Property>(
				Property.class, this,
				UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type,
			EClass eClass) {
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

	protected static class PartEList
			extends DerivedEObjectEList<Property> {

		protected PartEList(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		@Override
		public List<Property> basicList() {
			return new PartEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				@Override
				public ListIterator<Property> listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		@Override
		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}

		@Override
		protected boolean isIncluded(Object object) {
			return super.isIncluded(object)
				&& ((Property) object).isComposite();
		}

	}

	/**
	 * The array of superset feature identifiers for the '{@link #getParts() <em>Part</em>}' reference list.
	 * @see #getParts()
	 */
	protected static final int[] PART_ESUPERSETS = new int[]{
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE};

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
					parts = new PartEList(Property.class, this,
						UMLPackage.STRUCTURED_CLASSIFIER__PART,
						PART_ESUPERSETS));
			}
			return parts;
		}
		return new PartEList(Property.class, this,
			UMLPackage.STRUCTURED_CLASSIFIER__PART, PART_ESUPERSETS);
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
		partLoop : for (Property part : getParts()) {
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
	public EList<Connector> getOwnedConnectors() {
		if (ownedConnectors == null) {
			ownedConnectors = new EObjectContainmentEList.Resolving<Connector>(
				Connector.class, this,
				UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		}
		return ownedConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createOwnedConnector(String name) {
		Connector newOwnedConnector = (Connector) create(
			UMLPackage.Literals.CONNECTOR);
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
		ownedConnectorLoop : for (Connector ownedConnector : getOwnedConnectors()) {
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
	public EList<ConnectableElement> allRoles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ConnectableElement> result = (EList<ConnectableElement>) cache
				.get(this,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER___ALL_ROLES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER___ALL_ROLES,
					result = StructuredClassifierOperations.allRoles(this));
			}
			return result;
		}
		return StructuredClassifierOperations.allRoles(this);
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				return getName();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURED_CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				return isLeaf();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.STRUCTURED_CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.STRUCTURED_CLASSIFIER__PART :
				return getParts();
			case UMLPackage.STRUCTURED_CLASSIFIER__ROLE :
				return getRoles();
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
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
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				unsetName();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURED_CLASSIFIER__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME :
				return isSetName();
			case UMLPackage.STRUCTURED_CLASSIFIER__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURED_CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURED_CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.STRUCTURED_CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.STRUCTURED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__REPRESENTATION :
				return representation != null;
			case UMLPackage.STRUCTURED_CLASSIFIER__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__PART :
				return !getParts().isEmpty();
			case UMLPackage.STRUCTURED_CLASSIFIER__ROLE :
				return isSetRoles();
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___DESTROY :
				destroy();
				return null;
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_MODEL :
				return getModel();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.STRUCTURED_CLASSIFIER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_LABEL :
				return getLabel();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURED_CLASSIFIER___SEPARATOR :
				return separator();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.STRUCTURED_CLASSIFIER___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.STRUCTURED_CLASSIFIER___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_PARENTS :
				return allParents();
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_GENERALS :
				return getGenerals();
			case UMLPackage.STRUCTURED_CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.STRUCTURED_CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___PARENTS :
				return parents();
			case UMLPackage.STRUCTURED_CLASSIFIER___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.STRUCTURED_CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.STRUCTURED_CLASSIFIER___GET_PARTS :
				return getParts();
			case UMLPackage.STRUCTURED_CLASSIFIER___ALL_ROLES :
				return allRoles();
		}
		return eDynamicInvoke(operationID, arguments);
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
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE)
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[]{
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE};

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
		roleLoop : for (ConnectableElement role : getRoles()) {
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
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_RULE,
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_USE_CASE,
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR};

	/**
	 * The array of subset feature identifiers for the '{@link #getRoles() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ROLE_ESUBSETS = new int[]{
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		UMLPackage.STRUCTURED_CLASSIFIER__ATTRIBUTE,
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR};

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.STRUCTURED_CLASSIFIER__OWNED_MEMBER,
		UMLPackage.STRUCTURED_CLASSIFIER__IMPORTED_MEMBER,
		UMLPackage.STRUCTURED_CLASSIFIER__FEATURE,
		UMLPackage.STRUCTURED_CLASSIFIER__INHERITED_MEMBER,
		UMLPackage.STRUCTURED_CLASSIFIER__ROLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
	}

} //StructuredClassifierImpl
