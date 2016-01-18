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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
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

import org.eclipse.uml2.uml.internal.operations.StereotypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StereotypeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StereotypeImpl#getIcons <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StereotypeImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeImpl
		extends ClassImpl
		implements Stereotype {

	/**
	 * The cached value of the '{@link #getIcons() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcons()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> icons;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STEREOTYPE;
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
						UMLPackage.STEREOTYPE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.STEREOTYPE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
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
		UMLPackage.STEREOTYPE__OWNED_COMMENT,
		UMLPackage.STEREOTYPE__NAME_EXPRESSION,
		UMLPackage.STEREOTYPE__ELEMENT_IMPORT,
		UMLPackage.STEREOTYPE__PACKAGE_IMPORT,
		UMLPackage.STEREOTYPE__OWNED_MEMBER,
		UMLPackage.STEREOTYPE__TEMPLATE_BINDING,
		UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.STEREOTYPE__COLLABORATION_USE,
		UMLPackage.STEREOTYPE__GENERALIZATION,
		UMLPackage.STEREOTYPE__SUBSTITUTION,
		UMLPackage.STEREOTYPE__INTERFACE_REALIZATION,
		UMLPackage.STEREOTYPE__ICON};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getIcons() {
		if (icons == null) {
			icons = new EObjectContainmentEList.Resolving<Image>(Image.class,
				this, UMLPackage.STEREOTYPE__ICON);
		}
		return icons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createIcon() {
		Image newIcon = (Image) create(UMLPackage.Literals.IMAGE);
		getIcons().add(newIcon);
		return newIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameNotClash(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StereotypeOperations.validateNameNotClash(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndOwnership(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StereotypeOperations.validateAssociationEndOwnership(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePropertyUpperBound(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StereotypeOperations.validateBasePropertyUpperBound(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePropertyMultiplicitySingleExtension(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StereotypeOperations
			.validateBasePropertyMultiplicitySingleExtension(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePropertyMultiplicityMultipleExtension(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StereotypeOperations
			.validateBasePropertyMultiplicityMultipleExtension(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralize(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
		return StereotypeOperations.createExtension(this, metaclass,
			isRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile() {
		Profile profile = basicGetProfile();
		return profile != null && profile.eIsProxy()
			? (Profile) eResolveProxy((InternalEObject) profile)
			: profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetProfile() {
		return StereotypeOperations.getProfile(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociationsOnly(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StereotypeOperations.validateBinaryAssociationsOnly(this,
			diagnostics, context);
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
	public String getKeyword(boolean localize) {
		return StereotypeOperations.getKeyword(this, localize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile containingProfile() {
		return StereotypeOperations.containingProfile(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getExtendedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<org.eclipse.uml2.uml.Class> result = (EList<org.eclipse.uml2.uml.Class>) cache
				.get(this,
					UMLPackage.Literals.STEREOTYPE___GET_EXTENDED_METACLASSES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.STEREOTYPE___GET_EXTENDED_METACLASSES,
					result = StereotypeOperations.getExtendedMetaclasses(this));
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
	public EList<org.eclipse.uml2.uml.Class> getAllExtendedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<org.eclipse.uml2.uml.Class> result = (EList<org.eclipse.uml2.uml.Class>) cache
				.get(this,
					UMLPackage.Literals.STEREOTYPE___GET_ALL_EXTENDED_METACLASSES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.STEREOTYPE___GET_ALL_EXTENDED_METACLASSES,
					result = StereotypeOperations
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
	public EClass getDefinition() {
		return StereotypeOperations.getDefinition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createIcon(String location) {
		return StereotypeOperations.createIcon(this, location);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createIcon(String format, String content) {
		return StereotypeOperations.createIcon(this, format, content);
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.STEREOTYPE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STEREOTYPE__ICON :
				return ((InternalEList<?>) getIcons()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STEREOTYPE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STEREOTYPE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STEREOTYPE__NAME :
				return getName();
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STEREOTYPE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STEREOTYPE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STEREOTYPE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STEREOTYPE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STEREOTYPE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STEREOTYPE__MEMBER :
				return getMembers();
			case UMLPackage.STEREOTYPE__IS_LEAF :
				return isLeaf();
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
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.STEREOTYPE__FEATURE :
				return getFeatures();
			case UMLPackage.STEREOTYPE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.STEREOTYPE__GENERAL :
				return getGenerals();
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.STEREOTYPE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.STEREOTYPE__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.STEREOTYPE__USE_CASE :
				return getUseCases();
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.STEREOTYPE__PART :
				return getParts();
			case UMLPackage.STEREOTYPE__ROLE :
				return getRoles();
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.STEREOTYPE__EXTENSION :
				return getExtensions();
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				return isActive();
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.STEREOTYPE__ICON :
				return getIcons();
			case UMLPackage.STEREOTYPE__PROFILE :
				if (resolve)
					return getProfile();
				return basicGetProfile();
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STEREOTYPE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STEREOTYPE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
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
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.STEREOTYPE__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.STEREOTYPE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.STEREOTYPE__ICON :
				getIcons().clear();
				getIcons().addAll((Collection<? extends Image>) newValue);
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
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STEREOTYPE__NAME :
				unsetName();
				return;
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STEREOTYPE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.STEREOTYPE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.STEREOTYPE__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.STEREOTYPE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				getSuperClasses().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STEREOTYPE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STEREOTYPE__OWNER :
				return isSetOwner();
			case UMLPackage.STEREOTYPE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.STEREOTYPE__NAME :
				return isSetName();
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STEREOTYPE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STEREOTYPE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STEREOTYPE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STEREOTYPE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STEREOTYPE__MEMBER :
				return isSetMembers();
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
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.STEREOTYPE__FEATURE :
				return isSetFeatures();
			case UMLPackage.STEREOTYPE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.STEREOTYPE__GENERAL :
				return isSetGenerals();
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.STEREOTYPE__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.STEREOTYPE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.STEREOTYPE__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.STEREOTYPE__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.STEREOTYPE__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				return representation != null;
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.STEREOTYPE__PART :
				return !getParts().isEmpty();
			case UMLPackage.STEREOTYPE__ROLE :
				return isSetRoles();
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.STEREOTYPE__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.STEREOTYPE__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.STEREOTYPE__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.STEREOTYPE__ICON :
				return icons != null && !icons.isEmpty();
			case UMLPackage.STEREOTYPE__PROFILE :
				return basicGetProfile() != null;
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
			case UMLPackage.STEREOTYPE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___DESTROY :
				destroy();
				return null;
			case UMLPackage.STEREOTYPE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.STEREOTYPE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.STEREOTYPE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.STEREOTYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STEREOTYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_MODEL :
				return getModel();
			case UMLPackage.STEREOTYPE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.STEREOTYPE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.STEREOTYPE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.STEREOTYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.STEREOTYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.STEREOTYPE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.STEREOTYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STEREOTYPE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STEREOTYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.STEREOTYPE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STEREOTYPE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.STEREOTYPE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.STEREOTYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_LABEL :
				return getLabel();
			case UMLPackage.STEREOTYPE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.STEREOTYPE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.STEREOTYPE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.STEREOTYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.STEREOTYPE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STEREOTYPE___SEPARATOR :
				return separator();
			case UMLPackage.STEREOTYPE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.STEREOTYPE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.STEREOTYPE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.STEREOTYPE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.STEREOTYPE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.STEREOTYPE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.STEREOTYPE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.STEREOTYPE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.STEREOTYPE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.STEREOTYPE___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.STEREOTYPE___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.STEREOTYPE___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.STEREOTYPE___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.STEREOTYPE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.STEREOTYPE___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.STEREOTYPE___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.STEREOTYPE___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.STEREOTYPE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.STEREOTYPE___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.STEREOTYPE___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.STEREOTYPE___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.STEREOTYPE___ALL_PARENTS :
				return allParents();
			case UMLPackage.STEREOTYPE___GET_GENERALS :
				return getGenerals();
			case UMLPackage.STEREOTYPE___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.STEREOTYPE___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.STEREOTYPE___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.STEREOTYPE___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.STEREOTYPE___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.STEREOTYPE___PARENTS :
				return parents();
			case UMLPackage.STEREOTYPE___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.STEREOTYPE___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.STEREOTYPE___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.STEREOTYPE___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.STEREOTYPE___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.STEREOTYPE___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.STEREOTYPE___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.STEREOTYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.STEREOTYPE___GET_PARTS :
				return getParts();
			case UMLPackage.STEREOTYPE___ALL_ROLES :
				return allRoles();
			case UMLPackage.STEREOTYPE___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.STEREOTYPE___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.STEREOTYPE___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.STEREOTYPE___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.STEREOTYPE___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.STEREOTYPE___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.STEREOTYPE___GET_SUPER_CLASSES :
				return getSuperClasses();
			case UMLPackage.STEREOTYPE___VALIDATE_BINARY_ASSOCIATIONS_ONLY__DIAGNOSTICCHAIN_MAP :
				return validateBinaryAssociationsOnly(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_GENERALIZE__DIAGNOSTICCHAIN_MAP :
				return validateGeneralize((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_NAME_NOT_CLASH__DIAGNOSTICCHAIN_MAP :
				return validateNameNotClash((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_ASSOCIATION_END_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateAssociationEndOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_BASE_PROPERTY_UPPER_BOUND__DIAGNOSTICCHAIN_MAP :
				return validateBasePropertyUpperBound(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_BASE_PROPERTY_MULTIPLICITY_SINGLE_EXTENSION__DIAGNOSTICCHAIN_MAP :
				return validateBasePropertyMultiplicitySingleExtension(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___VALIDATE_BASE_PROPERTY_MULTIPLICITY_MULTIPLE_EXTENSION__DIAGNOSTICCHAIN_MAP :
				return validateBasePropertyMultiplicityMultipleExtension(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_EXTENSION__CLASS_BOOLEAN :
				return createExtension(
					(org.eclipse.uml2.uml.Class) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.STEREOTYPE___CREATE_ICON__STRING :
				return createIcon((String) arguments.get(0));
			case UMLPackage.STEREOTYPE___CREATE_ICON__STRING_STRING :
				return createIcon((String) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STEREOTYPE___GET_ALL_EXTENDED_METACLASSES :
				return getAllExtendedMetaclasses();
			case UMLPackage.STEREOTYPE___GET_DEFINITION :
				return getDefinition();
			case UMLPackage.STEREOTYPE___GET_EXTENDED_METACLASSES :
				return getExtendedMetaclasses();
			case UMLPackage.STEREOTYPE___GET_KEYWORD :
				return getKeyword();
			case UMLPackage.STEREOTYPE___GET_KEYWORD__BOOLEAN :
				return getKeyword((Boolean) arguments.get(0));
			case UMLPackage.STEREOTYPE___CONTAINING_PROFILE :
				return containingProfile();
			case UMLPackage.STEREOTYPE___GET_PROFILE :
				return getProfile();
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
			|| eIsSet(UMLPackage.STEREOTYPE__ICON);
	}

} //StereotypeImpl
