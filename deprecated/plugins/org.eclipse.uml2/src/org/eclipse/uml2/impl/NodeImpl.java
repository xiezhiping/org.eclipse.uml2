/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: NodeImpl.java,v 1.33 2005/11/22 14:57:02 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Node;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.internal.operation.DeploymentTargetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NodeImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NodeImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NodeImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NodeImpl#getNestedNodes <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ClassImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		EList deployment = (EList)eVirtualGet(UML2Package.NODE__DEPLOYMENT);
		if (deployment == null) {
			eVirtualSet(UML2Package.NODE__DEPLOYMENT, deployment = new SubsetEObjectContainmentWithInverseEList(Deployment.class, this, UML2Package.NODE__DEPLOYMENT, new int[] {UML2Package.NODE__CLIENT_DEPENDENCY}, UML2Package.DEPLOYMENT__LOCATION));
		}
		return deployment;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Deployment getDeployment(String name) {
		for (Iterator i = getDeployments().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 * @deprecated Use #createDeployment() instead.
	 */
	public Deployment createDeployment(EClass eClass) {
		Deployment newDeployment = (Deployment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NODE__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Deployment createDeployment() {
		Deployment newDeployment = UML2Factory.eINSTANCE.createDeployment();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NODE__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getDeploymentTarget_DeployedElement());

			if (result == null) {
				EList deployedElements = DeploymentTargetOperations
					.getDeployedElements(this);
				cache.put(this, UML2Package.eINSTANCE
					.getDeploymentTarget_DeployedElement(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE
							.getDeploymentTarget_DeployedElement(),
						deployedElements.size(), deployedElements.toArray()));
			}

			return result;
		}

		EList deployedElements = DeploymentTargetOperations
			.getDeployedElements(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getDeploymentTarget_DeployedElement(), deployedElements.size(),
			deployedElements.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public PackageableElement getDeployedElement(String name) {
		for (Iterator i = getDeployedElements().iterator(); i.hasNext(); ) {
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
	public EList getNestedNodes() {
		EList nestedNode = (EList)eVirtualGet(UML2Package.NODE__NESTED_NODE);
		if (nestedNode == null) {
			eVirtualSet(UML2Package.NODE__NESTED_NODE, nestedNode = new EObjectContainmentEList(Node.class, this, UML2Package.NODE__NESTED_NODE));
		}
		return nestedNode;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNestedNodes() {
		EList nestedNode = (EList)eVirtualGet(UML2Package.NODE__NESTED_NODE);
		return nestedNode != null && !nestedNode.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Node getNestedNode(String name) {
		for (Iterator i = getNestedNodes().iterator(); i.hasNext(); ) {
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
	 * @generated NOT
	 */
	public Node createNestedNode(EClass eClass) {
		Node newNestedNode = (Node) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NODE__NESTED_NODE, null, newNestedNode));
		}
		getNestedNodes().add(newNestedNode);
		return newNestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Node createNestedNode() {
		Node newNestedNode = UML2Factory.eINSTANCE.createNode();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NODE__NESTED_NODE, null, newNestedNode));
		}
		getNestedNodes().add(newNestedNode);
		return newNestedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		EList clientDependency = (EList)eVirtualGet(UML2Package.NODE__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(UML2Package.NODE__CLIENT_DEPENDENCY, clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.NODE__CLIENT_DEPENDENCY, new int[] {UML2Package.NODE__SUBSTITUTION, UML2Package.NODE__IMPLEMENTATION, UML2Package.NODE__DEPLOYMENT}, UML2Package.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedClassifiers() {
		return getNestedNodes();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNestedClassifiers() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__TEMPLATE_PARAMETER:
					TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.NODE__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.NODE__OWNING_PARAMETER:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.NODE__OWNING_PARAMETER, msgs);
				case UML2Package.NODE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.NODE__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.NODE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.NODE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.NODE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.NODE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.NODE__OWNING_PARAMETER, msgs);
				case UML2Package.NODE__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
				case UML2Package.NODE__NESTED_NODE:
					return ((InternalEList)getNestedNodes()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
			case UML2Package.NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.NODE__NAME:
				return getName();
			case UML2Package.NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.NODE__MEMBER:
				return getMembers();
			case UML2Package.NODE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.NODE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.NODE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.NODE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.NODE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.NODE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.NODE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.NODE__PACKAGE:
				return getPackage();
			case UML2Package.NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.NODE__FEATURE:
				return getFeatures();
			case UML2Package.NODE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.NODE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.NODE__GENERAL:
				return getGenerals();
			case UML2Package.NODE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.NODE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.NODE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.NODE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.NODE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.NODE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.NODE__USE_CASE:
				return getUseCases();
			case UML2Package.NODE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.NODE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.NODE__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.NODE__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.NODE__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.NODE__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.NODE__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.NODE__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.NODE__PART:
				return getParts();
			case UML2Package.NODE__ROLE:
				return getRoles();
			case UML2Package.NODE__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.NODE__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.NODE__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.NODE__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.NODE__EXTENSION:
				return getExtensions();
			case UML2Package.NODE__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.NODE__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.NODE__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.NODE__DEPLOYMENT:
				return getDeployments();
			case UML2Package.NODE__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case UML2Package.NODE__NESTED_NODE:
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
			case UML2Package.NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.NODE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.NODE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.NODE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.NODE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.NODE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.NODE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.NODE__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.NODE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
				return;
			case UML2Package.NODE__NESTED_NODE:
				getNestedNodes().clear();
				getNestedNodes().addAll((Collection)newValue);
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
			case UML2Package.NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.NODE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.NODE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.NODE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.NODE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.NODE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.NODE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.NODE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.NODE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.NODE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.NODE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.NODE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.NODE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.NODE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.NODE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.NODE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.NODE__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.NODE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.NODE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.NODE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.NODE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.NODE__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.NODE__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.NODE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.NODE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.NODE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.NODE__DEPLOYMENT:
				getDeployments().clear();
				return;
			case UML2Package.NODE__NESTED_NODE:
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
			case UML2Package.NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.NODE__OWNER:
				return isSetOwner();
			case UML2Package.NODE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.NODE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.NODE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.NODE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.NODE__NAME:
				String name = (String)eVirtualGet(UML2Package.NODE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.NODE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.NODE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.NODE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.NODE__NAME_EXPRESSION) != null;
			case UML2Package.NODE__MEMBER:
				return isSetMembers();
			case UML2Package.NODE__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.NODE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.NODE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.NODE__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.NODE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.NODE__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.NODE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.NODE__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.NODE__TEMPLATE_PARAMETER) != null;
			case UML2Package.NODE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.NODE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.NODE__PACKAGE:
				return getPackage() != null;
			case UML2Package.NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.NODE__FEATURE:
				return isSetFeatures();
			case UML2Package.NODE__IS_ABSTRACT:
				return isSetIsAbstract();
			case UML2Package.NODE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.NODE__GENERAL:
				return isSetGenerals();
			case UML2Package.NODE__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.NODE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.NODE__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.NODE__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.NODE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.NODE__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.NODE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.NODE__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.NODE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.NODE__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.NODE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.NODE__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.NODE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.NODE__REPRESENTATION:
				return eVirtualGet(UML2Package.NODE__REPRESENTATION) != null;
			case UML2Package.NODE__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.NODE__OCCURRENCE);
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.NODE__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.NODE__CLASSIFIER_BEHAVIOR:
				return eVirtualGet(UML2Package.NODE__CLASSIFIER_BEHAVIOR) != null;
			case UML2Package.NODE__IMPLEMENTATION:
				EList implementation = (EList)eVirtualGet(UML2Package.NODE__IMPLEMENTATION);
				return implementation != null && !implementation.isEmpty();
			case UML2Package.NODE__OWNED_TRIGGER:
				EList ownedTrigger = (EList)eVirtualGet(UML2Package.NODE__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.NODE__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.NODE__OWNED_ATTRIBUTE:
				return isSetOwnedAttributes();
			case UML2Package.NODE__PART:
				return !getParts().isEmpty();
			case UML2Package.NODE__ROLE:
				return isSetRoles();
			case UML2Package.NODE__OWNED_CONNECTOR:
				EList ownedConnector = (EList)eVirtualGet(UML2Package.NODE__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.NODE__OWNED_PORT:
				EList ownedPort = (EList)eVirtualGet(UML2Package.NODE__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.NODE__OWNED_OPERATION:
				EList ownedOperation = (EList)eVirtualGet(UML2Package.NODE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.NODE__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.NODE__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.NODE__NESTED_CLASSIFIER:
				return isSetNestedClassifiers();
			case UML2Package.NODE__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.NODE__OWNED_RECEPTION:
				EList ownedReception = (EList)eVirtualGet(UML2Package.NODE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.NODE__DEPLOYMENT:
				EList deployment = (EList)eVirtualGet(UML2Package.NODE__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UML2Package.NODE__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case UML2Package.NODE__NESTED_NODE:
				return isSetNestedNodes();
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
				case UML2Package.NODE__DEPLOYMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UML2Package.NODE__DEPLOYED_ELEMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
				default: return -1;
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
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT: return UML2Package.NODE__DEPLOYMENT;
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UML2Package.NODE__DEPLOYED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		EList deployment = getDeployments();
		if (!deployment.isEmpty()) {
			ownedElement.addAll(deployment);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getDeploymentTarget_Deployment());
	}


	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		if (eIsSet(UML2Package.eINSTANCE.getNode_NestedNode())) {
			ownedMember.addAll(getNestedNodes());
		}
		return ownedMember;
	}


} //NodeImpl
