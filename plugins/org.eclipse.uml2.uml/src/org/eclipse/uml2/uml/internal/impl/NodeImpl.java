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
 * $Id: NodeImpl.java,v 1.25 2006/05/24 20:54:28 khussey Exp $
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DeploymentTargetOperations;
import org.eclipse.uml2.uml.internal.operations.NodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NodeImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NodeImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NodeImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NodeImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NodeImpl#getNestedNodes <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl
		extends ClassImpl
		implements Node {

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList deployments = null;

	/**
	 * The cached value of the '{@link #getNestedNodes() <em>Nested Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nestedNodes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.NODE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
				Dependency.class, this, UMLPackage.NODE__CLIENT_DEPENDENCY,
				null, CLIENT_DEPENDENCY_ESUBSETS, UMLPackage.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		if (deployments == null) {
			deployments = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
				Deployment.class, this, UMLPackage.NODE__DEPLOYMENT,
				DEPLOYMENT_ESUPERSETS, null, UMLPackage.DEPLOYMENT__LOCATION);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment(String name) {
		Deployment newDeployment = (Deployment) create(UMLPackage.Literals.DEPLOYMENT);
		getDeployments().add(newDeployment);
		if (name != null)
			newDeployment.setName(name);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name) {
		return getDeployment(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name, boolean ignoreCase,
			boolean createOnDemand) {
		deploymentLoop : for (Iterator i = getDeployments().iterator(); i
			.hasNext();) {
			Deployment deployment = (Deployment) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployment.getName())
				: name.equals(deployment.getName())))
				continue deploymentLoop;
			return deployment;
		}
		return createOnDemand
			? createDeployment(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
					result = DeploymentTargetOperations
						.getDeployedElements(this));
			}
			return result;
		}
		return DeploymentTargetOperations.getDeployedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name) {
		return getDeployedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name,
			boolean ignoreCase, EClass eClass) {
		deployedElementLoop : for (Iterator i = getDeployedElements()
			.iterator(); i.hasNext();) {
			PackageableElement deployedElement = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(deployedElement))
				continue deployedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployedElement.getName())
				: name.equals(deployedElement.getName())))
				continue deployedElementLoop;
			return deployedElement;
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
						UMLPackage.NODE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.NODE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedNodes() {
		if (nestedNodes == null) {
			nestedNodes = new EObjectContainmentEList.Resolving(Node.class,
				this, UMLPackage.NODE__NESTED_NODE);
		}
		return nestedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNestedNode(String name, EClass eClass) {
		Node newNestedNode = (Node) create(eClass);
		getNestedNodes().add(newNestedNode);
		if (name != null)
			newNestedNode.setName(name);
		return newNestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNestedNode(String name) {
		return createNestedNode(name, UMLPackage.Literals.NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNestedNode(String name) {
		return getNestedNode(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNestedNode(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		nestedNodeLoop : for (Iterator i = getNestedNodes().iterator(); i
			.hasNext();) {
			Node nestedNode = (Node) i.next();
			if (eClass != null && !eClass.isInstance(nestedNode))
				continue nestedNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(nestedNode.getName())
				: name.equals(nestedNode.getName())))
				continue nestedNodeLoop;
			return nestedNode;
		}
		return createOnDemand && eClass != null
			? createNestedNode(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalStructure(DiagnosticChain diagnostics,
			Map context) {
		return NodeOperations.validateInternalStructure(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.NODE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE, null,
							msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.NODE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NODE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.NODE__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.NODE__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicAdd(otherEnd,
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
			case UMLPackage.NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.NODE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.NODE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NODE__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.NODE__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.NODE__NESTED_NODE :
				return ((InternalEList) getNestedNodes()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.NODE__NAME :
				return getName();
			case UMLPackage.NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.NODE__MEMBER :
				return getMembers();
			case UMLPackage.NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.NODE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.NODE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.NODE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.NODE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.NODE__FEATURE :
				return getFeatures();
			case UMLPackage.NODE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.NODE__GENERAL :
				return getGenerals();
			case UMLPackage.NODE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.NODE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.NODE__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.NODE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.NODE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.NODE__USE_CASE :
				return getUseCases();
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.NODE__PART :
				return getParts();
			case UMLPackage.NODE__ROLE :
				return getRoles();
			case UMLPackage.NODE__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.NODE__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.NODE__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.NODE__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.NODE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.NODE__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.NODE__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.NODE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.NODE__EXTENSION :
				return getExtensions();
			case UMLPackage.NODE__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.NODE__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.NODE__NESTED_NODE :
				return getNestedNodes();
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
			case UMLPackage.NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.NODE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.NODE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.NODE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.NODE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.NODE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.NODE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__NESTED_NODE :
				getNestedNodes().clear();
				getNestedNodes().addAll((Collection) newValue);
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
			case UMLPackage.NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NODE__NAME :
				unsetName();
				return;
			case UMLPackage.NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.NODE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.NODE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.NODE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.NODE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.NODE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.NODE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.NODE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.NODE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.NODE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.NODE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.NODE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.NODE__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.NODE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.NODE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.NODE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.NODE__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.NODE__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.NODE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.NODE__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.NODE__NESTED_NODE :
				getNestedNodes().clear();
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
			case UMLPackage.NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NODE__OWNER :
				return isSetOwner();
			case UMLPackage.NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.NODE__NAME :
				return isSetName();
			case UMLPackage.NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.NODE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.NODE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.NODE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.NODE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.NODE__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.NODE__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.NODE__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.NODE__FEATURE :
				return isSetFeatures();
			case UMLPackage.NODE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.NODE__GENERAL :
				return isSetGenerals();
			case UMLPackage.NODE__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.NODE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.NODE__REPRESENTATION :
				return representation != null;
			case UMLPackage.NODE__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.NODE__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.NODE__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.NODE__PART :
				return !getParts().isEmpty();
			case UMLPackage.NODE__ROLE :
				return isSetRoles();
			case UMLPackage.NODE__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.NODE__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.NODE__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.NODE__OWNED_TRIGGER :
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.NODE__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.NODE__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.NODE__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.NODE__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.NODE__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.NODE__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.NODE__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.NODE__NESTED_NODE :
				return nestedNodes != null && !nestedNodes.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UMLPackage.NODE__DEPLOYMENT :
					return UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UMLPackage.NODE__DEPLOYED_ELEMENT :
					return UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
					return UMLPackage.NODE__DEPLOYMENT;
				case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT :
					return UMLPackage.NODE__DEPLOYED_ELEMENT;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		UMLPackage.NODE__OWNED_COMMENT, UMLPackage.NODE__NAME_EXPRESSION,
		UMLPackage.NODE__ELEMENT_IMPORT, UMLPackage.NODE__PACKAGE_IMPORT,
		UMLPackage.NODE__OWNED_MEMBER, UMLPackage.NODE__TEMPLATE_BINDING,
		UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.NODE__GENERALIZATION, UMLPackage.NODE__SUBSTITUTION,
		UMLPackage.NODE__COLLABORATION_USE,
		UMLPackage.NODE__INTERFACE_REALIZATION, UMLPackage.NODE__DEPLOYMENT};

	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[]{
		UMLPackage.NODE__SUBSTITUTION, UMLPackage.NODE__INTERFACE_REALIZATION,
		UMLPackage.NODE__DEPLOYMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DEPLOYMENT_ESUPERSETS = new int[]{UMLPackage.NODE__CLIENT_DEPENDENCY};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.NODE__DEPLOYMENT);
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
		UMLPackage.NODE__OWNED_RULE, UMLPackage.NODE__OWNED_USE_CASE,
		UMLPackage.NODE__OWNED_ATTRIBUTE, UMLPackage.NODE__OWNED_CONNECTOR,
		UMLPackage.NODE__OWNED_BEHAVIOR, UMLPackage.NODE__OWNED_TRIGGER,
		UMLPackage.NODE__NESTED_CLASSIFIER, UMLPackage.NODE__OWNED_OPERATION,
		UMLPackage.NODE__OWNED_RECEPTION, UMLPackage.NODE__NESTED_NODE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.NODE__NESTED_NODE);
	}

} //NodeImpl
