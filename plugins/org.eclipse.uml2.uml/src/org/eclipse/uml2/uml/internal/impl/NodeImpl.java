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
 * $Id: NodeImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

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
		return UMLPackage.eINSTANCE.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.NODE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.NODE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.NODE__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getNamespace_ElementImport(),
						UMLPackage.eINSTANCE.getNamespace_PackageImport(),
						UMLPackage.eINSTANCE.getNamespace_OwnedMember(),
						UMLPackage.eINSTANCE
							.getTemplateableElement_TemplateBinding(),
						UMLPackage.eINSTANCE
							.getTemplateableElement_OwnedTemplateSignature(),
						UMLPackage.eINSTANCE.getClassifier_Generalization(),
						UMLPackage.eINSTANCE.getClassifier_Substitution(),
						UMLPackage.eINSTANCE.getClassifier_CollaborationUse(),
						UMLPackage.eINSTANCE.getClassifier_OwnedSignature(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_InterfaceRealization(),
						UMLPackage.eINSTANCE.getDeploymentTarget_Deployment()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClientDependencies() {
		List clientDependency = (List) eVirtualGet(UMLPackage.NODE__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.NODE__CLIENT_DEPENDENCY,
				clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this, UMLPackage.NODE__CLIENT_DEPENDENCY,
					new int[]{UMLPackage.NODE__SUBSTITUTION,
						UMLPackage.NODE__INTERFACE_REALIZATION,
						UMLPackage.NODE__DEPLOYMENT},
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDeployments() {
		List deployment = (List) eVirtualGet(UMLPackage.NODE__DEPLOYMENT);
		if (deployment == null) {
			eVirtualSet(UMLPackage.NODE__DEPLOYMENT,
				deployment = new SubsetEObjectContainmentWithInverseEList(
					Deployment.class, this, UMLPackage.NODE__DEPLOYMENT,
					new int[]{UMLPackage.NODE__CLIENT_DEPENDENCY},
					UMLPackage.DEPLOYMENT__LOCATION));
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		Deployment newDeployment = UMLFactory.eINSTANCE.createDeployment();
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name) {
		for (Iterator i = getDeployments().iterator(); i.hasNext();) {
			Deployment deployment = (Deployment) i.next();
			if (name.equals(deployment.getName())) {
				return deployment;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDeployedElements() {
		// TODO: implement this method to return the 'Deployed Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name) {
		for (Iterator i = getDeployedElements().iterator(); i.hasNext();) {
			PackageableElement deployedElement = (PackageableElement) i.next();
			if (name.equals(deployedElement.getName())) {
				return deployedElement;
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
		List ownedMember = (List) eVirtualGet(UMLPackage.NODE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.NODE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.NODE__OWNED_MEMBER,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getNamespace_OwnedRule(),
						UMLPackage.eINSTANCE.getClassifier_OwnedUseCase(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedAttribute(),
						UMLPackage.eINSTANCE
							.getStructuredClassifier_OwnedConnector(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_OwnedBehavior(),
						UMLPackage.eINSTANCE
							.getBehavioredClassifier_OwnedTrigger(),
						UMLPackage.eINSTANCE.getClass_OwnedOperation(),
						UMLPackage.eINSTANCE.getClass_NestedClassifier(),
						UMLPackage.eINSTANCE.getClass_OwnedReception(),
						UMLPackage.eINSTANCE.getNode_NestedNode()}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNestedNodes() {
		List nestedNode = (List) eVirtualGet(UMLPackage.NODE__NESTED_NODE);
		if (nestedNode == null) {
			eVirtualSet(UMLPackage.NODE__NESTED_NODE,
				nestedNode = new EObjectContainmentEList(Node.class, this,
					UMLPackage.NODE__NESTED_NODE));
		}
		return nestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNestedNode(EClass eClass) {
		Node newNestedNode = (Node) eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		getNestedNodes().add(newNestedNode);
		return newNestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNestedNode() {
		Node newNestedNode = UMLFactory.eINSTANCE.createNode();
		getNestedNodes().add(newNestedNode);
		return newNestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNestedNode(String name) {
		for (Iterator i = getNestedNodes().iterator(); i.hasNext();) {
			Node nestedNode = (Node) i.next();
			if (name.equals(nestedNode.getName())) {
				return nestedNode;
			}
		}
		return null;
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
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.NODE__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.NODE__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.NODE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE,
								null, msgs);
					return basicSetOwnedTemplateSignature(
						(TemplateSignature) otherEnd, msgs);
				case UMLPackage.NODE__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__USE_CASE :
					return ((InternalEList) getUseCases()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.NODE__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__OWNED_SIGNATURE :
					RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.NODE__OWNED_SIGNATURE);
					if (ownedSignature != null)
						msgs = ((InternalEObject) ownedSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.NODE__OWNED_SIGNATURE, null, msgs);
					return basicSetOwnedSignature(
						(RedefinableTemplateSignature) otherEnd, msgs);
				case UMLPackage.NODE__INTERFACE_REALIZATION :
					return ((InternalEList) getInterfaceRealizations())
						.basicAdd(otherEnd, msgs);
				case UMLPackage.NODE__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NODE__DEPLOYMENT :
					return ((InternalEList) getDeployments()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.NODE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.NODE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER, msgs);
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
				case UMLPackage.NODE__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.NODE__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
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
				case UMLPackage.NODE__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__NESTED_CLASSIFIER :
					return ((InternalEList) getNestedClassifiers())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.NODE__OWNED_RECEPTION :
					return ((InternalEList) getOwnedReceptions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__DEPLOYMENT :
					return ((InternalEList) getDeployments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NODE__NESTED_NODE :
					return ((InternalEList) getNestedNodes()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
				return getNameExpression();
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
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.NODE__PACKAGE :
				return getPackage();
			case UMLPackage.NODE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
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
			case UMLPackage.NODE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.NODE__USE_CASE :
				return getUseCases();
			case UMLPackage.NODE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.NODE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.NODE__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.NODE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.NODE__OWNED_SIGNATURE :
				return getOwnedSignature();
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
				return getClassifierBehavior();
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.NODE__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.NODE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
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
			case UMLPackage.NODE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
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
			case UMLPackage.NODE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
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
			case UMLPackage.NODE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.NODE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.NODE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.NODE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.NODE__USE_CASE :
				getUseCases().clear();
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
			case UMLPackage.NODE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
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
			case UMLPackage.NODE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NODE__OWNER :
				return isSetOwner();
			case UMLPackage.NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.NODE__NAME :
				String name = eVirtualIsSet(UMLPackage.NODE__NAME)
					? (String) eVirtualGet(UMLPackage.NODE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.NODE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.NODE__VISIBILITY)
					&& eVirtualGet(UMLPackage.NODE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.NODE__NAME_EXPRESSION) != null;
			case UMLPackage.NODE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.NODE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.NODE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.NODE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.NODE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.NODE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
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
			case UMLPackage.NODE__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.NODE__TEMPLATE_PARAMETER) != null;
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.NODE__PACKAGE :
				return getPackage() != null;
			case UMLPackage.NODE__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.NODE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.NODE__IS_ABSTRACT :
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.NODE__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.NODE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.NODE__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.NODE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.NODE__FEATURE :
				return isSetFeatures();
			case UMLPackage.NODE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.NODE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.NODE__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.NODE__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.NODE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.NODE__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.NODE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.NODE__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.NODE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.NODE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.NODE__REPRESENTATION :
				return eVirtualGet(UMLPackage.NODE__REPRESENTATION) != null;
			case UMLPackage.NODE__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.NODE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.NODE__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.NODE__OWNED_SIGNATURE) != null;
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.NODE__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.NODE__PART :
				return !getParts().isEmpty();
			case UMLPackage.NODE__ROLE :
				return isSetRoles();
			case UMLPackage.NODE__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.NODE__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.NODE__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.NODE__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.NODE__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.NODE__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.NODE__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.NODE__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.NODE__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.NODE__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.NODE__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.NODE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.NODE__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.NODE__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.NODE__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.NODE__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.NODE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.NODE__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.NODE__DEPLOYMENT :
				List deployment = (List) eVirtualGet(UMLPackage.NODE__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UMLPackage.NODE__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.NODE__NESTED_NODE :
				List nestedNode = (List) eVirtualGet(UMLPackage.NODE__NESTED_NODE);
				return nestedNode != null && !nestedNode.isEmpty();
		}
		return eDynamicIsSet(eFeature);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getDeploymentTarget_Deployment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.eINSTANCE.getNode_NestedNode());
	}

} //NodeImpl
