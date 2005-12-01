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
 * $Id: DeploymentImpl.java,v 1.6 2005/12/01 20:04:38 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getDeployedArtifacts <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getConfigurations <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl
		extends DependencyImpl
		implements Deployment {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.DEPLOYMENT__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.DEPLOYMENT__TARGET, new int[]{
						UMLPackage.DEPLOYMENT__SUPPLIER,
						UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.DEPLOYMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.DEPLOYMENT__OWNED_ELEMENT, new int[]{
						UMLPackage.DEPLOYMENT__OWNED_COMMENT,
						UMLPackage.DEPLOYMENT__NAME_EXPRESSION,
						UMLPackage.DEPLOYMENT__CONFIGURATION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.DEPLOYMENT__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.DEPLOYMENT__SOURCE, new int[]{
						UMLPackage.DEPLOYMENT__CLIENT,
						UMLPackage.DEPLOYMENT__LOCATION}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSuppliers() {
		List supplier = (List) eVirtualGet(UMLPackage.DEPLOYMENT__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT__SUPPLIER,
				supplier = new SupersetEObjectResolvingEList(
					NamedElement.class, this, UMLPackage.DEPLOYMENT__SUPPLIER,
					new int[]{UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT}));
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClients() {
		List client = (List) eVirtualGet(UMLPackage.DEPLOYMENT__CLIENT);
		if (client == null) {
			eVirtualSet(
				UMLPackage.DEPLOYMENT__CLIENT,
				client = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					NamedElement.class, this, UMLPackage.DEPLOYMENT__CLIENT,
					new int[]{UMLPackage.DEPLOYMENT__LOCATION},
					UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY));
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDeployedArtifacts() {
		List deployedArtifact = (List) eVirtualGet(UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT);
		if (deployedArtifact == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT,
				deployedArtifact = new SubsetEObjectResolvingEList(
					DeployedArtifact.class, this,
					UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT,
					new int[]{UMLPackage.DEPLOYMENT__SUPPLIER}));
		}
		return deployedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedArtifact getDeployedArtifact(String name) {
		for (Iterator i = getDeployedArtifacts().iterator(); i.hasNext();) {
			DeployedArtifact deployedArtifact = (DeployedArtifact) i.next();
			if (name.equals(deployedArtifact.getName())) {
				return deployedArtifact;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getConfigurations() {
		List configuration = (List) eVirtualGet(UMLPackage.DEPLOYMENT__CONFIGURATION);
		if (configuration == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT__CONFIGURATION,
				configuration = new EObjectContainmentWithInverseEList(
					DeploymentSpecification.class, this,
					UMLPackage.DEPLOYMENT__CONFIGURATION,
					UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT));
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createConfiguration() {
		DeploymentSpecification newConfiguration = UMLFactory.eINSTANCE
			.createDeploymentSpecification();
		getConfigurations().add(newConfiguration);
		return newConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification getConfiguration(String name) {
		for (Iterator i = getConfigurations().iterator(); i.hasNext();) {
			DeploymentSpecification configuration = (DeploymentSpecification) i
				.next();
			if (name.equals(configuration.getName())) {
				return configuration;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget getLocation() {
		if (eContainerFeatureID != UMLPackage.DEPLOYMENT__LOCATION)
			return null;
		return (DeploymentTarget) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget basicGetLocation() {
		if (eContainerFeatureID != UMLPackage.DEPLOYMENT__LOCATION)
			return null;
		return (DeploymentTarget) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(DeploymentTarget newLocation) {
		if (newLocation != null && !getClients().contains(newLocation)) {
			getClients().add(newLocation);
		}
		if (newLocation != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.DEPLOYMENT__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newLocation))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
					UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT,
					DeploymentTarget.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newLocation,
				UMLPackage.DEPLOYMENT__LOCATION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT__LOCATION, newLocation, newLocation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.DEPLOYMENT__CLIENT :
				return ((InternalEList) getClients()).basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return ((InternalEList) getConfigurations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT__LOCATION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.DEPLOYMENT__LOCATION, msgs);
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
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.DEPLOYMENT__CLIENT :
				return ((InternalEList) getClients()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return ((InternalEList) getConfigurations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__LOCATION :
				return eBasicSetContainer(null,
					UMLPackage.DEPLOYMENT__LOCATION, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.DEPLOYMENT__LOCATION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT,
					DeploymentTarget.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPLOYMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DEPLOYMENT__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.DEPLOYMENT__SOURCE :
				return getSources();
			case UMLPackage.DEPLOYMENT__TARGET :
				return getTargets();
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				return getSuppliers();
			case UMLPackage.DEPLOYMENT__CLIENT :
				return getClients();
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				return getDeployedArtifacts();
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return getConfigurations();
			case UMLPackage.DEPLOYMENT__LOCATION :
				if (resolve)
					return getLocation();
				return basicGetLocation();
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
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				getSuppliers().clear();
				getSuppliers().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__CLIENT :
				getClients().clear();
				getClients().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				getDeployedArtifacts().clear();
				getDeployedArtifacts().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				getConfigurations().clear();
				getConfigurations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT__LOCATION :
				setLocation((DeploymentTarget) newValue);
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
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPLOYMENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.DEPLOYMENT__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				getDeployedArtifacts().clear();
				return;
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				getConfigurations().clear();
				return;
			case UMLPackage.DEPLOYMENT__LOCATION :
				setLocation((DeploymentTarget) null);
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
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPLOYMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DEPLOYMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DEPLOYMENT__NAME :
				String name = (String) eVirtualGet(UMLPackage.DEPLOYMENT__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPLOYMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DEPLOYMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DEPLOYMENT__NAME_EXPRESSION) != null;
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DEPLOYMENT__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.DEPLOYMENT__SOURCE :
				return isSetSources();
			case UMLPackage.DEPLOYMENT__TARGET :
				return isSetTargets();
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				List supplier = (List) eVirtualGet(UMLPackage.DEPLOYMENT__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UMLPackage.DEPLOYMENT__CLIENT :
				List client = (List) eVirtualGet(UMLPackage.DEPLOYMENT__CLIENT);
				return client != null && !client.isEmpty();
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				List deployedArtifact = (List) eVirtualGet(UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT);
				return deployedArtifact != null && !deployedArtifact.isEmpty();
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				List configuration = (List) eVirtualGet(UMLPackage.DEPLOYMENT__CONFIGURATION);
				return configuration != null && !configuration.isEmpty();
			case UMLPackage.DEPLOYMENT__LOCATION :
				return basicGetLocation() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.DEPLOYMENT__CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources() || eIsSet(UMLPackage.DEPLOYMENT__LOCATION);
	}

} //DeploymentImpl
