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
 * $Id: DeploymentImpl.java,v 1.21 2005/11/23 13:25:33 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentSpecification;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getDeployedArtifacts <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getConfigurations <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends DependencyImpl implements Deployment {
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
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDeployment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getTargets() {
		return super.getTargets();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSources() {
		return super.getSources();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.DEPLOYMENT__LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.DEPLOYMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.DEPLOYMENT__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.DEPLOYMENT__OWNED_ELEMENT, new int[] {UML2Package.DEPLOYMENT__OWNED_COMMENT, UML2Package.DEPLOYMENT__TEMPLATE_BINDING, UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE, UML2Package.DEPLOYMENT__NAME_EXPRESSION, UML2Package.DEPLOYMENT__CONFIGURATION}));
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
			|| eIsSet(UML2Package.DEPLOYMENT__CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployedArtifacts() {
		EList deployedArtifact = (EList)eVirtualGet(UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT);
		if (deployedArtifact == null) {
			eVirtualSet(UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT, deployedArtifact = new SubsetEObjectResolvingEList(DeployedArtifact.class, this, UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT, new int[] {UML2Package.DEPLOYMENT__SUPPLIER}));
		}
		return deployedArtifact;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public DeployedArtifact getDeployedArtifact(String name) {
		for (Iterator i = getDeployedArtifacts().iterator(); i.hasNext(); ) {
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
	public DeploymentTarget getLocation() {
		if (eContainerFeatureID != UML2Package.DEPLOYMENT__LOCATION) return null;
		return (DeploymentTarget)eContainer();
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
		if (newLocation != eInternalContainer() || (eContainerFeatureID != UML2Package.DEPLOYMENT__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, DeploymentTarget.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newLocation, UML2Package.DEPLOYMENT__LOCATION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DEPLOYMENT__LOCATION, newLocation, newLocation));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfigurations() {
		EList configuration = (EList)eVirtualGet(UML2Package.DEPLOYMENT__CONFIGURATION);
		if (configuration == null) {
			eVirtualSet(UML2Package.DEPLOYMENT__CONFIGURATION, configuration = new EObjectContainmentEList(DeploymentSpecification.class, this, UML2Package.DEPLOYMENT__CONFIGURATION));
		}
		return configuration;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public DeploymentSpecification getConfiguration(String name) {
		for (Iterator i = getConfigurations().iterator(); i.hasNext(); ) {
			DeploymentSpecification configuration = (DeploymentSpecification) i.next();
			if (name.equals(configuration.getName())) {
				return configuration;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createConfiguration() instead.
	 */
	public DeploymentSpecification createConfiguration(EClass eClass) {
		DeploymentSpecification newConfiguration = (DeploymentSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DEPLOYMENT__CONFIGURATION, null, newConfiguration));
		}
		getConfigurations().add(newConfiguration);
		return newConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DeploymentSpecification createConfiguration() {
		DeploymentSpecification newConfiguration = UML2Factory.eINSTANCE.createDeploymentSpecification();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DEPLOYMENT__CONFIGURATION, null, newConfiguration));
		}
		getConfigurations().add(newConfiguration);
		return newConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		EList supplier = (EList)eVirtualGet(UML2Package.DEPLOYMENT__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UML2Package.DEPLOYMENT__SUPPLIER, supplier = new SupersetEObjectResolvingEList(NamedElement.class, this, UML2Package.DEPLOYMENT__SUPPLIER, new int[] {UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT}));
		}
		return supplier;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClients() {
		EList client = (EList)eVirtualGet(UML2Package.DEPLOYMENT__CLIENT);
		if (client == null) {
			eVirtualSet(UML2Package.DEPLOYMENT__CLIENT, client = new SupersetEObjectWithInverseResolvingEList.ManyInverse(NamedElement.class, this, UML2Package.DEPLOYMENT__CLIENT, new int[] {UML2Package.DEPLOYMENT__LOCATION}, UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY));
		}
		return client;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.DEPLOYMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER:
					TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.DEPLOYMENT__OWNING_PARAMETER, msgs);
				case UML2Package.DEPLOYMENT__CLIENT:
					return ((InternalEList)getClients()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__LOCATION:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.DEPLOYMENT__LOCATION, msgs);
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
				case UML2Package.DEPLOYMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.DEPLOYMENT__OWNING_PARAMETER, msgs);
				case UML2Package.DEPLOYMENT__CLIENT:
					return ((InternalEList)getClients()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT__LOCATION:
					return eBasicSetContainer(null, UML2Package.DEPLOYMENT__LOCATION, msgs);
				case UML2Package.DEPLOYMENT__CONFIGURATION:
					return ((InternalEList)getConfigurations()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
					return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.DEPLOYMENT__LOCATION:
					return eInternalContainer().eInverseRemove(this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, DeploymentTarget.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.DEPLOYMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DEPLOYMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DEPLOYMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DEPLOYMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DEPLOYMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DEPLOYMENT__NAME:
				return getName();
			case UML2Package.DEPLOYMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DEPLOYMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DEPLOYMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DEPLOYMENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.DEPLOYMENT__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.DEPLOYMENT__SOURCE:
				return getSources();
			case UML2Package.DEPLOYMENT__TARGET:
				return getTargets();
			case UML2Package.DEPLOYMENT__CLIENT:
				return getClients();
			case UML2Package.DEPLOYMENT__SUPPLIER:
				return getSuppliers();
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return getDeployedArtifacts();
			case UML2Package.DEPLOYMENT__LOCATION:
				return getLocation();
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				return getConfigurations();
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
			case UML2Package.DEPLOYMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DEPLOYMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DEPLOYMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DEPLOYMENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPLOYMENT__CLIENT:
				getClients().clear();
				getClients().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				getDeployedArtifacts().clear();
				getDeployedArtifacts().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT__LOCATION:
				setLocation((DeploymentTarget)newValue);
				return;
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				getConfigurations().clear();
				getConfigurations().addAll((Collection)newValue);
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
			case UML2Package.DEPLOYMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DEPLOYMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DEPLOYMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DEPLOYMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DEPLOYMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.DEPLOYMENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT__CLIENT:
				getClients().clear();
				return;
			case UML2Package.DEPLOYMENT__SUPPLIER:
				getSuppliers().clear();
				return;
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				getDeployedArtifacts().clear();
				return;
			case UML2Package.DEPLOYMENT__LOCATION:
				setLocation((DeploymentTarget)null);
				return;
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				getConfigurations().clear();
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
			case UML2Package.DEPLOYMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DEPLOYMENT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DEPLOYMENT__OWNER:
				return isSetOwner();
			case UML2Package.DEPLOYMENT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.DEPLOYMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DEPLOYMENT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.DEPLOYMENT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.DEPLOYMENT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.DEPLOYMENT__NAME:
				String name = (String)eVirtualGet(UML2Package.DEPLOYMENT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DEPLOYMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DEPLOYMENT__VISIBILITY:
				return isSetVisibility();
			case UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.DEPLOYMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DEPLOYMENT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.DEPLOYMENT__NAME_EXPRESSION) != null;
			case UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.DEPLOYMENT__TEMPLATE_PARAMETER) != null;
			case UML2Package.DEPLOYMENT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DEPLOYMENT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.DEPLOYMENT__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.DEPLOYMENT__SOURCE:
				return isSetSources();
			case UML2Package.DEPLOYMENT__TARGET:
				return isSetTargets();
			case UML2Package.DEPLOYMENT__CLIENT:
				EList client = (EList)eVirtualGet(UML2Package.DEPLOYMENT__CLIENT);
				return client != null && !client.isEmpty();
			case UML2Package.DEPLOYMENT__SUPPLIER:
				EList supplier = (EList)eVirtualGet(UML2Package.DEPLOYMENT__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				EList deployedArtifact = (EList)eVirtualGet(UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT);
				return deployedArtifact != null && !deployedArtifact.isEmpty();
			case UML2Package.DEPLOYMENT__LOCATION:
				return getLocation() != null;
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				EList configuration = (EList)eVirtualGet(UML2Package.DEPLOYMENT__CONFIGURATION);
				return configuration != null && !configuration.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //DeploymentImpl
