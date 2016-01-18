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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getConfigurations <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getDeployedArtifacts <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl
		extends DependencyImpl
		implements Deployment {

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentSpecification> configurations;

	/**
	 * The cached value of the '{@link #getDeployedArtifacts() <em>Deployed Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedArtifact> deployedArtifacts;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPLOYMENT;
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
						UMLPackage.DEPLOYMENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DEPLOYMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getSuppliers() {
		if (suppliers == null) {
			suppliers = new SubsetSupersetEObjectResolvingEList<NamedElement>(
				NamedElement.class, this, UMLPackage.DEPLOYMENT__SUPPLIER, null,
				SUPPLIER_ESUBSETS);
		}
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getClients() {
		if (clients == null) {
			clients = new SubsetSupersetEObjectResolvingEList<NamedElement>(
				NamedElement.class, this, UMLPackage.DEPLOYMENT__CLIENT, null,
				CLIENT_ESUBSETS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedArtifact> getDeployedArtifacts() {
		if (deployedArtifacts == null) {
			deployedArtifacts = new SubsetSupersetEObjectResolvingEList<DeployedArtifact>(
				DeployedArtifact.class, this,
				UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT,
				DEPLOYED_ARTIFACT_ESUPERSETS, null);
		}
		return deployedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentSpecification> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentWithInverseEList.Resolving<DeploymentSpecification>(
				DeploymentSpecification.class, this,
				UMLPackage.DEPLOYMENT__CONFIGURATION,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createConfiguration(String name) {
		DeploymentSpecification newConfiguration = (DeploymentSpecification) create(
			UMLPackage.Literals.DEPLOYMENT_SPECIFICATION);
		getConfigurations().add(newConfiguration);
		if (name != null)
			newConfiguration.setName(name);
		return newConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification getConfiguration(String name) {
		return getConfiguration(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification getConfiguration(String name,
			boolean ignoreCase, boolean createOnDemand) {
		configurationLoop : for (DeploymentSpecification configuration : getConfigurations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(configuration.getName())
				: name.equals(configuration.getName())))
				continue configurationLoop;
			return configuration;
		}
		return createOnDemand
			? createConfiguration(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget getLocation() {
		if (eContainerFeatureID() != UMLPackage.DEPLOYMENT__LOCATION)
			return null;
		return (DeploymentTarget) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget basicGetLocation() {
		if (eContainerFeatureID() != UMLPackage.DEPLOYMENT__LOCATION)
			return null;
		return (DeploymentTarget) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(DeploymentTarget newLocation,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLocation,
			UMLPackage.DEPLOYMENT__LOCATION, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newLocation != null) {
				EList<NamedElement> clients = getClients();
				if (!clients.contains(newLocation)) {
					clients.add(newLocation);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(DeploymentTarget newLocation) {
		if (newLocation != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.DEPLOYMENT__LOCATION
				&& newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
					UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT,
					DeploymentTarget.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getConfigurations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__LOCATION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((DeploymentTarget) otherEnd, msgs);
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
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return ((InternalEList<?>) getConfigurations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT__LOCATION :
				return basicSetLocation(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DEPLOYMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DEPLOYMENT__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.DEPLOYMENT__SOURCE :
				return getSources();
			case UMLPackage.DEPLOYMENT__TARGET :
				return getTargets();
			case UMLPackage.DEPLOYMENT__CLIENT :
				return getClients();
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				return getSuppliers();
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return getConfigurations();
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				return getDeployedArtifacts();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DEPLOYMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT__CLIENT :
				getClients().clear();
				getClients()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				getSuppliers().clear();
				getSuppliers()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				getConfigurations().clear();
				getConfigurations().addAll(
					(Collection<? extends DeploymentSpecification>) newValue);
				return;
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				getDeployedArtifacts().clear();
				getDeployedArtifacts()
					.addAll((Collection<? extends DeployedArtifact>) newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPLOYMENT__NAME :
				unsetName();
				return;
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				getConfigurations().clear();
				return;
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				getDeployedArtifacts().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DEPLOYMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.DEPLOYMENT__NAME :
				return isSetName();
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DEPLOYMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DEPLOYMENT__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.DEPLOYMENT__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.DEPLOYMENT__SOURCE :
				return isSetSources();
			case UMLPackage.DEPLOYMENT__TARGET :
				return isSetTargets();
			case UMLPackage.DEPLOYMENT__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				return configurations != null && !configurations.isEmpty();
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				return deployedArtifacts != null
					&& !deployedArtifacts.isEmpty();
			case UMLPackage.DEPLOYMENT__LOCATION :
				return basicGetLocation() != null;
		}
		return eDynamicIsSet(featureID);
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
		UMLPackage.DEPLOYMENT__OWNED_COMMENT,
		UMLPackage.DEPLOYMENT__NAME_EXPRESSION,
		UMLPackage.DEPLOYMENT__CONFIGURATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		DeploymentTarget location = basicGetLocation();
		if (location != null) {
			return location;
		}
		return super.basicGetOwner();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUPPLIER_ESUBSETS = new int[]{
		UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT};

	/**
	 * The array of subset feature identifiers for the '{@link #getClients() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_ESUBSETS = new int[]{
		UMLPackage.DEPLOYMENT__LOCATION};

	/**
	 * The array of superset feature identifiers for the '{@link #getDeployedArtifacts() <em>Deployed Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DEPLOYED_ARTIFACT_ESUPERSETS = new int[]{
		UMLPackage.DEPLOYMENT__SUPPLIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedArtifact getDeployedArtifact(String name) {
		return getDeployedArtifact(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedArtifact getDeployedArtifact(String name, boolean ignoreCase,
			EClass eClass) {
		deployedArtifactLoop : for (DeployedArtifact deployedArtifact : getDeployedArtifacts()) {
			if (eClass != null && !eClass.isInstance(deployedArtifact))
				continue deployedArtifactLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployedArtifact.getName())
				: name.equals(deployedArtifact.getName())))
				continue deployedArtifactLoop;
			return deployedArtifact;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.DEPLOYMENT__CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.DEPLOYMENT__LOCATION);
	}

} //DeploymentImpl
