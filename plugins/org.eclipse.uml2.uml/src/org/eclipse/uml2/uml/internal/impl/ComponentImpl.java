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
 * $Id: ComponentImpl.java,v 1.6 2005/11/28 20:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ComponentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#isIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getRequireds <em>Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getProvideds <em>Provided</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ComponentImpl#getRealizations <em>Realization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl
		extends ClassImpl
		implements Component {

	/**
	 * The default value of the '{@link #isIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIRECTLY_INSTANTIATED_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_INDIRECTLY_INSTANTIATED_EFLAG = 1 << 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
		eFlags |= IS_INDIRECTLY_INSTANTIATED_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.COMPONENT__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.COMPONENT__OWNED_MEMBER, new int[]{
						UMLPackage.COMPONENT__OWNED_RULE,
						UMLPackage.COMPONENT__OWNED_USE_CASE,
						UMLPackage.COMPONENT__OWNED_ATTRIBUTE,
						UMLPackage.COMPONENT__OWNED_CONNECTOR,
						UMLPackage.COMPONENT__OWNED_BEHAVIOR,
						UMLPackage.COMPONENT__OWNED_TRIGGER,
						UMLPackage.COMPONENT__OWNED_OPERATION,
						UMLPackage.COMPONENT__NESTED_CLASSIFIER,
						UMLPackage.COMPONENT__OWNED_RECEPTION,
						UMLPackage.COMPONENT__PACKAGED_ELEMENT}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.COMPONENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.COMPONENT__OWNED_ELEMENT, new int[]{
						UMLPackage.COMPONENT__OWNED_COMMENT,
						UMLPackage.COMPONENT__NAME_EXPRESSION,
						UMLPackage.COMPONENT__ELEMENT_IMPORT,
						UMLPackage.COMPONENT__PACKAGE_IMPORT,
						UMLPackage.COMPONENT__OWNED_MEMBER,
						UMLPackage.COMPONENT__TEMPLATE_BINDING,
						UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.COMPONENT__GENERALIZATION,
						UMLPackage.COMPONENT__SUBSTITUTION,
						UMLPackage.COMPONENT__COLLABORATION_USE,
						UMLPackage.COMPONENT__OWNED_SIGNATURE,
						UMLPackage.COMPONENT__INTERFACE_REALIZATION,
						UMLPackage.COMPONENT__REALIZATION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndirectlyInstantiated() {
		return (eFlags & IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(boolean newIsIndirectlyInstantiated) {
		boolean oldIsIndirectlyInstantiated = (eFlags & IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0;
		if (newIsIndirectlyInstantiated)
			eFlags |= IS_INDIRECTLY_INSTANTIATED_EFLAG;
		else
			eFlags &= ~IS_INDIRECTLY_INSTANTIATED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED,
				oldIsIndirectlyInstantiated, newIsIndirectlyInstantiated));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRequireds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this,
				UMLPackage.Literals.COMPONENT__REQUIRED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.COMPONENT__REQUIRED,
					result = ComponentOperations.getRequireds(this));
			}
			return result;
		}
		return ComponentOperations.getRequireds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRequired(String name) {
		for (Iterator i = getRequireds().iterator(); i.hasNext();) {
			Interface required = (Interface) i.next();
			if (name.equals(required.getName())) {
				return required;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getProvideds() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this,
				UMLPackage.Literals.COMPONENT__PROVIDED);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.COMPONENT__PROVIDED,
					result = ComponentOperations.getProvideds(this));
			}
			return result;
		}
		return ComponentOperations.getProvideds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvided(String name) {
		for (Iterator i = getProvideds().iterator(); i.hasNext();) {
			Interface provided = (Interface) i.next();
			if (name.equals(provided.getName())) {
				return provided;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackagedElements() {
		List packagedElement = (List) eVirtualGet(UMLPackage.COMPONENT__PACKAGED_ELEMENT);
		if (packagedElement == null) {
			eVirtualSet(UMLPackage.COMPONENT__PACKAGED_ELEMENT,
				packagedElement = new EObjectContainmentEList.Resolving(
					PackageableElement.class, this,
					UMLPackage.COMPONENT__PACKAGED_ELEMENT));
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackagedElement(EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getPackagedElements().add(newPackagedElement);
		return newPackagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name) {
		for (Iterator i = getPackagedElements().iterator(); i.hasNext();) {
			PackageableElement packagedElement = (PackageableElement) i.next();
			if (name.equals(packagedElement.getName())) {
				return packagedElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRealizations() {
		List realization = (List) eVirtualGet(UMLPackage.COMPONENT__REALIZATION);
		if (realization == null) {
			eVirtualSet(UMLPackage.COMPONENT__REALIZATION,
				realization = new EObjectContainmentWithInverseEList(
					ComponentRealization.class, this,
					UMLPackage.COMPONENT__REALIZATION,
					UMLPackage.COMPONENT_REALIZATION__ABSTRACTION));
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization createRealization() {
		ComponentRealization newRealization = UMLFactory.eINSTANCE
			.createComponentRealization();
		getRealizations().add(newRealization);
		return newRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization getRealization(String name) {
		for (Iterator i = getRealizations().iterator(); i.hasNext();) {
			ComponentRealization realization = (ComponentRealization) i.next();
			if (name.equals(realization.getName())) {
				return realization;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List realizedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(eResource(), this,
				UMLPackage.Literals.COMPONENT.getEOperations().get(0));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.COMPONENT
					.getEOperations().get(0), result = ComponentOperations
					.realizedInterfaces(this));
			}
			return result;
		}
		return ComponentOperations.realizedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List usedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(eResource(), this,
				UMLPackage.Literals.COMPONENT.getEOperations().get(1));
			if (result == null) {
				cache.put(eResource(), this, UMLPackage.Literals.COMPONENT
					.getEOperations().get(1), result = ComponentOperations
					.usedInterfaces(this));
			}
			return result;
		}
		return ComponentOperations.usedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.COMPONENT__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.COMPONENT__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.COMPONENT__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.COMPONENT__OWNED_SIGNATURE, null, msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__REALIZATION :
				return ((InternalEList) getRealizations()).basicAdd(otherEnd,
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.COMPONENT__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				return ((InternalEList) getPackagedElements()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.COMPONENT__REALIZATION :
				return ((InternalEList) getRealizations()).basicRemove(
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMPONENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMPONENT__OWNER :
				return getOwner();
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMPONENT__NAME :
				return getName();
			case UMLPackage.COMPONENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.COMPONENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COMPONENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.COMPONENT__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.COMPONENT__MEMBER :
				return getMembers();
			case UMLPackage.COMPONENT__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.COMPONENT__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.COMPONENT__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.COMPONENT__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.COMPONENT__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.COMPONENT__PACKAGE :
				return getPackage();
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.COMPONENT__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.COMPONENT__FEATURE :
				return getFeatures();
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.COMPONENT__GENERAL :
				return getGenerals();
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.COMPONENT__USE_CASE :
				return getUseCases();
			case UMLPackage.COMPONENT__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.COMPONENT__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.COMPONENT__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.COMPONENT__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.COMPONENT__PART :
				return getParts();
			case UMLPackage.COMPONENT__ROLE :
				return getRoles();
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.COMPONENT__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				return getClassifierBehavior();
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.COMPONENT__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.COMPONENT__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.COMPONENT__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.COMPONENT__EXTENSION :
				return getExtensions();
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				return isIndirectlyInstantiated()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.COMPONENT__REQUIRED :
				return getRequireds();
			case UMLPackage.COMPONENT__PROVIDED :
				return getProvideds();
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.COMPONENT__REALIZATION :
				return getRealizations();
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COMPONENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.COMPONENT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.COMPONENT__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				setIsIndirectlyInstantiated(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.COMPONENT__REALIZATION :
				getRealizations().clear();
				getRealizations().addAll((Collection) newValue);
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMPONENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.COMPONENT__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.COMPONENT__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.COMPONENT__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.COMPONENT__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.COMPONENT__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.COMPONENT__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.COMPONENT__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.COMPONENT__IS_ACTIVE :
				unsetIsActive();
				return;
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				setIsIndirectlyInstantiated(IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
				return;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.COMPONENT__REALIZATION :
				getRealizations().clear();
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
			case UMLPackage.COMPONENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMPONENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMPONENT__OWNER :
				return isSetOwner();
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.COMPONENT__NAME :
				String name = (String) eVirtualGet(UMLPackage.COMPONENT__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.COMPONENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COMPONENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COMPONENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.COMPONENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.COMPONENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.COMPONENT__NAME_EXPRESSION) != null;
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.COMPONENT__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.COMPONENT__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.COMPONENT__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.COMPONENT__MEMBER :
				return isSetMembers();
			case UMLPackage.COMPONENT__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.COMPONENT__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.COMPONENT__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.COMPONENT__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.COMPONENT__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.COMPONENT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.COMPONENT__PACKAGE :
				return getPackage() != null;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.COMPONENT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.COMPONENT__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.COMPONENT__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.COMPONENT__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.COMPONENT__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.COMPONENT__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.COMPONENT__FEATURE :
				return isSetFeatures();
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.COMPONENT__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.COMPONENT__GENERAL :
				return isSetGenerals();
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.COMPONENT__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.COMPONENT__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.COMPONENT__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.COMPONENT__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.COMPONENT__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.COMPONENT__REPRESENTATION :
				return eVirtualGet(UMLPackage.COMPONENT__REPRESENTATION) != null;
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.COMPONENT__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.COMPONENT__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.COMPONENT__OWNED_SIGNATURE) != null;
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.COMPONENT__PART :
				return !getParts().isEmpty();
			case UMLPackage.COMPONENT__ROLE :
				return isSetRoles();
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.COMPONENT__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.COMPONENT__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.COMPONENT__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.COMPONENT__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.COMPONENT__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.COMPONENT__IS_ACTIVE :
				return isSetIsActive();
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.COMPONENT__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.COMPONENT__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				return ((eFlags & IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0) != IS_INDIRECTLY_INSTANTIATED_EDEFAULT;
			case UMLPackage.COMPONENT__REQUIRED :
				return !getRequireds().isEmpty();
			case UMLPackage.COMPONENT__PROVIDED :
				return !getProvideds().isEmpty();
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				List packagedElement = (List) eVirtualGet(UMLPackage.COMPONENT__PACKAGED_ELEMENT);
				return packagedElement != null && !packagedElement.isEmpty();
			case UMLPackage.COMPONENT__REALIZATION :
				List realization = (List) eVirtualGet(UMLPackage.COMPONENT__REALIZATION);
				return realization != null && !realization.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isIndirectlyInstantiated: "); //$NON-NLS-1$
		result.append((eFlags & IS_INDIRECTLY_INSTANTIATED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.COMPONENT__PACKAGED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.COMPONENT__REALIZATION);
	}

} //ComponentImpl
