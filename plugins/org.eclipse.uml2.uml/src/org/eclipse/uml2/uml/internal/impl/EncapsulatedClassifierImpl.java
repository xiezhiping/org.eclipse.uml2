/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

//import org.eclipse.uml2.uml.internal.operations.EncapsulatedClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EncapsulatedClassifierImpl
		extends StructuredClassifierImpl
		implements EncapsulatedClassifier {

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedPorts() <em>Owned Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_PORT_ESUPERSETS = new int[]{
		UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOwnedPort(String name, Type type) {
		return getOwnedPort(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port getOwnedPort(String name, Type type, boolean ignoreCase) {
		return getOwnedPort(name, type, ignoreCase, false);
	}

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENCAPSULATED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving<Property>(
				Property.class, this,
				UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Port> getOwnedPorts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Port> ownedPorts = (EList<Port>) cache.get(eResource, this,
				UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			if (ownedPorts == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
					ownedPorts = new DerivedSubsetEObjectEList<Port>(Port.class,
						this, UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
						OWNED_PORT_ESUPERSETS));
			}
			return ownedPorts;
		}
		return new DerivedSubsetEObjectEList<Port>(Port.class, this,
			UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
			OWNED_PORT_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port createOwnedPort(String name, Type type) {
		Port newOwnedPort = (Port) create(UMLPackage.Literals.PORT);
		getOwnedPorts().add(newOwnedPort);
		if (name != null)
			newOwnedPort.setName(name);
		if (type != null)
			newOwnedPort.setType(type);
		return newOwnedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port getOwnedPort(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		ownedPortLoop : for (Port ownedPort : getOwnedPorts()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedPort.getName())
				: name.equals(ownedPort.getName())))
				continue ownedPortLoop;
			if (type != null && !type.equals(ownedPort.getType()))
				continue ownedPortLoop;
			return ownedPort;
		}
		return createOnDemand
			? createOwnedPort(name, type)
			: null;
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				return getName();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				return isLeaf();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				return getUseCases();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PART :
				return getParts();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ROLE :
				return getRoles();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				unsetName();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
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
			case UMLPackage.ENCAPSULATED_CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME :
				return isSetName();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ENCAPSULATED_CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__REPRESENTATION :
				return representation != null;
			case UMLPackage.ENCAPSULATED_CLASSIFIER__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__PART :
				return !getParts().isEmpty();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__ROLE :
				return isSetRoles();
			case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //EncapsulatedClassifierImpl
